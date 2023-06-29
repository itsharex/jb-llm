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
/*    */ @DebugMetadata(f = "GrazieCompletionRequest.kt", l = {34, 35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieCompletionRequest$sendSync$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GrazieCompletionRequest$sendSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   GrazieCompletionRequest$sendSync$1(Continuation $completion) {
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
/*    */     //   8: tableswitch default -> 151, 0 -> 36, 1 -> 88, 2 -> 137
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: aload_0
/*    */     //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
/*    */     //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;)Lcom/intellij/openapi/project/Project;
/*    */     //   47: aload_0
/*    */     //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
/*    */     //   51: invokevirtual getBody : ()Ljava/lang/Object;
/*    */     //   54: checkcast java/lang/String
/*    */     //   57: aload_0
/*    */     //   58: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
/*    */     //   61: invokevirtual getModel : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   64: iconst_0
/*    */     //   65: iconst_0
/*    */     //   66: aload_0
/*    */     //   67: checkcast kotlin/coroutines/Continuation
/*    */     //   70: bipush #24
/*    */     //   72: aconst_null
/*    */     //   73: aload_0
/*    */     //   74: iconst_1
/*    */     //   75: putfield label : I
/*    */     //   78: invokestatic sendGrazieCompleteRequestGrazie$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;ZZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   81: dup
/*    */     //   82: aload_3
/*    */     //   83: if_acmpne -> 93
/*    */     //   86: aload_3
/*    */     //   87: areturn
/*    */     //   88: aload_1
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_1
/*    */     //   93: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   96: astore_2
/*    */     //   97: aload_2
/*    */     //   98: dup
/*    */     //   99: ifnull -> 146
/*    */     //   102: new com/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest$sendSync$1$1
/*    */     //   105: dup
/*    */     //   106: aload_0
/*    */     //   107: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;
/*    */     //   110: invokespecial <init> : (Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest;)V
/*    */     //   113: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */     //   116: aload_0
/*    */     //   117: checkcast kotlin/coroutines/Continuation
/*    */     //   120: aload_0
/*    */     //   121: iconst_2
/*    */     //   122: putfield label : I
/*    */     //   125: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   130: dup
/*    */     //   131: aload_3
/*    */     //   132: if_acmpne -> 142
/*    */     //   135: aload_3
/*    */     //   136: areturn
/*    */     //   137: aload_1
/*    */     //   138: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   141: aload_1
/*    */     //   142: pop
/*    */     //   143: goto -> 147
/*    */     //   146: pop
/*    */     //   147: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   150: areturn
/*    */     //   151: new java/lang/IllegalStateException
/*    */     //   154: dup
/*    */     //   155: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   157: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   160: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 3
/*    */     //   #34	-> 40
/*    */     //   #33	-> 86
/*    */     //   #35	-> 97
/*    */     //   #33	-> 135
/*    */     //   #35	-> 142
/*    */     //   #38	-> 147
/*    */     //   #33	-> 151
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	33	2	sendRequestGrazie	Lkotlinx/coroutines/flow/Flow;
/*    */     //   40	111	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest$sendSync$1;
/*    */     //   40	111	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieCompletionRequest$sendSync$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieCompletionRequest$sendSync$1($completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((GrazieCompletionRequest$sendSync$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieCompletionRequest$sendSync$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */