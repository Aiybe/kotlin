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

package org.jetbrains.jet.jps.build;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.util.Function;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jps.builders.BuildResult;
import org.jetbrains.jps.builders.JpsBuildTestCase;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;

import java.io.File;

public class KotlinJpsTestNoIprFiles extends JpsBuildTestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
        System.setProperty("kotlin.jps.tests", "true");
    }

    @Override
    public void tearDown() throws Exception {
        System.clearProperty("kotlin.jps.tests");
        super.tearDown();
    }

    public void testDanglingLambdaMessages() {
        final File testData = new File("jps-plugin/testData/DanglingLambdaMessages");
        addModule("module", testData.getAbsolutePath());

        BuildResult result = makeAll();
        String messageStrings = StringUtil.join(
                ContainerUtil.concat(
                    result.getMessages(BuildMessage.Kind.ERROR),
                    result.getMessages(BuildMessage.Kind.WARNING)
                ),
                new Function<BuildMessage, String>() {
                    @Override
                    public String fun(BuildMessage message) {
                        if (message instanceof CompilerMessage) {
                            CompilerMessage m = (CompilerMessage) message;
                            return (m.getKind() + ": " + m.getSourcePath()).replace(testData.getAbsolutePath(), "$TEST_DATA$") +
                                   ": (" + m.getLine() + ", " + m.getColumn() + ")\n" + m.getMessageText();
                        }
                        return message.toString();
                    }
                },
                "\n\n");
        JetTestUtils.assertEqualsToFile(new File(testData, "out.txt"), messageStrings);
    }
}
