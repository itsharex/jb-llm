/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\b\020\007\032\0020\bH\026J\020\020\t\032\0020\0042\006\020\005\032\0020\006H\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/CiConfigGenerationAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ public final class CiConfigGenerationAction extends DumbAwareAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Project project;
/* 10 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }
/* 11 */      CICDGenDialog dialog = new CICDGenDialog(project);
/* 12 */     dialog.showAndGet();
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/* 16 */     Intrinsics.checkNotNullParameter(e, "e"); e.getPresentation().setEnabledAndVisible(Registry.is("llm.is.internal"));
/*    */   } @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 19 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CiConfigGenerationAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */