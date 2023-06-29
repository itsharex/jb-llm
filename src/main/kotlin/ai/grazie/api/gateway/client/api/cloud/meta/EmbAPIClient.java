/*    */ package ai.grazie.api.gateway.client.api.cloud.meta;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.emb.DoubleTextEmbedding;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020 \n\002\b\004\030\0002\b\022\004\022\0020\0020\001B'\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J/\020\021\032\b\022\004\022\0020\0020\0222\f\020\023\032\b\022\004\022\0020\0040\0222\b\020\024\032\004\030\0010\004H@ø\001\000¢\006\002\020\025R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\f\020\rR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\016\020\017R\016\020\020\032\0020\004X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient;", "Lai/grazie/emb/SuspendableTextEmbeddingsService;", "Lai/grazie/emb/DoubleTextEmbedding;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "getClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "url", "embed", "", "texts", "model", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nEmbAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient\n+ 2 SuspendableClientExtensions.kt\nai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,22:1\n25#2,8:23\n24#3:31\n80#4:32\n*S KotlinDebug\n*F\n+ 1 EmbAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient\n*L\n18#1:23,8\n18#1:31\n18#1:32\n*E\n"})
/*    */ public final class EmbAPIClient implements SuspendableTextEmbeddingsService<DoubleTextEmbedding> {
/*    */   public EmbAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient client, @NotNull JSON json) {
/* 13 */     this.client = client; this.json = json;
/*    */     
/* 15 */     this.url = EmbAPI.Embed.V1.INSTANCE.url(server, authType, AuthVersion.V5);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final SuspendableHTTPClient client;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   @NotNull
/*    */   private final String url;
/*    */   
/*    */   @NotNull
/*    */   public final SuspendableHTTPClient getClient() {
/*    */     return this.client;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JSON getJson() {
/*    */     return this.json;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object embed(@NotNull List texts, @Nullable String model, @NotNull Continuation<? super List<DoubleTextEmbedding>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient$embed$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient$embed$1
/*    */     //   11: astore #16
/*    */     //   13: aload #16
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #16
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient$embed$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #16
/*    */     //   50: aload #16
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #15
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #17
/*    */     //   62: aload #16
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 252, 0 -> 88, 1 -> 230
/*    */     //   88: aload #15
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   97: astore #5
/*    */     //   99: aload_0
/*    */     //   100: getfield url : Ljava/lang/String;
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/meta/EmbAPI$Embed$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*    */     //   114: astore #7
/*    */     //   116: aload_0
/*    */     //   117: getfield json : Lai/grazie/utils/json/JSON;
/*    */     //   120: astore #9
/*    */     //   122: getstatic ai/grazie/utils/cbor/CBOR$Default.INSTANCE : Lai/grazie/utils/cbor/CBOR$Default;
/*    */     //   125: checkcast ai/grazie/utils/cbor/CBOR
/*    */     //   128: astore #10
/*    */     //   130: new ai/grazie/client/common/model/RequestOptions
/*    */     //   133: dup
/*    */     //   134: aconst_null
/*    */     //   135: aconst_null
/*    */     //   136: iconst_3
/*    */     //   137: aconst_null
/*    */     //   138: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   141: astore #8
/*    */     //   143: iconst_0
/*    */     //   144: istore #11
/*    */     //   146: aload #5
/*    */     //   148: aload #6
/*    */     //   150: aload #7
/*    */     //   152: iconst_0
/*    */     //   153: istore #12
/*    */     //   155: ldc ai/grazie/api/gateway/api/cloud/meta/EmbAPI$Embed$V1$Request
/*    */     //   157: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   160: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   163: astore #13
/*    */     //   165: iconst_0
/*    */     //   166: istore #14
/*    */     //   168: aload #13
/*    */     //   170: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   172: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   175: aload #13
/*    */     //   177: nop
/*    */     //   178: iconst_0
/*    */     //   179: istore #12
/*    */     //   181: ldc ai/grazie/api/gateway/api/cloud/meta/EmbAPI$Embed$V1$Response
/*    */     //   183: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   186: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   189: astore #13
/*    */     //   191: iconst_0
/*    */     //   192: istore #14
/*    */     //   194: aload #13
/*    */     //   196: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   198: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   201: aload #13
/*    */     //   203: nop
/*    */     //   204: aload #8
/*    */     //   206: aload #9
/*    */     //   208: aload #10
/*    */     //   210: aload #16
/*    */     //   212: aload #16
/*    */     //   214: iconst_1
/*    */     //   215: putfield label : I
/*    */     //   218: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   221: dup
/*    */     //   222: aload #17
/*    */     //   224: if_acmpne -> 240
/*    */     //   227: aload #17
/*    */     //   229: areturn
/*    */     //   230: iconst_0
/*    */     //   231: istore #11
/*    */     //   233: aload #15
/*    */     //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   238: aload #15
/*    */     //   240: nop
/*    */     //   241: checkcast ai/grazie/api/gateway/api/cloud/meta/EmbAPI$Embed$V1$Response
/*    */     //   244: astore #4
/*    */     //   246: aload #4
/*    */     //   248: invokevirtual getEmbeddings : ()Ljava/util/List;
/*    */     //   251: areturn
/*    */     //   252: new java/lang/IllegalStateException
/*    */     //   255: dup
/*    */     //   256: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   258: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   261: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 93
/*    */     //   #23	-> 130
/*    */     //   #26	-> 130
/*    */     //   #23	-> 143
/*    */     //   #23	-> 143
/*    */     //   #23	-> 143
/*    */     //   #30	-> 146
/*    */     //   #31	-> 160
/*    */     //   #32	-> 168
/*    */     //   #31	-> 177
/*    */     //   #30	-> 178
/*    */     //   #31	-> 186
/*    */     //   #32	-> 194
/*    */     //   #31	-> 203
/*    */     //   #30	-> 204
/*    */     //   #17	-> 227
/*    */     //   #30	-> 240
/*    */     //   #18	-> 241
/*    */     //   #19	-> 246
/*    */     //   #17	-> 252
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	37	0	this	Lai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient;
/*    */     //   93	37	1	texts	Ljava/util/List;
/*    */     //   93	37	2	model	Ljava/lang/String;
/*    */     //   246	6	4	response	Lai/grazie/api/gateway/api/cloud/meta/EmbAPI$Embed$V1$Response;
/*    */     //   130	25	5	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   130	25	6	url$iv	Ljava/lang/String;
/*    */     //   130	25	7	content$iv	Ljava/lang/Object;
/*    */     //   143	78	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   130	91	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   130	91	10	cbor$iv	Lai/grazie/utils/cbor/CBOR;
/*    */     //   165	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   191	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   168	9	14	$i$f$cast	I
/*    */     //   155	23	12	$i$f$serializer	I
/*    */     //   194	9	14	$i$f$cast	I
/*    */     //   181	23	12	$i$f$serializer	I
/*    */     //   146	84	11	$i$f$sendAndGet	I
/*    */     //   50	202	16	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	195	15	$result	Ljava/lang/Object;
/*    */     //   233	8	11	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "EmbAPIClient.kt", l = {30}, i = {}, s = {}, n = {}, m = "embed", c = "ai.grazie.api.gateway.client.api.cloud.meta.EmbAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class EmbAPIClient$embed$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     EmbAPIClient$embed$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return EmbAPIClient.this.embed(null, null, (Continuation<? super List<DoubleTextEmbedding>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/meta/EmbAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */