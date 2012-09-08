package org.gradle

import max.gradle.plugins.tomato.TomatoTask;

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class TomatoTaskTest {
    @Test
    public void canAddTaskToProject1() {
        Project project = ProjectBuilder.builder().build()
        def task = project.task('createTomato', type: TomatoTask)
//        assertTrue(task instanceof TomatoTask)
//		def launcher = GradleLauncher.newInstance("createTomato");
//		launcher.run()
		
		def startParameter = project.gradle.startParameter.newBuild()
		startParameter.projectDir = project.projectDir
//		if (args.buildScript) {
//		  startParameter.buildFile = new File(project.projectDir, args.buildScript)
//		}
		startParameter.taskNames = ['createTomato'] //tasks
		def launcher = GradleLauncher.newInstance(startParameter)
		def result = launcher.run()
		result.rethrowFailure()
    }
    @Test
    public void canAddTaskToProject2() {
    	Project project = ProjectBuilder.builder().build()
    			def task = project.task('safdasf', type: TomatoTask)
    			assertTrue(task instanceof TomatoTask)
    }
}
