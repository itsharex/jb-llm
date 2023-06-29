/*    */ package ai.grazie.utils.http.sse;
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000F\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\032\031\020\002\032\0020\0032\006\020\004\032\0020\005H@ø\001\000¢\006\002\020\006\032\027\020\007\032\004\030\0010\b*\0020\tH@ø\001\000¢\006\002\020\n\032{\020\013\032\0020\003*\0020\f2\006\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0202$\b\002\020\022\032\036\b\001\022\004\022\0020\b\022\n\022\b\022\004\022\0020\0200\024\022\006\022\004\030\0010\0250\0232\"\020\026\032\036\b\001\022\004\022\0020\b\022\n\022\b\022\004\022\0020\0030\024\022\006\022\004\030\0010\0250\023H@ø\001\000¢\006\002\020\027\"\016\020\000\032\0020\001X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\030"}, d2 = {"logger", "Lai/grazie/utils/mpp/MPPLogger;", "handleExceptionResponse", "", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readEvent", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readSse", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "skipCommentEvent", "", "skipReconnect", "isEnd", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-ktor"})
/*    */ @SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nai/grazie/utils/http/sse/SSEKt\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,122:1\n29#2:123\n*S KotlinDebug\n*F\n+ 1 SSE.kt\nai/grazie/utils/http/sse/SSEKt\n*L\n50#1:123\n*E\n"})
/*    */ public final class SSEKt {
/*    */   @Nullable
/*    */   public static final Object readSse(@NotNull HttpClient $this$readSse, @NotNull HttpRequestBuilder request, boolean skipCommentEvent, boolean skipReconnect, @NotNull Function2 isEnd, @NotNull Function2 block, @NotNull Continuation<? super Unit> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: instanceof ai/grazie/utils/http/sse/SSEKt$readSse$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #6
/*    */     //   10: checkcast ai/grazie/utils/http/sse/SSEKt$readSse$1
/*    */     //   13: astore #13
/*    */     //   15: aload #13
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #13
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 52
/*    */     //   41: new ai/grazie/utils/http/sse/SSEKt$readSse$1
/*    */     //   44: dup
/*    */     //   45: aload #6
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #13
/*    */     //   52: aload #13
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #12
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #14
/*    */     //   64: aload #13
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 592, 0 -> 96, 1 -> 330, 2 -> 507
/*    */     //   96: aload #12
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: new kotlin/jvm/internal/Ref$LongRef
/*    */     //   104: dup
/*    */     //   105: invokespecial <init> : ()V
/*    */     //   108: astore #7
/*    */     //   110: aload #7
/*    */     //   112: ldc2_w 3000
/*    */     //   115: putfield element : J
/*    */     //   118: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   121: dup
/*    */     //   122: invokespecial <init> : ()V
/*    */     //   125: astore #8
/*    */     //   127: aload_1
/*    */     //   128: astore #9
/*    */     //   130: aload #9
/*    */     //   132: astore #10
/*    */     //   134: iconst_0
/*    */     //   135: istore #11
/*    */     //   137: aload #10
/*    */     //   139: checkcast io/ktor/http/HttpMessageBuilder
/*    */     //   142: getstatic io/ktor/http/ContentType$Text.INSTANCE : Lio/ktor/http/ContentType$Text;
/*    */     //   145: invokevirtual getEventStream : ()Lio/ktor/http/ContentType;
/*    */     //   148: invokestatic accept : (Lio/ktor/http/HttpMessageBuilder;Lio/ktor/http/ContentType;)V
/*    */     //   151: aload #10
/*    */     //   153: invokevirtual getHeaders : ()Lio/ktor/http/HeadersBuilder;
/*    */     //   156: getstatic io/ktor/http/HttpHeaders.INSTANCE : Lio/ktor/http/HttpHeaders;
/*    */     //   159: invokevirtual getCacheControl : ()Ljava/lang/String;
/*    */     //   162: ldc 'no-cache'
/*    */     //   164: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   167: nop
/*    */     //   168: nop
/*    */     //   169: aload_0
/*    */     //   170: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   173: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*    */     //   176: ifeq -> 588
/*    */     //   179: aload #8
/*    */     //   181: getfield element : Ljava/lang/Object;
/*    */     //   184: ifnull -> 204
/*    */     //   187: aload_1
/*    */     //   188: invokevirtual getHeaders : ()Lio/ktor/http/HeadersBuilder;
/*    */     //   191: ldc 'Last-Event-ID'
/*    */     //   193: aload #8
/*    */     //   195: getfield element : Ljava/lang/Object;
/*    */     //   198: checkcast java/lang/String
/*    */     //   201: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   204: aload_0
/*    */     //   205: astore #10
/*    */     //   207: iconst_0
/*    */     //   208: istore #11
/*    */     //   210: new io/ktor/client/statement/HttpStatement
/*    */     //   213: dup
/*    */     //   214: aload_1
/*    */     //   215: aload #10
/*    */     //   217: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*    */     //   220: new ai/grazie/utils/http/sse/SSEKt$readSse$ended$1
/*    */     //   223: dup
/*    */     //   224: aload_0
/*    */     //   225: aload #4
/*    */     //   227: iload_2
/*    */     //   228: ifeq -> 235
/*    */     //   231: iconst_1
/*    */     //   232: goto -> 236
/*    */     //   235: iconst_0
/*    */     //   236: aload #7
/*    */     //   238: iload_3
/*    */     //   239: ifeq -> 246
/*    */     //   242: iconst_1
/*    */     //   243: goto -> 247
/*    */     //   246: iconst_0
/*    */     //   247: aload #8
/*    */     //   249: aload #5
/*    */     //   251: aconst_null
/*    */     //   252: invokespecial <init> : (Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/internal/Ref$LongRef;ZLkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*    */     //   255: checkcast kotlin/jvm/functions/Function2
/*    */     //   258: aload #13
/*    */     //   260: aload #13
/*    */     //   262: aload_0
/*    */     //   263: putfield L$0 : Ljava/lang/Object;
/*    */     //   266: aload #13
/*    */     //   268: aload_1
/*    */     //   269: putfield L$1 : Ljava/lang/Object;
/*    */     //   272: aload #13
/*    */     //   274: aload #4
/*    */     //   276: putfield L$2 : Ljava/lang/Object;
/*    */     //   279: aload #13
/*    */     //   281: aload #5
/*    */     //   283: putfield L$3 : Ljava/lang/Object;
/*    */     //   286: aload #13
/*    */     //   288: aload #7
/*    */     //   290: putfield L$4 : Ljava/lang/Object;
/*    */     //   293: aload #13
/*    */     //   295: aload #8
/*    */     //   297: putfield L$5 : Ljava/lang/Object;
/*    */     //   300: aload #13
/*    */     //   302: iload_2
/*    */     //   303: putfield Z$0 : Z
/*    */     //   306: aload #13
/*    */     //   308: iload_3
/*    */     //   309: putfield Z$1 : Z
/*    */     //   312: aload #13
/*    */     //   314: iconst_1
/*    */     //   315: putfield label : I
/*    */     //   318: invokevirtual execute : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   321: dup
/*    */     //   322: aload #14
/*    */     //   324: if_acmpne -> 407
/*    */     //   327: aload #14
/*    */     //   329: areturn
/*    */     //   330: aload #13
/*    */     //   332: getfield Z$1 : Z
/*    */     //   335: istore_3
/*    */     //   336: aload #13
/*    */     //   338: getfield Z$0 : Z
/*    */     //   341: istore_2
/*    */     //   342: aload #13
/*    */     //   344: getfield L$5 : Ljava/lang/Object;
/*    */     //   347: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   350: astore #8
/*    */     //   352: aload #13
/*    */     //   354: getfield L$4 : Ljava/lang/Object;
/*    */     //   357: checkcast kotlin/jvm/internal/Ref$LongRef
/*    */     //   360: astore #7
/*    */     //   362: aload #13
/*    */     //   364: getfield L$3 : Ljava/lang/Object;
/*    */     //   367: checkcast kotlin/jvm/functions/Function2
/*    */     //   370: astore #5
/*    */     //   372: aload #13
/*    */     //   374: getfield L$2 : Ljava/lang/Object;
/*    */     //   377: checkcast kotlin/jvm/functions/Function2
/*    */     //   380: astore #4
/*    */     //   382: aload #13
/*    */     //   384: getfield L$1 : Ljava/lang/Object;
/*    */     //   387: checkcast io/ktor/client/request/HttpRequestBuilder
/*    */     //   390: astore_1
/*    */     //   391: aload #13
/*    */     //   393: getfield L$0 : Ljava/lang/Object;
/*    */     //   396: checkcast io/ktor/client/HttpClient
/*    */     //   399: astore_0
/*    */     //   400: aload #12
/*    */     //   402: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   405: aload #12
/*    */     //   407: checkcast java/lang/Boolean
/*    */     //   410: invokevirtual booleanValue : ()Z
/*    */     //   413: istore #9
/*    */     //   415: iload #9
/*    */     //   417: ifeq -> 423
/*    */     //   420: goto -> 588
/*    */     //   423: iload_3
/*    */     //   424: ifeq -> 430
/*    */     //   427: goto -> 588
/*    */     //   430: aload #7
/*    */     //   432: getfield element : J
/*    */     //   435: aload #13
/*    */     //   437: aload #13
/*    */     //   439: aload_0
/*    */     //   440: putfield L$0 : Ljava/lang/Object;
/*    */     //   443: aload #13
/*    */     //   445: aload_1
/*    */     //   446: putfield L$1 : Ljava/lang/Object;
/*    */     //   449: aload #13
/*    */     //   451: aload #4
/*    */     //   453: putfield L$2 : Ljava/lang/Object;
/*    */     //   456: aload #13
/*    */     //   458: aload #5
/*    */     //   460: putfield L$3 : Ljava/lang/Object;
/*    */     //   463: aload #13
/*    */     //   465: aload #7
/*    */     //   467: putfield L$4 : Ljava/lang/Object;
/*    */     //   470: aload #13
/*    */     //   472: aload #8
/*    */     //   474: putfield L$5 : Ljava/lang/Object;
/*    */     //   477: aload #13
/*    */     //   479: iload_2
/*    */     //   480: putfield Z$0 : Z
/*    */     //   483: aload #13
/*    */     //   485: iload_3
/*    */     //   486: putfield Z$1 : Z
/*    */     //   489: aload #13
/*    */     //   491: iconst_2
/*    */     //   492: putfield label : I
/*    */     //   495: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   498: dup
/*    */     //   499: aload #14
/*    */     //   501: if_acmpne -> 584
/*    */     //   504: aload #14
/*    */     //   506: areturn
/*    */     //   507: aload #13
/*    */     //   509: getfield Z$1 : Z
/*    */     //   512: istore_3
/*    */     //   513: aload #13
/*    */     //   515: getfield Z$0 : Z
/*    */     //   518: istore_2
/*    */     //   519: aload #13
/*    */     //   521: getfield L$5 : Ljava/lang/Object;
/*    */     //   524: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   527: astore #8
/*    */     //   529: aload #13
/*    */     //   531: getfield L$4 : Ljava/lang/Object;
/*    */     //   534: checkcast kotlin/jvm/internal/Ref$LongRef
/*    */     //   537: astore #7
/*    */     //   539: aload #13
/*    */     //   541: getfield L$3 : Ljava/lang/Object;
/*    */     //   544: checkcast kotlin/jvm/functions/Function2
/*    */     //   547: astore #5
/*    */     //   549: aload #13
/*    */     //   551: getfield L$2 : Ljava/lang/Object;
/*    */     //   554: checkcast kotlin/jvm/functions/Function2
/*    */     //   557: astore #4
/*    */     //   559: aload #13
/*    */     //   561: getfield L$1 : Ljava/lang/Object;
/*    */     //   564: checkcast io/ktor/client/request/HttpRequestBuilder
/*    */     //   567: astore_1
/*    */     //   568: aload #13
/*    */     //   570: getfield L$0 : Ljava/lang/Object;
/*    */     //   573: checkcast io/ktor/client/HttpClient
/*    */     //   576: astore_0
/*    */     //   577: aload #12
/*    */     //   579: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   582: aload #12
/*    */     //   584: pop
/*    */     //   585: goto -> 169
/*    */     //   588: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   591: areturn
/*    */     //   592: new java/lang/IllegalStateException
/*    */     //   595: dup
/*    */     //   596: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   598: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   601: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 62
/*    */     //   #38	-> 101
/*    */     //   #39	-> 118
/*    */     //   #41	-> 127
/*    */     //   #42	-> 137
/*    */     //   #43	-> 151
/*    */     //   #44	-> 167
/*    */     //   #41	-> 168
/*    */     //   #46	-> 169
/*    */     //   #47	-> 179
/*    */     //   #48	-> 187
/*    */     //   #50	-> 204
/*    */     //   #123	-> 210
/*    */     //   #50	-> 220
/*    */     //   #31	-> 327
/*    */     //   #50	-> 407
/*    */     //   #80	-> 415
/*    */     //   #81	-> 420
/*    */     //   #83	-> 423
/*    */     //   #84	-> 427
/*    */     //   #86	-> 430
/*    */     //   #31	-> 504
/*    */     //   #86	-> 584
/*    */     //   #89	-> 588
/*    */     //   #31	-> 592
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	67	0	$this$readSse	Lio/ktor/client/HttpClient;
/*    */     //   168	1	0	$this$readSse	Lio/ktor/client/HttpClient;
/*    */     //   169	51	0	$this$readSse	Lio/ktor/client/HttpClient;
/*    */     //   220	110	0	$this$readSse	Lio/ktor/client/HttpClient;
/*    */     //   400	107	0	$this$readSse	Lio/ktor/client/HttpClient;
/*    */     //   577	11	0	$this$readSse	Lio/ktor/client/HttpClient;
/*    */     //   101	67	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   168	1	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   169	51	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   220	110	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   391	116	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   568	20	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   101	67	2	skipCommentEvent	Z
/*    */     //   168	1	2	skipCommentEvent	Z
/*    */     //   169	51	2	skipCommentEvent	Z
/*    */     //   220	110	2	skipCommentEvent	Z
/*    */     //   342	165	2	skipCommentEvent	Z
/*    */     //   519	69	2	skipCommentEvent	Z
/*    */     //   101	67	3	skipReconnect	Z
/*    */     //   168	1	3	skipReconnect	Z
/*    */     //   169	51	3	skipReconnect	Z
/*    */     //   220	110	3	skipReconnect	Z
/*    */     //   336	171	3	skipReconnect	Z
/*    */     //   513	75	3	skipReconnect	Z
/*    */     //   101	67	4	isEnd	Lkotlin/jvm/functions/Function2;
/*    */     //   168	1	4	isEnd	Lkotlin/jvm/functions/Function2;
/*    */     //   169	51	4	isEnd	Lkotlin/jvm/functions/Function2;
/*    */     //   220	110	4	isEnd	Lkotlin/jvm/functions/Function2;
/*    */     //   382	125	4	isEnd	Lkotlin/jvm/functions/Function2;
/*    */     //   559	29	4	isEnd	Lkotlin/jvm/functions/Function2;
/*    */     //   101	67	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   168	1	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   169	51	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   220	110	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   372	135	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   549	39	5	block	Lkotlin/jvm/functions/Function2;
/*    */     //   110	58	7	reconnectDelay	Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   168	1	7	reconnectDelay	Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   169	51	7	reconnectDelay	Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   220	110	7	reconnectDelay	Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   362	145	7	reconnectDelay	Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   539	49	7	reconnectDelay	Lkotlin/jvm/internal/Ref$LongRef;
/*    */     //   127	41	8	lastEventId	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   168	1	8	lastEventId	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   169	51	8	lastEventId	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   220	110	8	lastEventId	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   352	155	8	lastEventId	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   529	59	8	lastEventId	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   415	5	9	ended	Z
/*    */     //   134	34	10	$this$readSse_u24lambda_u240	Lio/ktor/client/request/HttpRequestBuilder;
/*    */     //   207	13	10	$this$prepareRequest$iv	Lio/ktor/client/HttpClient;
/*    */     //   137	31	11	$i$a$-apply-SSEKt$readSse$3	I
/*    */     //   210	10	11	$i$f$prepareRequest	I
/*    */     //   52	540	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	533	12	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/* 16 */   private static final MPPLogger logger = LoggerFactory.INSTANCE.create("ai.grazie.utils.http.sse.SSE");
/*    */   @DebugMetadata(f = "SSE.kt", l = {97}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"response", "statusCode"}, m = "handleExceptionResponse", c = "ai.grazie.utils.http.sse.SSEKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SSEKt$handleExceptionResponse$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1; int label; SSEKt$handleExceptionResponse$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SSEKt.handleExceptionResponse(null, (Continuation)this); }
/*    */   } @DebugMetadata(f = "SSE.kt", l = {114}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$readEvent", "builder"}, m = "readEvent", c = "ai.grazie.utils.http.sse.SSEKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SSEKt$readEvent$1 extends ContinuationImpl {
/*    */     Object L$0; Object L$1; int label; SSEKt$readEvent$1(Continuation $completion) { super($completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SSEKt.readEvent(null, (Continuation)this); }
/*    */   } @DebugMetadata(f = "SSE.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.sse.SSEKt$readSse$2")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*    */   static final class SSEKt$readSse$2 extends SuspendLambda implements Function2<ServerSentEvent, Continuation<? super Boolean>, Object> { @Nullable
/* 35 */     public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(false); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     SSEKt$readSse$2(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SSEKt$readSse$2> $completion) {
/*    */       return (Continuation<Unit>)new SSEKt$readSse$2($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull ServerSentEvent p1, @Nullable Continuation<?> p2) {
/*    */       return ((SSEKt$readSse$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "SSE.kt", l = {50, 86}, i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1"}, n = {"$this$readSse", "request", "isEnd", "block", "reconnectDelay", "lastEventId", "skipCommentEvent", "skipReconnect", "$this$readSse", "request", "isEnd", "block", "reconnectDelay", "lastEventId", "skipCommentEvent", "skipReconnect"}, m = "readSse", c = "ai.grazie.utils.http.sse.SSEKt")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SSEKt$readSse$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     boolean Z$0;
/*    */     boolean Z$1;
/*    */     int label;
/*    */     
/*    */     SSEKt$readSse$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SSEKt.readSse(null, null, false, false, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SSE.kt", l = {51, 53, 55, 56, 76}, i = {0, 2, 3, 3, 4}, s = {"L$0", "L$0", "L$0", "L$1", "L$0"}, n = {"response", "channel", "channel", "event", "channel"}, m = "invokeSuspend", c = "ai.grazie.utils.http.sse.SSEKt$readSse$ended$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*    */   @SourceDebugExtension({"SMAP\nSSE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SSE.kt\nai/grazie/utils/http/sse/SSEKt$readSse$ended$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/*    */   static final class SSEKt$readSse$ended$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Boolean>, Object> {
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     SSEKt$readSse$ended$1(HttpClient $receiver, Function2<ServerSentEvent, Continuation<? super Boolean>, Object> $isEnd, boolean $skipCommentEvent, Ref.LongRef $reconnectDelay, boolean $skipReconnect, Ref.ObjectRef<String> $lastEventId, Function2<ServerSentEvent, Continuation<? super Unit>, Object> $block, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #10
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 536, 0 -> 48, 1 -> 87, 2 -> 128, 3 -> 191, 4 -> 256, 5 -> 514
/*    */       //   48: aload_1
/*    */       //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   52: aload_0
/*    */       //   53: getfield L$0 : Ljava/lang/Object;
/*    */       //   56: checkcast io/ktor/client/statement/HttpResponse
/*    */       //   59: astore_2
/*    */       //   60: aload_2
/*    */       //   61: aload_0
/*    */       //   62: checkcast kotlin/coroutines/Continuation
/*    */       //   65: aload_0
/*    */       //   66: aload_2
/*    */       //   67: putfield L$0 : Ljava/lang/Object;
/*    */       //   70: aload_0
/*    */       //   71: iconst_1
/*    */       //   72: putfield label : I
/*    */       //   75: invokestatic access$handleExceptionResponse : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   78: dup
/*    */       //   79: aload #10
/*    */       //   81: if_acmpne -> 100
/*    */       //   84: aload #10
/*    */       //   86: areturn
/*    */       //   87: aload_0
/*    */       //   88: getfield L$0 : Ljava/lang/Object;
/*    */       //   91: checkcast io/ktor/client/statement/HttpResponse
/*    */       //   94: astore_2
/*    */       //   95: aload_1
/*    */       //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   99: aload_1
/*    */       //   100: pop
/*    */       //   101: aload_2
/*    */       //   102: aload_0
/*    */       //   103: checkcast kotlin/coroutines/Continuation
/*    */       //   106: aload_0
/*    */       //   107: aconst_null
/*    */       //   108: putfield L$0 : Ljava/lang/Object;
/*    */       //   111: aload_0
/*    */       //   112: iconst_2
/*    */       //   113: putfield label : I
/*    */       //   116: invokestatic bodyAsChannel : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   119: dup
/*    */       //   120: aload #10
/*    */       //   122: if_acmpne -> 133
/*    */       //   125: aload #10
/*    */       //   127: areturn
/*    */       //   128: aload_1
/*    */       //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   132: aload_1
/*    */       //   133: checkcast io/ktor/utils/io/ByteReadChannel
/*    */       //   136: astore_3
/*    */       //   137: aload_0
/*    */       //   138: getfield $this_readSse : Lio/ktor/client/HttpClient;
/*    */       //   141: checkcast kotlinx/coroutines/CoroutineScope
/*    */       //   144: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*    */       //   147: ifeq -> 531
/*    */       //   150: aload_3
/*    */       //   151: invokeinterface isClosedForRead : ()Z
/*    */       //   156: ifne -> 531
/*    */       //   159: aload_3
/*    */       //   160: aload_0
/*    */       //   161: checkcast kotlin/coroutines/Continuation
/*    */       //   164: aload_0
/*    */       //   165: aload_3
/*    */       //   166: putfield L$0 : Ljava/lang/Object;
/*    */       //   169: aload_0
/*    */       //   170: aconst_null
/*    */       //   171: putfield L$1 : Ljava/lang/Object;
/*    */       //   174: aload_0
/*    */       //   175: iconst_3
/*    */       //   176: putfield label : I
/*    */       //   179: invokestatic access$readEvent : (Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   182: dup
/*    */       //   183: aload #10
/*    */       //   185: if_acmpne -> 204
/*    */       //   188: aload #10
/*    */       //   190: areturn
/*    */       //   191: aload_0
/*    */       //   192: getfield L$0 : Ljava/lang/Object;
/*    */       //   195: checkcast io/ktor/utils/io/ByteReadChannel
/*    */       //   198: astore_3
/*    */       //   199: aload_1
/*    */       //   200: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   203: aload_1
/*    */       //   204: checkcast ai/grazie/model/cloud/sse/ServerSentEvent
/*    */       //   207: dup
/*    */       //   208: ifnonnull -> 217
/*    */       //   211: pop
/*    */       //   212: iconst_0
/*    */       //   213: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */       //   216: areturn
/*    */       //   217: astore #4
/*    */       //   219: aload_0
/*    */       //   220: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*    */       //   223: aload #4
/*    */       //   225: aload_0
/*    */       //   226: aload_0
/*    */       //   227: aload_3
/*    */       //   228: putfield L$0 : Ljava/lang/Object;
/*    */       //   231: aload_0
/*    */       //   232: aload #4
/*    */       //   234: putfield L$1 : Ljava/lang/Object;
/*    */       //   237: aload_0
/*    */       //   238: iconst_4
/*    */       //   239: putfield label : I
/*    */       //   242: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   247: dup
/*    */       //   248: aload #10
/*    */       //   250: if_acmpne -> 278
/*    */       //   253: aload #10
/*    */       //   255: areturn
/*    */       //   256: aload_0
/*    */       //   257: getfield L$1 : Ljava/lang/Object;
/*    */       //   260: checkcast ai/grazie/model/cloud/sse/ServerSentEvent
/*    */       //   263: astore #4
/*    */       //   265: aload_0
/*    */       //   266: getfield L$0 : Ljava/lang/Object;
/*    */       //   269: checkcast io/ktor/utils/io/ByteReadChannel
/*    */       //   272: astore_3
/*    */       //   273: aload_1
/*    */       //   274: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   277: aload_1
/*    */       //   278: checkcast java/lang/Boolean
/*    */       //   281: invokevirtual booleanValue : ()Z
/*    */       //   284: ifeq -> 292
/*    */       //   287: iconst_1
/*    */       //   288: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */       //   291: areturn
/*    */       //   292: aload #4
/*    */       //   294: invokevirtual isEmpty : ()Z
/*    */       //   297: ifeq -> 324
/*    */       //   300: invokestatic access$getLogger$p : ()Lai/grazie/utils/mpp/MPPLogger;
/*    */       //   303: new ai/grazie/utils/http/sse/SSEKt$readSse$ended$1$1
/*    */       //   306: dup
/*    */       //   307: aload #4
/*    */       //   309: invokespecial <init> : (Lai/grazie/model/cloud/sse/ServerSentEvent;)V
/*    */       //   312: checkcast kotlin/jvm/functions/Function0
/*    */       //   315: aconst_null
/*    */       //   316: iconst_2
/*    */       //   317: aconst_null
/*    */       //   318: invokestatic warning$default : (Lai/grazie/utils/mpp/MPPLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ILjava/lang/Object;)V
/*    */       //   321: goto -> 137
/*    */       //   324: aload_0
/*    */       //   325: getfield $skipCommentEvent : Z
/*    */       //   328: ifeq -> 362
/*    */       //   331: aload #4
/*    */       //   333: invokevirtual isCommentEvent : ()Z
/*    */       //   336: ifeq -> 362
/*    */       //   339: invokestatic access$getLogger$p : ()Lai/grazie/utils/mpp/MPPLogger;
/*    */       //   342: new ai/grazie/utils/http/sse/SSEKt$readSse$ended$1$2
/*    */       //   345: dup
/*    */       //   346: aload #4
/*    */       //   348: invokespecial <init> : (Lai/grazie/model/cloud/sse/ServerSentEvent;)V
/*    */       //   351: checkcast kotlin/jvm/functions/Function0
/*    */       //   354: invokeinterface info : (Lkotlin/jvm/functions/Function0;)V
/*    */       //   359: goto -> 137
/*    */       //   362: aload #4
/*    */       //   364: invokevirtual getRetry : ()Ljava/lang/Long;
/*    */       //   367: ifnull -> 411
/*    */       //   370: aload_0
/*    */       //   371: getfield $reconnectDelay : Lkotlin/jvm/internal/Ref$LongRef;
/*    */       //   374: aload #4
/*    */       //   376: invokevirtual getRetry : ()Ljava/lang/Long;
/*    */       //   379: dup
/*    */       //   380: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */       //   383: invokevirtual longValue : ()J
/*    */       //   386: putfield element : J
/*    */       //   389: aload_0
/*    */       //   390: getfield $skipReconnect : Z
/*    */       //   393: ifeq -> 411
/*    */       //   396: invokestatic access$getLogger$p : ()Lai/grazie/utils/mpp/MPPLogger;
/*    */       //   399: getstatic ai/grazie/utils/http/sse/SSEKt$readSse$ended$1$3.INSTANCE : Lai/grazie/utils/http/sse/SSEKt$readSse$ended$1$3;
/*    */       //   402: checkcast kotlin/jvm/functions/Function0
/*    */       //   405: aconst_null
/*    */       //   406: iconst_2
/*    */       //   407: aconst_null
/*    */       //   408: invokestatic warning$default : (Lai/grazie/utils/mpp/MPPLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ILjava/lang/Object;)V
/*    */       //   411: aload #4
/*    */       //   413: invokevirtual getId : ()Ljava/lang/String;
/*    */       //   416: ifnull -> 478
/*    */       //   419: aload_0
/*    */       //   420: getfield $lastEventId : Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */       //   423: aload #4
/*    */       //   425: invokevirtual getId : ()Ljava/lang/String;
/*    */       //   428: dup
/*    */       //   429: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */       //   432: astore #5
/*    */       //   434: aload #5
/*    */       //   436: astore #6
/*    */       //   438: astore #8
/*    */       //   440: iconst_0
/*    */       //   441: istore #7
/*    */       //   443: aload #6
/*    */       //   445: checkcast java/lang/CharSequence
/*    */       //   448: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */       //   451: ifne -> 458
/*    */       //   454: iconst_1
/*    */       //   455: goto -> 459
/*    */       //   458: iconst_0
/*    */       //   459: nop
/*    */       //   460: istore #9
/*    */       //   462: aload #8
/*    */       //   464: iload #9
/*    */       //   466: ifeq -> 474
/*    */       //   469: aload #5
/*    */       //   471: goto -> 475
/*    */       //   474: aconst_null
/*    */       //   475: putfield element : Ljava/lang/Object;
/*    */       //   478: aload_0
/*    */       //   479: getfield $block : Lkotlin/jvm/functions/Function2;
/*    */       //   482: aload #4
/*    */       //   484: aload_0
/*    */       //   485: aload_0
/*    */       //   486: aload_3
/*    */       //   487: putfield L$0 : Ljava/lang/Object;
/*    */       //   490: aload_0
/*    */       //   491: aconst_null
/*    */       //   492: putfield L$1 : Ljava/lang/Object;
/*    */       //   495: aload_0
/*    */       //   496: iconst_5
/*    */       //   497: putfield label : I
/*    */       //   500: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   505: dup
/*    */       //   506: aload #10
/*    */       //   508: if_acmpne -> 527
/*    */       //   511: aload #10
/*    */       //   513: areturn
/*    */       //   514: aload_0
/*    */       //   515: getfield L$0 : Ljava/lang/Object;
/*    */       //   518: checkcast io/ktor/utils/io/ByteReadChannel
/*    */       //   521: astore_3
/*    */       //   522: aload_1
/*    */       //   523: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   526: aload_1
/*    */       //   527: pop
/*    */       //   528: goto -> 137
/*    */       //   531: iconst_0
/*    */       //   532: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */       //   535: areturn
/*    */       //   536: new java/lang/IllegalStateException
/*    */       //   539: dup
/*    */       //   540: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   542: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   545: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #50	-> 3
/*    */       //   #51	-> 60
/*    */       //   #50	-> 84
/*    */       //   #53	-> 100
/*    */       //   #50	-> 125
/*    */       //   #54	-> 137
/*    */       //   #55	-> 159
/*    */       //   #50	-> 188
/*    */       //   #55	-> 204
/*    */       //   #56	-> 219
/*    */       //   #50	-> 253
/*    */       //   #56	-> 278
/*    */       //   #57	-> 287
/*    */       //   #60	-> 292
/*    */       //   #61	-> 300
/*    */       //   #62	-> 321
/*    */       //   #64	-> 324
/*    */       //   #65	-> 339
/*    */       //   #66	-> 359
/*    */       //   #69	-> 362
/*    */       //   #70	-> 370
/*    */       //   #71	-> 389
/*    */       //   #74	-> 411
/*    */       //   #123	-> 438
/*    */       //   #74	-> 443
/*    */       //   #74	-> 459
/*    */       //   #74	-> 466
/*    */       //   #74	-> 475
/*    */       //   #76	-> 478
/*    */       //   #50	-> 511
/*    */       //   #76	-> 527
/*    */       //   #78	-> 531
/*    */       //   #50	-> 536
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   60	27	2	response	Lio/ktor/client/statement/HttpResponse;
/*    */       //   95	24	2	response	Lio/ktor/client/statement/HttpResponse;
/*    */       //   137	54	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   199	57	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   273	14	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   292	32	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   324	38	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   362	98	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   460	15	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   475	39	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   522	9	3	channel	Lio/ktor/utils/io/ByteReadChannel;
/*    */       //   219	37	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   265	22	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   292	29	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   324	35	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   362	98	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   460	15	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   475	30	4	event	Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */       //   438	20	6	it	Ljava/lang/String;
/*    */       //   443	17	7	$i$a$-takeIf-SSEKt$readSse$ended$1$4	I
/*    */       //   52	484	0	this	Lai/grazie/utils/http/sse/SSEKt$readSse$ended$1;
/*    */       //   52	484	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SSEKt$readSse$ended$1> $completion) {
/*    */       SSEKt$readSse$ended$1 sSEKt$readSse$ended$1 = new SSEKt$readSse$ended$1(this.$this_readSse, this.$isEnd, this.$skipCommentEvent, this.$reconnectDelay, this.$skipReconnect, this.$lastEventId, this.$block, $completion);
/*    */       sSEKt$readSse$ended$1.L$0 = value;
/*    */       return (Continuation<Unit>)sSEKt$readSse$ended$1;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull HttpResponse p1, @Nullable Continuation<?> p2) {
/*    */       return ((SSEKt$readSse$ended$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final Object handleExceptionResponse(HttpResponse response, Continuation<? super Unit> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/utils/http/sse/SSEKt$handleExceptionResponse$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/utils/http/sse/SSEKt$handleExceptionResponse$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 49
/*    */     //   39: new ai/grazie/utils/http/sse/SSEKt$handleExceptionResponse$1
/*    */     //   42: dup
/*    */     //   43: aload_1
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #7
/*    */     //   49: aload #7
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #6
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #8
/*    */     //   61: aload #7
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 338, 0 -> 88, 1 -> 146
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*    */     //   97: astore_2
/*    */     //   98: aload_2
/*    */     //   99: invokestatic isSuccess : (Lio/ktor/http/HttpStatusCode;)Z
/*    */     //   102: ifeq -> 109
/*    */     //   105: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   108: areturn
/*    */     //   109: nop
/*    */     //   110: aload_0
/*    */     //   111: aconst_null
/*    */     //   112: aload #7
/*    */     //   114: iconst_1
/*    */     //   115: aconst_null
/*    */     //   116: aload #7
/*    */     //   118: aload_0
/*    */     //   119: putfield L$0 : Ljava/lang/Object;
/*    */     //   122: aload #7
/*    */     //   124: aload_2
/*    */     //   125: putfield L$1 : Ljava/lang/Object;
/*    */     //   128: aload #7
/*    */     //   130: iconst_1
/*    */     //   131: putfield label : I
/*    */     //   134: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   137: dup
/*    */     //   138: aload #8
/*    */     //   140: if_acmpne -> 172
/*    */     //   143: aload #8
/*    */     //   145: areturn
/*    */     //   146: aload #7
/*    */     //   148: getfield L$1 : Ljava/lang/Object;
/*    */     //   151: checkcast io/ktor/http/HttpStatusCode
/*    */     //   154: astore_2
/*    */     //   155: aload #7
/*    */     //   157: getfield L$0 : Ljava/lang/Object;
/*    */     //   160: checkcast io/ktor/client/statement/HttpResponse
/*    */     //   163: astore_0
/*    */     //   164: nop
/*    */     //   165: aload #6
/*    */     //   167: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   170: aload #6
/*    */     //   172: checkcast java/lang/String
/*    */     //   175: astore #4
/*    */     //   177: goto -> 186
/*    */     //   180: astore #5
/*    */     //   182: ldc '<body failed decoding>'
/*    */     //   184: astore #4
/*    */     //   186: aload #4
/*    */     //   188: astore_3
/*    */     //   189: aload_2
/*    */     //   190: invokevirtual getValue : ()I
/*    */     //   193: istore #5
/*    */     //   195: sipush #300
/*    */     //   198: iload #5
/*    */     //   200: if_icmpgt -> 219
/*    */     //   203: iload #5
/*    */     //   205: sipush #400
/*    */     //   208: if_icmpge -> 215
/*    */     //   211: iconst_1
/*    */     //   212: goto -> 220
/*    */     //   215: iconst_0
/*    */     //   216: goto -> 220
/*    */     //   219: iconst_0
/*    */     //   220: ifeq -> 238
/*    */     //   223: new io/ktor/client/plugins/RedirectResponseException
/*    */     //   226: dup
/*    */     //   227: aload_0
/*    */     //   228: aload_3
/*    */     //   229: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V
/*    */     //   232: checkcast io/ktor/client/plugins/ResponseException
/*    */     //   235: goto -> 333
/*    */     //   238: sipush #400
/*    */     //   241: iload #5
/*    */     //   243: if_icmpgt -> 262
/*    */     //   246: iload #5
/*    */     //   248: sipush #500
/*    */     //   251: if_icmpge -> 258
/*    */     //   254: iconst_1
/*    */     //   255: goto -> 263
/*    */     //   258: iconst_0
/*    */     //   259: goto -> 263
/*    */     //   262: iconst_0
/*    */     //   263: ifeq -> 281
/*    */     //   266: new io/ktor/client/plugins/ClientRequestException
/*    */     //   269: dup
/*    */     //   270: aload_0
/*    */     //   271: aload_3
/*    */     //   272: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V
/*    */     //   275: checkcast io/ktor/client/plugins/ResponseException
/*    */     //   278: goto -> 333
/*    */     //   281: sipush #500
/*    */     //   284: iload #5
/*    */     //   286: if_icmpgt -> 305
/*    */     //   289: iload #5
/*    */     //   291: sipush #600
/*    */     //   294: if_icmpge -> 301
/*    */     //   297: iconst_1
/*    */     //   298: goto -> 306
/*    */     //   301: iconst_0
/*    */     //   302: goto -> 306
/*    */     //   305: iconst_0
/*    */     //   306: ifeq -> 324
/*    */     //   309: new io/ktor/client/plugins/ServerResponseException
/*    */     //   312: dup
/*    */     //   313: aload_0
/*    */     //   314: aload_3
/*    */     //   315: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V
/*    */     //   318: checkcast io/ktor/client/plugins/ResponseException
/*    */     //   321: goto -> 333
/*    */     //   324: new io/ktor/client/plugins/ResponseException
/*    */     //   327: dup
/*    */     //   328: aload_0
/*    */     //   329: aload_3
/*    */     //   330: invokespecial <init> : (Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V
/*    */     //   333: astore #4
/*    */     //   335: aload #4
/*    */     //   337: athrow
/*    */     //   338: new java/lang/IllegalStateException
/*    */     //   341: dup
/*    */     //   342: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   344: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   347: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #91	-> 59
/*    */     //   #92	-> 93
/*    */     //   #93	-> 98
/*    */     //   #94	-> 105
/*    */     //   #96	-> 109
/*    */     //   #97	-> 110
/*    */     //   #91	-> 143
/*    */     //   #97	-> 172
/*    */     //   #98	-> 180
/*    */     //   #99	-> 182
/*    */     //   #96	-> 186
/*    */     //   #101	-> 189
/*    */     //   #102	-> 195
/*    */     //   #103	-> 238
/*    */     //   #104	-> 281
/*    */     //   #105	-> 324
/*    */     //   #101	-> 333
/*    */     //   #108	-> 335
/*    */     //   #91	-> 338
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	53	0	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   164	74	0	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   238	43	0	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   281	43	0	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   324	9	0	response	Lio/ktor/client/statement/HttpResponse;
/*    */     //   98	48	2	statusCode	Lio/ktor/http/HttpStatusCode;
/*    */     //   155	40	2	statusCode	Lio/ktor/http/HttpStatusCode;
/*    */     //   189	49	3	exceptionResponseText	Ljava/lang/String;
/*    */     //   238	43	3	exceptionResponseText	Ljava/lang/String;
/*    */     //   281	43	3	exceptionResponseText	Ljava/lang/String;
/*    */     //   324	9	3	exceptionResponseText	Ljava/lang/String;
/*    */     //   335	3	4	exception	Lio/ktor/client/plugins/ResponseException;
/*    */     //   49	289	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	282	6	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   109	137	180	io/ktor/utils/io/charsets/MalformedInputException
/*    */     //   164	177	180	io/ktor/utils/io/charsets/MalformedInputException
/*    */   }
/*    */   
/*    */   private static final Object readEvent(ByteReadChannel $this$readEvent, Continuation<? super ServerSentEvent> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/utils/http/sse/SSEKt$readEvent$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/utils/http/sse/SSEKt$readEvent$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 49
/*    */     //   39: new ai/grazie/utils/http/sse/SSEKt$readEvent$1
/*    */     //   42: dup
/*    */     //   43: aload_1
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #5
/*    */     //   49: aload #5
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #4
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #6
/*    */     //   61: aload #5
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 202, 0 -> 88, 1 -> 146
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new ai/grazie/model/cloud/sse/ServerSentEvent$Builder
/*    */     //   96: dup
/*    */     //   97: aconst_null
/*    */     //   98: iconst_1
/*    */     //   99: aconst_null
/*    */     //   100: invokespecial <init> : ([Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   103: astore_2
/*    */     //   104: aload_0
/*    */     //   105: invokeinterface isClosedForRead : ()Z
/*    */     //   110: ifne -> 200
/*    */     //   113: aload_0
/*    */     //   114: aload #5
/*    */     //   116: aload #5
/*    */     //   118: aload_0
/*    */     //   119: putfield L$0 : Ljava/lang/Object;
/*    */     //   122: aload #5
/*    */     //   124: aload_2
/*    */     //   125: putfield L$1 : Ljava/lang/Object;
/*    */     //   128: aload #5
/*    */     //   130: iconst_1
/*    */     //   131: putfield label : I
/*    */     //   134: invokestatic readUTF8Line : (Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   137: dup
/*    */     //   138: aload #6
/*    */     //   140: if_acmpne -> 171
/*    */     //   143: aload #6
/*    */     //   145: areturn
/*    */     //   146: aload #5
/*    */     //   148: getfield L$1 : Ljava/lang/Object;
/*    */     //   151: checkcast ai/grazie/model/cloud/sse/ServerSentEvent$Builder
/*    */     //   154: astore_2
/*    */     //   155: aload #5
/*    */     //   157: getfield L$0 : Ljava/lang/Object;
/*    */     //   160: checkcast io/ktor/utils/io/ByteReadChannel
/*    */     //   163: astore_0
/*    */     //   164: aload #4
/*    */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   169: aload #4
/*    */     //   171: checkcast java/lang/String
/*    */     //   174: dup
/*    */     //   175: ifnonnull -> 182
/*    */     //   178: pop
/*    */     //   179: goto -> 104
/*    */     //   182: astore_3
/*    */     //   183: aload_2
/*    */     //   184: aload_3
/*    */     //   185: invokevirtual append : (Ljava/lang/String;)V
/*    */     //   188: aload_2
/*    */     //   189: invokevirtual isEntire : ()Z
/*    */     //   192: ifeq -> 104
/*    */     //   195: aload_2
/*    */     //   196: invokevirtual build : ()Lai/grazie/model/cloud/sse/ServerSentEvent;
/*    */     //   199: areturn
/*    */     //   200: aconst_null
/*    */     //   201: areturn
/*    */     //   202: new java/lang/IllegalStateException
/*    */     //   205: dup
/*    */     //   206: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   208: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   211: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #111	-> 59
/*    */     //   #112	-> 93
/*    */     //   #113	-> 104
/*    */     //   #114	-> 113
/*    */     //   #111	-> 143
/*    */     //   #114	-> 171
/*    */     //   #115	-> 183
/*    */     //   #117	-> 188
/*    */     //   #119	-> 200
/*    */     //   #111	-> 202
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	53	0	$this$readEvent	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   164	38	0	$this$readEvent	Lio/ktor/utils/io/ByteReadChannel;
/*    */     //   104	42	2	builder	Lai/grazie/model/cloud/sse/ServerSentEvent$Builder;
/*    */     //   155	47	2	builder	Lai/grazie/model/cloud/sse/ServerSentEvent$Builder;
/*    */     //   183	17	3	line	Ljava/lang/String;
/*    */     //   49	153	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	146	4	$result	Ljava/lang/Object;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/sse/SSEKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */