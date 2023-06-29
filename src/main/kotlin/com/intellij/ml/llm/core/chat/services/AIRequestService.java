/*    */ package com.intellij.ml.llm.core.chat.services;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import java.util.List;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004JK\020\005\032\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0130\n2\"\020\f\032\036\b\001\022\004\022\0020\b\022\n\022\b\022\004\022\0020\0060\016\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\017J&\020\020\032\b\022\004\022\0020\0130\n2\f\020\t\032\b\022\004\022\0020\0130\n2\b\b\002\020\021\032\0020\022H\002JM\020\023\032\0020\0062\b\020\024\032\004\030\0010\b2\f\020\t\032\b\022\004\022\0020\0130\n2\"\020\f\032\036\b\001\022\004\022\0020\b\022\n\022\b\022\004\022\0020\0060\016\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\017J\f\020\025\032\0020\026*\0020\027H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/core/chat/services/AIRequestService;", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "generateDialogTitle", "", "prompt", "", "messages", "", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "consumer", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilteredMessages", "extra", "", "sendMessage", "context", "toLLMChatRole", "Lai/grazie/model/llm/chat/LLMChatRole;", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "intellij.ml.llm"})
/*    */ public final class AIRequestService {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/* 16 */   public AIRequestService(@NotNull Project project) { this.project = project; }
/*    */   @Nullable
/* 18 */   public final Object sendMessage(@Nullable String context, @NotNull List<? extends CompletableMessage> messages, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> consumer, @NotNull Continuation $completion) { return TasksKt.withBackgroundProgress(this.project, LLMBundle.message("intentions.request.background.process.title", new Object[0]), false, new AIRequestService$sendMessage$2(context, messages, consumer, null), $completion); } @DebugMetadata(f = "AIRequestService.kt", l = {27, 28}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.services.AIRequestService$sendMessage$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AIRequestService$sendMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label; AIRequestService$sendMessage$2(String $context, List<CompletableMessage> $messages, Function2<String, Continuation<? super Unit>, Object> $consumer, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #4
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 176, 0 -> 36, 1 -> 110, 2 -> 161
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: getstatic ai/grazie/model/llm/chat/LLMChat.Companion : Lai/grazie/model/llm/chat/LLMChat$Companion;
/*    */       //   43: new com/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$chat$1
/*    */       //   46: dup
/*    */       //   47: aload_0
/*    */       //   48: getfield $context : Ljava/lang/String;
/*    */       //   51: aload_0
/*    */       //   52: getfield this$0 : Lcom/intellij/ml/llm/core/chat/services/AIRequestService;
/*    */       //   55: aload_0
/*    */       //   56: getfield $messages : Ljava/util/List;
/*    */       //   59: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/services/AIRequestService;Ljava/util/List;)V
/*    */       //   62: checkcast kotlin/jvm/functions/Function1
/*    */       //   65: invokevirtual build : (Lkotlin/jvm/functions/Function1;)Lai/grazie/model/llm/chat/LLMChat;
/*    */       //   68: astore_2
/*    */       //   69: aload_0
/*    */       //   70: getfield this$0 : Lcom/intellij/ml/llm/core/chat/services/AIRequestService;
/*    */       //   73: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/chat/services/AIRequestService;)Lcom/intellij/openapi/project/Project;
/*    */       //   76: aload_2
/*    */       //   77: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs$Chat.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;
/*    */       //   80: invokevirtual getGPT4 : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*    */       //   83: iconst_1
/*    */       //   84: aconst_null
/*    */       //   85: iconst_0
/*    */       //   86: aload_0
/*    */       //   87: checkcast kotlin/coroutines/Continuation
/*    */       //   90: bipush #48
/*    */       //   92: aconst_null
/*    */       //   93: aload_0
/*    */       //   94: iconst_1
/*    */       //   95: putfield label : I
/*    */       //   98: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   101: dup
/*    */       //   102: aload #4
/*    */       //   104: if_acmpne -> 115
/*    */       //   107: aload #4
/*    */       //   109: areturn
/*    */       //   110: aload_1
/*    */       //   111: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   114: aload_1
/*    */       //   115: checkcast kotlinx/coroutines/flow/Flow
/*    */       //   118: astore_3
/*    */       //   119: aload_3
/*    */       //   120: dup
/*    */       //   121: ifnull -> 173
/*    */       //   124: new com/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$1
/*    */       //   127: dup
/*    */       //   128: aload_0
/*    */       //   129: getfield $consumer : Lkotlin/jvm/functions/Function2;
/*    */       //   132: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*    */       //   135: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */       //   138: aload_0
/*    */       //   139: checkcast kotlin/coroutines/Continuation
/*    */       //   142: aload_0
/*    */       //   143: iconst_2
/*    */       //   144: putfield label : I
/*    */       //   147: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   152: dup
/*    */       //   153: aload #4
/*    */       //   155: if_acmpne -> 166
/*    */       //   158: aload #4
/*    */       //   160: areturn
/*    */       //   161: aload_1
/*    */       //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   165: aload_1
/*    */       //   166: pop
/*    */       //   167: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   170: goto -> 175
/*    */       //   173: pop
/*    */       //   174: aconst_null
/*    */       //   175: areturn
/*    */       //   176: new java/lang/IllegalStateException
/*    */       //   179: dup
/*    */       //   180: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   182: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   185: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #18	-> 3
/*    */       //   #19	-> 40
/*    */       //   #27	-> 69
/*    */       //   #18	-> 107
/*    */       //   #28	-> 119
/*    */       //   #18	-> 158
/*    */       //   #28	-> 166
/*    */       //   #18	-> 176
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   69	32	2	chat	Lai/grazie/model/llm/chat/LLMChat;
/*    */       //   119	33	3	flow	Lkotlinx/coroutines/flow/Flow;
/*    */       //   40	136	0	this	Lcom/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2;
/*    */       //   40	136	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIRequestService$sendMessage$2> $completion) { return (Continuation<Unit>)new AIRequestService$sendMessage$2(this.$context, this.$messages, this.$consumer, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((AIRequestService$sendMessage$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"}) @SourceDebugExtension({"SMAP\nAIRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$chat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$sendMessage$2$chat$1\n*L\n23#1:57,2\n*E\n"}) static final class AIRequestService$sendMessage$2$chat$1 extends Lambda implements Function1<LLMChat.Builder, Unit> {
/* 20 */       public final void invoke(@NotNull LLMChat.Builder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); if (this.$context != null) {
/* 21 */           $this$build.message(LLMChatRole.System, this.$context);
/*    */         }
/* 23 */         List list = AIRequestService.this.getFilteredMessages(this.$messages, 1); AIRequestService aIRequestService = AIRequestService.this; int $i$f$forEach = 0;
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
/* 57 */         Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); CompletableMessage it = (CompletableMessage)element$iv; int $i$a$-forEach-AIRequestService$sendMessage$2$chat$1$1 = 0; $this$build.message(aIRequestService.toLLMChatRole(it.getAuthor()), it.getText()); }  } AIRequestService$sendMessage$2$chat$1(AIRequestService $receiver, List<CompletableMessage> $messages) { super(1); } } } @Nullable public final Object generateDialogTitle(@NotNull String prompt, @NotNull List messages, @NotNull Function2 consumer, @NotNull Continuation<? super Unit> paramContinuation) { // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$1
/*    */     //   13: astore #8
/*    */     //   15: aload #8
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/services/AIRequestService;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #8
/*    */     //   53: aload #8
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #7
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #9
/*    */     //   65: aload #8
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 250, 0 -> 96, 1 -> 166, 2 -> 232
/*    */     //   96: aload #7
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: getstatic ai/grazie/model/llm/chat/LLMChat.Companion : Lai/grazie/model/llm/chat/LLMChat$Companion;
/*    */     //   104: new com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$chat$1
/*    */     //   107: dup
/*    */     //   108: aload_0
/*    */     //   109: aload_2
/*    */     //   110: aload_1
/*    */     //   111: invokespecial <init> : (Lcom/intellij/ml/llm/core/chat/services/AIRequestService;Ljava/util/List;Ljava/lang/String;)V
/*    */     //   114: checkcast kotlin/jvm/functions/Function1
/*    */     //   117: invokevirtual build : (Lkotlin/jvm/functions/Function1;)Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   120: astore #5
/*    */     //   122: aload_0
/*    */     //   123: getfield project : Lcom/intellij/openapi/project/Project;
/*    */     //   126: aload #5
/*    */     //   128: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs$Chat.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;
/*    */     //   131: invokevirtual getGPT4 : ()Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   134: iconst_0
/*    */     //   135: aconst_null
/*    */     //   136: iconst_0
/*    */     //   137: aload #8
/*    */     //   139: bipush #56
/*    */     //   141: aconst_null
/*    */     //   142: aload #8
/*    */     //   144: aload_3
/*    */     //   145: putfield L$0 : Ljava/lang/Object;
/*    */     //   148: aload #8
/*    */     //   150: iconst_1
/*    */     //   151: putfield label : I
/*    */     //   154: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   157: dup
/*    */     //   158: aload #9
/*    */     //   160: if_acmpne -> 182
/*    */     //   163: aload #9
/*    */     //   165: areturn
/*    */     //   166: aload #8
/*    */     //   168: getfield L$0 : Ljava/lang/Object;
/*    */     //   171: checkcast kotlin/jvm/functions/Function2
/*    */     //   174: astore_3
/*    */     //   175: aload #7
/*    */     //   177: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   180: aload #7
/*    */     //   182: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   185: astore #6
/*    */     //   187: aload #6
/*    */     //   189: dup
/*    */     //   190: ifnull -> 244
/*    */     //   193: new com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$2
/*    */     //   196: dup
/*    */     //   197: aload_3
/*    */     //   198: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   201: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */     //   204: aload #8
/*    */     //   206: aload #8
/*    */     //   208: aconst_null
/*    */     //   209: putfield L$0 : Ljava/lang/Object;
/*    */     //   212: aload #8
/*    */     //   214: iconst_2
/*    */     //   215: putfield label : I
/*    */     //   218: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   223: dup
/*    */     //   224: aload #9
/*    */     //   226: if_acmpne -> 239
/*    */     //   229: aload #9
/*    */     //   231: areturn
/*    */     //   232: aload #7
/*    */     //   234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   237: aload #7
/*    */     //   239: pop
/*    */     //   240: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   243: areturn
/*    */     //   244: pop
/*    */     //   245: nop
/*    */     //   246: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   249: areturn
/*    */     //   250: new java/lang/IllegalStateException
/*    */     //   253: dup
/*    */     //   254: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   256: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   259: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 63
/*    */     //   #35	-> 101
/*    */     //   #41	-> 122
/*    */     //   #34	-> 163
/*    */     //   #42	-> 187
/*    */     //   #34	-> 229
/*    */     //   #45	-> 239
/*    */     //   #42	-> 244
/*    */     //   #45	-> 246
/*    */     //   #34	-> 250
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	56	0	this	Lcom/intellij/ml/llm/core/chat/services/AIRequestService;
/*    */     //   101	21	1	prompt	Ljava/lang/String;
/*    */     //   101	21	2	messages	Ljava/util/List;
/*    */     //   101	65	3	consumer	Lkotlin/jvm/functions/Function2;
/*    */     //   175	48	3	consumer	Lkotlin/jvm/functions/Function2;
/*    */     //   122	35	5	chat	Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   187	36	6	flow	Lkotlinx/coroutines/flow/Flow;
/*    */     //   53	197	8	$continuation	Lkotlin/coroutines/Continuation;
/* 57 */     //   60	190	7	$result	Ljava/lang/Object; } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "invoke"}) @SourceDebugExtension({"SMAP\nAIRequestService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$chat$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 AIRequestService.kt\ncom/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$chat$1\n*L\n36#1:57,2\n*E\n"}) static final class AIRequestService$generateDialogTitle$chat$1 extends Lambda implements Function1<LLMChat.Builder, Unit> { public final void invoke(@NotNull LLMChat.Builder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); List list = AIRequestService.this.getFilteredMessages(this.$messages, 2); AIRequestService aIRequestService = AIRequestService.this; int $i$f$forEach = 0; Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); CompletableMessage it = (CompletableMessage)element$iv; int $i$a$-forEach-AIRequestService$generateDialogTitle$chat$1$1 = 0;
/*    */         $this$build.message(aIRequestService.toLLMChatRole(it.getAuthor()), it.getText()); }
/*    */       
/*    */       $this$build.message(LLMChatRole.User, this.$prompt); }
/*    */ 
/*    */     
/*    */     AIRequestService$generateDialogTitle$chat$1(List<CompletableMessage> $messages, String $prompt) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "responsePart", "", "emit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*    */   static final class AIRequestService$generateDialogTitle$2<T> implements FlowCollector {
/*    */     @Nullable
/*    */     public final Object emit(@NotNull String responsePart, @NotNull Continuation $completion) {
/*    */       if (this.$consumer.invoke(responsePart, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*    */         return this.$consumer.invoke(responsePart, $completion); 
/*    */       this.$consumer.invoke(responsePart, $completion);
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */     
/*    */     AIRequestService$generateDialogTitle$2(Function2<String, Continuation<? super Unit>, Object> $consumer) {}
/*    */   }
/*    */   
/*    */   private final List<CompletableMessage> getFilteredMessages(List messages, int extra) {
/*    */     return CollectionsKt.takeLast(messages, 32 - extra);
/*    */   }
/*    */   
/*    */   private final LLMChatRole toLLMChatRole(ChatMessageAuthor $this$toLLMChatRole) {
/*    */     switch (WhenMappings.$EnumSwitchMapping$0[$this$toLLMChatRole.ordinal()]) {
/*    */       case 1:
/*    */       
/*    */       case 2:
/*    */       
/*    */     } 
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AIRequestService.kt", l = {41, 42}, i = {0}, s = {"L$0"}, n = {"consumer"}, m = "generateDialogTitle", c = "com.intellij.ml.llm.core.chat.services.AIRequestService")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class AIRequestService$generateDialogTitle$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     AIRequestService$generateDialogTitle$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AIRequestService.this.generateDialogTitle(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIRequestService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */