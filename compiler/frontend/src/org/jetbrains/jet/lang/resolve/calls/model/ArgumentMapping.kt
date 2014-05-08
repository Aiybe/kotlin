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

package org.jetbrains.jet.lang.resolve.calls.model

import org.jetbrains.jet.lang.descriptors.ValueParameterDescriptor

trait ArgumentMapping {
    fun isError(): Boolean
}

object ArgumentUnmapped: ArgumentMapping {
    override fun isError(): Boolean = true
}

enum class ArgumentMatchStatus(val isError: Boolean = true) {
    SUCCESS : ArgumentMatchStatus(false)
    TYPE_MISMATCH : ArgumentMatchStatus()
    ARGUMENT_HAS_NO_TYPE : ArgumentMatchStatus()

    // The case when there is no type mismatch, but parameter has uninferred types:
    // fun <T> foo(l: List<T>) {}; val l = foo(emptyList())
    MATCH_MODULO_UNINFERRED_TYPES : ArgumentMatchStatus()
}

trait ArgumentMatch : ArgumentMapping {
    val valueParameter: ValueParameterDescriptor
    val status: ArgumentMatchStatus

    override fun isError(): Boolean = status.isError
}

class ArgumentMatchImpl(override val valueParameter: ValueParameterDescriptor): ArgumentMatch {
    var matchStatus: ArgumentMatchStatus? = null
    override val status: ArgumentMatchStatus get() = matchStatus!!
    fun replaceValueParameter(newValueParameter: ValueParameterDescriptor): ArgumentMatchImpl {
        val newArgumentMatch = ArgumentMatchImpl(newValueParameter)
        newArgumentMatch.matchStatus = matchStatus
        return newArgumentMatch
    }
}
