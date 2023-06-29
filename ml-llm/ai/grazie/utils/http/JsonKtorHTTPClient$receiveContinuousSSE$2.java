/*     */ package ai.grazie.utils.http;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendFunction;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {166}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$receiveContinuousSSE$2")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*     */ final class JsonKtorHTTPClient$receiveContinuousSSE$2
/*     */   extends SuspendLambda
/*     */   implements Function2<FlowCollector<? super ServerSentEvent>, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   JsonKtorHTTPClient$receiveContinuousSSE$2(HttpRequestBuilder $builder, boolean $reconnect, Function2<ServerSentEvent, Continuation<? super Boolean>, Object> $isEnd, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     FlowCollector<? super ServerSentEvent> $this$flow;
/* 166 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$flow = (FlowCollector)this.L$0; this.label = 1; if (JsonKtorHTTPClient.access$handleExceptions(JsonKtorHTTPClient.this, this.$builder, new Function2<HttpRequestBuilder, Continuation<? super Unit>, Object>(this.$reconnect, $this$flow, this.$isEnd, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore_3
/*     */                 //   4: aload_0
/*     */                 //   5: getfield label : I
/*     */                 //   8: tableswitch default -> 123, 0 -> 32, 1 -> 113
/*     */                 //   32: aload_1
/*     */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   36: aload_0
/*     */                 //   37: getfield L$0 : Ljava/lang/Object;
/*     */                 //   40: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */                 //   43: astore_2
/*     */                 //   44: aload_0
/*     */                 //   45: getfield this$0 : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */                 //   48: invokestatic access$getClient$p : (Lai/grazie/utils/http/JsonKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */                 //   51: aload_2
/*     */                 //   52: iconst_1
/*     */                 //   53: aload_0
/*     */                 //   54: getfield $reconnect : Z
/*     */                 //   57: ifne -> 64
/*     */                 //   60: iconst_1
/*     */                 //   61: goto -> 65
/*     */                 //   64: iconst_0
/*     */                 //   65: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$1
/*     */                 //   68: dup
/*     */                 //   69: aload_0
/*     */                 //   70: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*     */                 //   73: aconst_null
/*     */                 //   74: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */                 //   77: checkcast kotlin/jvm/functions/Function2
/*     */                 //   80: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$2
/*     */                 //   83: dup
/*     */                 //   84: aload_0
/*     */                 //   85: getfield $$this$flow : Lkotlinx/coroutines/flow/FlowCollector;
/*     */                 //   88: invokespecial <init> : (Ljava/lang/Object;)V
/*     */                 //   91: checkcast kotlin/jvm/functions/Function2
/*     */                 //   94: aload_0
/*     */                 //   95: checkcast kotlin/coroutines/Continuation
/*     */                 //   98: aload_0
/*     */                 //   99: iconst_1
/*     */                 //   100: putfield label : I
/*     */                 //   103: invokestatic readSse : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   106: dup
/*     */                 //   107: aload_3
/*     */                 //   108: if_acmpne -> 118
/*     */                 //   111: aload_3
/*     */                 //   112: areturn
/*     */                 //   113: aload_1
/*     */                 //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   117: aload_1
/*     */                 //   118: pop
/*     */                 //   119: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   122: areturn
/*     */                 //   123: new java/lang/IllegalStateException
/*     */                 //   126: dup
/*     */                 //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   132: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #166	-> 3
/*     */                 //   #166	-> 44
/*     */                 //   #166	-> 111
/*     */                 //   #166	-> 118
/*     */                 //   #166	-> 123
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   44	20	2	it	Lio/ktor/client/request/HttpRequestBuilder;
/*     */                 //   36	87	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1;
/* 166 */                 //   36	87	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { Function2<HttpRequestBuilder, Continuation<? super Unit>, Object> function2 = new Function2<>(JsonKtorHTTPClient.this, this.$reconnect, this.$$this$flow, this.$isEnd, $completion); function2.L$0 = value; return (Continuation)function2; } @Nullable public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  JsonKtorHTTPClient.access$handleExceptions(JsonKtorHTTPClient.this, this.$builder, new Function2<HttpRequestBuilder, Continuation<? super Unit>, Object>(this.$reconnect, $this$flow, this.$isEnd, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */                 //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                 //   3: astore_3
/*     */                 //   4: aload_0
/*     */                 //   5: getfield label : I
/*     */                 //   8: tableswitch default -> 123, 0 -> 32, 1 -> 113
/*     */                 //   32: aload_1
/*     */                 //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   36: aload_0
/*     */                 //   37: getfield L$0 : Ljava/lang/Object;
/*     */                 //   40: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */                 //   43: astore_2
/*     */                 //   44: aload_0
/*     */                 //   45: getfield this$0 : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */                 //   48: invokestatic access$getClient$p : (Lai/grazie/utils/http/JsonKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */                 //   51: aload_2
/*     */                 //   52: iconst_1
/*     */                 //   53: aload_0
/*     */                 //   54: getfield $reconnect : Z
/*     */                 //   57: ifne -> 64
/*     */                 //   60: iconst_1
/*     */                 //   61: goto -> 65
/*     */                 //   64: iconst_0
/*     */                 //   65: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$1
/*     */                 //   68: dup
/*     */                 //   69: aload_0
/*     */                 //   70: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*     */                 //   73: aconst_null
/*     */                 //   74: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */                 //   77: checkcast kotlin/jvm/functions/Function2
/*     */                 //   80: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$2
/*     */                 //   83: dup
/*     */                 //   84: aload_0
/*     */                 //   85: getfield $$this$flow : Lkotlinx/coroutines/flow/FlowCollector;
/*     */                 //   88: invokespecial <init> : (Ljava/lang/Object;)V
/*     */                 //   91: checkcast kotlin/jvm/functions/Function2
/*     */                 //   94: aload_0
/*     */                 //   95: checkcast kotlin/coroutines/Continuation
/*     */                 //   98: aload_0
/*     */                 //   99: iconst_1
/*     */                 //   100: putfield label : I
/*     */                 //   103: invokestatic readSse : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                 //   106: dup
/*     */                 //   107: aload_3
/*     */                 //   108: if_acmpne -> 118
/*     */                 //   111: aload_3
/*     */                 //   112: areturn
/*     */                 //   113: aload_1
/*     */                 //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                 //   117: aload_1
/*     */                 //   118: pop
/*     */                 //   119: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                 //   122: areturn
/*     */                 //   123: new java/lang/IllegalStateException
/*     */                 //   126: dup
/*     */                 //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                 //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */                 //   132: athrow
/*     */                 // Line number table:
/*     */                 //   Java source line number -> byte code offset
/*     */                 //   #166	-> 3
/*     */                 //   #166	-> 44
/*     */                 //   #166	-> 111
/*     */                 //   #166	-> 118
/*     */                 //   #166	-> 123
/*     */                 // Local variable table:
/*     */                 //   start	length	slot	name	descriptor
/*     */                 //   44	20	2	it	Lio/ktor/client/request/HttpRequestBuilder;
/*     */                 //   36	87	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1;
/* 166 */                 //   36	87	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { Function2<HttpRequestBuilder, Continuation<? super Unit>, Object> function2 = new Function2<>(JsonKtorHTTPClient.this, this.$reconnect, this.$$this$flow, this.$isEnd, $completion); function2.L$0 = value; return (Continuation)function2; } @Nullable public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$receiveContinuousSSE$2> $completion) {
/*     */     JsonKtorHTTPClient$receiveContinuousSSE$2 jsonKtorHTTPClient$receiveContinuousSSE$2 = new JsonKtorHTTPClient$receiveContinuousSSE$2(this.$builder, this.$reconnect, this.$isEnd, $completion);
/*     */     jsonKtorHTTPClient$receiveContinuousSSE$2.L$0 = value;
/*     */     return (Continuation<Unit>)jsonKtorHTTPClient$receiveContinuousSSE$2;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull FlowCollector p1, @Nullable Continuation<?> p2) {
/*     */     return ((JsonKtorHTTPClient$receiveContinuousSSE$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */