/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B%\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006\022\f\020\007\032\b\022\004\022\0028\0000\b¢\006\002\020\tJ\r\020\n\032\0028\000H\026¢\006\002\020\013R\024\020\007\032\b\022\004\022\0028\0000\bX\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/StateFlowToObservablePropertyAdapter;", "T", "Lcom/intellij/openapi/observable/properties/AbstractObservableProperty;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ctx", "Lkotlin/coroutines/CoroutineContext;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/StateFlow;)V", "get", "()Ljava/lang/Object;", "intellij.ml.llm"})
/*    */ final class StateFlowToObservablePropertyAdapter<T> extends AbstractObservableProperty<T> {
/*    */   @NotNull
/*    */   private final StateFlow<T> stateFlow;
/*    */   
/*    */   public StateFlowToObservablePropertyAdapter(@NotNull CoroutineScope scope, @Nullable CoroutineContext ctx, @NotNull StateFlow<T> stateFlow) {
/* 12 */     this.stateFlow = stateFlow;
/*    */ 
/*    */ 
/*    */     
/* 16 */     BuildersKt.launch$default(scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(ctx, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 17 */                 this.label = 1; if (StateFlowToObservablePropertyAdapter.this.stateFlow.collect(new FlowCollector(StateFlowToObservablePropertyAdapter.this) { @Nullable
/* 18 */                       public final Object emit(Object state, @NotNull Continuation $completion) { if (this.$ctx != null) {
/* 19 */                           if (BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 20 */                                       StateFlowToObservablePropertyAdapter.this.fireChangeEvent(this.$state);
/* 21 */                                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.this.fireChangeEvent(this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.this.fireChangeEvent(this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */                                 @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); }
/*    */                                 @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE;
/* 24 */                         }  StateFlowToObservablePropertyAdapter.this.fireChangeEvent(state);
/*    */                         
/* 26 */                         return Unit.INSTANCE; } }(Continuation)this) == object) return object;  StateFlowToObservablePropertyAdapter.this.stateFlow.collect(new FlowCollector(StateFlowToObservablePropertyAdapter.this) { @Nullable public final Object emit(Object state, @NotNull Continuation $completion) { if (this.$ctx != null) { if (BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.this.fireChangeEvent(this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.this.fireChangeEvent(this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(this.$ctx, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((T)state, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); StateFlowToObservablePropertyAdapter.this.fireChangeEvent(this.$state); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$state, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE; }  StateFlowToObservablePropertyAdapter.this.fireChangeEvent(state); return Unit.INSTANCE; }
/*    */                        }
/*    */                     (Continuation)this);
/*    */                 throw new KotlinNothingValueException();
/*    */               case 1:
/*    */                 ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                 throw new KotlinNothingValueException(); }
/*    */             
/*    */             throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */           
/*    */           @NotNull
/*    */           public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */             return (Continuation)new Function2<>(StateFlowToObservablePropertyAdapter.this, this.$ctx, $completion);
/*    */           }
/*    */           
/*    */           @Nullable
/*    */           public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */             return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */           } }
/*    */         3, null);
/*    */   }
/*    */   
/*    */   public T get() {
/*    */     return (T)this.stateFlow.getValue();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/StateFlowToObservablePropertyAdapter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */