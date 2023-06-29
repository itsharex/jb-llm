/*    */ package ai.grazie.api.gateway.client.api.cloud.trf;
/*    */ import ai.grazie.api.gateway.api.cloud.trf.SynAPI;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\0012\0020\003B'\b\000\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\031\020\r\032\0020\0162\006\020\017\032\0020\002H@ø\001\000¢\006\002\020\020J/\020\021\032\b\022\004\022\0020\0050\0222\006\020\023\032\0020\0052\006\020\024\032\0020\0252\006\020\026\032\0020\027H@ø\001\000¢\006\002\020\030\002\004\n\002\b\031¨\006\031"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient;", "Lai/grazie/api/gateway/client/api/cloud/SuspendReportableService;", "Lai/grazie/api/gateway/api/metrics/trf/SynReportData;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "report", "", "reportData", "(Lai/grazie/api/gateway/api/metrics/trf/SynReportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "synonymize", "", "text", "range", "Lai/grazie/text/TextRange;", "language", "Lai/grazie/nlp/langs/Language;", "(Ljava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nSynAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,24:1\n53#2,6:25\n86#2,2:33\n24#3:31\n24#3:35\n80#4:32\n80#4:36\n*S KotlinDebug\n*F\n+ 1 SynAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient\n*L\n16#1:25,6\n21#1:33,2\n16#1:31\n21#1:35\n16#1:32\n21#1:36\n*E\n"})
/*    */ public final class SynAPIClient extends SuspendableCloudClient implements SuspendReportableService<SynReportData> {
/*    */   public SynAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 14 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   } @Nullable
/*    */   public final Object synonymize(@NotNull String text, @NotNull TextRange range, @NotNull Language language, @NotNull Continuation<? super List<String>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient$synonymize$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient$synonymize$1
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
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient$synonymize$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2.INSTANCE : Lai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2$Request
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
/*    */     //   163: ldc ai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2$Request
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
/*    */     //   189: ldc ai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2$Response
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
/*    */     //   247: checkcast ai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2$Response
/*    */     //   250: astore #5
/*    */     //   252: aload #5
/*    */     //   254: invokevirtual getSynonyms : ()Ljava/util/List;
/*    */     //   257: areturn
/*    */     //   258: new java/lang/IllegalStateException
/*    */     //   261: dup
/*    */     //   262: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   264: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   267: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 63
/*    */     //   #16	-> 97
/*    */     //   #25	-> 117
/*    */     //   #28	-> 117
/*    */     //   #25	-> 130
/*    */     //   #29	-> 130
/*    */     //   #25	-> 139
/*    */     //   #30	-> 142
/*    */     //   #31	-> 168
/*    */     //   #32	-> 176
/*    */     //   #31	-> 185
/*    */     //   #30	-> 186
/*    */     //   #31	-> 194
/*    */     //   #32	-> 202
/*    */     //   #31	-> 211
/*    */     //   #30	-> 212
/*    */     //   #15	-> 233
/*    */     //   #30	-> 246
/*    */     //   #16	-> 247
/*    */     //   #17	-> 252
/*    */     //   #15	-> 258
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	66	0	this	Lai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient;
/*    */     //   97	20	1	text	Ljava/lang/String;
/*    */     //   97	20	2	range	Lai/grazie/text/TextRange;
/*    */     //   97	20	3	language	Lai/grazie/nlp/langs/Language;
/*    */     //   252	6	5	synonyms	Lai/grazie/api/gateway/api/cloud/trf/SynAPI$Synonymize$V2$Response;
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
/*    */   public Object report(@NotNull SynReportData reportData, @NotNull Continuation $completion) {
/* 21 */     API aPI = (API)SynAPI.Synonymize.Report.INSTANCE; Object content$iv = new SynAPI.Synonymize.Report.Request(url((API)SynAPI.Synonymize.V2.INSTANCE), reportData);
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
/* 33 */     RequestOptions options$iv = new RequestOptions(null, null, 3, null); JSON json$iv = getJson(); int $i$f$sendAndWait = 0;
/* 34 */     int $i$f$serializer = 0;
/* 35 */     KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(SynAPI.Synonymize.Report.Request.class)); int $i$f$cast = 0;
/* 36 */     Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); if (SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion);  SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SynAPIClient.kt", l = {30}, i = {}, s = {}, n = {}, m = "synonymize", c = "ai.grazie.api.gateway.client.api.cloud.trf.SynAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SynAPIClient$synonymize$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     SynAPIClient$synonymize$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SynAPIClient.this.synonymize((String)null, (TextRange)null, (Language)null, (Continuation<? super List<String>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */