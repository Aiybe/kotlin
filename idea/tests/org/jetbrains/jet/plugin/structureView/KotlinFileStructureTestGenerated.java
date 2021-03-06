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

package org.jetbrains.jet.plugin.structureView;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.structureView.AbstractKotlinFileStructureTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/structureView/fileStructure")
public class KotlinFileStructureTestGenerated extends AbstractKotlinFileStructureTest {
    public void testAllFilesPresentInFileStructure() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/structureView/fileStructure"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
    }
    
    @TestMetadata("CheckLocationForKotlin.kt")
    public void testCheckLocationForKotlin() throws Exception {
        doTest("idea/testData/structureView/fileStructure/CheckLocationForKotlin.kt");
    }
    
    @TestMetadata("CheckMemberLocationForJava.kt")
    public void testCheckMemberLocationForJava() throws Exception {
        doTest("idea/testData/structureView/fileStructure/CheckMemberLocationForJava.kt");
    }
    
    @TestMetadata("DoNotShowParentsInLocationJava.kt")
    public void testDoNotShowParentsInLocationJava() throws Exception {
        doTest("idea/testData/structureView/fileStructure/DoNotShowParentsInLocationJava.kt");
    }
    
    @TestMetadata("EmptyFile.kt")
    public void testEmptyFile() throws Exception {
        doTest("idea/testData/structureView/fileStructure/EmptyFile.kt");
    }
    
    @TestMetadata("InheritedDelegationMethods.kt")
    public void testInheritedDelegationMethods() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedDelegationMethods.kt");
    }
    
    @TestMetadata("InheritedInnerClasses.kt")
    public void testInheritedInnerClasses() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedInnerClasses.kt");
    }
    
    @TestMetadata("InheritedJavaMembers.kt")
    public void testInheritedJavaMembers() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedJavaMembers.kt");
    }
    
    @TestMetadata("InheritedLocalKotlin.kt")
    public void testInheritedLocalKotlin() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedLocalKotlin.kt");
    }
    
    @TestMetadata("InheritedMembers.kt")
    public void testInheritedMembers() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedMembers.kt");
    }
    
    @TestMetadata("InheritedMembersOfEnum.kt")
    public void testInheritedMembersOfEnum() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedMembersOfEnum.kt");
    }
    
    @TestMetadata("InheritedMembersWithSubstitutedTypes.kt")
    public void testInheritedMembersWithSubstitutedTypes() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedMembersWithSubstitutedTypes.kt");
    }
    
    @TestMetadata("InheritedSAMConversion.kt")
    public void testInheritedSAMConversion() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedSAMConversion.kt");
    }
    
    @TestMetadata("InheritedSynthesizedFromDataClass.kt")
    public void testInheritedSynthesizedFromDataClass() throws Exception {
        doTest("idea/testData/structureView/fileStructure/InheritedSynthesizedFromDataClass.kt");
    }
    
    @TestMetadata("Render.kt")
    public void testRender() throws Exception {
        doTest("idea/testData/structureView/fileStructure/Render.kt");
    }
    
    @TestMetadata("SeveralClasses.kt")
    public void testSeveralClasses() throws Exception {
        doTest("idea/testData/structureView/fileStructure/SeveralClasses.kt");
    }
    
    @TestMetadata("Simple.kt")
    public void testSimple() throws Exception {
        doTest("idea/testData/structureView/fileStructure/Simple.kt");
    }
    
}
