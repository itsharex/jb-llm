/*    */ package ai.grazie.api.gateway.client.api.cloud.meta;
/*    */ import ai.grazie.api.gateway.api.cloud.meta.DefAPI;
/*    */ import ai.grazie.api.gateway.api.metrics.meta.DefReportData;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\030\0002\b\022\004\022\0020\0020\0012\0020\0032\0020\004B'\b\000\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJ+\020\016\032\004\030\0010\0172\006\020\020\032\0020\0062\006\020\021\032\0020\0222\006\020\023\032\0020\024H@ø\001\000¢\006\002\020\025J\031\020\026\032\0020\0272\006\020\030\032\0020\002H@ø\001\000¢\006\002\020\031\002\004\n\002\b\031¨\006\032"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient;", "Lai/grazie/api/gateway/client/api/cloud/SuspendReportableService;", "Lai/grazie/api/gateway/api/metrics/meta/DefReportData;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/def/SuspendableMultiDefinitionService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "define", "Lai/grazie/def/WordDefinition;", "text", "interval", "Lai/grazie/text/TextRange;", "language", "Lai/grazie/nlp/langs/Language;", "(Ljava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "report", "", "reportData", "(Lai/grazie/api/gateway/api/metrics/meta/DefReportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nDefAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,25:1\n53#2,6:26\n86#2,2:34\n24#3:32\n24#3:36\n80#4:33\n80#4:37\n*S KotlinDebug\n*F\n+ 1 DefAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient\n*L\n18#1:26,6\n23#1:34,2\n18#1:32\n23#1:36\n18#1:33\n23#1:37\n*E\n"})
/*    */ public final class DefAPIClient extends SuspendableCloudClient implements SuspendReportableService<DefReportData>, SuspendableMultiDefinitionService {
/*    */   public DefAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 16 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   } @Nullable
/*    */   public Object define(@NotNull String text, @NotNull TextRange interval, @NotNull Language language, @NotNull Continuation<? super WordDefinition> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient$define$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient$define$1
/*    */     //   13: astore #15
/*    */     //   15: aload #15
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #15
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient$define$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #15
/*    */     //   53: aload #15
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #14
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #16
/*    */     //   65: aload #15
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 258, 0 -> 92, 1 -> 236
/*    */     //   92: aload #14
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2.INSTANCE : Lai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;)V
/*    */     //   115: astore #7
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #8
/*    */     //   130: aload_0
/*    */     //   131: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   134: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   137: astore #9
/*    */     //   139: iconst_0
/*    */     //   140: istore #10
/*    */     //   142: aload_0
/*    */     //   143: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   146: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   149: aload_0
/*    */     //   150: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   153: aload #6
/*    */     //   155: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   158: aload #7
/*    */     //   160: iconst_0
/*    */     //   161: istore #11
/*    */     //   163: ldc ai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2$Request
/*    */     //   165: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   168: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   171: astore #12
/*    */     //   173: iconst_0
/*    */     //   174: istore #13
/*    */     //   176: aload #12
/*    */     //   178: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   180: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   183: aload #12
/*    */     //   185: nop
/*    */     //   186: iconst_0
/*    */     //   187: istore #11
/*    */     //   189: ldc ai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2$Response
/*    */     //   191: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   194: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   197: astore #12
/*    */     //   199: iconst_0
/*    */     //   200: istore #13
/*    */     //   202: aload #12
/*    */     //   204: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   206: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   209: aload #12
/*    */     //   211: nop
/*    */     //   212: aload #8
/*    */     //   214: aload #9
/*    */     //   216: aload #15
/*    */     //   218: aload #15
/*    */     //   220: iconst_1
/*    */     //   221: putfield label : I
/*    */     //   224: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   227: dup
/*    */     //   228: aload #16
/*    */     //   230: if_acmpne -> 246
/*    */     //   233: aload #16
/*    */     //   235: areturn
/*    */     //   236: iconst_0
/*    */     //   237: istore #10
/*    */     //   239: aload #14
/*    */     //   241: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   244: aload #14
/*    */     //   246: nop
/*    */     //   247: checkcast ai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2$Response
/*    */     //   250: astore #5
/*    */     //   252: aload #5
/*    */     //   254: invokevirtual getDescriptor : ()Lai/grazie/def/WordDefinition;
/*    */     //   257: areturn
/*    */     //   258: new java/lang/IllegalStateException
/*    */     //   261: dup
/*    */     //   262: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   264: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   267: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 63
/*    */     //   #18	-> 97
/*    */     //   #26	-> 117
/*    */     //   #29	-> 117
/*    */     //   #26	-> 130
/*    */     //   #30	-> 130
/*    */     //   #26	-> 139
/*    */     //   #31	-> 142
/*    */     //   #32	-> 168
/*    */     //   #33	-> 176
/*    */     //   #32	-> 185
/*    */     //   #31	-> 186
/*    */     //   #32	-> 194
/*    */     //   #33	-> 202
/*    */     //   #32	-> 211
/*    */     //   #31	-> 212
/*    */     //   #17	-> 233
/*    */     //   #31	-> 246
/*    */     //   #18	-> 247
/*    */     //   #19	-> 252
/*    */     //   #17	-> 258
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	66	0	this	Lai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient;
/*    */     //   97	20	1	text	Ljava/lang/String;
/*    */     //   97	20	2	interval	Lai/grazie/text/TextRange;
/*    */     //   97	20	3	language	Lai/grazie/nlp/langs/Language;
/*    */     //   252	6	5	result	Lai/grazie/api/gateway/api/cloud/meta/DefAPI$Define$V2$Response;
/*    */     //   117	46	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   117	46	7	content$iv	Ljava/lang/Object;
/*    */     //   130	97	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   139	88	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   173	12	12	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   199	12	12	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   176	9	13	$i$f$cast	I
/*    */     //   163	23	11	$i$f$serializer	I
/*    */     //   202	9	13	$i$f$cast	I
/*    */     //   189	23	11	$i$f$serializer	I
/*    */     //   142	94	10	$i$f$sendAndGet	I
/*    */     //   53	205	15	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	198	14	$result	Ljava/lang/Object;
/*    */     //   239	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   @Nullable
/*    */   public Object report(@NotNull DefReportData reportData, @NotNull Continuation $completion) {
/* 23 */     API aPI = (API)DefAPI.Define.Report.INSTANCE; Object content$iv = new DefAPI.Define.Report.Request(url((API)DefAPI.Define.V2.INSTANCE), reportData);
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
/* 34 */     RequestOptions options$iv = new RequestOptions(null, null, 3, null); JSON json$iv = getJson(); int $i$f$sendAndWait = 0;
/* 35 */     int $i$f$serializer = 0;
/* 36 */     KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(DefAPI.Define.Report.Request.class)); int $i$f$cast = 0;
/* 37 */     Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); if (SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion);  SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DefAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "define", c = "ai.grazie.api.gateway.client.api.cloud.meta.DefAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class DefAPIClient$define$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     DefAPIClient$define$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DefAPIClient.this.define((String)null, (TextRange)null, (Language)null, (Continuation<? super WordDefinition>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/meta/DefAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */