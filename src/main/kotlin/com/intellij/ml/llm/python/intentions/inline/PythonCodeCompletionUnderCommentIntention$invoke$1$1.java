/*    */ package com.intellij.ml.llm.python.intentions.inline;
/*    */ 
/*    */ import com.intellij.psi.PsiComment;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Ref;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class PythonCodeCompletionUnderCommentIntention$invoke$1$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 61 */     PsiElement parent = this.$comment.getParent();
/* 62 */     Intrinsics.checkNotNull(parent.addAfter((PsiElement)this.$endComment.element, (PsiElement)this.$comment), "null cannot be cast to non-null type com.intellij.psi.PsiComment"); this.$endComment.element = parent.addAfter((PsiElement)this.$endComment.element, (PsiElement)this.$comment);
/* 63 */     parent.addAfter(this.$whiteSpace, (PsiElement)this.$comment);
/*    */   }
/*    */   
/*    */   PythonCodeCompletionUnderCommentIntention$invoke$1$1(PsiComment $comment, Ref.ObjectRef<PsiComment> $endComment, PsiElement $whiteSpace) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$invoke$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */