/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.jetbrains.python.psi.PyClass;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class FunctionContextCollector$createContextPrompt$2 extends Lambda implements Function0<String> {
/*    */   @NotNull
/*    */   public final String invoke() {
/*    */     PyClass clazz;
/* 13 */     if (this.$function.getContainingClass() == null) { this.$function.getContainingClass(); Intrinsics.checkNotNullExpressionValue(this.$methodCopy.getText(), "methodCopy.text"); return this.$methodCopy.getText(); }
/* 14 */      if (clazz.getName() == null) clazz.getName();  String className = "C";
/* 15 */     PsiFile psiFile = clazz.getContainingFile(); if (((psiFile instanceof com.jetbrains.python.psi.PyFile) ? psiFile : null) == null || ((psiFile instanceof com.jetbrains.python.psi.PyFile) ? psiFile : null).getName() == null) ((psiFile instanceof com.jetbrains.python.psi.PyFile) ? psiFile : null).getName();  String module = "";
/* 16 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       StringsKt.trimIndent("\n# module: " + module + "\n\nclass " + className + ":\n  " + this.$methodCopy.getText() + "\n\n");
/*    */   }
/*    */   
/*    */   FunctionContextCollector$createContextPrompt$2(PyFunction $function, PyFunction $methodCopy) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/FunctionContextCollector$createContextPrompt$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */