/*    */ package com.intellij.ml.llm.inspections;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMSuggestGenerationPresentation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "state1", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "state2", "invoke"})
/*    */ final class EnterEmptyDocumentationHandler$preprocessEnter$2$1$1
/*    */   extends Lambda
/*    */   implements Function2<LLMSuggestGenerationPresentation.State, LLMSuggestGenerationPresentation.State, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull LLMSuggestGenerationPresentation.State state1, @NotNull LLMSuggestGenerationPresentation.State state2) {
/* 98 */     Intrinsics.checkNotNullParameter(state1, "state1"); Intrinsics.checkNotNullParameter(state2, "state2"); this.$uiStateFlow.setValue(state2);
/*    */   }
/*    */   
/*    */   EnterEmptyDocumentationHandler$preprocessEnter$2$1$1(MutableStateFlow<LLMSuggestGenerationPresentation.State> $uiStateFlow) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler$preprocessEnter$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */