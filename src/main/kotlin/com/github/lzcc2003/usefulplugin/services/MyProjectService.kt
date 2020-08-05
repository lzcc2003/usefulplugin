package com.github.lzcc2003.usefulplugin.services

import com.intellij.openapi.project.Project
import com.github.lzcc2003.usefulplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
