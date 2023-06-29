/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "context", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */ final class VariableContextCollector$getElementUsagesTexts$4
/*    */   extends Lambda
/*    */   implements Function1<PsiElement, String>
/*    */ {
/*    */   VariableContextCollector$getElementUsagesTexts$4(String $newVariableName) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String invoke(@NotNull PsiElement context) {
/* 67 */     Intrinsics.checkNotNullParameter(context, "context"); return VariableContextCollector.access$createContextString(VariableContextCollector.INSTANCE, context, this.$newVariableName);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/VariableContextCollector$getElementUsagesTexts$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */