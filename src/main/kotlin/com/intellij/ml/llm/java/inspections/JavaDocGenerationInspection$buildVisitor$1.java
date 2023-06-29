/*    */ package com.intellij.ml.llm.java.inspections;
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import com.intellij.psi.PsiClass;
/*    */ import com.intellij.psi.PsiJavaDocumentedElement;
/*    */ import com.intellij.psi.PsiMethod;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026J\f\020\t\032\0020\n*\0020\005H\002J\f\020\013\032\0020\n*\0020\bH\002¨\006\f"}, d2 = {"com/intellij/ml/llm/java/inspections/JavaDocGenerationInspection$buildVisitor$1", "Lcom/intellij/psi/JavaElementVisitor;", "visitClass", "", "aClass", "Lcom/intellij/psi/PsiClass;", "visitMethod", "method", "Lcom/intellij/psi/PsiMethod;", "isPublicClass", "", "isPublicMethod", "intellij.ml.llm.java"})
/*    */ public final class JavaDocGenerationInspection$buildVisitor$1 extends JavaElementVisitor {
/*    */   private final boolean isPublicClass(PsiClass $this$isPublicClass) {
/* 13 */     if ($this$isPublicClass.getModifierList() == null) { $this$isPublicClass.getModifierList(); return false; }  $this$isPublicClass.getModifierList();
/* 14 */     Intrinsics.checkNotNull($this$isPublicClass.getModifierList()); return $this$isPublicClass.getModifierList().hasModifierProperty("public");
/*    */   } JavaDocGenerationInspection$buildVisitor$1(ProblemsHolder $holder) {}
/*    */   private final boolean isPublicMethod(PsiMethod $this$isPublicMethod) {
/* 17 */     return $this$isPublicMethod.getModifierList().hasModifierProperty("public");
/*    */   }
/*    */   public void visitClass(@NotNull PsiClass aClass) {
/* 20 */     Intrinsics.checkNotNullParameter(aClass, "aClass"); super.visitClass(aClass);
/* 21 */     if (aClass instanceof com.intellij.psi.PsiAnonymousClass || aClass instanceof com.intellij.psi.PsiSyntheticClass || aClass instanceof com.intellij.psi.PsiTypeParameter || !isPublicClass(aClass)) {
/*    */       return;
/*    */     }
/* 24 */     JavaDocGenerationInspection.access$checkJavaDoc(JavaDocGenerationInspection.this, (PsiJavaDocumentedElement)aClass, this.$holder, aClass.getNameIdentifier());
/*    */   }
/*    */   
/*    */   public void visitMethod(@NotNull PsiMethod method) {
/* 28 */     Intrinsics.checkNotNullParameter(method, "method"); super.visitMethod(method);
/* 29 */     if (method instanceof com.intellij.psi.SyntheticElement || !isPublicMethod(method)) {
/*    */       return;
/*    */     }
/* 32 */     JavaDocGenerationInspection.access$checkJavaDoc(JavaDocGenerationInspection.this, (PsiJavaDocumentedElement)method, this.$holder, method.getNameIdentifier());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/inspections/JavaDocGenerationInspection$buildVisitor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */