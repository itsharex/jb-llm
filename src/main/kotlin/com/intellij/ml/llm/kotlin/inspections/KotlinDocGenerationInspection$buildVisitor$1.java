/*    */ package com.intellij.ml.llm.kotlin.inspections;
/*    */ 
/*    */ import com.intellij.codeInspection.ProblemsHolder;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtClassOrObject;
/*    */ import org.jetbrains.kotlin.psi.KtNamedDeclaration;
/*    */ import org.jetbrains.kotlin.psi.KtNamedFunction;
/*    */ import org.jetbrains.kotlin.psi.KtVisitorVoid;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection$buildVisitor$1", "Lorg/jetbrains/kotlin/psi/KtVisitorVoid;", "visitClassOrObject", "", "classOrObject", "Lorg/jetbrains/kotlin/psi/KtClassOrObject;", "visitNamedFunction", "function", "Lorg/jetbrains/kotlin/psi/KtNamedFunction;", "intellij.ml.llm.kotlin"})
/*    */ public final class KotlinDocGenerationInspection$buildVisitor$1
/*    */   extends KtVisitorVoid
/*    */ {
/*    */   KotlinDocGenerationInspection$buildVisitor$1(ProblemsHolder $holder) {}
/*    */   
/*    */   public void visitNamedFunction(@NotNull KtNamedFunction function) {
/* 27 */     Intrinsics.checkNotNullParameter(function, "function"); super.visitNamedFunction(function);
/* 28 */     KotlinDocGenerationInspection.access$checkDock(KotlinDocGenerationInspection.this, (KtNamedDeclaration)function, this.$holder);
/*    */   }
/*    */   
/*    */   public void visitClassOrObject(@NotNull KtClassOrObject classOrObject) {
/* 32 */     Intrinsics.checkNotNullParameter(classOrObject, "classOrObject"); super.visitClassOrObject(classOrObject);
/* 33 */     KotlinDocGenerationInspection.access$checkDock(KotlinDocGenerationInspection.this, (KtNamedDeclaration)classOrObject, this.$holder);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection$buildVisitor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */