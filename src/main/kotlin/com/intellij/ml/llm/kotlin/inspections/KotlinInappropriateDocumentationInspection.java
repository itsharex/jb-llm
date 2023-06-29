/*    */ package com.intellij.ml.llm.kotlin.inspections;
/*    */ 
/*    */ import com.intellij.codeInspection.LocalInspectionToolSession;
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import com.intellij.ml.llm.kotlin.KotlinParameters;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtNamedFunction;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/kotlin/inspections/KotlinInappropriateDocumentationInspection;", "Lorg/jetbrains/kotlin/idea/codeinsight/api/classic/inspections/AbstractKotlinInspection;", "()V", "buildVisitor", "Lorg/jetbrains/kotlin/psi/KtVisitorVoid;", "holder", "Lcom/intellij/codeInspection/ProblemsHolder;", "isOnTheFly", "", "session", "Lcom/intellij/codeInspection/LocalInspectionToolSession;", "intellij.ml.llm.kotlin"})
/*    */ public final class KotlinInappropriateDocumentationInspection extends AbstractKotlinInspection {
/*    */   @NotNull
/* 14 */   public KtVisitorVoid buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly, @NotNull LocalInspectionToolSession session) { Intrinsics.checkNotNullParameter(holder, "holder"); Intrinsics.checkNotNullParameter(session, "session"); return VisitorWrappersKt.namedFunctionVisitor(new KotlinInappropriateDocumentationInspection$buildVisitor$1(holder)); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<no name provided>", "", "function", "Lorg/jetbrains/kotlin/psi/KtNamedFunction;", "invoke"}) static final class KotlinInappropriateDocumentationInspection$buildVisitor$1 extends Lambda implements Function1<KtNamedFunction, Unit> { public final void invoke(@NotNull KtNamedFunction function) { KDoc docComment;
/* 15 */       Intrinsics.checkNotNullParameter(function, "function"); if (function.getDocComment() == null) { function.getDocComment(); return; }
/* 16 */        KotlinParameters kotlinParameters = new KotlinParameters();
/* 17 */       ElementProjectSection projectSection = new ElementProjectSection((PsiElement)function, (LanguageParameters)kotlinParameters);
/*    */ 
/*    */       
/* 20 */       ValidationDecision validationDecision1 = DokuUtilsKt.enqueueValidatorForSingleElement(new ValidationPreferences(true), (ProjectSection)projectSection).get(), validationDecision2 = validationDecision1;
/* 21 */       ProblemsHolder problemsHolder = this.$holder; ValidationDecision validationDecision = validationDecision2; int $i$a$-let-KotlinInappropriateDocumentationInspection$buildVisitor$1$1 = 0;
/* 22 */       if (validationDecision.getImportance() != null)
/* 23 */         problemsHolder.registerProblem(
/* 24 */             (PsiElement)docComment, "In method " + 
/* 25 */             function.getName() + ": " + validationDecision.comment(), new com.intellij.codeInspection.LocalQuickFix[0]);  }
/*    */ 
/*    */     
/*    */     KotlinInappropriateDocumentationInspection$buildVisitor$1(ProblemsHolder $holder) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/inspections/KotlinInappropriateDocumentationInspection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */