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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*    */ final class JsonKtorHTTPClient$Companion$default$1
/*    */   extends Lambda
/*    */   implements Function1<HttpClientConfig<?>, Unit>
/*    */ {
/*    */   public static final JsonKtorHTTPClient$Companion$default$1 INSTANCE = new JsonKtorHTTPClient$Companion$default$1();
/*    */   
/*    */   public final void invoke(@NotNull HttpClientConfig $this$config) {
/* 46 */     Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeout.Plugin, null.INSTANCE);
/*    */   }
/*    */   
/*    */   JsonKtorHTTPClient$Companion$default$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$Companion$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */