/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.annotations

import org.jetbrains.kotlin.analysis.api.annotations.AnnotationUseSiteTargetFilter
import org.jetbrains.kotlin.analysis.api.annotations.KaAnnotationApplication
import org.jetbrains.kotlin.analysis.api.annotations.KaAnnotationList
import org.jetbrains.kotlin.analysis.api.fir.KaSymbolByFirBuilder
import org.jetbrains.kotlin.analysis.api.impl.base.annotations.KaEmptyAnnotationList
import org.jetbrains.kotlin.analysis.api.lifetime.KaLifetimeToken
import org.jetbrains.kotlin.analysis.api.lifetime.withValidityAssertion
import org.jetbrains.kotlin.fir.FirAnnotationContainer
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol
import org.jetbrains.kotlin.name.ClassId

internal class KaFirAnnotationListForReceiverParameter private constructor(
    private val firCallableSymbol: FirCallableSymbol<*>,
    private val receiverParameter: FirAnnotationContainer,
    private val builder: KaSymbolByFirBuilder,
) : AbstractList<KaAnnotationApplication>(), KaAnnotationList {
    private val backingAnnotations by lazy { annotations(firCallableSymbol, builder, receiverParameter) }

    private val useSiteSession: FirSession
        get() = builder.rootSession

    override val token: KaLifetimeToken
        get() = builder.token

    override fun isEmpty(): Boolean = withValidityAssertion {
        return receiverParameter.annotations.isEmpty()
    }

    override val size: Int
        get() = withValidityAssertion { receiverParameter.annotations.size }

    override fun iterator(): Iterator<KaAnnotationApplication> = withValidityAssertion {
        return backingAnnotations.iterator()
    }

    override fun get(index: Int): KaAnnotationApplication = withValidityAssertion {
        return backingAnnotations[index]
    }

    override fun hasAnnotation(classId: ClassId, useSiteTargetFilter: AnnotationUseSiteTargetFilter): Boolean = withValidityAssertion {
        return hasAnnotation(firCallableSymbol, classId, useSiteTargetFilter, useSiteSession, receiverParameter)
    }

    override fun annotationsByClassId(
        classId: ClassId,
        useSiteTargetFilter: AnnotationUseSiteTargetFilter,
    ): List<KaAnnotationApplication> = withValidityAssertion {
        return annotationsByClassId(firCallableSymbol, classId, useSiteTargetFilter, builder, receiverParameter)
    }

    override val annotationClassIds: Collection<ClassId>
        get() = withValidityAssertion {
            annotationClassIds(firCallableSymbol, useSiteSession, receiverParameter)
        }

    companion object {
        fun create(firCallableSymbol: FirCallableSymbol<*>, builder: KaSymbolByFirBuilder): KaAnnotationList {
            val receiverParameter = firCallableSymbol.receiverParameter
            return if (receiverParameter?.annotations?.isEmpty() != false) {
                KaEmptyAnnotationList(builder.token)
            } else {
                KaFirAnnotationListForReceiverParameter(firCallableSymbol, receiverParameter, builder)
            }
        }
    }
}
