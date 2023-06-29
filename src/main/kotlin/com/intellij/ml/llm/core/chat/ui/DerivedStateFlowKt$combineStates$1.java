/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.coroutines.flow.StateFlow;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\006\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\001H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "R", "T1", "T2", "invoke", "()Ljava/lang/Object;"})
/*    */ final class DerivedStateFlowKt$combineStates$1
/*    */   extends Lambda
/*    */   implements Function0<R>
/*    */ {
/*    */   DerivedStateFlowKt$combineStates$1(Function2<T1, T2, R> $transform, StateFlow<T1> $flow, StateFlow<T2> $flow2) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final R invoke() {
/* 34 */     return (R)this.$transform.invoke(this.$flow.getValue(), this.$flow2.getValue());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlowKt$combineStates$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */