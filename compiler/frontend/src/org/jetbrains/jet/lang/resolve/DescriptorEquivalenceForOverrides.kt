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

package org.jetbrains.jet.lang.resolve

import org.jetbrains.jet.lang.descriptors.DeclarationDescriptor
import org.jetbrains.jet.lang.descriptors.ClassDescriptor
import org.jetbrains.jet.lang.descriptors.CallableMemberDescriptor
import org.jetbrains.jet.lang.descriptors.Visibilities
import org.jetbrains.jet.lang.descriptors.PackageFragmentDescriptor
import org.jetbrains.jet.lang.descriptors.TypeParameterDescriptor
import org.jetbrains.jet.utils.emptyOrSingletonList

object DescriptorEquivalenceForOverrides {

    public fun areEquivalent(a: DeclarationDescriptor?, b: DeclarationDescriptor?): Boolean {
        // Unnecessary casts due to KT-5116 DataFlowInfo lost for when with no argument
        return when {
            a is ClassDescriptor,
            b is ClassDescriptor -> areClassesEquivalent(a as ClassDescriptor, b as ClassDescriptor)

            a is TypeParameterDescriptor,
            b is TypeParameterDescriptor -> areTypeParametersEquivalent(a as TypeParameterDescriptor, b as TypeParameterDescriptor)

            a is CallableMemberDescriptor,
            b is CallableMemberDescriptor -> areCallableMemberDescriptorsEquivalent(a as CallableMemberDescriptor, b as CallableMemberDescriptor)

            a is PackageFragmentDescriptor,
            b is PackageFragmentDescriptor -> (a as PackageFragmentDescriptor).fqName == (b as PackageFragmentDescriptor).fqName

            else -> a == b
        }
    }

    private fun areClassesEquivalent(a: ClassDescriptor, b: ClassDescriptor): Boolean {
        // type constructors are compared by fqName
        return a.getTypeConstructor() == b.getTypeConstructor()
    }

    private fun areTypeParametersEquivalent(
            a: TypeParameterDescriptor,
            b: TypeParameterDescriptor,
            equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean = {x, y -> false}
    ): Boolean {
        if (a == b) return true
        if (a.getContainingDeclaration() == b.getContainingDeclaration()) return false

        if (!ownersEquivalent(a, b, equivalentCallables)) return false

        return a.getIndex() == b.getIndex() // We ignore type parameter names
    }

    private fun areCallableMemberDescriptorsEquivalent(a: CallableMemberDescriptor, b: CallableMemberDescriptor): Boolean {
        if (a == b) return true
        if (a.getName() != b.getName()) return false
        if (a.getContainingDeclaration() == b.getContainingDeclaration()) return false

        // Distinct locals are not equivalent
        if (a.getVisibility() == Visibilities.LOCAL || b.getVisibility() == Visibilities.LOCAL) return false

        if (!ownersEquivalent(a, b, {x, y -> false})) return false

        // compare parameter types
        fun CallableMemberDescriptor.parameterTypes() = emptyOrSingletonList(this.getReceiverParameter()?.getType()) +
                                                        this.getValueParameters().map { it.getType() }

        val aTypes = a.parameterTypes()
        val bTypes = b.parameterTypes()

        if (aTypes.size != bTypes.size) return false

        // This is a heuristic check. We do not take generic arguments into account and whenever we encounter a generic parameter T
        // as a top-level type, we call areTypeParametersEquivalent
        return aTypes.stream().zip(bTypes.stream()).all {
            (p): Boolean -> val (t1, t2) = p

            val c1 = t1.getConstructor()
            val c2 = t2.getConstructor()

            if (c1 == c2) return@all true

            val d1 = c1.getDeclarationDescriptor()
            val d2 = c2.getDeclarationDescriptor()

            if (d1 !is TypeParameterDescriptor || d2 !is TypeParameterDescriptor) return@all false

            areTypeParametersEquivalent(d1, d2, {x, y -> x == a && y == b})
        }
    }

    private fun ownersEquivalent(
            a: DeclarationDescriptor,
            b: DeclarationDescriptor,
            equivalentCallables: (DeclarationDescriptor?, DeclarationDescriptor?) -> Boolean
    ): Boolean {
        val aOwner = a.getContainingDeclaration()
        val bOwner = b.getContainingDeclaration()

        // This check is needed when we call areTypeParametersEquivalent() from areCallableMemberDescriptorsEquivalent:
        // if the type parameter owners are, e.g.,  functions, we'll go into infinite recursion here
        if (aOwner is CallableMemberDescriptor || bOwner is CallableMemberDescriptor) {
            return equivalentCallables(aOwner, bOwner)
        }
        else {
            return areEquivalent(aOwner, bOwner)
        }
    }

}