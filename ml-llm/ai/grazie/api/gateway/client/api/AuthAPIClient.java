/*    */ package ai.grazie.api.gateway.client.api;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\030\0002\0020\001B'\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\023\020\013\032\004\030\0010\003H@ø\001\000¢\006\002\020\fJ\023\020\r\032\004\030\0010\016H@ø\001\000¢\006\002\020\f\002\004\n\002\b\031¨\006\017"}, d2 = {"Lai/grazie/api/gateway/client/api/AuthAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "refresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "Lai/grazie/utils/mpp/time/Timestamp;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nAuthAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,31:1\n68#2,5:32\n65#2:39\n68#2,5:40\n65#2:47\n24#3:37\n24#3:45\n80#4:38\n80#4:46\n*S KotlinDebug\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient\n*L\n15#1:32,5\n15#1:39\n24#1:40,5\n24#1:47\n15#1:37\n24#1:45\n15#1:38\n24#1:46\n*E\n"})
/*    */ public final class AuthAPIClient extends SuspendableCloudClient {
/*    */   public AuthAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) {
/* 12 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object verify(@NotNull Continuation<? super Timestamp> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 234, 0 -> 88, 1 -> 200
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: nop
/*    */     //   94: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V2.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Verify$V2;
/*    */     //   97: checkcast ai/grazie/model/cloud/API
/*    */     //   100: astore_3
/*    */     //   101: new ai/grazie/client/common/model/RequestOptions
/*    */     //   104: dup
/*    */     //   105: aconst_null
/*    */     //   106: aconst_null
/*    */     //   107: iconst_3
/*    */     //   108: aconst_null
/*    */     //   109: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   112: astore #4
/*    */     //   114: aload_0
/*    */     //   115: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   118: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   121: astore #5
/*    */     //   123: iconst_0
/*    */     //   124: istore #6
/*    */     //   126: aload_0
/*    */     //   127: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   130: astore #7
/*    */     //   132: iconst_0
/*    */     //   133: istore #8
/*    */     //   135: ldc ai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response
/*    */     //   137: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   140: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   143: astore #9
/*    */     //   145: iconst_0
/*    */     //   146: istore #10
/*    */     //   148: aload #9
/*    */     //   150: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   152: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   155: aload #9
/*    */     //   157: nop
/*    */     //   158: astore #8
/*    */     //   160: iconst_0
/*    */     //   161: istore #9
/*    */     //   163: aload #7
/*    */     //   165: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   168: aload #7
/*    */     //   170: aload_3
/*    */     //   171: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   174: aload #8
/*    */     //   176: aload #4
/*    */     //   178: aload #5
/*    */     //   180: aload #12
/*    */     //   182: aload #12
/*    */     //   184: iconst_1
/*    */     //   185: putfield label : I
/*    */     //   188: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   191: dup
/*    */     //   192: aload #13
/*    */     //   194: if_acmpne -> 214
/*    */     //   197: aload #13
/*    */     //   199: areturn
/*    */     //   200: iconst_0
/*    */     //   201: istore #6
/*    */     //   203: iconst_0
/*    */     //   204: istore #9
/*    */     //   206: nop
/*    */     //   207: aload #11
/*    */     //   209: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   212: aload #11
/*    */     //   214: nop
/*    */     //   215: nop
/*    */     //   216: checkcast ai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response
/*    */     //   219: astore_3
/*    */     //   220: goto -> 227
/*    */     //   223: astore #4
/*    */     //   225: aconst_null
/*    */     //   226: areturn
/*    */     //   227: aload_3
/*    */     //   228: astore_2
/*    */     //   229: aload_2
/*    */     //   230: invokevirtual getExpires : ()Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   233: areturn
/*    */     //   234: new java/lang/IllegalStateException
/*    */     //   237: dup
/*    */     //   238: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   240: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   243: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 60
/*    */     //   #14	-> 93
/*    */     //   #15	-> 94
/*    */     //   #32	-> 101
/*    */     //   #34	-> 101
/*    */     //   #32	-> 114
/*    */     //   #35	-> 114
/*    */     //   #32	-> 123
/*    */     //   #36	-> 126
/*    */     //   #37	-> 140
/*    */     //   #38	-> 148
/*    */     //   #37	-> 157
/*    */     //   #36	-> 160
/*    */     //   #39	-> 163
/*    */     //   #13	-> 197
/*    */     //   #39	-> 214
/*    */     //   #36	-> 215
/*    */     //   #16	-> 223
/*    */     //   #17	-> 225
/*    */     //   #14	-> 227
/*    */     //   #19	-> 229
/*    */     //   #13	-> 234
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	42	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   229	5	2	verification	Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response;
/*    */     //   101	90	3	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   114	77	4	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   123	68	5	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   135	56	7	this_$iv$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*    */     //   160	31	8	output$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   145	12	9	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   148	9	10	$i$f$cast	I
/*    */     //   135	23	8	$i$f$serializer	I
/*    */     //   163	37	9	$i$f$sendAndGet	I
/*    */     //   126	74	6	$i$f$sendAndGet	I
/*    */     //   50	184	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	177	11	$result	Ljava/lang/Object;
/*    */     //   206	9	9	$i$f$sendAndGet	I
/*    */     //   203	13	6	$i$f$sendAndGet	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   93	191	223	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*    */     //   206	220	223	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object refresh(@NotNull Continuation<? super String> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 234, 0 -> 88, 1 -> 200
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: nop
/*    */     //   94: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V2.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V2;
/*    */     //   97: checkcast ai/grazie/model/cloud/API
/*    */     //   100: astore_3
/*    */     //   101: new ai/grazie/client/common/model/RequestOptions
/*    */     //   104: dup
/*    */     //   105: aconst_null
/*    */     //   106: aconst_null
/*    */     //   107: iconst_3
/*    */     //   108: aconst_null
/*    */     //   109: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   112: astore #4
/*    */     //   114: aload_0
/*    */     //   115: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   118: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   121: astore #5
/*    */     //   123: iconst_0
/*    */     //   124: istore #6
/*    */     //   126: aload_0
/*    */     //   127: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   130: astore #7
/*    */     //   132: iconst_0
/*    */     //   133: istore #8
/*    */     //   135: ldc ai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response
/*    */     //   137: invokestatic typeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*    */     //   140: invokestatic serializer : (Lkotlin/reflect/KType;)Lkotlinx/serialization/KSerializer;
/*    */     //   143: astore #9
/*    */     //   145: iconst_0
/*    */     //   146: istore #10
/*    */     //   148: aload #9
/*    */     //   150: ldc 'null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>'
/*    */     //   152: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   155: aload #9
/*    */     //   157: nop
/*    */     //   158: astore #8
/*    */     //   160: iconst_0
/*    */     //   161: istore #9
/*    */     //   163: aload #7
/*    */     //   165: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   168: aload #7
/*    */     //   170: aload_3
/*    */     //   171: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   174: aload #8
/*    */     //   176: aload #4
/*    */     //   178: aload #5
/*    */     //   180: aload #12
/*    */     //   182: aload #12
/*    */     //   184: iconst_1
/*    */     //   185: putfield label : I
/*    */     //   188: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   191: dup
/*    */     //   192: aload #13
/*    */     //   194: if_acmpne -> 214
/*    */     //   197: aload #13
/*    */     //   199: areturn
/*    */     //   200: iconst_0
/*    */     //   201: istore #6
/*    */     //   203: iconst_0
/*    */     //   204: istore #9
/*    */     //   206: nop
/*    */     //   207: aload #11
/*    */     //   209: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   212: aload #11
/*    */     //   214: nop
/*    */     //   215: nop
/*    */     //   216: checkcast ai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response
/*    */     //   219: astore_3
/*    */     //   220: goto -> 227
/*    */     //   223: astore #4
/*    */     //   225: aconst_null
/*    */     //   226: areturn
/*    */     //   227: aload_3
/*    */     //   228: astore_2
/*    */     //   229: aload_2
/*    */     //   230: invokevirtual getToken : ()Ljava/lang/String;
/*    */     //   233: areturn
/*    */     //   234: new java/lang/IllegalStateException
/*    */     //   237: dup
/*    */     //   238: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   240: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   243: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 60
/*    */     //   #23	-> 93
/*    */     //   #24	-> 94
/*    */     //   #40	-> 101
/*    */     //   #42	-> 101
/*    */     //   #40	-> 114
/*    */     //   #43	-> 114
/*    */     //   #40	-> 123
/*    */     //   #44	-> 126
/*    */     //   #45	-> 140
/*    */     //   #46	-> 148
/*    */     //   #45	-> 157
/*    */     //   #44	-> 160
/*    */     //   #47	-> 163
/*    */     //   #22	-> 197
/*    */     //   #47	-> 214
/*    */     //   #44	-> 215
/*    */     //   #25	-> 223
/*    */     //   #26	-> 225
/*    */     //   #23	-> 227
/*    */     //   #28	-> 229
/*    */     //   #22	-> 234
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	42	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*    */     //   229	5	2	refreshing	Lai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response;
/*    */     //   101	90	3	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   114	77	4	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   123	68	5	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   135	56	7	this_$iv$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*    */     //   160	31	8	output$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   145	12	9	$this$cast$iv$iv$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   148	9	10	$i$f$cast	I
/*    */     //   135	23	8	$i$f$serializer	I
/*    */     //   163	37	9	$i$f$sendAndGet	I
/*    */     //   126	74	6	$i$f$sendAndGet	I
/*    */     //   50	184	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	177	11	$result	Ljava/lang/Object;
/*    */     //   206	9	9	$i$f$sendAndGet	I
/*    */     //   203	13	6	$i$f$sendAndGet	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   93	191	223	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*    */     //   206	220	223	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AuthAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "refresh", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AuthAPIClient$refresh$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AuthAPIClient$refresh$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AuthAPIClient.this.refresh((Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AuthAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "verify", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AuthAPIClient$verify$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AuthAPIClient$verify$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AuthAPIClient.this.verify((Continuation<? super Timestamp>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/AuthAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */