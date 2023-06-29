/*    */ package com.intellij.ml.llm.kotlin.refactorings;import kotlin.coroutines.Continuation;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\005¢\006\002\020\002J#\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\tJ!\020\n\032\0020\0042\006\020\005\032\0020\0062\006\020\013\032\0020\fH@ø\001\000¢\006\002\020\rJ!\020\016\032\0020\0042\006\020\005\032\0020\0062\006\020\017\032\0020\020H@ø\001\000¢\006\002\020\021J!\020\022\032\0020\0042\006\020\005\032\0020\0062\006\020\023\032\0020\024H@ø\001\000¢\006\002\020\025\002\004\n\002\b\031¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider;", "()V", "getContext", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "project", "Lcom/intellij/openapi/project/Project;", "element", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestClassNames", "clazz", "Lorg/jetbrains/kotlin/psi/KtClass;", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestFunctionNames", "function", "Lorg/jetbrains/kotlin/psi/KtFunction;", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestVariableNames", "variable", "Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm.kotlin"})
/*    */ @VisibleForTesting
/*    */ public final class KotlinNameSuggestionContextProvider implements NameSuggestionContextProvider { @Nullable
/*    */   public Object getContext(@NotNull Project project, @NotNull PsiElement element, @NotNull Continuation<? super NameSuggestionContext> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 535, 0 -> 112, 1 -> 168, 2 -> 241, 3 -> 286, 4 -> 359, 5 -> 429, 6 -> 472, 7 -> 520
/*    */     //   112: aload #8
/*    */     //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   117: aload_2
/*    */     //   118: instanceof org/jetbrains/uast/UReferenceExpression
/*    */     //   121: ifeq -> 249
/*    */     //   124: aload_1
/*    */     //   125: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$resolvedElement$1
/*    */     //   128: dup
/*    */     //   129: aload_2
/*    */     //   130: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   133: checkcast kotlin/jvm/functions/Function0
/*    */     //   136: aload #9
/*    */     //   138: aload #9
/*    */     //   140: aload_0
/*    */     //   141: putfield L$0 : Ljava/lang/Object;
/*    */     //   144: aload #9
/*    */     //   146: aload_1
/*    */     //   147: putfield L$1 : Ljava/lang/Object;
/*    */     //   150: aload #9
/*    */     //   152: iconst_1
/*    */     //   153: putfield label : I
/*    */     //   156: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   159: dup
/*    */     //   160: aload #10
/*    */     //   162: if_acmpne -> 193
/*    */     //   165: aload #10
/*    */     //   167: areturn
/*    */     //   168: aload #9
/*    */     //   170: getfield L$1 : Ljava/lang/Object;
/*    */     //   173: checkcast com/intellij/openapi/project/Project
/*    */     //   176: astore_1
/*    */     //   177: aload #9
/*    */     //   179: getfield L$0 : Ljava/lang/Object;
/*    */     //   182: checkcast com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider
/*    */     //   185: astore_0
/*    */     //   186: aload #8
/*    */     //   188: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   191: aload #8
/*    */     //   193: checkcast com/intellij/psi/PsiElement
/*    */     //   196: dup
/*    */     //   197: ifnonnull -> 203
/*    */     //   200: pop
/*    */     //   201: aconst_null
/*    */     //   202: areturn
/*    */     //   203: astore #4
/*    */     //   205: aload_0
/*    */     //   206: aload_1
/*    */     //   207: aload #4
/*    */     //   209: aload #9
/*    */     //   211: aload #9
/*    */     //   213: aconst_null
/*    */     //   214: putfield L$0 : Ljava/lang/Object;
/*    */     //   217: aload #9
/*    */     //   219: aconst_null
/*    */     //   220: putfield L$1 : Ljava/lang/Object;
/*    */     //   223: aload #9
/*    */     //   225: iconst_2
/*    */     //   226: putfield label : I
/*    */     //   229: invokevirtual getContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   232: dup
/*    */     //   233: aload #10
/*    */     //   235: if_acmpne -> 248
/*    */     //   238: aload #10
/*    */     //   240: areturn
/*    */     //   241: aload #8
/*    */     //   243: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   246: aload #8
/*    */     //   248: areturn
/*    */     //   249: aload_2
/*    */     //   250: astore #4
/*    */     //   252: aload #4
/*    */     //   254: instanceof org/jetbrains/kotlin/psi/KtClass
/*    */     //   257: ifeq -> 299
/*    */     //   260: aload_0
/*    */     //   261: aload_1
/*    */     //   262: aload_2
/*    */     //   263: checkcast org/jetbrains/kotlin/psi/KtClass
/*    */     //   266: aload #9
/*    */     //   268: aload #9
/*    */     //   270: iconst_3
/*    */     //   271: putfield label : I
/*    */     //   274: invokespecial suggestClassNames : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   277: dup
/*    */     //   278: aload #10
/*    */     //   280: if_acmpne -> 293
/*    */     //   283: aload #10
/*    */     //   285: areturn
/*    */     //   286: aload #8
/*    */     //   288: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   291: aload #8
/*    */     //   293: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   296: goto -> 534
/*    */     //   299: aload #4
/*    */     //   301: instanceof org/jetbrains/kotlin/psi/KtConstructor
/*    */     //   304: ifeq -> 437
/*    */     //   307: aload_0
/*    */     //   308: aload_1
/*    */     //   309: astore #6
/*    */     //   311: astore #5
/*    */     //   313: aload_1
/*    */     //   314: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$2
/*    */     //   317: dup
/*    */     //   318: aload_2
/*    */     //   319: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   322: checkcast kotlin/jvm/functions/Function0
/*    */     //   325: aload #9
/*    */     //   327: aload #9
/*    */     //   329: aload #5
/*    */     //   331: putfield L$0 : Ljava/lang/Object;
/*    */     //   334: aload #9
/*    */     //   336: aload #6
/*    */     //   338: putfield L$1 : Ljava/lang/Object;
/*    */     //   341: aload #9
/*    */     //   343: iconst_4
/*    */     //   344: putfield label : I
/*    */     //   347: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   350: dup
/*    */     //   351: aload #10
/*    */     //   353: if_acmpne -> 386
/*    */     //   356: aload #10
/*    */     //   358: areturn
/*    */     //   359: aload #9
/*    */     //   361: getfield L$1 : Ljava/lang/Object;
/*    */     //   364: checkcast com/intellij/openapi/project/Project
/*    */     //   367: astore #6
/*    */     //   369: aload #9
/*    */     //   371: getfield L$0 : Ljava/lang/Object;
/*    */     //   374: checkcast com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider
/*    */     //   377: astore #5
/*    */     //   379: aload #8
/*    */     //   381: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   384: aload #8
/*    */     //   386: astore #7
/*    */     //   388: aload #5
/*    */     //   390: aload #6
/*    */     //   392: aload #7
/*    */     //   394: checkcast com/intellij/psi/PsiElement
/*    */     //   397: aload #9
/*    */     //   399: aload #9
/*    */     //   401: aconst_null
/*    */     //   402: putfield L$0 : Ljava/lang/Object;
/*    */     //   405: aload #9
/*    */     //   407: aconst_null
/*    */     //   408: putfield L$1 : Ljava/lang/Object;
/*    */     //   411: aload #9
/*    */     //   413: iconst_5
/*    */     //   414: putfield label : I
/*    */     //   417: invokevirtual getContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   420: dup
/*    */     //   421: aload #10
/*    */     //   423: if_acmpne -> 436
/*    */     //   426: aload #10
/*    */     //   428: areturn
/*    */     //   429: aload #8
/*    */     //   431: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   434: aload #8
/*    */     //   436: areturn
/*    */     //   437: aload #4
/*    */     //   439: instanceof org/jetbrains/kotlin/psi/KtFunction
/*    */     //   442: ifeq -> 485
/*    */     //   445: aload_0
/*    */     //   446: aload_1
/*    */     //   447: aload_2
/*    */     //   448: checkcast org/jetbrains/kotlin/psi/KtFunction
/*    */     //   451: aload #9
/*    */     //   453: aload #9
/*    */     //   455: bipush #6
/*    */     //   457: putfield label : I
/*    */     //   460: invokespecial suggestFunctionNames : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   463: dup
/*    */     //   464: aload #10
/*    */     //   466: if_acmpne -> 479
/*    */     //   469: aload #10
/*    */     //   471: areturn
/*    */     //   472: aload #8
/*    */     //   474: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   477: aload #8
/*    */     //   479: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   482: goto -> 534
/*    */     //   485: aload #4
/*    */     //   487: instanceof org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*    */     //   490: ifeq -> 533
/*    */     //   493: aload_0
/*    */     //   494: aload_1
/*    */     //   495: aload_2
/*    */     //   496: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*    */     //   499: aload #9
/*    */     //   501: aload #9
/*    */     //   503: bipush #7
/*    */     //   505: putfield label : I
/*    */     //   508: invokespecial suggestVariableNames : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   511: dup
/*    */     //   512: aload #10
/*    */     //   514: if_acmpne -> 527
/*    */     //   517: aload #10
/*    */     //   519: areturn
/*    */     //   520: aload #8
/*    */     //   522: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   525: aload #8
/*    */     //   527: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   530: goto -> 534
/*    */     //   533: aconst_null
/*    */     //   534: areturn
/*    */     //   535: new java/lang/IllegalStateException
/*    */     //   538: dup
/*    */     //   539: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   541: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   544: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #20	-> 117
/*    */     //   #21	-> 124
/*    */     //   #19	-> 165
/*    */     //   #21	-> 193
/*    */     //   #22	-> 205
/*    */     //   #19	-> 238
/*    */     //   #24	-> 248
/*    */     //   #25	-> 252
/*    */     //   #19	-> 283
/*    */     //   #25	-> 293
/*    */     //   #26	-> 299
/*    */     //   #19	-> 356
/*    */     //   #26	-> 386
/*    */     //   #19	-> 426
/*    */     //   #31	-> 436
/*    */     //   #27	-> 437
/*    */     //   #19	-> 469
/*    */     //   #27	-> 479
/*    */     //   #28	-> 485
/*    */     //   #19	-> 517
/*    */     //   #28	-> 527
/*    */     //   #29	-> 533
/*    */     //   #24	-> 534
/*    */     //   #19	-> 535
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	51	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   186	14	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   203	29	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   249	28	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   299	51	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   437	26	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   485	26	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;
/*    */     //   117	51	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   177	23	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   203	29	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   249	28	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   299	51	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   437	26	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   485	26	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   117	42	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   249	28	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   299	51	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   437	26	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   485	26	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   205	27	4	resolvedElement	Lcom/intellij/psi/PsiElement;
/*    */     //   50	485	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	478	8	$result	Ljava/lang/Object;
/*    */   } @DebugMetadata(f = "KotlinNameSuggestionContextProvider.kt", l = {21, 22, 25, 26, 26, 27, 28}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "project"}, m = "getContext", c = "com.intellij.ml.llm.kotlin.refactorings.KotlinNameSuggestionContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class KotlinNameSuggestionContextProvider$getContext$1 extends ContinuationImpl { Object L$0; Object L$1; int label; KotlinNameSuggestionContextProvider$getContext$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return KotlinNameSuggestionContextProvider.this.getContext(null, null, (Continuation<? super NameSuggestionContext>)this);
/*    */     } }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */   static final class KotlinNameSuggestionContextProvider$getContext$resolvedElement$1 extends Lambda implements Function0<PsiElement> {
/*    */     @Nullable
/* 21 */     public final PsiElement invoke() { ((UReferenceExpression)this.$element).resolve(); return (((UReferenceExpression)this.$element).resolve() != null) ? ((UReferenceExpression)this.$element).resolve().getNavigationElement() : null; } KotlinNameSuggestionContextProvider$getContext$resolvedElement$1(PsiElement $element) { super(0); }
/*    */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/kotlin/psi/KtClassOrObject;", "invoke"})
/*    */   static final class KotlinNameSuggestionContextProvider$getContext$2 extends Lambda implements Function0<KtClassOrObject> {
/*    */     KotlinNameSuggestionContextProvider$getContext$2(PsiElement $element) { super(0); } @NotNull
/*    */     public final KtClassOrObject invoke() {
/* 26 */       return ((KtConstructor)this.$element).getContainingClassOrObject(); }
/*    */   } private final Object suggestClassNames(Project project, KtClass clazz, Continuation<? super NameSuggestionContext> paramContinuation) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestClassNames$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestClassNames$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestClassNames$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #16
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 333, 0 -> 92, 1 -> 152, 2 -> 259
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: ldc 'X'
/*    */     //   99: astore #4
/*    */     //   101: aload_1
/*    */     //   102: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestClassNames$originalName$1
/*    */     //   105: dup
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtClass;)V
/*    */     //   110: checkcast kotlin/jvm/functions/Function0
/*    */     //   113: aload #11
/*    */     //   115: aload #11
/*    */     //   117: aload_1
/*    */     //   118: putfield L$0 : Ljava/lang/Object;
/*    */     //   121: aload #11
/*    */     //   123: aload_2
/*    */     //   124: putfield L$1 : Ljava/lang/Object;
/*    */     //   127: aload #11
/*    */     //   129: aload #4
/*    */     //   131: putfield L$2 : Ljava/lang/Object;
/*    */     //   134: aload #11
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #16
/*    */     //   146: if_acmpne -> 187
/*    */     //   149: aload #16
/*    */     //   151: areturn
/*    */     //   152: aload #11
/*    */     //   154: getfield L$2 : Ljava/lang/Object;
/*    */     //   157: checkcast java/lang/String
/*    */     //   160: astore #4
/*    */     //   162: aload #11
/*    */     //   164: getfield L$1 : Ljava/lang/Object;
/*    */     //   167: checkcast org/jetbrains/kotlin/psi/KtClass
/*    */     //   170: astore_2
/*    */     //   171: aload #11
/*    */     //   173: getfield L$0 : Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/openapi/project/Project
/*    */     //   179: astore_1
/*    */     //   180: aload #10
/*    */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   185: aload #10
/*    */     //   187: dup
/*    */     //   188: ldc 'clazz: KtClass): NameSug…ect) { clazz.name ?: "" }'
/*    */     //   190: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   193: checkcast java/lang/String
/*    */     //   196: astore #5
/*    */     //   198: aload #4
/*    */     //   200: aload #5
/*    */     //   202: getstatic com/intellij/ml/llm/core/refactoring/ObjectType.CLASS : Lcom/intellij/ml/llm/core/refactoring/ObjectType;
/*    */     //   205: astore #8
/*    */     //   207: astore #7
/*    */     //   209: astore #6
/*    */     //   211: getstatic com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector;
/*    */     //   214: aload_1
/*    */     //   215: aload_2
/*    */     //   216: aload #4
/*    */     //   218: aload #11
/*    */     //   220: aload #11
/*    */     //   222: aload #6
/*    */     //   224: putfield L$0 : Ljava/lang/Object;
/*    */     //   227: aload #11
/*    */     //   229: aload #7
/*    */     //   231: putfield L$1 : Ljava/lang/Object;
/*    */     //   234: aload #11
/*    */     //   236: aload #8
/*    */     //   238: putfield L$2 : Ljava/lang/Object;
/*    */     //   241: aload #11
/*    */     //   243: iconst_2
/*    */     //   244: putfield label : I
/*    */     //   247: invokevirtual createContextPrompt : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   250: dup
/*    */     //   251: aload #16
/*    */     //   253: if_acmpne -> 296
/*    */     //   256: aload #16
/*    */     //   258: areturn
/*    */     //   259: aload #11
/*    */     //   261: getfield L$2 : Ljava/lang/Object;
/*    */     //   264: checkcast com/intellij/ml/llm/core/refactoring/ObjectType
/*    */     //   267: astore #8
/*    */     //   269: aload #11
/*    */     //   271: getfield L$1 : Ljava/lang/Object;
/*    */     //   274: checkcast java/lang/String
/*    */     //   277: astore #7
/*    */     //   279: aload #11
/*    */     //   281: getfield L$0 : Ljava/lang/Object;
/*    */     //   284: checkcast java/lang/String
/*    */     //   287: astore #6
/*    */     //   289: aload #10
/*    */     //   291: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   294: aload #10
/*    */     //   296: astore #9
/*    */     //   298: aload #6
/*    */     //   300: aload #7
/*    */     //   302: aload #8
/*    */     //   304: aload #9
/*    */     //   306: checkcast java/lang/String
/*    */     //   309: astore #12
/*    */     //   311: astore #13
/*    */     //   313: astore #14
/*    */     //   315: astore #15
/*    */     //   317: new com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   320: dup
/*    */     //   321: aload #15
/*    */     //   323: aload #14
/*    */     //   325: aload #13
/*    */     //   327: aload #12
/*    */     //   329: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/refactoring/ObjectType;Ljava/lang/String;)V
/*    */     //   332: areturn
/*    */     //   333: new java/lang/IllegalStateException
/*    */     //   336: dup
/*    */     //   337: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   339: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   342: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 60
/*    */     //   #34	-> 97
/*    */     //   #35	-> 101
/*    */     //   #33	-> 149
/*    */     //   #35	-> 187
/*    */     //   #36	-> 198
/*    */     //   #37	-> 198
/*    */     //   #38	-> 200
/*    */     //   #39	-> 202
/*    */     //   #40	-> 211
/*    */     //   #33	-> 256
/*    */     //   #36	-> 309
/*    */     //   #33	-> 333
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	55	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   180	70	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	55	2	clazz	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   171	79	2	clazz	Lorg/jetbrains/kotlin/psi/KtClass;
/*    */     //   101	51	4	newName	Ljava/lang/String;
/*    */     //   162	88	4	newName	Ljava/lang/String;
/*    */     //   198	4	5	originalName	Ljava/lang/String;
/*    */     //   50	283	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	276	10	$result	Ljava/lang/Object; } @DebugMetadata(f = "KotlinNameSuggestionContextProvider.kt", l = {35, 40}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "clazz", "newName"}, m = "suggestClassNames", c = "com.intellij.ml.llm.kotlin.refactorings.KotlinNameSuggestionContextProvider") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48) static final class KotlinNameSuggestionContextProvider$suggestClassNames$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; int label;
/*    */     KotlinNameSuggestionContextProvider$suggestClassNames$1(Continuation $completion) { super($completion); }
/*    */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return KotlinNameSuggestionContextProvider.this.suggestClassNames(null, null, (Continuation)this); } }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class KotlinNameSuggestionContextProvider$suggestClassNames$originalName$1 extends Lambda implements Function0<String> { KotlinNameSuggestionContextProvider$suggestClassNames$originalName$1(KtClass $clazz) { super(0); }
/*    */     @NotNull
/* 35 */     public final String invoke() { if (this.$clazz.getName() == null) this.$clazz.getName();  return ""; } } private final Object suggestFunctionNames(Project project, KtFunction function, Continuation<? super NameSuggestionContext> paramContinuation) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestFunctionNames$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestFunctionNames$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestFunctionNames$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #16
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 333, 0 -> 92, 1 -> 152, 2 -> 259
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: ldc 'x'
/*    */     //   99: astore #4
/*    */     //   101: aload_1
/*    */     //   102: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestFunctionNames$originalName$1
/*    */     //   105: dup
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtFunction;)V
/*    */     //   110: checkcast kotlin/jvm/functions/Function0
/*    */     //   113: aload #11
/*    */     //   115: aload #11
/*    */     //   117: aload_1
/*    */     //   118: putfield L$0 : Ljava/lang/Object;
/*    */     //   121: aload #11
/*    */     //   123: aload_2
/*    */     //   124: putfield L$1 : Ljava/lang/Object;
/*    */     //   127: aload #11
/*    */     //   129: aload #4
/*    */     //   131: putfield L$2 : Ljava/lang/Object;
/*    */     //   134: aload #11
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #16
/*    */     //   146: if_acmpne -> 187
/*    */     //   149: aload #16
/*    */     //   151: areturn
/*    */     //   152: aload #11
/*    */     //   154: getfield L$2 : Ljava/lang/Object;
/*    */     //   157: checkcast java/lang/String
/*    */     //   160: astore #4
/*    */     //   162: aload #11
/*    */     //   164: getfield L$1 : Ljava/lang/Object;
/*    */     //   167: checkcast org/jetbrains/kotlin/psi/KtFunction
/*    */     //   170: astore_2
/*    */     //   171: aload #11
/*    */     //   173: getfield L$0 : Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/openapi/project/Project
/*    */     //   179: astore_1
/*    */     //   180: aload #10
/*    */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   185: aload #10
/*    */     //   187: dup
/*    */     //   188: ldc 'function: KtFunction): N…) { function.name ?: "" }'
/*    */     //   190: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   193: checkcast java/lang/String
/*    */     //   196: astore #5
/*    */     //   198: aload #4
/*    */     //   200: aload #5
/*    */     //   202: getstatic com/intellij/ml/llm/core/refactoring/ObjectType.METHOD : Lcom/intellij/ml/llm/core/refactoring/ObjectType;
/*    */     //   205: astore #8
/*    */     //   207: astore #7
/*    */     //   209: astore #6
/*    */     //   211: getstatic com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector;
/*    */     //   214: aload_1
/*    */     //   215: aload_2
/*    */     //   216: aload #4
/*    */     //   218: aload #11
/*    */     //   220: aload #11
/*    */     //   222: aload #6
/*    */     //   224: putfield L$0 : Ljava/lang/Object;
/*    */     //   227: aload #11
/*    */     //   229: aload #7
/*    */     //   231: putfield L$1 : Ljava/lang/Object;
/*    */     //   234: aload #11
/*    */     //   236: aload #8
/*    */     //   238: putfield L$2 : Ljava/lang/Object;
/*    */     //   241: aload #11
/*    */     //   243: iconst_2
/*    */     //   244: putfield label : I
/*    */     //   247: invokevirtual createContextPrompt : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtFunction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   250: dup
/*    */     //   251: aload #16
/*    */     //   253: if_acmpne -> 296
/*    */     //   256: aload #16
/*    */     //   258: areturn
/*    */     //   259: aload #11
/*    */     //   261: getfield L$2 : Ljava/lang/Object;
/*    */     //   264: checkcast com/intellij/ml/llm/core/refactoring/ObjectType
/*    */     //   267: astore #8
/*    */     //   269: aload #11
/*    */     //   271: getfield L$1 : Ljava/lang/Object;
/*    */     //   274: checkcast java/lang/String
/*    */     //   277: astore #7
/*    */     //   279: aload #11
/*    */     //   281: getfield L$0 : Ljava/lang/Object;
/*    */     //   284: checkcast java/lang/String
/*    */     //   287: astore #6
/*    */     //   289: aload #10
/*    */     //   291: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   294: aload #10
/*    */     //   296: astore #9
/*    */     //   298: aload #6
/*    */     //   300: aload #7
/*    */     //   302: aload #8
/*    */     //   304: aload #9
/*    */     //   306: checkcast java/lang/String
/*    */     //   309: astore #12
/*    */     //   311: astore #13
/*    */     //   313: astore #14
/*    */     //   315: astore #15
/*    */     //   317: new com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   320: dup
/*    */     //   321: aload #15
/*    */     //   323: aload #14
/*    */     //   325: aload #13
/*    */     //   327: aload #12
/*    */     //   329: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/refactoring/ObjectType;Ljava/lang/String;)V
/*    */     //   332: areturn
/*    */     //   333: new java/lang/IllegalStateException
/*    */     //   336: dup
/*    */     //   337: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   339: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   342: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 60
/*    */     //   #45	-> 97
/*    */     //   #46	-> 101
/*    */     //   #44	-> 149
/*    */     //   #46	-> 187
/*    */     //   #47	-> 198
/*    */     //   #48	-> 198
/*    */     //   #49	-> 200
/*    */     //   #50	-> 202
/*    */     //   #51	-> 211
/*    */     //   #44	-> 256
/*    */     //   #47	-> 309
/*    */     //   #44	-> 333
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	55	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   180	70	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	55	2	function	Lorg/jetbrains/kotlin/psi/KtFunction;
/*    */     //   171	79	2	function	Lorg/jetbrains/kotlin/psi/KtFunction;
/*    */     //   101	51	4	newMethodName	Ljava/lang/String;
/*    */     //   162	88	4	newMethodName	Ljava/lang/String;
/*    */     //   198	4	5	originalName	Ljava/lang/String;
/*    */     //   50	283	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	276	10	$result	Ljava/lang/Object; } @DebugMetadata(f = "KotlinNameSuggestionContextProvider.kt", l = {46, 51}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "function", "newMethodName"}, m = "suggestFunctionNames", c = "com.intellij.ml.llm.kotlin.refactorings.KotlinNameSuggestionContextProvider") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class KotlinNameSuggestionContextProvider$suggestFunctionNames$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; int label;
/*    */     KotlinNameSuggestionContextProvider$suggestFunctionNames$1(Continuation $completion) { super($completion); }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return KotlinNameSuggestionContextProvider.this.suggestFunctionNames(null, null, (Continuation)this); } }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class KotlinNameSuggestionContextProvider$suggestFunctionNames$originalName$1 extends Lambda implements Function0<String> {
/*    */     KotlinNameSuggestionContextProvider$suggestFunctionNames$originalName$1(KtFunction $function) { super(0); }
/*    */     @NotNull
/* 46 */     public final String invoke() { if (this.$function.getName() == null) this.$function.getName();  return ""; }
/*    */   } private final Object suggestVariableNames(Project project, KtValVarKeywordOwner variable, Continuation<? super NameSuggestionContext> paramContinuation) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestVariableNames$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestVariableNames$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestVariableNames$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #16
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 333, 0 -> 92, 1 -> 152, 2 -> 259
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: ldc 'x'
/*    */     //   99: astore #4
/*    */     //   101: aload_1
/*    */     //   102: new com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$suggestVariableNames$originalName$1
/*    */     //   105: dup
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)V
/*    */     //   110: checkcast kotlin/jvm/functions/Function0
/*    */     //   113: aload #11
/*    */     //   115: aload #11
/*    */     //   117: aload_1
/*    */     //   118: putfield L$0 : Ljava/lang/Object;
/*    */     //   121: aload #11
/*    */     //   123: aload_2
/*    */     //   124: putfield L$1 : Ljava/lang/Object;
/*    */     //   127: aload #11
/*    */     //   129: aload #4
/*    */     //   131: putfield L$2 : Ljava/lang/Object;
/*    */     //   134: aload #11
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #16
/*    */     //   146: if_acmpne -> 187
/*    */     //   149: aload #16
/*    */     //   151: areturn
/*    */     //   152: aload #11
/*    */     //   154: getfield L$2 : Ljava/lang/Object;
/*    */     //   157: checkcast java/lang/String
/*    */     //   160: astore #4
/*    */     //   162: aload #11
/*    */     //   164: getfield L$1 : Ljava/lang/Object;
/*    */     //   167: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*    */     //   170: astore_2
/*    */     //   171: aload #11
/*    */     //   173: getfield L$0 : Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/openapi/project/Project
/*    */     //   179: astore_1
/*    */     //   180: aload #10
/*    */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   185: aload #10
/*    */     //   187: dup
/*    */     //   188: ldc 'variable: KtValVarKeywor…medElement)?.name ?: "" }'
/*    */     //   190: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   193: checkcast java/lang/String
/*    */     //   196: astore #5
/*    */     //   198: aload #4
/*    */     //   200: aload #5
/*    */     //   202: getstatic com/intellij/ml/llm/core/refactoring/ObjectType.VARIABLE : Lcom/intellij/ml/llm/core/refactoring/ObjectType;
/*    */     //   205: astore #8
/*    */     //   207: astore #7
/*    */     //   209: astore #6
/*    */     //   211: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*    */     //   214: aload_1
/*    */     //   215: aload_2
/*    */     //   216: aload #4
/*    */     //   218: aload #11
/*    */     //   220: aload #11
/*    */     //   222: aload #6
/*    */     //   224: putfield L$0 : Ljava/lang/Object;
/*    */     //   227: aload #11
/*    */     //   229: aload #7
/*    */     //   231: putfield L$1 : Ljava/lang/Object;
/*    */     //   234: aload #11
/*    */     //   236: aload #8
/*    */     //   238: putfield L$2 : Ljava/lang/Object;
/*    */     //   241: aload #11
/*    */     //   243: iconst_2
/*    */     //   244: putfield label : I
/*    */     //   247: invokevirtual createContextPrompt : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   250: dup
/*    */     //   251: aload #16
/*    */     //   253: if_acmpne -> 296
/*    */     //   256: aload #16
/*    */     //   258: areturn
/*    */     //   259: aload #11
/*    */     //   261: getfield L$2 : Ljava/lang/Object;
/*    */     //   264: checkcast com/intellij/ml/llm/core/refactoring/ObjectType
/*    */     //   267: astore #8
/*    */     //   269: aload #11
/*    */     //   271: getfield L$1 : Ljava/lang/Object;
/*    */     //   274: checkcast java/lang/String
/*    */     //   277: astore #7
/*    */     //   279: aload #11
/*    */     //   281: getfield L$0 : Ljava/lang/Object;
/*    */     //   284: checkcast java/lang/String
/*    */     //   287: astore #6
/*    */     //   289: aload #10
/*    */     //   291: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   294: aload #10
/*    */     //   296: astore #9
/*    */     //   298: aload #6
/*    */     //   300: aload #7
/*    */     //   302: aload #8
/*    */     //   304: aload #9
/*    */     //   306: checkcast java/lang/String
/*    */     //   309: astore #12
/*    */     //   311: astore #13
/*    */     //   313: astore #14
/*    */     //   315: astore #15
/*    */     //   317: new com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   320: dup
/*    */     //   321: aload #15
/*    */     //   323: aload #14
/*    */     //   325: aload #13
/*    */     //   327: aload #12
/*    */     //   329: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/refactoring/ObjectType;Ljava/lang/String;)V
/*    */     //   332: areturn
/*    */     //   333: new java/lang/IllegalStateException
/*    */     //   336: dup
/*    */     //   337: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   339: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   342: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #55	-> 60
/*    */     //   #56	-> 97
/*    */     //   #57	-> 101
/*    */     //   #55	-> 149
/*    */     //   #57	-> 187
/*    */     //   #58	-> 198
/*    */     //   #59	-> 198
/*    */     //   #60	-> 200
/*    */     //   #61	-> 202
/*    */     //   #62	-> 211
/*    */     //   #55	-> 256
/*    */     //   #58	-> 309
/*    */     //   #55	-> 333
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	55	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   180	70	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	55	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*    */     //   171	79	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*    */     //   101	51	4	placeholder	Ljava/lang/String;
/*    */     //   162	88	4	placeholder	Ljava/lang/String;
/*    */     //   198	4	5	originalName	Ljava/lang/String;
/*    */     //   50	283	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	276	10	$result	Ljava/lang/Object; } @DebugMetadata(f = "KotlinNameSuggestionContextProvider.kt", l = {57, 62}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "variable", "placeholder"}, m = "suggestVariableNames", c = "com.intellij.ml.llm.kotlin.refactorings.KotlinNameSuggestionContextProvider") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class KotlinNameSuggestionContextProvider$suggestVariableNames$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; int label;
/*    */     KotlinNameSuggestionContextProvider$suggestVariableNames$1(Continuation $completion) { super($completion); }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return KotlinNameSuggestionContextProvider.this.suggestVariableNames(null, null, (Continuation)this); } }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\020\000\032\f0\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "invoke"})
/*    */   static final class KotlinNameSuggestionContextProvider$suggestVariableNames$originalName$1 extends Lambda implements Function0<String> { KotlinNameSuggestionContextProvider$suggestVariableNames$originalName$1(KtValVarKeywordOwner $variable) { super(0); }
/*    */     @NotNull
/* 57 */     public final String invoke() { KtValVarKeywordOwner ktValVarKeywordOwner = this.$variable; if (((ktValVarKeywordOwner instanceof com.intellij.psi.PsiNamedElement) ? ktValVarKeywordOwner : null) == null || ((ktValVarKeywordOwner instanceof com.intellij.psi.PsiNamedElement) ? ktValVarKeywordOwner : null).getName() == null) ((ktValVarKeywordOwner instanceof com.intellij.psi.PsiNamedElement) ? ktValVarKeywordOwner : null).getName();  return ""; }
/*    */      }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */