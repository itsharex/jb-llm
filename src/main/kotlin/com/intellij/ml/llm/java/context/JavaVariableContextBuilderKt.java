/*    */ package com.intellij.ml.llm.java.context;
/*    */ 
/*    */ import com.intellij.psi.PsiClass;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiMember;
/*    */ import com.intellij.psi.PsiMethod;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\016\020\000\032\004\030\0010\001*\0020\002H\002\032\016\020\003\032\004\030\0010\004*\0020\002H\002¨\006\005"}, d2 = {"getContainingClass", "Lcom/intellij/psi/PsiClass;", "Lcom/intellij/psi/PsiElement;", "getContainingMethod", "Lcom/intellij/psi/PsiMethod;", "intellij.ml.llm.java"})
/*    */ public final class JavaVariableContextBuilderKt
/*    */ {
/*    */   private static final PsiMethod getContainingMethod(PsiElement $this$getContainingMethod) {
/* 36 */     PsiElement context = $this$getContainingMethod.getContext();
/* 37 */     while (context != null) {
/* 38 */       PsiElement _context = context;
/* 39 */       if (_context instanceof PsiMethod) return (PsiMethod)_context; 
/* 40 */       context = _context.getContext();
/*    */     } 
/* 42 */     return null;
/*    */   }
/*    */   
/*    */   private static final PsiClass getContainingClass(PsiElement $this$getContainingClass) {
/* 46 */     PsiElement context = $this$getContainingClass.getContext();
/* 47 */     while (context != null) {
/* 48 */       PsiElement _context = context;
/* 49 */       if (_context instanceof PsiClass) return (PsiClass)_context; 
/* 50 */       if (_context instanceof PsiMember) return ((PsiMember)_context).getContainingClass(); 
/* 51 */       context = _context.getContext();
/*    */     } 
/* 53 */     return null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/context/JavaVariableContextBuilderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */