/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "GrazieChatCompletionRequest.kt", l = {35, 36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieChatCompletionRequest$sendSync$job$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GrazieChatCompletionRequest$sendSync$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   GrazieChatCompletionRequest$sendSync$job$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_3
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 146, 0 -> 36, 1 -> 83, 2 -> 132
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: aload_0
/*    */     //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */     //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;)Lcom/intellij/openapi/project/Project;
/*    */     //   47: aload_0
/*    */     //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */     //   51: invokevirtual getBody : ()Ljava/lang/Object;
/*    */     //   54: checkcast ai/grazie/model/llm/chat/LLMChat
/*    */     //   57: aconst_null
/*    */     //   58: iconst_0
/*    */     //   59: aconst_null
/*    */     //   60: iconst_0
/*    */     //   61: aload_0
/*    */     //   62: checkcast kotlin/coroutines/Continuation
/*    */     //   65: bipush #60
/*    */     //   67: aconst_null
/*    */     //   68: aload_0
/*    */     //   69: iconst_1
/*    */     //   70: putfield label : I
/*    */     //   73: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   76: dup
/*    */     //   77: aload_3
/*    */     //   78: if_acmpne -> 88
/*    */     //   81: aload_3
/*    */     //   82: areturn
/*    */     //   83: aload_1
/*    */     //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   87: aload_1
/*    */     //   88: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   91: astore_2
/*    */     //   92: aload_2
/*    */     //   93: dup
/*    */     //   94: ifnull -> 141
/*    */     //   97: new com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$job$1$1
/*    */     //   100: dup
/*    */     //   101: aload_0
/*    */     //   102: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */     //   105: invokespecial <init> : (Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;)V
/*    */     //   108: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */     //   111: aload_0
/*    */     //   112: checkcast kotlin/coroutines/Continuation
/*    */     //   115: aload_0
/*    */     //   116: iconst_2
/*    */     //   117: putfield label : I
/*    */     //   120: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   125: dup
/*    */     //   126: aload_3
/*    */     //   127: if_acmpne -> 137
/*    */     //   130: aload_3
/*    */     //   131: areturn
/*    */     //   132: aload_1
/*    */     //   133: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   136: aload_1
/*    */     //   137: pop
/*    */     //   138: goto -> 142
/*    */     //   141: pop
/*    */     //   142: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   145: areturn
/*    */     //   146: new java/lang/IllegalStateException
/*    */     //   149: dup
/*    */     //   150: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   152: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   155: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 3
/*    */     //   #35	-> 40
/*    */     //   #34	-> 81
/*    */     //   #36	-> 92
/*    */     //   #34	-> 130
/*    */     //   #36	-> 137
/*    */     //   #39	-> 142
/*    */     //   #34	-> 146
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	33	2	sendRequestGrazie	Lkotlinx/coroutines/flow/Flow;
/*    */     //   40	106	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$job$1;
/*    */     //   40	106	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieChatCompletionRequest$sendSync$job$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieChatCompletionRequest$sendSync$job$1($completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((GrazieChatCompletionRequest$sendSync$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$job$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */