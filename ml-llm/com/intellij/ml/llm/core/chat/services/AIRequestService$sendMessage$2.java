/*    */ package com.intellij.ml.llm.core.chat.services;@DebugMetadata(f = "AIRequestService.kt", l = {27, 28}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.services.AIRequestService$sendMessage$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AIRequestService$sendMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; AIRequestService$sendMessage$2(String $context, List<CompletableMessage> $messages, Function2<String, Continuation<? super Unit>, Object> $consumer, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   } @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #4
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 176, 0 -> 36, 1 -> 110, 2 -> 161
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: getstatic ai/grazie/model/llm/chat/LLMChat.Companion : Lai/grazie/model/llm/chat/LLMChat$Companion;
/*    */     //   43: new com/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$chat$1
/*    */     //   46: dup
/*    */     //   47: aload_0
/*    */     //   48: getfield $context : Ljava/lang/String;
/*    */     //   51: aload_0
/*    */     //   52: getfield this$0 : Lcom/intellij/ml/llm/core/chat/services/AIRequestService;
/*    */     //   55: aload_0
/*    */     //   56: getfield $messages : Ljava/util/List;
/*    */     //   59: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/services/AIRequestService;Ljava/util/List;)V
/*    */     //   62: checkcast kotlin/jvm/functions/Function1
/*    */     //   65: invokevirtual build : (Lkotlin/jvm/functions/Function1;)Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   68: astore_2
/*    */     //   69: aload_0
/*    */     //   70: getfield this$0 : Lcom/intellij/ml/llm/core/chat/services/AIRequestService;
/*    */     //   73: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/chat/services/AIRequestService;)Lcom/intellij/openapi/project/Project;
/*    */     //   76: aload_2
/*    */     //   77: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs$Chat.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;
/*    */     //   80: invokevirtual getGPT4 : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   83: iconst_1
/*    */     //   84: aconst_null
/*    */     //   85: iconst_0
/*    */     //   86: aload_0
/*    */     //   87: checkcast kotlin/coroutines/Continuation
/*    */     //   90: bipush #48
/*    */     //   92: aconst_null
/*    */     //   93: aload_0
/*    */     //   94: iconst_1
/*    */     //   95: putfield label : I
/*    */     //   98: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   101: dup
/*    */     //   102: aload #4
/*    */     //   104: if_acmpne -> 115
/*    */     //   107: aload #4
/*    */     //   109: areturn
/*    */     //   110: aload_1
/*    */     //   111: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   114: aload_1
/*    */     //   115: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   118: astore_3
/*    */     //   119: aload_3
/*    */     //   120: dup
/*    */     //   121: ifnull -> 173
/*    */     //   124: new com/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$1
/*    */     //   127: dup
/*    */     //   128: aload_0
/*    */     //   129: getfield $consumer : Lkotlin/jvm/functions/Function2;
/*    */     //   132: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   135: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */     //   138: aload_0
/*    */     //   139: checkcast kotlin/coroutines/Continuation
/*    */     //   142: aload_0
/*    */     //   143: iconst_2
/*    */     //   144: putfield label : I
/*    */     //   147: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   152: dup
/*    */     //   153: aload #4
/*    */     //   155: if_acmpne -> 166
/*    */     //   158: aload #4
/*    */     //   160: areturn
/*    */     //   161: aload_1
/*    */     //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   165: aload_1
/*    */     //   166: pop
/*    */     //   167: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   170: goto -> 175
/*    */     //   173: pop
/*    */     //   174: aconst_null
/*    */     //   175: areturn
/*    */     //   176: new java/lang/IllegalStateException
/*    */     //   179: dup
/*    */     //   180: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   182: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   185: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 3
/*    */     //   #19	-> 40
/*    */     //   #27	-> 69
/*    */     //   #18	-> 107
/*    */     //   #28	-> 119
/*    */     //   #18	-> 158
/*    */     //   #28	-> 166
/*    */     //   #18	-> 176
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   69	32	2	chat	Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   119	33	3	flow	Lkotlinx/coroutines/flow/Flow;
/*    */     //   40	136	0	this	Lcom/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2;
/*    */     //   40	136	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIRequestService$sendMessage$2> $completion) {
/*    */     return (Continuation<Unit>)new AIRequestService$sendMessage$2(this.$context, this.$messages, this.$consumer, $completion);
/*    */   }
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((AIRequestService$sendMessage$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nAIRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$chat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$chat$1\n*L\n23#1:57,2\n*E\n"})
/*    */   static final class AIRequestService$sendMessage$2$chat$1 extends Lambda implements Function1<LLMChat.Builder, Unit> { public final void invoke(@NotNull LLMChat.Builder $this$build) {
/* 20 */       Intrinsics.checkNotNullParameter($this$build, "$this$build"); if (this.$context != null) {
/* 21 */         $this$build.message(LLMChatRole.System, this.$context);
/*    */       }
/* 23 */       List list = AIRequestService.access$getFilteredMessages(AIRequestService.this, this.$messages, 1); AIRequestService aIRequestService = AIRequestService.this; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 57 */       Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); CompletableMessage it = (CompletableMessage)element$iv; int $i$a$-forEach-AIRequestService$sendMessage$2$chat$1$1 = 0;
/*    */         $this$build.message(AIRequestService.access$toLLMChatRole(aIRequestService, it.getAuthor()), it.getText()); }
/*    */     
/*    */     }
/*    */     
/*    */     AIRequestService$sendMessage$2$chat$1(AIRequestService $receiver, List<CompletableMessage> $messages) {
/*    */       super(1);
/*    */     } }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */