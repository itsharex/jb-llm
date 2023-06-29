/*    */ package com.intellij.ml.llm.core.chat.actions;
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\b\020\007\032\0020\bH\026J\020\020\t\032\0020\0042\006\020\005\032\0020\006H\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/AIAssistantShowChatAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ public final class AIAssistantShowChatAction extends DumbAwareAction {
/*    */   public AIAssistantShowChatAction() {
/* 11 */     super(LLMBundle.message("action.ai.assistant.text", new Object[0]));
/*    */   } public void actionPerformed(@NotNull AnActionEvent e) {
/* 13 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }  ToolWindow toolWindow = e.getProject().getInstance(e.getProject()).getToolWindow("AIAssistant");
/* 14 */     if (toolWindow == null)
/* 15 */       return;  toolWindow.show();
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/* 19 */     Intrinsics.checkNotNullParameter(e, "e"); if (Intrinsics.areEqual(e.getPlace(), "GoToAction"))
/* 20 */       e.getPresentation().setText(LLMBundle.message("action.go.to.ai.assistant.toolwindow.text", new Object[0])); 
/*    */   }
/*    */   @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 24 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/AIAssistantShowChatAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */