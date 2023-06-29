/*    */ package com.intellij.ml.llm.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"})
/*    */ final class LlmNameProviderKt$suggestNames$textOffset$1
/*    */   extends Lambda
/*    */   implements Function0<Integer>
/*    */ {
/*    */   LlmNameProviderKt$suggestNames$textOffset$1(PsiElement $element) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Integer invoke() {
/* 43 */     return Integer.valueOf(this.$element.getTextOffset());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$textOffset$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */