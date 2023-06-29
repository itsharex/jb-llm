/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.kotlin.psi.KtClassOrObject;
/*    */ import org.jetbrains.kotlin.psi.KtDeclaration;
/*    */ import org.jetbrains.kotlin.psi.KtFunction;
/*    */ import org.jetbrains.kotlin.psi.psiUtil.KtPsiUtilKt;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class FunctionContextCollector$createContextPrompt$2 extends Lambda implements Function0<String> {
/*    */   @NotNull
/*    */   public final String invoke() {
/*    */     KtClassOrObject clazz;
/* 14 */     if (KtPsiUtilKt.getContainingClassOrObject((KtDeclaration)this.$function) == null) { KtPsiUtilKt.getContainingClassOrObject((KtDeclaration)this.$function); Intrinsics.checkNotNullExpressionValue(this.$methodCopy.getText(), "methodCopy.text"); return this.$methodCopy.getText(); }
/* 15 */      if (clazz.getName() == null) clazz.getName();  String className = "C";
/* 16 */     PsiFile psiFile = clazz.getContainingFile(); if (((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null) == null || ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName() == null) ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName();  Object packageStatement = "";
/* 17 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 23 */       StringsKt.trimIndent("\npackage " + packageStatement + "\n\nclass " + className + " {\n  " + this.$methodCopy.getText() + "\n}\n");
/*    */   }
/*    */   
/*    */   FunctionContextCollector$createContextPrompt$2(KtFunction $function, KtFunction $methodCopy) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */