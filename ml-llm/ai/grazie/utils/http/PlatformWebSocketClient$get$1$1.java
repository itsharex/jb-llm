/*    */ package ai.grazie.utils.http;
/*    */ import io.ktor.client.plugins.websocket.WebSockets;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "invoke"})
/*    */ final class null extends Lambda implements Function1<WebSockets.Config, Unit> {
/*    */   public final void invoke(@NotNull WebSockets.Config $this$install) {
/* 11 */     Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setPingInterval(30000L);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/PlatformWebSocketClient$get$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */