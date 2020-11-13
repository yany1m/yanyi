package com.github.yany1m.yanyi.services

import com.intellij.openapi.project.Project
import com.github.yany1m.yanyi.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
