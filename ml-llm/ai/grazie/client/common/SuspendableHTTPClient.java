/*     */ package ai.grazie.client.common;
/*     */ 
/*     */ import ai.grazie.client.common.model.HTTPResponse;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\b\bf\030\0002\0020\001:\005\026\027\030\031\032J#\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H¦@ø\001\000¢\006\002\020\bJ7\020\t\032\b\022\004\022\0020\0130\n2\006\020\004\032\0020\0052\006\020\f\032\0020\0052\006\020\006\032\0020\0072\006\020\r\032\0020\016H¦@ø\001\000¢\006\002\020\017J+\020\020\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0212\b\b\002\020\006\032\0020\007H¦@ø\001\000¢\006\002\020\022J#\020\020\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H¦@ø\001\000¢\006\002\020\bJ+\020\020\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0232\b\b\002\020\006\032\0020\007H¦@ø\001\000¢\006\002\020\024J+\020\020\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0052\b\b\002\020\006\032\0020\007H@ø\001\000¢\006\002\020\025ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\033À\006\001"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient;", "Lai/grazie/client/common/WithAuthClient;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WithError", "WithHeaders", "WithV3", "WithV4", "WithV5", "client-common"})
/*     */ public interface SuspendableHTTPClient extends WithAuthClient {
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\b&\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\tH\002J!\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\017J7\020\020\032\b\022\004\022\0020\0220\0212\006\020\r\032\0020\0162\006\020\023\032\0020\0162\006\020\n\032\0020\t2\006\020\024\032\0020\025H@ø\001\000¢\006\002\020\026J)\020\027\032\0020\f2\006\020\r\032\0020\0162\006\020\023\032\0020\0302\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\031J!\020\027\032\0020\f2\006\020\r\032\0020\0162\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\017J)\020\027\032\0020\f2\006\020\r\032\0020\0162\006\020\023\032\0020\0322\006\020\n\032\0020\tH@ø\001\000¢\006\002\020\033R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007\002\004\n\002\b\031¨\006\034"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/model/HeaderCollection;)V", "getHeaders", "()Lai/grazie/client/common/model/HeaderCollection;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */   @SourceDebugExtension({"SMAP\nSuspendableHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableHTTPClient.kt\nai/grazie/client/common/SuspendableHTTPClient$WithHeaders\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/*     */   public static abstract class WithHeaders implements SuspendableHTTPClient {
/*     */     @NotNull
/*     */     private final SuspendableHTTPClient client;
/*     */     
/*  16 */     public WithHeaders(@NotNull SuspendableHTTPClient client, @NotNull HeaderCollection headers) { this.client = client; this.headers = headers; } @NotNull private final HeaderCollection headers; @NotNull public final HeaderCollection getHeaders() { return this.headers; } private final RequestOptions appendHeaders(RequestOptions options) {
/*  17 */       RequestOptions requestOptions1 = options, it = requestOptions1;
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
/* 125 */       int $i$a$-also-SuspendableHTTPClient$WithHeaders$appendHeaders$1 = 0;
/*     */       it.getHeaders().addAll(this.headers);
/*     */       return requestOptions1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */       return send$suspendImpl(this, url, content, options, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */       return send$suspendImpl(this, url, content, options, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation<? super Flow<ServerSentEvent>> $completion) {
/*     */       return receiveContinuousSSE$suspendImpl(this, url, content, options, reconnect, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */       return send$suspendImpl(this, url, options, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */       return get$suspendImpl(this, url, options, $completion);
/*     */     }
/*     */   }
/*     */   
/*     */   @TestOnly
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithError;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "code", "", "(Lai/grazie/client/common/SuspendableHTTPClient;I)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "getCode", "()I", "client-common"})
/*     */   public static final class WithError extends WithHeaders {
/*     */     private final int code;
/*     */     @NotNull
/*     */     private final AuthVersion authVersion;
/*     */     
/*     */     public WithError(@NotNull SuspendableHTTPClient client, int code) {
/*     */       super(client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Force-HTTP-Error", CollectionsKt.listOf(String.valueOf(code))))));
/*     */       this.code = code;
/*     */       this.authVersion = client.getAuthVersion();
/*     */     }
/*     */     
/*     */     public final int getCode() {
/*     */       return this.code;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public AuthVersion getAuthVersion() {
/*     */       return this.authVersion;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithV3;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "token", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "getToken", "()Ljava/lang/String;", "client-common"})
/*     */   public static final class WithV3 extends WithHeaders {
/*     */     @NotNull
/*     */     private final String token;
/*     */     @NotNull
/*     */     private final AuthVersion authVersion;
/*     */     
/*     */     public WithV3(@NotNull SuspendableHTTPClient client, @NotNull String token) {
/*     */       super(client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Authenticate-JWT", CollectionsKt.listOf(token)))));
/*     */       this.token = token;
/*     */       this.authVersion = AuthVersion.V3;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getToken() {
/*     */       return this.token;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public AuthVersion getAuthVersion() {
/*     */       return this.authVersion;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithV4;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "token", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "getToken", "()Ljava/lang/String;", "client-common"})
/*     */   public static final class WithV4 extends WithHeaders {
/*     */     @NotNull
/*     */     private final String token;
/*     */     @NotNull
/*     */     private final AuthVersion authVersion;
/*     */     
/*     */     public WithV4(@NotNull SuspendableHTTPClient client, @NotNull String token) {
/*     */       super(client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Authenticate-JWT", CollectionsKt.listOf(token)))));
/*     */       this.token = token;
/*     */       this.authVersion = AuthVersion.V4;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getToken() {
/*     */       return this.token;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public AuthVersion getAuthVersion() {
/*     */       return this.authVersion;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\030\0002\0020\001B\031\022\006\020\002\032\0020\001\022\n\b\002\020\003\032\004\030\0010\004¢\006\002\020\005J\031\020\n\032\0020\0132\006\020\f\032\0020\013H@ø\001\000¢\006\002\020\rJ!\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\f\032\0020\013H@ø\001\000¢\006\002\020\022J7\020\023\032\b\022\004\022\0020\0250\0242\006\020\020\032\0020\0212\006\020\026\032\0020\0212\006\020\f\032\0020\0132\006\020\027\032\0020\030H@ø\001\000¢\006\002\020\031J)\020\032\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020\0332\006\020\f\032\0020\013H@ø\001\000¢\006\002\020\034J!\020\032\032\0020\0172\006\020\020\032\0020\0212\006\020\f\032\0020\013H@ø\001\000¢\006\002\020\022J)\020\032\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020\0352\006\020\f\032\0020\013H@ø\001\000¢\006\002\020\036R\020\020\003\032\004\030\0010\004X\004¢\006\002\n\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\016\020\002\032\0020\001X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\037"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithV5;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "authData", "Lai/grazie/model/auth/v5/AuthData;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/auth/v5/AuthData;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */   public static final class WithV5 implements SuspendableHTTPClient {
/*     */     @NotNull
/*     */     private final SuspendableHTTPClient client;
/*     */     @Nullable
/*     */     private final AuthData authData;
/*     */     @NotNull
/*     */     private final AuthVersion authVersion;
/*     */     
/*     */     public WithV5(@NotNull SuspendableHTTPClient client, @Nullable AuthData authData) {
/*     */       this.client = client;
/*     */       this.authData = authData;
/*     */       this.authVersion = AuthVersion.V5;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public AuthVersion getAuthVersion() {
/*     */       return this.authVersion;
/*     */     }
/*     */     
/*     */     private final Object appendHeaders(RequestOptions options, Continuation $completion) {
/*     */       AuthData authData;
/*     */       if (this.authData == null)
/*     */         if ((AuthData)$completion.getContext().get((CoroutineContext.Key)AuthData.Key) == null) {
/*     */           (AuthData)$completion.getContext().get((CoroutineContext.Key)AuthData.Key);
/*     */           throw new IllegalStateException("For v5 requests metadata must be set");
/*     */         }  
/*     */       if ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key) == null || ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key)).getToken() == null)
/*     */         ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key)).getToken(); 
/*     */       return ((AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key)).getToken().append(authData.getToken(), authData.getOriginalUserToken(), authData.getOriginalServiceToken(), authData.getGrazieAgent(), options);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> param1Continuation) {
/*     */       // Byte code:
/*     */       //   0: aload #4
/*     */       //   2: instanceof ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$1
/*     */       //   5: ifeq -> 41
/*     */       //   8: aload #4
/*     */       //   10: checkcast ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$1
/*     */       //   13: astore #10
/*     */       //   15: aload #10
/*     */       //   17: getfield label : I
/*     */       //   20: ldc -2147483648
/*     */       //   22: iand
/*     */       //   23: ifeq -> 41
/*     */       //   26: aload #10
/*     */       //   28: dup
/*     */       //   29: getfield label : I
/*     */       //   32: ldc -2147483648
/*     */       //   34: isub
/*     */       //   35: putfield label : I
/*     */       //   38: goto -> 53
/*     */       //   41: new ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$1
/*     */       //   44: dup
/*     */       //   45: aload_0
/*     */       //   46: aload #4
/*     */       //   48: invokespecial <init> : (Lai/grazie/client/common/SuspendableHTTPClient$WithV5;Lkotlin/coroutines/Continuation;)V
/*     */       //   51: astore #10
/*     */       //   53: aload #10
/*     */       //   55: getfield result : Ljava/lang/Object;
/*     */       //   58: astore #9
/*     */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   63: astore #11
/*     */       //   65: aload #10
/*     */       //   67: getfield label : I
/*     */       //   70: tableswitch default -> 254, 0 -> 96, 1 -> 156, 2 -> 246
/*     */       //   96: aload #9
/*     */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   101: aload_0
/*     */       //   102: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   105: aload_1
/*     */       //   106: aload_2
/*     */       //   107: astore #7
/*     */       //   109: astore #6
/*     */       //   111: astore #5
/*     */       //   113: aload_0
/*     */       //   114: aload_3
/*     */       //   115: aload #10
/*     */       //   117: aload #10
/*     */       //   119: aload #5
/*     */       //   121: putfield L$0 : Ljava/lang/Object;
/*     */       //   124: aload #10
/*     */       //   126: aload #6
/*     */       //   128: putfield L$1 : Ljava/lang/Object;
/*     */       //   131: aload #10
/*     */       //   133: aload #7
/*     */       //   135: putfield L$2 : Ljava/lang/Object;
/*     */       //   138: aload #10
/*     */       //   140: iconst_1
/*     */       //   141: putfield label : I
/*     */       //   144: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   147: dup
/*     */       //   148: aload #11
/*     */       //   150: if_acmpne -> 193
/*     */       //   153: aload #11
/*     */       //   155: areturn
/*     */       //   156: aload #10
/*     */       //   158: getfield L$2 : Ljava/lang/Object;
/*     */       //   161: checkcast ai/grazie/client/common/model/Multipart
/*     */       //   164: astore #7
/*     */       //   166: aload #10
/*     */       //   168: getfield L$1 : Ljava/lang/Object;
/*     */       //   171: checkcast java/lang/String
/*     */       //   174: astore #6
/*     */       //   176: aload #10
/*     */       //   178: getfield L$0 : Ljava/lang/Object;
/*     */       //   181: checkcast ai/grazie/client/common/SuspendableHTTPClient
/*     */       //   184: astore #5
/*     */       //   186: aload #9
/*     */       //   188: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   191: aload #9
/*     */       //   193: astore #8
/*     */       //   195: aload #5
/*     */       //   197: aload #6
/*     */       //   199: aload #7
/*     */       //   201: aload #8
/*     */       //   203: checkcast ai/grazie/client/common/model/RequestOptions
/*     */       //   206: aload #10
/*     */       //   208: aload #10
/*     */       //   210: aconst_null
/*     */       //   211: putfield L$0 : Ljava/lang/Object;
/*     */       //   214: aload #10
/*     */       //   216: aconst_null
/*     */       //   217: putfield L$1 : Ljava/lang/Object;
/*     */       //   220: aload #10
/*     */       //   222: aconst_null
/*     */       //   223: putfield L$2 : Ljava/lang/Object;
/*     */       //   226: aload #10
/*     */       //   228: iconst_2
/*     */       //   229: putfield label : I
/*     */       //   232: invokeinterface send : (Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   237: dup
/*     */       //   238: aload #11
/*     */       //   240: if_acmpne -> 253
/*     */       //   243: aload #11
/*     */       //   245: areturn
/*     */       //   246: aload #9
/*     */       //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   251: aload #9
/*     */       //   253: areturn
/*     */       //   254: new java/lang/IllegalStateException
/*     */       //   257: dup
/*     */       //   258: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   260: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   263: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #92	-> 63
/*     */       //   #93	-> 101
/*     */       //   #92	-> 153
/*     */       //   #93	-> 193
/*     */       //   #92	-> 243
/*     */       //   #93	-> 253
/*     */       //   #92	-> 254
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   101	46	0	this	Lai/grazie/client/common/SuspendableHTTPClient$WithV5;
/*     */       //   101	46	1	url	Ljava/lang/String;
/*     */       //   101	46	2	content	Lai/grazie/client/common/model/Multipart;
/*     */       //   101	46	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   53	201	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   60	194	9	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation<? super Flow<ServerSentEvent>> param1Continuation) {
/*     */       // Byte code:
/*     */       //   0: aload #5
/*     */       //   2: instanceof ai/grazie/client/common/SuspendableHTTPClient$WithV5$receiveContinuousSSE$1
/*     */       //   5: ifeq -> 41
/*     */       //   8: aload #5
/*     */       //   10: checkcast ai/grazie/client/common/SuspendableHTTPClient$WithV5$receiveContinuousSSE$1
/*     */       //   13: astore #11
/*     */       //   15: aload #11
/*     */       //   17: getfield label : I
/*     */       //   20: ldc -2147483648
/*     */       //   22: iand
/*     */       //   23: ifeq -> 41
/*     */       //   26: aload #11
/*     */       //   28: dup
/*     */       //   29: getfield label : I
/*     */       //   32: ldc -2147483648
/*     */       //   34: isub
/*     */       //   35: putfield label : I
/*     */       //   38: goto -> 53
/*     */       //   41: new ai/grazie/client/common/SuspendableHTTPClient$WithV5$receiveContinuousSSE$1
/*     */       //   44: dup
/*     */       //   45: aload_0
/*     */       //   46: aload #5
/*     */       //   48: invokespecial <init> : (Lai/grazie/client/common/SuspendableHTTPClient$WithV5;Lkotlin/coroutines/Continuation;)V
/*     */       //   51: astore #11
/*     */       //   53: aload #11
/*     */       //   55: getfield result : Ljava/lang/Object;
/*     */       //   58: astore #10
/*     */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   63: astore #12
/*     */       //   65: aload #11
/*     */       //   67: getfield label : I
/*     */       //   70: tableswitch default -> 278, 0 -> 96, 1 -> 163, 2 -> 270
/*     */       //   96: aload #10
/*     */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   101: aload_0
/*     */       //   102: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   105: aload_1
/*     */       //   106: aload_2
/*     */       //   107: astore #8
/*     */       //   109: astore #7
/*     */       //   111: astore #6
/*     */       //   113: aload_0
/*     */       //   114: aload_3
/*     */       //   115: aload #11
/*     */       //   117: aload #11
/*     */       //   119: aload #6
/*     */       //   121: putfield L$0 : Ljava/lang/Object;
/*     */       //   124: aload #11
/*     */       //   126: aload #7
/*     */       //   128: putfield L$1 : Ljava/lang/Object;
/*     */       //   131: aload #11
/*     */       //   133: aload #8
/*     */       //   135: putfield L$2 : Ljava/lang/Object;
/*     */       //   138: aload #11
/*     */       //   140: iload #4
/*     */       //   142: putfield Z$0 : Z
/*     */       //   145: aload #11
/*     */       //   147: iconst_1
/*     */       //   148: putfield label : I
/*     */       //   151: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   154: dup
/*     */       //   155: aload #12
/*     */       //   157: if_acmpne -> 207
/*     */       //   160: aload #12
/*     */       //   162: areturn
/*     */       //   163: aload #11
/*     */       //   165: getfield Z$0 : Z
/*     */       //   168: istore #4
/*     */       //   170: aload #11
/*     */       //   172: getfield L$2 : Ljava/lang/Object;
/*     */       //   175: checkcast java/lang/String
/*     */       //   178: astore #8
/*     */       //   180: aload #11
/*     */       //   182: getfield L$1 : Ljava/lang/Object;
/*     */       //   185: checkcast java/lang/String
/*     */       //   188: astore #7
/*     */       //   190: aload #11
/*     */       //   192: getfield L$0 : Ljava/lang/Object;
/*     */       //   195: checkcast ai/grazie/client/common/SuspendableHTTPClient
/*     */       //   198: astore #6
/*     */       //   200: aload #10
/*     */       //   202: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   205: aload #10
/*     */       //   207: astore #9
/*     */       //   209: aload #6
/*     */       //   211: aload #7
/*     */       //   213: aload #8
/*     */       //   215: aload #9
/*     */       //   217: checkcast ai/grazie/client/common/model/RequestOptions
/*     */       //   220: iload #4
/*     */       //   222: ifeq -> 229
/*     */       //   225: iconst_1
/*     */       //   226: goto -> 230
/*     */       //   229: iconst_0
/*     */       //   230: aload #11
/*     */       //   232: aload #11
/*     */       //   234: aconst_null
/*     */       //   235: putfield L$0 : Ljava/lang/Object;
/*     */       //   238: aload #11
/*     */       //   240: aconst_null
/*     */       //   241: putfield L$1 : Ljava/lang/Object;
/*     */       //   244: aload #11
/*     */       //   246: aconst_null
/*     */       //   247: putfield L$2 : Ljava/lang/Object;
/*     */       //   250: aload #11
/*     */       //   252: iconst_2
/*     */       //   253: putfield label : I
/*     */       //   256: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   261: dup
/*     */       //   262: aload #12
/*     */       //   264: if_acmpne -> 277
/*     */       //   267: aload #12
/*     */       //   269: areturn
/*     */       //   270: aload #10
/*     */       //   272: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   275: aload #10
/*     */       //   277: areturn
/*     */       //   278: new java/lang/IllegalStateException
/*     */       //   281: dup
/*     */       //   282: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   284: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   287: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #96	-> 63
/*     */       //   #97	-> 101
/*     */       //   #96	-> 160
/*     */       //   #97	-> 207
/*     */       //   #96	-> 267
/*     */       //   #97	-> 277
/*     */       //   #96	-> 278
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   101	53	0	this	Lai/grazie/client/common/SuspendableHTTPClient$WithV5;
/*     */       //   101	53	1	url	Ljava/lang/String;
/*     */       //   101	53	2	content	Ljava/lang/String;
/*     */       //   101	53	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   101	62	4	reconnect	Z
/*     */       //   170	59	4	reconnect	Z
/*     */       //   53	225	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   60	218	10	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> param1Continuation) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: instanceof ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$2
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_3
/*     */       //   8: checkcast ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$2
/*     */       //   11: astore #8
/*     */       //   13: aload #8
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #8
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$2
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_3
/*     */       //   45: invokespecial <init> : (Lai/grazie/client/common/SuspendableHTTPClient$WithV5;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #8
/*     */       //   50: aload #8
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #7
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #9
/*     */       //   62: aload #8
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 222, 0 -> 92, 1 -> 142, 2 -> 214
/*     */       //   92: aload #7
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: aload_0
/*     */       //   98: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   101: aload_1
/*     */       //   102: astore #5
/*     */       //   104: astore #4
/*     */       //   106: aload_0
/*     */       //   107: aload_2
/*     */       //   108: aload #8
/*     */       //   110: aload #8
/*     */       //   112: aload #4
/*     */       //   114: putfield L$0 : Ljava/lang/Object;
/*     */       //   117: aload #8
/*     */       //   119: aload #5
/*     */       //   121: putfield L$1 : Ljava/lang/Object;
/*     */       //   124: aload #8
/*     */       //   126: iconst_1
/*     */       //   127: putfield label : I
/*     */       //   130: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   133: dup
/*     */       //   134: aload #9
/*     */       //   136: if_acmpne -> 169
/*     */       //   139: aload #9
/*     */       //   141: areturn
/*     */       //   142: aload #8
/*     */       //   144: getfield L$1 : Ljava/lang/Object;
/*     */       //   147: checkcast java/lang/String
/*     */       //   150: astore #5
/*     */       //   152: aload #8
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: checkcast ai/grazie/client/common/SuspendableHTTPClient
/*     */       //   160: astore #4
/*     */       //   162: aload #7
/*     */       //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   167: aload #7
/*     */       //   169: astore #6
/*     */       //   171: aload #4
/*     */       //   173: aload #5
/*     */       //   175: aload #6
/*     */       //   177: checkcast ai/grazie/client/common/model/RequestOptions
/*     */       //   180: aload #8
/*     */       //   182: aload #8
/*     */       //   184: aconst_null
/*     */       //   185: putfield L$0 : Ljava/lang/Object;
/*     */       //   188: aload #8
/*     */       //   190: aconst_null
/*     */       //   191: putfield L$1 : Ljava/lang/Object;
/*     */       //   194: aload #8
/*     */       //   196: iconst_2
/*     */       //   197: putfield label : I
/*     */       //   200: invokeinterface send : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   205: dup
/*     */       //   206: aload #9
/*     */       //   208: if_acmpne -> 221
/*     */       //   211: aload #9
/*     */       //   213: areturn
/*     */       //   214: aload #7
/*     */       //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   219: aload #7
/*     */       //   221: areturn
/*     */       //   222: new java/lang/IllegalStateException
/*     */       //   225: dup
/*     */       //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   228: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   231: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #100	-> 60
/*     */       //   #101	-> 97
/*     */       //   #100	-> 139
/*     */       //   #101	-> 169
/*     */       //   #100	-> 211
/*     */       //   #101	-> 221
/*     */       //   #100	-> 222
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	36	0	this	Lai/grazie/client/common/SuspendableHTTPClient$WithV5;
/*     */       //   97	36	1	url	Ljava/lang/String;
/*     */       //   97	36	2	options	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   50	172	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	165	7	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> param1Continuation) {
/*     */       // Byte code:
/*     */       //   0: aload #4
/*     */       //   2: instanceof ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$3
/*     */       //   5: ifeq -> 41
/*     */       //   8: aload #4
/*     */       //   10: checkcast ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$3
/*     */       //   13: astore #10
/*     */       //   15: aload #10
/*     */       //   17: getfield label : I
/*     */       //   20: ldc -2147483648
/*     */       //   22: iand
/*     */       //   23: ifeq -> 41
/*     */       //   26: aload #10
/*     */       //   28: dup
/*     */       //   29: getfield label : I
/*     */       //   32: ldc -2147483648
/*     */       //   34: isub
/*     */       //   35: putfield label : I
/*     */       //   38: goto -> 53
/*     */       //   41: new ai/grazie/client/common/SuspendableHTTPClient$WithV5$send$3
/*     */       //   44: dup
/*     */       //   45: aload_0
/*     */       //   46: aload #4
/*     */       //   48: invokespecial <init> : (Lai/grazie/client/common/SuspendableHTTPClient$WithV5;Lkotlin/coroutines/Continuation;)V
/*     */       //   51: astore #10
/*     */       //   53: aload #10
/*     */       //   55: getfield result : Ljava/lang/Object;
/*     */       //   58: astore #9
/*     */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   63: astore #11
/*     */       //   65: aload #10
/*     */       //   67: getfield label : I
/*     */       //   70: tableswitch default -> 254, 0 -> 96, 1 -> 156, 2 -> 246
/*     */       //   96: aload #9
/*     */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   101: aload_0
/*     */       //   102: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   105: aload_1
/*     */       //   106: aload_2
/*     */       //   107: astore #7
/*     */       //   109: astore #6
/*     */       //   111: astore #5
/*     */       //   113: aload_0
/*     */       //   114: aload_3
/*     */       //   115: aload #10
/*     */       //   117: aload #10
/*     */       //   119: aload #5
/*     */       //   121: putfield L$0 : Ljava/lang/Object;
/*     */       //   124: aload #10
/*     */       //   126: aload #6
/*     */       //   128: putfield L$1 : Ljava/lang/Object;
/*     */       //   131: aload #10
/*     */       //   133: aload #7
/*     */       //   135: putfield L$2 : Ljava/lang/Object;
/*     */       //   138: aload #10
/*     */       //   140: iconst_1
/*     */       //   141: putfield label : I
/*     */       //   144: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   147: dup
/*     */       //   148: aload #11
/*     */       //   150: if_acmpne -> 193
/*     */       //   153: aload #11
/*     */       //   155: areturn
/*     */       //   156: aload #10
/*     */       //   158: getfield L$2 : Ljava/lang/Object;
/*     */       //   161: checkcast [B
/*     */       //   164: astore #7
/*     */       //   166: aload #10
/*     */       //   168: getfield L$1 : Ljava/lang/Object;
/*     */       //   171: checkcast java/lang/String
/*     */       //   174: astore #6
/*     */       //   176: aload #10
/*     */       //   178: getfield L$0 : Ljava/lang/Object;
/*     */       //   181: checkcast ai/grazie/client/common/SuspendableHTTPClient
/*     */       //   184: astore #5
/*     */       //   186: aload #9
/*     */       //   188: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   191: aload #9
/*     */       //   193: astore #8
/*     */       //   195: aload #5
/*     */       //   197: aload #6
/*     */       //   199: aload #7
/*     */       //   201: aload #8
/*     */       //   203: checkcast ai/grazie/client/common/model/RequestOptions
/*     */       //   206: aload #10
/*     */       //   208: aload #10
/*     */       //   210: aconst_null
/*     */       //   211: putfield L$0 : Ljava/lang/Object;
/*     */       //   214: aload #10
/*     */       //   216: aconst_null
/*     */       //   217: putfield L$1 : Ljava/lang/Object;
/*     */       //   220: aload #10
/*     */       //   222: aconst_null
/*     */       //   223: putfield L$2 : Ljava/lang/Object;
/*     */       //   226: aload #10
/*     */       //   228: iconst_2
/*     */       //   229: putfield label : I
/*     */       //   232: invokeinterface send : (Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   237: dup
/*     */       //   238: aload #11
/*     */       //   240: if_acmpne -> 253
/*     */       //   243: aload #11
/*     */       //   245: areturn
/*     */       //   246: aload #9
/*     */       //   248: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   251: aload #9
/*     */       //   253: areturn
/*     */       //   254: new java/lang/IllegalStateException
/*     */       //   257: dup
/*     */       //   258: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   260: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   263: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #104	-> 63
/*     */       //   #105	-> 101
/*     */       //   #104	-> 153
/*     */       //   #105	-> 193
/*     */       //   #104	-> 243
/*     */       //   #105	-> 253
/*     */       //   #104	-> 254
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   101	46	0	this	Lai/grazie/client/common/SuspendableHTTPClient$WithV5;
/*     */       //   101	46	1	url	Ljava/lang/String;
/*     */       //   101	46	2	content	[B
/*     */       //   101	46	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   53	201	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   60	194	9	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> param1Continuation) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: instanceof ai/grazie/client/common/SuspendableHTTPClient$WithV5$get$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_3
/*     */       //   8: checkcast ai/grazie/client/common/SuspendableHTTPClient$WithV5$get$1
/*     */       //   11: astore #8
/*     */       //   13: aload #8
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #8
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new ai/grazie/client/common/SuspendableHTTPClient$WithV5$get$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_3
/*     */       //   45: invokespecial <init> : (Lai/grazie/client/common/SuspendableHTTPClient$WithV5;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #8
/*     */       //   50: aload #8
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #7
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #9
/*     */       //   62: aload #8
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 222, 0 -> 92, 1 -> 142, 2 -> 214
/*     */       //   92: aload #7
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: aload_0
/*     */       //   98: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   101: aload_1
/*     */       //   102: astore #5
/*     */       //   104: astore #4
/*     */       //   106: aload_0
/*     */       //   107: aload_2
/*     */       //   108: aload #8
/*     */       //   110: aload #8
/*     */       //   112: aload #4
/*     */       //   114: putfield L$0 : Ljava/lang/Object;
/*     */       //   117: aload #8
/*     */       //   119: aload #5
/*     */       //   121: putfield L$1 : Ljava/lang/Object;
/*     */       //   124: aload #8
/*     */       //   126: iconst_1
/*     */       //   127: putfield label : I
/*     */       //   130: invokespecial appendHeaders : (Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   133: dup
/*     */       //   134: aload #9
/*     */       //   136: if_acmpne -> 169
/*     */       //   139: aload #9
/*     */       //   141: areturn
/*     */       //   142: aload #8
/*     */       //   144: getfield L$1 : Ljava/lang/Object;
/*     */       //   147: checkcast java/lang/String
/*     */       //   150: astore #5
/*     */       //   152: aload #8
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: checkcast ai/grazie/client/common/SuspendableHTTPClient
/*     */       //   160: astore #4
/*     */       //   162: aload #7
/*     */       //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   167: aload #7
/*     */       //   169: astore #6
/*     */       //   171: aload #4
/*     */       //   173: aload #5
/*     */       //   175: aload #6
/*     */       //   177: checkcast ai/grazie/client/common/model/RequestOptions
/*     */       //   180: aload #8
/*     */       //   182: aload #8
/*     */       //   184: aconst_null
/*     */       //   185: putfield L$0 : Ljava/lang/Object;
/*     */       //   188: aload #8
/*     */       //   190: aconst_null
/*     */       //   191: putfield L$1 : Ljava/lang/Object;
/*     */       //   194: aload #8
/*     */       //   196: iconst_2
/*     */       //   197: putfield label : I
/*     */       //   200: invokeinterface get : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   205: dup
/*     */       //   206: aload #9
/*     */       //   208: if_acmpne -> 221
/*     */       //   211: aload #9
/*     */       //   213: areturn
/*     */       //   214: aload #7
/*     */       //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   219: aload #7
/*     */       //   221: areturn
/*     */       //   222: new java/lang/IllegalStateException
/*     */       //   225: dup
/*     */       //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   228: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   231: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #108	-> 60
/*     */       //   #109	-> 97
/*     */       //   #108	-> 139
/*     */       //   #109	-> 169
/*     */       //   #108	-> 211
/*     */       //   #109	-> 221
/*     */       //   #108	-> 222
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	36	0	this	Lai/grazie/client/common/SuspendableHTTPClient$WithV5;
/*     */       //   97	36	1	url	Ljava/lang/String;
/*     */       //   97	36	2	options	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   50	172	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	165	7	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {109, 109}, i = {}, s = {}, n = {}, m = "get", c = "ai.grazie.client.common.SuspendableHTTPClient$WithV5")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class SuspendableHTTPClient$WithV5$get$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       SuspendableHTTPClient$WithV5$get$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithV5.this.get(null, null, (Continuation<? super HTTPResponse>)this);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {97, 97}, i = {0}, s = {"Z$0"}, n = {"reconnect"}, m = "receiveContinuousSSE", c = "ai.grazie.client.common.SuspendableHTTPClient$WithV5")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class SuspendableHTTPClient$WithV5$receiveContinuousSSE$1 extends ContinuationImpl {
/*     */       boolean Z$0;
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       Object L$2;
/*     */       int label;
/*     */       
/*     */       SuspendableHTTPClient$WithV5$receiveContinuousSSE$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithV5.this.receiveContinuousSSE(null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {93, 93}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.common.SuspendableHTTPClient$WithV5")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class SuspendableHTTPClient$WithV5$send$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       Object L$2;
/*     */       int label;
/*     */       
/*     */       SuspendableHTTPClient$WithV5$send$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithV5.this.send((String)null, (Multipart)null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {101, 101}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.common.SuspendableHTTPClient$WithV5")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class SuspendableHTTPClient$WithV5$send$2 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       SuspendableHTTPClient$WithV5$send$2(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithV5.this.send(null, null, (Continuation<? super HTTPResponse>)this);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {105, 105}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.common.SuspendableHTTPClient$WithV5")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class SuspendableHTTPClient$WithV5$send$3 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       Object L$2;
/*     */       int label;
/*     */       
/*     */       SuspendableHTTPClient$WithV5$send$3(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithV5.this.send((String)null, (byte[])null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   default Object send(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, content, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   Object send(@NotNull String paramString, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object send(@NotNull String paramString, @NotNull byte[] paramArrayOfbyte, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object send(@NotNull String paramString, @NotNull Multipart paramMultipart, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object receiveContinuousSSE(@NotNull String paramString1, @NotNull String paramString2, @NotNull RequestOptions paramRequestOptions, boolean paramBoolean, @NotNull Continuation<? super Flow<ServerSentEvent>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object get(@NotNull String paramString, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/SuspendableHTTPClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */