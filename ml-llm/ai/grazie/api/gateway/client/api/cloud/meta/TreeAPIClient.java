/*    */ package ai.grazie.api.gateway.client.api.cloud.meta;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002BA\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\004\022\016\020\b\032\n\022\004\022\0020\004\030\0010\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\002\020\016J-\020\023\032\b\022\004\022\0020\0240\t2\006\020\025\032\0020\0262\f\020\027\032\b\022\004\022\0020\0040\tH@ø\001\000¢\006\002\020\030R\031\020\b\032\n\022\004\022\0020\004\030\0010\t¢\006\b\n\000\032\004\b\017\020\020R\023\020\007\032\004\030\0010\004¢\006\b\n\000\032\004\b\021\020\022\002\004\n\002\b\031¨\006\031"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "parser", "options", "", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Ljava/lang/String;Ljava/util/List;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "getOptions", "()Ljava/util/List;", "getParser", "()Ljava/lang/String;", "parse", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nTreeAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,21:1\n53#2,6:22\n24#3:28\n80#4:29\n*S KotlinDebug\n*F\n+ 1 TreeAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient\n*L\n17#1:22,6\n17#1:28\n17#1:29\n*E\n"})
/*    */ public final class TreeAPIClient extends SuspendableCloudClient implements SuspendableMultiTreeDependencyService {
/*    */   @Nullable
/*    */   private final String parser;
/*    */   
/*    */   @Nullable
/* 13 */   public final String getParser() { return this.parser; } @Nullable private final List<String> options; @Nullable public final List<String> getOptions() { return this.options; }
/*    */    public TreeAPIClient(@NotNull String server, @NotNull AuthType authType, @Nullable String parser, @Nullable List<String> options, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 15 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.parser = parser;
/*    */     this.options = options;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object parse(@NotNull Language language, @NotNull List sentences, @NotNull Continuation<? super List<SentenceWithTreeDependencies>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient$parse$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient$parse$1
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
/*    */     //   39: new ai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient$parse$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #14
/*    */     //   50: aload #14
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #13
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #15
/*    */     //   62: aload #14
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 261, 0 -> 88, 1 -> 239
/*    */     //   88: aload #13
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1.INSTANCE : Lai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: new ai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: aload_0
/*    */     //   108: getfield parser : Ljava/lang/String;
/*    */     //   111: aload_0
/*    */     //   112: getfield options : Ljava/util/List;
/*    */     //   115: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V
/*    */     //   118: astore #6
/*    */     //   120: new ai/grazie/client/common/model/RequestOptions
/*    */     //   123: dup
/*    */     //   124: aconst_null
/*    */     //   125: aconst_null
/*    */     //   126: iconst_3
/*    */     //   127: aconst_null
/*    */     //   128: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   131: astore #7
/*    */     //   133: aload_0
/*    */     //   134: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   137: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   140: astore #8
/*    */     //   142: iconst_0
/*    */     //   143: istore #9
/*    */     //   145: aload_0
/*    */     //   146: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   149: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   152: aload_0
/*    */     //   153: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   156: aload #5
/*    */     //   158: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   161: aload #6
/*    */     //   163: iconst_0
/*    */     //   164: istore #10
/*    */     //   166: ldc ai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request
/*    */     //   168: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   171: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   174: astore #11
/*    */     //   176: iconst_0
/*    */     //   177: istore #12
/*    */     //   179: aload #11
/*    */     //   181: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   183: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   186: aload #11
/*    */     //   188: nop
/*    */     //   189: iconst_0
/*    */     //   190: istore #10
/*    */     //   192: ldc ai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Response
/*    */     //   194: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   197: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   200: astore #11
/*    */     //   202: iconst_0
/*    */     //   203: istore #12
/*    */     //   205: aload #11
/*    */     //   207: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   209: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   212: aload #11
/*    */     //   214: nop
/*    */     //   215: aload #7
/*    */     //   217: aload #8
/*    */     //   219: aload #14
/*    */     //   221: aload #14
/*    */     //   223: iconst_1
/*    */     //   224: putfield label : I
/*    */     //   227: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   230: dup
/*    */     //   231: aload #15
/*    */     //   233: if_acmpne -> 249
/*    */     //   236: aload #15
/*    */     //   238: areturn
/*    */     //   239: iconst_0
/*    */     //   240: istore #9
/*    */     //   242: aload #13
/*    */     //   244: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   247: aload #13
/*    */     //   249: nop
/*    */     //   250: checkcast ai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Response
/*    */     //   253: astore #4
/*    */     //   255: aload #4
/*    */     //   257: invokevirtual getTrees : ()Ljava/util/List;
/*    */     //   260: areturn
/*    */     //   261: new java/lang/IllegalStateException
/*    */     //   264: dup
/*    */     //   265: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   267: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   270: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #17	-> 93
/*    */     //   #22	-> 120
/*    */     //   #25	-> 120
/*    */     //   #22	-> 133
/*    */     //   #26	-> 133
/*    */     //   #22	-> 142
/*    */     //   #27	-> 145
/*    */     //   #28	-> 171
/*    */     //   #29	-> 179
/*    */     //   #28	-> 188
/*    */     //   #27	-> 189
/*    */     //   #28	-> 197
/*    */     //   #29	-> 205
/*    */     //   #28	-> 214
/*    */     //   #27	-> 215
/*    */     //   #16	-> 236
/*    */     //   #27	-> 249
/*    */     //   #17	-> 250
/*    */     //   #18	-> 255
/*    */     //   #16	-> 261
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	73	0	this	Lai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient;
/*    */     //   93	27	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   93	27	2	sentences	Ljava/util/List;
/*    */     //   255	6	4	result	Lai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Response;
/*    */     //   120	46	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   120	46	6	content$iv	Ljava/lang/Object;
/*    */     //   133	97	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   142	88	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   176	12	11	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   202	12	11	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   179	9	12	$i$f$cast	I
/*    */     //   166	23	10	$i$f$serializer	I
/*    */     //   205	9	12	$i$f$cast	I
/*    */     //   192	23	10	$i$f$serializer	I
/*    */     //   145	94	9	$i$f$sendAndGet	I
/*    */     //   50	211	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	204	13	$result	Ljava/lang/Object;
/*    */     //   242	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "TreeAPIClient.kt", l = {27}, i = {}, s = {}, n = {}, m = "parse", c = "ai.grazie.api.gateway.client.api.cloud.meta.TreeAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class TreeAPIClient$parse$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     TreeAPIClient$parse$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TreeAPIClient.this.parse(null, null, (Continuation<? super List<SentenceWithTreeDependencies>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */