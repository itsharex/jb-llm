/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @DebugMetadata(f = "StateFlowToObservablePropertyAdapter.kt", l = {17}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.StateFlowToObservablePropertyAdapter$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   null(CoroutineContext $ctx, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 16 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 17 */         this.label = 1; if (StateFlowToObservablePropertyAdapter.access$getStateFlow$p(StateFlowToObservablePropertyAdapter.this).collect(new FlowCollector(StateFlowToObservablePropertyAdapter.this) { @Nullable
/* 18 */               public final Object emit(Object state, @NotNull Continuation $completion) { if (this.$ctx != null) {
/* 19 */                   if (BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 20 */                               StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state);
/* 21 */                               return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */                         @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); }
/*    */                         @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE;
/* 24 */                 }  StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, state);
/*    */                 
/* 26 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  StateFlowToObservablePropertyAdapter.access$getStateFlow$p(StateFlowToObservablePropertyAdapter.this).collect(new FlowCollector(StateFlowToObservablePropertyAdapter.this) { @Nullable public final Object emit(Object state, @NotNull Continuation $completion) { if (this.$ctx != null) { if (BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE; }  StateFlowToObservablePropertyAdapter.access$fireChangeEvent(StateFlowToObservablePropertyAdapter.this, state); return Unit.INSTANCE; }
/*    */                }
/*    */             (Continuation)this);
/*    */         throw new KotlinNothingValueException();
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         throw new KotlinNothingValueException(); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(StateFlowToObservablePropertyAdapter.this, this.$ctx, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/StateFlowToObservablePropertyAdapter$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */