package org.gradle

import max.gradle.plugins.tomato.TomatoTask;
import max.gradle.plugins.tomato.TomatoPlugin;
import org.junit.Test;
import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.gradle.api.internal.tasks.DefaultTaskContainer
import org.gradle.api.tasks.TaskAction;

import static org.junit.Assert.*;
import java.lang.reflect.Method;

class TomatoPluginTest {
    @Test
    public void tomatoPluginAddsCreateTaskToProject() {

        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'tomato'

        assertTrue(project.tasks.create  instanceof TomatoTask)
		def execute = project.tasks.create.execute()
    }

}
