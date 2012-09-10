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
/*
 Explain the order of execution of the actions in a single task.
 
org.gradle.api.internal.project.taskfactory.AnnotationProcessingTaskFactory.createTask(ProjectInternal project, Map<String, ?> args){
...
        for (Action<Task> action : actions) {
            task.doFirst(action);
...
		
			
org.gradle.api.internal.AbstractTask {
...
private List<Action<? super Task>> actions = new ArrayList<Action<? super Task>>();			
..
public Task doFirst(Closure action) {
...
 actions.add(0, wrap(action));
... 	
 */
	
    @Test
    public void tomatoPluginAddsCreateTaskToProject() {
		Method[] methods = TomatoTask.class.getDeclaredMethods();
		println methods.collect {it.name}
		for (m in methods){
			if( m.getAnnotation(TaskAction.class) != null)
			println m.name
		}
		
        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'tomato'

        assertTrue(project.tasks.create  instanceof TomatoTask)
		def execute = project.tasks.create.execute()
    }

}
