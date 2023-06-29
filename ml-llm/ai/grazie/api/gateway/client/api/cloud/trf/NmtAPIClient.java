/*    */ package ai.grazie.api.gateway.client.api.cloud.trf;
/*    */ import ai.grazie.nmt.SentenceWithTranslation;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002B'\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J5\020\f\032\b\022\004\022\0020\0160\r2\f\020\017\032\b\022\004\022\0020\0040\r2\006\020\020\032\0020\0212\006\020\022\032\0020\021H@ø\001\000¢\006\002\020\023\002\004\n\002\b\031¨\006\024"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/nmt/SuspendableTranslationService;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "translate", "", "Lai/grazie/nmt/SentenceWithTranslation;", "texts", "fromLang", "Lai/grazie/nlp/langs/Language;", "toLang", "(Ljava/util/List;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nNmtAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NmtAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,19:1\n53#2,6:20\n24#3:26\n80#4:27\n*S KotlinDebug\n*F\n+ 1 NmtAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient\n*L\n15#1:20,6\n15#1:26\n15#1:27\n*E\n"})
/*    */ public final class NmtAPIClient extends SuspendableCloudClient implements SuspendableTranslationService {
/*    */   public NmtAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 13 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object translate(@NotNull List texts, @NotNull Language fromLang, @NotNull Language toLang, @NotNull Continuation<? super List<SentenceWithTranslation>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient$translate$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient$translate$1
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
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient$translate$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate.INSTANCE : Lai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/util/List;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;)V
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
/*    */     //   163: ldc ai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate$Request
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
/*    */     //   189: ldc ai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate$Response
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
/*    */     //   247: checkcast ai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate$Response
/*    */     //   250: astore #5
/*    */     //   252: aload #5
/*    */     //   254: invokevirtual getTranslations : ()Ljava/util/List;
/*    */     //   257: areturn
/*    */     //   258: new java/lang/IllegalStateException
/*    */     //   261: dup
/*    */     //   262: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   264: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   267: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 63
/*    */     //   #15	-> 97
/*    */     //   #20	-> 117
/*    */     //   #23	-> 117
/*    */     //   #20	-> 130
/*    */     //   #24	-> 130
/*    */     //   #20	-> 139
/*    */     //   #25	-> 142
/*    */     //   #26	-> 168
/*    */     //   #27	-> 176
/*    */     //   #26	-> 185
/*    */     //   #25	-> 186
/*    */     //   #26	-> 194
/*    */     //   #27	-> 202
/*    */     //   #26	-> 211
/*    */     //   #25	-> 212
/*    */     //   #14	-> 233
/*    */     //   #25	-> 246
/*    */     //   #15	-> 247
/*    */     //   #16	-> 252
/*    */     //   #14	-> 258
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	66	0	this	Lai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient;
/*    */     //   97	20	1	texts	Ljava/util/List;
/*    */     //   97	20	2	fromLang	Lai/grazie/nlp/langs/Language;
/*    */     //   97	20	3	toLang	Lai/grazie/nlp/langs/Language;
/*    */     //   252	6	5	completions	Lai/grazie/api/gateway/api/cloud/trf/NmtAPI$Translate$Response;
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
/*    */   
/*    */   @DebugMetadata(f = "NmtAPIClient.kt", l = {25}, i = {}, s = {}, n = {}, m = "translate", c = "ai.grazie.api.gateway.client.api.cloud.trf.NmtAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NmtAPIClient$translate$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     NmtAPIClient$translate$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NmtAPIClient.this.translate(null, null, null, (Continuation<? super List<SentenceWithTranslation>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/NmtAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */