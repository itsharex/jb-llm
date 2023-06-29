/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.HttpClientPlugin;
/*    */ import io.ktor.client.plugins.HttpTimeout;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/http/KtorWebSocketClient$WithExtendedTimeout;", "Lai/grazie/utils/http/KtorWebSocketClient;", "()V", "utils-ktor"})
/*    */ public final class WithExtendedTimeout
/*    */   extends KtorWebSocketClient
/*    */ {
/*    */   @NotNull
/*    */   public static final WithExtendedTimeout INSTANCE = new WithExtendedTimeout();
/*    */   
/*    */   private WithExtendedTimeout() {
/* 22 */     super(PlatformWebSocketClient.INSTANCE.get().config(null.INSTANCE));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/KtorWebSocketClient$WithExtendedTimeout.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */