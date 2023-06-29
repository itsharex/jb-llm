/*    */ package com.intellij.ml.llm.kotlin.context;
/*    */ 
/*    */ import com.intellij.ml.llm.context.VariableContext;
/*    */ import com.intellij.ml.llm.context.variablebuilder.VariableContextBuilder;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.kotlin.psi.KtParameter;
/*    */ import org.jetbrains.kotlin.psi.KtVariableDeclaration;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002J*\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\bH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/kotlin/context/KotlinVariableContextBuilder;", "Lcom/intellij/ml/llm/context/variablebuilder/VariableContextBuilder;", "()V", "getVariableContext", "Lcom/intellij/ml/llm/context/VariableContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeMethodContext", "", "includeClassContext", "gatherUsages", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nKotlinVariableContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinVariableContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinVariableContextBuilder\n+ 2 psiTreeUtil.kt\ncom/intellij/psi/util/PsiTreeUtilKt\n*L\n1#1,54:1\n57#2,2:55\n57#2,2:57\n*S KotlinDebug\n*F\n+ 1 KotlinVariableContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinVariableContextBuilder\n*L\n24#1:55,2\n40#1:57,2\n*E\n"})
/*    */ public final class KotlinVariableContextBuilder implements VariableContextBuilder {
/*    */   @Nullable
/*    */   public VariableContext getVariableContext(@NotNull PsiElement psiElement, boolean includeMethodContext, boolean includeClassContext, boolean gatherUsages) {
/* 19 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); PsiElement psiElement1 = psiElement;
/* 20 */     if (psiElement1 instanceof KtVariableDeclaration) {
/*    */       
/* 22 */       Intrinsics.checkNotNullExpressionValue(((KtVariableDeclaration)psiElement).getText(), "psiElement.text");
/*    */       
/* 24 */       PsiElement $this$parentOfType_u24default$iv = psiElement;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 55 */       boolean withSelf$iv = false; int $i$f$parentOfType = 0;
/*    */     } else if (psiElement1 instanceof KtParameter) {
/* 57 */       Intrinsics.checkNotNullExpressionValue(((KtParameter)psiElement).getText(), "psiElement.text"); PsiElement $this$parentOfType_u24default$iv = psiElement; boolean withSelf$iv = false; int $i$f$parentOfType = 0;
/*    */     } else {
/*    */     
/*    */     } 
/*    */     return null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/context/KotlinVariableContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */