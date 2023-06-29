/*     */ package com.intellij.ml.llm.core;
/*     */ 
/*     */ import com.intellij.codeInsight.hints.presentation.PresentationRenderer;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @DebugMetadata(f = "Notifications.kt", l = {158, 159}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.NotificationsKt$showScoreNotificationInlay$1$3$2")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   null(Inlay<PresentationRenderer> $inlay, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_2
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 125, 0 -> 36, 1 -> 69, 2 -> 115
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */     //   44: ifnull -> 121
/*     */     //   47: ldc2_w 20000
/*     */     //   50: aload_0
/*     */     //   51: checkcast kotlin/coroutines/Continuation
/*     */     //   54: aload_0
/*     */     //   55: iconst_1
/*     */     //   56: putfield label : I
/*     */     //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   62: dup
/*     */     //   63: aload_2
/*     */     //   64: if_acmpne -> 74
/*     */     //   67: aload_2
/*     */     //   68: areturn
/*     */     //   69: aload_1
/*     */     //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   73: aload_1
/*     */     //   74: pop
/*     */     //   75: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   78: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   81: new com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2$1
/*     */     //   84: dup
/*     */     //   85: aload_0
/*     */     //   86: getfield $inlay : Lcom/intellij/openapi/editor/Inlay;
/*     */     //   89: aconst_null
/*     */     //   90: invokespecial <init> : (Lcom/intellij/openapi/editor/Inlay;Lkotlin/coroutines/Continuation;)V
/*     */     //   93: checkcast kotlin/jvm/functions/Function2
/*     */     //   96: aload_0
/*     */     //   97: checkcast kotlin/coroutines/Continuation
/*     */     //   100: aload_0
/*     */     //   101: iconst_2
/*     */     //   102: putfield label : I
/*     */     //   105: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   108: dup
/*     */     //   109: aload_2
/*     */     //   110: if_acmpne -> 120
/*     */     //   113: aload_2
/*     */     //   114: areturn
/*     */     //   115: aload_1
/*     */     //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   119: aload_1
/*     */     //   120: pop
/*     */     //   121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   124: areturn
/*     */     //   125: new java/lang/IllegalStateException
/*     */     //   128: dup
/*     */     //   129: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   131: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   134: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #156	-> 3
/*     */     //   #157	-> 40
/*     */     //   #158	-> 47
/*     */     //   #156	-> 67
/*     */     //   #159	-> 74
/*     */     //   #156	-> 113
/*     */     //   #163	-> 120
/*     */     //   #156	-> 125
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	85	0	this	Lcom/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2;
/*     */     //   40	85	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */     return (Continuation<Unit>)new Object(this.$inlay, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/NotificationsKt$showScoreNotificationInlay$1$3$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */