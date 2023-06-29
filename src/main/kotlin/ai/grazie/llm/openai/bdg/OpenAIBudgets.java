/*    */ package ai.grazie.llm.openai.bdg;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J#\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\tJ!\020\n\032\0020\0132\006\020\005\032\0020\0062\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\tJ#\020\f\032\004\030\0010\0132\006\020\005\032\0020\0062\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\t\002\004\n\002\b\031¨\006\r"}, d2 = {"Lai/grazie/llm/openai/bdg/OpenAIBudgets;", "", "()V", "chat", "Lai/grazie/model/llm/bdg/chat/LLMChatBudgeting;", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "loader", "Lai/grazie/utils/mpp/RootDataLoader;", "(Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completion", "Lai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting;", "token", "llm-openai-bdg"})
/*    */ @SourceDebugExtension({"SMAP\nOpenAIBudgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAIBudgets.kt\nai/grazie/llm/openai/bdg/OpenAIBudgets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/*    */ public final class OpenAIBudgets { @NotNull
/*    */   public static final OpenAIBudgets INSTANCE = new OpenAIBudgets();
/*    */   
/*    */   @Nullable
/*    */   public final Object token(@NotNull LLMProfileID id, @NotNull RootDataLoader loader, @NotNull Continuation<? super LLMPerTokenBudgeting> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/llm/openai/bdg/OpenAIBudgets$token$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/llm/openai/bdg/OpenAIBudgets$token$1
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
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/llm/openai/bdg/OpenAIBudgets$token$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/llm/openai/bdg/OpenAIBudgets;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 177, 0 -> 88, 1 -> 140
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/llm/openai/bdg/OpenAIPricing.INSTANCE : Lai/grazie/llm/openai/bdg/OpenAIPricing;
/*    */     //   96: aload_1
/*    */     //   97: invokevirtual get : (Lai/grazie/model/llm/profile/LLMProfileID;)Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;
/*    */     //   100: dup
/*    */     //   101: ifnonnull -> 107
/*    */     //   104: pop
/*    */     //   105: aconst_null
/*    */     //   106: areturn
/*    */     //   107: astore #4
/*    */     //   109: getstatic ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder.Companion : Lai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion;
/*    */     //   112: aload_2
/*    */     //   113: aload #7
/*    */     //   115: aload #7
/*    */     //   117: aload #4
/*    */     //   119: putfield L$0 : Ljava/lang/Object;
/*    */     //   122: aload #7
/*    */     //   124: iconst_1
/*    */     //   125: putfield label : I
/*    */     //   128: invokevirtual load : (Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   131: dup
/*    */     //   132: aload #8
/*    */     //   134: if_acmpne -> 157
/*    */     //   137: aload #8
/*    */     //   139: areturn
/*    */     //   140: aload #7
/*    */     //   142: getfield L$0 : Ljava/lang/Object;
/*    */     //   145: checkcast ai/grazie/model/llm/bdg/token/LLMPerTokenPricing
/*    */     //   148: astore #4
/*    */     //   150: aload #6
/*    */     //   152: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   155: aload #6
/*    */     //   157: checkcast ai/grazie/nlp/encoder/TiktokenEncoder
/*    */     //   160: astore #5
/*    */     //   162: new ai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting
/*    */     //   165: dup
/*    */     //   166: aload #4
/*    */     //   168: aload #5
/*    */     //   170: checkcast ai/grazie/model/nlp/encoder/TokenCounter
/*    */     //   173: invokespecial <init> : (Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;Lai/grazie/model/nlp/encoder/TokenCounter;)V
/*    */     //   176: areturn
/*    */     //   177: new java/lang/IllegalStateException
/*    */     //   180: dup
/*    */     //   181: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   183: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   186: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 60
/*    */     //   #21	-> 93
/*    */     //   #22	-> 109
/*    */     //   #20	-> 137
/*    */     //   #23	-> 162
/*    */     //   #20	-> 177
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	7	1	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   93	11	2	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   107	24	2	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   109	31	4	pricing	Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;
/*    */     //   150	27	4	pricing	Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;
/*    */     //   162	15	5	encoder	Lai/grazie/nlp/encoder/TiktokenEncoder;
/*    */     //   50	127	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	120	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object completion(@NotNull LLMProfileID id, @NotNull RootDataLoader loader, @NotNull Continuation<? super LLMPerTokenBudgeting> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/llm/openai/bdg/OpenAIBudgets$completion$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/llm/openai/bdg/OpenAIBudgets$completion$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/llm/openai/bdg/OpenAIBudgets$completion$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/llm/openai/bdg/OpenAIBudgets;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 205, 0 -> 88, 1 -> 159
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs$Completion.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs$Completion;
/*    */     //   96: invokevirtual getAll : ()[Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   99: aload_1
/*    */     //   100: invokestatic contains : ([Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   103: ifne -> 130
/*    */     //   106: iconst_0
/*    */     //   107: istore #4
/*    */     //   109: aload_1
/*    */     //   110: <illegal opcode> makeConcatWithConstants : (Lai/grazie/model/llm/profile/LLMProfileID;)Ljava/lang/String;
/*    */     //   115: astore #4
/*    */     //   117: new java/lang/IllegalArgumentException
/*    */     //   120: dup
/*    */     //   121: aload #4
/*    */     //   123: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   129: athrow
/*    */     //   130: aload_0
/*    */     //   131: aload_1
/*    */     //   132: aload_2
/*    */     //   133: aload #6
/*    */     //   135: aload #6
/*    */     //   137: aload_1
/*    */     //   138: putfield L$0 : Ljava/lang/Object;
/*    */     //   141: aload #6
/*    */     //   143: iconst_1
/*    */     //   144: putfield label : I
/*    */     //   147: invokevirtual token : (Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   150: dup
/*    */     //   151: aload #7
/*    */     //   153: if_acmpne -> 175
/*    */     //   156: aload #7
/*    */     //   158: areturn
/*    */     //   159: aload #6
/*    */     //   161: getfield L$0 : Ljava/lang/Object;
/*    */     //   164: checkcast ai/grazie/model/llm/profile/LLMProfileID
/*    */     //   167: astore_1
/*    */     //   168: aload #5
/*    */     //   170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   173: aload #5
/*    */     //   175: checkcast ai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting
/*    */     //   178: dup
/*    */     //   179: ifnonnull -> 204
/*    */     //   182: pop
/*    */     //   183: aload_1
/*    */     //   184: <illegal opcode> makeConcatWithConstants : (Lai/grazie/model/llm/profile/LLMProfileID;)Ljava/lang/String;
/*    */     //   189: astore #4
/*    */     //   191: new java/lang/IllegalStateException
/*    */     //   194: dup
/*    */     //   195: aload #4
/*    */     //   197: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   200: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   203: athrow
/*    */     //   204: areturn
/*    */     //   205: new java/lang/IllegalStateException
/*    */     //   208: dup
/*    */     //   209: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   211: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   214: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 60
/*    */     //   #27	-> 93
/*    */     //   #49	-> 106
/*    */     //   #27	-> 109
/*    */     //   #27	-> 115
/*    */     //   #28	-> 130
/*    */     //   #26	-> 156
/*    */     //   #28	-> 175
/*    */     //   #26	-> 205
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	13	0	this	Lai/grazie/llm/openai/bdg/OpenAIBudgets;
/*    */     //   130	20	0	this	Lai/grazie/llm/openai/bdg/OpenAIBudgets;
/*    */     //   93	66	1	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   168	37	1	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   93	13	2	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   130	20	2	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   109	6	4	$i$a$-require-OpenAIBudgets$completion$2	I
/*    */     //   50	155	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	148	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object chat(@NotNull LLMProfileID id, @NotNull RootDataLoader loader, @NotNull Continuation<? super LLMChatBudgeting> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/llm/openai/bdg/OpenAIBudgets;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 228, 0 -> 88, 1 -> 153
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/model/llm/profile/OpenAIProfileIDs$Chat.INSTANCE : Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;
/*    */     //   96: invokevirtual getAll : ()[Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   99: aload_1
/*    */     //   100: invokestatic contains : ([Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   103: ifne -> 130
/*    */     //   106: iconst_0
/*    */     //   107: istore #4
/*    */     //   109: aload_1
/*    */     //   110: <illegal opcode> makeConcatWithConstants : (Lai/grazie/model/llm/profile/LLMProfileID;)Ljava/lang/String;
/*    */     //   115: astore #4
/*    */     //   117: new java/lang/IllegalArgumentException
/*    */     //   120: dup
/*    */     //   121: aload #4
/*    */     //   123: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   126: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   129: athrow
/*    */     //   130: aload_0
/*    */     //   131: aload_1
/*    */     //   132: aload_2
/*    */     //   133: aload #6
/*    */     //   135: aload #6
/*    */     //   137: iconst_1
/*    */     //   138: putfield label : I
/*    */     //   141: invokevirtual token : (Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   144: dup
/*    */     //   145: aload #10
/*    */     //   147: if_acmpne -> 160
/*    */     //   150: aload #10
/*    */     //   152: areturn
/*    */     //   153: aload #5
/*    */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   158: aload #5
/*    */     //   160: checkcast ai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting
/*    */     //   163: dup
/*    */     //   164: ifnonnull -> 170
/*    */     //   167: pop
/*    */     //   168: aconst_null
/*    */     //   169: areturn
/*    */     //   170: new ai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster
/*    */     //   173: dup
/*    */     //   174: getstatic ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$3.INSTANCE : Lai/grazie/llm/openai/bdg/OpenAIBudgets$chat$3;
/*    */     //   177: checkcast kotlin/jvm/functions/Function1
/*    */     //   180: getstatic ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$4.INSTANCE : Lai/grazie/llm/openai/bdg/OpenAIBudgets$chat$4;
/*    */     //   183: checkcast kotlin/jvm/functions/Function1
/*    */     //   186: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
/*    */     //   189: new ai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster
/*    */     //   192: dup
/*    */     //   193: getstatic ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$5.INSTANCE : Lai/grazie/llm/openai/bdg/OpenAIBudgets$chat$5;
/*    */     //   196: checkcast kotlin/jvm/functions/Function1
/*    */     //   199: getstatic ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$6.INSTANCE : Lai/grazie/llm/openai/bdg/OpenAIBudgets$chat$6;
/*    */     //   202: checkcast kotlin/jvm/functions/Function1
/*    */     //   205: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
/*    */     //   208: astore #7
/*    */     //   210: astore #8
/*    */     //   212: astore #9
/*    */     //   214: new ai/grazie/model/llm/bdg/chat/LLMChatBudgeting
/*    */     //   217: dup
/*    */     //   218: aload #9
/*    */     //   220: aload #8
/*    */     //   222: aload #7
/*    */     //   224: invokespecial <init> : (Lai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting;Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster;Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster;)V
/*    */     //   227: areturn
/*    */     //   228: new java/lang/IllegalStateException
/*    */     //   231: dup
/*    */     //   232: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   234: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   237: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 60
/*    */     //   #32	-> 93
/*    */     //   #49	-> 106
/*    */     //   #32	-> 109
/*    */     //   #32	-> 115
/*    */     //   #38	-> 130
/*    */     //   #39	-> 130
/*    */     //   #31	-> 150
/*    */     //   #39	-> 160
/*    */     //   #42	-> 170
/*    */     //   #44	-> 189
/*    */     //   #38	-> 208
/*    */     //   #31	-> 228
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	13	0	this	Lai/grazie/llm/openai/bdg/OpenAIBudgets;
/*    */     //   130	14	0	this	Lai/grazie/llm/openai/bdg/OpenAIBudgets;
/*    */     //   93	22	1	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   130	14	1	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   93	13	2	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   130	14	2	loader	Lai/grazie/utils/mpp/RootDataLoader;
/*    */     //   109	6	4	$i$a$-require-OpenAIBudgets$chat$2	I
/*    */     //   50	178	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	171	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "OpenAIBudgets.kt", l = {39}, i = {}, s = {}, n = {}, m = "chat", c = "ai.grazie.llm.openai.bdg.OpenAIBudgets")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class OpenAIBudgets$chat$1 extends ContinuationImpl { int label;
/*    */     
/*    */     OpenAIBudgets$chat$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return OpenAIBudgets.this.chat(null, null, (Continuation<? super LLMChatBudgeting>)this);
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/LLMChatMessage;", "invoke", "(Lai/grazie/model/llm/chat/LLMChatMessage;)Ljava/lang/Integer;"})
/*    */   static final class OpenAIBudgets$chat$3 extends Lambda implements Function1<LLMChatMessage, Integer> { public static final OpenAIBudgets$chat$3 INSTANCE = new OpenAIBudgets$chat$3();
/*    */     
/*    */     @NotNull
/* 42 */     public final Integer invoke(@NotNull LLMChatMessage it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(5); } OpenAIBudgets$chat$3() { super(1); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/LLMChat;", "invoke", "(Lai/grazie/model/llm/chat/LLMChat;)Ljava/lang/Integer;"}) static final class OpenAIBudgets$chat$4 extends Lambda implements Function1<LLMChat, Integer> { public static final OpenAIBudgets$chat$4 INSTANCE = new OpenAIBudgets$chat$4(); OpenAIBudgets$chat$4() { super(1); } @NotNull public final Integer invoke(@NotNull LLMChat it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(2); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/LLMChatMessage;", "invoke", "(Lai/grazie/model/llm/chat/LLMChatMessage;)Ljava/lang/Integer;"}) static final class OpenAIBudgets$chat$5 extends Lambda implements Function1<LLMChatMessage, Integer> { public static final OpenAIBudgets$chat$5 INSTANCE = new OpenAIBudgets$chat$5(); OpenAIBudgets$chat$5() { super(1); }
/*    */     @NotNull
/* 44 */     public final Integer invoke(@NotNull LLMChatMessage it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(0); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/llm/chat/LLMChat;", "invoke", "(Lai/grazie/model/llm/chat/LLMChat;)Ljava/lang/Integer;"}) static final class OpenAIBudgets$chat$6 extends Lambda implements Function1<LLMChat, Integer> { public static final OpenAIBudgets$chat$6 INSTANCE = new OpenAIBudgets$chat$6(); OpenAIBudgets$chat$6() { super(1); } @NotNull public final Integer invoke(@NotNull LLMChat it) { Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf(0); }
/*    */      }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "OpenAIBudgets.kt", l = {28}, i = {0}, s = {"L$0"}, n = {"id"}, m = "completion", c = "ai.grazie.llm.openai.bdg.OpenAIBudgets")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class OpenAIBudgets$completion$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     OpenAIBudgets$completion$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return OpenAIBudgets.this.completion(null, null, (Continuation<? super LLMPerTokenBudgeting>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "OpenAIBudgets.kt", l = {22}, i = {0}, s = {"L$0"}, n = {"pricing"}, m = "token", c = "ai.grazie.llm.openai.bdg.OpenAIBudgets")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class OpenAIBudgets$token$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     OpenAIBudgets$token$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return OpenAIBudgets.this.token(null, null, (Continuation<? super LLMPerTokenBudgeting>)this);
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/llm/openai/bdg/OpenAIBudgets.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */