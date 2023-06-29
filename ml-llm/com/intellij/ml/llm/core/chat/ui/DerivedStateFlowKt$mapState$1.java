/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\005\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "R", "T1", "invoke", "()Ljava/lang/Object;"})
/*    */ final class DerivedStateFlowKt$mapState$1
/*    */   extends Lambda
/*    */   implements Function0<R>
/*    */ {
/*    */   DerivedStateFlowKt$mapState$1(Function1<T1, R> $transform, StateFlow<T1> $receiver) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final R invoke() {
/* 27 */     return (R)this.$transform.invoke(this.$this_mapState.getValue());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlowKt$mapState$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */