/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ import com.intellij.psi.PsiFile;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\004¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/java/refactorings/MethodContextCollector;", "", "()V", "createContextPrompt", "", "method", "Lcom/intellij/psi/PsiMethod;", "methodNamePlaceholder", "intellij.ml.llm.java"})
/*    */ public final class MethodContextCollector {
/*    */   @NotNull
/*    */   public final String createContextPrompt(@NotNull PsiMethod method, @NotNull String methodNamePlaceholder) {
/*  8 */     Intrinsics.checkNotNullParameter(method, "method"); Intrinsics.checkNotNullParameter(methodNamePlaceholder, "methodNamePlaceholder"); if (method.getContainingClass() == null || method.getContainingClass().getName() == null) method.getContainingClass().getName();  String className = "C";
/*  9 */     PsiFile psiFile = method.getContainingFile(); ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement(); if (((((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null) != null && ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement() != null) ? ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement().getText() : null) == null) (((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null) != null && ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement() != null) ? ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement().getText() : null;  String packageStatement = "";
/* 10 */     Intrinsics.checkNotNull(method.copy(), "null cannot be cast to non-null type com.intellij.psi.PsiMethod"); PsiMethod methodCopy = (PsiMethod)method.copy();
/* 11 */     methodCopy.setName(methodNamePlaceholder);
/* 12 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 18 */       StringsKt.trimIndent("\n" + packageStatement + "\n\nclass " + className + " {\n    " + methodCopy.getText() + "\n}\n");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final MethodContextCollector INSTANCE = new MethodContextCollector();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/MethodContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */