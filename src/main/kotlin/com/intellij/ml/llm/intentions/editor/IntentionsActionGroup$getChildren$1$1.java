/*    */ package com.intellij.ml.llm.intentions.editor;
/*    */ 
/*    */ import com.intellij.codeInsight.intention.IntentionAction;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "kotlin.jvm.PlatformType", "invoke"})
/*    */ final class IntentionsActionGroup$getChildren$1$1
/*    */   extends Lambda
/*    */   implements Function1<AnActionEvent, Unit>
/*    */ {
/*    */   public final void invoke(AnActionEvent it) {
/* 22 */     this.$intentionAction.invoke(this.$project, this.$editor, this.$file);
/*    */   }
/*    */   
/*    */   IntentionsActionGroup$getChildren$1$1(IntentionAction $intentionAction, Project $project, Editor $editor, PsiFile $file) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/IntentionsActionGroup$getChildren$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */