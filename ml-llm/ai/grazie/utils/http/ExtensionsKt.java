/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.engine.cio.CIOEngineConfig;
/*    */ import io.ktor.client.engine.cio.EndpointConfig;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\000\032\n\020\n\032\0020\013*\0020\f\"\037\020\000\032\0020\001*\0020\0028FX\002¢\006\f\n\004\b\005\020\006\032\004\b\003\020\004\"\037\020\007\032\0020\001*\0020\0028FX\002¢\006\f\n\004\b\t\020\006\032\004\b\b\020\004¨\006\r"}, d2 = {"Default", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "Lai/grazie/utils/http/JsonKtorHTTPClient$Server;", "getDefault", "(Lai/grazie/utils/http/JsonKtorHTTPClient$Server;)Lai/grazie/utils/http/JsonKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "server", "Lio/ktor/client/HttpClient;", "Lai/grazie/utils/http/PlatformHttpClient;", "utils-ktor"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/* 16 */   public static final HttpClient server(@NotNull PlatformHttpClient $this$server) { Intrinsics.checkNotNullParameter($this$server, "<this>"); return HttpClientKt.HttpClient((HttpClientEngineFactory)CIO.INSTANCE, ExtensionsKt$server$1.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/* 17 */   static final class ExtensionsKt$server$1 extends Lambda implements Function1<HttpClientConfig<CIOEngineConfig>, Unit> { public static final ExtensionsKt$server$1 INSTANCE = new ExtensionsKt$server$1(); public final void invoke(@NotNull HttpClientConfig $this$HttpClient) { Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); $this$HttpClient.engine(null.INSTANCE); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     ExtensionsKt$server$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 30 */   private static final Lazy Default$delegate = LazyKt.lazy(ExtensionsKt$Default$2.INSTANCE); @NotNull public static final JsonKtorHTTPClient getDefault(@NotNull JsonKtorHTTPClient.Server $this$Default) { Intrinsics.checkNotNullParameter($this$Default, "<this>"); Lazy lazy = Default$delegate; return (JsonKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"}) static final class ExtensionsKt$Default$2 extends Lambda implements Function0<JsonKtorHTTPClient> { public static final ExtensionsKt$Default$2 INSTANCE = new ExtensionsKt$Default$2(); @NotNull
/* 31 */     public final JsonKtorHTTPClient invoke() { return JsonKtorHTTPClient.Companion.default(ExtensionsKt.server(PlatformHttpClient.INSTANCE)); } ExtensionsKt$Default$2() {
/*    */       super(0);
/*    */     } } @NotNull
/* 34 */   private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(ExtensionsKt$WithExtendedTimeout$2.INSTANCE); @NotNull public static final JsonKtorHTTPClient getWithExtendedTimeout(@NotNull JsonKtorHTTPClient.Server $this$WithExtendedTimeout) { Intrinsics.checkNotNullParameter($this$WithExtendedTimeout, "<this>"); Lazy lazy = WithExtendedTimeout$delegate; return (JsonKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"}) static final class ExtensionsKt$WithExtendedTimeout$2 extends Lambda implements Function0<JsonKtorHTTPClient> { public static final ExtensionsKt$WithExtendedTimeout$2 INSTANCE = new ExtensionsKt$WithExtendedTimeout$2(); @NotNull
/* 35 */     public final JsonKtorHTTPClient invoke() { return JsonKtorHTTPClient.Companion.withExtendedTimeout(ExtensionsKt.server(PlatformHttpClient.INSTANCE)); }
/*    */ 
/*    */     
/*    */     ExtensionsKt$WithExtendedTimeout$2() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */