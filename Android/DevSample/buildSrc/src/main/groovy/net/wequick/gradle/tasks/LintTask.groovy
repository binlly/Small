/*
 * Copyright 2015-present wequick.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package net.wequick.gradle.tasks

import com.android.build.gradle.internal.pipeline.TransformTask
import com.android.build.gradle.tasks.ProcessAndroidResources
import com.android.sdklib.BuildToolInfo
import groovy.io.FileType
import net.wequick.gradle.RootExtension
import net.wequick.gradle.test.UnitTests
import net.wequick.gradle.util.AnsiUtils
import net.wequick.gradle.util.Log
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

class LintTask extends DefaultTask {

    @TaskAction
    def run() {
        UnitTests.runAllTests(project)
    }
}