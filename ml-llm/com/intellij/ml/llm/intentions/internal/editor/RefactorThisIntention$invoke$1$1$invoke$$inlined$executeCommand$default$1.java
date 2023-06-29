/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\n¢\006\002\b\002¨\006\003"}, d2 = {"<anonymous>", "", "run", "com/intellij/openapi/command/ActionsKt$executeCommand$1"})
/*    */ @SourceDebugExtension({"SMAP\nactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 actions.kt\ncom/intellij/openapi/command/ActionsKt$executeCommand$1\n+ 2 RefactorThisIntention.kt\ncom/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$1\n*L\n1#1,13:1\n73#2,4:14\n*E\n"})
/*    */ public final class RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1 implements Runnable {
/*    */   public final void run() {
/* 11 */     int $i$a$-executeCommand$default-RefactorThisIntention$invoke$1$1$1 = 0;
/*    */ 
/*    */     
/* 14 */     this.$document$inlined.replaceString(((TextRange)this.$textRange$inlined.element).getStartOffset(), ((TextRange)this.$textRange$inlined.element).getEndOffset(), this.$result$inlined);
/* 15 */     PsiDocumentManager.getInstance(this.$project$inlined).commitDocument(this.$document$inlined);
/* 16 */     CodeStyleManager.getInstance(this.$project$inlined).reformatRange((PsiElement)this.$file$inlined, ((TextRange)this.$textRange$inlined.element).getStartOffset(), ((TextRange)this.$textRange$inlined.element).getStartOffset() + this.$result$inlined.length());
/*    */   }
/*    */   
/*    */   public RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1(Document paramDocument, Ref.ObjectRef paramObjectRef, String paramString, Project paramProject, PsiFile paramPsiFile) {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$invoke$1$1$invoke$$inlined$executeCommand$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */