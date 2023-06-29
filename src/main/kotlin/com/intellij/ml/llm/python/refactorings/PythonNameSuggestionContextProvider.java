/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J#\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\tJ!\020\n\032\0020\0042\006\020\005\032\0020\0062\006\020\013\032\0020\fH@ø\001\000¢\006\002\020\rJ!\020\016\032\0020\0042\006\020\005\032\0020\0062\006\020\017\032\0020\020H@ø\001\000¢\006\002\020\021J)\020\022\032\0020\0042\006\020\005\032\0020\0062\006\020\023\032\0020\0242\006\020\025\032\0020\bH@ø\001\000¢\006\002\020\026J)\020\027\032\0020\0042\006\020\005\032\0020\0062\006\020\030\032\0020\0312\006\020\025\032\0020\bH@ø\001\000¢\006\002\020\032\002\004\n\002\b\031¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider;", "()V", "getContext", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "project", "Lcom/intellij/openapi/project/Project;", "element", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestClassNames", "clazz", "Lcom/jetbrains/python/psi/PyClass;", "(Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestFunctionNames", "function", "Lcom/jetbrains/python/psi/PyFunction;", "(Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestParameterNames", "parameter", "Lcom/jetbrains/python/psi/PyNamedParameter;", "originalElement", "(Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyNamedParameter;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestVariableNames", "variable", "Lcom/jetbrains/python/psi/PyTargetExpression;", "(Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyTargetExpression;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm.python"})
/*    */ public final class PythonNameSuggestionContextProvider implements NameSuggestionContextProvider {
/*    */   @Nullable
/*    */   public Object getContext(@NotNull Project project, @NotNull PsiElement element, @NotNull Continuation<? super NameSuggestionContext> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$getContext$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$getContext$1
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
/*    */     //   39: new com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$getContext$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 596, 0 -> 116, 1 -> 178, 2 -> 278, 3 -> 340, 4 -> 390, 5 -> 435, 6 -> 483, 7 -> 532, 8 -> 581
/*    */     //   116: aload #5
/*    */     //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   121: aload_2
/*    */     //   122: instanceof com/intellij/psi/PsiReference
/*    */     //   125: ifeq -> 398
/*    */     //   128: aload_1
/*    */     //   129: new com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$getContext$resolvedElement$1
/*    */     //   132: dup
/*    */     //   133: aload_2
/*    */     //   134: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   137: checkcast kotlin/jvm/functions/Function0
/*    */     //   140: aload #6
/*    */     //   142: aload #6
/*    */     //   144: aload_0
/*    */     //   145: putfield L$0 : Ljava/lang/Object;
/*    */     //   148: aload #6
/*    */     //   150: aload_1
/*    */     //   151: putfield L$1 : Ljava/lang/Object;
/*    */     //   154: aload #6
/*    */     //   156: aload_2
/*    */     //   157: putfield L$2 : Ljava/lang/Object;
/*    */     //   160: aload #6
/*    */     //   162: iconst_1
/*    */     //   163: putfield label : I
/*    */     //   166: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   169: dup
/*    */     //   170: aload #7
/*    */     //   172: if_acmpne -> 212
/*    */     //   175: aload #7
/*    */     //   177: areturn
/*    */     //   178: aload #6
/*    */     //   180: getfield L$2 : Ljava/lang/Object;
/*    */     //   183: checkcast com/intellij/psi/PsiElement
/*    */     //   186: astore_2
/*    */     //   187: aload #6
/*    */     //   189: getfield L$1 : Ljava/lang/Object;
/*    */     //   192: checkcast com/intellij/openapi/project/Project
/*    */     //   195: astore_1
/*    */     //   196: aload #6
/*    */     //   198: getfield L$0 : Ljava/lang/Object;
/*    */     //   201: checkcast com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider
/*    */     //   204: astore_0
/*    */     //   205: aload #5
/*    */     //   207: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   210: aload #5
/*    */     //   212: checkcast com/intellij/psi/PsiElement
/*    */     //   215: dup
/*    */     //   216: ifnonnull -> 222
/*    */     //   219: pop
/*    */     //   220: aconst_null
/*    */     //   221: areturn
/*    */     //   222: astore #4
/*    */     //   224: aload #4
/*    */     //   226: instanceof com/jetbrains/python/psi/PyTargetExpression
/*    */     //   229: ifeq -> 286
/*    */     //   232: aload_0
/*    */     //   233: aload_1
/*    */     //   234: aload #4
/*    */     //   236: checkcast com/jetbrains/python/psi/PyTargetExpression
/*    */     //   239: aload_2
/*    */     //   240: aload #6
/*    */     //   242: aload #6
/*    */     //   244: aconst_null
/*    */     //   245: putfield L$0 : Ljava/lang/Object;
/*    */     //   248: aload #6
/*    */     //   250: aconst_null
/*    */     //   251: putfield L$1 : Ljava/lang/Object;
/*    */     //   254: aload #6
/*    */     //   256: aconst_null
/*    */     //   257: putfield L$2 : Ljava/lang/Object;
/*    */     //   260: aload #6
/*    */     //   262: iconst_2
/*    */     //   263: putfield label : I
/*    */     //   266: invokespecial suggestVariableNames : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyTargetExpression;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   269: dup
/*    */     //   270: aload #7
/*    */     //   272: if_acmpne -> 285
/*    */     //   275: aload #7
/*    */     //   277: areturn
/*    */     //   278: aload #5
/*    */     //   280: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   283: aload #5
/*    */     //   285: areturn
/*    */     //   286: aload #4
/*    */     //   288: instanceof com/jetbrains/python/psi/PyNamedParameter
/*    */     //   291: ifeq -> 348
/*    */     //   294: aload_0
/*    */     //   295: aload_1
/*    */     //   296: aload #4
/*    */     //   298: checkcast com/jetbrains/python/psi/PyNamedParameter
/*    */     //   301: aload_2
/*    */     //   302: aload #6
/*    */     //   304: aload #6
/*    */     //   306: aconst_null
/*    */     //   307: putfield L$0 : Ljava/lang/Object;
/*    */     //   310: aload #6
/*    */     //   312: aconst_null
/*    */     //   313: putfield L$1 : Ljava/lang/Object;
/*    */     //   316: aload #6
/*    */     //   318: aconst_null
/*    */     //   319: putfield L$2 : Ljava/lang/Object;
/*    */     //   322: aload #6
/*    */     //   324: iconst_3
/*    */     //   325: putfield label : I
/*    */     //   328: invokespecial suggestParameterNames : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyNamedParameter;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   331: dup
/*    */     //   332: aload #7
/*    */     //   334: if_acmpne -> 347
/*    */     //   337: aload #7
/*    */     //   339: areturn
/*    */     //   340: aload #5
/*    */     //   342: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   345: aload #5
/*    */     //   347: areturn
/*    */     //   348: aload_0
/*    */     //   349: aload_1
/*    */     //   350: aload #4
/*    */     //   352: aload #6
/*    */     //   354: aload #6
/*    */     //   356: aconst_null
/*    */     //   357: putfield L$0 : Ljava/lang/Object;
/*    */     //   360: aload #6
/*    */     //   362: aconst_null
/*    */     //   363: putfield L$1 : Ljava/lang/Object;
/*    */     //   366: aload #6
/*    */     //   368: aconst_null
/*    */     //   369: putfield L$2 : Ljava/lang/Object;
/*    */     //   372: aload #6
/*    */     //   374: iconst_4
/*    */     //   375: putfield label : I
/*    */     //   378: invokevirtual getContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   381: dup
/*    */     //   382: aload #7
/*    */     //   384: if_acmpne -> 397
/*    */     //   387: aload #7
/*    */     //   389: areturn
/*    */     //   390: aload #5
/*    */     //   392: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   395: aload #5
/*    */     //   397: areturn
/*    */     //   398: aload_2
/*    */     //   399: astore #4
/*    */     //   401: aload #4
/*    */     //   403: instanceof com/jetbrains/python/psi/PyClass
/*    */     //   406: ifeq -> 448
/*    */     //   409: aload_0
/*    */     //   410: aload_1
/*    */     //   411: aload_2
/*    */     //   412: checkcast com/jetbrains/python/psi/PyClass
/*    */     //   415: aload #6
/*    */     //   417: aload #6
/*    */     //   419: iconst_5
/*    */     //   420: putfield label : I
/*    */     //   423: invokespecial suggestClassNames : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   426: dup
/*    */     //   427: aload #7
/*    */     //   429: if_acmpne -> 442
/*    */     //   432: aload #7
/*    */     //   434: areturn
/*    */     //   435: aload #5
/*    */     //   437: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   440: aload #5
/*    */     //   442: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   445: goto -> 595
/*    */     //   448: aload #4
/*    */     //   450: instanceof com/jetbrains/python/psi/PyFunction
/*    */     //   453: ifeq -> 496
/*    */     //   456: aload_0
/*    */     //   457: aload_1
/*    */     //   458: aload_2
/*    */     //   459: checkcast com/jetbrains/python/psi/PyFunction
/*    */     //   462: aload #6
/*    */     //   464: aload #6
/*    */     //   466: bipush #6
/*    */     //   468: putfield label : I
/*    */     //   471: invokespecial suggestFunctionNames : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   474: dup
/*    */     //   475: aload #7
/*    */     //   477: if_acmpne -> 490
/*    */     //   480: aload #7
/*    */     //   482: areturn
/*    */     //   483: aload #5
/*    */     //   485: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   488: aload #5
/*    */     //   490: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   493: goto -> 595
/*    */     //   496: aload #4
/*    */     //   498: instanceof com/jetbrains/python/psi/PyTargetExpression
/*    */     //   501: ifeq -> 545
/*    */     //   504: aload_0
/*    */     //   505: aload_1
/*    */     //   506: aload_2
/*    */     //   507: checkcast com/jetbrains/python/psi/PyTargetExpression
/*    */     //   510: aload_2
/*    */     //   511: aload #6
/*    */     //   513: aload #6
/*    */     //   515: bipush #7
/*    */     //   517: putfield label : I
/*    */     //   520: invokespecial suggestVariableNames : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyTargetExpression;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   523: dup
/*    */     //   524: aload #7
/*    */     //   526: if_acmpne -> 539
/*    */     //   529: aload #7
/*    */     //   531: areturn
/*    */     //   532: aload #5
/*    */     //   534: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   537: aload #5
/*    */     //   539: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   542: goto -> 595
/*    */     //   545: aload #4
/*    */     //   547: instanceof com/jetbrains/python/psi/PyNamedParameter
/*    */     //   550: ifeq -> 594
/*    */     //   553: aload_0
/*    */     //   554: aload_1
/*    */     //   555: aload_2
/*    */     //   556: checkcast com/jetbrains/python/psi/PyNamedParameter
/*    */     //   559: aload_2
/*    */     //   560: aload #6
/*    */     //   562: aload #6
/*    */     //   564: bipush #8
/*    */     //   566: putfield label : I
/*    */     //   569: invokespecial suggestParameterNames : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyNamedParameter;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   572: dup
/*    */     //   573: aload #7
/*    */     //   575: if_acmpne -> 588
/*    */     //   578: aload #7
/*    */     //   580: areturn
/*    */     //   581: aload #5
/*    */     //   583: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   586: aload #5
/*    */     //   588: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   591: goto -> 595
/*    */     //   594: aconst_null
/*    */     //   595: areturn
/*    */     //   596: new java/lang/IllegalStateException
/*    */     //   599: dup
/*    */     //   600: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   602: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   605: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #17	-> 121
/*    */     //   #18	-> 128
/*    */     //   #16	-> 175
/*    */     //   #18	-> 212
/*    */     //   #19	-> 224
/*    */     //   #20	-> 232
/*    */     //   #16	-> 275
/*    */     //   #22	-> 285
/*    */     //   #23	-> 294
/*    */     //   #16	-> 337
/*    */     //   #25	-> 347
/*    */     //   #16	-> 387
/*    */     //   #27	-> 397
/*    */     //   #28	-> 401
/*    */     //   #16	-> 432
/*    */     //   #28	-> 442
/*    */     //   #29	-> 448
/*    */     //   #16	-> 480
/*    */     //   #29	-> 490
/*    */     //   #30	-> 496
/*    */     //   #16	-> 529
/*    */     //   #30	-> 539
/*    */     //   #31	-> 545
/*    */     //   #16	-> 578
/*    */     //   #31	-> 588
/*    */     //   #32	-> 594
/*    */     //   #27	-> 595
/*    */     //   #16	-> 596
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   121	57	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   205	14	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   222	47	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   286	45	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   348	33	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   398	28	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   448	26	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   496	27	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   545	27	0	this	Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;
/*    */     //   121	57	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   196	23	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   222	47	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   286	45	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   348	33	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   398	28	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   448	26	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   496	27	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   545	27	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   121	57	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   187	32	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   222	47	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   286	45	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   398	28	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   448	26	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   496	27	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   545	27	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   224	45	4	resolvedElement	Lcom/intellij/psi/PsiElement;
/*    */     //   286	45	4	resolvedElement	Lcom/intellij/psi/PsiElement;
/*    */     //   348	33	4	resolvedElement	Lcom/intellij/psi/PsiElement;
/*    */     //   50	546	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	539	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */   static final class PythonNameSuggestionContextProvider$getContext$resolvedElement$1 extends Lambda implements Function0<PsiElement> {
/*    */     @Nullable
/*    */     public final PsiElement invoke() {
/* 18 */       ((PsiReference)this.$element).resolve(); return (((PsiReference)this.$element).resolve() != null) ? ((PsiReference)this.$element).resolve().getNavigationElement() : null;
/*    */     }
/*    */     
/*    */     PythonNameSuggestionContextProvider$getContext$resolvedElement$1(PsiElement $element) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */   
/*    */   private final Object suggestClassNames(Project project, PyClass clazz, Continuation<? super NameSuggestionContext> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestClassNames$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestClassNames$1
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
/*    */     //   39: new com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestClassNames$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 219, 0 -> 88, 1 -> 148
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: ldc 'X'
/*    */     //   95: astore #4
/*    */     //   97: aload_1
/*    */     //   98: new com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestClassNames$originalName$1
/*    */     //   101: dup
/*    */     //   102: aload_2
/*    */     //   103: invokespecial <init> : (Lcom/jetbrains/python/psi/PyClass;)V
/*    */     //   106: checkcast kotlin/jvm/functions/Function0
/*    */     //   109: aload #7
/*    */     //   111: aload #7
/*    */     //   113: aload_1
/*    */     //   114: putfield L$0 : Ljava/lang/Object;
/*    */     //   117: aload #7
/*    */     //   119: aload_2
/*    */     //   120: putfield L$1 : Ljava/lang/Object;
/*    */     //   123: aload #7
/*    */     //   125: aload #4
/*    */     //   127: putfield L$2 : Ljava/lang/Object;
/*    */     //   130: aload #7
/*    */     //   132: iconst_1
/*    */     //   133: putfield label : I
/*    */     //   136: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   139: dup
/*    */     //   140: aload #8
/*    */     //   142: if_acmpne -> 183
/*    */     //   145: aload #8
/*    */     //   147: areturn
/*    */     //   148: aload #7
/*    */     //   150: getfield L$2 : Ljava/lang/Object;
/*    */     //   153: checkcast java/lang/String
/*    */     //   156: astore #4
/*    */     //   158: aload #7
/*    */     //   160: getfield L$1 : Ljava/lang/Object;
/*    */     //   163: checkcast com/jetbrains/python/psi/PyClass
/*    */     //   166: astore_2
/*    */     //   167: aload #7
/*    */     //   169: getfield L$0 : Ljava/lang/Object;
/*    */     //   172: checkcast com/intellij/openapi/project/Project
/*    */     //   175: astore_1
/*    */     //   176: aload #6
/*    */     //   178: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   181: aload #6
/*    */     //   183: dup
/*    */     //   184: ldc 'clazz: PyClass): NameSug…ect) { clazz.name ?: "" }'
/*    */     //   186: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   189: checkcast java/lang/String
/*    */     //   192: astore #5
/*    */     //   194: new com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   197: dup
/*    */     //   198: aload #4
/*    */     //   200: aload #5
/*    */     //   202: getstatic com/intellij/ml/llm/core/refactoring/ObjectType.CLASS : Lcom/intellij/ml/llm/core/refactoring/ObjectType;
/*    */     //   205: getstatic com/intellij/ml/llm/python/refactorings/ClassContextCollector.INSTANCE : Lcom/intellij/ml/llm/python/refactorings/ClassContextCollector;
/*    */     //   208: aload_1
/*    */     //   209: aload_2
/*    */     //   210: aload #4
/*    */     //   212: invokevirtual createContextPrompt : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyClass;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   215: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/refactoring/ObjectType;Ljava/lang/String;)V
/*    */     //   218: areturn
/*    */     //   219: new java/lang/IllegalStateException
/*    */     //   222: dup
/*    */     //   223: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   225: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   228: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 60
/*    */     //   #37	-> 93
/*    */     //   #38	-> 97
/*    */     //   #36	-> 145
/*    */     //   #38	-> 183
/*    */     //   #39	-> 194
/*    */     //   #40	-> 198
/*    */     //   #41	-> 200
/*    */     //   #42	-> 202
/*    */     //   #43	-> 205
/*    */     //   #39	-> 215
/*    */     //   #36	-> 219
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	55	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   176	43	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   93	55	2	clazz	Lcom/jetbrains/python/psi/PyClass;
/*    */     //   167	52	2	clazz	Lcom/jetbrains/python/psi/PyClass;
/*    */     //   97	51	4	newName	Ljava/lang/String;
/*    */     //   158	61	4	newName	Ljava/lang/String;
/*    */     //   194	25	5	originalName	Ljava/lang/String;
/*    */     //   50	169	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	162	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\020\000\032\f0\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "invoke"})
/*    */   static final class PythonNameSuggestionContextProvider$suggestClassNames$originalName$1 extends Lambda implements Function0<String> {
/*    */     PythonNameSuggestionContextProvider$suggestClassNames$originalName$1(PyClass $clazz) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String invoke() {
/* 38 */       if (this.$clazz.getName() == null) this.$clazz.getName();  return "";
/*    */     } }
/*    */   private final Object suggestFunctionNames(Project project, PyFunction function, Continuation<? super NameSuggestionContext> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestFunctionNames$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestFunctionNames$1
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
/*    */     //   39: new com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestFunctionNames$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   102: new com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestFunctionNames$originalName$1
/*    */     //   105: dup
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Lcom/jetbrains/python/psi/PyFunction;)V
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
/*    */     //   167: checkcast com/jetbrains/python/psi/PyFunction
/*    */     //   170: astore_2
/*    */     //   171: aload #11
/*    */     //   173: getfield L$0 : Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/openapi/project/Project
/*    */     //   179: astore_1
/*    */     //   180: aload #10
/*    */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   185: aload #10
/*    */     //   187: dup
/*    */     //   188: ldc 'function: PyFunction): N…) { function.name ?: "" }'
/*    */     //   190: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   193: checkcast java/lang/String
/*    */     //   196: astore #5
/*    */     //   198: aload #4
/*    */     //   200: aload #5
/*    */     //   202: getstatic com/intellij/ml/llm/core/refactoring/ObjectType.METHOD : Lcom/intellij/ml/llm/core/refactoring/ObjectType;
/*    */     //   205: astore #8
/*    */     //   207: astore #7
/*    */     //   209: astore #6
/*    */     //   211: getstatic com/intellij/ml/llm/python/refactorings/FunctionContextCollector.INSTANCE : Lcom/intellij/ml/llm/python/refactorings/FunctionContextCollector;
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
/*    */     //   247: invokevirtual createContextPrompt : (Lcom/intellij/openapi/project/Project;Lcom/jetbrains/python/psi/PyFunction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
/*    */     //   #47	-> 60
/*    */     //   #48	-> 97
/*    */     //   #49	-> 101
/*    */     //   #47	-> 149
/*    */     //   #49	-> 187
/*    */     //   #50	-> 198
/*    */     //   #51	-> 198
/*    */     //   #52	-> 200
/*    */     //   #53	-> 202
/*    */     //   #54	-> 211
/*    */     //   #47	-> 256
/*    */     //   #50	-> 309
/*    */     //   #47	-> 333
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	55	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   180	70	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	55	2	function	Lcom/jetbrains/python/psi/PyFunction;
/*    */     //   171	79	2	function	Lcom/jetbrains/python/psi/PyFunction;
/*    */     //   101	51	4	newMethodName	Ljava/lang/String;
/*    */     //   162	88	4	newMethodName	Ljava/lang/String;
/*    */     //   198	4	5	originalName	Ljava/lang/String;
/*    */     //   50	283	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	276	10	$result	Ljava/lang/Object;
/*    */   }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\020\000\032\f0\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "invoke"})
/*    */   static final class PythonNameSuggestionContextProvider$suggestFunctionNames$originalName$1 extends Lambda implements Function0<String> { PythonNameSuggestionContextProvider$suggestFunctionNames$originalName$1(PyFunction $function) {
/*    */       super(0);
/*    */     }
/*    */     @NotNull
/*    */     public final String invoke() {
/* 49 */       if (this.$function.getName() == null) this.$function.getName();  return "";
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object suggestVariableNames(Project project, PyTargetExpression variable, PsiElement originalElement, Continuation $completion)
/*    */   {
/* 59 */     String newVariableName = "x";
/* 60 */     return CoroutinesKt.smartReadAction(project, new PythonNameSuggestionContextProvider$suggestVariableNames$2(newVariableName, variable, originalElement), $completion); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */   static final class PythonNameSuggestionContextProvider$suggestVariableNames$2 extends Lambda implements Function0<NameSuggestionContext> { @NotNull
/*    */     public final NameSuggestionContext invoke() {
/* 63 */       if (this.$variable.getName() == null) this.$variable.getName();  Intrinsics.checkNotNullExpressionValue(this.$variable.getText(), "variable.name ?: variable.text"); super(this.$variable.getName(), this.$variable.getText(), 
/* 64 */           ObjectType.VARIABLE, 
/* 65 */           VariableContextCollector.INSTANCE.createContextPrompt(this.$variable, this.$newVariableName, this.$originalElement));
/*    */       return new NameSuggestionContext();
/*    */     }
/*    */     PythonNameSuggestionContextProvider$suggestVariableNames$2(String $newVariableName, PyTargetExpression $variable, PsiElement $originalElement) {
/*    */       super(0);
/*    */     } }
/* 71 */   private final Object suggestParameterNames(Project project, PyNamedParameter parameter, PsiElement originalElement, Continuation $completion) { String newVariableName = "x";
/* 72 */     return CoroutinesKt.smartReadAction(project, new PythonNameSuggestionContextProvider$suggestParameterNames$2(newVariableName, parameter, originalElement), $completion); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */   static final class PythonNameSuggestionContextProvider$suggestParameterNames$2 extends Lambda implements Function0<NameSuggestionContext> { @NotNull
/*    */     public final NameSuggestionContext invoke() {
/* 75 */       if (this.$parameter.getName() == null) this.$parameter.getName();  Intrinsics.checkNotNullExpressionValue(this.$parameter.getText(), "parameter.name ?: parameter.text"); super(this.$parameter.getName(), this.$parameter.getText(), 
/* 76 */           ObjectType.VARIABLE, 
/* 77 */           VariableContextCollector.INSTANCE.createContextPrompt(this.$parameter, this.$newVariableName, this.$originalElement));
/*    */       return new NameSuggestionContext();
/*    */     }
/*    */     
/*    */     PythonNameSuggestionContextProvider$suggestParameterNames$2(String $newVariableName, PyNamedParameter $parameter, PsiElement $originalElement) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "PythonNameSuggestionContextProvider.kt", l = {18, 20, 23, 25, 28, 29, 30, 31}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "project", "element"}, m = "getContext", c = "com.intellij.ml.llm.python.refactorings.PythonNameSuggestionContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class PythonNameSuggestionContextProvider$getContext$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     PythonNameSuggestionContextProvider$getContext$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonNameSuggestionContextProvider.this.getContext(null, null, (Continuation<? super NameSuggestionContext>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PythonNameSuggestionContextProvider.kt", l = {38}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "clazz", "newName"}, m = "suggestClassNames", c = "com.intellij.ml.llm.python.refactorings.PythonNameSuggestionContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class PythonNameSuggestionContextProvider$suggestClassNames$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     PythonNameSuggestionContextProvider$suggestClassNames$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonNameSuggestionContextProvider.this.suggestClassNames(null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PythonNameSuggestionContextProvider.kt", l = {49, 54}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "function", "newMethodName"}, m = "suggestFunctionNames", c = "com.intellij.ml.llm.python.refactorings.PythonNameSuggestionContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class PythonNameSuggestionContextProvider$suggestFunctionNames$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     PythonNameSuggestionContextProvider$suggestFunctionNames$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonNameSuggestionContextProvider.this.suggestFunctionNames(null, null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */