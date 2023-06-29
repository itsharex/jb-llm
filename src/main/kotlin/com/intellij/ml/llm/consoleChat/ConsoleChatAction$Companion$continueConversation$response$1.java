package com.intellij.ml.llm.consoleChat;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ConsoleChatAction.kt", l = {54, 54}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.consoleChat.ConsoleChatAction$Companion$continueConversation$response$1")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class ConsoleChatAction$Companion$continueConversation$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
  int label;
  
  ConsoleChatAction$Companion$continueConversation$response$1(Project $project, PsiFile $file, Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 167, 0 -> 36, 1 -> 91, 2 -> 125
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield $project : Lcom/intellij/openapi/project/Project;
    //   44: getstatic com/intellij/ml/llm/consoleChat/ConsoleChatAction.Companion : Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion;
    //   47: aload_0
    //   48: getfield $file : Lcom/intellij/psi/PsiFile;
    //   51: invokeinterface getText : ()Ljava/lang/String;
    //   56: dup
    //   57: ldc 'file.text'
    //   59: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   62: invokevirtual parseMessages : (Ljava/lang/String;)Lai/grazie/model/llm/chat/LLMChat;
    //   65: aconst_null
    //   66: iconst_0
    //   67: aconst_null
    //   68: iconst_0
    //   69: aload_0
    //   70: checkcast kotlin/coroutines/Continuation
    //   73: bipush #60
    //   75: aconst_null
    //   76: aload_0
    //   77: iconst_1
    //   78: putfield label : I
    //   81: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   84: dup
    //   85: aload_2
    //   86: if_acmpne -> 96
    //   89: aload_2
    //   90: areturn
    //   91: aload_1
    //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   95: aload_1
    //   96: checkcast kotlinx/coroutines/flow/Flow
    //   99: dup
    //   100: ifnull -> 159
    //   103: aconst_null
    //   104: aload_0
    //   105: checkcast kotlin/coroutines/Continuation
    //   108: iconst_1
    //   109: aconst_null
    //   110: aload_0
    //   111: iconst_2
    //   112: putfield label : I
    //   115: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   118: dup
    //   119: aload_2
    //   120: if_acmpne -> 130
    //   123: aload_2
    //   124: areturn
    //   125: aload_1
    //   126: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   129: aload_1
    //   130: checkcast java/util/List
    //   133: dup
    //   134: ifnull -> 159
    //   137: checkcast java/lang/Iterable
    //   140: ldc ''
    //   142: checkcast java/lang/CharSequence
    //   145: aconst_null
    //   146: aconst_null
    //   147: iconst_0
    //   148: aconst_null
    //   149: aconst_null
    //   150: bipush #62
    //   152: aconst_null
    //   153: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
    //   156: goto -> 161
    //   159: pop
    //   160: aconst_null
    //   161: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   166: areturn
    //   167: new java/lang/IllegalStateException
    //   170: dup
    //   171: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   173: invokespecial <init> : (Ljava/lang/String;)V
    //   176: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #53	-> 3
    //   #54	-> 40
    //   #53	-> 89
    //   #54	-> 96
    //   #53	-> 123
    //   #54	-> 130
    //   #53	-> 167
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   40	127	0	this	Lcom/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$response$1;
    //   40	127	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ConsoleChatAction$Companion$continueConversation$response$1> $completion) {
    return (Continuation<Unit>)new ConsoleChatAction$Companion$continueConversation$response$1(this.$project, this.$file, $completion);
  }
  
  @Nullable
  public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
    return ((ConsoleChatAction$Companion$continueConversation$response$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$response$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */