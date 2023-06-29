/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.engine.cio.CIOEngineConfig;
/*    */ import io.ktor.client.engine.cio.CIOEngineConfigKt;
/*    */ import io.ktor.client.engine.cio.EndpointConfig;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/*    */ final class null extends Lambda implements Function1<CIOEngineConfig, Unit> {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final void invoke(@NotNull CIOEngineConfig $this$engine) {
/* 18 */     Intrinsics.checkNotNullParameter($this$engine, "$this$engine"); $this$engine.setMaxConnectionsCount(1024);
/*    */     
/* 20 */     CIOEngineConfigKt.endpoint($this$engine, null.INSTANCE);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/ExtensionsKt$server$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */