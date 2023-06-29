/*    */ package ai.grazie.api.gateway.client.api.cloud.meta;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002B3\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\004\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ-\020\017\032\b\022\004\022\0020\0210\0202\006\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\0040\020H@ø\001\000¢\006\002\020\025R\023\020\007\032\004\030\0010\004¢\006\b\n\000\032\004\b\r\020\016\002\004\n\002\b\031¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/ner/suspendable/SuspendableMultiNERAnnotationService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "version", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "getVersion", "()Ljava/lang/String;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nNerAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NerAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 4 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,24:1\n1#2:25\n53#3,6:26\n24#4:32\n80#5:33\n*S KotlinDebug\n*F\n+ 1 NerAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient\n*L\n17#1:26,6\n17#1:32\n17#1:33\n*E\n"})
/*    */ public final class NerAPIClient extends SuspendableCloudClient implements SuspendableMultiNERAnnotationService {
/*    */   @Nullable
/* 13 */   public final String getVersion() { return this.version; } @Nullable
/*    */   private final String version; public NerAPIClient(@NotNull String server, @NotNull AuthType authType, @Nullable String version, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 15 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.version = version;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object annotate(@NotNull Language language, @NotNull List sentences, @NotNull Continuation<? super List<SentenceWithNERAnnotations>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient$annotate$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient$annotate$1
/*    */     //   11: astore #14
/*    */     //   13: aload #14
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #14
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient$annotate$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #14
/*    */     //   50: aload #14
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #13
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #15
/*    */     //   62: aload #14
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 286, 0 -> 88, 1 -> 264
/*    */     //   88: aload #13
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1.INSTANCE : Lai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: aload_0
/*    */     //   102: getfield version : Ljava/lang/String;
/*    */     //   105: dup
/*    */     //   106: ifnull -> 129
/*    */     //   109: astore #9
/*    */     //   111: iconst_0
/*    */     //   112: istore #10
/*    */     //   114: new ai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1$Request
/*    */     //   117: dup
/*    */     //   118: aload_1
/*    */     //   119: aload_2
/*    */     //   120: aload #9
/*    */     //   122: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;)V
/*    */     //   125: nop
/*    */     //   126: goto -> 142
/*    */     //   129: pop
/*    */     //   130: new ai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1$Request
/*    */     //   133: dup
/*    */     //   134: aload_1
/*    */     //   135: aload_2
/*    */     //   136: aconst_null
/*    */     //   137: iconst_4
/*    */     //   138: aconst_null
/*    */     //   139: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   142: astore #6
/*    */     //   144: nop
/*    */     //   145: new ai/grazie/client/common/model/RequestOptions
/*    */     //   148: dup
/*    */     //   149: aconst_null
/*    */     //   150: aconst_null
/*    */     //   151: iconst_3
/*    */     //   152: aconst_null
/*    */     //   153: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   156: astore #7
/*    */     //   158: aload_0
/*    */     //   159: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   162: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   165: astore #8
/*    */     //   167: iconst_0
/*    */     //   168: istore #9
/*    */     //   170: aload_0
/*    */     //   171: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   174: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   177: aload_0
/*    */     //   178: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   181: aload #5
/*    */     //   183: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   186: aload #6
/*    */     //   188: iconst_0
/*    */     //   189: istore #10
/*    */     //   191: ldc ai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1$Request
/*    */     //   193: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   196: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   199: astore #11
/*    */     //   201: iconst_0
/*    */     //   202: istore #12
/*    */     //   204: aload #11
/*    */     //   206: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   208: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   211: aload #11
/*    */     //   213: nop
/*    */     //   214: iconst_0
/*    */     //   215: istore #10
/*    */     //   217: ldc ai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1$Response
/*    */     //   219: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   222: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   225: astore #11
/*    */     //   227: iconst_0
/*    */     //   228: istore #12
/*    */     //   230: aload #11
/*    */     //   232: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   237: aload #11
/*    */     //   239: nop
/*    */     //   240: aload #7
/*    */     //   242: aload #8
/*    */     //   244: aload #14
/*    */     //   246: aload #14
/*    */     //   248: iconst_1
/*    */     //   249: putfield label : I
/*    */     //   252: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   255: dup
/*    */     //   256: aload #15
/*    */     //   258: if_acmpne -> 274
/*    */     //   261: aload #15
/*    */     //   263: areturn
/*    */     //   264: iconst_0
/*    */     //   265: istore #9
/*    */     //   267: aload #13
/*    */     //   269: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   272: aload #13
/*    */     //   274: nop
/*    */     //   275: checkcast ai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1$Response
/*    */     //   278: astore #4
/*    */     //   280: aload #4
/*    */     //   282: invokevirtual getAnnotations : ()Ljava/util/List;
/*    */     //   285: areturn
/*    */     //   286: new java/lang/IllegalStateException
/*    */     //   289: dup
/*    */     //   290: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   292: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   295: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #18	-> 93
/*    */     //   #25	-> 111
/*    */     //   #18	-> 114
/*    */     //   #18	-> 125
/*    */     //   #18	-> 126
/*    */     //   #19	-> 130
/*    */     //   #17	-> 144
/*    */     //   #26	-> 145
/*    */     //   #29	-> 145
/*    */     //   #26	-> 158
/*    */     //   #30	-> 158
/*    */     //   #26	-> 167
/*    */     //   #31	-> 170
/*    */     //   #32	-> 196
/*    */     //   #33	-> 204
/*    */     //   #32	-> 213
/*    */     //   #31	-> 214
/*    */     //   #32	-> 222
/*    */     //   #33	-> 230
/*    */     //   #32	-> 239
/*    */     //   #31	-> 240
/*    */     //   #16	-> 261
/*    */     //   #31	-> 274
/*    */     //   #17	-> 275
/*    */     //   #21	-> 280
/*    */     //   #16	-> 286
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	32	0	this	Lai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient;
/*    */     //   125	1	0	this	Lai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient;
/*    */     //   126	65	0	this	Lai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient;
/*    */     //   93	32	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   125	1	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   126	3	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   129	13	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   93	32	2	sentences	Ljava/util/List;
/*    */     //   125	1	2	sentences	Ljava/util/List;
/*    */     //   126	3	2	sentences	Ljava/util/List;
/*    */     //   129	13	2	sentences	Ljava/util/List;
/*    */     //   280	6	4	result	Lai/grazie/api/gateway/api/cloud/meta/NerAPI$Annotate$V1$Response;
/*    */     //   126	65	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   144	47	6	content$iv	Ljava/lang/Object;
/*    */     //   158	97	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   167	88	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   111	14	9	it	Ljava/lang/String;
/*    */     //   201	12	11	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   227	12	11	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   114	11	10	$i$a$-let-NerAPIClient$annotate$result$1	I
/*    */     //   204	9	12	$i$f$cast	I
/*    */     //   191	23	10	$i$f$serializer	I
/*    */     //   230	9	12	$i$f$cast	I
/*    */     //   217	23	10	$i$f$serializer	I
/*    */     //   170	94	9	$i$f$sendAndGet	I
/*    */     //   50	236	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	229	13	$result	Ljava/lang/Object;
/*    */     //   267	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NerAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "annotate", c = "ai.grazie.api.gateway.client.api.cloud.meta.NerAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NerAPIClient$annotate$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     NerAPIClient$annotate$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NerAPIClient.this.annotate(null, null, (Continuation<? super List<SentenceWithNERAnnotations>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/meta/NerAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */