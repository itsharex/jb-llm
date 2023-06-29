/*     */ package com.intellij.ml.llm.kotlin.refactorings;
/*     */ import com.intellij.psi.PsiElement;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\036\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\007H\002J/\020\b\032\004\030\0010\0042\006\020\t\032\0020\n2\006\020\006\032\0020\0072\n\b\002\020\013\032\004\030\0010\004H@ø\001\000¢\006\002\020\fJ)\020\r\032\0020\0042\006\020\t\032\0020\n2\006\020\006\032\0020\0072\006\020\013\032\0020\004H@ø\001\000¢\006\002\020\fJ(\020\016\032\0020\0042\006\020\017\032\0020\0202\n\b\002\020\021\032\004\030\0010\0042\n\b\002\020\022\032\004\030\0010\004H\002J\022\020\023\032\004\030\0010\0042\006\020\024\032\0020\025H\002J\026\020\026\032\b\022\004\022\0020\0070\0272\006\020\030\032\0020\020H\002J\026\020\031\032\b\022\004\022\0020\0320\0272\006\020\006\032\0020\007H\002J\022\020\033\032\004\030\0010\0202\006\020\034\032\0020\032H\002J \020\035\032\b\022\004\022\0020\0320\0272\006\020\006\032\0020\0072\b\020\017\032\004\030\0010\020H\002J\"\020\036\032\0020\0202\006\020\037\032\0020\0202\006\020 \032\0020\0042\b\020\022\032\004\030\0010\004H\002J\034\020!\032\0020\004*\b\022\004\022\0020\0040\"2\b\b\002\020!\032\0020\004H\002\002\004\n\002\b\031¨\006#"}, d2 = {"Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;", "", "()V", "addVarIfNeeded", "", "text", "variable", "Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;", "createContextForDeclaration", "project", "Lcom/intellij/openapi/project/Project;", "newVariableName", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createContextPrompt", "createContextString", "context", "Lcom/intellij/psi/PsiElement;", "originalName", "newName", "findParameterForCallArgument", "argument", "Lorg/jetbrains/kotlin/psi/KtValueArgument;", "findUsedVariables", "", "scope", "findVariableReferences", "Lorg/jetbrains/kotlin/psi/KtReferenceExpression;", "getContextForReference", "reference", "getVariableReferences", "replaceReferenceExpressions", "element", "oldName", "indent", "", "intellij.ml.llm.kotlin"})
/*     */ @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n766#2:162\n857#2,2:163\n1549#2:165\n1620#2,3:166\n766#2:170\n857#2,2:171\n1855#2,2:173\n1549#2:175\n1620#2,3:176\n800#2,11:179\n766#2:190\n857#2,2:191\n1603#2,9:193\n1855#2:202\n1856#2:204\n1612#2:205\n1#3:169\n1#3:203\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector\n*L\n40#1:158\n40#1:159,3\n41#1:162\n41#1:163,2\n42#1:165\n42#1:166,3\n133#1:170\n133#1:171,2\n134#1:173,2\n154#1:175\n154#1:176,3\n155#1:179,11\n115#1:190\n115#1:191,2\n116#1:193,9\n116#1:202\n116#1:204\n116#1:205\n116#1:203\n*E\n"})
/*     */ public final class VariableContextCollector {
/*     */   @NotNull
/*     */   public static final VariableContextCollector INSTANCE = new VariableContextCollector();
/*     */   
/*     */   @Nullable
/*     */   public final Object createContextPrompt(@NotNull Project project, @NotNull KtValVarKeywordOwner variable, @NotNull String newVariableName, @NotNull Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$1
/*     */     //   13: astore #25
/*     */     //   15: aload #25
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #25
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #25
/*     */     //   53: aload #25
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #24
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #26
/*     */     //   65: aload #25
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 1740, 0 -> 124, 1 -> 185, 2 -> 298, 3 -> 426, 4 -> 571, 5 -> 728, 6 -> 860, 7 -> 1093, 8 -> 1520, 9 -> 1732
/*     */     //   124: aload #24
/*     */     //   126: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   129: aload_1
/*     */     //   130: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$variablesInsideInitializer$1
/*     */     //   133: dup
/*     */     //   134: aload_2
/*     */     //   135: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)V
/*     */     //   138: checkcast kotlin/jvm/functions/Function0
/*     */     //   141: aload #25
/*     */     //   143: aload #25
/*     */     //   145: aload_0
/*     */     //   146: putfield L$0 : Ljava/lang/Object;
/*     */     //   149: aload #25
/*     */     //   151: aload_1
/*     */     //   152: putfield L$1 : Ljava/lang/Object;
/*     */     //   155: aload #25
/*     */     //   157: aload_2
/*     */     //   158: putfield L$2 : Ljava/lang/Object;
/*     */     //   161: aload #25
/*     */     //   163: aload_3
/*     */     //   164: putfield L$3 : Ljava/lang/Object;
/*     */     //   167: aload #25
/*     */     //   169: iconst_1
/*     */     //   170: putfield label : I
/*     */     //   173: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   176: dup
/*     */     //   177: aload #26
/*     */     //   179: if_acmpne -> 228
/*     */     //   182: aload #26
/*     */     //   184: areturn
/*     */     //   185: aload #25
/*     */     //   187: getfield L$3 : Ljava/lang/Object;
/*     */     //   190: checkcast java/lang/String
/*     */     //   193: astore_3
/*     */     //   194: aload #25
/*     */     //   196: getfield L$2 : Ljava/lang/Object;
/*     */     //   199: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   202: astore_2
/*     */     //   203: aload #25
/*     */     //   205: getfield L$1 : Ljava/lang/Object;
/*     */     //   208: checkcast com/intellij/openapi/project/Project
/*     */     //   211: astore_1
/*     */     //   212: aload #25
/*     */     //   214: getfield L$0 : Ljava/lang/Object;
/*     */     //   217: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector
/*     */     //   220: astore_0
/*     */     //   221: aload #24
/*     */     //   223: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   226: aload #24
/*     */     //   228: checkcast java/util/List
/*     */     //   231: astore #5
/*     */     //   233: aload_1
/*     */     //   234: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1
/*     */     //   237: dup
/*     */     //   238: aload #5
/*     */     //   240: aload_2
/*     */     //   241: invokespecial <init> : (Ljava/util/List;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)V
/*     */     //   244: checkcast kotlin/jvm/functions/Function0
/*     */     //   247: aload #25
/*     */     //   249: aload #25
/*     */     //   251: aload_0
/*     */     //   252: putfield L$0 : Ljava/lang/Object;
/*     */     //   255: aload #25
/*     */     //   257: aload_1
/*     */     //   258: putfield L$1 : Ljava/lang/Object;
/*     */     //   261: aload #25
/*     */     //   263: aload_2
/*     */     //   264: putfield L$2 : Ljava/lang/Object;
/*     */     //   267: aload #25
/*     */     //   269: aload_3
/*     */     //   270: putfield L$3 : Ljava/lang/Object;
/*     */     //   273: aload #25
/*     */     //   275: aload #5
/*     */     //   277: putfield L$4 : Ljava/lang/Object;
/*     */     //   280: aload #25
/*     */     //   282: iconst_2
/*     */     //   283: putfield label : I
/*     */     //   286: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   289: dup
/*     */     //   290: aload #26
/*     */     //   292: if_acmpne -> 351
/*     */     //   295: aload #26
/*     */     //   297: areturn
/*     */     //   298: aload #25
/*     */     //   300: getfield L$4 : Ljava/lang/Object;
/*     */     //   303: checkcast java/util/List
/*     */     //   306: astore #5
/*     */     //   308: aload #25
/*     */     //   310: getfield L$3 : Ljava/lang/Object;
/*     */     //   313: checkcast java/lang/String
/*     */     //   316: astore_3
/*     */     //   317: aload #25
/*     */     //   319: getfield L$2 : Ljava/lang/Object;
/*     */     //   322: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   325: astore_2
/*     */     //   326: aload #25
/*     */     //   328: getfield L$1 : Ljava/lang/Object;
/*     */     //   331: checkcast com/intellij/openapi/project/Project
/*     */     //   334: astore_1
/*     */     //   335: aload #25
/*     */     //   337: getfield L$0 : Ljava/lang/Object;
/*     */     //   340: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector
/*     */     //   343: astore_0
/*     */     //   344: aload #24
/*     */     //   346: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   349: aload #24
/*     */     //   351: checkcast java/util/List
/*     */     //   354: astore #6
/*     */     //   356: aload_1
/*     */     //   357: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usages$1
/*     */     //   360: dup
/*     */     //   361: aload_2
/*     */     //   362: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)V
/*     */     //   365: checkcast kotlin/jvm/functions/Function0
/*     */     //   368: aload #25
/*     */     //   370: aload #25
/*     */     //   372: aload_0
/*     */     //   373: putfield L$0 : Ljava/lang/Object;
/*     */     //   376: aload #25
/*     */     //   378: aload_1
/*     */     //   379: putfield L$1 : Ljava/lang/Object;
/*     */     //   382: aload #25
/*     */     //   384: aload_2
/*     */     //   385: putfield L$2 : Ljava/lang/Object;
/*     */     //   388: aload #25
/*     */     //   390: aload_3
/*     */     //   391: putfield L$3 : Ljava/lang/Object;
/*     */     //   394: aload #25
/*     */     //   396: aload #5
/*     */     //   398: putfield L$4 : Ljava/lang/Object;
/*     */     //   401: aload #25
/*     */     //   403: aload #6
/*     */     //   405: putfield L$5 : Ljava/lang/Object;
/*     */     //   408: aload #25
/*     */     //   410: iconst_3
/*     */     //   411: putfield label : I
/*     */     //   414: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   417: dup
/*     */     //   418: aload #26
/*     */     //   420: if_acmpne -> 489
/*     */     //   423: aload #26
/*     */     //   425: areturn
/*     */     //   426: aload #25
/*     */     //   428: getfield L$5 : Ljava/lang/Object;
/*     */     //   431: checkcast java/util/List
/*     */     //   434: astore #6
/*     */     //   436: aload #25
/*     */     //   438: getfield L$4 : Ljava/lang/Object;
/*     */     //   441: checkcast java/util/List
/*     */     //   444: astore #5
/*     */     //   446: aload #25
/*     */     //   448: getfield L$3 : Ljava/lang/Object;
/*     */     //   451: checkcast java/lang/String
/*     */     //   454: astore_3
/*     */     //   455: aload #25
/*     */     //   457: getfield L$2 : Ljava/lang/Object;
/*     */     //   460: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   463: astore_2
/*     */     //   464: aload #25
/*     */     //   466: getfield L$1 : Ljava/lang/Object;
/*     */     //   469: checkcast com/intellij/openapi/project/Project
/*     */     //   472: astore_1
/*     */     //   473: aload #25
/*     */     //   475: getfield L$0 : Ljava/lang/Object;
/*     */     //   478: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector
/*     */     //   481: astore_0
/*     */     //   482: aload #24
/*     */     //   484: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   487: aload #24
/*     */     //   489: checkcast java/util/List
/*     */     //   492: astore #7
/*     */     //   494: aload_1
/*     */     //   495: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$originalName$1
/*     */     //   498: dup
/*     */     //   499: aload_2
/*     */     //   500: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)V
/*     */     //   503: checkcast kotlin/jvm/functions/Function0
/*     */     //   506: aload #25
/*     */     //   508: aload #25
/*     */     //   510: aload_0
/*     */     //   511: putfield L$0 : Ljava/lang/Object;
/*     */     //   514: aload #25
/*     */     //   516: aload_1
/*     */     //   517: putfield L$1 : Ljava/lang/Object;
/*     */     //   520: aload #25
/*     */     //   522: aload_2
/*     */     //   523: putfield L$2 : Ljava/lang/Object;
/*     */     //   526: aload #25
/*     */     //   528: aload_3
/*     */     //   529: putfield L$3 : Ljava/lang/Object;
/*     */     //   532: aload #25
/*     */     //   534: aload #5
/*     */     //   536: putfield L$4 : Ljava/lang/Object;
/*     */     //   539: aload #25
/*     */     //   541: aload #6
/*     */     //   543: putfield L$5 : Ljava/lang/Object;
/*     */     //   546: aload #25
/*     */     //   548: aload #7
/*     */     //   550: putfield L$6 : Ljava/lang/Object;
/*     */     //   553: aload #25
/*     */     //   555: iconst_4
/*     */     //   556: putfield label : I
/*     */     //   559: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   562: dup
/*     */     //   563: aload #26
/*     */     //   565: if_acmpne -> 644
/*     */     //   568: aload #26
/*     */     //   570: areturn
/*     */     //   571: aload #25
/*     */     //   573: getfield L$6 : Ljava/lang/Object;
/*     */     //   576: checkcast java/util/List
/*     */     //   579: astore #7
/*     */     //   581: aload #25
/*     */     //   583: getfield L$5 : Ljava/lang/Object;
/*     */     //   586: checkcast java/util/List
/*     */     //   589: astore #6
/*     */     //   591: aload #25
/*     */     //   593: getfield L$4 : Ljava/lang/Object;
/*     */     //   596: checkcast java/util/List
/*     */     //   599: astore #5
/*     */     //   601: aload #25
/*     */     //   603: getfield L$3 : Ljava/lang/Object;
/*     */     //   606: checkcast java/lang/String
/*     */     //   609: astore_3
/*     */     //   610: aload #25
/*     */     //   612: getfield L$2 : Ljava/lang/Object;
/*     */     //   615: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   618: astore_2
/*     */     //   619: aload #25
/*     */     //   621: getfield L$1 : Ljava/lang/Object;
/*     */     //   624: checkcast com/intellij/openapi/project/Project
/*     */     //   627: astore_1
/*     */     //   628: aload #25
/*     */     //   630: getfield L$0 : Ljava/lang/Object;
/*     */     //   633: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector
/*     */     //   636: astore_0
/*     */     //   637: aload #24
/*     */     //   639: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   642: aload #24
/*     */     //   644: checkcast java/lang/String
/*     */     //   647: astore #8
/*     */     //   649: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usageContext$1
/*     */     //   652: dup
/*     */     //   653: aload #7
/*     */     //   655: aload #8
/*     */     //   657: aload_3
/*     */     //   658: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   661: checkcast kotlin/jvm/functions/Function0
/*     */     //   664: aload #25
/*     */     //   666: aload #25
/*     */     //   668: aload_0
/*     */     //   669: putfield L$0 : Ljava/lang/Object;
/*     */     //   672: aload #25
/*     */     //   674: aload_1
/*     */     //   675: putfield L$1 : Ljava/lang/Object;
/*     */     //   678: aload #25
/*     */     //   680: aload_2
/*     */     //   681: putfield L$2 : Ljava/lang/Object;
/*     */     //   684: aload #25
/*     */     //   686: aload_3
/*     */     //   687: putfield L$3 : Ljava/lang/Object;
/*     */     //   690: aload #25
/*     */     //   692: aload #5
/*     */     //   694: putfield L$4 : Ljava/lang/Object;
/*     */     //   697: aload #25
/*     */     //   699: aload #6
/*     */     //   701: putfield L$5 : Ljava/lang/Object;
/*     */     //   704: aload #25
/*     */     //   706: aconst_null
/*     */     //   707: putfield L$6 : Ljava/lang/Object;
/*     */     //   710: aload #25
/*     */     //   712: iconst_5
/*     */     //   713: putfield label : I
/*     */     //   716: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   719: dup
/*     */     //   720: aload #26
/*     */     //   722: if_acmpne -> 791
/*     */     //   725: aload #26
/*     */     //   727: areturn
/*     */     //   728: aload #25
/*     */     //   730: getfield L$5 : Ljava/lang/Object;
/*     */     //   733: checkcast java/util/List
/*     */     //   736: astore #6
/*     */     //   738: aload #25
/*     */     //   740: getfield L$4 : Ljava/lang/Object;
/*     */     //   743: checkcast java/util/List
/*     */     //   746: astore #5
/*     */     //   748: aload #25
/*     */     //   750: getfield L$3 : Ljava/lang/Object;
/*     */     //   753: checkcast java/lang/String
/*     */     //   756: astore_3
/*     */     //   757: aload #25
/*     */     //   759: getfield L$2 : Ljava/lang/Object;
/*     */     //   762: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   765: astore_2
/*     */     //   766: aload #25
/*     */     //   768: getfield L$1 : Ljava/lang/Object;
/*     */     //   771: checkcast com/intellij/openapi/project/Project
/*     */     //   774: astore_1
/*     */     //   775: aload #25
/*     */     //   777: getfield L$0 : Ljava/lang/Object;
/*     */     //   780: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector
/*     */     //   783: astore_0
/*     */     //   784: aload #24
/*     */     //   786: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   789: aload #24
/*     */     //   791: checkcast java/util/List
/*     */     //   794: astore #9
/*     */     //   796: aload_0
/*     */     //   797: aload_1
/*     */     //   798: aload_2
/*     */     //   799: aload_3
/*     */     //   800: aload #25
/*     */     //   802: aload #25
/*     */     //   804: aload_1
/*     */     //   805: putfield L$0 : Ljava/lang/Object;
/*     */     //   808: aload #25
/*     */     //   810: aload_2
/*     */     //   811: putfield L$1 : Ljava/lang/Object;
/*     */     //   814: aload #25
/*     */     //   816: aload #5
/*     */     //   818: putfield L$2 : Ljava/lang/Object;
/*     */     //   821: aload #25
/*     */     //   823: aload #6
/*     */     //   825: putfield L$3 : Ljava/lang/Object;
/*     */     //   828: aload #25
/*     */     //   830: aload #9
/*     */     //   832: putfield L$4 : Ljava/lang/Object;
/*     */     //   835: aload #25
/*     */     //   837: aconst_null
/*     */     //   838: putfield L$5 : Ljava/lang/Object;
/*     */     //   841: aload #25
/*     */     //   843: bipush #6
/*     */     //   845: putfield label : I
/*     */     //   848: invokespecial createContextForDeclaration : (Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   851: dup
/*     */     //   852: aload #26
/*     */     //   854: if_acmpne -> 915
/*     */     //   857: aload #26
/*     */     //   859: areturn
/*     */     //   860: aload #25
/*     */     //   862: getfield L$4 : Ljava/lang/Object;
/*     */     //   865: checkcast java/util/List
/*     */     //   868: astore #9
/*     */     //   870: aload #25
/*     */     //   872: getfield L$3 : Ljava/lang/Object;
/*     */     //   875: checkcast java/util/List
/*     */     //   878: astore #6
/*     */     //   880: aload #25
/*     */     //   882: getfield L$2 : Ljava/lang/Object;
/*     */     //   885: checkcast java/util/List
/*     */     //   888: astore #5
/*     */     //   890: aload #25
/*     */     //   892: getfield L$1 : Ljava/lang/Object;
/*     */     //   895: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   898: astore_2
/*     */     //   899: aload #25
/*     */     //   901: getfield L$0 : Ljava/lang/Object;
/*     */     //   904: checkcast com/intellij/openapi/project/Project
/*     */     //   907: astore_1
/*     */     //   908: aload #24
/*     */     //   910: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   913: aload #24
/*     */     //   915: checkcast java/lang/String
/*     */     //   918: astore #10
/*     */     //   920: aload #5
/*     */     //   922: checkcast java/lang/Iterable
/*     */     //   925: astore #12
/*     */     //   927: iconst_0
/*     */     //   928: istore #13
/*     */     //   930: aload #12
/*     */     //   932: astore #14
/*     */     //   934: new java/util/ArrayList
/*     */     //   937: dup
/*     */     //   938: aload #12
/*     */     //   940: bipush #10
/*     */     //   942: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   945: invokespecial <init> : (I)V
/*     */     //   948: checkcast java/util/Collection
/*     */     //   951: astore #15
/*     */     //   953: iconst_0
/*     */     //   954: istore #16
/*     */     //   956: aload #14
/*     */     //   958: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   963: astore #17
/*     */     //   965: aload #17
/*     */     //   967: invokeinterface hasNext : ()Z
/*     */     //   972: ifeq -> 1215
/*     */     //   975: aload #17
/*     */     //   977: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   982: astore #18
/*     */     //   984: aload #15
/*     */     //   986: aload #18
/*     */     //   988: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   991: astore #19
/*     */     //   993: astore #23
/*     */     //   995: iconst_0
/*     */     //   996: istore #20
/*     */     //   998: aload #19
/*     */     //   1000: astore #21
/*     */     //   1002: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   1005: aload_1
/*     */     //   1006: aload #19
/*     */     //   1008: aconst_null
/*     */     //   1009: aload #25
/*     */     //   1011: iconst_4
/*     */     //   1012: aconst_null
/*     */     //   1013: aload #25
/*     */     //   1015: aload_1
/*     */     //   1016: putfield L$0 : Ljava/lang/Object;
/*     */     //   1019: aload #25
/*     */     //   1021: aload_2
/*     */     //   1022: putfield L$1 : Ljava/lang/Object;
/*     */     //   1025: aload #25
/*     */     //   1027: aload #6
/*     */     //   1029: putfield L$2 : Ljava/lang/Object;
/*     */     //   1032: aload #25
/*     */     //   1034: aload #9
/*     */     //   1036: putfield L$3 : Ljava/lang/Object;
/*     */     //   1039: aload #25
/*     */     //   1041: aload #10
/*     */     //   1043: putfield L$4 : Ljava/lang/Object;
/*     */     //   1046: aload #25
/*     */     //   1048: aload #15
/*     */     //   1050: putfield L$5 : Ljava/lang/Object;
/*     */     //   1053: aload #25
/*     */     //   1055: aload #17
/*     */     //   1057: putfield L$6 : Ljava/lang/Object;
/*     */     //   1060: aload #25
/*     */     //   1062: aload #21
/*     */     //   1064: putfield L$7 : Ljava/lang/Object;
/*     */     //   1067: aload #25
/*     */     //   1069: aload #23
/*     */     //   1071: putfield L$8 : Ljava/lang/Object;
/*     */     //   1074: aload #25
/*     */     //   1076: bipush #7
/*     */     //   1078: putfield label : I
/*     */     //   1081: invokestatic createContextForDeclaration$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Lcom/intellij/openapi/project/Project;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1084: dup
/*     */     //   1085: aload #26
/*     */     //   1087: if_acmpne -> 1197
/*     */     //   1090: aload #26
/*     */     //   1092: areturn
/*     */     //   1093: iconst_0
/*     */     //   1094: istore #13
/*     */     //   1096: iconst_0
/*     */     //   1097: istore #16
/*     */     //   1099: iconst_0
/*     */     //   1100: istore #20
/*     */     //   1102: aload #25
/*     */     //   1104: getfield L$8 : Ljava/lang/Object;
/*     */     //   1107: checkcast java/util/Collection
/*     */     //   1110: astore #23
/*     */     //   1112: aload #25
/*     */     //   1114: getfield L$7 : Ljava/lang/Object;
/*     */     //   1117: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   1120: astore #21
/*     */     //   1122: aload #25
/*     */     //   1124: getfield L$6 : Ljava/lang/Object;
/*     */     //   1127: checkcast java/util/Iterator
/*     */     //   1130: astore #17
/*     */     //   1132: aload #25
/*     */     //   1134: getfield L$5 : Ljava/lang/Object;
/*     */     //   1137: checkcast java/util/Collection
/*     */     //   1140: astore #15
/*     */     //   1142: aload #25
/*     */     //   1144: getfield L$4 : Ljava/lang/Object;
/*     */     //   1147: checkcast java/lang/String
/*     */     //   1150: astore #10
/*     */     //   1152: aload #25
/*     */     //   1154: getfield L$3 : Ljava/lang/Object;
/*     */     //   1157: checkcast java/util/List
/*     */     //   1160: astore #9
/*     */     //   1162: aload #25
/*     */     //   1164: getfield L$2 : Ljava/lang/Object;
/*     */     //   1167: checkcast java/util/List
/*     */     //   1170: astore #6
/*     */     //   1172: aload #25
/*     */     //   1174: getfield L$1 : Ljava/lang/Object;
/*     */     //   1177: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   1180: astore_2
/*     */     //   1181: aload #25
/*     */     //   1183: getfield L$0 : Ljava/lang/Object;
/*     */     //   1186: checkcast com/intellij/openapi/project/Project
/*     */     //   1189: astore_1
/*     */     //   1190: aload #24
/*     */     //   1192: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1195: aload #24
/*     */     //   1197: aload #21
/*     */     //   1199: swap
/*     */     //   1200: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   1203: aload #23
/*     */     //   1205: swap
/*     */     //   1206: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1211: pop
/*     */     //   1212: goto -> 965
/*     */     //   1215: aload #15
/*     */     //   1217: checkcast java/util/List
/*     */     //   1220: nop
/*     */     //   1221: checkcast java/lang/Iterable
/*     */     //   1224: astore #12
/*     */     //   1226: iconst_0
/*     */     //   1227: istore #13
/*     */     //   1229: aload #12
/*     */     //   1231: astore #14
/*     */     //   1233: new java/util/ArrayList
/*     */     //   1236: dup
/*     */     //   1237: invokespecial <init> : ()V
/*     */     //   1240: checkcast java/util/Collection
/*     */     //   1243: astore #15
/*     */     //   1245: iconst_0
/*     */     //   1246: istore #16
/*     */     //   1248: aload #14
/*     */     //   1250: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1255: astore #17
/*     */     //   1257: aload #17
/*     */     //   1259: invokeinterface hasNext : ()Z
/*     */     //   1264: ifeq -> 1322
/*     */     //   1267: aload #17
/*     */     //   1269: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1274: astore #18
/*     */     //   1276: aload #18
/*     */     //   1278: checkcast kotlin/Pair
/*     */     //   1281: astore #19
/*     */     //   1283: iconst_0
/*     */     //   1284: istore #20
/*     */     //   1286: aload #19
/*     */     //   1288: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   1291: checkcast java/lang/String
/*     */     //   1294: astore #21
/*     */     //   1296: aload #21
/*     */     //   1298: ifnull -> 1305
/*     */     //   1301: iconst_1
/*     */     //   1302: goto -> 1306
/*     */     //   1305: iconst_0
/*     */     //   1306: ifeq -> 1257
/*     */     //   1309: aload #15
/*     */     //   1311: aload #18
/*     */     //   1313: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1318: pop
/*     */     //   1319: goto -> 1257
/*     */     //   1322: aload #15
/*     */     //   1324: checkcast java/util/List
/*     */     //   1327: nop
/*     */     //   1328: checkcast java/lang/Iterable
/*     */     //   1331: astore #12
/*     */     //   1333: iconst_0
/*     */     //   1334: istore #13
/*     */     //   1336: aload #12
/*     */     //   1338: astore #14
/*     */     //   1340: new java/util/ArrayList
/*     */     //   1343: dup
/*     */     //   1344: aload #12
/*     */     //   1346: bipush #10
/*     */     //   1348: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   1351: invokespecial <init> : (I)V
/*     */     //   1354: checkcast java/util/Collection
/*     */     //   1357: astore #15
/*     */     //   1359: iconst_0
/*     */     //   1360: istore #16
/*     */     //   1362: aload #14
/*     */     //   1364: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1369: astore #17
/*     */     //   1371: aload #17
/*     */     //   1373: invokeinterface hasNext : ()Z
/*     */     //   1378: ifeq -> 1629
/*     */     //   1381: aload #17
/*     */     //   1383: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1388: astore #18
/*     */     //   1390: aload #15
/*     */     //   1392: aload #18
/*     */     //   1394: checkcast kotlin/Pair
/*     */     //   1397: astore #19
/*     */     //   1399: astore #23
/*     */     //   1401: iconst_0
/*     */     //   1402: istore #20
/*     */     //   1404: aload #19
/*     */     //   1406: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   1409: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   1412: astore #21
/*     */     //   1414: aload #19
/*     */     //   1416: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   1419: checkcast java/lang/String
/*     */     //   1422: astore #22
/*     */     //   1424: aload_1
/*     */     //   1425: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3$1
/*     */     //   1428: dup
/*     */     //   1429: aload #22
/*     */     //   1431: aload #21
/*     */     //   1433: invokespecial <init> : (Ljava/lang/String;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)V
/*     */     //   1436: checkcast kotlin/jvm/functions/Function0
/*     */     //   1439: aload #25
/*     */     //   1441: aload #25
/*     */     //   1443: aload_1
/*     */     //   1444: putfield L$0 : Ljava/lang/Object;
/*     */     //   1447: aload #25
/*     */     //   1449: aload_2
/*     */     //   1450: putfield L$1 : Ljava/lang/Object;
/*     */     //   1453: aload #25
/*     */     //   1455: aload #6
/*     */     //   1457: putfield L$2 : Ljava/lang/Object;
/*     */     //   1460: aload #25
/*     */     //   1462: aload #9
/*     */     //   1464: putfield L$3 : Ljava/lang/Object;
/*     */     //   1467: aload #25
/*     */     //   1469: aload #10
/*     */     //   1471: putfield L$4 : Ljava/lang/Object;
/*     */     //   1474: aload #25
/*     */     //   1476: aload #15
/*     */     //   1478: putfield L$5 : Ljava/lang/Object;
/*     */     //   1481: aload #25
/*     */     //   1483: aload #17
/*     */     //   1485: putfield L$6 : Ljava/lang/Object;
/*     */     //   1488: aload #25
/*     */     //   1490: aload #23
/*     */     //   1492: putfield L$7 : Ljava/lang/Object;
/*     */     //   1495: aload #25
/*     */     //   1497: aconst_null
/*     */     //   1498: putfield L$8 : Ljava/lang/Object;
/*     */     //   1501: aload #25
/*     */     //   1503: bipush #8
/*     */     //   1505: putfield label : I
/*     */     //   1508: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1511: dup
/*     */     //   1512: aload #26
/*     */     //   1514: if_acmpne -> 1614
/*     */     //   1517: aload #26
/*     */     //   1519: areturn
/*     */     //   1520: iconst_0
/*     */     //   1521: istore #13
/*     */     //   1523: iconst_0
/*     */     //   1524: istore #16
/*     */     //   1526: iconst_0
/*     */     //   1527: istore #20
/*     */     //   1529: aload #25
/*     */     //   1531: getfield L$7 : Ljava/lang/Object;
/*     */     //   1534: checkcast java/util/Collection
/*     */     //   1537: astore #23
/*     */     //   1539: aload #25
/*     */     //   1541: getfield L$6 : Ljava/lang/Object;
/*     */     //   1544: checkcast java/util/Iterator
/*     */     //   1547: astore #17
/*     */     //   1549: aload #25
/*     */     //   1551: getfield L$5 : Ljava/lang/Object;
/*     */     //   1554: checkcast java/util/Collection
/*     */     //   1557: astore #15
/*     */     //   1559: aload #25
/*     */     //   1561: getfield L$4 : Ljava/lang/Object;
/*     */     //   1564: checkcast java/lang/String
/*     */     //   1567: astore #10
/*     */     //   1569: aload #25
/*     */     //   1571: getfield L$3 : Ljava/lang/Object;
/*     */     //   1574: checkcast java/util/List
/*     */     //   1577: astore #9
/*     */     //   1579: aload #25
/*     */     //   1581: getfield L$2 : Ljava/lang/Object;
/*     */     //   1584: checkcast java/util/List
/*     */     //   1587: astore #6
/*     */     //   1589: aload #25
/*     */     //   1591: getfield L$1 : Ljava/lang/Object;
/*     */     //   1594: checkcast org/jetbrains/kotlin/psi/KtValVarKeywordOwner
/*     */     //   1597: astore_2
/*     */     //   1598: aload #25
/*     */     //   1600: getfield L$0 : Ljava/lang/Object;
/*     */     //   1603: checkcast com/intellij/openapi/project/Project
/*     */     //   1606: astore_1
/*     */     //   1607: aload #24
/*     */     //   1609: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1612: aload #24
/*     */     //   1614: checkcast java/lang/String
/*     */     //   1617: aload #23
/*     */     //   1619: swap
/*     */     //   1620: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1625: pop
/*     */     //   1626: goto -> 1371
/*     */     //   1629: aload #15
/*     */     //   1631: checkcast java/util/List
/*     */     //   1634: nop
/*     */     //   1635: astore #11
/*     */     //   1637: aload_1
/*     */     //   1638: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$2
/*     */     //   1641: dup
/*     */     //   1642: aload_2
/*     */     //   1643: aload #10
/*     */     //   1645: aload #11
/*     */     //   1647: aload #6
/*     */     //   1649: aload #9
/*     */     //   1651: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
/*     */     //   1654: checkcast kotlin/jvm/functions/Function0
/*     */     //   1657: aload #25
/*     */     //   1659: aload #25
/*     */     //   1661: aconst_null
/*     */     //   1662: putfield L$0 : Ljava/lang/Object;
/*     */     //   1665: aload #25
/*     */     //   1667: aconst_null
/*     */     //   1668: putfield L$1 : Ljava/lang/Object;
/*     */     //   1671: aload #25
/*     */     //   1673: aconst_null
/*     */     //   1674: putfield L$2 : Ljava/lang/Object;
/*     */     //   1677: aload #25
/*     */     //   1679: aconst_null
/*     */     //   1680: putfield L$3 : Ljava/lang/Object;
/*     */     //   1683: aload #25
/*     */     //   1685: aconst_null
/*     */     //   1686: putfield L$4 : Ljava/lang/Object;
/*     */     //   1689: aload #25
/*     */     //   1691: aconst_null
/*     */     //   1692: putfield L$5 : Ljava/lang/Object;
/*     */     //   1695: aload #25
/*     */     //   1697: aconst_null
/*     */     //   1698: putfield L$6 : Ljava/lang/Object;
/*     */     //   1701: aload #25
/*     */     //   1703: aconst_null
/*     */     //   1704: putfield L$7 : Ljava/lang/Object;
/*     */     //   1707: aload #25
/*     */     //   1709: aconst_null
/*     */     //   1710: putfield L$8 : Ljava/lang/Object;
/*     */     //   1713: aload #25
/*     */     //   1715: bipush #9
/*     */     //   1717: putfield label : I
/*     */     //   1720: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1723: dup
/*     */     //   1724: aload #26
/*     */     //   1726: if_acmpne -> 1739
/*     */     //   1729: aload #26
/*     */     //   1731: areturn
/*     */     //   1732: aload #24
/*     */     //   1734: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1737: aload #24
/*     */     //   1739: areturn
/*     */     //   1740: new java/lang/IllegalStateException
/*     */     //   1743: dup
/*     */     //   1744: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1746: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1749: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #15	-> 63
/*     */     //   #17	-> 129
/*     */     //   #15	-> 182
/*     */     //   #19	-> 233
/*     */     //   #15	-> 295
/*     */     //   #31	-> 356
/*     */     //   #15	-> 423
/*     */     //   #34	-> 494
/*     */     //   #15	-> 568
/*     */     //   #35	-> 649
/*     */     //   #15	-> 725
/*     */     //   #38	-> 796
/*     */     //   #15	-> 857
/*     */     //   #39	-> 920
/*     */     //   #40	-> 927
/*     */     //   #158	-> 930
/*     */     //   #159	-> 956
/*     */     //   #160	-> 984
/*     */     //   #40	-> 998
/*     */     //   #15	-> 1090
/*     */     //   #40	-> 1197
/*     */     //   #160	-> 1206
/*     */     //   #161	-> 1215
/*     */     //   #158	-> 1220
/*     */     //   #41	-> 1226
/*     */     //   #162	-> 1229
/*     */     //   #163	-> 1248
/*     */     //   #41	-> 1286
/*     */     //   #163	-> 1306
/*     */     //   #164	-> 1322
/*     */     //   #162	-> 1327
/*     */     //   #42	-> 1333
/*     */     //   #165	-> 1336
/*     */     //   #166	-> 1362
/*     */     //   #167	-> 1390
/*     */     //   #42	-> 1404
/*     */     //   #15	-> 1517
/*     */     //   #42	-> 1614
/*     */     //   #167	-> 1620
/*     */     //   #168	-> 1629
/*     */     //   #165	-> 1634
/*     */     //   #42	-> 1635
/*     */     //   #39	-> 1635
/*     */     //   #44	-> 1637
/*     */     //   #15	-> 1729
/*     */     //   #44	-> 1739
/*     */     //   #15	-> 1740
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   129	56	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   221	77	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   344	82	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   482	89	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   637	91	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   784	67	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   129	56	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   212	86	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   335	91	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   473	98	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   628	100	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   775	85	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   908	185	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1190	13	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1203	18	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1221	85	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1306	22	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1328	192	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1607	10	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1617	18	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1635	88	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   129	56	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   203	95	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   326	100	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   464	107	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   619	109	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   766	94	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   899	194	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1181	22	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1203	18	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1221	85	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1306	22	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1328	192	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1598	19	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1617	18	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1635	88	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   129	56	3	newVariableName	Ljava/lang/String;
/*     */     //   194	104	3	newVariableName	Ljava/lang/String;
/*     */     //   317	109	3	newVariableName	Ljava/lang/String;
/*     */     //   455	116	3	newVariableName	Ljava/lang/String;
/*     */     //   610	118	3	newVariableName	Ljava/lang/String;
/*     */     //   757	94	3	newVariableName	Ljava/lang/String;
/*     */     //   233	65	5	variablesInsideInitializer	Ljava/util/List;
/*     */     //   308	118	5	variablesInsideInitializer	Ljava/util/List;
/*     */     //   446	125	5	variablesInsideInitializer	Ljava/util/List;
/*     */     //   601	127	5	variablesInsideInitializer	Ljava/util/List;
/*     */     //   748	112	5	variablesInsideInitializer	Ljava/util/List;
/*     */     //   890	37	5	variablesInsideInitializer	Ljava/util/List;
/*     */     //   356	70	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   436	135	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   591	137	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   738	122	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   880	213	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1172	31	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1203	18	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1221	85	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1306	22	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1328	192	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1589	28	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1617	18	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   1635	88	6	usagesOfPassedVariables	Ljava/util/List;
/*     */     //   494	77	7	usages	Ljava/util/List;
/*     */     //   581	138	7	usages	Ljava/util/List;
/*     */     //   649	70	8	originalName	Ljava/lang/String;
/*     */     //   796	64	9	usageContext	Ljava/util/List;
/*     */     //   870	223	9	usageContext	Ljava/util/List;
/*     */     //   1162	41	9	usageContext	Ljava/util/List;
/*     */     //   1203	18	9	usageContext	Ljava/util/List;
/*     */     //   1221	85	9	usageContext	Ljava/util/List;
/*     */     //   1306	22	9	usageContext	Ljava/util/List;
/*     */     //   1328	192	9	usageContext	Ljava/util/List;
/*     */     //   1579	38	9	usageContext	Ljava/util/List;
/*     */     //   1617	18	9	usageContext	Ljava/util/List;
/*     */     //   1635	88	9	usageContext	Ljava/util/List;
/*     */     //   920	173	10	declarationContext	Ljava/lang/String;
/*     */     //   1152	51	10	declarationContext	Ljava/lang/String;
/*     */     //   1203	18	10	declarationContext	Ljava/lang/String;
/*     */     //   1221	85	10	declarationContext	Ljava/lang/String;
/*     */     //   1306	22	10	declarationContext	Ljava/lang/String;
/*     */     //   1328	192	10	declarationContext	Ljava/lang/String;
/*     */     //   1569	48	10	declarationContext	Ljava/lang/String;
/*     */     //   1617	18	10	declarationContext	Ljava/lang/String;
/*     */     //   1635	88	10	declarationContext	Ljava/lang/String;
/*     */     //   1637	86	11	declarationsForDependencyVariables	Ljava/util/List;
/*     */     //   927	26	12	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   1226	19	12	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   1333	26	12	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   953	12	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1245	12	14	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1359	12	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   953	140	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1142	75	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1245	79	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1359	161	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1559	72	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   984	11	18	item$iv$iv	Ljava/lang/Object;
/*     */     //   1276	43	18	element$iv$iv	Ljava/lang/Object;
/*     */     //   1390	11	18	item$iv$iv	Ljava/lang/Object;
/*     */     //   995	89	19	dependencyVariable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1296	9	21	text	Ljava/lang/String;
/*     */     //   1414	97	21	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   1424	87	22	text	Ljava/lang/String;
/*     */     //   998	95	20	$i$a$-map-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$1	I
/*     */     //   956	137	16	$i$f$mapTo	I
/*     */     //   930	163	13	$i$f$map	I
/*     */     //   1286	20	20	$i$a$-filter-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$2	I
/*     */     //   1248	76	16	$i$f$filterTo	I
/*     */     //   1229	99	13	$i$f$filter	I
/*     */     //   1404	116	20	$i$a$-map-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3	I
/*     */     //   1362	158	16	$i$f$mapTo	I
/*     */     //   1336	184	13	$i$f$map	I
/*     */     //   53	1687	25	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	1680	24	$result	Ljava/lang/Object;
/*     */     //   1102	101	20	$i$a$-map-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$1	I
/*     */     //   1099	118	16	$i$f$mapTo	I
/*     */     //   1096	125	13	$i$f$map	I
/*     */     //   1529	88	20	$i$a$-map-VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3	I
/*     */     //   1526	105	16	$i$f$mapTo	I
/*     */     //   1523	112	13	$i$f$map	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;", "invoke"})
/*     */   static final class VariableContextCollector$createContextPrompt$variablesInsideInitializer$1 extends Lambda implements Function0<List<? extends KtValVarKeywordOwner>> { @NotNull
/*  17 */     public final List<KtValVarKeywordOwner> invoke() { return VariableContextCollector.INSTANCE.findUsedVariables((PsiElement)this.$variable); } VariableContextCollector$createContextPrompt$variablesInsideInitializer$1(KtValVarKeywordOwner $variable) { super(0); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "", "invoke"}) @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1#2:158\n1#2:178\n1360#3:159\n1446#3,5:160\n766#3:165\n857#3,2:166\n1603#3,9:168\n1855#3:177\n1856#3:179\n1612#3:180\n1045#3:181\n1549#3:182\n1620#3,3:183\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1\n*L\n24#1:178\n22#1:159\n22#1:160,5\n23#1:165\n23#1:166,2\n24#1:168,9\n24#1:177\n24#1:179\n24#1:180\n25#1:181\n28#1:182\n28#1:183,3\n*E\n"})
/*     */   static final class VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1 extends Lambda implements Function0<List<? extends String>> {
/*     */     @NotNull
/*  20 */     public final List<String> invoke() { List<KtValVarKeywordOwner> list1 = this.$variablesInsideInitializer;
/*  21 */       List<KtValVarKeywordOwner> variables = list1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 158 */       int $i$a$-takeIf-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$1 = 0; if ((((variables.size() < 3)) ? list1 : null) == null)
/* 159 */         ((variables.size() < 3)) ? list1 : null;  list1 = CollectionsKt.emptyList(); VariableContextCollector variableContextCollector = VariableContextCollector.INSTANCE; int $i$f$flatMap = 0; List<KtValVarKeywordOwner> list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$flatMapTo = 0;
/* 160 */       for (KtValVarKeywordOwner element$iv$iv : list2) {
/* 161 */         KtValVarKeywordOwner p0 = element$iv$iv; int $i$a$-flatMap-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$2 = 0; Iterable list$iv$iv = variableContextCollector.findVariableReferences(p0);
/* 162 */         CollectionsKt.addAll(collection, list$iv$iv);
/*     */       } 
/* 164 */       Iterable $this$flatMap$iv = collection; KtValVarKeywordOwner ktValVarKeywordOwner = this.$variable; int $i$f$filter = 0;
/* 165 */       Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv; collection = new ArrayList(); int $i$f$filterTo = 0;
/* 166 */       for (Object element$iv$iv : $this$flatMapTo$iv$iv) { KtReferenceExpression reference = (KtReferenceExpression)element$iv$iv; int $i$a$-filter-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$3 = 0; if ((reference.getTextRange().getEndOffset() < ktValVarKeywordOwner.getTextRange().getStartOffset())) collection.add(element$iv$iv);  }
/* 167 */        Iterable $this$filter$iv = collection; int $i$f$mapNotNull = 0;
/* 168 */       Iterable iterable1 = $this$filter$iv; Collection<String> destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 176 */       Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 177 */       Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; KtReferenceExpression reference = (KtReferenceExpression)element$iv$iv;
/*     */         int $i$a$-mapNotNull-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$4 = 0; }
/*     */       
/* 180 */       Iterable $this$mapNotNull$iv = destination$iv$iv; int $i$f$sortedBy = 0;
/* 181 */       Iterable $this$sortedBy$iv = CollectionsKt.distinct(CollectionsKt.takeLast(CollectionsKt.sortedWith($this$mapNotNull$iv, new VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$invoke$$inlined$sortedBy$1()), 3)); int $i$f$map = 0;
/* 182 */       Iterable $this$mapNotNullTo$iv$iv = $this$sortedBy$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$sortedBy$iv, 10)); int $i$f$mapTo = 0;
/* 183 */       for (Object item$iv$iv : $this$mapNotNullTo$iv$iv) {
/* 184 */         PsiElement psiElement = (PsiElement)item$iv$iv; Collection<String> collection1 = destination$iv$iv; int $i$a$-map-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$6 = 0; collection1.add(VariableContextCollector.createContextString$default(VariableContextCollector.INSTANCE, psiElement, null, null, 6, null));
/* 185 */       }  return (List<String>)destination$iv$iv; } VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1(List<KtValVarKeywordOwner> $variablesInsideInitializer, KtValVarKeywordOwner $variable) { super(0); }
/*     */   }
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/psi/PsiElement;", "invoke"}) @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1603#2,9:158\n1855#2:167\n1856#2:169\n1612#2:170\n1#3:168\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usages$1\n*L\n32#1:158,9\n32#1:167\n32#1:169\n32#1:170\n32#1:168\n*E\n"}) static final class VariableContextCollector$createContextPrompt$usages$1 extends Lambda implements Function0<List<? extends PsiElement>> { @NotNull public final List<PsiElement> invoke() { List list1 = VariableContextCollector.INSTANCE.findVariableReferences(this.$variable); VariableContextCollector variableContextCollector = VariableContextCollector.INSTANCE; int $i$f$mapNotNull = 0; List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0; Iterable $this$forEach$iv$iv$iv = list2; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; KtReferenceExpression p0 = (KtReferenceExpression)element$iv$iv; int $i$a$-mapNotNull-VariableContextCollector$createContextPrompt$usages$1$1 = 0; }  return CollectionsKt.distinct(destination$iv$iv); }
/*     */     VariableContextCollector$createContextPrompt$usages$1(KtValVarKeywordOwner $variable) { super(0); } }
/*     */   private static final String createContextString$createContextForArguments(String $originalName, PsiElement $context, String $newName) { if ($originalName == null)
/* 190 */       return "";  Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType($context, KtValueArgument.class), "findChildrenOfType(conte…alueArgument::class.java)"); Collection collection1 = PsiTreeUtil.findChildrenOfType($context, KtValueArgument.class); int $i$f$filter = 0; Collection collection2 = collection1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 191 */     for (Object element$iv$iv : collection2) { KtValueArgument reference = (KtValueArgument)element$iv$iv; int $i$a$-filter-VariableContextCollector$createContextString$createContextForArguments$argumentsAsAssignments$1 = 0; if (Intrinsics.areEqual(reference.getText(), $originalName)) destination$iv$iv.add(element$iv$iv);  }
/* 192 */      Iterable $this$filter$iv = destination$iv$iv; VariableContextCollector variableContextCollector = INSTANCE; int $i$f$mapNotNull = 0;
/* 193 */     Iterable iterable1 = $this$filter$iv; Collection collection3 = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 202 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; KtValueArgument p0 = (KtValueArgument)element$iv$iv;
/*     */       int $i$a$-mapNotNull-VariableContextCollector$createContextString$createContextForArguments$argumentsAsAssignments$2 = 0; }
/*     */     
/* 205 */     List argumentsAsAssignments = (List)collection3;
/*     */     if (argumentsAsAssignments.isEmpty())
/*     */       return ""; 
/*     */     return " //" + CollectionsKt.joinToString$default(argumentsAsAssignments, ", ", null, null, 0, null, new VariableContextCollector$createContextString$createContextForArguments$1($newName), 30, null); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class VariableContextCollector$createContextPrompt$originalName$1 extends Lambda implements Function0<String> {
/*     */     VariableContextCollector$createContextPrompt$originalName$1(KtValVarKeywordOwner $variable) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       KtValVarKeywordOwner ktValVarKeywordOwner = this.$variable;
/*     */       (ktValVarKeywordOwner instanceof PsiNamedElement) ? ktValVarKeywordOwner : null;
/*     */       if (((((ktValVarKeywordOwner instanceof PsiNamedElement) ? ktValVarKeywordOwner : null) != null) ? ((ktValVarKeywordOwner instanceof PsiNamedElement) ? ktValVarKeywordOwner : null).getName() : null) == null)
/*     */         (((ktValVarKeywordOwner instanceof PsiNamedElement) ? ktValVarKeywordOwner : null) != null) ? ((ktValVarKeywordOwner instanceof PsiNamedElement) ? ktValVarKeywordOwner : null).getName() : null; 
/*     */       return "";
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usageContext$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usageContext$1\n*L\n35#1:158\n35#1:159,3\n*E\n"})
/*     */   static final class VariableContextCollector$createContextPrompt$usageContext$1 extends Lambda implements Function0<List<? extends String>> {
/*     */     VariableContextCollector$createContextPrompt$usageContext$1(List<PsiElement> $usages, String $originalName, String $newVariableName) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> invoke() {
/*     */       List<PsiElement> list1 = this.$usages;
/*     */       String str1 = this.$originalName, str2 = this.$newVariableName;
/*     */       int $i$f$map = 0;
/*     */       List<PsiElement> list2 = list1;
/*     */       Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
/*     */       int $i$f$mapTo = 0;
/*     */       for (PsiElement item$iv$iv : list2) {
/*     */         PsiElement psiElement1 = item$iv$iv;
/*     */         Collection<String> collection = destination$iv$iv;
/*     */         int $i$a$-map-VariableContextCollector$createContextPrompt$usageContext$1$1 = 0;
/*     */         collection.add(VariableContextCollector.INSTANCE.createContextString(psiElement1, str1, str2));
/*     */       } 
/*     */       return (List<String>)destination$iv$iv;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3$1 extends Lambda implements Function0<String> {
/*     */     VariableContextCollector$createContextPrompt$declarationsForDependencyVariables$3$1(String $text, KtValVarKeywordOwner $variable) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       Intrinsics.checkNotNull(this.$text);
/*     */       return VariableContextCollector.INSTANCE.addVarIfNeeded(this.$text, this.$variable);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/*     */   static final class VariableContextCollector$createContextPrompt$2 extends Lambda implements Function0<String> {
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */       //   4: checkcast com/intellij/psi/PsiElement
/*     */       //   7: ldc org/jetbrains/kotlin/psi/KtFunction
/*     */       //   9: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */       //   12: checkcast org/jetbrains/kotlin/psi/KtFunction
/*     */       //   15: astore_1
/*     */       //   16: aload_1
/*     */       //   17: dup
/*     */       //   18: ifnull -> 54
/*     */       //   21: invokeinterface getTypeReference : ()Lorg/jetbrains/kotlin/psi/KtTypeReference;
/*     */       //   26: dup
/*     */       //   27: ifnull -> 54
/*     */       //   30: invokevirtual getTypeText : ()Ljava/lang/String;
/*     */       //   33: dup
/*     */       //   34: ifnull -> 54
/*     */       //   37: astore #7
/*     */       //   39: iconst_0
/*     */       //   40: istore #8
/*     */       //   42: aload #7
/*     */       //   44: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   49: nop
/*     */       //   50: dup
/*     */       //   51: ifnonnull -> 57
/*     */       //   54: pop
/*     */       //   55: ldc ''
/*     */       //   57: astore_2
/*     */       //   58: aload_1
/*     */       //   59: dup
/*     */       //   60: ifnull -> 72
/*     */       //   63: invokeinterface getName : ()Ljava/lang/String;
/*     */       //   68: dup
/*     */       //   69: ifnonnull -> 75
/*     */       //   72: pop
/*     */       //   73: ldc 'test'
/*     */       //   75: astore_3
/*     */       //   76: aload_0
/*     */       //   77: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */       //   80: checkcast com/intellij/psi/PsiElement
/*     */       //   83: ldc org/jetbrains/kotlin/psi/KtClass
/*     */       //   85: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */       //   88: checkcast org/jetbrains/kotlin/psi/KtClass
/*     */       //   91: dup
/*     */       //   92: ifnull -> 102
/*     */       //   95: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   98: dup
/*     */       //   99: ifnonnull -> 105
/*     */       //   102: pop
/*     */       //   103: ldc 'C'
/*     */       //   105: astore #4
/*     */       //   107: aload_0
/*     */       //   108: getfield $declarationContext : Ljava/lang/String;
/*     */       //   111: astore #6
/*     */       //   113: aload_0
/*     */       //   114: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */       //   117: astore #7
/*     */       //   119: aload #6
/*     */       //   121: astore #8
/*     */       //   123: iconst_0
/*     */       //   124: istore #9
/*     */       //   126: aload #7
/*     */       //   128: instanceof org/jetbrains/kotlin/psi/KtParameter
/*     */       //   131: ifeq -> 139
/*     */       //   134: aload #6
/*     */       //   136: goto -> 140
/*     */       //   139: aconst_null
/*     */       //   140: dup
/*     */       //   141: ifnonnull -> 147
/*     */       //   144: pop
/*     */       //   145: ldc ''
/*     */       //   147: astore #5
/*     */       //   149: aload_0
/*     */       //   150: getfield $declarationContext : Ljava/lang/String;
/*     */       //   153: astore #8
/*     */       //   155: aload_0
/*     */       //   156: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */       //   159: astore #9
/*     */       //   161: aload #8
/*     */       //   163: astore #10
/*     */       //   165: iconst_0
/*     */       //   166: istore #11
/*     */       //   168: aload #9
/*     */       //   170: instanceof org/jetbrains/kotlin/psi/KtParameter
/*     */       //   173: ifne -> 180
/*     */       //   176: iconst_1
/*     */       //   177: goto -> 181
/*     */       //   180: iconst_0
/*     */       //   181: ifeq -> 189
/*     */       //   184: aload #8
/*     */       //   186: goto -> 190
/*     */       //   189: aconst_null
/*     */       //   190: dup
/*     */       //   191: ifnull -> 222
/*     */       //   194: astore #8
/*     */       //   196: aload_0
/*     */       //   197: getfield $variable : Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */       //   200: astore #9
/*     */       //   202: aload #8
/*     */       //   204: astore #10
/*     */       //   206: iconst_0
/*     */       //   207: istore #11
/*     */       //   209: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */       //   212: aload #10
/*     */       //   214: aload #9
/*     */       //   216: invokestatic access$addVarIfNeeded : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/lang/String;Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;)Ljava/lang/String;
/*     */       //   219: goto -> 224
/*     */       //   222: pop
/*     */       //   223: aconst_null
/*     */       //   224: dup
/*     */       //   225: ifnonnull -> 231
/*     */       //   228: pop
/*     */       //   229: ldc ''
/*     */       //   231: astore #6
/*     */       //   233: aload #4
/*     */       //   235: aload_3
/*     */       //   236: aload #5
/*     */       //   238: aload_2
/*     */       //   239: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */       //   242: aload_0
/*     */       //   243: getfield $declarationsForDependencyVariables : Ljava/util/List;
/*     */       //   246: checkcast java/util/Collection
/*     */       //   249: aconst_null
/*     */       //   250: iconst_1
/*     */       //   251: aconst_null
/*     */       //   252: invokestatic indent$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/util/Collection;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   255: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */       //   258: aload_0
/*     */       //   259: getfield $usagesOfPassedVariables : Ljava/util/List;
/*     */       //   262: checkcast java/util/Collection
/*     */       //   265: aconst_null
/*     */       //   266: iconst_1
/*     */       //   267: aconst_null
/*     */       //   268: invokestatic indent$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/util/Collection;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   271: aload #6
/*     */       //   273: astore #8
/*     */       //   275: astore #17
/*     */       //   277: astore #16
/*     */       //   279: astore #15
/*     */       //   281: astore #14
/*     */       //   283: astore #13
/*     */       //   285: astore #12
/*     */       //   287: iconst_0
/*     */       //   288: istore #9
/*     */       //   290: aload #8
/*     */       //   292: checkcast java/lang/CharSequence
/*     */       //   295: invokeinterface length : ()I
/*     */       //   300: ifne -> 307
/*     */       //   303: iconst_1
/*     */       //   304: goto -> 308
/*     */       //   307: iconst_0
/*     */       //   308: ifeq -> 316
/*     */       //   311: ldc ''
/*     */       //   313: goto -> 323
/*     */       //   316: aload #8
/*     */       //   318: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   323: astore #18
/*     */       //   325: aload #12
/*     */       //   327: aload #13
/*     */       //   329: aload #14
/*     */       //   331: aload #15
/*     */       //   333: aload #16
/*     */       //   335: aload #17
/*     */       //   337: aload #18
/*     */       //   339: nop
/*     */       //   340: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */       //   343: aload_0
/*     */       //   344: getfield $usageContext : Ljava/util/List;
/*     */       //   347: checkcast java/util/Collection
/*     */       //   350: aconst_null
/*     */       //   351: iconst_1
/*     */       //   352: aconst_null
/*     */       //   353: invokestatic indent$default : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Ljava/util/Collection;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   356: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   361: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   364: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #45	-> 0
/*     */       //   #46	-> 16
/*     */       //   #158	-> 39
/*     */       //   #46	-> 42
/*     */       //   #46	-> 49
/*     */       //   #46	-> 50
/*     */       //   #47	-> 58
/*     */       //   #48	-> 76
/*     */       //   #49	-> 107
/*     */       //   #158	-> 123
/*     */       //   #49	-> 126
/*     */       //   #49	-> 131
/*     */       //   #49	-> 140
/*     */       //   #49	-> 147
/*     */       //   #50	-> 149
/*     */       //   #158	-> 165
/*     */       //   #50	-> 168
/*     */       //   #50	-> 181
/*     */       //   #50	-> 190
/*     */       //   #158	-> 206
/*     */       //   #50	-> 209
/*     */       //   #50	-> 219
/*     */       //   #50	-> 222
/*     */       //   #50	-> 231
/*     */       //   #52	-> 233
/*     */       //   #53	-> 235
/*     */       //   #54	-> 239
/*     */       //   #55	-> 255
/*     */       //   #56	-> 271
/*     */       //   #158	-> 275
/*     */       //   #56	-> 290
/*     */       //   #56	-> 308
/*     */       //   #56	-> 339
/*     */       //   #57	-> 340
/*     */       //   #60	-> 361
/*     */       //   #51	-> 364
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   42	7	8	$i$a$-let-VariableContextCollector$createContextPrompt$2$returnType$1	I
/*     */       //   39	10	7	it	Ljava/lang/String;
/*     */       //   126	5	9	$i$a$-takeIf-VariableContextCollector$createContextPrompt$2$parameters$1	I
/*     */       //   123	8	8	it	Ljava/lang/String;
/*     */       //   168	13	11	$i$a$-takeIf-VariableContextCollector$createContextPrompt$2$declaration$1	I
/*     */       //   165	16	10	it	Ljava/lang/String;
/*     */       //   209	10	11	$i$a$-let-VariableContextCollector$createContextPrompt$2$declaration$2	I
/*     */       //   206	13	10	it	Ljava/lang/String;
/*     */       //   290	33	9	$i$a$-let-VariableContextCollector$createContextPrompt$2$1	I
/*     */       //   287	36	8	it	Ljava/lang/String;
/*     */       //   16	349	1	containingFunction	Lorg/jetbrains/kotlin/psi/KtFunction;
/*     */       //   58	307	2	returnType	Ljava/lang/String;
/*     */       //   76	289	3	name	Ljava/lang/String;
/*     */       //   107	258	4	className	Ljava/lang/String;
/*     */       //   149	216	5	parameters	Ljava/lang/String;
/*     */       //   233	132	6	declaration	Ljava/lang/String;
/*     */       //   0	365	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$2;
/*     */     }
/*     */     
/*     */     VariableContextCollector$createContextPrompt$2(KtValVarKeywordOwner $variable, String $declarationContext, List<String> $declarationsForDependencyVariables, List<String> $usagesOfPassedVariables, List<String> $usageContext) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   private final String indent(Collection $this$indent, String indent) {
/*     */     if ($this$indent.isEmpty())
/*     */       return ""; 
/*     */     return indent + indent;
/*     */   }
/*     */   
/*     */   private final String addVarIfNeeded(String text, KtValVarKeywordOwner variable) {
/*     */     if (variable.getValOrVarKeyword() != null)
/*     */       return text; 
/*     */     if (StringsKt.startsWith$default(text, "var ", false, 2, null) || StringsKt.startsWith$default(text, "val ", false, 2, null))
/*     */       return text; 
/*     */     return "var " + text;
/*     */   }
/*     */   
/*     */   private final String findParameterForCallArgument(KtValueArgument argument) {
/*     */     Object object3, object4;
/*     */     KtParameter parameter;
/*     */     PsiElement psiElement1 = argument.getParent();
/*     */     if (((psiElement1 instanceof org.jetbrains.kotlin.psi.KtValueArgumentList) ? psiElement1 : null) == null) {
/*     */       (psiElement1 instanceof org.jetbrains.kotlin.psi.KtValueArgumentList) ? psiElement1 : null;
/*     */       return null;
/*     */     } 
/*     */     Integer integer = Integer.valueOf(object1.getArguments().indexOf(argument));
/*     */     int it = integer.intValue();
/*     */     int $i$a$-takeIf-VariableContextCollector$findParameterForCallArgument$argumentPosition$1 = 0;
/*     */     if ((((it >= 0)) ? integer : null) != null) {
/*     */     
/*     */     } else {
/*     */       (((it >= 0)) ? integer : null).intValue();
/*     */       return null;
/*     */     } 
/*     */     Object object1 = (psiElement1 instanceof org.jetbrains.kotlin.psi.KtValueArgumentList) ? psiElement1 : null;
/*     */     Object object2 = object1;
/*     */     PsiElement psiElement2 = object1.getParent();
/*     */     if (((psiElement2 instanceof org.jetbrains.kotlin.psi.KtCallExpression) ? psiElement2 : null) == null) {
/*     */       (psiElement2 instanceof org.jetbrains.kotlin.psi.KtCallExpression) ? psiElement2 : null;
/*     */       return null;
/*     */     } 
/*     */     ReferenceUtilsKt.getMainReference((KtElement)object3.getCalleeExpression());
/*     */     PsiElement psiElement3 = (object3.getCalleeExpression() != null && ReferenceUtilsKt.getMainReference((KtElement)object3.getCalleeExpression()) != null) ? ReferenceUtilsKt.getMainReference((KtElement)object3.getCalleeExpression()).resolve() : null;
/*     */     if (((psiElement3 instanceof org.jetbrains.kotlin.psi.KtFunction) ? psiElement3 : null) == null) {
/*     */       (psiElement3 instanceof org.jetbrains.kotlin.psi.KtFunction) ? psiElement3 : null;
/*     */       return null;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(object4.getValueParameters(), "resolvedFunction.valueParameters");
/*     */     if ((KtParameter)CollectionsKt.getOrNull(object4.getValueParameters(), object2) == null) {
/*     */       (KtParameter)CollectionsKt.getOrNull(object4.getValueParameters(), object2);
/*     */       return null;
/*     */     } 
/*     */     return parameter.getName();
/*     */   }
/*     */   
/*     */   private final List<KtReferenceExpression> findVariableReferences(KtValVarKeywordOwner variable) {
/*     */     (KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtDeclarationWithBody.class);
/*     */     (KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtProperty.class);
/*     */     KtElement scope = ((KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtDeclarationWithBody.class) != null) ? (KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtDeclarationWithBody.class) : (((KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtProperty.class) != null) ? (KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtProperty.class) : (KtElement)PsiTreeUtil.getParentOfType((PsiElement)variable, KtClassBody.class));
/*     */     return getVariableReferences(variable, (PsiElement)scope);
/*     */   }
/*     */   
/*     */   private final List<KtReferenceExpression> getVariableReferences(KtValVarKeywordOwner variable, PsiElement context) {
/*     */     if (context == null)
/*     */       return CollectionsKt.emptyList(); 
/*     */     List<KtReferenceExpression> result = new ArrayList();
/*     */     PsiTreeUtil.processElements(context, new VariableContextCollector$getVariableReferences$1<>(variable, result));
/*     */     return result;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\0012\013\020\002\032\0070\003¢\006\002\b\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "e", "Lcom/intellij/psi/PsiElement;", "Lorg/jetbrains/annotations/NotNull;", "execute"})
/*     */   static final class VariableContextCollector$getVariableReferences$1<T extends PsiElement> implements PsiElementProcessor {
/*     */     VariableContextCollector$getVariableReferences$1(KtValVarKeywordOwner $variable, List<KtReferenceExpression> $result) {}
/*     */     
/*     */     public final boolean execute(@NotNull PsiElement e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       if (e instanceof KtReferenceExpression && ReferenceUtilsKt.getMainReference((KtReferenceExpression)e).isReferenceTo((PsiElement)this.$variable))
/*     */         this.$result.add(e); 
/*     */       return (this.$result.size() < 10);
/*     */     }
/*     */   }
/*     */   
/*     */   private final PsiElement getContextForReference(KtReferenceExpression reference) {
/*     */     KtExpression context = (KtExpression)PsiTreeUtil.getParentOfType((PsiElement)reference, KtExpression.class);
/*     */     if (context instanceof KtIfExpression)
/*     */       return (PsiElement)((KtIfExpression)context).getCondition(); 
/*     */     return (PsiElement)context;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "parameterName", "", "invoke"})
/*     */   static final class VariableContextCollector$createContextString$createContextForArguments$1 extends Lambda implements Function1<String, CharSequence> {
/*     */     VariableContextCollector$createContextString$createContextForArguments$1(String $newName) {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CharSequence invoke(@NotNull String parameterName) {
/*     */       Intrinsics.checkNotNullParameter(parameterName, "parameterName");
/*     */       return this.$newName + " = " + this.$newName;
/*     */     }
/*     */   }
/*     */   
/*     */   private final String createContextString(PsiElement context, String originalName, String newName) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: aload_1
/*     */     //   2: aload_3
/*     */     //   3: invokestatic createContextString$createContextForArguments : (Ljava/lang/String;Lcom/intellij/psi/PsiElement;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   6: astore #4
/*     */     //   8: aload_1
/*     */     //   9: ldc_w org/jetbrains/kotlin/psi/KtExpression
/*     */     //   12: invokestatic getParentOfType : (Lcom/intellij/psi/PsiElement;Ljava/lang/Class;)Lcom/intellij/psi/PsiElement;
/*     */     //   15: checkcast org/jetbrains/kotlin/psi/KtExpression
/*     */     //   18: dup
/*     */     //   19: ifnonnull -> 27
/*     */     //   22: pop
/*     */     //   23: aload_1
/*     */     //   24: goto -> 30
/*     */     //   27: checkcast com/intellij/psi/PsiElement
/*     */     //   30: astore #5
/*     */     //   32: aload_2
/*     */     //   33: dup
/*     */     //   34: ifnull -> 58
/*     */     //   37: astore #7
/*     */     //   39: iconst_0
/*     */     //   40: istore #8
/*     */     //   42: getstatic com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.INSTANCE : Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   45: aload #5
/*     */     //   47: aload #7
/*     */     //   49: aload_3
/*     */     //   50: invokespecial replaceReferenceExpressions : (Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/psi/PsiElement;
/*     */     //   53: nop
/*     */     //   54: dup
/*     */     //   55: ifnonnull -> 60
/*     */     //   58: pop
/*     */     //   59: aload_1
/*     */     //   60: astore #6
/*     */     //   62: aload #6
/*     */     //   64: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   69: dup
/*     */     //   70: ifnonnull -> 76
/*     */     //   73: pop
/*     */     //   74: ldc ''
/*     */     //   76: aload #4
/*     */     //   78: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   83: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 0
/*     */     //   #121	-> 8
/*     */     //   #122	-> 32
/*     */     //   #169	-> 39
/*     */     //   #122	-> 42
/*     */     //   #122	-> 53
/*     */     //   #122	-> 54
/*     */     //   #123	-> 62
/*     */     //   #123	-> 76
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   42	11	8	$i$a$-let-VariableContextCollector$createContextString$updatedExpression$1	I
/*     */     //   39	14	7	it	Ljava/lang/String;
/*     */     //   8	76	4	contextForArguments	Ljava/lang/String;
/*     */     //   32	52	5	expression	Lcom/intellij/psi/PsiElement;
/*     */     //   62	22	6	updatedExpression	Lcom/intellij/psi/PsiElement;
/*     */     //   0	84	0	this	Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;
/*     */     //   0	84	1	context	Lcom/intellij/psi/PsiElement;
/*     */     //   0	84	2	originalName	Ljava/lang/String;
/*     */     //   0	84	3	newName	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private final PsiElement replaceReferenceExpressions(PsiElement element, String oldName, String newName) {
/*     */     if (newName == null)
/*     */       return element; 
/*     */     PsiElement copiedElement = element.copy();
/*     */     PsiElementFactory factory = PsiElementFactory.getInstance(element.getProject());
/*     */     Class[] arrayOfClass = new Class[1];
/*     */     arrayOfClass[0] = KtReferenceExpression.class;
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfAnyType(copiedElement, false, arrayOfClass), "findChildrenOfAnyType(co…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfAnyType(copiedElement, false, arrayOfClass);
/*     */     int $i$f$filter = 0;
/*     */     Collection collection2 = collection1;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterTo = 0;
/*     */     for (Object element$iv$iv : collection2) {
/*     */       KtReferenceExpression reference = (KtReferenceExpression)element$iv$iv;
/*     */       int $i$a$-filter-VariableContextCollector$replaceReferenceExpressions$1 = 0;
/*     */       if (Intrinsics.areEqual(reference.getText(), oldName))
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     Iterable $this$filter$iv = destination$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$filter$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       KtReferenceExpression reference = (KtReferenceExpression)element$iv;
/*     */       int $i$a$-forEach-VariableContextCollector$replaceReferenceExpressions$2 = 0;
/*     */       reference.replace((PsiElement)factory.createExpressionFromText(newName, reference.getContext()));
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(copiedElement, "copiedElement");
/*     */     return copiedElement;
/*     */   }
/*     */   
/*     */   private final Object createContextForDeclaration(Project project, KtValVarKeywordOwner variable, String newVariableName, Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 218, 0 -> 96, 1 -> 143, 2 -> 210
/*     */     //   96: aload #6
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_3
/*     */     //   102: ifnull -> 165
/*     */     //   105: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$updatedVariable$1
/*     */     //   108: dup
/*     */     //   109: aload_2
/*     */     //   110: aload_3
/*     */     //   111: invokespecial <init> : (Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;Ljava/lang/String;)V
/*     */     //   114: checkcast kotlin/jvm/functions/Function0
/*     */     //   117: aload #7
/*     */     //   119: aload #7
/*     */     //   121: aload_1
/*     */     //   122: putfield L$0 : Ljava/lang/Object;
/*     */     //   125: aload #7
/*     */     //   127: iconst_1
/*     */     //   128: putfield label : I
/*     */     //   131: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   134: dup
/*     */     //   135: aload #8
/*     */     //   137: if_acmpne -> 159
/*     */     //   140: aload #8
/*     */     //   142: areturn
/*     */     //   143: aload #7
/*     */     //   145: getfield L$0 : Ljava/lang/Object;
/*     */     //   148: checkcast com/intellij/openapi/project/Project
/*     */     //   151: astore_1
/*     */     //   152: aload #6
/*     */     //   154: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   157: aload #6
/*     */     //   159: checkcast com/intellij/psi/PsiElement
/*     */     //   162: goto -> 169
/*     */     //   165: aload_2
/*     */     //   166: checkcast com/intellij/psi/PsiElement
/*     */     //   169: astore #5
/*     */     //   171: aload_1
/*     */     //   172: new com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$2
/*     */     //   175: dup
/*     */     //   176: aload #5
/*     */     //   178: invokespecial <init> : (Lcom/intellij/psi/PsiElement;)V
/*     */     //   181: checkcast kotlin/jvm/functions/Function0
/*     */     //   184: aload #7
/*     */     //   186: aload #7
/*     */     //   188: aconst_null
/*     */     //   189: putfield L$0 : Ljava/lang/Object;
/*     */     //   192: aload #7
/*     */     //   194: iconst_2
/*     */     //   195: putfield label : I
/*     */     //   198: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   201: dup
/*     */     //   202: aload #8
/*     */     //   204: if_acmpne -> 217
/*     */     //   207: aload #8
/*     */     //   209: areturn
/*     */     //   210: aload #6
/*     */     //   212: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   215: aload #6
/*     */     //   217: areturn
/*     */     //   218: new java/lang/IllegalStateException
/*     */     //   221: dup
/*     */     //   222: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   227: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #138	-> 63
/*     */     //   #141	-> 101
/*     */     //   #142	-> 105
/*     */     //   #138	-> 140
/*     */     //   #142	-> 159
/*     */     //   #145	-> 165
/*     */     //   #141	-> 169
/*     */     //   #147	-> 171
/*     */     //   #138	-> 207
/*     */     //   #147	-> 217
/*     */     //   #138	-> 218
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	42	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   152	49	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   101	33	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   165	4	2	variable	Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;
/*     */     //   101	33	3	newVariableName	Ljava/lang/String;
/*     */     //   171	30	5	updatedVariable	Lcom/intellij/psi/PsiElement;
/*     */     //   53	165	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	158	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiNamedElement;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$updatedVariable$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/*     */   static final class VariableContextCollector$createContextForDeclaration$updatedVariable$1 extends Lambda implements Function0<PsiNamedElement> {
/*     */     VariableContextCollector$createContextForDeclaration$updatedVariable$1(KtValVarKeywordOwner $variable, String $newVariableName) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PsiNamedElement invoke() {
/*     */       Intrinsics.checkNotNull(this.$variable.copy(), "null cannot be cast to non-null type com.intellij.psi.PsiNamedElement");
/*     */       PsiNamedElement psiNamedElement1 = (PsiNamedElement)this.$variable.copy();
/*     */       String str = this.$newVariableName;
/*     */       PsiNamedElement it = psiNamedElement1;
/*     */       int $i$a$-also-VariableContextCollector$createContextForDeclaration$updatedVariable$1$1 = 0;
/*     */       it.setName(str);
/*     */       return psiNamedElement1;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\002\020\000\032\024 \003*\t\030\0010\001¢\006\002\b\0020\001¢\006\002\b\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/util/NlsSafe;", "kotlin.jvm.PlatformType", "invoke"})
/*     */   static final class VariableContextCollector$createContextForDeclaration$2 extends Lambda implements Function0<String> {
/*     */     public final String invoke() {
/*     */       return this.$updatedVariable.getText();
/*     */     }
/*     */     
/*     */     VariableContextCollector$createContextForDeclaration$2(PsiElement $updatedVariable) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   private final List<KtValVarKeywordOwner> findUsedVariables(PsiElement scope) {
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType(scope, KtReferenceExpression.class), "findChildrenOfType(scope…ceExpression::class.java)");
/*     */     Collection collection1 = PsiTreeUtil.findChildrenOfType(scope, KtReferenceExpression.class);
/*     */     int $i$f$map = 0;
/*     */     Collection collection2 = collection1;
/*     */     Collection<PsiElement> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : collection2) {
/*     */       KtReferenceExpression ktReferenceExpression = (KtReferenceExpression)item$iv$iv;
/*     */       Collection<PsiElement> collection3 = collection;
/*     */       int $i$a$-map-VariableContextCollector$findUsedVariables$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(ktReferenceExpression, "reference");
/*     */       collection3.add(ReferenceUtilsKt.getMainReference(ktReferenceExpression).resolve());
/*     */     } 
/*     */     Iterable $this$map$iv = collection;
/*     */     int $i$f$filterIsInstance = 0;
/*     */     Iterable $this$mapTo$iv$iv = $this$map$iv;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterIsInstanceTo = 0;
/*     */     for (Object element$iv$iv : $this$mapTo$iv$iv) {
/*     */       if (element$iv$iv instanceof KtValVarKeywordOwner)
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     return (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "VariableContextCollector.kt", l = {142, 147}, i = {0}, s = {"L$0"}, n = {"project"}, m = "createContextForDeclaration", c = "com.intellij.ml.llm.kotlin.refactorings.VariableContextCollector")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class VariableContextCollector$createContextForDeclaration$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     VariableContextCollector$createContextForDeclaration$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return VariableContextCollector.this.createContextForDeclaration(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "VariableContextCollector.kt", l = {17, 19, 31, 34, 35, 38, 40, 42, 44}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"this", "project", "variable", "newVariableName", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "usagesOfPassedVariables", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "usagesOfPassedVariables", "usages", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "usagesOfPassedVariables", "project", "variable", "variablesInsideInitializer", "usagesOfPassedVariables", "usageContext", "project", "variable", "usagesOfPassedVariables", "usageContext", "declarationContext", "destination$iv$iv", "project", "variable", "usagesOfPassedVariables", "usageContext", "declarationContext", "destination$iv$iv"}, m = "createContextPrompt", c = "com.intellij.ml.llm.kotlin.refactorings.VariableContextCollector")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
/*     */   static final class VariableContextCollector$createContextPrompt$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     int label;
/*     */     
/*     */     VariableContextCollector$createContextPrompt$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return VariableContextCollector.this.createContextPrompt(null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */