/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClient;
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.HttpClientPlugin;
/*    */ import io.ktor.client.plugins.HttpTimeout;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$Companion;", "", "()V", "default", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "client", "Lio/ktor/client/HttpClient;", "withExtendedTimeout", "utils-ktor"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final JsonKtorHTTPClient default(@NotNull HttpClient client) {
/* 43 */     Intrinsics.checkNotNullParameter(client, "client"); return new JsonKtorHTTPClient(
/* 44 */         client.config(JsonKtorHTTPClient$Companion$default$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*    */   static final class JsonKtorHTTPClient$Companion$default$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public final void invoke(@NotNull HttpClientConfig $this$config) {
/* 46 */       Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeout.Plugin, null.INSTANCE);
/*    */     }
/*    */     public static final JsonKtorHTTPClient$Companion$default$1 INSTANCE = new JsonKtorHTTPClient$Companion$default$1();
/*    */     
/*    */     JsonKtorHTTPClient$Companion$default$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/* 56 */   public final JsonKtorHTTPClient withExtendedTimeout(@NotNull HttpClient client) { Intrinsics.checkNotNullParameter(client, "client"); return new JsonKtorHTTPClient(
/* 57 */         client.config(JsonKtorHTTPClient$Companion$withExtendedTimeout$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*    */   static final class JsonKtorHTTPClient$Companion$withExtendedTimeout$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public final void invoke(@NotNull HttpClientConfig $this$config) {
/* 59 */       Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeout.Plugin, null.INSTANCE);
/*    */     }
/*    */     
/*    */     public static final JsonKtorHTTPClient$Companion$withExtendedTimeout$1 INSTANCE = new JsonKtorHTTPClient$Companion$withExtendedTimeout$1();
/*    */     
/*    */     JsonKtorHTTPClient$Companion$withExtendedTimeout$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */