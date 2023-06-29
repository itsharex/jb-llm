/*    */ package com.intellij.ml.llm.kotlin.inspections;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
/*    */ import org.jetbrains.kotlin.descriptors.DeclarationDescriptorWithSource;
/*    */ import org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde;
/*    */ import org.jetbrains.kotlin.psi.KtNamedDeclaration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "it", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptorWithSource;", "invoke"})
/*    */ final class KotlinDocGenerationInspection$checkDock$1
/*    */   extends Lambda
/*    */   implements Function1<DeclarationDescriptorWithSource, PsiElement>
/*    */ {
/*    */   KotlinDocGenerationInspection$checkDock$1(KtNamedDeclaration $element) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PsiElement invoke(@NotNull DeclarationDescriptorWithSource it) {
/* 46 */     Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(this.$element.getProject(), "element.project"); return DescriptorToSourceUtilsIde.INSTANCE.getAnyDeclaration(this.$element.getProject(), (DeclarationDescriptor)it);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/inspections/KotlinDocGenerationInspection$checkDock$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */