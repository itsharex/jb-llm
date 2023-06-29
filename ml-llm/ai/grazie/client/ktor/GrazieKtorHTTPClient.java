/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import ai.grazie.client.common.model.HTTPResponse;
/*     */ import ai.grazie.client.common.model.Multipart;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*     */ import ai.grazie.utils.http.JsonKtorHTTPClient;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.utils.io.core.BytePacketBuilder;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\022\n\002\b\003\n\002\030\002\n\002\b\005\030\000 %2\0020\001:\003$%&B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH\002J!\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H@ø\001\000¢\006\002\020\024J7\020\025\032\b\022\004\022\0020\0270\0262\006\020\020\032\0020\0212\006\020\030\032\0020\0212\006\020\022\032\0020\0232\006\020\031\032\0020\032H@ø\001\000¢\006\002\020\033J)\020\034\032\0020\0172\006\020\020\032\0020\0212\006\020\030\032\0020\r2\006\020\022\032\0020\023H@ø\001\000¢\006\002\020\035J!\020\034\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H@ø\001\000¢\006\002\020\024J)\020\034\032\0020\0172\006\020\020\032\0020\0212\006\020\030\032\0020\0362\006\020\022\032\0020\023H@ø\001\000¢\006\002\020\037J\031\020 \032\0020\0172\006\020!\032\0020\"H@ø\001\000¢\006\002\020#R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006'"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "(Lai/grazie/utils/http/JsonKtorHTTPClient;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "buildMultipart", "", "Lio/ktor/http/content/PartData;", "multipart", "Lai/grazie/client/common/model/Multipart;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toResponse", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Client", "Companion", "Server", "client-ktor"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 TypeInfoJvm.kt\nio/ktor/util/reflect/TypeInfoJvmKt\n*L\n1#1,129:1\n155#2:130\n17#3,3:131\n*S KotlinDebug\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient\n*L\n98#1:130\n98#1:131,3\n*E\n"})
/*     */ public final class GrazieKtorHTTPClient implements SuspendableHTTPClient {
/*  22 */   public GrazieKtorHTTPClient(@NotNull JsonKtorHTTPClient client) { this.client = client;
/*  23 */     this.authVersion = AuthVersion.None; } @NotNull public AuthVersion getAuthVersion() { return this.authVersion; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Client;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "client-ktor"})
/*     */   public static final class Client
/*     */   {
/*     */     @NotNull
/*  32 */     public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$Default$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getDefault() { Lazy lazy = Default$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$Default$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$Default$2 INSTANCE = new GrazieKtorHTTPClient$Client$Default$2(); GrazieKtorHTTPClient$Client$Default$2() { super(0); } @NotNull public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getDefault()); } } @NotNull
/*  33 */     private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithExtendedTimeout$2(); GrazieKtorHTTPClient$Client$WithExtendedTimeout$2() { super(0); } @NotNull public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getWithExtendedTimeout()); }
/*     */        }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Server;", "", "()V", "client-ktor"})
/*     */   public static final class Server {
/*     */     @NotNull
/*     */     public static final Server INSTANCE = new Server();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R!\020\003\032\0020\0048FX\002¢\006\022\n\004\b\b\020\t\022\004\b\005\020\002\032\004\b\006\020\007R!\020\n\032\0020\0048FX\002¢\006\022\n\004\b\r\020\t\022\004\b\013\020\002\032\004\b\f\020\007¨\006\016"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Companion;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "getDefault$annotations", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout$annotations", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "client-ktor"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final GrazieKtorHTTPClient getDefault() {
/*  48 */       Lazy lazy = GrazieKtorHTTPClient.Default$delegate; return (GrazieKtorHTTPClient)lazy.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final GrazieKtorHTTPClient getWithExtendedTimeout() {
/*  54 */       Lazy lazy = GrazieKtorHTTPClient.WithExtendedTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final JsonKtorHTTPClient client; @NotNull private final AuthVersion authVersion; @NotNull private static final Lazy<GrazieKtorHTTPClient> Default$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Companion$Default$2.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Companion$Default$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Companion$Default$2 INSTANCE = new GrazieKtorHTTPClient$Companion$Default$2(); @NotNull public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getDefault()); } GrazieKtorHTTPClient$Companion$Default$2() { super(0); } } @NotNull private static final Lazy<GrazieKtorHTTPClient> WithExtendedTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Companion$WithExtendedTimeout$2.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Companion$WithExtendedTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Companion$WithExtendedTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Companion$WithExtendedTimeout$2(); @NotNull
/*  55 */     public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getWithExtendedTimeout()); }
/*     */      GrazieKtorHTTPClient$Companion$WithExtendedTimeout$2() {
/*     */       super(0);
/*     */     } } @Nullable
/*     */   public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$send$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$send$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/client/ktor/GrazieKtorHTTPClient$send$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 172, 0 -> 92, 1 -> 152
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: nop
/*     */     //   98: aload_0
/*     */     //   99: getfield client : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */     //   102: aload_1
/*     */     //   103: aload_2
/*     */     //   104: invokestatic decodeToString : ([B)Ljava/lang/String;
/*     */     //   107: aload_3
/*     */     //   108: invokevirtual getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */     //   111: invokestatic toMap : (Lai/grazie/client/common/model/HeaderCollection;)Ljava/util/Map;
/*     */     //   114: aload_3
/*     */     //   115: invokevirtual getQueryParameters : ()Lai/grazie/client/common/model/QueryParameterCollection;
/*     */     //   118: invokestatic toMap : (Lai/grazie/client/common/model/QueryParameterCollection;)Ljava/util/Map;
/*     */     //   121: new ai/grazie/client/ktor/GrazieKtorHTTPClient$send$2
/*     */     //   124: dup
/*     */     //   125: aload_0
/*     */     //   126: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   129: checkcast kotlin/jvm/functions/Function2
/*     */     //   132: aload #7
/*     */     //   134: aload #7
/*     */     //   136: iconst_1
/*     */     //   137: putfield label : I
/*     */     //   140: invokevirtual send : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #8
/*     */     //   146: if_acmpne -> 160
/*     */     //   149: aload #8
/*     */     //   151: areturn
/*     */     //   152: nop
/*     */     //   153: aload #6
/*     */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   158: aload #6
/*     */     //   160: areturn
/*     */     //   161: astore #5
/*     */     //   163: getstatic ai/grazie/model/cloud/exceptions/HTTPStatusException.Companion : Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;
/*     */     //   166: aload #5
/*     */     //   168: invokestatic of : (Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;)Lai/grazie/model/cloud/exceptions/HTTPStatusException;
/*     */     //   171: athrow
/*     */     //   172: new java/lang/IllegalStateException
/*     */     //   175: dup
/*     */     //   176: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   178: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   181: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 63
/*     */     //   #61	-> 97
/*     */     //   #62	-> 98
/*     */     //   #60	-> 149
/*     */     //   #63	-> 160
/*     */     //   #64	-> 163
/*     */     //   #60	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	46	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   97	46	1	url	Ljava/lang/String;
/*     */     //   97	46	2	content	[B
/*     */     //   97	46	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   163	9	5	e	Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;
/*     */     //   53	119	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	112	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   97	143	161	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   152	161	161	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */   } @Nullable
/*     */   public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$send$3
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$send$3
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/client/ktor/GrazieKtorHTTPClient$send$3
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 173, 0 -> 92, 1 -> 153
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: nop
/*     */     //   98: aload_0
/*     */     //   99: getfield client : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */     //   102: aload_1
/*     */     //   103: aload_0
/*     */     //   104: aload_2
/*     */     //   105: invokespecial buildMultipart : (Lai/grazie/client/common/model/Multipart;)Ljava/util/List;
/*     */     //   108: aload_3
/*     */     //   109: invokevirtual getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */     //   112: invokestatic toMap : (Lai/grazie/client/common/model/HeaderCollection;)Ljava/util/Map;
/*     */     //   115: aload_3
/*     */     //   116: invokevirtual getQueryParameters : ()Lai/grazie/client/common/model/QueryParameterCollection;
/*     */     //   119: invokestatic toMap : (Lai/grazie/client/common/model/QueryParameterCollection;)Ljava/util/Map;
/*     */     //   122: new ai/grazie/client/ktor/GrazieKtorHTTPClient$send$4
/*     */     //   125: dup
/*     */     //   126: aload_0
/*     */     //   127: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   130: checkcast kotlin/jvm/functions/Function2
/*     */     //   133: aload #7
/*     */     //   135: aload #7
/*     */     //   137: iconst_1
/*     */     //   138: putfield label : I
/*     */     //   141: invokevirtual send : (Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #8
/*     */     //   147: if_acmpne -> 161
/*     */     //   150: aload #8
/*     */     //   152: areturn
/*     */     //   153: nop
/*     */     //   154: aload #6
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #6
/*     */     //   161: areturn
/*     */     //   162: astore #5
/*     */     //   164: getstatic ai/grazie/model/cloud/exceptions/HTTPStatusException.Companion : Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;
/*     */     //   167: aload #5
/*     */     //   169: invokestatic of : (Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;)Lai/grazie/model/cloud/exceptions/HTTPStatusException;
/*     */     //   172: athrow
/*     */     //   173: new java/lang/IllegalStateException
/*     */     //   176: dup
/*     */     //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   179: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   182: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 63
/*     */     //   #69	-> 97
/*     */     //   #70	-> 98
/*     */     //   #68	-> 150
/*     */     //   #71	-> 161
/*     */     //   #72	-> 164
/*     */     //   #68	-> 173
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	47	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   97	47	1	url	Ljava/lang/String;
/*     */     //   97	47	2	content	Lai/grazie/client/common/model/Multipart;
/*     */     //   97	47	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   164	9	5	e	Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;
/*     */     //   53	120	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	113	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   97	144	162	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   153	162	162	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */   }
/*     */   @Nullable
/*     */   public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean paramBoolean, @NotNull Continuation<? super Flow<ServerSentEvent>> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 172, 0 -> 92, 1 -> 147
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield client : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */     //   101: aload_1
/*     */     //   102: aload_2
/*     */     //   103: aload_3
/*     */     //   104: invokevirtual getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */     //   107: invokestatic toMap : (Lai/grazie/client/common/model/HeaderCollection;)Ljava/util/Map;
/*     */     //   110: aload_3
/*     */     //   111: invokevirtual getQueryParameters : ()Lai/grazie/client/common/model/QueryParameterCollection;
/*     */     //   114: invokestatic toMap : (Lai/grazie/client/common/model/QueryParameterCollection;)Ljava/util/Map;
/*     */     //   117: getstatic ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$2.INSTANCE : Lai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$2;
/*     */     //   120: checkcast kotlin/jvm/functions/Function2
/*     */     //   123: iconst_0
/*     */     //   124: aload #7
/*     */     //   126: bipush #32
/*     */     //   128: aconst_null
/*     */     //   129: aload #7
/*     */     //   131: iconst_1
/*     */     //   132: putfield label : I
/*     */     //   135: invokestatic receiveContinuousSSE$default : (Lai/grazie/utils/http/JsonKtorHTTPClient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   138: dup
/*     */     //   139: aload #8
/*     */     //   141: if_acmpne -> 154
/*     */     //   144: aload #8
/*     */     //   146: areturn
/*     */     //   147: aload #6
/*     */     //   149: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   152: aload #6
/*     */     //   154: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   157: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$3
/*     */     //   160: dup
/*     */     //   161: aconst_null
/*     */     //   162: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   165: checkcast kotlin/jvm/functions/Function3
/*     */     //   168: invokestatic catch : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   171: areturn
/*     */     //   172: new java/lang/IllegalStateException
/*     */     //   175: dup
/*     */     //   176: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   178: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   181: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #76	-> 63
/*     */     //   #77	-> 97
/*     */     //   #76	-> 144
/*     */     //   #78	-> 157
/*     */     //   #77	-> 171
/*     */     //   #76	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	41	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   97	41	1	url	Ljava/lang/String;
/*     */     //   97	41	2	content	Ljava/lang/String;
/*     */     //   97	41	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   53	119	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	112	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient$receiveContinuousSSE$3")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\020\003\020\000\032\0020\001*\b\022\004\022\0020\0030\0022\006\020\004\032\0020\005H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "it", ""})
/*     */   static final class GrazieKtorHTTPClient$receiveContinuousSSE$3 extends SuspendLambda implements Function3<FlowCollector<? super ServerSentEvent>, Throwable, Continuation<? super Unit>, Object> { int label;
/*     */     GrazieKtorHTTPClient$receiveContinuousSSE$3(Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Throwable it;
/*  78 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Throwable)this.L$0; if (it instanceof JsonKtorHTTPClient.KtorHttpException) throw ExceptionExtensionsKt.of(HTTPStatusException.Companion, (JsonKtorHTTPClient.KtorHttpException)it);  throw it; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull FlowCollector p1, @NotNull Throwable p2, @Nullable Continuation<? super GrazieKtorHTTPClient$receiveContinuousSSE$3> p3) {
/*     */       GrazieKtorHTTPClient$receiveContinuousSSE$3 grazieKtorHTTPClient$receiveContinuousSSE$3 = new GrazieKtorHTTPClient$receiveContinuousSSE$3(p3);
/*     */       grazieKtorHTTPClient$receiveContinuousSSE$3.L$0 = p2;
/*     */       return grazieKtorHTTPClient$receiveContinuousSSE$3.invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   
/*     */   @Nullable
/*     */   public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$get$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$get$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/client/ktor/GrazieKtorHTTPClient$get$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 164, 0 -> 88, 1 -> 144
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: aload_0
/*     */     //   95: getfield client : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */     //   98: aload_1
/*     */     //   99: aload_2
/*     */     //   100: invokevirtual getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */     //   103: invokestatic toMap : (Lai/grazie/client/common/model/HeaderCollection;)Ljava/util/Map;
/*     */     //   106: aload_2
/*     */     //   107: invokevirtual getQueryParameters : ()Lai/grazie/client/common/model/QueryParameterCollection;
/*     */     //   110: invokestatic toMap : (Lai/grazie/client/common/model/QueryParameterCollection;)Ljava/util/Map;
/*     */     //   113: new ai/grazie/client/ktor/GrazieKtorHTTPClient$get$2
/*     */     //   116: dup
/*     */     //   117: aload_0
/*     */     //   118: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   121: checkcast kotlin/jvm/functions/Function2
/*     */     //   124: aload #6
/*     */     //   126: aload #6
/*     */     //   128: iconst_1
/*     */     //   129: putfield label : I
/*     */     //   132: invokevirtual get : (Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   135: dup
/*     */     //   136: aload #7
/*     */     //   138: if_acmpne -> 152
/*     */     //   141: aload #7
/*     */     //   143: areturn
/*     */     //   144: nop
/*     */     //   145: aload #5
/*     */     //   147: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   150: aload #5
/*     */     //   152: areturn
/*     */     //   153: astore #4
/*     */     //   155: getstatic ai/grazie/model/cloud/exceptions/HTTPStatusException.Companion : Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;
/*     */     //   158: aload #4
/*     */     //   160: invokestatic of : (Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;)Lai/grazie/model/cloud/exceptions/HTTPStatusException;
/*     */     //   163: athrow
/*     */     //   164: new java/lang/IllegalStateException
/*     */     //   167: dup
/*     */     //   168: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   173: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 60
/*     */     //   #82	-> 93
/*     */     //   #83	-> 94
/*     */     //   #81	-> 141
/*     */     //   #84	-> 152
/*     */     //   #85	-> 155
/*     */     //   #81	-> 164
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	42	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   93	42	1	url	Ljava/lang/String;
/*     */     //   93	42	2	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   155	9	4	e	Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;
/*     */     //   50	114	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	107	5	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   93	135	153	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   144	153	153	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$send$5
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$send$5
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/client/ktor/GrazieKtorHTTPClient$send$5
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 164, 0 -> 88, 1 -> 144
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: aload_0
/*     */     //   95: getfield client : Lai/grazie/utils/http/JsonKtorHTTPClient;
/*     */     //   98: aload_1
/*     */     //   99: aload_2
/*     */     //   100: invokevirtual getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */     //   103: invokestatic toMap : (Lai/grazie/client/common/model/HeaderCollection;)Ljava/util/Map;
/*     */     //   106: aload_2
/*     */     //   107: invokevirtual getQueryParameters : ()Lai/grazie/client/common/model/QueryParameterCollection;
/*     */     //   110: invokestatic toMap : (Lai/grazie/client/common/model/QueryParameterCollection;)Ljava/util/Map;
/*     */     //   113: new ai/grazie/client/ktor/GrazieKtorHTTPClient$send$6
/*     */     //   116: dup
/*     */     //   117: aload_0
/*     */     //   118: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   121: checkcast kotlin/jvm/functions/Function2
/*     */     //   124: aload #6
/*     */     //   126: aload #6
/*     */     //   128: iconst_1
/*     */     //   129: putfield label : I
/*     */     //   132: invokevirtual send : (Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   135: dup
/*     */     //   136: aload #7
/*     */     //   138: if_acmpne -> 152
/*     */     //   141: aload #7
/*     */     //   143: areturn
/*     */     //   144: nop
/*     */     //   145: aload #5
/*     */     //   147: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   150: aload #5
/*     */     //   152: areturn
/*     */     //   153: astore #4
/*     */     //   155: getstatic ai/grazie/model/cloud/exceptions/HTTPStatusException.Companion : Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;
/*     */     //   158: aload #4
/*     */     //   160: invokestatic of : (Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;)Lai/grazie/model/cloud/exceptions/HTTPStatusException;
/*     */     //   163: athrow
/*     */     //   164: new java/lang/IllegalStateException
/*     */     //   167: dup
/*     */     //   168: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   173: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #89	-> 60
/*     */     //   #90	-> 93
/*     */     //   #91	-> 94
/*     */     //   #89	-> 141
/*     */     //   #92	-> 152
/*     */     //   #93	-> 155
/*     */     //   #89	-> 164
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	42	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   93	42	1	url	Ljava/lang/String;
/*     */     //   93	42	2	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   155	9	4	e	Lai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException;
/*     */     //   50	114	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	107	5	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   93	135	153	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */     //   144	153	153	ai/grazie/utils/http/JsonKtorHTTPClient$KtorHttpException
/*     */   }
/*     */   
/*     */   private final Object toResponse(HttpResponse response, Continuation<? super HTTPResponse> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$toResponse$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$toResponse$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/client/ktor/GrazieKtorHTTPClient$toResponse$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 233, 0 -> 88, 1 -> 176
/*     */     //   88: aload #9
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic ai/grazie/client/common/model/HeaderCollection.Companion : Lai/grazie/client/common/model/HeaderCollection$Companion;
/*     */     //   96: aload_1
/*     */     //   97: invokevirtual getHeaders : ()Lio/ktor/http/Headers;
/*     */     //   100: checkcast io/ktor/util/StringValues
/*     */     //   103: invokestatic toMap : (Lio/ktor/util/StringValues;)Ljava/util/Map;
/*     */     //   106: invokestatic of : (Lai/grazie/client/common/model/HeaderCollection$Companion;Ljava/util/Map;)Lai/grazie/client/common/model/HeaderCollection;
/*     */     //   109: aload_1
/*     */     //   110: astore_3
/*     */     //   111: astore #8
/*     */     //   113: iconst_0
/*     */     //   114: istore #4
/*     */     //   116: aload_3
/*     */     //   117: invokevirtual getCall : ()Lio/ktor/client/call/HttpClientCall;
/*     */     //   120: iconst_0
/*     */     //   121: istore #5
/*     */     //   123: ldc [B
/*     */     //   125: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*     */     //   128: astore #6
/*     */     //   130: aload #6
/*     */     //   132: invokestatic getJavaType : (Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;
/*     */     //   135: astore #7
/*     */     //   137: aload #7
/*     */     //   139: ldc [B
/*     */     //   141: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   144: aload #6
/*     */     //   146: invokestatic typeInfoImpl : (Ljava/lang/reflect/Type;Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)Lio/ktor/util/reflect/TypeInfo;
/*     */     //   149: aload #10
/*     */     //   151: aload #10
/*     */     //   153: aload #8
/*     */     //   155: putfield L$0 : Ljava/lang/Object;
/*     */     //   158: aload #10
/*     */     //   160: iconst_1
/*     */     //   161: putfield label : I
/*     */     //   164: invokevirtual bodyNullable : (Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   167: dup
/*     */     //   168: aload #13
/*     */     //   170: if_acmpne -> 196
/*     */     //   173: aload #13
/*     */     //   175: areturn
/*     */     //   176: iconst_0
/*     */     //   177: istore #4
/*     */     //   179: aload #10
/*     */     //   181: getfield L$0 : Ljava/lang/Object;
/*     */     //   184: checkcast ai/grazie/client/common/model/HeaderCollection
/*     */     //   187: astore #8
/*     */     //   189: aload #9
/*     */     //   191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   194: aload #9
/*     */     //   196: dup
/*     */     //   197: ifnonnull -> 211
/*     */     //   200: new java/lang/NullPointerException
/*     */     //   203: dup
/*     */     //   204: ldc_w 'null cannot be cast to non-null type kotlin.ByteArray'
/*     */     //   207: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   210: athrow
/*     */     //   211: checkcast [B
/*     */     //   214: aload #8
/*     */     //   216: swap
/*     */     //   217: astore #11
/*     */     //   219: astore #12
/*     */     //   221: new ai/grazie/client/common/model/HTTPResponse
/*     */     //   224: dup
/*     */     //   225: aload #12
/*     */     //   227: aload #11
/*     */     //   229: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;[B)V
/*     */     //   232: areturn
/*     */     //   233: new java/lang/IllegalStateException
/*     */     //   236: dup
/*     */     //   237: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   239: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   242: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 60
/*     */     //   #98	-> 93
/*     */     //   #130	-> 116
/*     */     //   #131	-> 128
/*     */     //   #132	-> 130
/*     */     //   #133	-> 137
/*     */     //   #130	-> 151
/*     */     //   #97	-> 173
/*     */     //   #130	-> 196
/*     */     //   #98	-> 217
/*     */     //   #97	-> 233
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	20	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   113	10	3	$this$body$iv	Lio/ktor/client/statement/HttpResponse;
/*     */     //   130	19	6	kType$iv$iv	Lkotlin/reflect/KType;
/*     */     //   137	12	7	reifiedType$iv$iv	Ljava/lang/reflect/Type;
/*     */     //   123	26	5	$i$f$typeInfo	I
/*     */     //   116	60	4	$i$f$body	I
/*     */     //   50	183	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	176	9	$result	Ljava/lang/Object;
/*     */     //   179	35	4	$i$f$body	I
/*     */   }
/*     */   
/*     */   private final List<PartData> buildMultipart(Multipart multipart) {
/* 102 */     return FormDslKt.formData(new GrazieKtorHTTPClient$buildMultipart$1(multipart));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final GrazieKtorHTTPClient getDefault() {
/*     */     return Companion.getDefault();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final GrazieKtorHTTPClient getWithExtendedTimeout() {
/*     */     return Companion.getWithExtendedTimeout();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/request/forms/FormBuilder;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,129:1\n13579#2:130\n13579#2,2:132\n13579#2,2:135\n13580#2:137\n24#3:131\n24#3:134\n*S KotlinDebug\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1\n*L\n103#1:130\n106#1:132,2\n115#1:135,2\n103#1:137\n105#1:131\n114#1:134\n*E\n"})
/*     */   static final class GrazieKtorHTTPClient$buildMultipart$1 extends Lambda implements Function1<FormBuilder, Unit> {
/*     */     public final void invoke(@NotNull FormBuilder $this$formData) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$formData'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $multipart : Lai/grazie/client/common/model/Multipart;
/*     */       //   10: invokevirtual getParts : ()[Lai/grazie/client/common/model/Multipart$PartItem;
/*     */       //   13: astore_2
/*     */       //   14: iconst_0
/*     */       //   15: istore_3
/*     */       //   16: iconst_0
/*     */       //   17: istore #4
/*     */       //   19: aload_2
/*     */       //   20: arraylength
/*     */       //   21: istore #5
/*     */       //   23: iload #4
/*     */       //   25: iload #5
/*     */       //   27: if_icmpge -> 430
/*     */       //   30: aload_2
/*     */       //   31: iload #4
/*     */       //   33: aaload
/*     */       //   34: astore #6
/*     */       //   36: aload #6
/*     */       //   38: astore #7
/*     */       //   40: iconst_0
/*     */       //   41: istore #8
/*     */       //   43: aload #7
/*     */       //   45: astore #9
/*     */       //   47: aload #9
/*     */       //   49: instanceof ai/grazie/client/common/model/Multipart$FormPart
/*     */       //   52: ifeq -> 222
/*     */       //   55: aload_1
/*     */       //   56: aload #7
/*     */       //   58: invokeinterface getKey : ()Ljava/lang/String;
/*     */       //   63: aload #7
/*     */       //   65: invokeinterface getValue : ()Ljava/lang/String;
/*     */       //   70: getstatic io/ktor/http/Headers.Companion : Lio/ktor/http/Headers$Companion;
/*     */       //   73: astore #10
/*     */       //   75: iconst_0
/*     */       //   76: istore #11
/*     */       //   78: new io/ktor/http/HeadersBuilder
/*     */       //   81: dup
/*     */       //   82: iconst_0
/*     */       //   83: iconst_1
/*     */       //   84: aconst_null
/*     */       //   85: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   88: astore #12
/*     */       //   90: aload #12
/*     */       //   92: astore #13
/*     */       //   94: astore #14
/*     */       //   96: astore #15
/*     */       //   98: astore #16
/*     */       //   100: iconst_0
/*     */       //   101: istore #17
/*     */       //   103: aload #7
/*     */       //   105: invokeinterface getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */       //   110: invokevirtual getKeys : ()[Ljava/lang/String;
/*     */       //   113: astore #18
/*     */       //   115: iconst_0
/*     */       //   116: istore #19
/*     */       //   118: iconst_0
/*     */       //   119: istore #20
/*     */       //   121: aload #18
/*     */       //   123: arraylength
/*     */       //   124: istore #21
/*     */       //   126: iload #20
/*     */       //   128: iload #21
/*     */       //   130: if_icmpge -> 198
/*     */       //   133: aload #18
/*     */       //   135: iload #20
/*     */       //   137: aaload
/*     */       //   138: astore #22
/*     */       //   140: aload #22
/*     */       //   142: astore #23
/*     */       //   144: iconst_0
/*     */       //   145: istore #24
/*     */       //   147: aload #13
/*     */       //   149: aload #23
/*     */       //   151: aload #7
/*     */       //   153: invokeinterface getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */       //   158: aload #23
/*     */       //   160: invokevirtual get : (Ljava/lang/String;)[Ljava/lang/String;
/*     */       //   163: dup
/*     */       //   164: ifnull -> 180
/*     */       //   167: invokestatic toList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   170: dup
/*     */       //   171: ifnull -> 180
/*     */       //   174: checkcast java/lang/Iterable
/*     */       //   177: goto -> 187
/*     */       //   180: pop
/*     */       //   181: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   184: checkcast java/lang/Iterable
/*     */       //   187: invokevirtual appendAll : (Ljava/lang/String;Ljava/lang/Iterable;)V
/*     */       //   190: nop
/*     */       //   191: nop
/*     */       //   192: iinc #20, 1
/*     */       //   195: goto -> 126
/*     */       //   198: nop
/*     */       //   199: nop
/*     */       //   200: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   203: astore #25
/*     */       //   205: aload #16
/*     */       //   207: aload #15
/*     */       //   209: aload #14
/*     */       //   211: aload #12
/*     */       //   213: invokevirtual build : ()Lio/ktor/http/Headers;
/*     */       //   216: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/Headers;)V
/*     */       //   219: goto -> 422
/*     */       //   222: aload #9
/*     */       //   224: instanceof ai/grazie/client/common/model/Multipart$FilePart
/*     */       //   227: ifeq -> 422
/*     */       //   230: aload_1
/*     */       //   231: aload #7
/*     */       //   233: invokeinterface getKey : ()Ljava/lang/String;
/*     */       //   238: getstatic io/ktor/http/Headers.Companion : Lio/ktor/http/Headers$Companion;
/*     */       //   241: astore #10
/*     */       //   243: iconst_0
/*     */       //   244: istore #11
/*     */       //   246: new io/ktor/http/HeadersBuilder
/*     */       //   249: dup
/*     */       //   250: iconst_0
/*     */       //   251: iconst_1
/*     */       //   252: aconst_null
/*     */       //   253: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   256: astore #12
/*     */       //   258: aload #12
/*     */       //   260: astore #13
/*     */       //   262: astore #15
/*     */       //   264: astore #16
/*     */       //   266: iconst_0
/*     */       //   267: istore #17
/*     */       //   269: aload #7
/*     */       //   271: invokeinterface getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */       //   276: invokevirtual getKeys : ()[Ljava/lang/String;
/*     */       //   279: astore #18
/*     */       //   281: iconst_0
/*     */       //   282: istore #19
/*     */       //   284: iconst_0
/*     */       //   285: istore #20
/*     */       //   287: aload #18
/*     */       //   289: arraylength
/*     */       //   290: istore #21
/*     */       //   292: iload #20
/*     */       //   294: iload #21
/*     */       //   296: if_icmpge -> 364
/*     */       //   299: aload #18
/*     */       //   301: iload #20
/*     */       //   303: aaload
/*     */       //   304: astore #22
/*     */       //   306: aload #22
/*     */       //   308: astore #23
/*     */       //   310: iconst_0
/*     */       //   311: istore #24
/*     */       //   313: aload #13
/*     */       //   315: aload #23
/*     */       //   317: aload #7
/*     */       //   319: invokeinterface getHeaders : ()Lai/grazie/client/common/model/HeaderCollection;
/*     */       //   324: aload #23
/*     */       //   326: invokevirtual get : (Ljava/lang/String;)[Ljava/lang/String;
/*     */       //   329: dup
/*     */       //   330: ifnull -> 346
/*     */       //   333: invokestatic toList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   336: dup
/*     */       //   337: ifnull -> 346
/*     */       //   340: checkcast java/lang/Iterable
/*     */       //   343: goto -> 353
/*     */       //   346: pop
/*     */       //   347: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   350: checkcast java/lang/Iterable
/*     */       //   353: invokevirtual appendAll : (Ljava/lang/String;Ljava/lang/Iterable;)V
/*     */       //   356: nop
/*     */       //   357: nop
/*     */       //   358: iinc #20, 1
/*     */       //   361: goto -> 292
/*     */       //   364: nop
/*     */       //   365: aload #13
/*     */       //   367: getstatic io/ktor/http/HttpHeaders.INSTANCE : Lio/ktor/http/HttpHeaders;
/*     */       //   370: invokevirtual getContentDisposition : ()Ljava/lang/String;
/*     */       //   373: aload #7
/*     */       //   375: checkcast ai/grazie/client/common/model/Multipart$FilePart
/*     */       //   378: invokevirtual getFileName : ()Ljava/lang/String;
/*     */       //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   386: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   389: nop
/*     */       //   390: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   393: astore #14
/*     */       //   395: aload #16
/*     */       //   397: aload #15
/*     */       //   399: aload #12
/*     */       //   401: invokevirtual build : ()Lio/ktor/http/Headers;
/*     */       //   404: aconst_null
/*     */       //   405: new ai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1$1$3
/*     */       //   408: dup
/*     */       //   409: aload #7
/*     */       //   411: invokespecial <init> : (Lai/grazie/client/common/model/Multipart$PartItem;)V
/*     */       //   414: checkcast kotlin/jvm/functions/Function0
/*     */       //   417: iconst_4
/*     */       //   418: aconst_null
/*     */       //   419: invokestatic appendInput$default : (Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */       //   422: nop
/*     */       //   423: nop
/*     */       //   424: iinc #4, 1
/*     */       //   427: goto -> 23
/*     */       //   430: nop
/*     */       //   431: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #103	-> 6
/*     */       //   #130	-> 16
/*     */       //   #104	-> 43
/*     */       //   #105	-> 47
/*     */       //   #131	-> 78
/*     */       //   #106	-> 103
/*     */       //   #132	-> 118
/*     */       //   #107	-> 147
/*     */       //   #108	-> 190
/*     */       //   #132	-> 191
/*     */       //   #133	-> 198
/*     */       //   #109	-> 199
/*     */       //   #131	-> 211
/*     */       //   #131	-> 213
/*     */       //   #105	-> 216
/*     */       //   #111	-> 222
/*     */       //   #112	-> 230
/*     */       //   #113	-> 231
/*     */       //   #114	-> 238
/*     */       //   #134	-> 246
/*     */       //   #115	-> 269
/*     */       //   #135	-> 284
/*     */       //   #116	-> 313
/*     */       //   #117	-> 356
/*     */       //   #135	-> 357
/*     */       //   #136	-> 364
/*     */       //   #118	-> 365
/*     */       //   #119	-> 389
/*     */       //   #134	-> 399
/*     */       //   #134	-> 401
/*     */       //   #112	-> 404
/*     */       //   #125	-> 422
/*     */       //   #130	-> 423
/*     */       //   #137	-> 430
/*     */       //   #126	-> 431
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   147	44	24	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1$1$1	I
/*     */       //   144	47	23	e	Ljava/lang/String;
/*     */       //   140	52	22	element$iv	Ljava/lang/Object;
/*     */       //   118	81	19	$i$f$forEach	I
/*     */       //   115	84	18	$this$forEach$iv	[Ljava/lang/Object;
/*     */       //   103	97	17	$i$a$-build-GrazieKtorHTTPClient$buildMultipart$1$1$1	I
/*     */       //   100	100	13	$this$invoke_u24lambda_u244_u24lambda_u241	Lio/ktor/http/HeadersBuilder;
/*     */       //   78	138	11	$i$f$build	I
/*     */       //   75	141	10	this_$iv	Lio/ktor/http/Headers$Companion;
/*     */       //   313	44	24	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1$2$1	I
/*     */       //   310	47	23	e	Ljava/lang/String;
/*     */       //   306	52	22	element$iv	Ljava/lang/Object;
/*     */       //   284	81	19	$i$f$forEach	I
/*     */       //   281	84	18	$this$forEach$iv	[Ljava/lang/Object;
/*     */       //   269	121	17	$i$a$-build-GrazieKtorHTTPClient$buildMultipart$1$1$2	I
/*     */       //   266	124	13	$this$invoke_u24lambda_u244_u24lambda_u243	Lio/ktor/http/HeadersBuilder;
/*     */       //   246	158	11	$i$f$build	I
/*     */       //   243	161	10	this_$iv	Lio/ktor/http/Headers$Companion;
/*     */       //   43	380	8	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1	I
/*     */       //   40	383	7	it	Lai/grazie/client/common/model/Multipart$PartItem;
/*     */       //   36	388	6	element$iv	Ljava/lang/Object;
/*     */       //   16	415	3	$i$f$forEach	I
/*     */       //   14	417	2	$this$forEach$iv	[Ljava/lang/Object;
/*     */       //   0	432	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1;
/*     */       //   0	432	1	$this$formData	Lio/ktor/client/request/forms/FormBuilder;
/*     */     }
/*     */     
/*     */     GrazieKtorHTTPClient$buildMultipart$1(Multipart $multipart) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {83}, i = {}, s = {}, n = {}, m = "get", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$get$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$get$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.get(null, null, (Continuation<? super HTTPResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {77}, i = {}, s = {}, n = {}, m = "receiveContinuousSSE", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$receiveContinuousSSE$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$receiveContinuousSSE$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.receiveContinuousSSE(null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {62}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$send$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$send$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.send((String)null, (byte[])null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {70}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$send$3 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$send$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.send((String)null, (Multipart)null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {91}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$send$5 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$send$5(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.send(null, null, (Continuation<? super HTTPResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {130}, i = {}, s = {}, n = {}, m = "toResponse", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$toResponse$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$toResponse$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.toResponse(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */