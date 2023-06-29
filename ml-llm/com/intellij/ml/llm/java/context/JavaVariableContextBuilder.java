/*    */ package com.intellij.ml.llm.java.context;
/*    */ import com.intellij.ml.llm.context.variablebuilder.VariableContextBuilder;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiVariable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002J*\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\bH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/java/context/JavaVariableContextBuilder;", "Lcom/intellij/ml/llm/context/variablebuilder/VariableContextBuilder;", "()V", "getVariableContext", "Lcom/intellij/ml/llm/context/VariableContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeMethodContext", "", "includeClassContext", "gatherUsages", "intellij.ml.llm.java"})
/*    */ public final class JavaVariableContextBuilder implements VariableContextBuilder {
/*    */   @Nullable
/*    */   public VariableContext getVariableContext(@NotNull PsiElement psiElement, boolean includeMethodContext, boolean includeClassContext, boolean gatherUsages) {
/* 14 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof PsiVariable) {
/*    */ 
/*    */       
/* 17 */       Intrinsics.checkNotNullExpressionValue(((PsiVariable)psiElement).getText(), "psiElement.text");
/*    */     } else {
/*    */     
/*    */     } 
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
/* 31 */     return null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/context/JavaVariableContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */