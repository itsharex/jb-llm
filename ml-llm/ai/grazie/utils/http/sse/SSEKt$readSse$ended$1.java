/*    */ package ai.grazie.utils.http.sse;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import io.ktor.client.HttpClient;
/*    */ import io.ktor.client.statement.HttpResponse;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "SSE.kt", l = {51, 53, 55, 56, 76}, i = {0, 2, 3, 3, 4}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"}, n = {"response", "channel", "channel", "event", "channel"}, m = "invokeSuspend", c = "ai.grazie.utils.http.sse.SSEKt$readSse$ended$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*    */ @SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nai/grazie/utils/http/sse/SSEKt$readSse$ended$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/*    */ final class SSEKt$readSse$ended$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Boolean>, Object> {
/*    */   Object L$1;
/*    */   int label;
/*    */   
/*    */   SSEKt$readSse$ended$1(HttpClient $receiver, Function2<ServerSentEvent, Continuation<? super Boolean>, Object> $isEnd, boolean $skipCommentEvent, Ref.LongRef $reconnectDelay, boolean $skipReconnect, Ref.ObjectRef<String> $lastEventId, Function2<ServerSentEvent, Continuation<? super Unit>, Object> $block, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #10
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 536, 0 -> 48, 1 -> 87, 2 -> 128, 3 -> 191, 4 -> 256, 5 -> 514
/*    */     //   48: aload_1
/*    */     //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   52: aload_0
/*    */     //   53: getfield L$0 : Ljava/lang/Object;
/*    */     //   56: checkcast io/ktor/client/statement/HttpResponse
/*    */     //   59: astore_2
/*    */     //   60: aload_2
/*    */     //   61: aload_0
/*    */     //   62: checkcast kotlin/coroutines/Continuation
/*    */     //   65: aload_0
/*    */     //   66: aload_2
/*    */     //   67: putfield L$0 : Ljava/lang/Object;
/*    */     //   70: aload_0
/*    */     //   71: iconst_1
/*    */     //   72: putfield label : I
/*    */     //   75: invokestatic access$handleExceptionResponse : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   78: dup
/*    */     //   79: aload #10
/*    */     //   81: if_acmpne -> 100
/*    */     //   84: aload #10
/*    */     //   86: areturn
/*    */     //   87: aload_0
/*    */     //   88: getfield L$0 : Ljava/lang/Object;
/*    */     //   91: checkcast io/ktor/client/statement/HttpResponse
/*    */     //   94: astore_2
/*    */     //   95: aload_1
/*    */     //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   99: aload_1
/*    */     //   100: pop
/*    */     //   101: aload_2
/*    */     //   102: aload_0
/*    */     //   103: checkcast kotlin/coroutines/Continuation
/*    */     //   106: aload_0
/*    */     //   107: aconst_null
/*    */     //   108: putfield L$0 : Ljava/lang/Object;
/*    */     //   111: aload_0
/*    */     //   112: iconst_2
/*    */     //   113: putfield label : I
/*    */     //   116: invokestatic bodyAsChannel : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   119: dup
/*    */     //   120: aload #10
/*    */     //   122: if_acmpne -> 133
/*    */     //   125: aload #10
/*    */     //   127: areturn
/*    */     //   128: aload_1
/*    */     //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   132: aload_1
/*    */     //   133: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   136: astore_3
/*    */     //   137: aload_0
/*    */     //   138: getfield $this_readSse : Lio/ktor/client/HttpClient;
/*    */     //   141: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   144: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*    */     //   147: ifeq -> 531
/*    */     //   150: aload_3
/*    */     //   151: invokeinterface isClosedForRead : ()Z
/*    */     //   156: ifne -> 531
/*    */     //   159: aload_3
/*    */     //   160: aload_0
/*    */     //   161: checkcast kotlin/coroutines/Continuation
/*    */     //   164: aload_0
/*    */     //   165: aload_3
/*    */     //   166: putfield L$0 : Ljava/lang/Object;
/*    */     //   169: aload_0
/*    */     //   170: aconst_null
/*    */     //   171: putfield L$1 : Ljava/lang/Object;
/*    */     //   174: aload_0
/*    */     //   175: iconst_3
/*    */     //   176: putfield label : I
/*    */     //   179: invokestatic access$readEvent : (Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   182: dup
/*    */     //   183: aload #10
/*    */     //   185: if_acmpne -> 204
/*    */     //   188: aload #10
/*    */     //   190: areturn
/*    */     //   191: aload_0
/*    */     //   192: getfield L$0 : Ljava/lang/Object;
/*    */     //   195: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   198: astore_3
/*    */     //   199: aload_1
/*    */     //   200: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   203: aload_1
/*    */     //   204: checkcast ai/grazie/model/cloud/sse/ServerSentEvent
/*    */     //   207: dup
/*    */     //   208: ifnonnull -> 217
/*    */     //   211: pop
/*    */     //   212: iconst_0
/*    */     //   213: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   216: areturn
/*    */     //   217: astore #4
/*    */     //   219: aload_0
/*    */     //   220: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*    */     //   223: aload #4
/*    */     //   225: aload_0
/*    */     //   226: aload_0
/*    */     //   227: aload_3
/*    */     //   228: putfield L$0 : Ljava/lang/Object;
/*    */     //   231: aload_0
/*    */     //   232: aload #4
/*    */     //   234: putfield L$1 : Ljava/lang/Object;
/*    */     //   237: aload_0
/*    */     //   238: iconst_4
/*    */     //   239: putfield label : I
/*    */     //   242: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   247: dup
/*    */     //   248: aload #10
/*    */     //   250: if_acmpne -> 278
/*    */     //   253: aload #10
/*    */     //   255: areturn
/*    */     //   256: aload_0
/*    */     //   257: getfield L$1 : Ljava/lang/Object;
/*    */     //   260: checkcast ai/grazie/model/cloud/sse/ServerSentEvent
/*    */     //   263: astore #4
/*    */     //   265: aload_0
/*    */     //   266: getfield L$0 : Ljava/lang/Object;
/*    */     //   269: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   272: astore_3
/*    */     //   273: aload_1
/*    */     //   274: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   277: aload_1
/*    */     //   278: checkcast java/lang/Boolean
/*    */     //   281: invokevirtual booleanValue : ()Z
/*    */     //   284: ifeq -> 292
/*    */     //   287: iconst_1
/*    */     //   288: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   291: areturn
/*    */     //   292: aload #4
/*    */     //   294: invokevirtual isEmpty : ()Z
/*    */     //   297: ifeq -> 324
/*    */     //   300: invokestatic access$getLogger$p : ()Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   303: new ai/grazie/utils/http/sse/SSEKt$readSse$ended$1$1
/*    */     //   306: dup
/*    */     //   307: aload #4
/*    */     //   309: invokespecial <init> : (Lai/grazie/model/cloud/sse/ServerSentEvent;)V
/*    */     //   312: checkcast kotlin/jvm/functions/Function0
/*    */     //   315: aconst_null
/*    */     //   316: iconst_2
/*    */     //   317: aconst_null
/*    */     //   318: invokestatic warning$default : (Lai/grazie/utils/mpp/MPPLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ILjava/lang/Object;)V
/*    */     //   321: goto -> 137
/*    */     //   324: aload_0
/*    */     //   325: getfield $skipCommentEvent : Z
/*    */     //   328: ifeq -> 362
/*    */     //   331: aload #4
/*    */     //   333: invokevirtual isCommentEvent : ()Z
/*    */     //   336: ifeq -> 362
/*    */     //   339: invokestatic access$getLogger$p : ()Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   342: new ai/grazie/utils/http/sse/SSEKt$readSse$ended$1$2
/*    */     //   345: dup
/*    */     //   346: aload #4
/*    */     //   348: invokespecial <init> : (Lai/grazie/model/cloud/sse/ServerSentEvent;)V
/*    */     //   351: checkcast kotlin/jvm/functions/Function0
/*    */     //   354: invokeinterface info : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   359: goto -> 137
/*    */     //   362: aload #4
/*    */     //   364: invokevirtual getRetry : ()Ljava/lang/Long;
/*    */     //   367: ifnull -> 411
/*    */     //   370: aload_0
/*    */     //   371: getfield $reconnectDelay : Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   374: aload #4
/*    */     //   376: invokevirtual getRetry : ()Ljava/lang/Long;
/*    */     //   379: dup
/*    */     //   380: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   383: invokevirtual longValue : ()J
/*    */     //   386: putfield element : J
/*    */     //   389: aload_0
/*    */     //   390: getfield $skipReconnect : Z
/*    */     //   393: ifeq -> 411
/*    */     //   396: invokestatic access$getLogger$p : ()Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   399: getstatic ai/grazie/utils/http/sse/SSEKt$readSse$ended$1$3.INSTANCE : Lai/grazie/utils/http/sse/SSEKt$readSse$ended$1$3;
/*    */     //   402: checkcast kotlin/jvm/functions/Function0
/*    */     //   405: aconst_null
/*    */     //   406: iconst_2
/*    */     //   407: aconst_null
/*    */     //   408: invokestatic warning$default : (Lai/grazie/utils/mpp/MPPLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ILjava/lang/Object;)V
/*    */     //   411: aload #4
/*    */     //   413: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   416: ifnull -> 478
/*    */     //   419: aload_0
/*    */     //   420: getfield $lastEventId : Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   423: aload #4
/*    */     //   425: invokevirtual getId : ()Ljava/lang/String;
/*    */     //   428: dup
/*    */     //   429: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   432: astore #5
/*    */     //   434: aload #5
/*    */     //   436: astore #6
/*    */     //   438: astore #8
/*    */     //   440: iconst_0
/*    */     //   441: istore #7
/*    */     //   443: aload #6
/*    */     //   445: checkcast java/lang/CharSequence
/*    */     //   448: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   451: ifne -> 458
/*    */     //   454: iconst_1
/*    */     //   455: goto -> 459
/*    */     //   458: iconst_0
/*    */     //   459: nop
/*    */     //   460: istore #9
/*    */     //   462: aload #8
/*    */     //   464: iload #9
/*    */     //   466: ifeq -> 474
/*    */     //   469: aload #5
/*    */     //   471: goto -> 475
/*    */     //   474: aconst_null
/*    */     //   475: putfield element : Ljava/lang/Object;
/*    */     //   478: aload_0
/*    */     //   479: getfield $block : Lkotlin/jvm/functions/Function2;
/*    */     //   482: aload #4
/*    */     //   484: aload_0
/*    */     //   485: aload_0
/*    */     //   486: aload_3
/*    */     //   487: putfield L$0 : Ljava/lang/Object;
/*    */     //   490: aload_0
/*    */     //   491: aconst_null
/*    */     //   492: putfield L$1 : Ljava/lang/Object;
/*    */     //   495: aload_0
/*    */     //   496: iconst_5
/*    */     //   497: putfield label : I
/*    */     //   500: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   505: dup
/*    */     //   506: aload #10
/*    */     //   508: if_acmpne -> 527
/*    */     //   511: aload #10
/*    */     //   513: areturn
/*    */     //   514: aload_0
/*    */     //   515: getfield L$0 : Ljava/lang/Object;
/*    */     //   518: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   521: astore_3
/*    */     //   522: aload_1
/*    */     //   523: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   526: aload_1
/*    */     //   527: pop
/*    */     //   528: goto -> 137
/*    */     //   531: iconst_0
/*    */     //   532: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   535: areturn
/*    */     //   536: new java/lang/IllegalStateException
/*    */     //   539: dup
/*    */     //   540: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   542: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   545: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 3
/*    */     //   #51	-> 60
/*    */     //   #50	-> 84
/*    */     //   #53	-> 100
/*    */     //   #50	-> 125
/*    */     //   #54	-> 137
/*    */     //   #55	-> 159
/*    */     //   #50	-> 188
/*    */     //   #55	-> 204
/*    */     //   #56	-> 219
/*    */     //   #50	-> 253
/*    */     //   #56	-> 278
/*    */     //   #57	-> 287
/*    */     //   #60	-> 292
/*    */     //   #61	-> 300
/*    */     //   #62	-> 321
/*    */     //   #64	-> 324
/*    */     //   #65	-> 339
/*    */     //   #66	-> 359
/*    */     //   #69	-> 362
/*    */     //   #70	-> 370
/*    */     //   #71	-> 389
/*    */     //   #74	-> 411
/*    */     //   #123	-> 438
/*    */     //   #74	-> 443
/*    */     //   #74	-> 459
/*    */     //   #74	-> 466
/*    */     //   #74	-> 475
/*    */     //   #76	-> 478
/*    */     //   #50	-> 511
/*    */     //   #76	-> 527
/*    */     //   #78	-> 531
/*    */     //   #50	-> 536
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   60	27	2	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   95	24	2	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   137	54	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   199	57	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   273	14	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   292	32	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   324	38	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   362	98	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   460	15	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   475	39	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   522	9	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   219	37	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   265	22	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   292	29	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   324	35	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   362	98	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   460	15	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   475	30	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   438	20	6	it	Ljava/lang/String;
/*    */     //   443	17	7	$i$a$-takeIf-SSEKt$readSse$ended$1$4	I
/*    */     //   52	484	0	this	Lai/grazie/utils/http/sse/SSEKt$readSse$ended$1;
/*    */     //   52	484	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SSEKt$readSse$ended$1> $completion) {
/*    */     SSEKt$readSse$ended$1 sSEKt$readSse$ended$1 = new SSEKt$readSse$ended$1(this.$this_readSse, this.$isEnd, this.$skipCommentEvent, this.$reconnectDelay, this.$skipReconnect, this.$lastEventId, this.$block, $completion);
/*    */     sSEKt$readSse$ended$1.L$0 = value;
/*    */     return (Continuation<Unit>)sSEKt$readSse$ended$1;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull HttpResponse p1, @Nullable Continuation<?> p2) {
/*    */     return ((SSEKt$readSse$ended$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/sse/SSEKt$readSse$ended$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */