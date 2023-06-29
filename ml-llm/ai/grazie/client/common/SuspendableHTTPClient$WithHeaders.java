/*     */ package ai.grazie.client.common;
/*     */ 
/*     */ import ai.grazie.client.common.model.HTTPResponse;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\b&\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\tH\002J!\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\017J7\020\020\032\b\022\004\022\0020\0220\0212\006\020\r\032\0020\0162\006\020\023\032\0020\0162\006\020\n\032\0020\t2\006\020\024\032\0020\025H@ø\001\000¢\006\002\020\026J)\020\027\032\0020\f2\006\020\r\032\0020\0162\006\020\023\032\0020\0302\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\031J!\020\027\032\0020\f2\006\020\r\032\0020\0162\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\017J)\020\027\032\0020\f2\006\020\r\032\0020\0162\006\020\023\032\0020\0322\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\033R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007\002\004\n\002\b\031¨\006\034"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/model/HeaderCollection;)V", "getHeaders", "()Lai/grazie/client/common/model/HeaderCollection;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */ @SourceDebugExtension({"SMAP\nSuspendableHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableHTTPClient.kt\nai/grazie/client/common/SuspendableHTTPClient$WithHeaders\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/*     */ public abstract class WithHeaders implements SuspendableHTTPClient {
/*     */   @NotNull
/*     */   private final SuspendableHTTPClient client;
/*     */   
/*  16 */   public WithHeaders(@NotNull SuspendableHTTPClient client, @NotNull HeaderCollection headers) { this.client = client; this.headers = headers; } @NotNull private final HeaderCollection headers; @NotNull public final HeaderCollection getHeaders() { return this.headers; } private final RequestOptions appendHeaders(RequestOptions options) {
/*  17 */     RequestOptions requestOptions1 = options, it = requestOptions1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     int $i$a$-also-SuspendableHTTPClient$WithHeaders$appendHeaders$1 = 0;
/*     */     it.getHeaders().addAll(this.headers);
/*     */     return requestOptions1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, content, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, content, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation<? super Flow<ServerSentEvent>> $completion) {
/*     */     return receiveContinuousSSE$suspendImpl(this, url, content, options, reconnect, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return get$suspendImpl(this, url, options, $completion);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/SuspendableHTTPClient$WithHeaders.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */