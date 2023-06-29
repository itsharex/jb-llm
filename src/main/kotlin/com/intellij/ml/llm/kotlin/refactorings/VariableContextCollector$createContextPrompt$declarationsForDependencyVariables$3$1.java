/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtValVarKeywordOwner;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3$1(String $text, KtValVarKeywordOwner $variable) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String invoke() {
/* 42 */     Intrinsics.checkNotNull(this.$text); return VariableContextCollector.access$addVarIfNeeded(VariableContextCollector.INSTANCE, this.$text, this.$variable);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */