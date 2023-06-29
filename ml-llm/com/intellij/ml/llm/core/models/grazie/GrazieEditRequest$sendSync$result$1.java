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

@DebugMetadata(f = "GrazieEditRequest.kt", l = {15, 15}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieEditRequest$sendSync$result$1")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class GrazieEditRequest$sendSync$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
  int label;
  
  GrazieEditRequest$sendSync$result$1(Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 156, 0 -> 36, 1 -> 85, 2 -> 119
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieEditRequest;
    //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieEditRequest;)Lcom/intellij/openapi/project/Project;
    //   47: aload_0
    //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieEditRequest;
    //   51: invokevirtual getChat : ()Lai/grazie/model/llm/chat/LLMChat;
    //   54: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs;
    //   57: invokevirtual getGPT4 : ()Lai/grazie/model/llm/profile/LLMProfileID;
    //   60: iconst_0
    //   61: aconst_null
    //   62: iconst_0
    //   63: aload_0
    //   64: checkcast kotlin/coroutines/Continuation
    //   67: bipush #56
    //   69: aconst_null
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield label : I
    //   75: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   78: dup
    //   79: aload_2
    //   80: if_acmpne -> 90
    //   83: aload_2
    //   84: areturn
    //   85: aload_1
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_1
    //   90: checkcast kotlinx/coroutines/flow/Flow
    //   93: dup
    //   94: ifnull -> 153
    //   97: aconst_null
    //   98: aload_0
    //   99: checkcast kotlin/coroutines/Continuation
    //   102: iconst_1
    //   103: aconst_null
    //   104: aload_0
    //   105: iconst_2
    //   106: putfield label : I
    //   109: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   112: dup
    //   113: aload_2
    //   114: if_acmpne -> 124
    //   117: aload_2
    //   118: areturn
    //   119: aload_1
    //   120: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   123: aload_1
    //   124: checkcast java/util/List
    //   127: dup
    //   128: ifnull -> 153
    //   131: checkcast java/lang/Iterable
    //   134: ldc ''
    //   136: checkcast java/lang/CharSequence
    //   139: aconst_null
    //   140: aconst_null
    //   141: iconst_0
    //   142: aconst_null
    //   143: aconst_null
    //   144: bipush #62
    //   146: aconst_null
    //   147: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   150: goto -> 155
    //   153: pop
    //   154: aconst_null
    //   155: areturn
    //   156: new java/lang/IllegalStateException
    //   159: dup
    //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   162: invokespecial <init> : (Ljava/lang/String;)V
    //   165: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 3
    //   #15	-> 40
    //   #14	-> 83
    //   #15	-> 90
    //   #14	-> 117
    //   #15	-> 124
    //   #14	-> 156
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   40	116	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieEditRequest$sendSync$result$1;
    //   40	116	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieEditRequest$sendSync$result$1> $completion) {
    return (Continuation<Unit>)new GrazieEditRequest$sendSync$result$1($completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((GrazieEditRequest$sendSync$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieEditRequest$sendSync$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */