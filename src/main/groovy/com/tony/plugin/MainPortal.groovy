package com.tony.plugin

import org.gradle.api.*

/**
 * Created by sanyinchen on 16/3/1.
 */
class MainPortal implements Plugin<Project> {
    @Override
    void apply(Project project) {
        People p = project.extensions.create('people', People);
        Assests assest = p.extensions.create('assest', Assests);
        project.task('demoTest') << {
            println "Hi. My name is " + p.name + ". I'm " + p.age + ' years old.' + " I have " + assest.assests;
        }
    }
}
