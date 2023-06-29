/*    */ package com.intellij.ml.llm.java.inspections;
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.ml.llm.dokuGuard.api.DokuUtilsKt;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ElementProjectSection;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ProjectSection;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import com.intellij.ml.llm.dokuGuard.api.languages.LanguageParameters;
/*    */ import com.intellij.ml.llm.java.JavaParameters;
/*    */ import com.intellij.psi.JavaElementVisitor;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiMethod;
/*    */ import com.intellij.psi.javadoc.PsiDocComment;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/java/inspections/JavaInappropriateDocumentationInspection$buildVisitor$1", "Lcom/intellij/psi/JavaElementVisitor;", "visitMethod", "", "method", "Lcom/intellij/psi/PsiMethod;", "intellij.ml.llm.java"})
/*    */ public final class JavaInappropriateDocumentationInspection$buildVisitor$1 extends JavaElementVisitor {
/*    */   public void visitMethod(@NotNull PsiMethod method) {
/*    */     PsiDocComment docComment;
/* 22 */     Intrinsics.checkNotNullParameter(method, "method"); if (method.getDocComment() == null) { method.getDocComment(); return; }
/* 23 */      JavaParameters javaParameters = new JavaParameters();
/* 24 */     ElementProjectSection projectSection = new ElementProjectSection((PsiElement)method, (LanguageParameters)javaParameters);
/* 25 */     CompletableFuture<ValidationDecision> validation = DokuUtilsKt.enqueueValidatorForSingleElement(new ValidationPreferences(true), (ProjectSection)projectSection);
/* 26 */     ValidationDecision validationDecision1 = validation.get(); ProblemsHolder problemsHolder = this.$holder; ValidationDecision validationDecision = validationDecision1; int $i$a$-let-JavaInappropriateDocumentationInspection$buildVisitor$1$visitMethod$1 = 0;
/* 27 */     if (validationDecision.getImportance() != null)
/* 28 */       problemsHolder.registerProblem(
/* 29 */           (PsiElement)docComment, "In method " + 
/* 30 */           method.getName() + ": " + validationDecision.comment(), new com.intellij.codeInspection.LocalQuickFix[0]); 
/*    */     (ValidationDecision)validation.get();
/*    */   }
/*    */   
/*    */   JavaInappropriateDocumentationInspection$buildVisitor$1(ProblemsHolder $holder) {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/inspections/JavaInappropriateDocumentationInspection$buildVisitor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */