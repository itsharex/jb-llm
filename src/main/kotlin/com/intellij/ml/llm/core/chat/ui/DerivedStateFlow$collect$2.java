/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "DerivedStateFlow.kt", l = {21, 21}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.DerivedStateFlow$collect$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\001\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class DerivedStateFlow$collect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     CoroutineScope $this$coroutineScope;
/* 21 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0; this.label = 1; if (FlowKt.stateIn(FlowKt.distinctUntilChanged(DerivedStateFlow.access$getFlow$p(DerivedStateFlow.this)), $this$coroutineScope, (Continuation)this) == object) return object;  this.label = 2; if (((StateFlow)FlowKt.stateIn(FlowKt.distinctUntilChanged(DerivedStateFlow.access$getFlow$p(DerivedStateFlow.this)), $this$coroutineScope, (Continuation)this)).collect(this.$collector, (Continuation)this) == object) return object;  ((StateFlow)FlowKt.stateIn(FlowKt.distinctUntilChanged(DerivedStateFlow.access$getFlow$p(DerivedStateFlow.this)), $this$coroutineScope, (Continuation)this)).collect(this.$collector, (Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((StateFlow)SYNTHETIC_LOCAL_VARIABLE_1).collect(this.$collector, (Continuation)this) == object) return object;  ((StateFlow)SYNTHETIC_LOCAL_VARIABLE_1).collect(this.$collector, (Continuation)this); throw new KotlinNothingValueException();case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   DerivedStateFlow$collect$2(FlowCollector<T> $collector, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super DerivedStateFlow$collect$2> $completion) {
/*    */     DerivedStateFlow$collect$2 derivedStateFlow$collect$2 = new DerivedStateFlow$collect$2(this.$collector, $completion);
/*    */     derivedStateFlow$collect$2.L$0 = value;
/*    */     return (Continuation<Unit>)derivedStateFlow$collect$2;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((DerivedStateFlow$collect$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlow$collect$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */