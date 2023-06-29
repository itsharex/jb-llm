/*    */ package ai.grazie.utils.http;
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.websocket.WebSockets;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/*    */ final class PlatformWebSocketClient$get$1 extends Lambda implements Function1<HttpClientConfig<CIOEngineConfig>, Unit> {
/*    */   public final void invoke(@NotNull HttpClientConfig $this$HttpClient) {
/* 10 */     Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); $this$HttpClient.install((HttpClientPlugin)WebSockets.Plugin, null.INSTANCE);
/*    */   }
/*    */   
/*    */   public static final PlatformWebSocketClient$get$1 INSTANCE = new PlatformWebSocketClient$get$1();
/*    */   
/*    */   PlatformWebSocketClient$get$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/PlatformWebSocketClient$get$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */