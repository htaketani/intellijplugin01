package com.github.htaketani.intellijplugin01.services

import com.intellij.openapi.project.Project
import com.github.htaketani.intellijplugin01.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
