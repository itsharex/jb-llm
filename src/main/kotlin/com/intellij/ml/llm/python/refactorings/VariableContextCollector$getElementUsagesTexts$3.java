/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNamedElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "context", "invoke"})
/*    */ final class VariableContextCollector$getElementUsagesTexts$3
/*    */   extends Lambda
/*    */   implements Function1<PsiElement, PsiElement>
/*    */ {
/*    */   VariableContextCollector$getElementUsagesTexts$3(PsiNamedElement $element, String $newVariableName) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PsiElement invoke(@NotNull PsiElement context) {
/* 66 */     Intrinsics.checkNotNullParameter(context, "context"); if (this.$element.getName() == null) this.$element.getName();  return VariableContextCollector.access$replaceReferenceExpressions((VariableContextCollector)context, (PsiElement)this.$element.getName(), "", this.$newVariableName);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/VariableContextCollector$getElementUsagesTexts$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */