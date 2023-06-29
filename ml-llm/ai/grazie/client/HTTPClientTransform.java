/*    */ package ai.grazie.client;
/*    */ 
/*    */ import ai.grazie.client.common.HTTPClient;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.AuthVersion;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\007¨\006\t"}, d2 = {"Lai/grazie/client/HTTPClientTransform;", "", "()V", "suspendable", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "Lai/grazie/client/common/HTTPClient;", "version", "Lai/grazie/model/cloud/AuthVersion;", "client-common"})
/*    */ public final class HTTPClientTransform {
/*    */   @JvmStatic
/*    */   @NotNull
/* 15 */   public static final SuspendableHTTPClient suspendable(@NotNull HTTPClient client, @NotNull AuthVersion version) { Intrinsics.checkNotNullParameter(client, "client"); Intrinsics.checkNotNullParameter(version, "version"); return new HTTPClientTransform$suspendable$1(version, client); } @NotNull public static final HTTPClientTransform INSTANCE = new HTTPClientTransform(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000I\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002*\001\000\b\n\030\0002\0020\001J!\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\fJ7\020\r\032\b\022\004\022\0020\0170\0162\006\020\b\032\0020\t2\006\020\020\032\0020\t2\006\020\n\032\0020\0132\006\020\021\032\0020\022H@ø\001\000¢\006\002\020\023J)\020\024\032\0020\0072\006\020\b\032\0020\t2\006\020\020\032\0020\0252\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\026J!\020\024\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\fJ)\020\024\032\0020\0072\006\020\b\032\0020\t2\006\020\020\032\0020\0272\006\020\n\032\0020\013H@ø\001\000¢\006\002\020\030R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005\002\004\n\002\b\031¨\006\031"}, d2 = {"ai/grazie/client/HTTPClientTransform$suspendable$1", "Lai/grazie/client/common/SuspendableHTTPClient;", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"}) public static final class HTTPClientTransform$suspendable$1 implements SuspendableHTTPClient { @NotNull
/* 16 */     private final AuthVersion authVersion; HTTPClientTransform$suspendable$1(AuthVersion $version, HTTPClient $client) { this.authVersion = $version; } @NotNull public AuthVersion getAuthVersion() { return this.authVersion; }
/*    */     @Nullable
/* 18 */     public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation $completion) { return this.$client.send(url, options); }
/*    */     @Nullable
/* 20 */     public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation $completion) { return this.$client.send(url, content, options); } @Nullable
/*    */     public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 22 */       return this.$client.send(url, content, options);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation $completion) {
/* 30 */       String str = "Flow is not supported for blocking client"; throw new IllegalStateException(str.toString());
/*    */     } @Nullable
/*    */     public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/* 33 */       return this.$client.get(url, options);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/HTTPClientTransform.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */