/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiReferenceExpression;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */ final class JavaNameSuggestionContextProvider$isNameAlreadyUsed$resolvedElement$1
/*    */   extends Lambda
/*    */   implements Function0<PsiElement>
/*    */ {
/*    */   JavaNameSuggestionContextProvider$isNameAlreadyUsed$resolvedElement$1(PsiElement $element) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PsiElement invoke() {
/* 27 */     ((PsiReferenceExpression)this.$element).resolve(); return (((PsiReferenceExpression)this.$element).resolve() != null) ? ((PsiReferenceExpression)this.$element).resolve().getNavigationElement() : null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$resolvedElement$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */