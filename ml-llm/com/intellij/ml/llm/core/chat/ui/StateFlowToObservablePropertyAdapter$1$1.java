/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "T", "state", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*    */ final class null<T> implements FlowCollector {
/*    */   null(StateFlowToObservablePropertyAdapter<T> $receiver) {}
/*    */   
/*    */   @Nullable
/*    */   public final Object emit(Object state, @NotNull Continuation $completion) {
/* 18 */     if (this.$ctx != null) {
/* 19 */       if (BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 20 */                   StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state);
/* 21 */                   return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */             @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); }
/*    */             @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE;
/* 24 */     }  StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, state);
/*    */     
/* 26 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/StateFlowToObservablePropertyAdapter$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */