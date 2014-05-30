/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.debugger.evaluate

import com.intellij.debugger.engine.evaluation.CodeFragmentFactory
import com.intellij.debugger.engine.evaluation.TextWithImports
import com.intellij.psi.PsiElement
import com.intellij.openapi.project.Project
import com.intellij.psi.JavaCodeFragment
import org.jetbrains.jet.plugin.JetFileType
import org.jetbrains.jet.lang.psi.JetExpressionCodeFragment
import com.intellij.psi.PsiCodeBlock
import com.intellij.debugger.engine.evaluation.CodeFragmentKind
import org.jetbrains.jet.plugin.debugger.KotlinEditorTextProvider
import com.intellij.psi.util.PsiTreeUtil
import org.jetbrains.jet.lang.psi.JetExpression
import org.jetbrains.jet.lang.psi.JetBlockCodeFragment
import com.intellij.psi.util.CachedValue
import com.intellij.psi.util.CachedValuesManager
import com.intellij.psi.util.PsiModificationTracker
import com.intellij.psi.util.CachedValueProvider.Result
import com.intellij.psi.PsiFile
import org.jetbrains.jet.lang.psi.JetCodeFragment
import java.util.WeakHashMap

class KotlinCodeFragmentFactory : CodeFragmentFactory() {

    private var cachedFragments = WeakHashMap<JetCodeFragment, CachedValue<CompiledDataDescriptor>>()

    fun getCachedFragment(codeFragment: JetCodeFragment): CompiledDataDescriptor? {
        return cachedFragments[codeFragment]?.getValue()
    }

    fun cacheFragment(codeFragment: JetCodeFragment, compiledData: CompiledDataDescriptor) {
        val project = codeFragment.getProject()
        val newValue = CachedValuesManager.getManager(project).createCachedValue<CompiledDataDescriptor>(
                        { Result(compiledData, PsiModificationTracker.MODIFICATION_COUNT) },
                        false
        )

        cachedFragments.put(codeFragment, newValue)
    }

    override fun createCodeFragment(item: TextWithImports, context: PsiElement?, project: Project): JavaCodeFragment {
        val codeFragment = if (item.getKind() == CodeFragmentKind.EXPRESSION) {
            JetExpressionCodeFragment(project, "fragment.kt", item.getText(), getContextElement(context))
        }
        else {
            JetBlockCodeFragment(project, "fragment.kt", item.getText(), getContextElement(context))
        }
        codeFragment.addImportsFromString(item.getImports())
        return codeFragment
    }

    override fun createPresentationCodeFragment(item: TextWithImports, context: PsiElement?, project: Project): JavaCodeFragment {
        return createCodeFragment(item, context, project)
    }

    override fun isContextAccepted(contextElement: PsiElement?): Boolean {
        if (contextElement is PsiCodeBlock) {
            return contextElement.getContext()?.getContext()?.getLanguage() == JetFileType.INSTANCE.getLanguage()
        }
        return contextElement?.getLanguage() == JetFileType.INSTANCE.getLanguage()
    }

    override fun getFileType() = JetFileType.INSTANCE

    override fun getEvaluatorBuilder() = KotlinEvaluationBuilder

    class object {
        fun getContextElement(elementAt: PsiElement?): PsiElement? {
            if (elementAt == null) return null

            val expressionAtOffset = PsiTreeUtil.findElementOfClassAtOffset(elementAt.getContainingFile()!!, elementAt.getTextOffset(), javaClass<JetExpression>(), false)
            if (expressionAtOffset != null) {
                return expressionAtOffset
            }
            return KotlinEditorTextProvider.findExpressionInner(elementAt)
        }
    }
}

data class CompiledDataDescriptor(val bytecodes: ByteArray, val funcName: String, val parameterNames: List<String>)