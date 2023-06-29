/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J#\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\tJ)\020\n\032\0020\0132\006\020\005\032\0020\0062\006\020\f\032\0020\r2\006\020\007\032\0020\bH@ø\001\000¢\006\002\020\016J!\020\017\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\020H@ø\001\000¢\006\002\020\021J!\020\022\032\0020\0042\006\020\005\032\0020\0062\006\020\023\032\0020\024H@ø\001\000¢\006\002\020\025J!\020\026\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\027H@ø\001\000¢\006\002\020\030\002\004\n\002\b\031¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider;", "()V", "getContext", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "project", "Lcom/intellij/openapi/project/Project;", "element", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNameAlreadyUsed", "", "name", "", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestClassNames", "Lcom/intellij/psi/PsiClass;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestMethodNames", "method", "Lcom/intellij/psi/PsiMethod;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestVariableNames", "Lcom/intellij/psi/PsiVariable;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiVariable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intellij.ml.llm.java"})
/*    */ public final class JavaNameSuggestionContextProvider implements NameSuggestionContextProvider {
/*    */   @Nullable
/*    */   public Object getContext(@NotNull Project project, @NotNull PsiElement element, @NotNull Continuation<? super NameSuggestionContext> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$getContext$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$getContext$1
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
/*    */     //   39: new com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$getContext$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 387, 0 -> 104, 1 -> 160, 2 -> 233, 3 -> 278, 4 -> 325, 5 -> 372
/*    */     //   104: aload #5
/*    */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   109: aload_2
/*    */     //   110: instanceof com/intellij/psi/PsiReferenceExpression
/*    */     //   113: ifeq -> 241
/*    */     //   116: aload_1
/*    */     //   117: new com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$getContext$resolvedElement$1
/*    */     //   120: dup
/*    */     //   121: aload_2
/*    */     //   122: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   125: checkcast kotlin/jvm/functions/Function0
/*    */     //   128: aload #6
/*    */     //   130: aload #6
/*    */     //   132: aload_0
/*    */     //   133: putfield L$0 : Ljava/lang/Object;
/*    */     //   136: aload #6
/*    */     //   138: aload_1
/*    */     //   139: putfield L$1 : Ljava/lang/Object;
/*    */     //   142: aload #6
/*    */     //   144: iconst_1
/*    */     //   145: putfield label : I
/*    */     //   148: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   151: dup
/*    */     //   152: aload #7
/*    */     //   154: if_acmpne -> 185
/*    */     //   157: aload #7
/*    */     //   159: areturn
/*    */     //   160: aload #6
/*    */     //   162: getfield L$1 : Ljava/lang/Object;
/*    */     //   165: checkcast com/intellij/openapi/project/Project
/*    */     //   168: astore_1
/*    */     //   169: aload #6
/*    */     //   171: getfield L$0 : Ljava/lang/Object;
/*    */     //   174: checkcast com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider
/*    */     //   177: astore_0
/*    */     //   178: aload #5
/*    */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   183: aload #5
/*    */     //   185: checkcast com/intellij/psi/PsiElement
/*    */     //   188: dup
/*    */     //   189: ifnonnull -> 195
/*    */     //   192: pop
/*    */     //   193: aconst_null
/*    */     //   194: areturn
/*    */     //   195: astore #4
/*    */     //   197: aload_0
/*    */     //   198: aload_1
/*    */     //   199: aload #4
/*    */     //   201: aload #6
/*    */     //   203: aload #6
/*    */     //   205: aconst_null
/*    */     //   206: putfield L$0 : Ljava/lang/Object;
/*    */     //   209: aload #6
/*    */     //   211: aconst_null
/*    */     //   212: putfield L$1 : Ljava/lang/Object;
/*    */     //   215: aload #6
/*    */     //   217: iconst_2
/*    */     //   218: putfield label : I
/*    */     //   221: invokevirtual getContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   224: dup
/*    */     //   225: aload #7
/*    */     //   227: if_acmpne -> 240
/*    */     //   230: aload #7
/*    */     //   232: areturn
/*    */     //   233: aload #5
/*    */     //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   238: aload #5
/*    */     //   240: areturn
/*    */     //   241: aload_2
/*    */     //   242: astore #4
/*    */     //   244: aload #4
/*    */     //   246: instanceof com/intellij/psi/PsiClass
/*    */     //   249: ifeq -> 291
/*    */     //   252: aload_0
/*    */     //   253: aload_1
/*    */     //   254: aload_2
/*    */     //   255: checkcast com/intellij/psi/PsiClass
/*    */     //   258: aload #6
/*    */     //   260: aload #6
/*    */     //   262: iconst_3
/*    */     //   263: putfield label : I
/*    */     //   266: invokespecial suggestClassNames : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiClass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   269: dup
/*    */     //   270: aload #7
/*    */     //   272: if_acmpne -> 285
/*    */     //   275: aload #7
/*    */     //   277: areturn
/*    */     //   278: aload #5
/*    */     //   280: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   283: aload #5
/*    */     //   285: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   288: goto -> 386
/*    */     //   291: aload #4
/*    */     //   293: instanceof com/intellij/psi/PsiVariable
/*    */     //   296: ifeq -> 338
/*    */     //   299: aload_0
/*    */     //   300: aload_1
/*    */     //   301: aload_2
/*    */     //   302: checkcast com/intellij/psi/PsiVariable
/*    */     //   305: aload #6
/*    */     //   307: aload #6
/*    */     //   309: iconst_4
/*    */     //   310: putfield label : I
/*    */     //   313: invokespecial suggestVariableNames : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiVariable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   316: dup
/*    */     //   317: aload #7
/*    */     //   319: if_acmpne -> 332
/*    */     //   322: aload #7
/*    */     //   324: areturn
/*    */     //   325: aload #5
/*    */     //   327: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   330: aload #5
/*    */     //   332: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   335: goto -> 386
/*    */     //   338: aload #4
/*    */     //   340: instanceof com/intellij/psi/PsiMethod
/*    */     //   343: ifeq -> 385
/*    */     //   346: aload_0
/*    */     //   347: aload_1
/*    */     //   348: aload_2
/*    */     //   349: checkcast com/intellij/psi/PsiMethod
/*    */     //   352: aload #6
/*    */     //   354: aload #6
/*    */     //   356: iconst_5
/*    */     //   357: putfield label : I
/*    */     //   360: invokespecial suggestMethodNames : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   363: dup
/*    */     //   364: aload #7
/*    */     //   366: if_acmpne -> 379
/*    */     //   369: aload #7
/*    */     //   371: areturn
/*    */     //   372: aload #5
/*    */     //   374: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   377: aload #5
/*    */     //   379: checkcast com/intellij/ml/llm/core/refactoring/NameSuggestionContext
/*    */     //   382: goto -> 386
/*    */     //   385: aconst_null
/*    */     //   386: areturn
/*    */     //   387: new java/lang/IllegalStateException
/*    */     //   390: dup
/*    */     //   391: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   393: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   396: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 60
/*    */     //   #13	-> 109
/*    */     //   #14	-> 116
/*    */     //   #12	-> 157
/*    */     //   #14	-> 185
/*    */     //   #15	-> 197
/*    */     //   #12	-> 230
/*    */     //   #17	-> 240
/*    */     //   #18	-> 244
/*    */     //   #12	-> 275
/*    */     //   #18	-> 285
/*    */     //   #19	-> 291
/*    */     //   #12	-> 322
/*    */     //   #19	-> 332
/*    */     //   #20	-> 338
/*    */     //   #12	-> 369
/*    */     //   #20	-> 379
/*    */     //   #21	-> 385
/*    */     //   #17	-> 386
/*    */     //   #12	-> 387
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   109	51	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   178	14	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   195	29	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   241	28	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   291	25	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   338	25	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   109	51	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   169	23	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   195	29	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   241	28	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   291	25	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   338	25	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   109	42	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   241	28	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   291	25	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   338	25	2	element	Lcom/intellij/psi/PsiElement;
/*    */     //   197	27	4	resolvedElement	Lcom/intellij/psi/PsiElement;
/*    */     //   50	337	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	330	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */   static final class JavaNameSuggestionContextProvider$getContext$resolvedElement$1 extends Lambda implements Function0<PsiElement> { @Nullable
/*    */     public final PsiElement invoke() {
/* 14 */       ((PsiReferenceExpression)this.$element).resolve(); return (((PsiReferenceExpression)this.$element).resolve() != null) ? ((PsiReferenceExpression)this.$element).resolve().getNavigationElement() : null;
/*    */     } JavaNameSuggestionContextProvider$getContext$resolvedElement$1(PsiElement $element) {
/*    */       super(0);
/*    */     } } @Nullable
/*    */   public Object isNameAlreadyUsed(@NotNull Project project, @NotNull String name, @NotNull PsiElement element, @NotNull Continuation<? super Boolean> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$1
/*    */     //   13: astore #7
/*    */     //   15: aload #7
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #7
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #7
/*    */     //   53: aload #7
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #6
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #8
/*    */     //   65: aload #7
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 304, 0 -> 100, 1 -> 162, 2 -> 254, 3 -> 296
/*    */     //   100: aload #6
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_3
/*    */     //   106: instanceof com/intellij/psi/PsiReferenceExpression
/*    */     //   109: ifeq -> 262
/*    */     //   112: aload_1
/*    */     //   113: new com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$resolvedElement$1
/*    */     //   116: dup
/*    */     //   117: aload_3
/*    */     //   118: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*    */     //   121: checkcast kotlin/jvm/functions/Function0
/*    */     //   124: aload #7
/*    */     //   126: aload #7
/*    */     //   128: aload_0
/*    */     //   129: putfield L$0 : Ljava/lang/Object;
/*    */     //   132: aload #7
/*    */     //   134: aload_1
/*    */     //   135: putfield L$1 : Ljava/lang/Object;
/*    */     //   138: aload #7
/*    */     //   140: aload_2
/*    */     //   141: putfield L$2 : Ljava/lang/Object;
/*    */     //   144: aload #7
/*    */     //   146: iconst_1
/*    */     //   147: putfield label : I
/*    */     //   150: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   153: dup
/*    */     //   154: aload #8
/*    */     //   156: if_acmpne -> 196
/*    */     //   159: aload #8
/*    */     //   161: areturn
/*    */     //   162: aload #7
/*    */     //   164: getfield L$2 : Ljava/lang/Object;
/*    */     //   167: checkcast java/lang/String
/*    */     //   170: astore_2
/*    */     //   171: aload #7
/*    */     //   173: getfield L$1 : Ljava/lang/Object;
/*    */     //   176: checkcast com/intellij/openapi/project/Project
/*    */     //   179: astore_1
/*    */     //   180: aload #7
/*    */     //   182: getfield L$0 : Ljava/lang/Object;
/*    */     //   185: checkcast com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider
/*    */     //   188: astore_0
/*    */     //   189: aload #6
/*    */     //   191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   194: aload #6
/*    */     //   196: checkcast com/intellij/psi/PsiElement
/*    */     //   199: dup
/*    */     //   200: ifnonnull -> 209
/*    */     //   203: pop
/*    */     //   204: iconst_0
/*    */     //   205: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   208: areturn
/*    */     //   209: astore #5
/*    */     //   211: aload_0
/*    */     //   212: aload_1
/*    */     //   213: aload_2
/*    */     //   214: aload #5
/*    */     //   216: aload #7
/*    */     //   218: aload #7
/*    */     //   220: aconst_null
/*    */     //   221: putfield L$0 : Ljava/lang/Object;
/*    */     //   224: aload #7
/*    */     //   226: aconst_null
/*    */     //   227: putfield L$1 : Ljava/lang/Object;
/*    */     //   230: aload #7
/*    */     //   232: aconst_null
/*    */     //   233: putfield L$2 : Ljava/lang/Object;
/*    */     //   236: aload #7
/*    */     //   238: iconst_2
/*    */     //   239: putfield label : I
/*    */     //   242: invokevirtual isNameAlreadyUsed : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   245: dup
/*    */     //   246: aload #8
/*    */     //   248: if_acmpne -> 261
/*    */     //   251: aload #8
/*    */     //   253: areturn
/*    */     //   254: aload #6
/*    */     //   256: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   259: aload #6
/*    */     //   261: areturn
/*    */     //   262: aload_1
/*    */     //   263: new com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$2
/*    */     //   266: dup
/*    */     //   267: aload_3
/*    */     //   268: aload_1
/*    */     //   269: aload_2
/*    */     //   270: invokespecial <init> : (Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Ljava/lang/String;)V
/*    */     //   273: checkcast kotlin/jvm/functions/Function0
/*    */     //   276: aload #7
/*    */     //   278: aload #7
/*    */     //   280: iconst_3
/*    */     //   281: putfield label : I
/*    */     //   284: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   287: dup
/*    */     //   288: aload #8
/*    */     //   290: if_acmpne -> 303
/*    */     //   293: aload #8
/*    */     //   295: areturn
/*    */     //   296: aload #6
/*    */     //   298: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   301: aload #6
/*    */     //   303: areturn
/*    */     //   304: new java/lang/IllegalStateException
/*    */     //   307: dup
/*    */     //   308: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   310: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   313: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 63
/*    */     //   #26	-> 105
/*    */     //   #27	-> 112
/*    */     //   #25	-> 159
/*    */     //   #27	-> 196
/*    */     //   #28	-> 211
/*    */     //   #25	-> 251
/*    */     //   #30	-> 261
/*    */     //   #25	-> 293
/*    */     //   #30	-> 303
/*    */     //   #25	-> 304
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	57	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   189	14	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   209	36	0	this	Lcom/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider;
/*    */     //   105	57	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   180	23	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   209	36	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   262	25	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   105	57	2	name	Ljava/lang/String;
/*    */     //   171	32	2	name	Ljava/lang/String;
/*    */     //   209	36	2	name	Ljava/lang/String;
/*    */     //   262	25	2	name	Ljava/lang/String;
/*    */     //   105	48	3	element	Lcom/intellij/psi/PsiElement;
/*    */     //   262	25	3	element	Lcom/intellij/psi/PsiElement;
/*    */     //   211	34	5	resolvedElement	Lcom/intellij/psi/PsiElement;
/*    */     //   53	251	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	244	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "invoke"})
/*    */   static final class JavaNameSuggestionContextProvider$isNameAlreadyUsed$resolvedElement$1 extends Lambda implements Function0<PsiElement> { JavaNameSuggestionContextProvider$isNameAlreadyUsed$resolvedElement$1(PsiElement $element) {
/*    */       super(0);
/*    */     }
/*    */     @Nullable
/*    */     public final PsiElement invoke() {
/* 27 */       ((PsiReferenceExpression)this.$element).resolve(); return (((PsiReferenceExpression)this.$element).resolve() != null) ? ((PsiReferenceExpression)this.$element).resolve().getNavigationElement() : null;
/*    */     } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*    */   static final class JavaNameSuggestionContextProvider$isNameAlreadyUsed$2 extends Lambda implements Function0<Boolean> { @NotNull
/*    */     public final Boolean invoke() {
/* 31 */       PsiElement psiElement = this.$element;
/*    */ 
/*    */       
/* 34 */       ((PsiMethod)this.$element).getContainingClass().findMethodsByName(this.$name, true);
/* 35 */       return Boolean.valueOf((psiElement instanceof PsiClass) ? ((JavaPsiFacade.getInstance(this.$project).getResolveHelper().resolveReferencedClass(this.$name, this.$element) != null)) : ((psiElement instanceof PsiVariable) ? (!Intrinsics.areEqual(JavaCodeStyleManager.getInstance(this.$project).suggestUniqueVariableName(this.$name, this.$element, true), this.$name)) : ((psiElement instanceof PsiMethod) ? ((((PsiMethod)this.$element).getContainingClass() != null && ((PsiMethod)this.$element).getContainingClass().findMethodsByName(this.$name, true) != null) ? (!(((((PsiMethod)this.$element).getContainingClass().findMethodsByName(this.$name, true)).length == 0) ? 1 : 0)) : false) : false)));
/*    */     }
/*    */     JavaNameSuggestionContextProvider$isNameAlreadyUsed$2(PsiElement $element, Project $project, String $name) {
/*    */       super(0);
/*    */     } }
/*    */   
/* 41 */   private final Object suggestVariableNames(Project project, PsiVariable element, Continuation $completion) { String newVariableName = "x";
/* 42 */     return CoroutinesKt.smartReadAction(project, new JavaNameSuggestionContextProvider$suggestVariableNames$2(newVariableName, element), $completion); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */   static final class JavaNameSuggestionContextProvider$suggestVariableNames$2 extends Lambda implements Function0<NameSuggestionContext> { @NotNull
/*    */     public final NameSuggestionContext invoke() {
/* 45 */       if (this.$element.getName() == null) this.$element.getName();  Intrinsics.checkNotNullExpressionValue(this.$element.getText(), "element.name ?: element.text"); super(this.$element.getName(), this.$element.getText(), 
/* 46 */           ObjectType.VARIABLE, 
/* 47 */           VariableContextCollector.INSTANCE.createContextPrompt(this.$element, this.$newVariableName));
/*    */       return new NameSuggestionContext();
/*    */     }
/*    */     JavaNameSuggestionContextProvider$suggestVariableNames$2(String $newVariableName, PsiVariable $element) {
/*    */       super(0);
/*    */     } }
/* 53 */   private final Object suggestMethodNames(Project project, PsiMethod method, Continuation $completion) { String newMethodName = "x";
/* 54 */     return CoroutinesKt.smartReadAction(project, new JavaNameSuggestionContextProvider$suggestMethodNames$2(newMethodName, method), $completion); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */   static final class JavaNameSuggestionContextProvider$suggestMethodNames$2 extends Lambda implements Function0<NameSuggestionContext> { @NotNull
/*    */     public final NameSuggestionContext invoke() {
/* 57 */       Intrinsics.checkNotNullExpressionValue(this.$method.getName(), "method.name"); return new NameSuggestionContext(this.$newMethodName, this.$method.getName(), 
/* 58 */           ObjectType.METHOD, 
/* 59 */           MethodContextCollector.INSTANCE.createContextPrompt(this.$method, this.$newMethodName));
/*    */     }
/*    */     JavaNameSuggestionContextProvider$suggestMethodNames$2(String $newMethodName, PsiMethod $method) {
/*    */       super(0);
/*    */     } }
/*    */   
/* 65 */   private final Object suggestClassNames(Project project, PsiClass element, Continuation $completion) { String newClassName = "X";
/* 66 */     return CoroutinesKt.smartReadAction(project, new JavaNameSuggestionContextProvider$suggestClassNames$2(newClassName, element), $completion); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */   static final class JavaNameSuggestionContextProvider$suggestClassNames$2 extends Lambda implements Function0<NameSuggestionContext> { @NotNull
/*    */     public final NameSuggestionContext invoke() {
/* 69 */       if (this.$element.getName() == null) this.$element.getName();  Intrinsics.checkNotNullExpressionValue(this.$element.getText(), "element.name ?: element.text"); super(this.$element.getName(), this.$element.getText(), 
/* 70 */           ObjectType.CLASS, 
/* 71 */           ClassContextCollector.INSTANCE.createContextPrompt(this.$element, this.$newClassName));
/*    */       return new NameSuggestionContext();
/*    */     }
/*    */     
/*    */     JavaNameSuggestionContextProvider$suggestClassNames$2(String $newClassName, PsiClass $element) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "JavaNameSuggestionContextProvider.kt", l = {14, 15, 18, 19, 20}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "project"}, m = "getContext", c = "com.intellij.ml.llm.java.refactorings.JavaNameSuggestionContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class JavaNameSuggestionContextProvider$getContext$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     JavaNameSuggestionContextProvider$getContext$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JavaNameSuggestionContextProvider.this.getContext(null, null, (Continuation<? super NameSuggestionContext>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JavaNameSuggestionContextProvider.kt", l = {27, 28, 30}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "project", "name"}, m = "isNameAlreadyUsed", c = "com.intellij.ml.llm.java.refactorings.JavaNameSuggestionContextProvider")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*    */   static final class JavaNameSuggestionContextProvider$isNameAlreadyUsed$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     JavaNameSuggestionContextProvider$isNameAlreadyUsed$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return JavaNameSuggestionContextProvider.this.isNameAlreadyUsed(null, null, null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */