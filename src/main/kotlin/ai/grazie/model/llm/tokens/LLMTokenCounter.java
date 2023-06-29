/*    */ package ai.grazie.model.llm.tokens;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\b&\030\0002\0020\001:\001\025B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\031\020\t\032\0020\n2\006\020\013\032\0020\fH@ø\001\000¢\006\002\020\rJ\037\020\t\032\0020\n2\f\020\016\032\b\022\004\022\0020\0200\017H@ø\001\000¢\006\002\020\021J\031\020\t\032\0020\n2\006\020\022\032\0020\023H@ø\001\000¢\006\002\020\024R\016\020\004\032\0020\005X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\b\002\004\n\002\b\031¨\006\026"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter;", "", "tokenCounter", "Lai/grazie/model/nlp/encoder/TokenCounter;", "adjuster", "Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "(Lai/grazie/model/nlp/encoder/TokenCounter;Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;)V", "getTokenCounter", "()Lai/grazie/model/nlp/encoder/TokenCounter;", "count", "", "chat", "Lai/grazie/model/llm/chat/LLMChat;", "(Lai/grazie/model/llm/chat/LLMChat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messages", "", "Lai/grazie/model/llm/chat/LLMChatMessage;", "([Lai/grazie/model/llm/chat/LLMChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "text", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Adjuster", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMTokenCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMTokenCounter.kt\nai/grazie/model/llm/tokens/LLMTokenCounter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/*    */ public abstract class LLMTokenCounter { @NotNull
/*    */   private final TokenCounter tokenCounter; @NotNull
/*    */   private final Adjuster adjuster;
/*    */   
/*  7 */   public LLMTokenCounter(@NotNull TokenCounter tokenCounter, @NotNull Adjuster adjuster) { this.tokenCounter = tokenCounter; this.adjuster = adjuster; } @NotNull public final TokenCounter getTokenCounter() { return this.tokenCounter; }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B-\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\022\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\002\020\bJ\025\020\f\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\025\020\r\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\003J5\020\016\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\024\b\002\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\024HÖ\001R\035\020\006\032\016\022\004\022\0020\007\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\013\020\n¨\006\025"}, d2 = {"Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;", "", "message", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/LLMChatMessage;", "", "chat", "Lai/grazie/model/llm/chat/LLMChat;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getChat", "()Lkotlin/jvm/functions/Function1;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model-llm"})
/*    */   public static final class Adjuster { @NotNull
/*    */     private final Function1<LLMChatMessage, Integer> message; @NotNull
/*    */     private final Function1<LLMChat, Integer> chat;
/* 12 */     public Adjuster(@NotNull Function1<LLMChatMessage, Integer> message, @NotNull Function1<LLMChat, Integer> chat) { this.message = message; this.chat = chat; } @NotNull public final Function1<LLMChatMessage, Integer> getMessage() { return this.message; } @NotNull public final Function1<LLMChatMessage, Integer> component1() { return this.message; } @NotNull public final Function1<LLMChat, Integer> component2() { return this.chat; } @NotNull public final Adjuster copy(@NotNull Function1<? super LLMChatMessage, Integer> message, @NotNull Function1<? super LLMChat, Integer> chat) { Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(chat, "chat"); return new Adjuster(message, chat); } @NotNull public final Function1<LLMChat, Integer> getChat() { return this.chat; }
/*    */     @NotNull public String toString() { return "Adjuster(message=" + this.message + ", chat=" + this.chat + ")"; }
/*    */     public int hashCode() { result = this.message.hashCode(); return result * 31 + this.chat.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof Adjuster))
/*    */         return false;  Adjuster adjuster = (Adjuster)other; return !Intrinsics.areEqual(this.message, adjuster.message) ? false : (!!Intrinsics.areEqual(this.chat, adjuster.chat)); } }
/* 17 */    @Nullable public final Object count(@NotNull String text, @NotNull Continuation $completion) { return Boxing.boxInt(this.tokenCounter.count(text)); }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object count(@NotNull LLMChat chat, @NotNull Continuation<? super Integer> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/tokens/LLMTokenCounter$count$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter$count$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/tokens/LLMTokenCounter$count$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/tokens/LLMTokenCounter;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 182, 0 -> 88, 1 -> 129
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_0
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual getMessages : ()[Lai/grazie/model/llm/chat/LLMChatMessage;
/*    */     //   97: aload #4
/*    */     //   99: aload #4
/*    */     //   101: aload_0
/*    */     //   102: putfield L$0 : Ljava/lang/Object;
/*    */     //   105: aload #4
/*    */     //   107: aload_1
/*    */     //   108: putfield L$1 : Ljava/lang/Object;
/*    */     //   111: aload #4
/*    */     //   113: iconst_1
/*    */     //   114: putfield label : I
/*    */     //   117: invokevirtual count : ([Lai/grazie/model/llm/chat/LLMChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   120: dup
/*    */     //   121: aload #5
/*    */     //   123: if_acmpne -> 152
/*    */     //   126: aload #5
/*    */     //   128: areturn
/*    */     //   129: aload #4
/*    */     //   131: getfield L$1 : Ljava/lang/Object;
/*    */     //   134: checkcast ai/grazie/model/llm/chat/LLMChat
/*    */     //   137: astore_1
/*    */     //   138: aload #4
/*    */     //   140: getfield L$0 : Ljava/lang/Object;
/*    */     //   143: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   146: astore_0
/*    */     //   147: aload_3
/*    */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   151: aload_3
/*    */     //   152: checkcast java/lang/Number
/*    */     //   155: invokevirtual intValue : ()I
/*    */     //   158: aload_0
/*    */     //   159: getfield adjuster : Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;
/*    */     //   162: invokevirtual getChat : ()Lkotlin/jvm/functions/Function1;
/*    */     //   165: aload_1
/*    */     //   166: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   171: checkcast java/lang/Number
/*    */     //   174: invokevirtual intValue : ()I
/*    */     //   177: iadd
/*    */     //   178: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   181: areturn
/*    */     //   182: new java/lang/IllegalStateException
/*    */     //   185: dup
/*    */     //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   191: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 59
/*    */     //   #15	-> 92
/*    */     //   #15	-> 126
/*    */     //   #15	-> 152
/*    */     //   #15	-> 182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	37	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   147	35	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   92	37	1	chat	Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   138	44	1	chat	Lai/grazie/model/llm/chat/LLMChat;
/*    */     //   50	132	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	126	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object count(@NotNull LLMChatMessage[] messages, @NotNull Continuation<? super Integer> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/tokens/LLMTokenCounter$count$2
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter$count$2
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
/*    */     //   39: new ai/grazie/model/llm/tokens/LLMTokenCounter$count$2
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/tokens/LLMTokenCounter;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 302, 0 -> 88, 1 -> 195
/*    */     //   88: aload #12
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: astore_3
/*    */     //   95: iconst_0
/*    */     //   96: istore #4
/*    */     //   98: iconst_0
/*    */     //   99: istore #5
/*    */     //   101: aload_3
/*    */     //   102: arraylength
/*    */     //   103: istore #6
/*    */     //   105: iload #5
/*    */     //   107: iload #6
/*    */     //   109: if_icmpge -> 296
/*    */     //   112: aload_3
/*    */     //   113: iload #5
/*    */     //   115: aaload
/*    */     //   116: astore #7
/*    */     //   118: iload #4
/*    */     //   120: aload #7
/*    */     //   122: astore #8
/*    */     //   124: istore #10
/*    */     //   126: iconst_0
/*    */     //   127: istore #9
/*    */     //   129: aload_0
/*    */     //   130: aload #8
/*    */     //   132: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   135: aload #13
/*    */     //   137: aload #13
/*    */     //   139: aload_0
/*    */     //   140: putfield L$0 : Ljava/lang/Object;
/*    */     //   143: aload #13
/*    */     //   145: aload_3
/*    */     //   146: putfield L$1 : Ljava/lang/Object;
/*    */     //   149: aload #13
/*    */     //   151: aload #8
/*    */     //   153: putfield L$2 : Ljava/lang/Object;
/*    */     //   156: aload #13
/*    */     //   158: iload #5
/*    */     //   160: putfield I$0 : I
/*    */     //   163: aload #13
/*    */     //   165: iload #6
/*    */     //   167: putfield I$1 : I
/*    */     //   170: aload #13
/*    */     //   172: iload #10
/*    */     //   174: putfield I$2 : I
/*    */     //   177: aload #13
/*    */     //   179: iconst_1
/*    */     //   180: putfield label : I
/*    */     //   183: invokevirtual count : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   186: dup
/*    */     //   187: aload #14
/*    */     //   189: if_acmpne -> 254
/*    */     //   192: aload #14
/*    */     //   194: areturn
/*    */     //   195: iconst_0
/*    */     //   196: istore #9
/*    */     //   198: aload #13
/*    */     //   200: getfield I$2 : I
/*    */     //   203: istore #10
/*    */     //   205: aload #13
/*    */     //   207: getfield I$1 : I
/*    */     //   210: istore #6
/*    */     //   212: aload #13
/*    */     //   214: getfield I$0 : I
/*    */     //   217: istore #5
/*    */     //   219: aload #13
/*    */     //   221: getfield L$2 : Ljava/lang/Object;
/*    */     //   224: checkcast ai/grazie/model/llm/chat/LLMChatMessage
/*    */     //   227: astore #8
/*    */     //   229: aload #13
/*    */     //   231: getfield L$1 : Ljava/lang/Object;
/*    */     //   234: checkcast [Lai/grazie/model/llm/chat/LLMChatMessage;
/*    */     //   237: astore_3
/*    */     //   238: aload #13
/*    */     //   240: getfield L$0 : Ljava/lang/Object;
/*    */     //   243: checkcast ai/grazie/model/llm/tokens/LLMTokenCounter
/*    */     //   246: astore_0
/*    */     //   247: aload #12
/*    */     //   249: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   252: aload #12
/*    */     //   254: checkcast java/lang/Number
/*    */     //   257: invokevirtual intValue : ()I
/*    */     //   260: aload_0
/*    */     //   261: getfield adjuster : Lai/grazie/model/llm/tokens/LLMTokenCounter$Adjuster;
/*    */     //   264: invokevirtual getMessage : ()Lkotlin/jvm/functions/Function1;
/*    */     //   267: aload #8
/*    */     //   269: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   274: checkcast java/lang/Number
/*    */     //   277: invokevirtual intValue : ()I
/*    */     //   280: iadd
/*    */     //   281: istore #11
/*    */     //   283: iload #10
/*    */     //   285: iload #11
/*    */     //   287: iadd
/*    */     //   288: istore #4
/*    */     //   290: iinc #5, 1
/*    */     //   293: goto -> 105
/*    */     //   296: iload #4
/*    */     //   298: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   301: areturn
/*    */     //   302: new java/lang/IllegalStateException
/*    */     //   305: dup
/*    */     //   306: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   308: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   311: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #16	-> 93
/*    */     //   #20	-> 124
/*    */     //   #16	-> 129
/*    */     //   #16	-> 192
/*    */     //   #16	-> 254
/*    */     //   #16	-> 287
/*    */     //   #16	-> 301
/*    */     //   #16	-> 302
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	102	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   247	55	0	this	Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   93	2	1	messages	[Lai/grazie/model/llm/chat/LLMChatMessage;
/*    */     //   124	71	8	it	Lai/grazie/model/llm/chat/LLMChatMessage;
/*    */     //   229	52	8	it	Lai/grazie/model/llm/chat/LLMChatMessage;
/*    */     //   129	66	9	$i$a$-sumOfInt-LLMTokenCounter$count$3	I
/*    */     //   50	252	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	245	12	$result	Ljava/lang/Object;
/*    */     //   198	83	9	$i$a$-sumOfInt-LLMTokenCounter$count$3	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMTokenCounter.kt", l = {15}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "chat"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMTokenCounter$count$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     LLMTokenCounter$count$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMTokenCounter.this.count((LLMChat)null, (Continuation<? super Integer>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMTokenCounter.kt", l = {16}, i = {0, 0}, s = {"L$0", "L$2"}, n = {"this", "it"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMTokenCounter$count$2 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int I$2;
/*    */     int label;
/*    */     
/*    */     LLMTokenCounter$count$2(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMTokenCounter.this.count((LLMChatMessage[])null, (Continuation<? super Integer>)this);
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/tokens/LLMTokenCounter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */