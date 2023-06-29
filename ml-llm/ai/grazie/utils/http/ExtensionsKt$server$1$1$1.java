/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.engine.cio.EndpointConfig;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/engine/cio/EndpointConfig;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<EndpointConfig, Unit>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final void invoke(@NotNull EndpointConfig $this$endpoint) {
/* 21 */     Intrinsics.checkNotNullParameter($this$endpoint, "$this$endpoint"); $this$endpoint.setMaxConnectionsPerRoute(1024);
/* 22 */     $this$endpoint.setPipelineMaxSize(100);
/* 23 */     $this$endpoint.setKeepAliveTime(10000L);
/* 24 */     $this$endpoint.setConnectTimeout(10000L);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/ExtensionsKt$server$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */