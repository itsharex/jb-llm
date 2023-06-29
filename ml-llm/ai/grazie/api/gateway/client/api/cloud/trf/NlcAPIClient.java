/*    */ package ai.grazie.api.gateway.client.api.cloud.trf;
/*    */ import ai.grazie.api.gateway.api.cloud.trf.NlcAPI;
/*    */ import ai.grazie.api.gateway.api.metrics.trf.NlcReportData;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\030\0002\b\022\004\022\0020\0020\0012\0020\003B'\b\000\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ3\020\r\032\0020\0162\006\020\017\032\0020\0052\006\020\020\032\0020\0052\006\020\021\032\0020\0222\b\b\002\020\023\032\0020\005H@ø\001\000¢\006\002\020\024J\031\020\025\032\0020\0262\006\020\027\032\0020\002H@ø\001\000¢\006\002\020\030\002\004\n\002\b\031¨\006\031"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient;", "Lai/grazie/api/gateway/client/api/cloud/SuspendReportableService;", "Lai/grazie/api/gateway/api/metrics/trf/NlcReportData;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "complete", "Lai/grazie/nlc/SentenceWithCompletions;", "context", "prefix", "language", "Lai/grazie/nlp/langs/Language;", "profile", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "report", "", "reportData", "(Lai/grazie/api/gateway/api/metrics/trf/NlcReportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nNlcAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NlcAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,24:1\n53#2,6:25\n86#2,2:39\n24#3:31\n24#3:41\n80#4:32\n80#4:42\n1549#5:33\n1620#5,3:34\n37#6,2:37\n*S KotlinDebug\n*F\n+ 1 NlcAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient\n*L\n17#1:25,6\n22#1:39,2\n17#1:31\n22#1:41\n17#1:32\n22#1:42\n18#1:33\n18#1:34,3\n18#1:37,2\n*E\n"})
/*    */ public final class NlcAPIClient extends SuspendableCloudClient implements SuspendReportableService<NlcReportData> {
/*    */   public NlcAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 15 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   } @Nullable
/*    */   public final Object complete(@NotNull String context, @NotNull String prefix, @NotNull Language language, @NotNull String profile, @NotNull Continuation<? super SentenceWithCompletions> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient$complete$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient$complete$1
/*    */     //   13: astore #20
/*    */     //   15: aload #20
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #20
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient$complete$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #20
/*    */     //   53: aload #20
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #19
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #24
/*    */     //   65: aload #20
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 452, 0 -> 92, 1 -> 250
/*    */     //   92: aload #19
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1.INSTANCE : Lai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #7
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V
/*    */     //   117: astore #8
/*    */     //   119: new ai/grazie/client/common/model/RequestOptions
/*    */     //   122: dup
/*    */     //   123: aconst_null
/*    */     //   124: aconst_null
/*    */     //   125: iconst_3
/*    */     //   126: aconst_null
/*    */     //   127: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   130: astore #9
/*    */     //   132: aload_0
/*    */     //   133: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   139: astore #10
/*    */     //   141: iconst_0
/*    */     //   142: istore #11
/*    */     //   144: aload_0
/*    */     //   145: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   148: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   151: aload_0
/*    */     //   152: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   155: aload #7
/*    */     //   157: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   160: aload #8
/*    */     //   162: iconst_0
/*    */     //   163: istore #12
/*    */     //   165: ldc ai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1$Request
/*    */     //   167: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   170: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   173: astore #13
/*    */     //   175: iconst_0
/*    */     //   176: istore #14
/*    */     //   178: aload #13
/*    */     //   180: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   182: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   185: aload #13
/*    */     //   187: nop
/*    */     //   188: iconst_0
/*    */     //   189: istore #12
/*    */     //   191: ldc ai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1$Response
/*    */     //   193: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   196: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   199: astore #13
/*    */     //   201: iconst_0
/*    */     //   202: istore #14
/*    */     //   204: aload #13
/*    */     //   206: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   208: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   211: aload #13
/*    */     //   213: nop
/*    */     //   214: aload #9
/*    */     //   216: aload #10
/*    */     //   218: aload #20
/*    */     //   220: aload #20
/*    */     //   222: aload_1
/*    */     //   223: putfield L$0 : Ljava/lang/Object;
/*    */     //   226: aload #20
/*    */     //   228: aload_2
/*    */     //   229: putfield L$1 : Ljava/lang/Object;
/*    */     //   232: aload #20
/*    */     //   234: iconst_1
/*    */     //   235: putfield label : I
/*    */     //   238: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   241: dup
/*    */     //   242: aload #24
/*    */     //   244: if_acmpne -> 278
/*    */     //   247: aload #24
/*    */     //   249: areturn
/*    */     //   250: iconst_0
/*    */     //   251: istore #11
/*    */     //   253: aload #20
/*    */     //   255: getfield L$1 : Ljava/lang/Object;
/*    */     //   258: checkcast java/lang/String
/*    */     //   261: astore_2
/*    */     //   262: aload #20
/*    */     //   264: getfield L$0 : Ljava/lang/Object;
/*    */     //   267: checkcast java/lang/String
/*    */     //   270: astore_1
/*    */     //   271: aload #19
/*    */     //   273: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   276: aload #19
/*    */     //   278: nop
/*    */     //   279: checkcast ai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1$Response
/*    */     //   282: astore #6
/*    */     //   284: aload_1
/*    */     //   285: aload_2
/*    */     //   286: aload #6
/*    */     //   288: invokevirtual getCompletions : ()Ljava/util/List;
/*    */     //   291: checkcast java/lang/Iterable
/*    */     //   294: astore #7
/*    */     //   296: astore #17
/*    */     //   298: astore #16
/*    */     //   300: iconst_0
/*    */     //   301: istore #8
/*    */     //   303: aload #7
/*    */     //   305: astore #9
/*    */     //   307: new java/util/ArrayList
/*    */     //   310: dup
/*    */     //   311: aload #7
/*    */     //   313: bipush #10
/*    */     //   315: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   318: invokespecial <init> : (I)V
/*    */     //   321: checkcast java/util/Collection
/*    */     //   324: astore #10
/*    */     //   326: iconst_0
/*    */     //   327: istore #11
/*    */     //   329: aload #9
/*    */     //   331: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   336: astore #12
/*    */     //   338: aload #12
/*    */     //   340: invokeinterface hasNext : ()Z
/*    */     //   345: ifeq -> 392
/*    */     //   348: aload #12
/*    */     //   350: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   355: astore #13
/*    */     //   357: aload #10
/*    */     //   359: aload #13
/*    */     //   361: checkcast java/lang/String
/*    */     //   364: astore #14
/*    */     //   366: astore #18
/*    */     //   368: iconst_0
/*    */     //   369: istore #15
/*    */     //   371: new ai/grazie/nlc/SentenceWithCompletions$Completion
/*    */     //   374: dup
/*    */     //   375: aload #14
/*    */     //   377: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   380: aload #18
/*    */     //   382: swap
/*    */     //   383: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   388: pop
/*    */     //   389: goto -> 338
/*    */     //   392: aload #10
/*    */     //   394: checkcast java/util/List
/*    */     //   397: nop
/*    */     //   398: astore #18
/*    */     //   400: aload #16
/*    */     //   402: aload #17
/*    */     //   404: aload #18
/*    */     //   406: checkcast java/util/Collection
/*    */     //   409: astore #7
/*    */     //   411: iconst_0
/*    */     //   412: istore #8
/*    */     //   414: aload #7
/*    */     //   416: astore #9
/*    */     //   418: aload #9
/*    */     //   420: iconst_0
/*    */     //   421: anewarray ai/grazie/nlc/SentenceWithCompletions$Completion
/*    */     //   424: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   429: checkcast [Lai/grazie/nlc/SentenceWithCompletions$Completion;
/*    */     //   432: astore #21
/*    */     //   434: astore #22
/*    */     //   436: astore #23
/*    */     //   438: new ai/grazie/nlc/SentenceWithCompletions
/*    */     //   441: dup
/*    */     //   442: aload #23
/*    */     //   444: aload #22
/*    */     //   446: aload #21
/*    */     //   448: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;[Lai/grazie/nlc/SentenceWithCompletions$Completion;)V
/*    */     //   451: areturn
/*    */     //   452: new java/lang/IllegalStateException
/*    */     //   455: dup
/*    */     //   456: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   458: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   461: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 63
/*    */     //   #17	-> 97
/*    */     //   #25	-> 119
/*    */     //   #28	-> 119
/*    */     //   #25	-> 132
/*    */     //   #29	-> 132
/*    */     //   #25	-> 141
/*    */     //   #30	-> 144
/*    */     //   #31	-> 170
/*    */     //   #32	-> 178
/*    */     //   #31	-> 187
/*    */     //   #30	-> 188
/*    */     //   #31	-> 196
/*    */     //   #32	-> 204
/*    */     //   #31	-> 213
/*    */     //   #30	-> 214
/*    */     //   #16	-> 247
/*    */     //   #30	-> 278
/*    */     //   #17	-> 279
/*    */     //   #18	-> 284
/*    */     //   #33	-> 303
/*    */     //   #34	-> 329
/*    */     //   #35	-> 357
/*    */     //   #18	-> 371
/*    */     //   #35	-> 383
/*    */     //   #36	-> 392
/*    */     //   #33	-> 397
/*    */     //   #18	-> 411
/*    */     //   #37	-> 414
/*    */     //   #38	-> 418
/*    */     //   #18	-> 432
/*    */     //   #16	-> 452
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	68	0	this	Lai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient;
/*    */     //   97	153	1	context	Ljava/lang/String;
/*    */     //   271	8	1	context	Ljava/lang/String;
/*    */     //   279	21	1	context	Ljava/lang/String;
/*    */     //   97	153	2	prefix	Ljava/lang/String;
/*    */     //   262	17	2	prefix	Ljava/lang/String;
/*    */     //   279	21	2	prefix	Ljava/lang/String;
/*    */     //   97	22	3	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	22	4	profile	Ljava/lang/String;
/*    */     //   284	16	6	completions	Lai/grazie/api/gateway/api/cloud/trf/NlcAPI$Complete$V1$Response;
/*    */     //   119	46	7	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   300	26	7	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   411	18	7	$this$toTypedArray$iv	Ljava/util/Collection;
/*    */     //   119	46	8	content$iv	Ljava/lang/Object;
/*    */     //   132	109	9	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   326	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   418	11	9	thisCollection$iv	Ljava/util/Collection;
/*    */     //   141	100	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   326	68	10	destination$iv$iv	Ljava/util/Collection;
/*    */     //   175	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   201	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   357	32	13	item$iv$iv	Ljava/lang/Object;
/*    */     //   368	12	14	it	Ljava/lang/String;
/*    */     //   178	9	14	$i$f$cast	I
/*    */     //   165	23	12	$i$f$serializer	I
/*    */     //   204	9	14	$i$f$cast	I
/*    */     //   191	23	12	$i$f$serializer	I
/*    */     //   144	106	11	$i$f$sendAndGet	I
/*    */     //   371	9	15	$i$a$-map-NlcAPIClient$complete$2	I
/*    */     //   329	65	11	$i$f$mapTo	I
/*    */     //   303	95	8	$i$f$map	I
/*    */     //   414	15	8	$i$f$toTypedArray	I
/*    */     //   53	399	20	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	392	19	$result	Ljava/lang/Object;
/*    */     //   253	26	11	$i$f$sendAndGet	I
/*    */   }
/*    */   @Nullable
/*    */   public Object report(@NotNull NlcReportData reportData, @NotNull Continuation $completion) {
/* 22 */     API aPI = (API)NlcAPI.Complete.Report.INSTANCE; Object content$iv = new NlcAPI.Complete.Report.Request(url((API)NlcAPI.Complete.V1.INSTANCE), reportData);
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
/* 39 */     RequestOptions options$iv = new RequestOptions(null, null, 3, null); JSON json$iv = getJson(); int $i$f$sendAndWait = 0;
/* 40 */     int $i$f$serializer = 0;
/* 41 */     KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(NlcAPI.Complete.Report.Request.class)); int $i$f$cast = 0;
/* 42 */     Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); if (SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion);  SuspendableClientExtensionsKt.sendAndWait(getHttpClient(), url(aPI), content$iv, $this$cast$iv$iv$iv, options$iv, json$iv, $completion);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NlcAPIClient.kt", l = {30}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"context", "prefix"}, m = "complete", c = "ai.grazie.api.gateway.client.api.cloud.trf.NlcAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NlcAPIClient$complete$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     NlcAPIClient$complete$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NlcAPIClient.this.complete((String)null, (String)null, (Language)null, (String)null, (Continuation<? super SentenceWithCompletions>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */