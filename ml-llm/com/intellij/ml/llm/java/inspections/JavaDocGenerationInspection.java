/*    */ package com.intellij.ml.llm.java.inspections;
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.psi.PsiClass;
/*    */ import com.intellij.psi.PsiElement;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\"\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0062\b\020\016\032\004\030\0010\017H\002J(\020\020\032\0020\n2\006\020\005\032\0020\0062\006\020\016\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\002J,\020\026\032\0020\n2\006\020\013\032\0020\0212\006\020\005\032\0020\0062\006\020\027\032\0020\0232\n\b\002\020\016\032\004\030\0010\021H\002¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/java/inspections/JavaDocGenerationInspection;", "Lcom/intellij/codeInspection/LocalInspectionTool;", "()V", "buildVisitor", "Lcom/intellij/psi/PsiElementVisitor;", "holder", "Lcom/intellij/codeInspection/ProblemsHolder;", "isOnTheFly", "", "checkJavaDoc", "", "psiElement", "Lcom/intellij/psi/PsiJavaDocumentedElement;", "delegate", "toHighlight", "Lcom/intellij/psi/PsiIdentifier;", "problem", "Lcom/intellij/psi/PsiElement;", "message", "", "fix", "Lcom/intellij/codeInspection/LocalQuickFix;", "reportMissingJavadoc", "msg", "intellij.ml.llm.java"})
/*    */ public final class JavaDocGenerationInspection extends LocalInspectionTool {
/*    */   @NotNull
/*    */   public PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) {
/* 10 */     Intrinsics.checkNotNullParameter(holder, "holder"); return (PsiElementVisitor)new JavaDocGenerationInspection$buildVisitor$1(holder);
/*    */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026J\f\020\t\032\0020\n*\0020\005H\002J\f\020\013\032\0020\n*\0020\bH\002¨\006\f"}, d2 = {"com/intellij/ml/llm/java/inspections/JavaDocGenerationInspection$buildVisitor$1", "Lcom/intellij/psi/JavaElementVisitor;", "visitClass", "", "aClass", "Lcom/intellij/psi/PsiClass;", "visitMethod", "method", "Lcom/intellij/psi/PsiMethod;", "isPublicClass", "", "isPublicMethod", "intellij.ml.llm.java"})
/*    */   public static final class JavaDocGenerationInspection$buildVisitor$1 extends JavaElementVisitor { JavaDocGenerationInspection$buildVisitor$1(ProblemsHolder $holder) {} private final boolean isPublicClass(PsiClass $this$isPublicClass) {
/* 13 */       if ($this$isPublicClass.getModifierList() == null) { $this$isPublicClass.getModifierList(); return false; }  $this$isPublicClass.getModifierList();
/* 14 */       Intrinsics.checkNotNull($this$isPublicClass.getModifierList()); return $this$isPublicClass.getModifierList().hasModifierProperty("public");
/*    */     }
/*    */     private final boolean isPublicMethod(PsiMethod $this$isPublicMethod) {
/* 17 */       return $this$isPublicMethod.getModifierList().hasModifierProperty("public");
/*    */     }
/*    */     public void visitClass(@NotNull PsiClass aClass) {
/* 20 */       Intrinsics.checkNotNullParameter(aClass, "aClass"); super.visitClass(aClass);
/* 21 */       if (aClass instanceof com.intellij.psi.PsiAnonymousClass || aClass instanceof com.intellij.psi.PsiSyntheticClass || aClass instanceof com.intellij.psi.PsiTypeParameter || !isPublicClass(aClass)) {
/*    */         return;
/*    */       }
/* 24 */       JavaDocGenerationInspection.this.checkJavaDoc((PsiJavaDocumentedElement)aClass, this.$holder, aClass.getNameIdentifier());
/*    */     }
/*    */     
/*    */     public void visitMethod(@NotNull PsiMethod method) {
/* 28 */       Intrinsics.checkNotNullParameter(method, "method"); super.visitMethod(method);
/* 29 */       if (method instanceof com.intellij.psi.SyntheticElement || !isPublicMethod(method)) {
/*    */         return;
/*    */       }
/* 32 */       JavaDocGenerationInspection.this.checkJavaDoc((PsiJavaDocumentedElement)method, this.$holder, method.getNameIdentifier());
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void checkJavaDoc(PsiJavaDocumentedElement psiElement, ProblemsHolder delegate, PsiIdentifier toHighlight) {
/* 42 */     PsiDocComment docComment = psiElement.getDocComment();
/* 43 */     if (docComment == null) {
/* 44 */       Object[] arrayOfObject = new Object[1]; if (((toHighlight != null) ? toHighlight.getText() : null) == null) (toHighlight != null) ? toHighlight.getText() : null;  false[(toHighlight != null) ? toHighlight.getText() : null] = ""; String message = LLMBundle.message((String)arrayOfObject, arrayOfObject);
/* 45 */       reportMissingJavadoc((PsiElement)psiElement, delegate, message, (PsiElement)toHighlight);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void reportMissingJavadoc(PsiElement psiElement, ProblemsHolder holder, String msg, PsiElement toHighlight) {
/* 55 */     LocalQuickFix fix = IntentionWrapper.wrapToQuickFix((IntentionAction)new WriteDocumentationIntention(psiElement), holder.getFile());
/* 56 */     if (toHighlight == null); Intrinsics.checkNotNullExpressionValue(fix, "fix"); holder.problem((ProblemsHolder)toHighlight, psiElement, msg, fix);
/*    */   }
/*    */   
/*    */   private final void problem(ProblemsHolder holder, PsiElement toHighlight, String message, LocalQuickFix fix) {
/* 60 */     LocalQuickFix[] arrayOfLocalQuickFix = new LocalQuickFix[1]; arrayOfLocalQuickFix[0] = fix; holder.registerProblem(toHighlight, message, ProblemHighlightType.WEAK_WARNING, arrayOfLocalQuickFix);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/inspections/JavaDocGenerationInspection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */