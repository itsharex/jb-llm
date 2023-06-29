/*    */ package com.intellij.ml.llm.core.chat.services;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "responsePart", "", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*    */ final class AIRequestService$generateDialogTitle$2<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   @Nullable
/*    */   public final Object emit(@NotNull String responsePart, @NotNull Continuation $completion) {
/* 43 */     if (this.$consumer.invoke(responsePart, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$consumer.invoke(responsePart, $completion);  this.$consumer.invoke(responsePart, $completion); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   AIRequestService$generateDialogTitle$2(Function2<String, Continuation<? super Unit>, Object> $consumer) {}
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */