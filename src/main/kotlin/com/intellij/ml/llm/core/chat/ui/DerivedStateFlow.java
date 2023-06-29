/*    */ package com.intellij.ml.llm.core.chat.ui;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\005\n\002\020\001\n\000\n\002\030\002\n\002\b\002\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B!\022\f\020\003\032\b\022\004\022\0028\0000\004\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\037\020\016\032\0020\0172\f\020\020\032\b\022\004\022\0028\0000\021H@ø\001\000¢\006\002\020\022R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000R\024\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R\032\020\b\032\b\022\004\022\0028\0000\t8VX\004¢\006\006\032\004\b\n\020\013R\024\020\f\032\0028\0008VX\004¢\006\006\032\004\b\003\020\r\002\004\n\002\b\031¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/DerivedStateFlow;", "T", "Lkotlinx/coroutines/flow/StateFlow;", "getValue", "Lkotlin/Function0;", "flow", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/Flow;)V", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "value", "()Ljava/lang/Object;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm"})
/*    */ final class DerivedStateFlow<T> implements StateFlow<T> {
/*    */   @NotNull
/*    */   private final Function0<T> getValue;
/*    */   @NotNull
/*    */   private final Flow<T> flow;
/*    */   
/*    */   public DerivedStateFlow(@NotNull Function0<T> getValue, @NotNull Flow<T> flow) {
/*  9 */     this.getValue = getValue;
/* 10 */     this.flow = flow;
/*    */   }
/*    */   
/*    */   @NotNull
/* 14 */   public List<T> getReplayCache() { return CollectionsKt.listOf(getValue()); }
/*    */   @InternalCoroutinesApi
/*    */   @Nullable
/*    */   public Object collect(@NotNull FlowCollector collector, @NotNull Continuation<?> paramContinuation) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/core/chat/ui/DerivedStateFlow$collect$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/core/chat/ui/DerivedStateFlow$collect$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/core/chat/ui/DerivedStateFlow$collect$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/DerivedStateFlow;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 139, 0 -> 88, 1 -> 125
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: new com/intellij/ml/llm/core/chat/ui/DerivedStateFlow$collect$2
/*    */     //   95: dup
/*    */     //   96: aload_0
/*    */     //   97: aload_1
/*    */     //   98: aconst_null
/*    */     //   99: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/ui/DerivedStateFlow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)V
/*    */     //   102: checkcast kotlin/jvm/functions/Function2
/*    */     //   105: aload #4
/*    */     //   107: aload #4
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokestatic coroutineScope : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #5
/*    */     //   119: if_acmpne -> 130
/*    */     //   122: aload #5
/*    */     //   124: areturn
/*    */     //   125: aload_3
/*    */     //   126: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   129: aload_3
/*    */     //   130: pop
/*    */     //   131: new kotlin/KotlinNothingValueException
/*    */     //   134: dup
/*    */     //   135: invokespecial <init> : ()V
/*    */     //   138: athrow
/*    */     //   139: new java/lang/IllegalStateException
/*    */     //   142: dup
/*    */     //   143: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   145: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   148: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 59
/*    */     //   #21	-> 92
/*    */     //   #20	-> 122
/*    */     //   #21	-> 130
/*    */     //   #20	-> 139
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	24	0	this	Lcom/intellij/ml/llm/core/chat/ui/DerivedStateFlow;
/*    */     //   92	24	1	collector	Lkotlinx/coroutines/flow/FlowCollector;
/*    */     //   50	89	4	$continuation	Lkotlin/coroutines/Continuation;
/* 17 */     //   56	83	3	$result	Ljava/lang/Object; } public T getValue() { return (T)this.getValue.invoke(); } @DebugMetadata(f = "DerivedStateFlow.kt", l = {21}, i = {}, s = {}, n = {}, m = "collect", c = "com.intellij.ml.llm.core.chat.ui.DerivedStateFlow") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48) static final class DerivedStateFlow$collect$1 extends ContinuationImpl {
/*    */     int label; DerivedStateFlow$collect$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return DerivedStateFlow.this.collect(null, (Continuation)this); }
/*    */   } @DebugMetadata(f = "DerivedStateFlow.kt", l = {21, 21}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.DerivedStateFlow$collect$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\001\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class DerivedStateFlow$collect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
/*    */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { CoroutineScope $this$coroutineScope;
/* 21 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0; this.label = 1; if (FlowKt.stateIn(FlowKt.distinctUntilChanged(DerivedStateFlow.this.flow), $this$coroutineScope, (Continuation)this) == object) return object;  this.label = 2; if (((StateFlow)FlowKt.stateIn(FlowKt.distinctUntilChanged(DerivedStateFlow.this.flow), $this$coroutineScope, (Continuation)this)).collect(this.$collector, (Continuation)this) == object) return object;  ((StateFlow)FlowKt.stateIn(FlowKt.distinctUntilChanged(DerivedStateFlow.this.flow), $this$coroutineScope, (Continuation)this)).collect(this.$collector, (Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((StateFlow)SYNTHETIC_LOCAL_VARIABLE_1).collect(this.$collector, (Continuation)this) == object) return object;  ((StateFlow)SYNTHETIC_LOCAL_VARIABLE_1).collect(this.$collector, (Continuation)this); throw new KotlinNothingValueException();case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     DerivedStateFlow$collect$2(FlowCollector<T> $collector, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super DerivedStateFlow$collect$2> $completion) {
/*    */       DerivedStateFlow$collect$2 derivedStateFlow$collect$2 = new DerivedStateFlow$collect$2(this.$collector, $completion);
/*    */       derivedStateFlow$collect$2.L$0 = value;
/*    */       return (Continuation<Unit>)derivedStateFlow$collect$2;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((DerivedStateFlow$collect$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */