/*    */ package ai.grazie.api.gateway.client.api;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B'\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\031\020\013\032\0020\f2\006\020\r\032\0020\016H@ø\001\000¢\006\002\020\017\002\004\n\002\b\031¨\006\020"}, d2 = {"Lai/grazie/api/gateway/client/api/FeedbackAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "send", "", "positive", "Lai/grazie/auth/model/feedback/CorrectionFalsePositive;", "(Lai/grazie/auth/model/feedback/CorrectionFalsePositive;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nFeedbackAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackAPIClient.kt\nai/grazie/api/gateway/client/api/FeedbackAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,18:1\n53#2,6:19\n24#3:25\n80#4:26\n*S KotlinDebug\n*F\n+ 1 FeedbackAPIClient.kt\nai/grazie/api/gateway/client/api/FeedbackAPIClient\n*L\n14#1:19,6\n14#1:25\n14#1:26\n*E\n"})
/*    */ public final class FeedbackAPIClient extends SuspendableCloudClient {
/*    */   public FeedbackAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 11 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object send(@NotNull CorrectionFalsePositive positive, @NotNull Continuation<? super Boolean> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/FeedbackAPIClient$send$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/FeedbackAPIClient$send$1
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/FeedbackAPIClient$send$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/FeedbackAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 253, 0 -> 88, 1 -> 230
/*    */     //   88: aload #12
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive.INSTANCE : Lai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #4
/*    */     //   101: new ai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Request
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: invokespecial <init> : (Lai/grazie/auth/model/feedback/CorrectionFalsePositive;)V
/*    */     //   109: astore #5
/*    */     //   111: new ai/grazie/client/common/model/RequestOptions
/*    */     //   114: dup
/*    */     //   115: aconst_null
/*    */     //   116: aconst_null
/*    */     //   117: iconst_3
/*    */     //   118: aconst_null
/*    */     //   119: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   122: astore #6
/*    */     //   124: aload_0
/*    */     //   125: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   128: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   131: astore #7
/*    */     //   133: iconst_0
/*    */     //   134: istore #8
/*    */     //   136: aload_0
/*    */     //   137: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   140: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   143: aload_0
/*    */     //   144: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   147: aload #4
/*    */     //   149: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   152: aload #5
/*    */     //   154: iconst_0
/*    */     //   155: istore #9
/*    */     //   157: ldc ai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Request
/*    */     //   159: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   162: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   165: astore #10
/*    */     //   167: iconst_0
/*    */     //   168: istore #11
/*    */     //   170: aload #10
/*    */     //   172: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   174: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   177: aload #10
/*    */     //   179: nop
/*    */     //   180: iconst_0
/*    */     //   181: istore #9
/*    */     //   183: ldc ai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response
/*    */     //   185: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   188: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   191: astore #10
/*    */     //   193: iconst_0
/*    */     //   194: istore #11
/*    */     //   196: aload #10
/*    */     //   198: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   200: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   203: aload #10
/*    */     //   205: nop
/*    */     //   206: aload #6
/*    */     //   208: aload #7
/*    */     //   210: aload #13
/*    */     //   212: aload #13
/*    */     //   214: iconst_1
/*    */     //   215: putfield label : I
/*    */     //   218: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   221: dup
/*    */     //   222: aload #14
/*    */     //   224: if_acmpne -> 240
/*    */     //   227: aload #14
/*    */     //   229: areturn
/*    */     //   230: iconst_0
/*    */     //   231: istore #8
/*    */     //   233: aload #12
/*    */     //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   238: aload #12
/*    */     //   240: nop
/*    */     //   241: checkcast ai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response
/*    */     //   244: astore_3
/*    */     //   245: aload_3
/*    */     //   246: invokevirtual isOk : ()Z
/*    */     //   249: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   252: areturn
/*    */     //   253: new java/lang/IllegalStateException
/*    */     //   256: dup
/*    */     //   257: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   262: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 60
/*    */     //   #14	-> 93
/*    */     //   #19	-> 111
/*    */     //   #22	-> 111
/*    */     //   #19	-> 124
/*    */     //   #23	-> 124
/*    */     //   #19	-> 133
/*    */     //   #24	-> 136
/*    */     //   #25	-> 162
/*    */     //   #26	-> 170
/*    */     //   #25	-> 179
/*    */     //   #24	-> 180
/*    */     //   #25	-> 188
/*    */     //   #26	-> 196
/*    */     //   #25	-> 205
/*    */     //   #24	-> 206
/*    */     //   #12	-> 227
/*    */     //   #24	-> 240
/*    */     //   #14	-> 241
/*    */     //   #13	-> 244
/*    */     //   #15	-> 245
/*    */     //   #12	-> 253
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	64	0	this	Lai/grazie/api/gateway/client/api/FeedbackAPIClient;
/*    */     //   93	18	1	positive	Lai/grazie/auth/model/feedback/CorrectionFalsePositive;
/*    */     //   245	8	3	verification	Lai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response;
/*    */     //   111	46	4	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   111	46	5	content$iv	Ljava/lang/Object;
/*    */     //   124	97	6	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   133	88	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   167	12	10	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   193	12	10	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   170	9	11	$i$f$cast	I
/*    */     //   157	23	9	$i$f$serializer	I
/*    */     //   196	9	11	$i$f$cast	I
/*    */     //   183	23	9	$i$f$serializer	I
/*    */     //   136	94	8	$i$f$sendAndGet	I
/*    */     //   50	203	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	196	12	$result	Ljava/lang/Object;
/*    */     //   233	8	8	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FeedbackAPIClient.kt", l = {24}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.api.gateway.client.api.FeedbackAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class FeedbackAPIClient$send$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     FeedbackAPIClient$send$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FeedbackAPIClient.this.send(null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/FeedbackAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */