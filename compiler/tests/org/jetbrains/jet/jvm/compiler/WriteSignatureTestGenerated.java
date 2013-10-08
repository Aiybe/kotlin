/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.jvm.compiler;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.jvm.compiler.AbstractWriteSignatureTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/writeSignature")
@InnerTestClasses({WriteSignatureTestGenerated.Constructor.class, WriteSignatureTestGenerated.DeclarationSiteVariance.class})
public class WriteSignatureTestGenerated extends AbstractWriteSignatureTest {
    public void testAllFilesPresentInWriteSignature() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/writeSignature"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("ArrayOfCharSequence.kt")
    public void testArrayOfCharSequence() throws Exception {
        doTest("compiler/testData/writeSignature/ArrayOfCharSequence.kt");
    }
    
    @TestMetadata("ArrayOfInt.kt")
    public void testArrayOfInt() throws Exception {
        doTest("compiler/testData/writeSignature/ArrayOfInt.kt");
    }
    
    @TestMetadata("Comparable.kt")
    public void testComparable() throws Exception {
        doTest("compiler/testData/writeSignature/Comparable.kt");
    }
    
    @TestMetadata("Int.kt")
    public void testInt() throws Exception {
        doTest("compiler/testData/writeSignature/Int.kt");
    }
    
    @TestMetadata("IntArray.kt")
    public void testIntArray() throws Exception {
        doTest("compiler/testData/writeSignature/IntArray.kt");
    }
    
    @TestMetadata("IntQ.kt")
    public void testIntQ() throws Exception {
        doTest("compiler/testData/writeSignature/IntQ.kt");
    }
    
    @TestMetadata("jlString.kt")
    public void testJlString() throws Exception {
        doTest("compiler/testData/writeSignature/jlString.kt");
    }
    
    @TestMetadata("ListOfCharSequence.kt")
    public void testListOfCharSequence() throws Exception {
        doTest("compiler/testData/writeSignature/ListOfCharSequence.kt");
    }
    
    @TestMetadata("ListOfStar.kt")
    public void testListOfStar() throws Exception {
        doTest("compiler/testData/writeSignature/ListOfStar.kt");
    }
    
    @TestMetadata("MapEntry.kt")
    public void testMapEntry() throws Exception {
        doTest("compiler/testData/writeSignature/MapEntry.kt");
    }
    
    @TestMetadata("MutableMapEntry.kt")
    public void testMutableMapEntry() throws Exception {
        doTest("compiler/testData/writeSignature/MutableMapEntry.kt");
    }
    
    @TestMetadata("NonGeneric.kt")
    public void testNonGeneric() throws Exception {
        doTest("compiler/testData/writeSignature/NonGeneric.kt");
    }
    
    @TestMetadata("Nothing.kt")
    public void testNothing() throws Exception {
        doTest("compiler/testData/writeSignature/Nothing.kt");
    }
    
    @TestMetadata("NothingQ.kt")
    public void testNothingQ() throws Exception {
        doTest("compiler/testData/writeSignature/NothingQ.kt");
    }
    
    @TestMetadata("VarargCharSequence.kt")
    public void testVarargCharSequence() throws Exception {
        doTest("compiler/testData/writeSignature/VarargCharSequence.kt");
    }
    
    @TestMetadata("VarargGeneric.kt")
    public void testVarargGeneric() throws Exception {
        doTest("compiler/testData/writeSignature/VarargGeneric.kt");
    }
    
    @TestMetadata("compiler/testData/writeSignature/constructor")
    public static class Constructor extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInConstructor() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/writeSignature/constructor"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("Constructor0.kt")
        public void testConstructor0() throws Exception {
            doTest("compiler/testData/writeSignature/constructor/Constructor0.kt");
        }
        
        @TestMetadata("ConstructorCollectionParameter.kt")
        public void testConstructorCollectionParameter() throws Exception {
            doTest("compiler/testData/writeSignature/constructor/ConstructorCollectionParameter.kt");
        }
        
        @TestMetadata("ConstructorWithTypeParameter.kt")
        public void testConstructorWithTypeParameter() throws Exception {
            doTest("compiler/testData/writeSignature/constructor/ConstructorWithTypeParameter.kt");
        }
        
        @TestMetadata("ConstructorWithTypeParameterAndValueParameterP.kt")
        public void testConstructorWithTypeParameterAndValueParameterP() throws Exception {
            doTest("compiler/testData/writeSignature/constructor/ConstructorWithTypeParameterAndValueParameterP.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/writeSignature/declarationSiteVariance")
    public static class DeclarationSiteVariance extends AbstractWriteSignatureTest {
        public void testAllFilesPresentInDeclarationSiteVariance() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("compiler/testData/writeSignature/declarationSiteVariance"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("FunctionTwoTypeParameters.kt")
        public void testFunctionTwoTypeParameters() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/FunctionTwoTypeParameters.kt");
        }
        
        @TestMetadata("InInInPosition.kt")
        public void testInInInPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/InInInPosition.kt");
        }
        
        @TestMetadata("InInOutPosition.kt")
        public void testInInOutPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/InInOutPosition.kt");
        }
        
        @TestMetadata("InOfInInInPosition.kt")
        public void testInOfInInInPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/InOfInInInPosition.kt");
        }
        
        @TestMetadata("InOfInInOutPosition.kt")
        public void testInOfInInOutPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/InOfInInOutPosition.kt");
        }
        
        @TestMetadata("InOfOutInInPosition.kt")
        public void testInOfOutInInPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/InOfOutInInPosition.kt");
        }
        
        @TestMetadata("InOfOutInOutPosition.kt")
        public void testInOfOutInOutPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/InOfOutInOutPosition.kt");
        }
        
        @TestMetadata("OutInInPosition.kt")
        public void testOutInInPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/OutInInPosition.kt");
        }
        
        @TestMetadata("OutInOutPosition.kt")
        public void testOutInOutPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/OutInOutPosition.kt");
        }
        
        @TestMetadata("OutOfInInInPosition.kt")
        public void testOutOfInInInPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfInInInPosition.kt");
        }
        
        @TestMetadata("OutOfInInOutPosition.kt")
        public void testOutOfInInOutPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfInInOutPosition.kt");
        }
        
        @TestMetadata("OutOfOutInInPosition.kt")
        public void testOutOfOutInInPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfOutInInPosition.kt");
        }
        
        @TestMetadata("OutOfOutInOutPosition.kt")
        public void testOutOfOutInOutPosition() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/OutOfOutInOutPosition.kt");
        }
        
        @TestMetadata("PropertyGetterIn.kt")
        public void testPropertyGetterIn() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterIn.kt");
        }
        
        @TestMetadata("PropertyGetterOut.kt")
        public void testPropertyGetterOut() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterOut.kt");
        }
        
        @TestMetadata("PropertyGetterTwoParams.kt")
        public void testPropertyGetterTwoParams() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/PropertyGetterTwoParams.kt");
        }
        
        @TestMetadata("PropertySetterIn.kt")
        public void testPropertySetterIn() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/PropertySetterIn.kt");
        }
        
        @TestMetadata("PropertySetterOut.kt")
        public void testPropertySetterOut() throws Exception {
            doTest("compiler/testData/writeSignature/declarationSiteVariance/PropertySetterOut.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("WriteSignatureTestGenerated");
        suite.addTestSuite(WriteSignatureTestGenerated.class);
        suite.addTestSuite(Constructor.class);
        suite.addTestSuite(DeclarationSiteVariance.class);
        return suite;
    }
}