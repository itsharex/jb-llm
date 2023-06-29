/*    */ package com.intellij.ml.llm.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\020\000\032\016\030\0010\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "invoke"})
/*    */ final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$originalName$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$originalName$1(PsiElement $targetElement) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String invoke() {
/* 67 */     PsiElement psiElement = this.$targetElement; (psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null; return (((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null) != null) ? ((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null).getName() : null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$originalName$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */