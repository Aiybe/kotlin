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

package org.jetbrains.jet.plugin.refactoring.move;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.refactoring.move.AbstractJetMoveTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/move")
public class JetMoveTestGenerated extends AbstractJetMoveTest {
    public void testAllFilesPresentInMove() throws Exception {
        JetTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/refactoring/move"), Pattern.compile("^(.+)\\.test$"));
    }
    
    @TestMetadata("java/moveClass/moveAsMember/moveClassToExternalNestedClass/moveClassToExternalNestedClass.test")
    public void testJava_moveClass_moveAsMember_moveClassToExternalNestedClass_MoveClassToExternalNestedClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToExternalNestedClass/moveClassToExternalNestedClass.test");
    }
    
    @TestMetadata("java/moveClass/moveAsMember/moveClassToNestedSiblingClass/moveClassToNestedSiblingClass.test")
    public void testJava_moveClass_moveAsMember_moveClassToNestedSiblingClass_MoveClassToNestedSiblingClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToNestedSiblingClass/moveClassToNestedSiblingClass.test");
    }
    
    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClass/moveClassToTopLevelClass.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClass_MoveClassToTopLevelClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClass/moveClassToTopLevelClass.test");
    }
    
    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePackageLocal/moveClassToTopLevelClassAndMakePackageLocal.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClassAndMakePackageLocal_MoveClassToTopLevelClassAndMakePackageLocal() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePackageLocal/moveClassToTopLevelClassAndMakePackageLocal.test");
    }
    
    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePrivate/moveClassToTopLevelClassAndMakePrivate.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClassAndMakePrivate_MoveClassToTopLevelClassAndMakePrivate() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePrivate/moveClassToTopLevelClassAndMakePrivate.test");
    }
    
    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClassOfAnotherPackage/moveClassToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClassOfAnotherPackage_MoveClassToTopLevelClassOfAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClassOfAnotherPackage/moveClassToTopLevelClassOfAnotherPackage.test");
    }
    
    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInAnotherPackage/moveNestedClassToTopLevelInAnotherPackage.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInAnotherPackage_MoveNestedClassToTopLevelInAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInAnotherPackage/moveNestedClassToTopLevelInAnotherPackage.test");
    }
    
    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackage/moveNestedClassToTopLevelInTheSamePackage.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInTheSamePackage_MoveNestedClassToTopLevelInTheSamePackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackage/moveNestedClassToTopLevelInTheSamePackage.test");
    }
    
    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndRename/moveNestedClassToTopLevelInTheSamePackageAndRename.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInTheSamePackageAndRename_MoveNestedClassToTopLevelInTheSamePackageAndRename() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndRename/moveNestedClassToTopLevelInTheSamePackageAndRename.test");
    }
    
    @TestMetadata("java/moveClass/moveTop/moveTopLevelClassToAnotherPackage/moveTopLevelClassToAnotherPackage.test")
    public void testJava_moveClass_moveTop_moveTopLevelClassToAnotherPackage_MoveTopLevelClassToAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveTop/moveTopLevelClassToAnotherPackage/moveTopLevelClassToAnotherPackage.test");
    }
    
    @TestMetadata("java/moveClass/moveTopToInner/moveTopLevelClassToNestedClass/moveTopLevelClassToTopLevelClass.test")
    public void testJava_moveClass_moveTopToInner_moveTopLevelClassToNestedClass_MoveTopLevelClassToTopLevelClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveTopToInner/moveTopLevelClassToNestedClass/moveTopLevelClassToTopLevelClass.test");
    }
    
    @TestMetadata("java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClass/moveTopLevelClassToTopLevelClass.test")
    public void testJava_moveClass_moveTopToInner_moveTopLevelClassToTopLevelClass_MoveTopLevelClassToTopLevelClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClass/moveTopLevelClassToTopLevelClass.test");
    }
    
    @TestMetadata("java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClassOfAnotherPackage/moveTopLevelClassToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveClass_moveTopToInner_moveTopLevelClassToTopLevelClassOfAnotherPackage_MoveTopLevelClassToTopLevelClassOfAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClassOfAnotherPackage/moveTopLevelClassToTopLevelClassOfAnotherPackage.test");
    }
    
    @TestMetadata("java/moveField/moveFieldToExternalNestedClass/moveFieldToExternalNestedClass.test")
    public void testJava_moveField_moveFieldToExternalNestedClass_MoveFieldToExternalNestedClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveField/moveFieldToExternalNestedClass/moveFieldToExternalNestedClass.test");
    }
    
    @TestMetadata("java/moveField/moveFieldToNestedSiblingClass/moveFieldToNestedSiblingClass.test")
    public void testJava_moveField_moveFieldToNestedSiblingClass_MoveFieldToNestedSiblingClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveField/moveFieldToNestedSiblingClass/moveFieldToNestedSiblingClass.test");
    }
    
    @TestMetadata("java/moveField/moveFieldToTopLevelClass/moveFieldToTopLevelClass.test")
    public void testJava_moveField_moveFieldToTopLevelClass_MoveFieldToTopLevelClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClass/moveFieldToTopLevelClass.test");
    }
    
    @TestMetadata("java/moveField/moveFieldToTopLevelClassAndMakePackageLocal/moveFieldToTopLevelClassAndMakePackageLocal.test")
    public void testJava_moveField_moveFieldToTopLevelClassAndMakePackageLocal_MoveFieldToTopLevelClassAndMakePackageLocal() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClassAndMakePackageLocal/moveFieldToTopLevelClassAndMakePackageLocal.test");
    }
    
    @TestMetadata("java/moveField/moveFieldToTopLevelClassAndMakePrivate/moveFieldToTopLevelClassAndMakePrivate.test")
    public void testJava_moveField_moveFieldToTopLevelClassAndMakePrivate_MoveFieldToTopLevelClassAndMakePrivate() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClassAndMakePrivate/moveFieldToTopLevelClassAndMakePrivate.test");
    }
    
    @TestMetadata("java/moveField/moveFieldToTopLevelClassOfAnotherPackage/moveFieldToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveField_moveFieldToTopLevelClassOfAnotherPackage_MoveFieldToTopLevelClassOfAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClassOfAnotherPackage/moveFieldToTopLevelClassOfAnotherPackage.test");
    }
    
    @TestMetadata("java/moveFile/moveFileToAnotherPackage/moveFileToAnotherPackage.test")
    public void testJava_moveFile_moveFileToAnotherPackage_MoveFileToAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveFile/moveFileToAnotherPackage/moveFileToAnotherPackage.test");
    }
    
    @TestMetadata("java/moveMethod/moveMethodToExternalNestedClass/moveMethodToExternalNestedClass.test")
    public void testJava_moveMethod_moveMethodToExternalNestedClass_MoveMethodToExternalNestedClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveMethod/moveMethodToExternalNestedClass/moveMethodToExternalNestedClass.test");
    }
    
    @TestMetadata("java/moveMethod/moveMethodToNestedSiblingClass/moveMethodToNestedSiblingClass.test")
    public void testJava_moveMethod_moveMethodToNestedSiblingClass_MoveMethodToNestedSiblingClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveMethod/moveMethodToNestedSiblingClass/moveMethodToNestedSiblingClass.test");
    }
    
    @TestMetadata("java/moveMethod/moveMethodToTopLevelClass/moveMethodToTopLevelClass.test")
    public void testJava_moveMethod_moveMethodToTopLevelClass_MoveMethodToTopLevelClass() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClass/moveMethodToTopLevelClass.test");
    }
    
    @TestMetadata("java/moveMethod/moveMethodToTopLevelClassAndMakePackageLocal/moveMethodToTopLevelClassAndMakePackageLocal.test")
    public void testJava_moveMethod_moveMethodToTopLevelClassAndMakePackageLocal_MoveMethodToTopLevelClassAndMakePackageLocal() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClassAndMakePackageLocal/moveMethodToTopLevelClassAndMakePackageLocal.test");
    }
    
    @TestMetadata("java/moveMethod/moveMethodToTopLevelClassAndMakePrivate/moveMethodToTopLevelClassAndMakePrivate.test")
    public void testJava_moveMethod_moveMethodToTopLevelClassAndMakePrivate_MoveMethodToTopLevelClassAndMakePrivate() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClassAndMakePrivate/moveMethodToTopLevelClassAndMakePrivate.test");
    }
    
    @TestMetadata("java/moveMethod/moveMethodToTopLevelClassOfAnotherPackage/moveMethodToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveMethod_moveMethodToTopLevelClassOfAnotherPackage_MoveMethodToTopLevelClassOfAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClassOfAnotherPackage/moveMethodToTopLevelClassOfAnotherPackage.test");
    }
    
    @TestMetadata("java/movePackage/movePackageToAnotherPackage/movePackageToAnotherPackage.test")
    public void testJava_movePackage_movePackageToAnotherPackage_MovePackageToAnotherPackage() throws Exception {
        doTest("idea/testData/refactoring/move/java/movePackage/movePackageToAnotherPackage/movePackageToAnotherPackage.test");
    }
    
    @TestMetadata("kotlin/moveFile/moveFileToFile/moveFileToFile.test")
    public void testKotlin_moveFile_moveFileToFile_MoveFileToFile() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveFile/moveFileToFile/moveFileToFile.test");
    }
    
    @TestMetadata("kotlin/moveFile/moveFileWithoutPackageRename/moveFileWithoutPackageRename.test")
    public void testKotlin_moveFile_moveFileWithoutPackageRename_MoveFileWithoutPackageRename() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveFile/moveFileWithoutPackageRename/moveFileWithoutPackageRename.test");
    }
    
    @TestMetadata("kotlin/moveFile/moveFileWithPackageRename/moveFileWithPackageRename.test")
    public void testKotlin_moveFile_moveFileWithPackageRename_MoveFileWithPackageRename() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveFile/moveFileWithPackageRename/moveFileWithPackageRename.test");
    }
    
    @TestMetadata("kotlin/movePackage/movePackage/movePackage.test")
    public void testKotlin_movePackage_movePackage_MovePackage() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/movePackage/movePackage/movePackage.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/moveClassWithImportsRetained/moveClassWithImportsRetained.test")
    public void testKotlin_moveTopLevelDeclarations_misc_moveClassWithImportsRetained_MoveClassWithImportsRetained() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/moveClassWithImportsRetained/moveClassWithImportsRetained.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/moveFunctionWithImportsRetained/moveFunctionWithImportsRetained.test")
    public void testKotlin_moveTopLevelDeclarations_misc_moveFunctionWithImportsRetained_MoveFunctionWithImportsRetained() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/moveFunctionWithImportsRetained/moveFunctionWithImportsRetained.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveClassToFile/moveClassToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveClassToFile_MoveClassToFile() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveClassToFile/moveClassToFile.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveClassToPackage/moveClassToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_moveClassToPackage_MoveClassToPackage() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveClassToPackage/moveClassToPackage.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveClassToPackageWithConflicts/moveClassToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_moveClassToPackageWithConflicts_MoveClassToPackageWithConflicts() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveClassToPackageWithConflicts/moveClassToPackageWithConflicts.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToFile/moveFunctionToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToFile_MoveFunctionToFile() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToFile/moveFunctionToFile.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToPackage/moveFunctionToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToPackage_MoveFunctionToPackage() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToPackage/moveFunctionToPackage.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToPackageWithConflicts/moveFunctionToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToPackageWithConflicts_MoveFunctionToPackageWithConflicts() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToPackageWithConflicts/moveFunctionToPackageWithConflicts.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveObjectToFile/moveObjectToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveObjectToFile_MoveObjectToFile() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveObjectToFile/moveObjectToFile.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveObjectToPackage/moveObjectToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_moveObjectToPackage_MoveObjectToPackage() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveObjectToPackage/moveObjectToPackage.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/moveObjectToPackageWithConflicts/moveObjectToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_moveObjectToPackageWithConflicts_MoveObjectToPackageWithConflicts() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveObjectToPackageWithConflicts/moveObjectToPackageWithConflicts.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/movePropertyToFile/movePropertyToFile.test")
    public void testKotlin_moveTopLevelDeclarations_movePropertyToFile_MovePropertyToFile() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/movePropertyToFile/movePropertyToFile.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/movePropertyToPackage/movePropertyToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_movePropertyToPackage_MovePropertyToPackage() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/movePropertyToPackage/movePropertyToPackage.test");
    }
    
    @TestMetadata("kotlin/moveTopLevelDeclarations/movePropertyToPackageWithConflicts/movePropertyToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_movePropertyToPackageWithConflicts_MovePropertyToPackageWithConflicts() throws Exception {
        doTest("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/movePropertyToPackageWithConflicts/movePropertyToPackageWithConflicts.test");
    }
    
}
