/*     */ package ai.grazie.utils.http;
/*     */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import java.util.Map;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000t\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020$\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\021\n\002\030\002\n\002\b\b\b\026\030\000 52\0020\001:\00545678B\r\022\006\020\002\032\0020\003¢\006\002\020\004Jk\020\005\032\002H\006\"\004\b\000\020\0062\006\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\020JC\020\021\032\002H\006\"\004\b\000\020\0062\006\020\022\032\0020\0232\"\020\024\032\036\b\001\022\004\022\0020\023\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\025J}\020\026\032\b\022\004\022\0020\0300\0272\006\020\007\032\0020\b2\006\020\031\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\"\020\032\032\036\b\001\022\004\022\0020\030\022\n\022\b\022\004\022\0020\0330\017\022\006\022\004\030\0010\0010\r2\b\b\002\020\034\032\0020\033H@ø\001\000¢\006\002\020\035J«\001\020\036\032\004\030\001H\037\"\b\b\000\020 *\0020\001\"\b\b\001\020!*\0020\001\"\b\b\002\020\037*\0020\0012\006\020\007\032\0020\b2\006\020\031\032\002H 2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\f\020\"\032\b\022\004\022\002H 0#2\f\020$\032\b\022\004\022\002H!0#2$\b\004\020\f\032\036\b\001\022\004\022\002H!\022\n\022\b\022\004\022\002H\0370\017\022\006\022\004\030\0010\0010\rHHø\001\000¢\006\002\020%JI\020\036\032\0020&2\006\020\007\032\0020\b2\006\020\031\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\nH@ø\001\000¢\006\002\020'Js\020\036\032\002H\006\"\004\b\000\020\0062\006\020\007\032\0020\b2\006\020\031\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020(Jy\020\036\032\002H\006\"\004\b\000\020\0062\006\020\007\032\0020\b2\f\020\031\032\b\022\004\022\0020*0)2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020+JA\020\036\032\0020&2\006\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\nH@ø\001\000¢\006\002\020,Jk\020\036\032\002H\006\"\004\b\000\020\0062\006\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\022\020\013\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\020JC\020-\032\002H\006\"\004\b\000\020\0062\006\020\022\032\0020\0232\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\025JC\020.\032\002H\006\"\004\b\000\020\0062\006\020\022\032\0020\0232\"\020\f\032\036\b\001\022\004\022\0020\016\022\n\022\b\022\004\022\002H\0060\017\022\006\022\004\030\0010\0010\rH@ø\001\000¢\006\002\020\025JQ\020\t\032\0020&*\0020\0232\022\020\t\032\016\022\004\022\0020\b\022\004\022\0020\b0\n2*\020/\032\026\022\022\b\001\022\016\022\004\022\0020\b\022\004\022\0020\b0100\"\016\022\004\022\0020\b\022\004\022\0020\b01H\002¢\006\002\0202J(\020\007\032\0020&*\0020\0232\006\020\007\032\0020\b2\022\0203\032\016\022\004\022\0020\b\022\004\022\0020\b0\nH\002R\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\0069"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient;", "", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "get", "T", "url", "", "headers", "", "queryParams", "body", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleExceptions", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "isEnd", "", "reconnect", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "O", "I", "R", "from", "Lkotlinx/serialization/KSerializer;", "to", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lio/ktor/http/content/PartData;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndStreamBody", "sendAndWaitBody", "additionalHeaders", "", "Lkotlin/Pair;", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/util/Map;[Lkotlin/Pair;)V", "parameters", "Client", "Companion", "KtorHttpException", "KtorHttpTimeoutException", "Server", "utils-ktor"})
/*     */ @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,217:1\n16#2,4:218\n21#2,10:225\n16#2,4:235\n21#2,10:242\n16#2,4:252\n21#2,10:259\n17#3,3:222\n17#3,3:239\n17#3,3:256\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient\n*L\n89#1:218,4\n89#1:225,10\n123#1:235,4\n123#1:242,10\n160#1:252,4\n160#1:259,10\n89#1:222,3\n123#1:239,3\n160#1:256,3\n*E\n"})
/*     */ public class JsonKtorHTTPClient {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final HttpClient client;
/*     */   
/*     */   public JsonKtorHTTPClient(@NotNull HttpClient client) {
/*  21 */     this.client = client;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$Client;", "", "()V", "Default", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "getDefault", "()Lai/grazie/utils/http/JsonKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "utils-ktor"})
/*     */   public static final class Client
/*     */   {
/*     */     @NotNull
/*  29 */     public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(JsonKtorHTTPClient$Client$Default$2.INSTANCE); @NotNull public final JsonKtorHTTPClient getDefault() { Lazy lazy = Default$delegate; return (JsonKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"}) static final class JsonKtorHTTPClient$Client$Default$2 extends Lambda implements Function0<JsonKtorHTTPClient> { public static final JsonKtorHTTPClient$Client$Default$2 INSTANCE = new JsonKtorHTTPClient$Client$Default$2(); JsonKtorHTTPClient$Client$Default$2() { super(0); } @NotNull public final JsonKtorHTTPClient invoke() { return JsonKtorHTTPClient.Companion.default(PlatformHttpClient.INSTANCE.client()); }
/*     */        } @NotNull
/*  31 */     private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(JsonKtorHTTPClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final JsonKtorHTTPClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (JsonKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"}) static final class JsonKtorHTTPClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<JsonKtorHTTPClient> { public static final JsonKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new JsonKtorHTTPClient$Client$WithExtendedTimeout$2(); JsonKtorHTTPClient$Client$WithExtendedTimeout$2() { super(0); } @NotNull public final JsonKtorHTTPClient invoke() { return JsonKtorHTTPClient.Companion.withExtendedTimeout(PlatformHttpClient.INSTANCE.client()); }
/*     */        }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$Server;", "", "()V", "utils-ktor"})
/*     */   public static final class Server { @NotNull
/*     */     public static final Server INSTANCE = new Server(); }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$Companion;", "", "()V", "default", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "client", "Lio/ktor/client/HttpClient;", "withExtendedTimeout", "utils-ktor"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/*  43 */     public final JsonKtorHTTPClient default(@NotNull HttpClient client) { Intrinsics.checkNotNullParameter(client, "client"); return new JsonKtorHTTPClient(
/*  44 */           client.config(JsonKtorHTTPClient$Companion$default$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*     */     static final class JsonKtorHTTPClient$Companion$default$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public static final JsonKtorHTTPClient$Companion$default$1 INSTANCE = new JsonKtorHTTPClient$Companion$default$1(); public final void invoke(@NotNull HttpClientConfig $this$config) {
/*  46 */         Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeout.Plugin, null.INSTANCE);
/*     */       }
/*     */       
/*     */       JsonKtorHTTPClient$Companion$default$1() {
/*     */         super(1);
/*     */       } }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final JsonKtorHTTPClient withExtendedTimeout(@NotNull HttpClient client) {
/*  56 */       Intrinsics.checkNotNullParameter(client, "client"); return new JsonKtorHTTPClient(
/*  57 */           client.config(JsonKtorHTTPClient$Companion$withExtendedTimeout$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*     */     static final class JsonKtorHTTPClient$Companion$withExtendedTimeout$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public static final JsonKtorHTTPClient$Companion$withExtendedTimeout$1 INSTANCE = new JsonKtorHTTPClient$Companion$withExtendedTimeout$1(); public final void invoke(@NotNull HttpClientConfig $this$config) {
/*  59 */         Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeout.Plugin, null.INSTANCE);
/*     */       }
/*     */       JsonKtorHTTPClient$Companion$withExtendedTimeout$1() {
/*     */         super(1);
/*     */       } } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\020\003\n\002\b\004\030\0002\0060\001j\002`\002B-\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\006\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\nR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "url", "", "message", "cause", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "utils-ktor"})
/*     */   @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/*     */   public static final class KtorHttpException extends Exception { private final int code;
/*     */     
/*  69 */     public final int getCode() { return this.code; } public KtorHttpException(int code, @NotNull String url, @Nullable String message, @Nullable Throwable cause) { // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: ldc 'url'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: aload_2
/*     */       //   8: iload_1
/*     */       //   9: aload_3
/*     */       //   10: dup
/*     */       //   11: ifnull -> 102
/*     */       //   14: astore #5
/*     */       //   16: aload #5
/*     */       //   18: astore #6
/*     */       //   20: istore #11
/*     */       //   22: astore #10
/*     */       //   24: astore #9
/*     */       //   26: iconst_0
/*     */       //   27: istore #7
/*     */       //   29: aload #6
/*     */       //   31: checkcast java/lang/CharSequence
/*     */       //   34: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */       //   37: ifne -> 44
/*     */       //   40: iconst_1
/*     */       //   41: goto -> 45
/*     */       //   44: iconst_0
/*     */       //   45: nop
/*     */       //   46: istore #12
/*     */       //   48: aload #9
/*     */       //   50: aload #10
/*     */       //   52: iload #11
/*     */       //   54: iload #12
/*     */       //   56: ifeq -> 64
/*     */       //   59: aload #5
/*     */       //   61: goto -> 65
/*     */       //   64: aconst_null
/*     */       //   65: dup
/*     */       //   66: ifnull -> 102
/*     */       //   69: astore #7
/*     */       //   71: istore #11
/*     */       //   73: astore #10
/*     */       //   75: astore #9
/*     */       //   77: iconst_0
/*     */       //   78: istore #8
/*     */       //   80: aload #7
/*     */       //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   87: astore #12
/*     */       //   89: aload #9
/*     */       //   91: aload #10
/*     */       //   93: iload #11
/*     */       //   95: aload #12
/*     */       //   97: nop
/*     */       //   98: dup
/*     */       //   99: ifnonnull -> 105
/*     */       //   102: pop
/*     */       //   103: ldc ''
/*     */       //   105: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
/*     */       //   110: aload #4
/*     */       //   112: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   115: aload_0
/*     */       //   116: iload_1
/*     */       //   117: putfield code : I
/*     */       //   120: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #70	-> 6
/*     */       //   #218	-> 20
/*     */       //   #70	-> 29
/*     */       //   #70	-> 45
/*     */       //   #70	-> 56
/*     */       //   #70	-> 65
/*     */       //   #218	-> 71
/*     */       //   #70	-> 80
/*     */       //   #70	-> 97
/*     */       //   #70	-> 98
/*     */       //   #69	-> 115
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   29	17	7	$i$a$-takeIf-JsonKtorHTTPClient$KtorHttpException$1	I
/*     */       //   26	20	6	it	Ljava/lang/String;
/*     */       //   80	7	8	$i$a$-let-JsonKtorHTTPClient$KtorHttpException$2	I
/*     */       //   77	10	7	it	Ljava/lang/String;
/*     */       //   0	121	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;
/*     */       //   0	121	1	code	I
/*     */       //   0	121	2	url	Ljava/lang/String;
/*     */       //   0	121	3	message	Ljava/lang/String;
/*     */       //   0	121	4	cause	Ljava/lang/Throwable; } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\002\030\0002\0060\001j\002`\002B\027\022\b\020\003\032\004\030\0010\004\022\006\020\005\032\0020\006¢\006\002\020\007¨\006\b"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "utils-ktor"})
/*     */   public static final class KtorHttpTimeoutException extends Exception { public KtorHttpTimeoutException(@Nullable String message, @NotNull Throwable cause) {
/*  72 */       super(message, cause);
/*     */     } }
/*     */   @Nullable
/*  75 */   public final Object send(@NotNull String url, @NotNull String content, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Continuation<?> $completion) { if (send(url, content, headers, queryParams, new JsonKtorHTTPClient$send$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return send(url, content, headers, queryParams, new JsonKtorHTTPClient$send$2(null), $completion);  send(url, content, headers, queryParams, new JsonKtorHTTPClient$send$2(null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$send$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Lio/ktor/client/statement/HttpResponse;"}) static final class JsonKtorHTTPClient$send$2 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> { int label; JsonKtorHTTPClient$send$2(Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$send$2> $completion) { return (Continuation<Unit>)new JsonKtorHTTPClient$send$2($completion); }
/*     */     @Nullable public final Object invoke(@NotNull HttpResponse p1, @Nullable Continuation<?> p2) { return ((JsonKtorHTTPClient$send$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @Nullable public final Object send(@NotNull String url, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Continuation<?> $completion) { if (send(url, headers, queryParams, new JsonKtorHTTPClient$send$5(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return send(url, headers, queryParams, new JsonKtorHTTPClient$send$5(null), $completion);  send(url, headers, queryParams, new JsonKtorHTTPClient$send$5(null), $completion); return Unit.INSTANCE; }
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$send$5") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Lio/ktor/client/statement/HttpResponse;"}) static final class JsonKtorHTTPClient$send$5 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     JsonKtorHTTPClient$send$5(Continuation $completion) { super(2, $completion); }
/*     */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$send$5> $completion) { return (Continuation<Unit>)new JsonKtorHTTPClient$send$5($completion); } @Nullable public final Object invoke(@NotNull HttpResponse p1, @Nullable Continuation<?> p2) { return ((JsonKtorHTTPClient$send$5)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*  85 */   } @Nullable public final <T> Object send(@NotNull String url, @NotNull String content, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Function2<? super HttpResponse, ? super Continuation<?>, ? extends Object> body, @NotNull Continuation<?> $completion) { HttpRequestBuilder httpRequestBuilder1 = new HttpRequestBuilder(), $this$send_u24lambda_u240 = httpRequestBuilder1; int $i$a$-apply-JsonKtorHTTPClient$send$builder$1 = 0;
/*  86 */     url($this$send_u24lambda_u240, url, queryParams);
/*  87 */     Pair[] arrayOfPair = new Pair[1]; arrayOfPair[0] = TuplesKt.to(HttpHeaders.INSTANCE.getContentType(), "application/json"); headers($this$send_u24lambda_u240, headers, (Pair<String, String>[])arrayOfPair);
/*  88 */     $this$send_u24lambda_u240.setMethod(HttpMethod.Companion.getPost());
/*  89 */     HttpRequestBuilder $this$setBody$iv = $this$send_u24lambda_u240; int $i$f$setBody = 0;
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
/* 218 */     String str = content;
/* 219 */     if (str == null) {
/* 220 */       $this$setBody$iv.setBody(NullBody.INSTANCE);
/* 221 */       int $i$f$typeInfo = 0;
/* 222 */       KType kType$iv$iv = Reflection.typeOf(String.class);
/* 223 */       Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv);
/* 224 */       $this$setBody$iv.setBodyType(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv));
/* 225 */     } else if (str instanceof io.ktor.http.content.OutgoingContent) {
/* 226 */       $this$setBody$iv.setBody(content);
/* 227 */       $this$setBody$iv.setBodyType(null);
/*     */     } else {
/*     */       
/* 230 */       $this$setBody$iv.setBody(content);
/* 231 */       int $i$f$typeInfo = 0; KType kType$iv$iv = Reflection.typeOf(String.class); Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv); $this$setBody$iv.setBodyType(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv));
/*     */     }  HttpRequestBuilder builder = httpRequestBuilder1; return sendAndWaitBody(builder, body, $completion); }
/*     */   @Nullable public final <T> Object send(@NotNull String url, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Function2<? super HttpResponse, ? super Continuation<?>, ? extends Object> body, @NotNull Continuation<?> $completion) { HttpRequestBuilder httpRequestBuilder1 = new HttpRequestBuilder(), $this$send_u24lambda_u241 = httpRequestBuilder1; int $i$a$-apply-JsonKtorHTTPClient$send$builder$2 = 0; url($this$send_u24lambda_u241, url, queryParams); headers($this$send_u24lambda_u241, headers, (Pair<String, String>[])new Pair[0]); $this$send_u24lambda_u241.setMethod(HttpMethod.Companion.getPost()); HttpRequestBuilder builder = httpRequestBuilder1; return sendAndWaitBody(builder, body, $completion); } @Nullable public final <T> Object send(@NotNull String url, @NotNull List content, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Function2<? super HttpResponse, ? super Continuation<?>, ? extends Object> body, @NotNull Continuation<?> $completion) { HttpRequestBuilder httpRequestBuilder1 = new HttpRequestBuilder(), $this$send_u24lambda_u242 = httpRequestBuilder1; int $i$a$-apply-JsonKtorHTTPClient$send$builder$3 = 0; url($this$send_u24lambda_u242, url, queryParams); headers($this$send_u24lambda_u242, headers, (Pair<String, String>[])new Pair[0]); $this$send_u24lambda_u242.setMethod(HttpMethod.Companion.getPost()); HttpRequestBuilder httpRequestBuilder2 = $this$send_u24lambda_u242; Object body$iv = new MultiPartFormDataContent(content, null, null, 6, null);
/*     */     int $i$f$setBody = 0;
/* 235 */     Object object1 = body$iv;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     if (object1 instanceof io.ktor.http.content.OutgoingContent) {
/* 243 */       httpRequestBuilder2.setBody(body$iv);
/* 244 */       httpRequestBuilder2.setBodyType(null);
/*     */     } else {
/*     */       
/* 247 */       httpRequestBuilder2.setBody(body$iv);
/* 248 */       int $i$f$typeInfo = 0; KType kType$iv$iv = Reflection.typeOf(MultiPartFormDataContent.class); Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv); httpRequestBuilder2.setBodyType(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(MultiPartFormDataContent.class), kType$iv$iv));
/*     */     }  HttpRequestBuilder builder = httpRequestBuilder1; return sendAndWaitBody(builder, body, $completion); } @Nullable public final <I, R, O> Object send(@NotNull String url, @NotNull Object content, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull KSerializer from, @NotNull KSerializer<R> to, @NotNull Function2<? super R, ? super Continuation<? super O>, ? extends Object> body, @NotNull Continuation<?> $completion) { int $i$f$send = 0; String serialized = JSON.Default.INSTANCE.string((SerializationStrategy)from, content); return send(url, serialized, headers, queryParams, new JsonKtorHTTPClient$send$9(to, body, null), $completion); }
/*     */   @Nullable public final Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Function2<? super ServerSentEvent, ? super Continuation<? super Boolean>, ? extends Object> isEnd, boolean reconnect, @NotNull Continuation $completion) { HttpRequestBuilder httpRequestBuilder1 = new HttpRequestBuilder(), $this$receiveContinuousSSE_u24lambda_u243 = httpRequestBuilder1; int $i$a$-apply-JsonKtorHTTPClient$receiveContinuousSSE$builder$1 = 0; url($this$receiveContinuousSSE_u24lambda_u243, url, queryParams); HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$receiveContinuousSSE_u24lambda_u243, ContentType.Application.INSTANCE.getJson()); headers($this$receiveContinuousSSE_u24lambda_u243, headers, (Pair<String, String>[])new Pair[0]); $this$receiveContinuousSSE_u24lambda_u243.setMethod(HttpMethod.Companion.getPost()); HttpRequestBuilder $this$setBody$iv = $this$receiveContinuousSSE_u24lambda_u243;
/*     */     int $i$f$setBody = 0;
/* 252 */     String str = content;
/* 253 */     if (str == null) {
/* 254 */       $this$setBody$iv.setBody(NullBody.INSTANCE);
/* 255 */       int $i$f$typeInfo = 0;
/* 256 */       KType kType$iv$iv = Reflection.typeOf(String.class);
/* 257 */       Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv);
/* 258 */       $this$setBody$iv.setBodyType(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv));
/* 259 */     } else if (str instanceof io.ktor.http.content.OutgoingContent) {
/* 260 */       $this$setBody$iv.setBody(content);
/* 261 */       $this$setBody$iv.setBodyType(null);
/*     */     } else {
/*     */       
/* 264 */       $this$setBody$iv.setBody(content);
/* 265 */       int $i$f$typeInfo = 0; KType kType$iv$iv = Reflection.typeOf(String.class); Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv); $this$setBody$iv.setBodyType(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv));
/*     */     } 
/*     */     HttpTimeoutKt.timeout($this$receiveContinuousSSE_u24lambda_u243, JsonKtorHTTPClient$receiveContinuousSSE$builder$1$1.INSTANCE);
/*     */     HttpRequestBuilder builder = httpRequestBuilder1;
/*     */     return FlowKt.flow(new JsonKtorHTTPClient$receiveContinuousSSE$2(builder, reconnect, isEnd, null)); }
/*     */ 
/*     */   
/*     */   private final <I, R, O> Object send$$forInline(String url, Object content, Map<String, String> headers, Map<String, String> queryParams, KSerializer from, KSerializer<R> to, Function2<? super R, ? super Continuation<? super O>, ? extends Object> body, Continuation<?> $completion) {
/*     */     int $i$f$send = 0;
/*     */     String serialized = JSON.Default.INSTANCE.string((SerializationStrategy)from, content);
/*     */     InlineMarker.mark(0);
/*     */     InlineMarker.mark(1);
/*     */     return send(url, serialized, headers, queryParams, new JsonKtorHTTPClient$send$9(to, body, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218, 142}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$send$9")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 176, d1 = {"\000\020\n\002\b\003\n\002\020\000\n\002\b\002\n\002\030\002\020\000\032\004\030\001H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003\"\b\b\002\020\001*\0020\0032\006\020\005\032\0020\006H@"}, d2 = {"<anonymous>", "O", "I", "", "R", "it", "Lio/ktor/client/statement/HttpResponse;"})
/*     */   @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$send$9\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,217:1\n155#2:218\n17#3,3:219\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$send$9\n*L\n139#1:218\n139#1:219,3\n*E\n"})
/*     */   public static final class JsonKtorHTTPClient$send$9 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super O>, Object> {
/*     */     int label;
/*     */     
/*     */     public JsonKtorHTTPClient$send$9(KSerializer<R> $to, Function2<R, Continuation<? super O>, Object> $body, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #9
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 177, 0 -> 36, 1 -> 109, 2 -> 167
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast io/ktor/client/statement/HttpResponse
/*     */       //   47: astore_2
/*     */       //   48: aload_2
/*     */       //   49: astore #4
/*     */       //   51: iconst_0
/*     */       //   52: istore #5
/*     */       //   54: aload #4
/*     */       //   56: invokevirtual getCall : ()Lio/ktor/client/call/HttpClientCall;
/*     */       //   59: iconst_0
/*     */       //   60: istore #6
/*     */       //   62: ldc java/lang/String
/*     */       //   64: invokestatic nullableTypeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*     */       //   67: astore #7
/*     */       //   69: aload #7
/*     */       //   71: invokestatic getJavaType : (Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;
/*     */       //   74: astore #8
/*     */       //   76: aload #8
/*     */       //   78: ldc java/lang/String
/*     */       //   80: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */       //   83: aload #7
/*     */       //   85: invokestatic typeInfoImpl : (Ljava/lang/reflect/Type;Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)Lio/ktor/util/reflect/TypeInfo;
/*     */       //   88: aload_0
/*     */       //   89: checkcast kotlin/coroutines/Continuation
/*     */       //   92: aload_0
/*     */       //   93: iconst_1
/*     */       //   94: putfield label : I
/*     */       //   97: invokevirtual bodyNullable : (Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   100: dup
/*     */       //   101: aload #9
/*     */       //   103: if_acmpne -> 117
/*     */       //   106: aload #9
/*     */       //   108: areturn
/*     */       //   109: iconst_0
/*     */       //   110: istore #5
/*     */       //   112: aload_1
/*     */       //   113: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   116: aload_1
/*     */       //   117: checkcast java/lang/String
/*     */       //   120: astore_3
/*     */       //   121: aload_3
/*     */       //   122: ifnull -> 175
/*     */       //   125: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */       //   128: aload_0
/*     */       //   129: getfield $to : Lkotlinx/serialization/KSerializer;
/*     */       //   132: checkcast kotlinx/serialization/DeserializationStrategy
/*     */       //   135: aload_3
/*     */       //   136: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */       //   139: astore #4
/*     */       //   141: aload_0
/*     */       //   142: getfield $body : Lkotlin/jvm/functions/Function2;
/*     */       //   145: aload #4
/*     */       //   147: aload_0
/*     */       //   148: aload_0
/*     */       //   149: iconst_2
/*     */       //   150: putfield label : I
/*     */       //   153: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   158: dup
/*     */       //   159: aload #9
/*     */       //   161: if_acmpne -> 172
/*     */       //   164: aload #9
/*     */       //   166: areturn
/*     */       //   167: aload_1
/*     */       //   168: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   171: aload_1
/*     */       //   172: goto -> 176
/*     */       //   175: aconst_null
/*     */       //   176: areturn
/*     */       //   177: new java/lang/IllegalStateException
/*     */       //   180: dup
/*     */       //   181: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   183: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   186: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #138	-> 3
/*     */       //   #139	-> 48
/*     */       //   #218	-> 54
/*     */       //   #219	-> 67
/*     */       //   #220	-> 69
/*     */       //   #221	-> 76
/*     */       //   #218	-> 92
/*     */       //   #138	-> 106
/*     */       //   #218	-> 117
/*     */       //   #139	-> 120
/*     */       //   #140	-> 121
/*     */       //   #141	-> 125
/*     */       //   #142	-> 141
/*     */       //   #138	-> 164
/*     */       //   #142	-> 172
/*     */       //   #143	-> 175
/*     */       //   #140	-> 176
/*     */       //   #138	-> 177
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	3	2	it	Lio/ktor/client/statement/HttpResponse;
/*     */       //   121	20	3	response	Ljava/lang/String;
/*     */       //   51	11	4	$this$body$iv	Lio/ktor/client/statement/HttpResponse;
/*     */       //   141	17	4	results	Ljava/lang/Object;
/*     */       //   69	19	7	kType$iv$iv	Lkotlin/reflect/KType;
/*     */       //   76	12	8	reifiedType$iv$iv	Ljava/lang/reflect/Type;
/*     */       //   62	26	6	$i$f$typeInfo	I
/*     */       //   54	55	5	$i$f$body	I
/*     */       //   40	137	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$send$9;
/*     */       //   40	137	1	$result	Ljava/lang/Object;
/*     */       //   112	8	5	$i$f$body	I
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend$$forInline(@NotNull Object $result) {
/*     */       HttpResponse it = (HttpResponse)this.L$0, httpResponse1 = it;
/*     */       int $i$f$body = 0;
/*     */       int $i$f$typeInfo = 0;
/*     */       KType kType$iv$iv = Reflection.nullableTypeOf(String.class);
/*     */       Type reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$send$9> $completion) {
/*     */       JsonKtorHTTPClient$send$9 jsonKtorHTTPClient$send$9 = new JsonKtorHTTPClient$send$9(this.$to, this.$body, $completion);
/*     */       jsonKtorHTTPClient$send$9.L$0 = value;
/*     */       return (Continuation<Unit>)jsonKtorHTTPClient$send$9;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull HttpResponse p1, @Nullable Continuation<?> p2) {
/*     */       return ((JsonKtorHTTPClient$send$9)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;", "invoke"})
/*     */   static final class JsonKtorHTTPClient$receiveContinuousSSE$builder$1$1 extends Lambda implements Function1<HttpTimeout.HttpTimeoutCapabilityConfiguration, Unit> {
/*     */     public static final JsonKtorHTTPClient$receiveContinuousSSE$builder$1$1 INSTANCE = new JsonKtorHTTPClient$receiveContinuousSSE$builder$1$1();
/*     */     
/*     */     public final void invoke(@NotNull HttpTimeout.HttpTimeoutCapabilityConfiguration $this$timeout) {
/*     */       Intrinsics.checkNotNullParameter($this$timeout, "$this$timeout");
/*     */       $this$timeout.setRequestTimeoutMillis(Long.valueOf(Long.MAX_VALUE));
/*     */       $this$timeout.setSocketTimeoutMillis(Long.valueOf(Long.MAX_VALUE));
/*     */     }
/*     */     
/*     */     JsonKtorHTTPClient$receiveContinuousSSE$builder$1$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {166}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$receiveContinuousSSE$2")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*     */   static final class JsonKtorHTTPClient$receiveContinuousSSE$2 extends SuspendLambda implements Function2<FlowCollector<? super ServerSentEvent>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JsonKtorHTTPClient$receiveContinuousSSE$2(HttpRequestBuilder $builder, boolean $reconnect, Function2<ServerSentEvent, Continuation<? super Boolean>, Object> $isEnd, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       FlowCollector<? super ServerSentEvent> $this$flow;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$flow = (FlowCollector)this.L$0;
/*     */           this.label = 1;
/*     */           if (JsonKtorHTTPClient.this.handleExceptions(this.$builder, (Function2)new Function2<HttpRequestBuilder, Continuation<? super Unit>, Object>(this.$reconnect, $this$flow, this.$isEnd, null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_3
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 123, 0 -> 32, 1 -> 113
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */                   //   43: astore_2
/*     */                   //   44: aload_0
/*     */                   //   45: getfield this$0 : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */                   //   48: invokestatic access$getClient$p : (Lai/grazie/utils/http/JsonKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */                   //   51: aload_2
/*     */                   //   52: iconst_1
/*     */                   //   53: aload_0
/*     */                   //   54: getfield $reconnect : Z
/*     */                   //   57: ifne -> 64
/*     */                   //   60: iconst_1
/*     */                   //   61: goto -> 65
/*     */                   //   64: iconst_0
/*     */                   //   65: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$1
/*     */                   //   68: dup
/*     */                   //   69: aload_0
/*     */                   //   70: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*     */                   //   73: aconst_null
/*     */                   //   74: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */                   //   77: checkcast kotlin/jvm/functions/Function2
/*     */                   //   80: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$2
/*     */                   //   83: dup
/*     */                   //   84: aload_0
/*     */                   //   85: getfield $$this$flow : Lkotlinx/coroutines/flow/FlowCollector;
/*     */                   //   88: invokespecial <init> : (Ljava/lang/Object;)V
/*     */                   //   91: checkcast kotlin/jvm/functions/Function2
/*     */                   //   94: aload_0
/*     */                   //   95: checkcast kotlin/coroutines/Continuation
/*     */                   //   98: aload_0
/*     */                   //   99: iconst_1
/*     */                   //   100: putfield label : I
/*     */                   //   103: invokestatic readSse : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   106: dup
/*     */                   //   107: aload_3
/*     */                   //   108: if_acmpne -> 118
/*     */                   //   111: aload_3
/*     */                   //   112: areturn
/*     */                   //   113: aload_1
/*     */                   //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   117: aload_1
/*     */                   //   118: pop
/*     */                   //   119: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   122: areturn
/*     */                   //   123: new java/lang/IllegalStateException
/*     */                   //   126: dup
/*     */                   //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   132: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #166	-> 3
/*     */                   //   #166	-> 44
/*     */                   //   #166	-> 111
/*     */                   //   #166	-> 118
/*     */                   //   #166	-> 123
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	20	2	it	Lio/ktor/client/request/HttpRequestBuilder;
/*     */                   //   36	87	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1;
/*     */                   //   36	87	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   Function2<HttpRequestBuilder, Continuation<? super Unit>, Object> function2 = new Function2<>(JsonKtorHTTPClient.this, this.$reconnect, this.$$this$flow, this.$isEnd, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           JsonKtorHTTPClient.this.handleExceptions(this.$builder, (Function2)new Function2<HttpRequestBuilder, Continuation<? super Unit>, Object>(this.$reconnect, $this$flow, this.$isEnd, null) {
/*     */                 int label;
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invokeSuspend(@NotNull Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_3
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 123, 0 -> 32, 1 -> 113
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */                   //   43: astore_2
/*     */                   //   44: aload_0
/*     */                   //   45: getfield this$0 : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */                   //   48: invokestatic access$getClient$p : (Lai/grazie/utils/http/JsonKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */                   //   51: aload_2
/*     */                   //   52: iconst_1
/*     */                   //   53: aload_0
/*     */                   //   54: getfield $reconnect : Z
/*     */                   //   57: ifne -> 64
/*     */                   //   60: iconst_1
/*     */                   //   61: goto -> 65
/*     */                   //   64: iconst_0
/*     */                   //   65: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$1
/*     */                   //   68: dup
/*     */                   //   69: aload_0
/*     */                   //   70: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*     */                   //   73: aconst_null
/*     */                   //   74: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */                   //   77: checkcast kotlin/jvm/functions/Function2
/*     */                   //   80: new ai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1$2
/*     */                   //   83: dup
/*     */                   //   84: aload_0
/*     */                   //   85: getfield $$this$flow : Lkotlinx/coroutines/flow/FlowCollector;
/*     */                   //   88: invokespecial <init> : (Ljava/lang/Object;)V
/*     */                   //   91: checkcast kotlin/jvm/functions/Function2
/*     */                   //   94: aload_0
/*     */                   //   95: checkcast kotlin/coroutines/Continuation
/*     */                   //   98: aload_0
/*     */                   //   99: iconst_1
/*     */                   //   100: putfield label : I
/*     */                   //   103: invokestatic readSse : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   106: dup
/*     */                   //   107: aload_3
/*     */                   //   108: if_acmpne -> 118
/*     */                   //   111: aload_3
/*     */                   //   112: areturn
/*     */                   //   113: aload_1
/*     */                   //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   117: aload_1
/*     */                   //   118: pop
/*     */                   //   119: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   122: areturn
/*     */                   //   123: new java/lang/IllegalStateException
/*     */                   //   126: dup
/*     */                   //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   132: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #166	-> 3
/*     */                   //   #166	-> 44
/*     */                   //   #166	-> 111
/*     */                   //   #166	-> 118
/*     */                   //   #166	-> 123
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	20	2	it	Lio/ktor/client/request/HttpRequestBuilder;
/*     */                   //   36	87	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$receiveContinuousSSE$2$1;
/*     */                   //   36	87	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                   Function2<HttpRequestBuilder, Continuation<? super Unit>, Object> function2 = new Function2<>(JsonKtorHTTPClient.this, this.$reconnect, this.$$this$flow, this.$isEnd, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 @Nullable
/*     */                 public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$receiveContinuousSSE$2> $completion) {
/*     */       JsonKtorHTTPClient$receiveContinuousSSE$2 jsonKtorHTTPClient$receiveContinuousSSE$2 = new JsonKtorHTTPClient$receiveContinuousSSE$2(this.$builder, this.$reconnect, this.$isEnd, $completion);
/*     */       jsonKtorHTTPClient$receiveContinuousSSE$2.L$0 = value;
/*     */       return (Continuation<Unit>)jsonKtorHTTPClient$receiveContinuousSSE$2;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull FlowCollector p1, @Nullable Continuation<?> p2) {
/*     */       return ((JsonKtorHTTPClient$receiveContinuousSSE$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final <T> Object get(@NotNull String url, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParams, @NotNull Function2<? super HttpResponse, ? super Continuation<?>, ? extends Object> body, @NotNull Continuation<?> $completion) {
/*     */     HttpRequestBuilder httpRequestBuilder1 = new HttpRequestBuilder(), $this$get_u24lambda_u244 = httpRequestBuilder1;
/*     */     int $i$a$-apply-JsonKtorHTTPClient$get$builder$1 = 0;
/*     */     url($this$get_u24lambda_u244, url, queryParams);
/*     */     headers($this$get_u24lambda_u244, headers, (Pair<String, String>[])new Pair[0]);
/*     */     $this$get_u24lambda_u244.setMethod(HttpMethod.Companion.getGet());
/*     */     HttpRequestBuilder builder = httpRequestBuilder1;
/*     */     return sendAndWaitBody(builder, body, $completion);
/*     */   }
/*     */   
/*     */   private final void headers(HttpRequestBuilder $this$headers, Map<String, String> headers, Pair... additionalHeaders) {
/*     */     HttpRequestKt.headers((HttpMessageBuilder)$this$headers, new JsonKtorHTTPClient$headers$1(headers, (Pair<String, String>[])additionalHeaders));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/http/HeadersBuilder;", "invoke"})
/*     */   static final class JsonKtorHTTPClient$headers$1 extends Lambda implements Function1<HeadersBuilder, Unit> {
/*     */     public final void invoke(@NotNull HeadersBuilder $this$headers) {
/*     */       Intrinsics.checkNotNullParameter($this$headers, "$this$headers");
/*     */       for (Map.Entry entry : MapsKt.plus(this.$headers, (Pair[])this.$additionalHeaders).entrySet()) {
/*     */         String key = (String)entry.getKey(), value = (String)entry.getValue();
/*     */         $this$headers.append(key, value);
/*     */       } 
/*     */     }
/*     */     
/*     */     JsonKtorHTTPClient$headers$1(Map<String, String> $headers, Pair[] $additionalHeaders) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void url(HttpRequestBuilder $this$url, String url, Map parameters) {
/*     */     HttpRequestKt.url($this$url, url);
/*     */     for (Map.Entry entry : parameters.entrySet()) {
/*     */       String key = (String)entry.getKey(), value = (String)entry.getValue();
/*     */       $this$url.getUrl().getParameters().append(key, value);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final <T> Object sendAndWaitBody(HttpRequestBuilder request, Function2<? super HttpResponse, ? super Continuation<? super T>, ? extends Object> body, Continuation<?> $completion) {
/*     */     return handleExceptions(request, new JsonKtorHTTPClient$sendAndWaitBody$2(request, body, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218, 196, 199}, i = {1}, s = {"L$0"}, n = {"result"}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndWaitBody$2")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "T", "it", "Lio/ktor/client/request/HttpRequestBuilder;"})
/*     */   @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,217:1\n22#2:218\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2\n*L\n194#1:218\n*E\n"})
/*     */   static final class JsonKtorHTTPClient$sendAndWaitBody$2 extends SuspendLambda implements Function2<HttpRequestBuilder, Continuation<? super T>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     JsonKtorHTTPClient$sendAndWaitBody$2(HttpRequestBuilder $request, Function2<HttpResponse, Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #6
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 231, 0 -> 40, 1 -> 92, 2 -> 153, 3 -> 225
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */       //   48: invokestatic access$getClient$p : (Lai/grazie/utils/http/JsonKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */       //   51: astore_3
/*     */       //   52: aload_0
/*     */       //   53: getfield $request : Lio/ktor/client/request/HttpRequestBuilder;
/*     */       //   56: astore #4
/*     */       //   58: iconst_0
/*     */       //   59: istore #5
/*     */       //   61: new io/ktor/client/statement/HttpStatement
/*     */       //   64: dup
/*     */       //   65: aload #4
/*     */       //   67: aload_3
/*     */       //   68: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*     */       //   71: aload_0
/*     */       //   72: checkcast kotlin/coroutines/Continuation
/*     */       //   75: aload_0
/*     */       //   76: iconst_1
/*     */       //   77: putfield label : I
/*     */       //   80: invokevirtual execute : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   83: dup
/*     */       //   84: aload #6
/*     */       //   86: if_acmpne -> 100
/*     */       //   89: aload #6
/*     */       //   91: areturn
/*     */       //   92: iconst_0
/*     */       //   93: istore #5
/*     */       //   95: aload_1
/*     */       //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   99: aload_1
/*     */       //   100: nop
/*     */       //   101: checkcast io/ktor/client/statement/HttpResponse
/*     */       //   104: astore_2
/*     */       //   105: aload_2
/*     */       //   106: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */       //   109: invokestatic isSuccess : (Lio/ktor/http/HttpStatusCode;)Z
/*     */       //   112: ifne -> 200
/*     */       //   115: new ai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1
/*     */       //   118: dup
/*     */       //   119: aload_2
/*     */       //   120: aconst_null
/*     */       //   121: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)V
/*     */       //   124: checkcast kotlin/jvm/functions/Function1
/*     */       //   127: aload_0
/*     */       //   128: checkcast kotlin/coroutines/Continuation
/*     */       //   131: aload_0
/*     */       //   132: aload_2
/*     */       //   133: putfield L$0 : Ljava/lang/Object;
/*     */       //   136: aload_0
/*     */       //   137: iconst_2
/*     */       //   138: putfield label : I
/*     */       //   141: invokestatic tryRun : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   144: dup
/*     */       //   145: aload #6
/*     */       //   147: if_acmpne -> 166
/*     */       //   150: aload #6
/*     */       //   152: areturn
/*     */       //   153: aload_0
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: checkcast io/ktor/client/statement/HttpResponse
/*     */       //   160: astore_2
/*     */       //   161: aload_1
/*     */       //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   165: aload_1
/*     */       //   166: checkcast java/lang/String
/*     */       //   169: astore_3
/*     */       //   170: new ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */       //   173: dup
/*     */       //   174: aload_2
/*     */       //   175: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */       //   178: invokevirtual getValue : ()I
/*     */       //   181: aload_0
/*     */       //   182: getfield $request : Lio/ktor/client/request/HttpRequestBuilder;
/*     */       //   185: invokevirtual getUrl : ()Lio/ktor/http/URLBuilder;
/*     */       //   188: invokevirtual buildString : ()Ljava/lang/String;
/*     */       //   191: aload_3
/*     */       //   192: aconst_null
/*     */       //   193: bipush #8
/*     */       //   195: aconst_null
/*     */       //   196: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   199: athrow
/*     */       //   200: aload_0
/*     */       //   201: getfield $body : Lkotlin/jvm/functions/Function2;
/*     */       //   204: aload_2
/*     */       //   205: aload_0
/*     */       //   206: aload_0
/*     */       //   207: iconst_3
/*     */       //   208: putfield label : I
/*     */       //   211: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   216: dup
/*     */       //   217: aload #6
/*     */       //   219: if_acmpne -> 230
/*     */       //   222: aload #6
/*     */       //   224: areturn
/*     */       //   225: aload_1
/*     */       //   226: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   229: aload_1
/*     */       //   230: areturn
/*     */       //   231: new java/lang/IllegalStateException
/*     */       //   234: dup
/*     */       //   235: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   237: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   240: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #193	-> 3
/*     */       //   #194	-> 44
/*     */       //   #218	-> 61
/*     */       //   #193	-> 89
/*     */       //   #218	-> 100
/*     */       //   #194	-> 101
/*     */       //   #195	-> 105
/*     */       //   #196	-> 115
/*     */       //   #193	-> 150
/*     */       //   #197	-> 170
/*     */       //   #199	-> 200
/*     */       //   #193	-> 222
/*     */       //   #199	-> 230
/*     */       //   #193	-> 231
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   105	48	2	result	Lio/ktor/client/statement/HttpResponse;
/*     */       //   161	39	2	result	Lio/ktor/client/statement/HttpResponse;
/*     */       //   200	16	2	result	Lio/ktor/client/statement/HttpResponse;
/*     */       //   58	25	3	$this$request$iv	Lio/ktor/client/HttpClient;
/*     */       //   170	30	3	errorText	Ljava/lang/String;
/*     */       //   58	25	4	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */       //   61	31	5	$i$f$request	I
/*     */       //   44	187	0	this	Lai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2;
/*     */       //   44	187	1	$result	Ljava/lang/Object;
/*     */       //   95	6	5	$i$f$request	I
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$sendAndWaitBody$2> $completion) {
/*     */       return (Continuation<Unit>)new JsonKtorHTTPClient$sendAndWaitBody$2(this.$request, this.$body, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) {
/*     */       return ((JsonKtorHTTPClient$sendAndWaitBody$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {218}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "T"})
/*     */     @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,217:1\n155#2:218\n17#3,3:219\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1\n*L\n196#1:218\n196#1:219,3\n*E\n"})
/*     */     static final class JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
/*     */       int label;
/*     */       
/*     */       JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1(HttpResponse $result, Continuation $completion) {
/*     */         super(1, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         HttpResponse $this$body$iv;
/*     */         int $i$f$body, $i$f$typeInfo;
/*     */         KType kType$iv$iv;
/*     */         Type reifiedType$iv$iv;
/*     */         Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */         switch (this.label) {
/*     */           case 0:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             $this$body$iv = this.$result;
/*     */             $i$f$body = 0;
/*     */             $i$f$typeInfo = 0;
/*     */             kType$iv$iv = Reflection.typeOf(String.class);
/*     */             reifiedType$iv$iv = TypesJVMKt.getJavaType(kType$iv$iv);
/*     */             this.label = 1;
/*     */             if ($this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this) == object)
/*     */               return object; 
/*     */             if ($this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this) == null)
/*     */               throw new NullPointerException("null cannot be cast to non-null type kotlin.String"); 
/*     */             return $this$body$iv.getCall().bodyNullable(TypeInfoJvmKt.typeInfoImpl(reifiedType$iv$iv, Reflection.getOrCreateKotlinClass(String.class), kType$iv$iv), (Continuation)this);
/*     */           case 1:
/*     */             $i$f$body = 0;
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             if (SYNTHETIC_LOCAL_VARIABLE_1 == null)
/*     */               throw new NullPointerException("null cannot be cast to non-null type kotlin.String"); 
/*     */             return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */         } 
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Continuation<Unit> create(@NotNull Continuation<? super JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1> $completion) {
/*     */         return (Continuation<Unit>)new JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1(this.$result, $completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invoke(@Nullable Continuation<?> p1) {
/*     */         return ((JsonKtorHTTPClient$sendAndWaitBody$2$errorText$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private final <T> Object sendAndStreamBody(HttpRequestBuilder request, Function2<? super HttpResponse, ? super Continuation<? super T>, ? extends Object> body, Continuation<?> $completion) {
/*     */     return handleExceptions(request, new JsonKtorHTTPClient$sendAndStreamBody$2(body, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {204}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndStreamBody$2")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "T", "it", "Lio/ktor/client/request/HttpRequestBuilder;"})
/*     */   @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndStreamBody$2\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,217:1\n29#2:218\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndStreamBody$2\n*L\n204#1:218\n*E\n"})
/*     */   static final class JsonKtorHTTPClient$sendAndStreamBody$2 extends SuspendLambda implements Function2<HttpRequestBuilder, Continuation<? super T>, Object> {
/*     */     int label;
/*     */     
/*     */     JsonKtorHTTPClient$sendAndStreamBody$2(Function2<HttpResponse, Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       HttpRequestBuilder it;
/*     */       HttpClient $this$prepareRequest$iv;
/*     */       int $i$f$prepareRequest;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (HttpRequestBuilder)this.L$0;
/*     */           $this$prepareRequest$iv = JsonKtorHTTPClient.this.client;
/*     */           $i$f$prepareRequest = 0;
/*     */           this.label = 1;
/*     */           return ((new HttpStatement(it, $this$prepareRequest$iv)).execute(this.$body, (Continuation)this) == object) ? object : (new HttpStatement(it, $this$prepareRequest$iv)).execute(this.$body, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$sendAndStreamBody$2> $completion) {
/*     */       JsonKtorHTTPClient$sendAndStreamBody$2 jsonKtorHTTPClient$sendAndStreamBody$2 = new JsonKtorHTTPClient$sendAndStreamBody$2(this.$body, $completion);
/*     */       jsonKtorHTTPClient$sendAndStreamBody$2.L$0 = value;
/*     */       return (Continuation<Unit>)jsonKtorHTTPClient$sendAndStreamBody$2;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) {
/*     */       return ((JsonKtorHTTPClient$sendAndStreamBody$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final <T> Object handleExceptions(HttpRequestBuilder request, Function2 block, Continuation<? super T> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/utils/http/JsonKtorHTTPClient$handleExceptions$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/utils/http/JsonKtorHTTPClient$handleExceptions$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #7
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new ai/grazie/utils/http/JsonKtorHTTPClient$handleExceptions$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_3
/*     */     //   47: invokespecial <init> : (Lai/grazie/utils/http/JsonKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #7
/*     */     //   52: aload #7
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #6
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #8
/*     */     //   64: aload #7
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 256, 0 -> 92, 1 -> 128
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: nop
/*     */     //   98: aload_2
/*     */     //   99: aload_1
/*     */     //   100: aload #7
/*     */     //   102: aload #7
/*     */     //   104: aload_1
/*     */     //   105: putfield L$0 : Ljava/lang/Object;
/*     */     //   108: aload #7
/*     */     //   110: iconst_1
/*     */     //   111: putfield label : I
/*     */     //   114: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   119: dup
/*     */     //   120: aload #8
/*     */     //   122: if_acmpne -> 145
/*     */     //   125: aload #8
/*     */     //   127: areturn
/*     */     //   128: aload #7
/*     */     //   130: getfield L$0 : Ljava/lang/Object;
/*     */     //   133: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */     //   136: astore_1
/*     */     //   137: nop
/*     */     //   138: aload #6
/*     */     //   140: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   143: aload #6
/*     */     //   145: astore #4
/*     */     //   147: goto -> 253
/*     */     //   150: astore #5
/*     */     //   152: new ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpTimeoutException
/*     */     //   155: dup
/*     */     //   156: aload_1
/*     */     //   157: invokevirtual getUrl : ()Lio/ktor/http/URLBuilder;
/*     */     //   160: invokevirtual buildString : ()Ljava/lang/String;
/*     */     //   163: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   168: aload #5
/*     */     //   170: checkcast java/lang/Throwable
/*     */     //   173: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   176: athrow
/*     */     //   177: astore #5
/*     */     //   179: new ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   182: dup
/*     */     //   183: aload #5
/*     */     //   185: invokevirtual getResponse : ()Lio/ktor/client/statement/HttpResponse;
/*     */     //   188: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   191: invokevirtual getValue : ()I
/*     */     //   194: aload_1
/*     */     //   195: invokevirtual getUrl : ()Lio/ktor/http/URLBuilder;
/*     */     //   198: invokevirtual buildString : ()Ljava/lang/String;
/*     */     //   201: aload #5
/*     */     //   203: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   206: aload #5
/*     */     //   208: checkcast java/lang/Throwable
/*     */     //   211: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   214: athrow
/*     */     //   215: astore #5
/*     */     //   217: new ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   220: dup
/*     */     //   221: aload #5
/*     */     //   223: invokevirtual getResponse : ()Lio/ktor/client/statement/HttpResponse;
/*     */     //   226: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   229: invokevirtual getValue : ()I
/*     */     //   232: aload_1
/*     */     //   233: invokevirtual getUrl : ()Lio/ktor/http/URLBuilder;
/*     */     //   236: invokevirtual buildString : ()Ljava/lang/String;
/*     */     //   239: aload #5
/*     */     //   241: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   244: aload #5
/*     */     //   246: checkcast java/lang/Throwable
/*     */     //   249: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   252: athrow
/*     */     //   253: aload #4
/*     */     //   255: areturn
/*     */     //   256: new java/lang/IllegalStateException
/*     */     //   259: dup
/*     */     //   260: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   263: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   266: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #206	-> 62
/*     */     //   #207	-> 97
/*     */     //   #208	-> 98
/*     */     //   #206	-> 125
/*     */     //   #208	-> 145
/*     */     //   #209	-> 150
/*     */     //   #210	-> 152
/*     */     //   #211	-> 177
/*     */     //   #212	-> 179
/*     */     //   #213	-> 215
/*     */     //   #214	-> 217
/*     */     //   #215	-> 255
/*     */     //   #206	-> 256
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	31	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   137	10	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   150	27	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   177	38	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   215	41	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   97	22	2	block	Lkotlin/jvm/functions/Function2;
/*     */     //   152	25	5	e	Lio/ktor/client/network/sockets/SocketTimeoutException;
/*     */     //   179	36	5	e	Lio/ktor/client/plugins/ClientRequestException;
/*     */     //   217	36	5	e	Lio/ktor/client/plugins/ServerResponseException;
/*     */     //   52	204	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	197	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   97	119	150	io/ktor/client/network/sockets/SocketTimeoutException
/*     */     //   97	119	177	io/ktor/client/plugins/ClientRequestException
/*     */     //   97	119	215	io/ktor/client/plugins/ServerResponseException
/*     */     //   137	147	150	io/ktor/client/network/sockets/SocketTimeoutException
/*     */     //   137	147	177	io/ktor/client/plugins/ClientRequestException
/*     */     //   137	147	215	io/ktor/client/plugins/ServerResponseException
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {208}, i = {0}, s = {"L$0"}, n = {"request"}, m = "handleExceptions", c = "ai.grazie.utils.http.JsonKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class JsonKtorHTTPClient$handleExceptions$1<T> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     JsonKtorHTTPClient$handleExceptions$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JsonKtorHTTPClient.this.handleExceptions(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */