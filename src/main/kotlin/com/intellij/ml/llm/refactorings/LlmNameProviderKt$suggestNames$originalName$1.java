/*    */ package com.intellij.ml.llm.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\020\000\032\036 \004*\016\030\0010\001¢\006\002\b\002¢\006\002\b\0030\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "kotlin.jvm.PlatformType", "invoke"})
/*    */ final class LlmNameProviderKt$suggestNames$originalName$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   LlmNameProviderKt$suggestNames$originalName$1(PsiElement $element) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final String invoke() {
/* 41 */     PsiElement psiElement = this.$element; if (((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null) == null || ((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null).getName() == null) ((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null).getName();  return this.$element.getText();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$originalName$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */