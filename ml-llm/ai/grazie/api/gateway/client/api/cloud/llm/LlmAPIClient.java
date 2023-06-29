/*    */ package ai.grazie.api.gateway.client.api.cloud.llm;
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\030\0002\0020\001B'\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ7\020\013\032\b\022\004\022\0020\0030\f2\006\020\013\032\0020\r2\n\b\002\020\016\032\004\030\0010\0172\n\b\002\020\020\032\004\030\0010\021H@ø\001\000¢\006\002\020\022J7\020\023\032\b\022\004\022\0020\0030\f2\006\020\024\032\0020\0032\n\b\002\020\016\032\004\030\0010\0172\n\b\002\020\020\032\004\030\0010\021H@ø\001\000¢\006\002\020\025\002\004\n\002\b\031¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "auth", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/chat/LLMChat;", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "prompt", "(Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 5 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 6 JSON.kt\nai/grazie/utils/json/JSON\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,46:1\n74#2,2:47\n76#2,4:51\n74#2,2:71\n76#2,4:75\n24#3:49\n24#3:73\n80#4:50\n80#4:74\n83#5:55\n84#5:57\n85#5,3:63\n83#5:79\n84#5:81\n85#5,3:87\n28#6:56\n28#6:80\n47#7:58\n49#7:62\n47#7:66\n49#7:70\n47#7:82\n49#7:86\n47#7:90\n49#7:94\n50#8:59\n55#8:61\n50#8:67\n55#8:69\n50#8:83\n55#8:85\n50#8:91\n55#8:93\n106#9:60\n106#9:68\n106#9:84\n106#9:92\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient\n*L\n28#1:47,2\n28#1:51,4\n42#1:71,2\n42#1:75,4\n28#1:49\n42#1:73\n28#1:50\n42#1:74\n28#1:55\n28#1:57\n28#1:63,3\n42#1:79\n42#1:81\n42#1:87,3\n28#1:56\n42#1:80\n28#1:58\n28#1:62\n29#1:66\n29#1:70\n42#1:82\n42#1:86\n43#1:90\n43#1:94\n28#1:59\n28#1:61\n29#1:67\n29#1:69\n42#1:83\n42#1:85\n43#1:91\n43#1:93\n28#1:60\n29#1:68\n42#1:84\n43#1:92\n*E\n"})
/*    */ public final class LlmAPIClient extends SuspendableCloudClient {
/*    */   public LlmAPIClient(@NotNull String server, @NotNull AuthType auth, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 16 */     super(server, auth, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object complete(@NotNull String prompt, @Nullable LLMProfileID id, @Nullable Attributes parameters, @NotNull Continuation<? super Flow<String>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$1
/*    */     //   13: astore #23
/*    */     //   15: aload #23
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #23
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #23
/*    */     //   53: aload #23
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #22
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #24
/*    */     //   65: aload #23
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 455, 0 -> 92, 1 -> 282
/*    */     //   92: aload #22
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Complete$Stream$V3.INSTANCE : Lai/grazie/api/gateway/api/cloud/llm/LlmAPI$Complete$Stream$V3;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Complete$Stream$V3$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*    */     //   115: astore #7
/*    */     //   117: iconst_0
/*    */     //   118: istore #12
/*    */     //   120: ldc ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Complete$Stream$V3$Response
/*    */     //   122: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   125: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   128: astore #13
/*    */     //   130: iconst_0
/*    */     //   131: istore #14
/*    */     //   133: aload #13
/*    */     //   135: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   137: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   140: aload #13
/*    */     //   142: nop
/*    */     //   143: astore #8
/*    */     //   145: iconst_0
/*    */     //   146: istore #9
/*    */     //   148: new ai/grazie/client/common/model/RequestOptions
/*    */     //   151: dup
/*    */     //   152: aconst_null
/*    */     //   153: aconst_null
/*    */     //   154: iconst_3
/*    */     //   155: aconst_null
/*    */     //   156: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   159: astore #10
/*    */     //   161: aload_0
/*    */     //   162: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   165: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   168: astore #11
/*    */     //   170: iconst_0
/*    */     //   171: istore #15
/*    */     //   173: aload_0
/*    */     //   174: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   177: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   180: astore #16
/*    */     //   182: aload_0
/*    */     //   183: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   186: aload #6
/*    */     //   188: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   191: astore #12
/*    */     //   193: iconst_0
/*    */     //   194: istore #13
/*    */     //   196: aload #16
/*    */     //   198: aload #12
/*    */     //   200: aload #11
/*    */     //   202: astore #14
/*    */     //   204: iconst_0
/*    */     //   205: istore #17
/*    */     //   207: aload #14
/*    */     //   209: iconst_0
/*    */     //   210: istore #18
/*    */     //   212: ldc ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Complete$Stream$V3$Request
/*    */     //   214: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   217: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   220: astore #19
/*    */     //   222: iconst_0
/*    */     //   223: istore #20
/*    */     //   225: aload #19
/*    */     //   227: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   229: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   232: aload #19
/*    */     //   234: nop
/*    */     //   235: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   238: aload #7
/*    */     //   240: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   243: aload #10
/*    */     //   245: iconst_0
/*    */     //   246: aload #23
/*    */     //   248: aload #23
/*    */     //   250: aload #8
/*    */     //   252: putfield L$0 : Ljava/lang/Object;
/*    */     //   255: aload #23
/*    */     //   257: aload #11
/*    */     //   259: putfield L$1 : Ljava/lang/Object;
/*    */     //   262: aload #23
/*    */     //   264: iconst_1
/*    */     //   265: putfield label : I
/*    */     //   268: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   273: dup
/*    */     //   274: aload #24
/*    */     //   276: if_acmpne -> 315
/*    */     //   279: aload #24
/*    */     //   281: areturn
/*    */     //   282: iconst_0
/*    */     //   283: istore #15
/*    */     //   285: iconst_0
/*    */     //   286: istore #13
/*    */     //   288: aload #23
/*    */     //   290: getfield L$1 : Ljava/lang/Object;
/*    */     //   293: checkcast ai/grazie/utils/json/JSON
/*    */     //   296: astore #11
/*    */     //   298: aload #23
/*    */     //   300: getfield L$0 : Ljava/lang/Object;
/*    */     //   303: checkcast kotlinx/serialization/KSerializer
/*    */     //   306: astore #8
/*    */     //   308: aload #22
/*    */     //   310: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   313: aload #22
/*    */     //   315: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   318: astore #14
/*    */     //   320: iconst_0
/*    */     //   321: istore #17
/*    */     //   323: aload #14
/*    */     //   325: astore #18
/*    */     //   327: iconst_0
/*    */     //   328: istore #19
/*    */     //   330: iconst_0
/*    */     //   331: istore #20
/*    */     //   333: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$1
/*    */     //   336: dup
/*    */     //   337: aload #18
/*    */     //   339: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   342: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   345: nop
/*    */     //   346: nop
/*    */     //   347: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   350: astore #14
/*    */     //   352: iconst_0
/*    */     //   353: istore #17
/*    */     //   355: aload #14
/*    */     //   357: astore #18
/*    */     //   359: iconst_0
/*    */     //   360: istore #19
/*    */     //   362: iconst_0
/*    */     //   363: istore #20
/*    */     //   365: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$2
/*    */     //   368: dup
/*    */     //   369: aload #18
/*    */     //   371: aload #8
/*    */     //   373: aload #11
/*    */     //   375: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*    */     //   378: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   381: nop
/*    */     //   382: nop
/*    */     //   383: astore #14
/*    */     //   385: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*    */     //   388: astore #17
/*    */     //   390: iconst_0
/*    */     //   391: istore #18
/*    */     //   393: aload #14
/*    */     //   395: astore #19
/*    */     //   397: iconst_0
/*    */     //   398: istore #20
/*    */     //   400: iconst_0
/*    */     //   401: istore #21
/*    */     //   403: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$3
/*    */     //   406: dup
/*    */     //   407: aload #19
/*    */     //   409: aload #17
/*    */     //   411: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*    */     //   414: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   417: nop
/*    */     //   418: nop
/*    */     //   419: nop
/*    */     //   420: nop
/*    */     //   421: astore #5
/*    */     //   423: aload #5
/*    */     //   425: astore #6
/*    */     //   427: iconst_0
/*    */     //   428: istore #7
/*    */     //   430: aload #6
/*    */     //   432: astore #8
/*    */     //   434: iconst_0
/*    */     //   435: istore #9
/*    */     //   437: iconst_0
/*    */     //   438: istore #10
/*    */     //   440: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$$inlined$map$1
/*    */     //   443: dup
/*    */     //   444: aload #8
/*    */     //   446: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   449: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   452: nop
/*    */     //   453: nop
/*    */     //   454: areturn
/*    */     //   455: new java/lang/IllegalStateException
/*    */     //   458: dup
/*    */     //   459: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   461: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   464: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 63
/*    */     //   #28	-> 97
/*    */     //   #47	-> 117
/*    */     //   #48	-> 117
/*    */     //   #49	-> 125
/*    */     //   #50	-> 133
/*    */     //   #49	-> 142
/*    */     //   #47	-> 145
/*    */     //   #51	-> 145
/*    */     //   #47	-> 148
/*    */     //   #52	-> 148
/*    */     //   #47	-> 161
/*    */     //   #53	-> 161
/*    */     //   #47	-> 170
/*    */     //   #54	-> 173
/*    */     //   #55	-> 196
/*    */     //   #56	-> 207
/*    */     //   #49	-> 217
/*    */     //   #50	-> 225
/*    */     //   #49	-> 234
/*    */     //   #56	-> 238
/*    */     //   #55	-> 243
/*    */     //   #26	-> 279
/*    */     //   #57	-> 320
/*    */     //   #58	-> 323
/*    */     //   #59	-> 330
/*    */     //   #60	-> 333
/*    */     //   #61	-> 345
/*    */     //   #62	-> 346
/*    */     //   #63	-> 347
/*    */     //   #64	-> 352
/*    */     //   #58	-> 355
/*    */     //   #59	-> 362
/*    */     //   #60	-> 365
/*    */     //   #61	-> 381
/*    */     //   #62	-> 382
/*    */     //   #65	-> 385
/*    */     //   #58	-> 393
/*    */     //   #59	-> 400
/*    */     //   #60	-> 403
/*    */     //   #61	-> 417
/*    */     //   #62	-> 418
/*    */     //   #55	-> 419
/*    */     //   #54	-> 420
/*    */     //   #28	-> 421
/*    */     //   #27	-> 421
/*    */     //   #29	-> 423
/*    */     //   #66	-> 430
/*    */     //   #67	-> 437
/*    */     //   #68	-> 440
/*    */     //   #69	-> 452
/*    */     //   #70	-> 453
/*    */     //   #29	-> 454
/*    */     //   #26	-> 455
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	96	0	this	Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient;
/*    */     //   97	20	1	prompt	Ljava/lang/String;
/*    */     //   97	20	2	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   97	20	3	parameters	Lai/grazie/utils/attributes/Attributes;
/*    */     //   423	32	5	result	Lkotlinx/coroutines/flow/Flow;
/*    */     //   117	76	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   427	27	6	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   117	126	7	content$iv	Ljava/lang/Object;
/*    */     //   145	137	8	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   308	113	8	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   434	19	8	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   148	97	9	reconnect$iv	Z
/*    */     //   161	84	10	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   170	112	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   298	123	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   193	11	12	url$iv$iv	Ljava/lang/String;
/*    */     //   130	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   204	39	14	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   320	27	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   352	31	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   385	34	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   193	11	16	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   327	19	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   359	23	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   222	12	19	$this$cast$iv$iv$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   397	21	19	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   133	9	14	$i$f$cast	I
/*    */     //   120	23	12	$i$f$serializer	I
/*    */     //   225	9	20	$i$f$cast	I
/*    */     //   212	23	18	$i$f$serializer	I
/*    */     //   207	36	17	$i$f$string	I
/*    */     //   333	12	20	$i$f$unsafeFlow	I
/*    */     //   330	16	19	$i$f$unsafeTransform	I
/*    */     //   323	24	17	$i$f$map	I
/*    */     //   365	16	20	$i$f$unsafeFlow	I
/*    */     //   362	20	19	$i$f$unsafeTransform	I
/*    */     //   355	28	17	$i$f$map	I
/*    */     //   403	14	21	$i$f$unsafeFlow	I
/*    */     //   400	18	20	$i$f$unsafeTransform	I
/*    */     //   393	26	18	$i$f$map	I
/*    */     //   196	86	13	$i$f$receiveContinuousSSE	I
/*    */     //   173	109	15	$i$f$receiveContinuousSSE	I
/*    */     //   440	12	10	$i$f$unsafeFlow	I
/*    */     //   437	16	9	$i$f$unsafeTransform	I
/*    */     //   430	24	7	$i$f$map	I
/*    */     //   53	402	23	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	395	22	$result	Ljava/lang/Object;
/*    */     //   288	132	13	$i$f$receiveContinuousSSE	I
/*    */     //   285	136	15	$i$f$receiveContinuousSSE	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object chat(@NotNull LLMChat chat, @Nullable LLMProfileID id, @Nullable Attributes parameters, @NotNull Continuation<? super Flow<String>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$1
/*    */     //   13: astore #23
/*    */     //   15: aload #23
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #23
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #23
/*    */     //   53: aload #23
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #22
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #24
/*    */     //   65: aload #23
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 455, 0 -> 92, 1 -> 282
/*    */     //   92: aload #22
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Chat$Stream$V3.INSTANCE : Lai/grazie/api/gateway/api/cloud/llm/LlmAPI$Chat$Stream$V3;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Chat$Stream$V3$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*    */     //   115: astore #7
/*    */     //   117: iconst_0
/*    */     //   118: istore #12
/*    */     //   120: ldc ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Chat$Stream$V3$Response
/*    */     //   122: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   125: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   128: astore #13
/*    */     //   130: iconst_0
/*    */     //   131: istore #14
/*    */     //   133: aload #13
/*    */     //   135: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   137: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   140: aload #13
/*    */     //   142: nop
/*    */     //   143: astore #8
/*    */     //   145: iconst_0
/*    */     //   146: istore #9
/*    */     //   148: new ai/grazie/client/common/model/RequestOptions
/*    */     //   151: dup
/*    */     //   152: aconst_null
/*    */     //   153: aconst_null
/*    */     //   154: iconst_3
/*    */     //   155: aconst_null
/*    */     //   156: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   159: astore #10
/*    */     //   161: aload_0
/*    */     //   162: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   165: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   168: astore #11
/*    */     //   170: iconst_0
/*    */     //   171: istore #15
/*    */     //   173: aload_0
/*    */     //   174: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   177: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   180: astore #16
/*    */     //   182: aload_0
/*    */     //   183: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   186: aload #6
/*    */     //   188: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   191: astore #12
/*    */     //   193: iconst_0
/*    */     //   194: istore #13
/*    */     //   196: aload #16
/*    */     //   198: aload #12
/*    */     //   200: aload #11
/*    */     //   202: astore #14
/*    */     //   204: iconst_0
/*    */     //   205: istore #17
/*    */     //   207: aload #14
/*    */     //   209: iconst_0
/*    */     //   210: istore #18
/*    */     //   212: ldc ai/grazie/api/gateway/api/cloud/llm/LlmAPI$Chat$Stream$V3$Request
/*    */     //   214: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   217: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   220: astore #19
/*    */     //   222: iconst_0
/*    */     //   223: istore #20
/*    */     //   225: aload #19
/*    */     //   227: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   229: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   232: aload #19
/*    */     //   234: nop
/*    */     //   235: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   238: aload #7
/*    */     //   240: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   243: aload #10
/*    */     //   245: iconst_0
/*    */     //   246: aload #23
/*    */     //   248: aload #23
/*    */     //   250: aload #8
/*    */     //   252: putfield L$0 : Ljava/lang/Object;
/*    */     //   255: aload #23
/*    */     //   257: aload #11
/*    */     //   259: putfield L$1 : Ljava/lang/Object;
/*    */     //   262: aload #23
/*    */     //   264: iconst_1
/*    */     //   265: putfield label : I
/*    */     //   268: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   273: dup
/*    */     //   274: aload #24
/*    */     //   276: if_acmpne -> 315
/*    */     //   279: aload #24
/*    */     //   281: areturn
/*    */     //   282: iconst_0
/*    */     //   283: istore #15
/*    */     //   285: iconst_0
/*    */     //   286: istore #13
/*    */     //   288: aload #23
/*    */     //   290: getfield L$1 : Ljava/lang/Object;
/*    */     //   293: checkcast ai/grazie/utils/json/JSON
/*    */     //   296: astore #11
/*    */     //   298: aload #23
/*    */     //   300: getfield L$0 : Ljava/lang/Object;
/*    */     //   303: checkcast kotlinx/serialization/KSerializer
/*    */     //   306: astore #8
/*    */     //   308: aload #22
/*    */     //   310: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   313: aload #22
/*    */     //   315: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   318: astore #14
/*    */     //   320: iconst_0
/*    */     //   321: istore #17
/*    */     //   323: aload #14
/*    */     //   325: astore #18
/*    */     //   327: iconst_0
/*    */     //   328: istore #19
/*    */     //   330: iconst_0
/*    */     //   331: istore #20
/*    */     //   333: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$1
/*    */     //   336: dup
/*    */     //   337: aload #18
/*    */     //   339: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   342: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   345: nop
/*    */     //   346: nop
/*    */     //   347: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   350: astore #14
/*    */     //   352: iconst_0
/*    */     //   353: istore #17
/*    */     //   355: aload #14
/*    */     //   357: astore #18
/*    */     //   359: iconst_0
/*    */     //   360: istore #19
/*    */     //   362: iconst_0
/*    */     //   363: istore #20
/*    */     //   365: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$2
/*    */     //   368: dup
/*    */     //   369: aload #18
/*    */     //   371: aload #8
/*    */     //   373: aload #11
/*    */     //   375: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*    */     //   378: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   381: nop
/*    */     //   382: nop
/*    */     //   383: astore #14
/*    */     //   385: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*    */     //   388: astore #17
/*    */     //   390: iconst_0
/*    */     //   391: istore #18
/*    */     //   393: aload #14
/*    */     //   395: astore #19
/*    */     //   397: iconst_0
/*    */     //   398: istore #20
/*    */     //   400: iconst_0
/*    */     //   401: istore #21
/*    */     //   403: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$receiveContinuousSSE$default$3
/*    */     //   406: dup
/*    */     //   407: aload #19
/*    */     //   409: aload #17
/*    */     //   411: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*    */     //   414: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   417: nop
/*    */     //   418: nop
/*    */     //   419: nop
/*    */     //   420: nop
/*    */     //   421: astore #5
/*    */     //   423: aload #5
/*    */     //   425: astore #6
/*    */     //   427: iconst_0
/*    */     //   428: istore #7
/*    */     //   430: aload #6
/*    */     //   432: astore #8
/*    */     //   434: iconst_0
/*    */     //   435: istore #9
/*    */     //   437: iconst_0
/*    */     //   438: istore #10
/*    */     //   440: new ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$chat$$inlined$map$1
/*    */     //   443: dup
/*    */     //   444: aload #8
/*    */     //   446: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   449: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   452: nop
/*    */     //   453: nop
/*    */     //   454: areturn
/*    */     //   455: new java/lang/IllegalStateException
/*    */     //   458: dup
/*    */     //   459: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   461: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   464: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 63
/*    */     //   #42	-> 97
/*    */     //   #71	-> 117
/*    */     //   #72	-> 117
/*    */     //   #73	-> 125
/*    */     //   #74	-> 133
/*    */     //   #73	-> 142
/*    */     //   #71	-> 145
/*    */     //   #75	-> 145
/*    */     //   #71	-> 148
/*    */     //   #76	-> 148
/*    */     //   #71	-> 161
/*    */     //   #77	-> 161
/*    */     //   #71	-> 170
/*    */     //   #78	-> 173
/*    */     //   #79	-> 196
/*    */     //   #80	-> 207
/*    */     //   #73	-> 217
/*    */     //   #74	-> 225
/*    */     //   #73	-> 234
/*    */     //   #80	-> 238
/*    */     //   #79	-> 243
/*    */     //   #41	-> 279
/*    */     //   #81	-> 320
/*    */     //   #82	-> 323
/*    */     //   #83	-> 330
/*    */     //   #84	-> 333
/*    */     //   #85	-> 345
/*    */     //   #86	-> 346
/*    */     //   #87	-> 347
/*    */     //   #88	-> 352
/*    */     //   #82	-> 355
/*    */     //   #83	-> 362
/*    */     //   #84	-> 365
/*    */     //   #85	-> 381
/*    */     //   #86	-> 382
/*    */     //   #89	-> 385
/*    */     //   #82	-> 393
/*    */     //   #83	-> 400
/*    */     //   #84	-> 403
/*    */     //   #85	-> 417
/*    */     //   #86	-> 418
/*    */     //   #79	-> 419
/*    */     //   #78	-> 420
/*    */     //   #42	-> 421
/*    */     //   #43	-> 423
/*    */     //   #90	-> 430
/*    */     //   #91	-> 437
/*    */     //   #92	-> 440
/*    */     //   #93	-> 452
/*    */     //   #94	-> 453
/*    */     //   #43	-> 454
/*    */     //   #41	-> 455
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	96	0	this	Lai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient;
/*    */     //   97	20	1	chat	Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   97	20	2	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   97	20	3	parameters	Lai/grazie/utils/attributes/Attributes;
/*    */     //   423	32	5	result	Lkotlinx/coroutines/flow/Flow;
/*    */     //   117	76	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   427	27	6	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   117	126	7	content$iv	Ljava/lang/Object;
/*    */     //   145	137	8	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   308	113	8	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   434	19	8	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   148	97	9	reconnect$iv	Z
/*    */     //   161	84	10	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   170	112	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   298	123	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   193	11	12	url$iv$iv	Ljava/lang/String;
/*    */     //   130	12	13	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   204	39	14	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   320	27	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   352	31	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   385	34	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   193	11	16	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   327	19	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   359	23	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   222	12	19	$this$cast$iv$iv$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   397	21	19	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   133	9	14	$i$f$cast	I
/*    */     //   120	23	12	$i$f$serializer	I
/*    */     //   225	9	20	$i$f$cast	I
/*    */     //   212	23	18	$i$f$serializer	I
/*    */     //   207	36	17	$i$f$string	I
/*    */     //   333	12	20	$i$f$unsafeFlow	I
/*    */     //   330	16	19	$i$f$unsafeTransform	I
/*    */     //   323	24	17	$i$f$map	I
/*    */     //   365	16	20	$i$f$unsafeFlow	I
/*    */     //   362	20	19	$i$f$unsafeTransform	I
/*    */     //   355	28	17	$i$f$map	I
/*    */     //   403	14	21	$i$f$unsafeFlow	I
/*    */     //   400	18	20	$i$f$unsafeTransform	I
/*    */     //   393	26	18	$i$f$map	I
/*    */     //   196	86	13	$i$f$receiveContinuousSSE	I
/*    */     //   173	109	15	$i$f$receiveContinuousSSE	I
/*    */     //   440	12	10	$i$f$unsafeFlow	I
/*    */     //   437	16	9	$i$f$unsafeTransform	I
/*    */     //   430	24	7	$i$f$map	I
/*    */     //   53	402	23	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	395	22	$result	Ljava/lang/Object;
/*    */     //   288	132	13	$i$f$receiveContinuousSSE	I
/*    */     //   285	136	15	$i$f$receiveContinuousSSE	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LlmAPIClient.kt", l = {55}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "chat", c = "ai.grazie.api.gateway.client.api.cloud.llm.LlmAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LlmAPIClient$chat$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     LlmAPIClient$chat$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LlmAPIClient.this.chat(null, null, null, (Continuation<? super Flow<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LlmAPIClient.kt", l = {55}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.cloud.llm.LlmAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LlmAPIClient$complete$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     LlmAPIClient$complete$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LlmAPIClient.this.complete(null, null, null, (Continuation<? super Flow<String>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */