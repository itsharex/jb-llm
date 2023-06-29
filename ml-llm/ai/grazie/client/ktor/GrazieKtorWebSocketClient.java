/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import ai.grazie.client.common.websocket.SuspendableWebSocketClient;
/*    */ import io.ktor.websocket.Frame;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\030\000 \0212\0020\001:\001\021B\r\022\006\020\002\032\0020\003¢\006\002\020\004JE\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\"\020\013\032\036\b\001\022\004\022\0020\r\022\n\022\b\022\004\022\0020\0060\016\022\006\022\004\030\0010\0170\fH@ø\001\000¢\006\002\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\022"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorWebSocketClient;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "webSocketClient", "Lai/grazie/utils/http/KtorWebSocketClient;", "(Lai/grazie/utils/http/KtorWebSocketClient;)V", "connect", "", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "body", "Lkotlin/Function2;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Session;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "client-ktor"})
/*    */ public final class GrazieKtorWebSocketClient implements SuspendableWebSocketClient {
/* 14 */   public GrazieKtorWebSocketClient(@NotNull KtorWebSocketClient webSocketClient) { this.webSocketClient = webSocketClient; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorWebSocketClient$Companion;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorWebSocketClient;", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorWebSocketClient;", "WithExtendedTimeout", "getWithExtendedTimeout", "client-ktor"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 16 */     public final GrazieKtorWebSocketClient getDefault() { return GrazieKtorWebSocketClient.Default; } @NotNull
/* 17 */     public final GrazieKtorWebSocketClient getWithExtendedTimeout() { return GrazieKtorWebSocketClient.WithExtendedTimeout; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final KtorWebSocketClient webSocketClient; @NotNull private static final GrazieKtorWebSocketClient Default = new GrazieKtorWebSocketClient((KtorWebSocketClient)KtorWebSocketClient.Default.INSTANCE); @NotNull private static final GrazieKtorWebSocketClient WithExtendedTimeout = new GrazieKtorWebSocketClient((KtorWebSocketClient)KtorWebSocketClient.WithExtendedTimeout.INSTANCE);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object connect(@NotNull String url, @NotNull RequestOptions options, @NotNull Function2<? super SuspendableWebSocketClient.Session, ? super Continuation<? super Unit>, ? extends Object> body, @NotNull Continuation $completion)
/*    */   {
/* 26 */     if (this.webSocketClient.connect(url, HeaderCollectionKt.toMap(options.getHeaders()), new GrazieKtorWebSocketClient$connect$2(body, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.webSocketClient.connect(url, HeaderCollectionKt.toMap(options.getHeaders()), new GrazieKtorWebSocketClient$connect$2(body, null), $completion);  this.webSocketClient.connect(url, HeaderCollectionKt.toMap(options.getHeaders()), new GrazieKtorWebSocketClient$connect$2(body, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "GrazieKtorWebSocketClient.kt", l = {57}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorWebSocketClient$connect$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000(\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\020\000\032\0020\001*\0020\0022\f\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0050\0072\034\020\b\032\030\b\001\022\n\022\b\022\004\022\0020\0010\n\022\006\022\004\030\0010\0130\tH@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lio/ktor/websocket/Frame;", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "close", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", ""}) static final class GrazieKtorWebSocketClient$connect$2 extends SuspendLambda implements Function5<CoroutineScope, ReceiveChannel<? extends Frame>, SendChannel<? super Frame>, Function1<? super Continuation<? super Unit>, ? extends Object>, Continuation<? super Unit>, Object> { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { CoroutineScope $this$connect; ReceiveChannel<? extends Frame> incoming; SendChannel<? super Frame> outgoing; Function1<? super Continuation<? super Unit>, ? extends Object> close; ReceiveChannel incomingTransformed; Channel<SuspendableWebSocketClient.Frame> outgoingTransformed; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$connect = (CoroutineScope)this.L$0; incoming = (ReceiveChannel)this.L$1; outgoing = (SendChannel)this.L$2; close = (Function1)this.L$3;
/* 27 */           incomingTransformed = ProduceKt.produce$default($this$connect, null, 0, new GrazieKtorWebSocketClient$connect$2$incomingTransformed$1(incoming, null), 3, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 42 */           outgoingTransformed = ChannelKt.Channel$default(0, null, null, 7, null);
/* 43 */           BuildersKt.launch$default($this$connect, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(outgoingTransformed, outgoing, null) { Object L$0; int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                   //   3: astore #5
/*    */                   //   5: aload_0
/*    */                   //   6: getfield label : I
/*    */                   //   9: tableswitch default -> 340, 0 -> 44, 1 -> 88, 2 -> 176, 3 -> 248, 4 -> 313
/*    */                   //   44: aload_1
/*    */                   //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   48: nop
/*    */                   //   49: aload_0
/*    */                   //   50: getfield $outgoingTransformed : Lkotlinx/coroutines/channels/Channel;
/*    */                   //   53: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*    */                   //   58: astore_2
/*    */                   //   59: aload_2
/*    */                   //   60: aload_0
/*    */                   //   61: checkcast kotlin/coroutines/Continuation
/*    */                   //   64: aload_0
/*    */                   //   65: aload_2
/*    */                   //   66: putfield L$0 : Ljava/lang/Object;
/*    */                   //   69: aload_0
/*    */                   //   70: iconst_1
/*    */                   //   71: putfield label : I
/*    */                   //   74: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                   //   79: dup
/*    */                   //   80: aload #5
/*    */                   //   82: if_acmpne -> 102
/*    */                   //   85: aload #5
/*    */                   //   87: areturn
/*    */                   //   88: aload_0
/*    */                   //   89: getfield L$0 : Ljava/lang/Object;
/*    */                   //   92: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */                   //   95: astore_2
/*    */                   //   96: nop
/*    */                   //   97: aload_1
/*    */                   //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   101: aload_1
/*    */                   //   102: checkcast java/lang/Boolean
/*    */                   //   105: invokevirtual booleanValue : ()Z
/*    */                   //   108: ifeq -> 336
/*    */                   //   111: aload_2
/*    */                   //   112: invokeinterface next : ()Ljava/lang/Object;
/*    */                   //   117: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame
/*    */                   //   120: astore_3
/*    */                   //   121: aload_3
/*    */                   //   122: astore #4
/*    */                   //   124: aload #4
/*    */                   //   126: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Binary
/*    */                   //   129: ifeq -> 194
/*    */                   //   132: aload_0
/*    */                   //   133: getfield $outgoing : Lkotlinx/coroutines/channels/SendChannel;
/*    */                   //   136: new io/ktor/websocket/Frame$Binary
/*    */                   //   139: dup
/*    */                   //   140: iconst_1
/*    */                   //   141: aload_3
/*    */                   //   142: invokevirtual getData : ()[B
/*    */                   //   145: invokespecial <init> : (Z[B)V
/*    */                   //   148: aload_0
/*    */                   //   149: checkcast kotlin/coroutines/Continuation
/*    */                   //   152: aload_0
/*    */                   //   153: aload_2
/*    */                   //   154: putfield L$0 : Ljava/lang/Object;
/*    */                   //   157: aload_0
/*    */                   //   158: iconst_2
/*    */                   //   159: putfield label : I
/*    */                   //   162: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                   //   167: dup
/*    */                   //   168: aload #5
/*    */                   //   170: if_acmpne -> 190
/*    */                   //   173: aload #5
/*    */                   //   175: areturn
/*    */                   //   176: aload_0
/*    */                   //   177: getfield L$0 : Ljava/lang/Object;
/*    */                   //   180: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */                   //   183: astore_2
/*    */                   //   184: nop
/*    */                   //   185: aload_1
/*    */                   //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   189: aload_1
/*    */                   //   190: pop
/*    */                   //   191: goto -> 59
/*    */                   //   194: aload #4
/*    */                   //   196: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
/*    */                   //   199: ifeq -> 266
/*    */                   //   202: aload_0
/*    */                   //   203: getfield $outgoing : Lkotlinx/coroutines/channels/SendChannel;
/*    */                   //   206: new io/ktor/websocket/Frame$Text
/*    */                   //   209: dup
/*    */                   //   210: aload_3
/*    */                   //   211: checkcast ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
/*    */                   //   214: invokevirtual getText : ()Ljava/lang/String;
/*    */                   //   217: invokespecial <init> : (Ljava/lang/String;)V
/*    */                   //   220: aload_0
/*    */                   //   221: checkcast kotlin/coroutines/Continuation
/*    */                   //   224: aload_0
/*    */                   //   225: aload_2
/*    */                   //   226: putfield L$0 : Ljava/lang/Object;
/*    */                   //   229: aload_0
/*    */                   //   230: iconst_3
/*    */                   //   231: putfield label : I
/*    */                   //   234: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                   //   239: dup
/*    */                   //   240: aload #5
/*    */                   //   242: if_acmpne -> 262
/*    */                   //   245: aload #5
/*    */                   //   247: areturn
/*    */                   //   248: aload_0
/*    */                   //   249: getfield L$0 : Ljava/lang/Object;
/*    */                   //   252: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */                   //   255: astore_2
/*    */                   //   256: nop
/*    */                   //   257: aload_1
/*    */                   //   258: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   261: aload_1
/*    */                   //   262: pop
/*    */                   //   263: goto -> 59
/*    */                   //   266: aload #4
/*    */                   //   268: instanceof ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Close
/*    */                   //   271: ifeq -> 59
/*    */                   //   274: aload_0
/*    */                   //   275: getfield $outgoing : Lkotlinx/coroutines/channels/SendChannel;
/*    */                   //   278: new io/ktor/websocket/Frame$Close
/*    */                   //   281: dup
/*    */                   //   282: invokespecial <init> : ()V
/*    */                   //   285: aload_0
/*    */                   //   286: checkcast kotlin/coroutines/Continuation
/*    */                   //   289: aload_0
/*    */                   //   290: aload_2
/*    */                   //   291: putfield L$0 : Ljava/lang/Object;
/*    */                   //   294: aload_0
/*    */                   //   295: iconst_4
/*    */                   //   296: putfield label : I
/*    */                   //   299: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                   //   304: dup
/*    */                   //   305: aload #5
/*    */                   //   307: if_acmpne -> 327
/*    */                   //   310: aload #5
/*    */                   //   312: areturn
/*    */                   //   313: aload_0
/*    */                   //   314: getfield L$0 : Ljava/lang/Object;
/*    */                   //   317: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */                   //   320: astore_2
/*    */                   //   321: nop
/*    */                   //   322: aload_1
/*    */                   //   323: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                   //   326: aload_1
/*    */                   //   327: pop
/*    */                   //   328: goto -> 59
/*    */                   //   331: astore_2
/*    */                   //   332: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                   //   335: areturn
/*    */                   //   336: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                   //   339: areturn
/*    */                   //   340: new java/lang/IllegalStateException
/*    */                   //   343: dup
/*    */                   //   344: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                   //   346: invokespecial <init> : (Ljava/lang/String;)V
/*    */                   //   349: athrow
/*    */                   // Line number table:
/*    */                   //   Java source line number -> byte code offset
/*    */                   //   #43	-> 3
/*    */                   //   #44	-> 48
/*    */                   //   #45	-> 49
/*    */                   //   #43	-> 85
/*    */                   //   #45	-> 102
/*    */                   //   #46	-> 121
/*    */                   //   #47	-> 124
/*    */                   //   #43	-> 173
/*    */                   //   #47	-> 190
/*    */                   //   #48	-> 194
/*    */                   //   #43	-> 245
/*    */                   //   #48	-> 262
/*    */                   //   #49	-> 266
/*    */                   //   #43	-> 310
/*    */                   //   #49	-> 327
/*    */                   //   #52	-> 331
/*    */                   //   #53	-> 332
/*    */                   //   #55	-> 336
/*    */                   //   #43	-> 340
/*    */                   // Local variable table:
/*    */                   //   start	length	slot	name	descriptor
/*    */                   //   121	46	3	value	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;
/*    */                   //   194	45	3	value	Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;
/*    */                   //   48	292	0	this	Lai/grazie/client/ktor/GrazieKtorWebSocketClient$connect$2$1;
/*    */                   //   48	292	1	$result	Ljava/lang/Object;
/*    */                   // Exception table:
/*    */                   //   from	to	target	type
/*    */                   //   48	79	331	java/io/EOFException
/*    */                   //   96	167	331	java/io/EOFException
/*    */                   //   184	239	331	java/io/EOFException
/*    */                   //   256	304	331	java/io/EOFException
/* 43 */                   //   321	331	331	java/io/EOFException } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$outgoingTransformed, this.$outgoing, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 57 */           this.L$0 = null; this.L$1 = null; this.L$2 = null; this.label = 1; if (this.$body.invoke(new SuspendableWebSocketClient.Session(incomingTransformed, (SendChannel)outgoingTransformed, new Function1<Continuation<? super Unit>, Object>(close, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$close.invoke(this) == object) return object;  this.$close.invoke(this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$close, $completion); } @Nullable public final Object invoke(@Nullable Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }), this) == object) return object;  this.$body.invoke(new SuspendableWebSocketClient.Session(incomingTransformed, (SendChannel)outgoingTransformed, new Function1<Continuation<? super Unit>, Object>(close, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$close.invoke(this) == object) return object;  this.$close.invoke(this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$close, $completion); } @Nullable public final Object invoke(@Nullable Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }), this);
/*    */           
/* 59 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     GrazieKtorWebSocketClient$connect$2(Function2<SuspendableWebSocketClient.Session, Continuation<? super Unit>, Object> $body, Continuation $completion) {
/*    */       super(5, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @NotNull ReceiveChannel p2, @NotNull SendChannel p3, @NotNull Function1 p4, @Nullable Continuation<? super GrazieKtorWebSocketClient$connect$2> p5) {
/*    */       GrazieKtorWebSocketClient$connect$2 grazieKtorWebSocketClient$connect$2 = new GrazieKtorWebSocketClient$connect$2(this.$body, p5);
/*    */       grazieKtorWebSocketClient$connect$2.L$0 = p1;
/*    */       grazieKtorWebSocketClient$connect$2.L$1 = p2;
/*    */       grazieKtorWebSocketClient$connect$2.L$2 = p3;
/*    */       grazieKtorWebSocketClient$connect$2.L$3 = p4;
/*    */       return grazieKtorWebSocketClient$connect$2.invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "GrazieKtorWebSocketClient.kt", l = {29, 31, 32, 33}, i = {0, 1, 2, 3}, s = {"L$0", "L$0", "L$0", "L$0"}, n = {"$this$produce", "$this$produce", "$this$produce", "$this$produce"}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorWebSocketClient$connect$2$incomingTransformed$1")
/*    */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame;"})
/*    */     static final class GrazieKtorWebSocketClient$connect$2$incomingTransformed$1 extends SuspendLambda implements Function2<ProducerScope<? super SuspendableWebSocketClient.Frame>, Continuation<? super Unit>, Object> {
/*    */       Object L$1;
/*    */       int label;
/*    */       
/*    */       GrazieKtorWebSocketClient$connect$2$incomingTransformed$1(ReceiveChannel<Frame> $incoming, Continuation $completion) {
/*    */         super(2, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invokeSuspend(@NotNull Object $result) {
/*    */         // Byte code:
/*    */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */         //   3: astore #6
/*    */         //   5: aload_0
/*    */         //   6: getfield label : I
/*    */         //   9: tableswitch default -> 394, 0 -> 44, 1 -> 101, 2 -> 196, 3 -> 279, 4 -> 359
/*    */         //   44: aload_1
/*    */         //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   48: aload_0
/*    */         //   49: getfield L$0 : Ljava/lang/Object;
/*    */         //   52: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */         //   55: astore_2
/*    */         //   56: nop
/*    */         //   57: aload_0
/*    */         //   58: getfield $incoming : Lkotlinx/coroutines/channels/ReceiveChannel;
/*    */         //   61: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*    */         //   66: astore_3
/*    */         //   67: aload_3
/*    */         //   68: aload_0
/*    */         //   69: checkcast kotlin/coroutines/Continuation
/*    */         //   72: aload_0
/*    */         //   73: aload_2
/*    */         //   74: putfield L$0 : Ljava/lang/Object;
/*    */         //   77: aload_0
/*    */         //   78: aload_3
/*    */         //   79: putfield L$1 : Ljava/lang/Object;
/*    */         //   82: aload_0
/*    */         //   83: iconst_1
/*    */         //   84: putfield label : I
/*    */         //   87: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */         //   92: dup
/*    */         //   93: aload #6
/*    */         //   95: if_acmpne -> 123
/*    */         //   98: aload #6
/*    */         //   100: areturn
/*    */         //   101: aload_0
/*    */         //   102: getfield L$1 : Ljava/lang/Object;
/*    */         //   105: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */         //   108: astore_3
/*    */         //   109: aload_0
/*    */         //   110: getfield L$0 : Ljava/lang/Object;
/*    */         //   113: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */         //   116: astore_2
/*    */         //   117: nop
/*    */         //   118: aload_1
/*    */         //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   122: aload_1
/*    */         //   123: checkcast java/lang/Boolean
/*    */         //   126: invokevirtual booleanValue : ()Z
/*    */         //   129: ifeq -> 390
/*    */         //   132: aload_3
/*    */         //   133: invokeinterface next : ()Ljava/lang/Object;
/*    */         //   138: checkcast io/ktor/websocket/Frame
/*    */         //   141: astore #4
/*    */         //   143: aload #4
/*    */         //   145: astore #5
/*    */         //   147: aload #5
/*    */         //   149: instanceof io/ktor/websocket/Frame$Close
/*    */         //   152: ifeq -> 222
/*    */         //   155: aload_2
/*    */         //   156: new ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Close
/*    */         //   159: dup
/*    */         //   160: invokespecial <init> : ()V
/*    */         //   163: aload_0
/*    */         //   164: checkcast kotlin/coroutines/Continuation
/*    */         //   167: aload_0
/*    */         //   168: aload_2
/*    */         //   169: putfield L$0 : Ljava/lang/Object;
/*    */         //   172: aload_0
/*    */         //   173: aload_3
/*    */         //   174: putfield L$1 : Ljava/lang/Object;
/*    */         //   177: aload_0
/*    */         //   178: iconst_2
/*    */         //   179: putfield label : I
/*    */         //   182: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */         //   187: dup
/*    */         //   188: aload #6
/*    */         //   190: if_acmpne -> 218
/*    */         //   193: aload #6
/*    */         //   195: areturn
/*    */         //   196: aload_0
/*    */         //   197: getfield L$1 : Ljava/lang/Object;
/*    */         //   200: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */         //   203: astore_3
/*    */         //   204: aload_0
/*    */         //   205: getfield L$0 : Ljava/lang/Object;
/*    */         //   208: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */         //   211: astore_2
/*    */         //   212: nop
/*    */         //   213: aload_1
/*    */         //   214: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   217: aload_1
/*    */         //   218: pop
/*    */         //   219: goto -> 67
/*    */         //   222: aload #5
/*    */         //   224: instanceof io/ktor/websocket/Frame$Text
/*    */         //   227: ifeq -> 305
/*    */         //   230: aload_2
/*    */         //   231: new ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Text
/*    */         //   234: dup
/*    */         //   235: aload #4
/*    */         //   237: checkcast io/ktor/websocket/Frame$Text
/*    */         //   240: invokestatic readText : (Lio/ktor/websocket/Frame$Text;)Ljava/lang/String;
/*    */         //   243: invokespecial <init> : (Ljava/lang/String;)V
/*    */         //   246: aload_0
/*    */         //   247: checkcast kotlin/coroutines/Continuation
/*    */         //   250: aload_0
/*    */         //   251: aload_2
/*    */         //   252: putfield L$0 : Ljava/lang/Object;
/*    */         //   255: aload_0
/*    */         //   256: aload_3
/*    */         //   257: putfield L$1 : Ljava/lang/Object;
/*    */         //   260: aload_0
/*    */         //   261: iconst_3
/*    */         //   262: putfield label : I
/*    */         //   265: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */         //   270: dup
/*    */         //   271: aload #6
/*    */         //   273: if_acmpne -> 301
/*    */         //   276: aload #6
/*    */         //   278: areturn
/*    */         //   279: aload_0
/*    */         //   280: getfield L$1 : Ljava/lang/Object;
/*    */         //   283: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */         //   286: astore_3
/*    */         //   287: aload_0
/*    */         //   288: getfield L$0 : Ljava/lang/Object;
/*    */         //   291: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */         //   294: astore_2
/*    */         //   295: nop
/*    */         //   296: aload_1
/*    */         //   297: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   300: aload_1
/*    */         //   301: pop
/*    */         //   302: goto -> 67
/*    */         //   305: aload #5
/*    */         //   307: instanceof io/ktor/websocket/Frame$Binary
/*    */         //   310: ifeq -> 67
/*    */         //   313: aload_2
/*    */         //   314: new ai/grazie/client/common/websocket/SuspendableWebSocketClient$Frame$Binary
/*    */         //   317: dup
/*    */         //   318: aload #4
/*    */         //   320: invokevirtual getData : ()[B
/*    */         //   323: invokespecial <init> : ([B)V
/*    */         //   326: aload_0
/*    */         //   327: checkcast kotlin/coroutines/Continuation
/*    */         //   330: aload_0
/*    */         //   331: aload_2
/*    */         //   332: putfield L$0 : Ljava/lang/Object;
/*    */         //   335: aload_0
/*    */         //   336: aload_3
/*    */         //   337: putfield L$1 : Ljava/lang/Object;
/*    */         //   340: aload_0
/*    */         //   341: iconst_4
/*    */         //   342: putfield label : I
/*    */         //   345: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */         //   350: dup
/*    */         //   351: aload #6
/*    */         //   353: if_acmpne -> 381
/*    */         //   356: aload #6
/*    */         //   358: areturn
/*    */         //   359: aload_0
/*    */         //   360: getfield L$1 : Ljava/lang/Object;
/*    */         //   363: checkcast kotlinx/coroutines/channels/ChannelIterator
/*    */         //   366: astore_3
/*    */         //   367: aload_0
/*    */         //   368: getfield L$0 : Ljava/lang/Object;
/*    */         //   371: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */         //   374: astore_2
/*    */         //   375: nop
/*    */         //   376: aload_1
/*    */         //   377: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */         //   380: aload_1
/*    */         //   381: pop
/*    */         //   382: goto -> 67
/*    */         //   385: astore_3
/*    */         //   386: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */         //   389: areturn
/*    */         //   390: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */         //   393: areturn
/*    */         //   394: new java/lang/IllegalStateException
/*    */         //   397: dup
/*    */         //   398: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */         //   400: invokespecial <init> : (Ljava/lang/String;)V
/*    */         //   403: athrow
/*    */         // Line number table:
/*    */         //   Java source line number -> byte code offset
/*    */         //   #27	-> 3
/*    */         //   #28	-> 56
/*    */         //   #29	-> 57
/*    */         //   #27	-> 98
/*    */         //   #29	-> 123
/*    */         //   #30	-> 143
/*    */         //   #31	-> 147
/*    */         //   #27	-> 193
/*    */         //   #31	-> 218
/*    */         //   #32	-> 222
/*    */         //   #27	-> 276
/*    */         //   #32	-> 301
/*    */         //   #33	-> 305
/*    */         //   #27	-> 356
/*    */         //   #33	-> 381
/*    */         //   #37	-> 385
/*    */         //   #38	-> 386
/*    */         //   #40	-> 390
/*    */         //   #27	-> 394
/*    */         // Local variable table:
/*    */         //   start	length	slot	name	descriptor
/*    */         //   56	45	2	$this$produce	Lkotlinx/coroutines/channels/ProducerScope;
/*    */         //   117	79	2	$this$produce	Lkotlinx/coroutines/channels/ProducerScope;
/*    */         //   212	67	2	$this$produce	Lkotlinx/coroutines/channels/ProducerScope;
/*    */         //   295	64	2	$this$produce	Lkotlinx/coroutines/channels/ProducerScope;
/*    */         //   375	10	2	$this$produce	Lkotlinx/coroutines/channels/ProducerScope;
/*    */         //   143	44	4	value	Lio/ktor/websocket/Frame;
/*    */         //   222	48	4	value	Lio/ktor/websocket/Frame;
/*    */         //   305	45	4	value	Lio/ktor/websocket/Frame;
/*    */         //   48	346	0	this	Lai/grazie/client/ktor/GrazieKtorWebSocketClient$connect$2$incomingTransformed$1;
/*    */         //   48	346	1	$result	Ljava/lang/Object;
/*    */         // Exception table:
/*    */         //   from	to	target	type
/*    */         //   56	92	385	java/io/EOFException
/*    */         //   117	187	385	java/io/EOFException
/*    */         //   212	270	385	java/io/EOFException
/*    */         //   295	350	385	java/io/EOFException
/*    */         //   375	385	385	java/io/EOFException
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super GrazieKtorWebSocketClient$connect$2$incomingTransformed$1> $completion) {
/*    */         GrazieKtorWebSocketClient$connect$2$incomingTransformed$1 grazieKtorWebSocketClient$connect$2$incomingTransformed$1 = new GrazieKtorWebSocketClient$connect$2$incomingTransformed$1(this.$incoming, $completion);
/*    */         grazieKtorWebSocketClient$connect$2$incomingTransformed$1.L$0 = value;
/*    */         return (Continuation<Unit>)grazieKtorWebSocketClient$connect$2$incomingTransformed$1;
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invoke(@NotNull ProducerScope p1, @Nullable Continuation<?> p2) {
/*    */         return ((GrazieKtorWebSocketClient$connect$2$incomingTransformed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorWebSocketClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */