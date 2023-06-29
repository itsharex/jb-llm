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

@DebugMetadata(f = "GrazieCompletionRequest.kt", l = {28, 28}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieCompletionRequest$sendSync$result$1")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class GrazieCompletionRequest$sendSync$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
  int label;
  
  GrazieCompletionRequest$sendSync$result$1(Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 159, 0 -> 36, 1 -> 88, 2 -> 122
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
    //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;)Lcom/intellij/openapi/project/Project;
    //   47: aload_0
    //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
    //   51: invokevirtual getBody : ()Ljava/lang/Object;
    //   54: checkcast java/lang/String
    //   57: aload_0
    //   58: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
    //   61: invokevirtual getModel : ()Lai/grazie/model/llm/profile/LLMProfileID;
    //   64: iconst_0
    //   65: iconst_0
    //   66: aload_0
    //   67: checkcast kotlin/coroutines/Continuation
    //   70: bipush #24
    //   72: aconst_null
    //   73: aload_0
    //   74: iconst_1
    //   75: putfield label : I
    //   78: invokestatic sendGrazieCompleteRequestGrazie$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;ZZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   81: dup
    //   82: aload_2
    //   83: if_acmpne -> 93
    //   86: aload_2
    //   87: areturn
    //   88: aload_1
    //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   92: aload_1
    //   93: checkcast kotlinx/coroutines/flow/Flow
    //   96: dup
    //   97: ifnull -> 156
    //   100: aconst_null
    //   101: aload_0
    //   102: checkcast kotlin/coroutines/Continuation
    //   105: iconst_1
    //   106: aconst_null
    //   107: aload_0
    //   108: iconst_2
    //   109: putfield label : I
    //   112: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   115: dup
    //   116: aload_2
    //   117: if_acmpne -> 127
    //   120: aload_2
    //   121: areturn
    //   122: aload_1
    //   123: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   126: aload_1
    //   127: checkcast java/util/List
    //   130: dup
    //   131: ifnull -> 156
    //   134: checkcast java/lang/Iterable
    //   137: ldc ''
    //   139: checkcast java/lang/CharSequence
    //   142: aconst_null
    //   143: aconst_null
    //   144: iconst_0
    //   145: aconst_null
    //   146: aconst_null
    //   147: bipush #62
    //   149: aconst_null
    //   150: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   153: goto -> 158
    //   156: pop
    //   157: aconst_null
    //   158: areturn
    //   159: new java/lang/IllegalStateException
    //   162: dup
    //   163: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   165: invokespecial <init> : (Ljava/lang/String;)V
    //   168: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #27	-> 3
    //   #28	-> 40
    //   #27	-> 86
    //   #28	-> 93
    //   #27	-> 120
    //   #28	-> 127
    //   #27	-> 159
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   40	119	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest$sendSync$result$1;
    //   40	119	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieCompletionRequest$sendSync$result$1> $completion) {
    return (Continuation<Unit>)new GrazieCompletionRequest$sendSync$result$1($completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((GrazieCompletionRequest$sendSync$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest$sendSync$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */