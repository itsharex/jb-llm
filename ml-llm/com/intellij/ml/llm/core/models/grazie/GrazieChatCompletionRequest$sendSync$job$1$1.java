/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   @Nullable
/*    */   public final Object emit(@NotNull String it, @NotNull Continuation $completion) {
/* 37 */     GrazieChatCompletionRequest.this.getConsumer().run(new LLMResponseChoice(it));
/* 38 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$job$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */