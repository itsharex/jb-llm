/*    */ package com.intellij.ml.llm.core.chat.actions;
/*    */ 
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\b\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/AIAssistantOpenSettingsAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "intellij.ml.llm"})
/*    */ public final class AIAssistantOpenSettingsAction extends DumbAwareAction {
/*  8 */   public AIAssistantOpenSettingsAction() { super("Settings..."); } public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Project project;
/* 10 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }
/* 11 */      LLMConfigurableKt.openLlmSettingsDialog(project);
/*    */   } @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 14 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/AIAssistantOpenSettingsAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */