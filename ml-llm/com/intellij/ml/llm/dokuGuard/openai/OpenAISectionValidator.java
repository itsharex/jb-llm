/*    */ package com.intellij.ml.llm.dokuGuard.openai;
/*    */ 
/*    */ import com.intellij.ml.llm.dokuGuard.api.ProjectSection;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\r\032\0020\0162\006\020\017\032\0020\007J\b\020\020\032\0020\021H\026R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\023\020\b\032\0070\t¢\006\002\b\nX\004¢\006\002\n\000R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator;", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "(Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;)V", "listeners", "", "Lcom/intellij/ml/llm/dokuGuard/openai/ValidationListener;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "getProjectSection", "()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "addValidationListener", "", "listener", "validate", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nOpenAISectionValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAISectionValidator.kt\ncom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1855#2,2:94\n1855#2,2:96\n1855#2,2:98\n*S KotlinDebug\n*F\n+ 1 OpenAISectionValidator.kt\ncom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator\n*L\n72#1:94,2\n83#1:96,2\n87#1:98,2\n*E\n"})
/*    */ public final class OpenAISectionValidator implements SectionValidator {
/*    */   @NotNull
/*    */   private final ProjectSection projectSection;
/*    */   
/* 12 */   public OpenAISectionValidator(@NotNull ProjectSection projectSection) { this.projectSection = projectSection;
/* 13 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(getClass()), "getInstance(this.javaClass)"); this.logger = Logger.getInstance(getClass());
/* 14 */     this.listeners = new ArrayList<>(); }
/*    */   @NotNull private final Logger logger; @NotNull
/*    */   private final List<ValidationListener> listeners; @NotNull
/* 17 */   public ProjectSection getProjectSection() { return this.projectSection; } public final void addValidationListener(@NotNull ValidationListener listener) { Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.add(listener); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ValidationDecision validate() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual getProjectSection : ()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;
/*    */     //   4: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*    */     //   9: invokevirtual getDisplayName : ()Ljava/lang/String;
/*    */     //   12: dup
/*    */     //   13: ldc 'projectSection.language.displayName'
/*    */     //   15: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: astore_1
/*    */     //   19: getstatic com/intellij/ml/llm/dokuGuard/openai/response/ResponseVerdict.VALID : Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseVerdict;
/*    */     //   22: invokevirtual getAsResponse : ()Ljava/lang/String;
/*    */     //   25: aload_1
/*    */     //   26: getstatic com/intellij/ml/llm/dokuGuard/openai/response/ResponseVerdict.INVALID : Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseVerdict;
/*    */     //   29: invokevirtual getAsResponse : ()Ljava/lang/String;
/*    */     //   32: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   37: astore_2
/*    */     //   38: aload_2
/*    */     //   39: aload_0
/*    */     //   40: invokevirtual getProjectSection : ()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;
/*    */     //   43: invokeinterface getCode : ()Ljava/lang/String;
/*    */     //   48: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   53: astore_3
/*    */     //   54: aload_0
/*    */     //   55: getfield listeners : Ljava/util/List;
/*    */     //   58: checkcast java/lang/Iterable
/*    */     //   61: astore #4
/*    */     //   63: iconst_0
/*    */     //   64: istore #5
/*    */     //   66: aload #4
/*    */     //   68: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   73: astore #6
/*    */     //   75: aload #6
/*    */     //   77: invokeinterface hasNext : ()Z
/*    */     //   82: ifeq -> 116
/*    */     //   85: aload #6
/*    */     //   87: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   92: astore #7
/*    */     //   94: aload #7
/*    */     //   96: checkcast com/intellij/ml/llm/dokuGuard/openai/ValidationListener
/*    */     //   99: astore #8
/*    */     //   101: iconst_0
/*    */     //   102: istore #9
/*    */     //   104: aload #8
/*    */     //   106: aload_3
/*    */     //   107: invokeinterface onRequest : (Ljava/lang/String;)V
/*    */     //   112: nop
/*    */     //   113: goto -> 75
/*    */     //   116: nop
/*    */     //   117: aload_0
/*    */     //   118: getfield logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   121: ldc 'sendCompletionRequest'
/*    */     //   123: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   126: aload_0
/*    */     //   127: invokevirtual getProjectSection : ()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;
/*    */     //   130: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   135: aload_3
/*    */     //   136: ldc ''
/*    */     //   138: aconst_null
/*    */     //   139: aconst_null
/*    */     //   140: aconst_null
/*    */     //   141: aconst_null
/*    */     //   142: aconst_null
/*    */     //   143: iconst_1
/*    */     //   144: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   147: iconst_0
/*    */     //   148: aconst_null
/*    */     //   149: aconst_null
/*    */     //   150: aconst_null
/*    */     //   151: sipush #7928
/*    */     //   154: aconst_null
/*    */     //   155: invokestatic sendCompletionChatRequest$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;ILjava/lang/Object;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;
/*    */     //   158: dup
/*    */     //   159: ifnonnull -> 253
/*    */     //   162: pop
/*    */     //   163: aload_0
/*    */     //   164: checkcast com/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator
/*    */     //   167: astore #7
/*    */     //   169: iconst_0
/*    */     //   170: istore #8
/*    */     //   172: aload #7
/*    */     //   174: getfield logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   177: ldc 'failed to read llm response'
/*    */     //   179: invokevirtual warn : (Ljava/lang/String;)V
/*    */     //   182: aload #7
/*    */     //   184: getfield listeners : Ljava/util/List;
/*    */     //   187: checkcast java/lang/Iterable
/*    */     //   190: astore #9
/*    */     //   192: iconst_0
/*    */     //   193: istore #10
/*    */     //   195: aload #9
/*    */     //   197: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   202: astore #11
/*    */     //   204: aload #11
/*    */     //   206: invokeinterface hasNext : ()Z
/*    */     //   211: ifeq -> 245
/*    */     //   214: aload #11
/*    */     //   216: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   221: astore #12
/*    */     //   223: aload #12
/*    */     //   225: checkcast com/intellij/ml/llm/dokuGuard/openai/ValidationListener
/*    */     //   228: astore #13
/*    */     //   230: iconst_0
/*    */     //   231: istore #14
/*    */     //   233: aload #13
/*    */     //   235: aconst_null
/*    */     //   236: invokeinterface onResponse : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;)V
/*    */     //   241: nop
/*    */     //   242: goto -> 204
/*    */     //   245: nop
/*    */     //   246: getstatic com/intellij/ml/llm/dokuGuard/api/ValidationDecision.Companion : Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision$Companion;
/*    */     //   249: invokevirtual getNO_CHANGE : ()Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;
/*    */     //   252: areturn
/*    */     //   253: astore #4
/*    */     //   255: aload #4
/*    */     //   257: invokeinterface getSuggestions : ()Ljava/util/List;
/*    */     //   262: iconst_0
/*    */     //   263: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   268: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*    */     //   271: astore #5
/*    */     //   273: aload_0
/*    */     //   274: getfield listeners : Ljava/util/List;
/*    */     //   277: checkcast java/lang/Iterable
/*    */     //   280: astore #6
/*    */     //   282: iconst_0
/*    */     //   283: istore #7
/*    */     //   285: aload #6
/*    */     //   287: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   292: astore #8
/*    */     //   294: aload #8
/*    */     //   296: invokeinterface hasNext : ()Z
/*    */     //   301: ifeq -> 336
/*    */     //   304: aload #8
/*    */     //   306: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   311: astore #9
/*    */     //   313: aload #9
/*    */     //   315: checkcast com/intellij/ml/llm/dokuGuard/openai/ValidationListener
/*    */     //   318: astore #10
/*    */     //   320: iconst_0
/*    */     //   321: istore #11
/*    */     //   323: aload #10
/*    */     //   325: aload #5
/*    */     //   327: invokeinterface onResponse : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;)V
/*    */     //   332: nop
/*    */     //   333: goto -> 294
/*    */     //   336: nop
/*    */     //   337: invokestatic defaultResponseParser : ()Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;
/*    */     //   340: astore #6
/*    */     //   342: aload_0
/*    */     //   343: getfield logger : Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   346: aload #5
/*    */     //   348: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;)Ljava/lang/String;
/*    */     //   353: invokevirtual info : (Ljava/lang/String;)V
/*    */     //   356: aload #6
/*    */     //   358: aload #5
/*    */     //   360: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   363: invokeinterface parse : (Ljava/lang/String;)Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;
/*    */     //   368: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     //   #64	-> 19
/*    */     //   #65	-> 25
/*    */     //   #66	-> 26
/*    */     //   #63	-> 37
/*    */     //   #71	-> 38
/*    */     //   #72	-> 54
/*    */     //   #94	-> 66
/*    */     //   #72	-> 104
/*    */     //   #94	-> 112
/*    */     //   #95	-> 116
/*    */     //   #74	-> 117
/*    */     //   #76	-> 126
/*    */     //   #77	-> 126
/*    */     //   #78	-> 135
/*    */     //   #79	-> 136
/*    */     //   #76	-> 138
/*    */     //   #80	-> 143
/*    */     //   #76	-> 147
/*    */     //   #81	-> 163
/*    */     //   #82	-> 172
/*    */     //   #83	-> 182
/*    */     //   #96	-> 195
/*    */     //   #83	-> 233
/*    */     //   #96	-> 241
/*    */     //   #97	-> 245
/*    */     //   #84	-> 246
/*    */     //   #76	-> 253
/*    */     //   #86	-> 255
/*    */     //   #87	-> 273
/*    */     //   #98	-> 285
/*    */     //   #87	-> 323
/*    */     //   #98	-> 332
/*    */     //   #99	-> 336
/*    */     //   #88	-> 337
/*    */     //   #89	-> 342
/*    */     //   #90	-> 356
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   104	8	9	$i$a$-forEach-OpenAISectionValidator$validate$1	I
/*    */     //   101	11	8	it	Lcom/intellij/ml/llm/dokuGuard/openai/ValidationListener;
/*    */     //   94	19	7	element$iv	Ljava/lang/Object;
/*    */     //   66	51	5	$i$f$forEach	I
/*    */     //   63	54	4	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   233	8	14	$i$a$-forEach-OpenAISectionValidator$validate$llmResponse$1$1	I
/*    */     //   230	11	13	it	Lcom/intellij/ml/llm/dokuGuard/openai/ValidationListener;
/*    */     //   223	19	12	element$iv	Ljava/lang/Object;
/*    */     //   195	51	10	$i$f$forEach	I
/*    */     //   192	54	9	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   172	81	8	$i$a$-run-OpenAISectionValidator$validate$llmResponse$1	I
/*    */     //   169	84	7	$this$validate_u24lambda_u242	Lcom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator;
/*    */     //   323	9	11	$i$a$-forEach-OpenAISectionValidator$validate$2	I
/*    */     //   320	12	10	it	Lcom/intellij/ml/llm/dokuGuard/openai/ValidationListener;
/*    */     //   313	20	9	element$iv	Ljava/lang/Object;
/*    */     //   285	52	7	$i$f$forEach	I
/*    */     //   282	55	6	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   19	350	1	language	Ljava/lang/String;
/*    */     //   38	331	2	prompt	Ljava/lang/String;
/*    */     //   54	315	3	request	Ljava/lang/String;
/*    */     //   255	114	4	llmResponse	Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;
/*    */     //   273	96	5	firstSuggestion	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*    */     //   342	27	6	responseParser	Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;
/*    */     //   0	369	0	this	Lcom/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/OpenAISectionValidator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */