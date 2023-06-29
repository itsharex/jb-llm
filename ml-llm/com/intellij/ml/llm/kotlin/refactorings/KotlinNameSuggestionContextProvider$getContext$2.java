/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtClassOrObject;
/*    */ import org.jetbrains.kotlin.psi.KtConstructor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/kotlin/psi/KtClassOrObject;", "invoke"})
/*    */ final class KotlinNameSuggestionContextProvider$getContext$2
/*    */   extends Lambda
/*    */   implements Function0<KtClassOrObject>
/*    */ {
/*    */   KotlinNameSuggestionContextProvider$getContext$2(PsiElement $element) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KtClassOrObject invoke() {
/* 26 */     return ((KtConstructor)this.$element).getContainingClassOrObject();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */