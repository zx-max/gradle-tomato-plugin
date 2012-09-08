package max.gradle.plugins.tomato

import org.gradle.api.Project
import org.gradle.api.Plugin

class TomatoPlugin implements Plugin<Project> {
	
	public static final String CREATE_TOMATO = 'create';
	
    void apply(Project project) {
        project.task(CREATE_TOMATO, type: TomatoTask)
    }
}
