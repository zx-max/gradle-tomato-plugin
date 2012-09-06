package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TomatoTask extends DefaultTask {
    String greeting = 'hello from TomatoTask'

    @TaskAction
    def greet() {
        println greeting
    }
}
