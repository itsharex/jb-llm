package com.intellij.ml.llm.core.grazieAPI;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieAuthService.kt", l = {99}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$waitAndGetAuthStatus$1")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class GrazieAuthService$waitAndGetAuthStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  GrazieAuthService$waitAndGetAuthStatus$1(Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 89, 0 -> 32, 1 -> 76
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield this$0 : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
    //   40: invokevirtual getAuthState : ()Lkotlinx/coroutines/flow/StateFlow;
    //   43: invokeinterface getValue : ()Ljava/lang/Object;
    //   48: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthState.Unknown : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
    //   51: if_acmpne -> 85
    //   54: ldc2_w 100
    //   57: aload_0
    //   58: checkcast kotlin/coroutines/Continuation
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield label : I
    //   66: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   69: dup
    //   70: aload_2
    //   71: if_acmpne -> 81
    //   74: aload_2
    //   75: areturn
    //   76: aload_1
    //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   80: aload_1
    //   81: pop
    //   82: goto -> 36
    //   85: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   88: areturn
    //   89: new java/lang/IllegalStateException
    //   92: dup
    //   93: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #97	-> 3
    //   #98	-> 36
    //   #99	-> 54
    //   #97	-> 74
    //   #99	-> 81
    //   #101	-> 85
    //   #97	-> 89
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   36	53	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$waitAndGetAuthStatus$1;
    //   36	53	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$waitAndGetAuthStatus$1> $completion) {
    return (Continuation<Unit>)new GrazieAuthService$waitAndGetAuthStatus$1($completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((GrazieAuthService$waitAndGetAuthStatus$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$waitAndGetAuthStatus$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */