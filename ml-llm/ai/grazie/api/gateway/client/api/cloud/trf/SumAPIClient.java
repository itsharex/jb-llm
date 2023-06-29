/*    */ package ai.grazie.api.gateway.client.api.cloud.trf;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\030\0002\0020\0012\0020\002B'\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013JC\020\f\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0040\r2\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\0232\b\020\024\032\004\030\0010\023H@ø\001\000¢\006\002\020\025JC\020\026\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0040\r2\b\020\020\032\004\030\0010\0212\b\020\022\032\004\030\0010\0232\b\020\024\032\004\030\0010\023H@ø\001\000¢\006\002\020\025\002\004\n\002\b\031¨\006\027"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;", "Lai/grazie/sum/SuspendableSummarizationService;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "summarize", "", "Lai/grazie/sum/SentenceWithSummaries;", "texts", "format", "Lai/grazie/sum/Format;", "minimumBPE", "", "maximumBPE", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "summarizeWithCache", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nSumAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n53#2,6:27\n53#2,6:36\n24#3:33\n24#3:42\n80#4:34\n80#4:43\n1#5:35\n*S KotlinDebug\n*F\n+ 1 SumAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient\n*L\n14#1:27,6\n22#1:36,6\n14#1:33\n22#1:42\n14#1:34\n22#1:43\n*E\n"})
/*    */ public final class SumAPIClient extends SuspendableCloudClient implements SuspendableSummarizationService {
/*    */   public SumAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 11 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object summarize(@NotNull List texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE, @NotNull Continuation<? super List<SentenceWithSummaries>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarize$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarize$1
/*    */     //   13: astore #16
/*    */     //   15: aload #16
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #16
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarize$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #16
/*    */     //   53: aload #16
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #15
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #17
/*    */     //   65: aload #16
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 260, 0 -> 92, 1 -> 238
/*    */     //   92: aload #15
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1.INSTANCE : Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #7
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: invokespecial <init> : (Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)V
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
/*    */     //   165: ldc ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1$Request
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
/*    */     //   191: ldc ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1$Response
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
/*    */     //   218: aload #16
/*    */     //   220: aload #16
/*    */     //   222: iconst_1
/*    */     //   223: putfield label : I
/*    */     //   226: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   229: dup
/*    */     //   230: aload #17
/*    */     //   232: if_acmpne -> 248
/*    */     //   235: aload #17
/*    */     //   237: areturn
/*    */     //   238: iconst_0
/*    */     //   239: istore #11
/*    */     //   241: aload #15
/*    */     //   243: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   246: aload #15
/*    */     //   248: nop
/*    */     //   249: checkcast ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1$Response
/*    */     //   252: astore #6
/*    */     //   254: aload #6
/*    */     //   256: invokevirtual getSummaries : ()Ljava/util/List;
/*    */     //   259: areturn
/*    */     //   260: new java/lang/IllegalStateException
/*    */     //   263: dup
/*    */     //   264: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   266: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   269: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 63
/*    */     //   #14	-> 97
/*    */     //   #27	-> 119
/*    */     //   #30	-> 119
/*    */     //   #27	-> 132
/*    */     //   #31	-> 132
/*    */     //   #27	-> 141
/*    */     //   #32	-> 144
/*    */     //   #33	-> 170
/*    */     //   #34	-> 178
/*    */     //   #33	-> 187
/*    */     //   #32	-> 188
/*    */     //   #33	-> 196
/*    */     //   #34	-> 204
/*    */     //   #33	-> 213
/*    */     //   #32	-> 214
/*    */     //   #13	-> 235
/*    */     //   #32	-> 248
/*    */     //   #14	-> 249
/*    */     //   #15	-> 254
/*    */     //   #13	-> 260
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	68	0	this	Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;
/*    */     //   97	22	1	texts	Ljava/util/List;
/*    */     //   97	22	2	format	Lai/grazie/sum/Format;
/*    */     //   97	22	3	minimumBPE	Ljava/lang/Integer;
/*    */     //   97	22	4	maximumBPE	Ljava/lang/Integer;
/*    */     //   254	6	6	response	Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$V1$Response;
/*    */     //   119	46	7	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   119	46	8	content$iv	Ljava/lang/Object;
/*    */     //   132	97	9	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   141	88	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   175	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   201	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   178	9	14	$i$f$cast	I
/*    */     //   165	23	12	$i$f$serializer	I
/*    */     //   204	9	14	$i$f$cast	I
/*    */     //   191	23	12	$i$f$serializer	I
/*    */     //   144	94	11	$i$f$sendAndGet	I
/*    */     //   53	207	16	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	200	15	$result	Ljava/lang/Object;
/*    */     //   241	8	11	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object summarizeWithCache(@NotNull List texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE, @NotNull Continuation<? super List<SentenceWithSummaries>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarizeWithCache$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarizeWithCache$1
/*    */     //   13: astore #16
/*    */     //   15: aload #16
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #16
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarizeWithCache$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #16
/*    */     //   53: aload #16
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #15
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #17
/*    */     //   65: aload #16
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 298, 0 -> 92, 1 -> 276
/*    */     //   92: aload #15
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: invokevirtual getAuthType : ()Lai/grazie/model/cloud/AuthType;
/*    */     //   101: getstatic ai/grazie/model/cloud/AuthType.Service : Lai/grazie/model/cloud/AuthType;
/*    */     //   104: if_acmpne -> 111
/*    */     //   107: iconst_1
/*    */     //   108: goto -> 112
/*    */     //   111: iconst_0
/*    */     //   112: ifne -> 135
/*    */     //   115: iconst_0
/*    */     //   116: istore #7
/*    */     //   118: ldc 'Summarization with cache accessible only for service authorization type'
/*    */     //   120: astore #7
/*    */     //   122: new java/lang/IllegalArgumentException
/*    */     //   125: dup
/*    */     //   126: aload #7
/*    */     //   128: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   131: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   134: athrow
/*    */     //   135: getstatic ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1.INSTANCE : Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1;
/*    */     //   138: checkcast ai/grazie/model/cloud/API
/*    */     //   141: astore #7
/*    */     //   143: new ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request
/*    */     //   146: dup
/*    */     //   147: aload_1
/*    */     //   148: aload_2
/*    */     //   149: aload_3
/*    */     //   150: aload #4
/*    */     //   152: invokespecial <init> : (Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)V
/*    */     //   155: astore #8
/*    */     //   157: new ai/grazie/client/common/model/RequestOptions
/*    */     //   160: dup
/*    */     //   161: aconst_null
/*    */     //   162: aconst_null
/*    */     //   163: iconst_3
/*    */     //   164: aconst_null
/*    */     //   165: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   168: astore #9
/*    */     //   170: aload_0
/*    */     //   171: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   174: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   177: astore #10
/*    */     //   179: iconst_0
/*    */     //   180: istore #11
/*    */     //   182: aload_0
/*    */     //   183: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   186: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   189: aload_0
/*    */     //   190: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   193: aload #7
/*    */     //   195: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   198: aload #8
/*    */     //   200: iconst_0
/*    */     //   201: istore #12
/*    */     //   203: ldc ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request
/*    */     //   205: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   208: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   211: astore #13
/*    */     //   213: iconst_0
/*    */     //   214: istore #14
/*    */     //   216: aload #13
/*    */     //   218: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   220: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   223: aload #13
/*    */     //   225: nop
/*    */     //   226: iconst_0
/*    */     //   227: istore #12
/*    */     //   229: ldc ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response
/*    */     //   231: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   234: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   237: astore #13
/*    */     //   239: iconst_0
/*    */     //   240: istore #14
/*    */     //   242: aload #13
/*    */     //   244: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   246: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   249: aload #13
/*    */     //   251: nop
/*    */     //   252: aload #9
/*    */     //   254: aload #10
/*    */     //   256: aload #16
/*    */     //   258: aload #16
/*    */     //   260: iconst_1
/*    */     //   261: putfield label : I
/*    */     //   264: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   267: dup
/*    */     //   268: aload #17
/*    */     //   270: if_acmpne -> 286
/*    */     //   273: aload #17
/*    */     //   275: areturn
/*    */     //   276: iconst_0
/*    */     //   277: istore #11
/*    */     //   279: aload #15
/*    */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   284: aload #15
/*    */     //   286: nop
/*    */     //   287: checkcast ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response
/*    */     //   290: astore #6
/*    */     //   292: aload #6
/*    */     //   294: invokevirtual getSummaries : ()Ljava/util/List;
/*    */     //   297: areturn
/*    */     //   298: new java/lang/IllegalStateException
/*    */     //   301: dup
/*    */     //   302: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   304: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   307: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 63
/*    */     //   #19	-> 97
/*    */     //   #35	-> 115
/*    */     //   #19	-> 118
/*    */     //   #19	-> 120
/*    */     //   #22	-> 135
/*    */     //   #36	-> 157
/*    */     //   #39	-> 157
/*    */     //   #36	-> 170
/*    */     //   #40	-> 170
/*    */     //   #36	-> 179
/*    */     //   #41	-> 182
/*    */     //   #42	-> 208
/*    */     //   #43	-> 216
/*    */     //   #42	-> 225
/*    */     //   #41	-> 226
/*    */     //   #42	-> 234
/*    */     //   #43	-> 242
/*    */     //   #42	-> 251
/*    */     //   #41	-> 252
/*    */     //   #18	-> 273
/*    */     //   #41	-> 286
/*    */     //   #22	-> 287
/*    */     //   #21	-> 290
/*    */     //   #23	-> 292
/*    */     //   #18	-> 298
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	18	0	this	Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;
/*    */     //   135	68	0	this	Lai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient;
/*    */     //   97	18	1	texts	Ljava/util/List;
/*    */     //   135	22	1	texts	Ljava/util/List;
/*    */     //   97	18	2	format	Lai/grazie/sum/Format;
/*    */     //   135	22	2	format	Lai/grazie/sum/Format;
/*    */     //   97	18	3	minimumBPE	Ljava/lang/Integer;
/*    */     //   135	22	3	minimumBPE	Ljava/lang/Integer;
/*    */     //   97	18	4	maximumBPE	Ljava/lang/Integer;
/*    */     //   135	22	4	maximumBPE	Ljava/lang/Integer;
/*    */     //   292	6	6	response	Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response;
/*    */     //   157	46	7	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   157	46	8	content$iv	Ljava/lang/Object;
/*    */     //   170	97	9	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   179	88	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   213	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   239	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   118	2	7	$i$a$-require-SumAPIClient$summarizeWithCache$2	I
/*    */     //   216	9	14	$i$f$cast	I
/*    */     //   203	23	12	$i$f$serializer	I
/*    */     //   242	9	14	$i$f$cast	I
/*    */     //   229	23	12	$i$f$serializer	I
/*    */     //   182	94	11	$i$f$sendAndGet	I
/*    */     //   53	245	16	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	238	15	$result	Ljava/lang/Object;
/*    */     //   279	8	11	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SumAPIClient.kt", l = {32}, i = {}, s = {}, n = {}, m = "summarize", c = "ai.grazie.api.gateway.client.api.cloud.trf.SumAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SumAPIClient$summarize$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     SumAPIClient$summarize$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SumAPIClient.this.summarize(null, null, null, null, (Continuation<? super List<SentenceWithSummaries>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SumAPIClient.kt", l = {33}, i = {}, s = {}, n = {}, m = "summarizeWithCache", c = "ai.grazie.api.gateway.client.api.cloud.trf.SumAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SumAPIClient$summarizeWithCache$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     SumAPIClient$summarizeWithCache$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SumAPIClient.this.summarizeWithCache(null, null, null, null, (Continuation<? super List<SentenceWithSummaries>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */