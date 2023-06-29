/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.ChatRecipesKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.CoroutineScopeKt;
/*    */ import kotlinx.coroutines.Job;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\030\0002\b\022\004\022\0020\0020\001B\037\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\b¢\006\002\020\tJ\n\020\020\032\004\030\0010\021H\026R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\n\020\013R\016\020\005\032\0020\006X\004¢\006\002\n\000R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "Lai/grazie/model/llm/chat/LLMChat;", "input", "", "project", "Lcom/intellij/openapi/project/Project;", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Ljava/lang/String;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)V", "getConsumer", "()Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "sendSync", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "intellij.ml.llm"})
/*    */ public final class GrazieChatCompletionRequest extends LLMBaseRequest<LLMChat> {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/*    */   @Nullable
/* 22 */   public final LLMStreamingRequestConsumer getConsumer() { return this.consumer; } @Nullable private final LLMStreamingRequestConsumer consumer; @NotNull
/* 23 */   private final CoroutineScope scope; public GrazieChatCompletionRequest(@NotNull String input, @NotNull Project project, @Nullable LLMStreamingRequestConsumer consumer) { super(ChatRecipesKt.toGrazieChat(ChatRecipesKt.customCompletionChat(input))); this.project = project;
/*    */     this.consumer = consumer;
/* 25 */     this.scope = CoroutineScopeKt.CoroutineScope((CoroutineContext)EmptyCoroutineContext.INSTANCE); } @NotNull public final CoroutineScope getScope() { return this.scope; } @Nullable
/*    */   public LLMBaseResponse sendSync() {
/* 27 */     if (this.consumer == null) {
/* 28 */       String result = (String)CoroutinesKt.runBlockingCancellable(new GrazieChatCompletionRequest$sendSync$result$1(null));
/*    */ 
/*    */       
/* 31 */       return (result != null) ? new GrazieResponse(result) : null;
/*    */     } 
/*    */     
/* 34 */     Job job = BuildersKt.launch$default(this.scope, null, null, new GrazieChatCompletionRequest$sendSync$job$1(null), 3, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     this.consumer.addFinishListener(new GrazieChatCompletionRequest$sendSync$1(this));
/*    */ 
/*    */ 
/*    */     
/* 44 */     return null;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieChatCompletionRequest.kt", l = {29, 29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieChatCompletionRequest$sendSync$result$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class GrazieChatCompletionRequest$sendSync$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
/*    */     int label;
/*    */     
/*    */     GrazieChatCompletionRequest$sendSync$result$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_2
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 154, 0 -> 36, 1 -> 83, 2 -> 117
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */       //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;)Lcom/intellij/openapi/project/Project;
/*    */       //   47: aload_0
/*    */       //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */       //   51: invokevirtual getBody : ()Ljava/lang/Object;
/*    */       //   54: checkcast ai/grazie/model/llm/chat/LLMChat
/*    */       //   57: aconst_null
/*    */       //   58: iconst_0
/*    */       //   59: aconst_null
/*    */       //   60: iconst_0
/*    */       //   61: aload_0
/*    */       //   62: checkcast kotlin/coroutines/Continuation
/*    */       //   65: bipush #60
/*    */       //   67: aconst_null
/*    */       //   68: aload_0
/*    */       //   69: iconst_1
/*    */       //   70: putfield label : I
/*    */       //   73: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   76: dup
/*    */       //   77: aload_2
/*    */       //   78: if_acmpne -> 88
/*    */       //   81: aload_2
/*    */       //   82: areturn
/*    */       //   83: aload_1
/*    */       //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   87: aload_1
/*    */       //   88: checkcast kotlinx/coroutines/flow/Flow
/*    */       //   91: dup
/*    */       //   92: ifnull -> 151
/*    */       //   95: aconst_null
/*    */       //   96: aload_0
/*    */       //   97: checkcast kotlin/coroutines/Continuation
/*    */       //   100: iconst_1
/*    */       //   101: aconst_null
/*    */       //   102: aload_0
/*    */       //   103: iconst_2
/*    */       //   104: putfield label : I
/*    */       //   107: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   110: dup
/*    */       //   111: aload_2
/*    */       //   112: if_acmpne -> 122
/*    */       //   115: aload_2
/*    */       //   116: areturn
/*    */       //   117: aload_1
/*    */       //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   121: aload_1
/*    */       //   122: checkcast java/util/List
/*    */       //   125: dup
/*    */       //   126: ifnull -> 151
/*    */       //   129: checkcast java/lang/Iterable
/*    */       //   132: ldc ''
/*    */       //   134: checkcast java/lang/CharSequence
/*    */       //   137: aconst_null
/*    */       //   138: aconst_null
/*    */       //   139: iconst_0
/*    */       //   140: aconst_null
/*    */       //   141: aconst_null
/*    */       //   142: bipush #62
/*    */       //   144: aconst_null
/*    */       //   145: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */       //   148: goto -> 153
/*    */       //   151: pop
/*    */       //   152: aconst_null
/*    */       //   153: areturn
/*    */       //   154: new java/lang/IllegalStateException
/*    */       //   157: dup
/*    */       //   158: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   160: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   163: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #28	-> 3
/*    */       //   #29	-> 40
/*    */       //   #28	-> 81
/*    */       //   #29	-> 88
/*    */       //   #28	-> 115
/*    */       //   #29	-> 122
/*    */       //   #28	-> 154
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   40	114	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$result$1;
/*    */       //   40	114	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieChatCompletionRequest$sendSync$result$1> $completion) {
/*    */       return (Continuation<Unit>)new GrazieChatCompletionRequest$sendSync$result$1($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((GrazieChatCompletionRequest$sendSync$result$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GrazieChatCompletionRequest.kt", l = {35, 36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.models.grazie.GrazieChatCompletionRequest$sendSync$job$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class GrazieChatCompletionRequest$sendSync$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     GrazieChatCompletionRequest$sendSync$job$1(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore_3
/*    */       //   4: aload_0
/*    */       //   5: getfield label : I
/*    */       //   8: tableswitch default -> 146, 0 -> 36, 1 -> 83, 2 -> 132
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */       //   44: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;)Lcom/intellij/openapi/project/Project;
/*    */       //   47: aload_0
/*    */       //   48: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */       //   51: invokevirtual getBody : ()Ljava/lang/Object;
/*    */       //   54: checkcast ai/grazie/model/llm/chat/LLMChat
/*    */       //   57: aconst_null
/*    */       //   58: iconst_0
/*    */       //   59: aconst_null
/*    */       //   60: iconst_0
/*    */       //   61: aload_0
/*    */       //   62: checkcast kotlin/coroutines/Continuation
/*    */       //   65: bipush #60
/*    */       //   67: aconst_null
/*    */       //   68: aload_0
/*    */       //   69: iconst_1
/*    */       //   70: putfield label : I
/*    */       //   73: invokestatic sendGrazieChatRequest$default : (Lcom/intellij/openapi/project/Project;Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/attributes/Attributes;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */       //   76: dup
/*    */       //   77: aload_3
/*    */       //   78: if_acmpne -> 88
/*    */       //   81: aload_3
/*    */       //   82: areturn
/*    */       //   83: aload_1
/*    */       //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   87: aload_1
/*    */       //   88: checkcast kotlinx/coroutines/flow/Flow
/*    */       //   91: astore_2
/*    */       //   92: aload_2
/*    */       //   93: dup
/*    */       //   94: ifnull -> 141
/*    */       //   97: new com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$job$1$1
/*    */       //   100: dup
/*    */       //   101: aload_0
/*    */       //   102: getfield this$0 : Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;
/*    */       //   105: invokespecial <init> : (Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest;)V
/*    */       //   108: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */       //   111: aload_0
/*    */       //   112: checkcast kotlin/coroutines/Continuation
/*    */       //   115: aload_0
/*    */       //   116: iconst_2
/*    */       //   117: putfield label : I
/*    */       //   120: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   125: dup
/*    */       //   126: aload_3
/*    */       //   127: if_acmpne -> 137
/*    */       //   130: aload_3
/*    */       //   131: areturn
/*    */       //   132: aload_1
/*    */       //   133: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   136: aload_1
/*    */       //   137: pop
/*    */       //   138: goto -> 142
/*    */       //   141: pop
/*    */       //   142: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   145: areturn
/*    */       //   146: new java/lang/IllegalStateException
/*    */       //   149: dup
/*    */       //   150: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   152: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   155: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #34	-> 3
/*    */       //   #35	-> 40
/*    */       //   #34	-> 81
/*    */       //   #36	-> 92
/*    */       //   #34	-> 130
/*    */       //   #36	-> 137
/*    */       //   #39	-> 142
/*    */       //   #34	-> 146
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   92	33	2	sendRequestGrazie	Lkotlinx/coroutines/flow/Flow;
/*    */       //   40	106	0	this	Lcom/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest$sendSync$job$1;
/*    */       //   40	106	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieChatCompletionRequest$sendSync$job$1> $completion) {
/*    */       return (Continuation<Unit>)new GrazieChatCompletionRequest$sendSync$job$1($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((GrazieChatCompletionRequest$sendSync$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class GrazieChatCompletionRequest$sendSync$1 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() {
/*    */       Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
/*    */       CoroutineScopeKt.cancel$default(GrazieChatCompletionRequest.this.getScope(), null, 1, null);
/*    */     }
/*    */     
/*    */     GrazieChatCompletionRequest$sendSync$1(GrazieChatCompletionRequest $receiver) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieChatCompletionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */