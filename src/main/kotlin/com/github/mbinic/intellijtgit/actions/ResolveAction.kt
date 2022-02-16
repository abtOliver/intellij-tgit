package com.github.mbinic.intellijtgit.actions

import com.github.mbinic.intellijtgit.TGit
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

public class ResolveAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        TGit.command(e, "resolve", true)
    }
}
