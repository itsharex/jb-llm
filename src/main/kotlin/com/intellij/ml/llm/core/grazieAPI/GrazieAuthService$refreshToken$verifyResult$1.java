package com.intellij.ml.llm.core.grazieAPI;

import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieAuthService.kt", l = {197}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$refreshToken$verifyResult$1")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class GrazieAuthService$refreshToken$verifyResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
  int label;
  
  GrazieAuthService$refreshToken$verifyResult$1(SuspendableAPIGatewayClient $grazieClient, Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 118, 0 -> 32, 1 -> 62
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $grazieClient : Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
    //   40: invokevirtual auth : ()Lai/grazie/api/gateway/client/api/AuthAPIClient;
    //   43: aload_0
    //   44: checkcast kotlin/coroutines/Continuation
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield label : I
    //   52: invokevirtual verify : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   55: dup
    //   56: aload_2
    //   57: if_acmpne -> 67
    //   60: aload_2
    //   61: areturn
    //   62: aload_1
    //   63: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   66: aload_1
    //   67: checkcast ai/grazie/utils/mpp/time/Timestamp
    //   70: dup
    //   71: ifnull -> 95
    //   74: getstatic ai/grazie/utils/mpp/time/Timestamp.Companion : Lai/grazie/utils/mpp/time/Timestamp$Companion;
    //   77: invokevirtual now : ()Lai/grazie/utils/mpp/time/Timestamp;
    //   80: invokevirtual after : (Lai/grazie/utils/mpp/time/Timestamp;)Z
    //   83: iconst_1
    //   84: if_icmpne -> 91
    //   87: iconst_1
    //   88: goto -> 97
    //   91: iconst_0
    //   92: goto -> 97
    //   95: pop
    //   96: iconst_0
    //   97: ifeq -> 113
    //   100: invokestatic access$getLogger$p : ()Lcom/intellij/openapi/diagnostic/Logger;
    //   103: ldc 'Token is still valid!'
    //   105: invokevirtual info : (Ljava/lang/String;)V
    //   108: iconst_1
    //   109: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   112: areturn
    //   113: iconst_0
    //   114: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   117: areturn
    //   118: new java/lang/IllegalStateException
    //   121: dup
    //   122: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #196	-> 3
    //   #197	-> 36
    //   #196	-> 60
    //   #197	-> 67
    //   #198	-> 100
    //   #199	-> 108
    //   #202	-> 113
    //   #196	-> 118
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   36	82	0	this	Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$verifyResult$1;
    //   36	82	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieAuthService$refreshToken$verifyResult$1> $completion) {
    return (Continuation<Unit>)new GrazieAuthService$refreshToken$verifyResult$1(this.$grazieClient, $completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((GrazieAuthService$refreshToken$verifyResult$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$refreshToken$verifyResult$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */