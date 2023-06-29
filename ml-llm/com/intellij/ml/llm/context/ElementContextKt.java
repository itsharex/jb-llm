/*    */ package com.intellij.ml.llm.context;
/*    */ 
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.psi.PsiDocumentManager;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\b\n\002\030\002\n\002\b\006\n\002\020\013\n\000\032\026\020\007\032\0020\001*\0020\0022\b\b\002\020\b\032\0020\tH\002\"\030\020\000\032\0020\001*\0020\0028BX\004¢\006\006\032\004\b\003\020\004\"\030\020\005\032\0020\001*\0020\0028BX\004¢\006\006\032\004\b\006\020\004¨\006\n"}, d2 = {"endOffset", "", "Lcom/intellij/psi/PsiElement;", "getEndOffset", "(Lcom/intellij/psi/PsiElement;)I", "startOffset", "getStartOffset", "getLineNumber", "start", "", "intellij.ml.llm"})
/*    */ public final class ElementContextKt
/*    */ {
/*    */   private static final int getLineNumber(PsiElement $this$getLineNumber, boolean start) {
/* 49 */     if ($this$getLineNumber.getContainingFile().getViewProvider().getDocument() == null) $this$getLineNumber.getContainingFile().getViewProvider().getDocument();  Document document = PsiDocumentManager.getInstance($this$getLineNumber.getProject()).getDocument($this$getLineNumber.getContainingFile());
/* 50 */     int index = start ? getStartOffset($this$getLineNumber) : getEndOffset($this$getLineNumber);
/* 51 */     if (index > ((document != null) ? document.getTextLength() : 0)) return 0; 
/* 52 */     return (document != null) ? document.getLineNumber(index) : 0;
/*    */   }
/*    */   
/*    */   private static final int getStartOffset(PsiElement $this$startOffset) {
/* 56 */     return $this$startOffset.getTextRange().getStartOffset();
/*    */   }
/*    */   private static final int getEndOffset(PsiElement $this$endOffset) {
/* 59 */     return $this$endOffset.getTextRange().getEndOffset();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/ElementContextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */