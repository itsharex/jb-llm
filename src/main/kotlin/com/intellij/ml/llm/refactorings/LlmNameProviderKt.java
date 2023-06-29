/*    */ package com.intellij.ml.llm.refactorings;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\026\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\005H\002\032I\020\007\032\b\022\004\022\0020\0050\0042\006\020\b\032\0020\t2\006\020\n\032\0020\0052\006\020\013\032\0020\0052\006\020\f\032\0020\0052\b\020\r\032\004\030\0010\0052\006\020\016\032\0020\005H@ø\001\000¢\006\002\020\017\032?\020\020\032\b\022\004\022\0020\0050\0042\006\020\b\032\0020\t2\006\020\021\032\0020\0222\n\b\002\020\r\032\004\030\0010\0052\n\b\002\020\023\032\004\030\0010\024H@ø\001\000¢\006\002\020\025\"\023\020\000\032\0070\001¢\006\002\b\002X\004¢\006\002\n\000\002\004\n\002\b\031¨\006\026"}, d2 = {"nameSuggestionNotifierExecutor", "Ljava/util/concurrent/ExecutorService;", "Lorg/jetbrains/annotations/NotNull;", "parseIdentifiersInEnumeratedList", "", "", "string", "sendRequest", "project", "Lcom/intellij/openapi/project/Project;", "contextPrompt", "objectType", "objectToRename", "prefix", "oldName", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestNames", "element", "Lcom/intellij/psi/PsiElement;", "statistic", "Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Ljava/lang/String;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLlmNameProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmNameProvider.kt\ncom/intellij/ml/llm/refactorings/LlmNameProviderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1603#2,9:67\n1855#2:76\n1856#2:78\n1612#2:79\n766#2:80\n857#2,2:81\n1#3:77\n*S KotlinDebug\n*F\n+ 1 LlmNameProvider.kt\ncom/intellij/ml/llm/refactorings/LlmNameProviderKt\n*L\n21#1:67,9\n21#1:76\n21#1:78\n21#1:79\n34#1:80\n34#1:81,2\n21#1:77\n*E\n"})
/*    */ public final class LlmNameProviderKt {
/*    */   @NotNull
/* 16 */   private static final ExecutorService nameSuggestionNotifierExecutor = SequentialTaskExecutor.createSequentialApplicationPoolExecutor("Llm-name-suggestion-notifier"); static { Intrinsics.checkNotNullExpressionValue(SequentialTaskExecutor.createSequentialApplicationPoolExecutor("Llm-name-suggestion-notifier"), "createSequentialApplicat…ame-suggestion-notifier\")"); }
/*    */   
/*    */   private static final List<String> parseIdentifiersInEnumeratedList(String string) {
/* 19 */     String textToParse = StringsKt.startsWith$default(string, "1.", false, 2, null) ? string : ("1." + string);
/* 20 */     Regex identifierRegex = new Regex("[a-zA-Z_][a-zA-Z0-9_]*");
/* 21 */     String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; Iterable $this$mapNotNull$iv = StringsKt.split$default(textToParse, arrayOfString, false, 0, 6, null); int $i$f$mapNotNull = 0;
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
/*    */ 
/*    */ 
/*    */     
/* 67 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 76 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; String line = (String)element$iv$iv;
/*    */       int $i$a$-mapNotNull-LlmNameProviderKt$parseIdentifiersInEnumeratedList$1 = 0; }
/*    */     
/* 79 */     return (List<String>)destination$iv$iv;
/*    */   }
/*    */   
/*    */   private static final Object sendRequest(Project project, String contextPrompt, String objectType, String objectToRename, String prefix, String oldName, Continuation<? super List<String>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: instanceof com/intellij/ml/llm/refactorings/LlmNameProviderKt$sendRequest$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #6
/*    */     //   10: checkcast com/intellij/ml/llm/refactorings/LlmNameProviderKt$sendRequest$1
/*    */     //   13: astore #20
/*    */     //   15: aload #20
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #20
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 52
/*    */     //   41: new com/intellij/ml/llm/refactorings/LlmNameProviderKt$sendRequest$1
/*    */     //   44: dup
/*    */     //   45: aload #6
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #20
/*    */     //   52: aload #20
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #19
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #21
/*    */     //   64: aload #20
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 317, 0 -> 92, 1 -> 136
/*    */     //   92: aload #19
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload #5
/*    */     //   100: aload_1
/*    */     //   101: aload_2
/*    */     //   102: aload_3
/*    */     //   103: aload #4
/*    */     //   105: aconst_null
/*    */     //   106: aload #20
/*    */     //   108: bipush #64
/*    */     //   110: aconst_null
/*    */     //   111: aload #20
/*    */     //   113: aload #5
/*    */     //   115: putfield L$0 : Ljava/lang/Object;
/*    */     //   118: aload #20
/*    */     //   120: iconst_1
/*    */     //   121: putfield label : I
/*    */     //   124: invokestatic sendNameSuggestionRequest$default : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   127: dup
/*    */     //   128: aload #21
/*    */     //   130: if_acmpne -> 153
/*    */     //   133: aload #21
/*    */     //   135: areturn
/*    */     //   136: aload #20
/*    */     //   138: getfield L$0 : Ljava/lang/Object;
/*    */     //   141: checkcast java/lang/String
/*    */     //   144: astore #5
/*    */     //   146: aload #19
/*    */     //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   151: aload #19
/*    */     //   153: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse
/*    */     //   156: astore #7
/*    */     //   158: aload #7
/*    */     //   160: dup
/*    */     //   161: ifnull -> 312
/*    */     //   164: invokeinterface getSuggestions : ()Ljava/util/List;
/*    */     //   169: dup
/*    */     //   170: ifnull -> 312
/*    */     //   173: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice
/*    */     //   179: dup
/*    */     //   180: ifnull -> 312
/*    */     //   183: astore #8
/*    */     //   185: iconst_0
/*    */     //   186: istore #9
/*    */     //   188: aload #8
/*    */     //   190: invokevirtual getText : ()Ljava/lang/String;
/*    */     //   193: invokestatic parseIdentifiersInEnumeratedList : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   196: checkcast java/lang/Iterable
/*    */     //   199: iconst_5
/*    */     //   200: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*    */     //   203: checkcast java/lang/Iterable
/*    */     //   206: invokestatic distinct : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   209: checkcast java/lang/Iterable
/*    */     //   212: astore #10
/*    */     //   214: iconst_0
/*    */     //   215: istore #11
/*    */     //   217: aload #10
/*    */     //   219: astore #12
/*    */     //   221: new java/util/ArrayList
/*    */     //   224: dup
/*    */     //   225: invokespecial <init> : ()V
/*    */     //   228: checkcast java/util/Collection
/*    */     //   231: astore #13
/*    */     //   233: iconst_0
/*    */     //   234: istore #14
/*    */     //   236: aload #12
/*    */     //   238: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   243: astore #15
/*    */     //   245: aload #15
/*    */     //   247: invokeinterface hasNext : ()Z
/*    */     //   252: ifeq -> 305
/*    */     //   255: aload #15
/*    */     //   257: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   262: astore #16
/*    */     //   264: aload #16
/*    */     //   266: checkcast java/lang/String
/*    */     //   269: astore #17
/*    */     //   271: iconst_0
/*    */     //   272: istore #18
/*    */     //   274: aload #17
/*    */     //   276: aload #5
/*    */     //   278: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   281: ifne -> 288
/*    */     //   284: iconst_1
/*    */     //   285: goto -> 289
/*    */     //   288: iconst_0
/*    */     //   289: ifeq -> 245
/*    */     //   292: aload #13
/*    */     //   294: aload #16
/*    */     //   296: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   301: pop
/*    */     //   302: goto -> 245
/*    */     //   305: aload #13
/*    */     //   307: checkcast java/util/List
/*    */     //   310: nop
/*    */     //   311: areturn
/*    */     //   312: pop
/*    */     //   313: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   316: areturn
/*    */     //   317: new java/lang/IllegalStateException
/*    */     //   320: dup
/*    */     //   321: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   323: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   326: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 62
/*    */     //   #30	-> 97
/*    */     //   #24	-> 133
/*    */     //   #31	-> 158
/*    */     //   #32	-> 188
/*    */     //   #33	-> 206
/*    */     //   #34	-> 214
/*    */     //   #80	-> 217
/*    */     //   #81	-> 236
/*    */     //   #34	-> 274
/*    */     //   #81	-> 289
/*    */     //   #82	-> 305
/*    */     //   #80	-> 310
/*    */     //   #32	-> 311
/*    */     //   #36	-> 313
/*    */     //   #24	-> 317
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	30	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	30	1	contextPrompt	Ljava/lang/String;
/*    */     //   97	30	2	objectType	Ljava/lang/String;
/*    */     //   97	30	3	objectToRename	Ljava/lang/String;
/*    */     //   97	30	4	prefix	Ljava/lang/String;
/*    */     //   97	39	5	oldName	Ljava/lang/String;
/*    */     //   146	159	5	oldName	Ljava/lang/String;
/*    */     //   158	11	7	result	Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;
/*    */     //   185	21	8	it	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*    */     //   214	19	10	$this$filter$iv	Ljava/lang/Iterable;
/*    */     //   233	12	12	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   233	74	13	destination$iv$iv	Ljava/util/Collection;
/*    */     //   264	38	16	element$iv$iv	Ljava/lang/Object;
/*    */     //   271	17	17	name	Ljava/lang/String;
/*    */     //   274	15	18	$i$a$-filter-LlmNameProviderKt$sendRequest$2$1	I
/*    */     //   236	71	14	$i$f$filterTo	I
/*    */     //   217	94	11	$i$f$filter	I
/*    */     //   188	124	9	$i$a$-let-LlmNameProviderKt$sendRequest$2	I
/*    */     //   52	265	20	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	258	19	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final Object suggestNames(@NotNull Project project, @NotNull PsiElement element, @Nullable String prefix, @Nullable CompositeStatisticsIdeActivity statistic, @NotNull Continuation<? super List<String>> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$1
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
/*    */     //   41: new com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$1
/*    */     //   44: dup
/*    */     //   45: aload #4
/*    */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   50: astore #13
/*    */     //   52: aload #13
/*    */     //   54: getfield result : Ljava/lang/Object;
/*    */     //   57: astore #12
/*    */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   62: astore #14
/*    */     //   64: aload #13
/*    */     //   66: getfield label : I
/*    */     //   69: tableswitch default -> 868, 0 -> 108, 1 -> 189, 2 -> 300, 3 -> 428, 4 -> 598, 5 -> 783
/*    */     //   108: aload #12
/*    */     //   110: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   113: getstatic com/intellij/ml/llm/core/grazieAPI/GrazieAuthService.Companion : Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService$Companion;
/*    */     //   116: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthService;
/*    */     //   119: aload_0
/*    */     //   120: invokevirtual waitAndGetAuthStatus : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;
/*    */     //   123: invokestatic isAuthenticated : (Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthState;)Z
/*    */     //   126: ifne -> 133
/*    */     //   129: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   132: areturn
/*    */     //   133: aload_0
/*    */     //   134: new com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$originalName$1
/*    */     //   137: dup
/*    */     //   138: aload_1
/*    */     //   139: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   142: checkcast kotlin/jvm/functions/Function0
/*    */     //   145: aload #13
/*    */     //   147: aload #13
/*    */     //   149: aload_0
/*    */     //   150: putfield L$0 : Ljava/lang/Object;
/*    */     //   153: aload #13
/*    */     //   155: aload_1
/*    */     //   156: putfield L$1 : Ljava/lang/Object;
/*    */     //   159: aload #13
/*    */     //   161: aload_2
/*    */     //   162: putfield L$2 : Ljava/lang/Object;
/*    */     //   165: aload #13
/*    */     //   167: aload_3
/*    */     //   168: putfield L$3 : Ljava/lang/Object;
/*    */     //   171: aload #13
/*    */     //   173: iconst_1
/*    */     //   174: putfield label : I
/*    */     //   177: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   180: dup
/*    */     //   181: aload #14
/*    */     //   183: if_acmpne -> 232
/*    */     //   186: aload #14
/*    */     //   188: areturn
/*    */     //   189: aload #13
/*    */     //   191: getfield L$3 : Ljava/lang/Object;
/*    */     //   194: checkcast com/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity
/*    */     //   197: astore_3
/*    */     //   198: aload #13
/*    */     //   200: getfield L$2 : Ljava/lang/Object;
/*    */     //   203: checkcast java/lang/String
/*    */     //   206: astore_2
/*    */     //   207: aload #13
/*    */     //   209: getfield L$1 : Ljava/lang/Object;
/*    */     //   212: checkcast com/intellij/psi/PsiElement
/*    */     //   215: astore_1
/*    */     //   216: aload #13
/*    */     //   218: getfield L$0 : Ljava/lang/Object;
/*    */     //   221: checkcast com/intellij/openapi/project/Project
/*    */     //   224: astore_0
/*    */     //   225: aload #12
/*    */     //   227: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   230: aload #12
/*    */     //   232: checkcast java/lang/String
/*    */     //   235: astore #5
/*    */     //   237: aload_0
/*    */     //   238: new com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$virtualFile$1
/*    */     //   241: dup
/*    */     //   242: aload_1
/*    */     //   243: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   246: checkcast kotlin/jvm/functions/Function0
/*    */     //   249: aload #13
/*    */     //   251: aload #13
/*    */     //   253: aload_0
/*    */     //   254: putfield L$0 : Ljava/lang/Object;
/*    */     //   257: aload #13
/*    */     //   259: aload_1
/*    */     //   260: putfield L$1 : Ljava/lang/Object;
/*    */     //   263: aload #13
/*    */     //   265: aload_2
/*    */     //   266: putfield L$2 : Ljava/lang/Object;
/*    */     //   269: aload #13
/*    */     //   271: aload_3
/*    */     //   272: putfield L$3 : Ljava/lang/Object;
/*    */     //   275: aload #13
/*    */     //   277: aload #5
/*    */     //   279: putfield L$4 : Ljava/lang/Object;
/*    */     //   282: aload #13
/*    */     //   284: iconst_2
/*    */     //   285: putfield label : I
/*    */     //   288: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   291: dup
/*    */     //   292: aload #14
/*    */     //   294: if_acmpne -> 353
/*    */     //   297: aload #14
/*    */     //   299: areturn
/*    */     //   300: aload #13
/*    */     //   302: getfield L$4 : Ljava/lang/Object;
/*    */     //   305: checkcast java/lang/String
/*    */     //   308: astore #5
/*    */     //   310: aload #13
/*    */     //   312: getfield L$3 : Ljava/lang/Object;
/*    */     //   315: checkcast com/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity
/*    */     //   318: astore_3
/*    */     //   319: aload #13
/*    */     //   321: getfield L$2 : Ljava/lang/Object;
/*    */     //   324: checkcast java/lang/String
/*    */     //   327: astore_2
/*    */     //   328: aload #13
/*    */     //   330: getfield L$1 : Ljava/lang/Object;
/*    */     //   333: checkcast com/intellij/psi/PsiElement
/*    */     //   336: astore_1
/*    */     //   337: aload #13
/*    */     //   339: getfield L$0 : Ljava/lang/Object;
/*    */     //   342: checkcast com/intellij/openapi/project/Project
/*    */     //   345: astore_0
/*    */     //   346: aload #12
/*    */     //   348: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   351: aload #12
/*    */     //   353: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   356: astore #6
/*    */     //   358: aload_0
/*    */     //   359: new com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$textOffset$1
/*    */     //   362: dup
/*    */     //   363: aload_1
/*    */     //   364: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   367: checkcast kotlin/jvm/functions/Function0
/*    */     //   370: aload #13
/*    */     //   372: aload #13
/*    */     //   374: aload_0
/*    */     //   375: putfield L$0 : Ljava/lang/Object;
/*    */     //   378: aload #13
/*    */     //   380: aload_1
/*    */     //   381: putfield L$1 : Ljava/lang/Object;
/*    */     //   384: aload #13
/*    */     //   386: aload_2
/*    */     //   387: putfield L$2 : Ljava/lang/Object;
/*    */     //   390: aload #13
/*    */     //   392: aload_3
/*    */     //   393: putfield L$3 : Ljava/lang/Object;
/*    */     //   396: aload #13
/*    */     //   398: aload #5
/*    */     //   400: putfield L$4 : Ljava/lang/Object;
/*    */     //   403: aload #13
/*    */     //   405: aload #6
/*    */     //   407: putfield L$5 : Ljava/lang/Object;
/*    */     //   410: aload #13
/*    */     //   412: iconst_3
/*    */     //   413: putfield label : I
/*    */     //   416: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   419: dup
/*    */     //   420: aload #14
/*    */     //   422: if_acmpne -> 491
/*    */     //   425: aload #14
/*    */     //   427: areturn
/*    */     //   428: aload #13
/*    */     //   430: getfield L$5 : Ljava/lang/Object;
/*    */     //   433: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   436: astore #6
/*    */     //   438: aload #13
/*    */     //   440: getfield L$4 : Ljava/lang/Object;
/*    */     //   443: checkcast java/lang/String
/*    */     //   446: astore #5
/*    */     //   448: aload #13
/*    */     //   450: getfield L$3 : Ljava/lang/Object;
/*    */     //   453: checkcast com/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity
/*    */     //   456: astore_3
/*    */     //   457: aload #13
/*    */     //   459: getfield L$2 : Ljava/lang/Object;
/*    */     //   462: checkcast java/lang/String
/*    */     //   465: astore_2
/*    */     //   466: aload #13
/*    */     //   468: getfield L$1 : Ljava/lang/Object;
/*    */     //   471: checkcast com/intellij/psi/PsiElement
/*    */     //   474: astore_1
/*    */     //   475: aload #13
/*    */     //   477: getfield L$0 : Ljava/lang/Object;
/*    */     //   480: checkcast com/intellij/openapi/project/Project
/*    */     //   483: astore_0
/*    */     //   484: aload #12
/*    */     //   486: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   489: aload #12
/*    */     //   491: checkcast java/lang/Number
/*    */     //   494: invokevirtual intValue : ()I
/*    */     //   497: istore #7
/*    */     //   499: aload #6
/*    */     //   501: ifnull -> 528
/*    */     //   504: aload #5
/*    */     //   506: ifnull -> 528
/*    */     //   509: getstatic com/intellij/ml/llm/refactorings/LlmNameProviderKt.nameSuggestionNotifierExecutor : Ljava/util/concurrent/ExecutorService;
/*    */     //   512: aload #6
/*    */     //   514: iload #7
/*    */     //   516: aload #5
/*    */     //   518: <illegal opcode> run : (Lcom/intellij/openapi/vfs/VirtualFile;ILjava/lang/String;)Ljava/lang/Runnable;
/*    */     //   523: invokeinterface execute : (Ljava/lang/Runnable;)V
/*    */     //   528: getstatic com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider.Companion : Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion;
/*    */     //   531: aload_0
/*    */     //   532: aload_1
/*    */     //   533: aload #13
/*    */     //   535: aload #13
/*    */     //   537: aload_0
/*    */     //   538: putfield L$0 : Ljava/lang/Object;
/*    */     //   541: aload #13
/*    */     //   543: aload_2
/*    */     //   544: putfield L$1 : Ljava/lang/Object;
/*    */     //   547: aload #13
/*    */     //   549: aload_3
/*    */     //   550: putfield L$2 : Ljava/lang/Object;
/*    */     //   553: aload #13
/*    */     //   555: aload #5
/*    */     //   557: putfield L$3 : Ljava/lang/Object;
/*    */     //   560: aload #13
/*    */     //   562: aload #6
/*    */     //   564: putfield L$4 : Ljava/lang/Object;
/*    */     //   567: aload #13
/*    */     //   569: aconst_null
/*    */     //   570: putfield L$5 : Ljava/lang/Object;
/*    */     //   573: aload #13
/*    */     //   575: iload #7
/*    */     //   577: putfield I$0 : I
/*    */     //   580: aload #13
/*    */     //   582: iconst_4
/*    */     //   583: putfield label : I
/*    */     //   586: invokevirtual getContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   589: dup
/*    */     //   590: aload #14
/*    */     //   592: if_acmpne -> 659
/*    */     //   595: aload #14
/*    */     //   597: areturn
/*    */     //   598: aload #13
/*    */     //   600: getfield I$0 : I
/*    */     //   603: istore #7
/*    */     //   605: aload #13
/*    */     //   607: getfield L$4 : Ljava/lang/Object;
/*    */     //   610: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   613: astore #6
/*    */     //   615: aload #13
/*    */     //   617: getfield L$3 : Ljava/lang/Object;
/*    */     //   620: checkcast java/lang/String
/*    */     //   623: astore #5
/*    */     //   625: aload #13
/*    */     //   627: getfield L$2 : Ljava/lang/Object;
/*    */     //   630: checkcast com/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity
/*    */     //   633: astore_3
/*    */     //   634: aload #13
/*    */     //   636: getfield L$1 : Ljava/lang/Object;
/*    */     //   639: checkcast java/lang/String
/*    */     //   642: astore_2
/*    */     //   643: aload #13
/*    */     //   645: getfield L$0 : Ljava/lang/Object;
/*    */     //   648: checkcast com/intellij/openapi/project/Project
/*    */     //   651: astore_0
/*    */     //   652: aload #12
/*    */     //   654: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   657: aload #12
/*    */     //   659: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   662: astore #8
/*    */     //   664: aload #8
/*    */     //   666: dup
/*    */     //   667: ifnull -> 828
/*    */     //   670: astore #10
/*    */     //   672: iconst_0
/*    */     //   673: istore #11
/*    */     //   675: aload_3
/*    */     //   676: ifnull -> 699
/*    */     //   679: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*    */     //   682: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*    */     //   685: aload_3
/*    */     //   686: aload #10
/*    */     //   688: invokevirtual getOriginalName : ()Ljava/lang/String;
/*    */     //   691: aload #10
/*    */     //   693: invokevirtual getContext : ()Ljava/lang/String;
/*    */     //   696: invokevirtual logSendNameSuggestionRequest : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   699: aload_0
/*    */     //   700: aload #10
/*    */     //   702: invokevirtual getContext : ()Ljava/lang/String;
/*    */     //   705: aload #10
/*    */     //   707: invokevirtual getObjectType : ()Lcom/intellij/ml/llm/core/refactoring/ObjectType;
/*    */     //   710: invokevirtual getPrompt : ()Ljava/lang/String;
/*    */     //   713: aload #10
/*    */     //   715: invokevirtual getPlaceholderName : ()Ljava/lang/String;
/*    */     //   718: aload_2
/*    */     //   719: aload #10
/*    */     //   721: invokevirtual getOriginalName : ()Ljava/lang/String;
/*    */     //   724: aload #13
/*    */     //   726: aload #13
/*    */     //   728: aload #5
/*    */     //   730: putfield L$0 : Ljava/lang/Object;
/*    */     //   733: aload #13
/*    */     //   735: aload #6
/*    */     //   737: putfield L$1 : Ljava/lang/Object;
/*    */     //   740: aload #13
/*    */     //   742: aconst_null
/*    */     //   743: putfield L$2 : Ljava/lang/Object;
/*    */     //   746: aload #13
/*    */     //   748: aconst_null
/*    */     //   749: putfield L$3 : Ljava/lang/Object;
/*    */     //   752: aload #13
/*    */     //   754: aconst_null
/*    */     //   755: putfield L$4 : Ljava/lang/Object;
/*    */     //   758: aload #13
/*    */     //   760: iload #7
/*    */     //   762: putfield I$0 : I
/*    */     //   765: aload #13
/*    */     //   767: iconst_5
/*    */     //   768: putfield label : I
/*    */     //   771: invokestatic sendRequest : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   774: dup
/*    */     //   775: aload #14
/*    */     //   777: if_acmpne -> 820
/*    */     //   780: aload #14
/*    */     //   782: areturn
/*    */     //   783: iconst_0
/*    */     //   784: istore #11
/*    */     //   786: aload #13
/*    */     //   788: getfield I$0 : I
/*    */     //   791: istore #7
/*    */     //   793: aload #13
/*    */     //   795: getfield L$1 : Ljava/lang/Object;
/*    */     //   798: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   801: astore #6
/*    */     //   803: aload #13
/*    */     //   805: getfield L$0 : Ljava/lang/Object;
/*    */     //   808: checkcast java/lang/String
/*    */     //   811: astore #5
/*    */     //   813: aload #12
/*    */     //   815: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   818: aload #12
/*    */     //   820: checkcast java/util/List
/*    */     //   823: nop
/*    */     //   824: dup
/*    */     //   825: ifnonnull -> 832
/*    */     //   828: pop
/*    */     //   829: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   832: astore #9
/*    */     //   834: aload #6
/*    */     //   836: ifnull -> 865
/*    */     //   839: aload #5
/*    */     //   841: ifnull -> 865
/*    */     //   844: getstatic com/intellij/ml/llm/refactorings/LlmNameProviderKt.nameSuggestionNotifierExecutor : Ljava/util/concurrent/ExecutorService;
/*    */     //   847: aload #6
/*    */     //   849: iload #7
/*    */     //   851: aload #5
/*    */     //   853: aload #9
/*    */     //   855: <illegal opcode> run : (Lcom/intellij/openapi/vfs/VirtualFile;ILjava/lang/String;Ljava/util/List;)Ljava/lang/Runnable;
/*    */     //   860: invokeinterface execute : (Ljava/lang/Runnable;)V
/*    */     //   865: aload #9
/*    */     //   867: areturn
/*    */     //   868: new java/lang/IllegalStateException
/*    */     //   871: dup
/*    */     //   872: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   874: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   877: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 62
/*    */     //   #40	-> 113
/*    */     //   #41	-> 133
/*    */     //   #39	-> 186
/*    */     //   #42	-> 237
/*    */     //   #39	-> 297
/*    */     //   #43	-> 358
/*    */     //   #39	-> 425
/*    */     //   #43	-> 491
/*    */     //   #44	-> 499
/*    */     //   #45	-> 509
/*    */     //   #51	-> 528
/*    */     //   #39	-> 595
/*    */     //   #52	-> 664
/*    */     //   #53	-> 675
/*    */     //   #54	-> 679
/*    */     //   #56	-> 699
/*    */     //   #39	-> 780
/*    */     //   #56	-> 820
/*    */     //   #52	-> 823
/*    */     //   #52	-> 824
/*    */     //   #57	-> 829
/*    */     //   #52	-> 832
/*    */     //   #58	-> 834
/*    */     //   #59	-> 844
/*    */     //   #65	-> 865
/*    */     //   #39	-> 868
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   113	76	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   225	75	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   346	82	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   484	114	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   652	122	0	project	Lcom/intellij/openapi/project/Project;
/*    */     //   113	76	1	element	Lcom/intellij/psi/PsiElement;
/*    */     //   216	84	1	element	Lcom/intellij/psi/PsiElement;
/*    */     //   337	91	1	element	Lcom/intellij/psi/PsiElement;
/*    */     //   475	114	1	element	Lcom/intellij/psi/PsiElement;
/*    */     //   113	76	2	prefix	Ljava/lang/String;
/*    */     //   207	93	2	prefix	Ljava/lang/String;
/*    */     //   328	100	2	prefix	Ljava/lang/String;
/*    */     //   466	132	2	prefix	Ljava/lang/String;
/*    */     //   643	131	2	prefix	Ljava/lang/String;
/*    */     //   113	76	3	statistic	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */     //   198	102	3	statistic	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */     //   319	109	3	statistic	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */     //   457	141	3	statistic	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */     //   634	65	3	statistic	Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */     //   237	63	5	originalName	Ljava/lang/String;
/*    */     //   310	118	5	originalName	Ljava/lang/String;
/*    */     //   448	150	5	originalName	Ljava/lang/String;
/*    */     //   625	158	5	originalName	Ljava/lang/String;
/*    */     //   813	10	5	originalName	Ljava/lang/String;
/*    */     //   823	1	5	originalName	Ljava/lang/String;
/*    */     //   824	41	5	originalName	Ljava/lang/String;
/*    */     //   358	70	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   438	160	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   615	168	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   803	20	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   823	1	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   824	41	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   499	99	7	textOffset	I
/*    */     //   605	178	7	textOffset	I
/*    */     //   793	30	7	textOffset	I
/*    */     //   823	1	7	textOffset	I
/*    */     //   824	41	7	textOffset	I
/*    */     //   664	6	8	nameSuggestionContext	Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;
/*    */     //   834	34	9	names	Ljava/util/List;
/*    */     //   672	102	10	it	Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;
/*    */     //   675	108	11	$i$a$-let-LlmNameProviderKt$suggestNames$names$1	I
/*    */     //   52	816	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   59	809	12	$result	Ljava/lang/Object;
/*    */     //   786	37	11	$i$a$-let-LlmNameProviderKt$suggestNames$names$1	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LlmNameProvider.kt", l = {30}, i = {0}, s = {"L$0"}, n = {"oldName"}, m = "sendRequest", c = "com.intellij.ml.llm.refactorings.LlmNameProviderKt")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class LlmNameProviderKt$sendRequest$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LlmNameProviderKt$sendRequest$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LlmNameProviderKt.sendRequest(null, null, null, null, null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LlmNameProvider.kt", l = {41, 42, 43, 51, 56}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "I$0"}, n = {"project", "element", "prefix", "statistic", "project", "element", "prefix", "statistic", "originalName", "project", "element", "prefix", "statistic", "originalName", "virtualFile", "project", "prefix", "statistic", "originalName", "virtualFile", "textOffset", "originalName", "virtualFile", "textOffset"}, m = "suggestNames", c = "com.intellij.ml.llm.refactorings.LlmNameProviderKt")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class LlmNameProviderKt$suggestNames$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     int I$0;
/*    */     int label;
/*    */     
/*    */     LlmNameProviderKt$suggestNames$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LlmNameProviderKt.suggestNames(null, null, null, null, (Continuation<? super List<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\002\020\000\032\036 \004*\016\030\0010\001¢\006\002\b\002¢\006\002\b\0030\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "kotlin.jvm.PlatformType", "invoke"})
/*    */   static final class LlmNameProviderKt$suggestNames$originalName$1 extends Lambda implements Function0<String> {
/*    */     LlmNameProviderKt$suggestNames$originalName$1(PsiElement $element) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       PsiElement psiElement = this.$element;
/*    */       if (((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null) == null || ((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null).getName() == null)
/*    */         ((psiElement instanceof com.intellij.psi.PsiNamedElement) ? psiElement : null).getName(); 
/*    */       return this.$element.getText();
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/openapi/vfs/VirtualFile;", "invoke"})
/*    */   static final class LlmNameProviderKt$suggestNames$virtualFile$1 extends Lambda implements Function0<VirtualFile> {
/*    */     LlmNameProviderKt$suggestNames$virtualFile$1(PsiElement $element) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final VirtualFile invoke() {
/*    */       this.$element.getContainingFile();
/*    */       return (this.$element.getContainingFile() != null) ? this.$element.getContainingFile().getVirtualFile() : null;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"})
/*    */   static final class LlmNameProviderKt$suggestNames$textOffset$1 extends Lambda implements Function0<Integer> {
/*    */     LlmNameProviderKt$suggestNames$textOffset$1(PsiElement $element) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Integer invoke() {
/*    */       return Integer.valueOf(this.$element.getTextOffset());
/*    */     }
/*    */   }
/*    */   
/*    */   private static final void suggestNames$lambda$3(VirtualFile $virtualFile, int $textOffset, String $originalName) {
/*    */     Intrinsics.checkNotNullExpressionValue($originalName, "originalName");
/*    */     ((NameSuggestionListener)ApplicationManager.getApplication().getMessageBus().syncPublisher(NameSuggestionListenerKt.getNameSuggestionTopic())).onStart($virtualFile, $textOffset, $originalName);
/*    */   }
/*    */   
/*    */   private static final void suggestNames$lambda$5(VirtualFile $virtualFile, int $textOffset, String $originalName, List<String> $names) {
/*    */     Intrinsics.checkNotNullParameter($names, "$names");
/*    */     Intrinsics.checkNotNullExpressionValue($originalName, "originalName");
/*    */     ((NameSuggestionListener)ApplicationManager.getApplication().getMessageBus().syncPublisher(NameSuggestionListenerKt.getNameSuggestionTopic())).onFinish($virtualFile, $textOffset, $originalName, $names);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmNameProviderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */