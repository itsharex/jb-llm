/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.plugins.HttpTimeout;
/*    */ import io.ktor.client.plugins.websocket.DefaultClientWebSocketSession;
/*    */ import java.util.Map;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020$\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b&\030\0002\0020\001:\002\032\033B\r\022\006\020\002\032\0020\003¢\006\002\020\004J¹\001\020\005\032\0020\0062\006\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\001\020\013\032\001\b\001\022\004\022\0020\r\022\031\022\027\022\004\022\0020\0170\016¢\006\f\b\020\022\b\b\021\022\004\b\b(\022\022\031\022\027\022\004\022\0020\0170\023¢\006\f\b\020\022\b\b\021\022\004\b\b(\024\022)\022'\b\001\022\n\022\b\022\004\022\0020\0060\026\022\006\022\004\030\0010\0010\025¢\006\f\b\020\022\b\b\021\022\004\b\b(\027\022\n\022\b\022\004\022\0020\0060\026\022\006\022\004\030\0010\0010\f¢\006\002\b\030H@ø\001\000¢\006\002\020\031R\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\034"}, d2 = {"Lai/grazie/utils/http/KtorWebSocketClient;", "", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "connect", "", "url", "", "headers", "", "process", "Lkotlin/Function5;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/websocket/Frame;", "Lkotlin/ParameterName;", "name", "incoming", "Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "close", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "WithExtendedTimeout", "utils-ktor"})
/*    */ public abstract class KtorWebSocketClient {
/* 13 */   public KtorWebSocketClient(@NotNull HttpClient client) { this.client = client; } @NotNull private final HttpClient client; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/http/KtorWebSocketClient$Default;", "Lai/grazie/utils/http/KtorWebSocketClient;", "()V", "utils-ktor"}) public static final class Default extends KtorWebSocketClient { @NotNull
/* 14 */     public static final Default INSTANCE = new Default(); private Default() { super(PlatformWebSocketClient.INSTANCE.get().config(null.INSTANCE)); }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/http/KtorWebSocketClient$WithExtendedTimeout;", "Lai/grazie/utils/http/KtorWebSocketClient;", "()V", "utils-ktor"})
/*    */   public static final class WithExtendedTimeout extends KtorWebSocketClient { @NotNull
/*    */     public static final WithExtendedTimeout INSTANCE = new WithExtendedTimeout();
/*    */     
/*    */     private WithExtendedTimeout() {
/* 22 */       super(PlatformWebSocketClient.INSTANCE.get().config(null.INSTANCE));
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object connect(@NotNull String url, @NotNull Map<String, String> headers, @NotNull Function5<? super CoroutineScope, ? super ReceiveChannel<? extends Frame>, ? super SendChannel<? super Frame>, ? super Function1<? super Continuation<? super Unit>, ? extends Object>, ? super Continuation<? super Unit>, ? extends Object> process, @NotNull Continuation $completion)
/*    */   {
/* 34 */     if (BuildersKt.webSocket(this.client, new KtorWebSocketClient$connect$2(url, headers), new KtorWebSocketClient$connect$3(process, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.webSocket(this.client, new KtorWebSocketClient$connect$2(url, headers), new KtorWebSocketClient$connect$3(process, null), $completion);  BuildersKt.webSocket(this.client, new KtorWebSocketClient$connect$2(url, headers), new KtorWebSocketClient$connect$3(process, null), $completion); return Unit.INSTANCE; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/request/HttpRequestBuilder;", "invoke"})
/* 35 */   static final class KtorWebSocketClient$connect$2 extends Lambda implements Function1<HttpRequestBuilder, Unit> { public final void invoke(@NotNull HttpRequestBuilder $this$webSocket) { Intrinsics.checkNotNullParameter($this$webSocket, "$this$webSocket"); HttpRequestKt.url($this$webSocket, this.$url);
/* 36 */       HttpRequestKt.headers((HttpMessageBuilder)$this$webSocket, new Function1<HeadersBuilder, Unit>(this.$headers) {
/* 37 */             public final void invoke(@NotNull HeadersBuilder $this$headers) { Intrinsics.checkNotNullParameter($this$headers, "$this$headers"); for (Map.Entry<String, String> entry : this.$headers.entrySet()) { String key = (String)entry.getKey(), value = (String)entry.getValue();
/* 38 */                 $this$headers.append(key, value); }
/*    */                }
/*    */           });
/* 41 */       $this$webSocket.setMethod(HttpMethod.Companion.getGet()); } KtorWebSocketClient$connect$2(String $url, Map<String, String> $headers) { super(1); } } @DebugMetadata(f = "KtorWebSocketClient.kt", l = {43}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.KtorWebSocketClient$connect$3") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;"}) static final class KtorWebSocketClient$connect$3 extends SuspendLambda implements Function2<DefaultClientWebSocketSession, Continuation<? super Unit>, Object> { int label; KtorWebSocketClient$connect$3(Function5<CoroutineScope, ReceiveChannel<? extends Frame>, SendChannel<? super Frame>, Function1<? super Continuation<? super Unit>, ? extends Object>, Continuation<? super Unit>, Object> $process, Continuation $completion) { super(2, $completion); }
/* 42 */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { DefaultClientWebSocketSession $this$webSocket; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$webSocket = (DefaultClientWebSocketSession)this.L$0;
/* 43 */           this.label = 1; if (this.$process.invoke($this$webSocket, $this$webSocket.getIncoming(), $this$webSocket.getOutgoing(), new Function1<Continuation<? super Unit>, Object>($this$webSocket, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$$this$webSocket, $completion); } @Nullable public final Object invoke(@Nullable Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }this) == object) return object;  this.$process.invoke($this$webSocket, $this$webSocket.getIncoming(), $this$webSocket.getOutgoing(), new Function1<Continuation<? super Unit>, Object>($this$webSocket, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$$this$webSocket, $completion); } @Nullable public final Object invoke(@Nullable Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }this);
/* 44 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super KtorWebSocketClient$connect$3> $completion) {
/*    */       KtorWebSocketClient$connect$3 ktorWebSocketClient$connect$3 = new KtorWebSocketClient$connect$3(this.$process, $completion);
/*    */       ktorWebSocketClient$connect$3.L$0 = value;
/*    */       return (Continuation<Unit>)ktorWebSocketClient$connect$3;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull DefaultClientWebSocketSession p1, @Nullable Continuation<?> p2) {
/*    */       return ((KtorWebSocketClient$connect$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/KtorWebSocketClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */