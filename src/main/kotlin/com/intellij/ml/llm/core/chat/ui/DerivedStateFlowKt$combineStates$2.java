/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "DerivedStateFlow.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.DerivedStateFlowKt$combineStates$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\006\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\0012\006\020\004\032\002H\0022\006\020\005\032\002H\003H@"}, d2 = {"<anonymous>", "R", "T1", "T2", "a", "b"})
/*    */ final class DerivedStateFlowKt$combineStates$2
/*    */   extends SuspendLambda
/*    */   implements Function3<T1, T2, Continuation<? super R>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   DerivedStateFlowKt$combineStates$2(Function2<T1, T2, R> $transform, Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     Object a, b;
/* 35 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); a = this.L$0; b = this.L$1; return this.$transform.invoke(a, b); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(Object p1, Object p2, @Nullable Continuation<? super DerivedStateFlowKt$combineStates$2> p3) {
/*    */     DerivedStateFlowKt$combineStates$2 derivedStateFlowKt$combineStates$2 = new DerivedStateFlowKt$combineStates$2(this.$transform, p3);
/*    */     derivedStateFlowKt$combineStates$2.L$0 = p1;
/*    */     derivedStateFlowKt$combineStates$2.L$1 = p2;
/*    */     return derivedStateFlowKt$combineStates$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlowKt$combineStates$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */