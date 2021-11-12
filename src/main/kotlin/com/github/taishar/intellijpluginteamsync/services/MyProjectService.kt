package com.github.taishar.intellijpluginteamsync.services

import com.intellij.openapi.project.Project
import com.github.taishar.intellijpluginteamsync.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
