/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.plugins.websocket.WebSockets;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/utils/http/PlatformWebSocketClient;", "", "()V", "get", "Lio/ktor/client/HttpClient;", "utils-ktor"})
/*    */ public final class PlatformWebSocketClient {
/*    */   @NotNull
/*  9 */   public final HttpClient get() { return HttpClientKt.HttpClient((HttpClientEngineFactory)CIO.INSTANCE, PlatformWebSocketClient$get$1.INSTANCE); } @NotNull public static final PlatformWebSocketClient INSTANCE = new PlatformWebSocketClient(); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/* 10 */   static final class PlatformWebSocketClient$get$1 extends Lambda implements Function1<HttpClientConfig<CIOEngineConfig>, Unit> { public static final PlatformWebSocketClient$get$1 INSTANCE = new PlatformWebSocketClient$get$1(); public final void invoke(@NotNull HttpClientConfig $this$HttpClient) { Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); $this$HttpClient.install((HttpClientPlugin)WebSockets.Plugin, null.INSTANCE); }
/*    */ 
/*    */     
/*    */     PlatformWebSocketClient$get$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/PlatformWebSocketClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */