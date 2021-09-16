package com.github.sergioppires.asnifferpluginintegration.services

import com.intellij.openapi.project.Project
import com.github.sergioppires.asnifferpluginintegration.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
