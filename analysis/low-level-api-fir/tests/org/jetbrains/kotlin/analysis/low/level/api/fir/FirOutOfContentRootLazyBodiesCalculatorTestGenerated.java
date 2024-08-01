/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder")
@TestDataPath("$PROJECT_ROOT")
public class FirOutOfContentRootLazyBodiesCalculatorTestGenerated extends AbstractFirOutOfContentRootLazyBodiesCalculatorTest {
  @Test
  public void testAllFilesPresentInRawBuilder() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
  }

  @Nested
  @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations")
  @TestDataPath("$PROJECT_ROOT")
  public class Declarations {
    @Test
    public void testAllFilesPresentInDeclarations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
    }

    @Test
    @TestMetadata("annotation.kt")
    public void testAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotation.kt");
    }

    @Test
    @TestMetadata("annotationOnField.kt")
    public void testAnnotationOnField() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnField.kt");
    }

    @Test
    @TestMetadata("annotationOnProperty.kt")
    public void testAnnotationOnProperty() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnProperty.kt");
    }

    @Test
    @TestMetadata("annotationOnSuperType.kt")
    public void testAnnotationOnSuperType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnSuperType.kt");
    }

    @Test
    @TestMetadata("annotationOnSuperTypeCall.kt")
    public void testAnnotationOnSuperTypeCall() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnSuperTypeCall.kt");
    }

    @Test
    @TestMetadata("annotationOnTypeParameterInWhereClause.kt")
    public void testAnnotationOnTypeParameterInWhereClause() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnTypeParameterInWhereClause.kt");
    }

    @Test
    @TestMetadata("annotationsOnNullableParenthesizedTypes.kt")
    public void testAnnotationsOnNullableParenthesizedTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationsOnNullableParenthesizedTypes.kt");
    }

    @Test
    @TestMetadata("annotationsOnParenthesizedTypes.kt")
    public void testAnnotationsOnParenthesizedTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationsOnParenthesizedTypes.kt");
    }

    @Test
    @TestMetadata("anonymousObjectWithAnnotation.kt")
    public void testAnonymousObjectWithAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/anonymousObjectWithAnnotation.kt");
    }

    @Test
    @TestMetadata("classLevelDestructuringWithAnnotation.kt")
    public void testClassLevelDestructuringWithAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/classLevelDestructuringWithAnnotation.kt");
    }

    @Test
    @TestMetadata("classWithWrongSuperCall.kt")
    public void testClassWithWrongSuperCall() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/classWithWrongSuperCall.kt");
    }

    @Test
    @TestMetadata("complexTypes.kt")
    public void testComplexTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/complexTypes.kt");
    }

    @Test
    @TestMetadata("constructorInObject.kt")
    public void testConstructorInObject() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorInObject.kt");
    }

    @Test
    @TestMetadata("constructorOfAnonymousObject.kt")
    public void testConstructorOfAnonymousObject() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorOfAnonymousObject.kt");
    }

    @Test
    @TestMetadata("constructorWithAnnotations.kt")
    public void testConstructorWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorWithAnnotations.kt");
    }

    @Test
    @TestMetadata("constructorWithLocalDeclarations.kt")
    public void testConstructorWithLocalDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorWithLocalDeclarations.kt");
    }

    @Test
    @TestMetadata("contextReceivers.kt")
    public void testContextReceivers() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contextReceivers.kt");
    }

    @Test
    @TestMetadata("danglingAnnotationsClassLevel.kt")
    public void testDanglingAnnotationsClassLevel() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/danglingAnnotationsClassLevel.kt");
    }

    @Test
    @TestMetadata("danglingAnnotationsFileLevel.kt")
    public void testDanglingAnnotationsFileLevel() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/danglingAnnotationsFileLevel.kt");
    }

    @Test
    @TestMetadata("danglingConstrants.kt")
    public void testDanglingConstrants() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/danglingConstrants.kt");
    }

    @Test
    @TestMetadata("dataClassWithAnnotations.kt")
    public void testDataClassWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/dataClassWithAnnotations.kt");
    }

    @Test
    @TestMetadata("delegatedFieldNestedName.kt")
    public void testDelegatedFieldNestedName() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/delegatedFieldNestedName.kt");
    }

    @Test
    @TestMetadata("delegates.kt")
    public void testDelegates() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/delegates.kt");
    }

    @Test
    @TestMetadata("delegatesWithAnnotations.kt")
    public void testDelegatesWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/delegatesWithAnnotations.kt");
    }

    @Test
    @TestMetadata("derivedClass.kt")
    public void testDerivedClass() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/derivedClass.kt");
    }

    @Test
    @TestMetadata("emptyAnonymousObject.kt")
    public void testEmptyAnonymousObject() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/emptyAnonymousObject.kt");
    }

    @Test
    @TestMetadata("enumEntryWithAnnotations.kt")
    public void testEnumEntryWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enumEntryWithAnnotations.kt");
    }

    @Test
    @TestMetadata("enums.kt")
    public void testEnums() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enums.kt");
    }

    @Test
    @TestMetadata("enums2.kt")
    public void testEnums2() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enums2.kt");
    }

    @Test
    @TestMetadata("enums3.kt")
    public void testEnums3() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enums3.kt");
    }

    @Test
    @TestMetadata("expectActual.kt")
    public void testExpectActual() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectActual.kt");
    }

    @Test
    @TestMetadata("expectClassesAndFunctions.kt")
    public void testExpectClassesAndFunctions() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectClassesAndFunctions.kt");
    }

    @Test
    @TestMetadata("expectNestedAnnotationClassWithConstructorParameter.kt")
    public void testExpectNestedAnnotationClassWithConstructorParameter() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectNestedAnnotationClassWithConstructorParameter.kt");
    }

    @Test
    @TestMetadata("expectNestedClassMembers.kt")
    public void testExpectNestedClassMembers() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectNestedClassMembers.kt");
    }

    @Test
    @TestMetadata("expectNestedEnumClassGeneratedMembers.kt")
    public void testExpectNestedEnumClassGeneratedMembers() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectNestedEnumClassGeneratedMembers.kt");
    }

    @Test
    @TestMetadata("external.kt")
    public void testExternal() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/external.kt");
    }

    @Test
    @TestMetadata("F.kt")
    public void testF() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/F.kt");
    }

    @Test
    @TestMetadata("fileAnnotations.kt")
    public void testFileAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/fileAnnotations.kt");
    }

    @Test
    @TestMetadata("fileAnnotationsWithoutPackage.kt")
    public void testFileAnnotationsWithoutPackage() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/fileAnnotationsWithoutPackage.kt");
    }

    @Test
    @TestMetadata("functionTypes.kt")
    public void testFunctionTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/functionTypes.kt");
    }

    @Test
    @TestMetadata("functionWithAnnotations.kt")
    public void testFunctionWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/functionWithAnnotations.kt");
    }

    @Test
    @TestMetadata("genericFunctions.kt")
    public void testGenericFunctions() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/genericFunctions.kt");
    }

    @Test
    @TestMetadata("genericProperty.kt")
    public void testGenericProperty() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/genericProperty.kt");
    }

    @Test
    @TestMetadata("incompletePropertyWithDelegate.kt")
    public void testIncompletePropertyWithDelegate() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/incompletePropertyWithDelegate.kt");
    }

    @Test
    @TestMetadata("initBlockWithDeclarations.kt")
    public void testInitBlockWithDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/initBlockWithDeclarations.kt");
    }

    @Test
    @TestMetadata("initWithLocalDeclarations.kt")
    public void testInitWithLocalDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/initWithLocalDeclarations.kt");
    }

    @Test
    @TestMetadata("invalidDestructing.kt")
    public void testInvalidDestructing() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidDestructing.kt");
    }

    @Test
    @TestMetadata("kotlinAny.kt")
    public void testKotlinAny() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/kotlinAny.kt");
    }

    @Test
    @TestMetadata("kotlinAnyNonTopLevel.kt")
    public void testKotlinAnyNonTopLevel() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/kotlinAnyNonTopLevel.kt");
    }

    @Test
    @TestMetadata("localAnnotations.kt")
    public void testLocalAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/localAnnotations.kt");
    }

    @Test
    @TestMetadata("localDeclarationsInEnumEntry.kt")
    public void testLocalDeclarationsInEnumEntry() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/localDeclarationsInEnumEntry.kt");
    }

    @Test
    @TestMetadata("localImplicitType.kt")
    public void testLocalImplicitType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/localImplicitType.kt");
    }

    @Test
    @TestMetadata("multiDeclarations.kt")
    public void testMultiDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/multiDeclarations.kt");
    }

    @Test
    @TestMetadata("nestedClass.kt")
    public void testNestedClass() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/nestedClass.kt");
    }

    @Test
    @TestMetadata("NestedOfAliasedType.kt")
    public void testNestedOfAliasedType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/NestedOfAliasedType.kt");
    }

    @Test
    @TestMetadata("NestedSuperType.kt")
    public void testNestedSuperType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/NestedSuperType.kt");
    }

    @Test
    @TestMetadata("noPrimaryConstructor.kt")
    public void testNoPrimaryConstructor() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("primaryConstructorWithoutConstructorKeyword.kt")
    public void testPrimaryConstructorWithoutConstructorKeyword() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/primaryConstructorWithoutConstructorKeyword.kt");
    }

    @Test
    @TestMetadata("propertyWithBackingField.kt")
    public void testPropertyWithBackingField() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/propertyWithBackingField.kt");
    }

    @Test
    @TestMetadata("propertyWithBackingFieldDifferentTypes.kt")
    public void testPropertyWithBackingFieldDifferentTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/propertyWithBackingFieldDifferentTypes.kt");
    }

    @Test
    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/secondaryConstructor.kt");
    }

    @Test
    @TestMetadata("simpleClass.kt")
    public void testSimpleClass() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/simpleClass.kt");
    }

    @Test
    @TestMetadata("simpleFun.kt")
    public void testSimpleFun() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/simpleFun.kt");
    }

    @Test
    @TestMetadata("simpleTypeAlias.kt")
    public void testSimpleTypeAlias() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/simpleTypeAlias.kt");
    }

    @Test
    @TestMetadata("splitModifierList.kt")
    public void testSplitModifierList() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/splitModifierList.kt");
    }

    @Test
    @TestMetadata("suspendFunctionTypes.kt")
    public void testSuspendFunctionTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/suspendFunctionTypes.kt");
    }

    @Test
    @TestMetadata("topLevelDestructuringWithAnnotation.kt")
    public void testTopLevelDestructuringWithAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/topLevelDestructuringWithAnnotation.kt");
    }

    @Test
    @TestMetadata("typeAliasWithGeneric.kt")
    public void testTypeAliasWithGeneric() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/typeAliasWithGeneric.kt");
    }

    @Test
    @TestMetadata("typeParameterVsNested.kt")
    public void testTypeParameterVsNested() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/typeParameterVsNested.kt");
    }

    @Test
    @TestMetadata("typeParameters.kt")
    public void testTypeParameters() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/typeParameters.kt");
    }

    @Test
    @TestMetadata("userAny.kt")
    public void testUserAny() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/userAny.kt");
    }

    @Test
    @TestMetadata("where.kt")
    public void testWhere() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/where.kt");
    }

    @Nested
    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts")
    @TestDataPath("$PROJECT_ROOT")
    public class Contracts {
      @Test
      public void testAllFilesPresentInContracts() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
      }

      @Nested
      @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax")
      @TestDataPath("$PROJECT_ROOT")
      public class NewSyntax {
        @Test
        public void testAllFilesPresentInNewSyntax() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("functionWithBothOldAndNewSyntaxContractDescription.kt")
        public void testFunctionWithBothOldAndNewSyntaxContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax/functionWithBothOldAndNewSyntaxContractDescription.kt");
        }

        @Test
        @TestMetadata("propertyAccessorsContractDescription.kt")
        public void testPropertyAccessorsContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax/propertyAccessorsContractDescription.kt");
        }

        @Test
        @TestMetadata("simpleFunctionsContractDescription.kt")
        public void testSimpleFunctionsContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax/simpleFunctionsContractDescription.kt");
        }
      }

      @Nested
      @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/oldSyntax")
      @TestDataPath("$PROJECT_ROOT")
      public class OldSyntax {
        @Test
        public void testAllFilesPresentInOldSyntax() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/oldSyntax"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("contractDescription.kt")
        public void testContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/oldSyntax/contractDescription.kt");
        }
      }
    }

    @Nested
    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidCode")
    @TestDataPath("$PROJECT_ROOT")
    public class InvalidCode {
      @Test
      public void testAllFilesPresentInInvalidCode() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidCode"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
      }

      @Test
      @TestMetadata("setterWithNoBodyAndDifferentValueParameterType.kt")
      public void testSetterWithNoBodyAndDifferentValueParameterType() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidCode/setterWithNoBodyAndDifferentValueParameterType.kt");
      }
    }

    @Nested
    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType")
    @TestDataPath("$PROJECT_ROOT")
    public class NoParameterType {
      @Test
      public void testAllFilesPresentInNoParameterType() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
      }

      @Test
      @TestMetadata("noParameterTypRefInCatch.kt")
      public void testNoParameterTypRefInCatch() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInCatch.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInFuncionalType.kt")
      public void testNoParameterTypRefInFuncionalType() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInFuncionalType.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInFunction.kt")
      public void testNoParameterTypRefInFunction() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInFunction.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInLambda.kt")
      public void testNoParameterTypRefInLambda() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInLambda.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInPrimaryConstructor.kt")
      public void testNoParameterTypRefInPrimaryConstructor() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConstructor.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInPrimaryConstructorWithVararg.kt")
      public void testNoParameterTypRefInPrimaryConstructorWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConstructorWithVararg.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInPrimaryConsturctorVal.kt")
      public void testNoParameterTypRefInPrimaryConsturctorVal() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConsturctorVal.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInPrimaryConsturctorValWithVararg.kt")
      public void testNoParameterTypRefInPrimaryConsturctorValWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConsturctorValWithVararg.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInSecondaryConstructor.kt")
      public void testNoParameterTypRefInSecondaryConstructor() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInSecondaryConstructor.kt");
      }

      @Test
      @TestMetadata("noParameterTypRefInSetter.kt")
      public void testNoParameterTypRefInSetter() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInSetter.kt");
      }

      @Test
      @TestMetadata("uncompletedTypRefInPrimaryConstructorWithVararg.kt")
      public void testUncompletedTypRefInPrimaryConstructorWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/uncompletedTypRefInPrimaryConstructorWithVararg.kt");
      }

      @Test
      @TestMetadata("uncompletedTypRefInPrimaryConsturctorValWithVararg.kt")
      public void testUncompletedTypRefInPrimaryConsturctorValWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/uncompletedTypRefInPrimaryConsturctorValWithVararg.kt");
      }
    }
  }

  @Nested
  @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions")
  @TestDataPath("$PROJECT_ROOT")
  public class Expressions {
    @Test
    public void testAllFilesPresentInExpressions() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
    }

    @Test
    @TestMetadata("annotated.kt")
    public void testAnnotated() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/annotated.kt");
    }

    @Test
    @TestMetadata("arrayAccess.kt")
    public void testArrayAccess() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/arrayAccess.kt");
    }

    @Test
    @TestMetadata("arrayAssignment.kt")
    public void testArrayAssignment() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/arrayAssignment.kt");
    }

    @Test
    @TestMetadata("branches.kt")
    public void testBranches() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/branches.kt");
    }

    @Test
    @TestMetadata("callableReferences.kt")
    public void testCallableReferences() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/callableReferences.kt");
    }

    @Test
    @TestMetadata("calls.kt")
    public void testCalls() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/calls.kt");
    }

    @Test
    @TestMetadata("cascadeIf.kt")
    public void testCascadeIf() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/cascadeIf.kt");
    }

    @Test
    @TestMetadata("classReference.kt")
    public void testClassReference() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/classReference.kt");
    }

    @Test
    @TestMetadata("collectionLiterals.kt")
    public void testCollectionLiterals() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/collectionLiterals.kt");
    }

    @Test
    @TestMetadata("destructuring.kt")
    public void testDestructuring() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/destructuring.kt");
    }

    @Test
    @TestMetadata("for.kt")
    public void testFor() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/for.kt");
    }

    @Test
    @TestMetadata("genericCalls.kt")
    public void testGenericCalls() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/genericCalls.kt");
    }

    @Test
    @TestMetadata("in.kt")
    public void testIn() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/in.kt");
    }

    @Test
    @TestMetadata("inBrackets.kt")
    public void testInBrackets() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/inBrackets.kt");
    }

    @Test
    @TestMetadata("init.kt")
    public void testInit() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/init.kt");
    }

    @Test
    @TestMetadata("invalidWhen.kt")
    public void testInvalidWhen() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidWhen.kt");
    }

    @Test
    @TestMetadata("labelForInfix.kt")
    public void testLabelForInfix() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/labelForInfix.kt");
    }

    @Test
    @TestMetadata("lambda.kt")
    public void testLambda() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/lambda.kt");
    }

    @Test
    @TestMetadata("lambdaAndAnonymousFunction.kt")
    public void testLambdaAndAnonymousFunction() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/lambdaAndAnonymousFunction.kt");
    }

    @Test
    @TestMetadata("localDeclarationWithExpression.kt")
    public void testLocalDeclarationWithExpression() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/localDeclarationWithExpression.kt");
    }

    @Test
    @TestMetadata("locals.kt")
    public void testLocals() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/locals.kt");
    }

    @Test
    @TestMetadata("modifications.kt")
    public void testModifications() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/modifications.kt");
    }

    @Test
    @TestMetadata("namedArgument.kt")
    public void testNamedArgument() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/namedArgument.kt");
    }

    @Test
    @TestMetadata("nullability.kt")
    public void testNullability() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/nullability.kt");
    }

    @Test
    @TestMetadata("parenthesizedSafeCallsAndOperators.kt")
    public void testParenthesizedSafeCallsAndOperators() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/parenthesizedSafeCallsAndOperators.kt");
    }

    @Test
    @TestMetadata("qualifierWithTypeArguments.kt")
    public void testQualifierWithTypeArguments() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/qualifierWithTypeArguments.kt");
    }

    @Test
    @TestMetadata("safeCallsImplicitWithInvoke.kt")
    public void testSafeCallsImplicitWithInvoke() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsImplicitWithInvoke.kt");
    }

    @Test
    @TestMetadata("safeCallsWithAssignment.kt")
    public void testSafeCallsWithAssignment() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsWithAssignment.kt");
    }

    @Test
    @TestMetadata("safeCallsWithAugmentedAssignment.kt")
    public void testSafeCallsWithAugmentedAssignment() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsWithAugmentedAssignment.kt");
    }

    @Test
    @TestMetadata("safeCallsWithUnaryOperators.kt")
    public void testSafeCallsWithUnaryOperators() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsWithUnaryOperators.kt");
    }

    @Test
    @TestMetadata("simpleReturns.kt")
    public void testSimpleReturns() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/simpleReturns.kt");
    }

    @Test
    @TestMetadata("super.kt")
    public void testSuper() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/super.kt");
    }

    @Test
    @TestMetadata("these.kt")
    public void testThese() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/these.kt");
    }

    @Test
    @TestMetadata("try.kt")
    public void testTry() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/try.kt");
    }

    @Test
    @TestMetadata("typeOperators.kt")
    public void testTypeOperators() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/typeOperators.kt");
    }

    @Test
    @TestMetadata("unary.kt")
    public void testUnary() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/unary.kt");
    }

    @Test
    @TestMetadata("variables.kt")
    public void testVariables() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/variables.kt");
    }

    @Test
    @TestMetadata("whenGuards.kt")
    public void testWhenGuards() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/whenGuards.kt");
    }

    @Test
    @TestMetadata("while.kt")
    public void testWhile() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/while.kt");
    }

    @Nested
    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode")
    @TestDataPath("$PROJECT_ROOT")
    public class InvalidCode {
      @Test
      public void testAllFilesPresentInInvalidCode() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
      }

      @Test
      @TestMetadata("longStringTemplateEntryInvalidCharacters.kt")
      public void testLongStringTemplateEntryInvalidCharacters() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode/longStringTemplateEntryInvalidCharacters.kt");
      }

      @Test
      @TestMetadata("longStringTemplateEntryWithTwoExpressions.kt")
      public void testLongStringTemplateEntryWithTwoExpressions() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode/longStringTemplateEntryWithTwoExpressions.kt");
      }
    }
  }
}
