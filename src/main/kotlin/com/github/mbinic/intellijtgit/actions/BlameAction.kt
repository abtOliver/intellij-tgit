package com.github.mbinic.intellijtgit.actions

import com.github.mbinic.intellijtgit.Helpers.Context
import com.github.mbinic.intellijtgit.TGit
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

public class BlameAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        var line = Context.getCurrentLine(e) ?: 1
        TGit.command(e, "blame", true, filePathRequired = true, additionalParams = "/line:${line}")
    }
}
