/*    */ package com.intellij.ml.llm.python.intentions.inline;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.NavigatablePsiElement;
/*    */ import com.intellij.psi.PsiComment;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$invoke$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.python"})
/*    */ public final class PythonCodeCompletionUnderCommentIntention$invoke$task$1
/*    */   extends Task.Backgroundable
/*    */ {
/*    */   PythonCodeCompletionUnderCommentIntention$invoke$task$1(String $scopeOwnerText, PythonCodeCompletionUnderCommentIntention $receiver, Editor $editor, NavigatablePsiElement $scopeOwner, Ref.ObjectRef<PsiComment> $endComment, String $startCommentText, String $endCommentText, String $super_call_param$1) {
/* 70 */     super($project, $super_call_param$1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void run(@NotNull ProgressIndicator indicator) {
/* 78 */     Intrinsics.checkNotNullParameter(indicator, "indicator");
/*    */     
/* 80 */     String instruction = StringsKt.trimIndent("\nComplete code strictly between TODO comment and the end of completion comment\nYou MUST NOT add code not between this comments and MUST NOT change comments text\n\n```\n" + this.$scopeOwnerText + "\n```\n          ");
/*    */     
/* 82 */     Intrinsics.checkNotNullExpressionValue(this.$startCommentText, "startCommentText"); Intrinsics.checkNotNullExpressionValue(this.$endCommentText, "endCommentText"); PythonCodeCompletionUnderCommentIntention.access$startStreamingCompletion(PythonCodeCompletionUnderCommentIntention.this, instruction, this.$project, this.$editor, (PsiElement)this.$scopeOwner, (PsiComment)this.$endComment.element, this.$startCommentText, this.$endCommentText);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$invoke$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */