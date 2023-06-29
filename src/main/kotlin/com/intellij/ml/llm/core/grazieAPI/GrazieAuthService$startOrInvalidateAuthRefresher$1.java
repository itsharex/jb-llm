/*     */ package com.intellij.ml.llm.core.grazieAPI;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "GrazieAuthService.kt", l = {169}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$startOrInvalidateAuthRefresher$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class GrazieAuthService$startOrInvalidateAuthRefresher$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   GrazieAuthService$startOrInvalidateAuthRefresher$1(Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/* 168 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 169 */         this.label = 1; if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore_3
/*     */                 //   4: aload_0
/*     */                 //   5: getfield label : I
/*     */                 //   8: tableswitch default -> 144, 0 -> 36, 1 -> 87, 2 -> 117
/*     */                 //   36: aload_1
/*     */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   40: aload_0
/*     */                 //   41: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                 //   44: invokevirtual isAuthenticated : ()Z
/*     */                 //   47: ifeq -> 140
/*     */                 //   50: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */                 //   53: pop
/*     */                 //   54: getstatic kotlin/random/Random.Default : Lkotlin/random/Random$Default;
/*     */                 //   57: iconst_2
/*     */                 //   58: iconst_4
/*     */                 //   59: invokevirtual nextInt : (II)I
/*     */                 //   62: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
/*     */                 //   65: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */                 //   68: aload_0
/*     */                 //   69: checkcast kotlin/coroutines/Continuation
/*     */                 //   72: aload_0
/*     */                 //   73: iconst_1
/*     */                 //   74: putfield label : I
/*     */                 //   77: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   80: dup
/*     */                 //   81: aload_3
/*     */                 //   82: if_acmpne -> 92
/*     */                 //   85: aload_3
/*     */                 //   86: areturn
/*     */                 //   87: aload_1
/*     */                 //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   91: aload_1
/*     */                 //   92: pop
/*     */                 //   93: nop
/*     */                 //   94: aload_0
/*     */                 //   95: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                 //   98: aload_0
/*     */                 //   99: checkcast kotlin/coroutines/Continuation
/*     */                 //   102: aload_0
/*     */                 //   103: iconst_2
/*     */                 //   104: putfield label : I
/*     */                 //   107: invokestatic access$refreshToken : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   110: dup
/*     */                 //   111: aload_3
/*     */                 //   112: if_acmpne -> 123
/*     */                 //   115: aload_3
/*     */                 //   116: areturn
/*     */                 //   117: nop
/*     */                 //   118: aload_1
/*     */                 //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   122: aload_1
/*     */                 //   123: pop
/*     */                 //   124: goto -> 40
/*     */                 //   127: astore_2
/*     */                 //   128: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */                 //   131: ldc 'Could not refresh token'
/*     */                 //   133: aload_2
/*     */                 //   134: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                 //   137: goto -> 40
/*     */                 //   140: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   143: areturn
/*     */                 //   144: new java/lang/IllegalStateException
/*     */                 //   147: dup
/*     */                 //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   153: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #169	-> 3
/*     */                 //   #170	-> 40
/*     */                 //   #171	-> 50
/*     */                 //   #171	-> 72
/*     */                 //   #169	-> 85
/*     */                 //   #172	-> 92
/*     */                 //   #173	-> 94
/*     */                 //   #169	-> 115
/*     */                 //   #173	-> 123
/*     */                 //   #175	-> 127
/*     */                 //   #176	-> 128
/*     */                 //   #179	-> 140
/*     */                 //   #169	-> 144
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   128	9	2	t	Ljava/lang/Throwable;
/*     */                 //   40	104	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$startOrInvalidateAuthRefresher$1$1;
/*     */                 //   40	104	1	$result	Ljava/lang/Object;
/*     */                 // Exception table:
/*     */                 //   from	to	target	type
/*     */                 //   93	110	127	java/lang/Throwable
/* 169 */                 //   117	124	127	java/lang/Throwable } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(GrazieAuthService.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore_3
/*     */                 //   4: aload_0
/*     */                 //   5: getfield label : I
/*     */                 //   8: tableswitch default -> 144, 0 -> 36, 1 -> 87, 2 -> 117
/*     */                 //   36: aload_1
/*     */                 //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   40: aload_0
/*     */                 //   41: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                 //   44: invokevirtual isAuthenticated : ()Z
/*     */                 //   47: ifeq -> 140
/*     */                 //   50: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */                 //   53: pop
/*     */                 //   54: getstatic kotlin/random/Random.Default : Lkotlin/random/Random$Default;
/*     */                 //   57: iconst_2
/*     */                 //   58: iconst_4
/*     */                 //   59: invokevirtual nextInt : (II)I
/*     */                 //   62: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
/*     */                 //   65: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */                 //   68: aload_0
/*     */                 //   69: checkcast kotlin/coroutines/Continuation
/*     */                 //   72: aload_0
/*     */                 //   73: iconst_1
/*     */                 //   74: putfield label : I
/*     */                 //   77: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   80: dup
/*     */                 //   81: aload_3
/*     */                 //   82: if_acmpne -> 92
/*     */                 //   85: aload_3
/*     */                 //   86: areturn
/*     */                 //   87: aload_1
/*     */                 //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   91: aload_1
/*     */                 //   92: pop
/*     */                 //   93: nop
/*     */                 //   94: aload_0
/*     */                 //   95: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*     */                 //   98: aload_0
/*     */                 //   99: checkcast kotlin/coroutines/Continuation
/*     */                 //   102: aload_0
/*     */                 //   103: iconst_2
/*     */                 //   104: putfield label : I
/*     */                 //   107: invokestatic access$refreshToken : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   110: dup
/*     */                 //   111: aload_3
/*     */                 //   112: if_acmpne -> 123
/*     */                 //   115: aload_3
/*     */                 //   116: areturn
/*     */                 //   117: nop
/*     */                 //   118: aload_1
/*     */                 //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   122: aload_1
/*     */                 //   123: pop
/*     */                 //   124: goto -> 40
/*     */                 //   127: astore_2
/*     */                 //   128: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */                 //   131: ldc 'Could not refresh token'
/*     */                 //   133: aload_2
/*     */                 //   134: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                 //   137: goto -> 40
/*     */                 //   140: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   143: areturn
/*     */                 //   144: new java/lang/IllegalStateException
/*     */                 //   147: dup
/*     */                 //   148: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   150: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   153: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #169	-> 3
/*     */                 //   #170	-> 40
/*     */                 //   #171	-> 50
/*     */                 //   #171	-> 72
/*     */                 //   #169	-> 85
/*     */                 //   #172	-> 92
/*     */                 //   #173	-> 94
/*     */                 //   #169	-> 115
/*     */                 //   #173	-> 123
/*     */                 //   #175	-> 127
/*     */                 //   #176	-> 128
/*     */                 //   #179	-> 140
/*     */                 //   #169	-> 144
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   128	9	2	t	Ljava/lang/Throwable;
/*     */                 //   40	104	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$startOrInvalidateAuthRefresher$1$1;
/*     */                 //   40	104	1	$result	Ljava/lang/Object;
/*     */                 // Exception table:
/*     */                 //   from	to	target	type
/*     */                 //   93	110	127	java/lang/Throwable
/* 169 */                 //   117	124	127	java/lang/Throwable } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(GrazieAuthService.this, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 180 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$startOrInvalidateAuthRefresher$1> $completion) {
/*     */     return (Continuation<Unit>)new GrazieAuthService$startOrInvalidateAuthRefresher$1($completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((GrazieAuthService$startOrInvalidateAuthRefresher$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$startOrInvalidateAuthRefresher$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */