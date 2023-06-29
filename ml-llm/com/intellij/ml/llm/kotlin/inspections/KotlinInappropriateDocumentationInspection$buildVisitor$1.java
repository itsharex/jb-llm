/*    */ package com.intellij.ml.llm.kotlin.inspections;
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ElementProjectSection;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import com.intellij.ml.llm.kotlin.KotlinParameters;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.kotlin.kdoc.psi.api.KDoc;
/*    */ import org.jetbrains.kotlin.psi.KtNamedFunction;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<no name provided>", "", "function", "Lorg/jetbrains/kotlin/psi/KtNamedFunction;", "invoke"})
/*    */ final class KotlinInappropriateDocumentationInspection$buildVisitor$1 extends Lambda implements Function1<KtNamedFunction, Unit> {
/*    */   public final void invoke(@NotNull KtNamedFunction function) {
/*    */     KDoc docComment;
/* 15 */     Intrinsics.checkNotNullParameter(function, "function"); if (function.getDocComment() == null) { function.getDocComment(); return; }
/* 16 */      KotlinParameters kotlinParameters = new KotlinParameters();
/* 17 */     ElementProjectSection projectSection = new ElementProjectSection((PsiElement)function, (LanguageParameters)kotlinParameters);
/*    */ 
/*    */     
/* 20 */     ValidationDecision validationDecision1 = DokuUtilsKt.enqueueValidatorForSingleElement(new ValidationPreferences(true), (ProjectSection)projectSection).get(), validationDecision2 = validationDecision1;
/* 21 */     ProblemsHolder problemsHolder = this.$holder; ValidationDecision validationDecision = validationDecision2; int $i$a$-let-KotlinInappropriateDocumentationInspection$buildVisitor$1$1 = 0;
/* 22 */     if (validationDecision.getImportance() != null)
/* 23 */       problemsHolder.registerProblem(
/* 24 */           (PsiElement)docComment, "In method " + 
/* 25 */           function.getName() + ": " + validationDecision.comment(), new com.intellij.codeInspection.LocalQuickFix[0]); 
/*    */   }
/*    */   
/*    */   KotlinInappropriateDocumentationInspection$buildVisitor$1(ProblemsHolder $holder) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/inspections/KotlinInappropriateDocumentationInspection$buildVisitor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */