package max.gradle.plugins.tomato

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class TomatoTask extends DefaultTask {

	@TaskAction
	def b() {
		println 'b'
	}
	
	
	@TaskAction
	def z() {
		println 'z'
	}

	@TaskAction
	def c() {
		println 'c'
	}
	
}
