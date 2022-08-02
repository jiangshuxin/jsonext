package com.github.jiangshuxin.jsonext.services

import com.intellij.openapi.project.Project
import com.github.jiangshuxin.jsonext.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
