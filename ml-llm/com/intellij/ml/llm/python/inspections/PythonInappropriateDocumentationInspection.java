/*    */ package com.intellij.ml.llm.python.inspections;
/*    */ import com.intellij.codeInspection.LocalInspectionToolSession;
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ElementProjectSection;
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import com.intellij.ml.llm.python.PythonParameters;
/*    */ import com.jetbrains.python.inspections.PyInspectionVisitor;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import com.jetbrains.python.psi.types.TypeEvalContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001:\001\013B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/python/inspections/PythonInappropriateDocumentationInspection;", "Lcom/jetbrains/python/inspections/PyInspection;", "()V", "buildVisitor", "Lcom/intellij/psi/PsiElementVisitor;", "holder", "Lcom/intellij/codeInspection/ProblemsHolder;", "isOnTheFly", "", "session", "Lcom/intellij/codeInspection/LocalInspectionToolSession;", "Visitor", "intellij.ml.llm.python"})
/*    */ public final class PythonInappropriateDocumentationInspection extends PyInspection {
/*    */   @NotNull
/*    */   public PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly, @NotNull LocalInspectionToolSession session) {
/* 17 */     Intrinsics.checkNotNullParameter(holder, "holder"); Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullExpressionValue(PyInspectionVisitor.getContext(session), "getContext(session)"); return (PsiElementVisitor)new Visitor(holder, PyInspectionVisitor.getContext(session));
/*    */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/python/inspections/PythonInappropriateDocumentationInspection$Visitor;", "Lcom/jetbrains/python/inspections/PyInspectionVisitor;", "holder", "Lcom/intellij/codeInspection/ProblemsHolder;", "context", "Lcom/jetbrains/python/psi/types/TypeEvalContext;", "(Lcom/intellij/codeInspection/ProblemsHolder;Lcom/jetbrains/python/psi/types/TypeEvalContext;)V", "visitPyFunction", "", "node", "Lcom/jetbrains/python/psi/PyFunction;", "intellij.ml.llm.python"})
/*    */   private static final class Visitor extends PyInspectionVisitor {
/* 20 */     public Visitor(@NotNull ProblemsHolder holder, @NotNull TypeEvalContext context) { super(holder, context); } public void visitPyFunction(@NotNull PyFunction node) {
/*    */       PyStringLiteralExpression docString;
/* 22 */       Intrinsics.checkNotNullParameter(node, "node"); if (node.getDocStringExpression() == null) { node.getDocStringExpression(); return; }
/* 23 */        PythonParameters pythonParameters = new PythonParameters();
/* 24 */       ElementProjectSection projectSection = new ElementProjectSection((PsiElement)node, (LanguageParameters)pythonParameters);
/*    */ 
/*    */       
/* 27 */       ValidationDecision validationDecision1 = DokuUtilsKt.enqueueValidatorForSingleElement(new ValidationPreferences(true), (ProjectSection)projectSection).get();
/* 28 */       ValidationDecision validationDecision = validationDecision1; int $i$a$-let-PythonInappropriateDocumentationInspection$Visitor$visitPyFunction$1 = 0;
/* 29 */       if (validationDecision.getImportance() != null) {
/* 30 */         Intrinsics.checkNotNull(getHolder()); getHolder().registerProblem(
/* 31 */             (PsiElement)docString, "In method " + 
/* 32 */             node.getName() + ": " + validationDecision.comment(), new com.intellij.codeInspection.LocalQuickFix[0]);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/inspections/PythonInappropriateDocumentationInspection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */