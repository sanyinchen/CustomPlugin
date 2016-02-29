package com.tony.gradle

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

/**
 * Created by sanyinchen on 16/3/1.
 */
class PluginTest {
    @Test
    public void addTaskToProject(){
        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'com.tony.testplugin'

        println "hello------------------"+project.getTasks().getByName("demoTest").name;
    }
}
