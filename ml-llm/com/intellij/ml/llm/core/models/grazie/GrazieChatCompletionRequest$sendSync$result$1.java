package com.intellij.ml.llm.core.models.grazie;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieChatCompletionRequest.kt", l = {29, 29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieChatCompletionRequest$sendSync$result$1")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class GrazieChatCompletionRequest$sendSync$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
  int label;
  
  GrazieChatCompletionRequest$sendSync$result$1(Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 154, 0 -> 36, 1 -> 83, 2 -> 117
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
    //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;)Lcom/intellij/openapi/project/Project;
    //   47: aload_0
    //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
    //   51: invokevirtual getBody : ()Ljava/lang/Object;
    //   54: checkcast ai/grazie/model/llm/chat/LLMChat
    //   57: aconst_null
    //   58: iconst_0
    //   59: aconst_null
    //   60: iconst_0
    //   61: aload_0
    //   62: checkcast kotlin/coroutines/Continuation
    //   65: bipush #60
    //   67: aconst_null
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield label : I
    //   73: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   76: dup
    //   77: aload_2
    //   78: if_acmpne -> 88
    //   81: aload_2
    //   82: areturn
    //   83: aload_1
    //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   87: aload_1
    //   88: checkcast kotlinx/coroutines/flow/Flow
    //   91: dup
    //   92: ifnull -> 151
    //   95: aconst_null
    //   96: aload_0
    //   97: checkcast kotlin/coroutines/Continuation
    //   100: iconst_1
    //   101: aconst_null
    //   102: aload_0
    //   103: iconst_2
    //   104: putfield label : I
    //   107: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   110: dup
    //   111: aload_2
    //   112: if_acmpne -> 122
    //   115: aload_2
    //   116: areturn
    //   117: aload_1
    //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   121: aload_1
    //   122: checkcast java/util/List
    //   125: dup
    //   126: ifnull -> 151
    //   129: checkcast java/lang/Iterable
    //   132: ldc ''
    //   134: checkcast java/lang/CharSequence
    //   137: aconst_null
    //   138: aconst_null
    //   139: iconst_0
    //   140: aconst_null
    //   141: aconst_null
    //   142: bipush #62
    //   144: aconst_null
    //   145: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   148: goto -> 153
    //   151: pop
    //   152: aconst_null
    //   153: areturn
    //   154: new java/lang/IllegalStateException
    //   157: dup
    //   158: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #28	-> 3
    //   #29	-> 40
    //   #28	-> 81
    //   #29	-> 88
    //   #28	-> 115
    //   #29	-> 122
    //   #28	-> 154
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   40	114	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$result$1;
    //   40	114	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieChatCompletionRequest$sendSync$result$1> $completion) {
    return (Continuation<Unit>)new GrazieChatCompletionRequest$sendSync$result$1($completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((GrazieChatCompletionRequest$sendSync$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */