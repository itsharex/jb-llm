package ai.grazie.nlp.tokenizer.word;

import ai.grazie.nlp.tokenizer.Tokenizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "HeuristicWordTokenizer.kt", l = {19, 33, 45, 50, 57, 71}, i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "I$0", "C$0", "L$0", "L$1", "I$0", "C$0", "L$0", "L$1", "I$0", "C$0", "L$0", "L$1", "I$0", "C$0"}, n = {"$this$sequence", "prevType", "curType", "index", "curChar", "$this$sequence", "curType", "index", "curChar", "$this$sequence", "curType", "index", "curChar", "$this$sequence", "curType", "index", "curChar"}, m = "invokeSuspend", c = "ai.grazie.nlp.tokenizer.word.HeuristicWordTokenizer$tokenizeAsSequence$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;"})
@SourceDebugExtension({"SMAP\nHeuristicWordTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeuristicWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,83:1\n1064#2,2:84\n*S KotlinDebug\n*F\n+ 1 HeuristicWordTokenizer.kt\nai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1\n*L\n18#1:84,2\n*E\n"})
final class HeuristicWordTokenizer$tokenizeAsSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tokenizer.Token>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  char C$0;
  
  int label;
  
  HeuristicWordTokenizer$tokenizeAsSequence$1(HeuristicWordTokenizer $receiver, Continuation $completion) {
    super(2, $completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #10
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 1041, 0 -> 52, 1 -> 238, 2 -> 414, 3 -> 581, 4 -> 740, 5 -> 892, 6 -> 1031
    //   52: aload_1
    //   53: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   56: aload_0
    //   57: getfield L$0 : Ljava/lang/Object;
    //   60: checkcast kotlin/sequences/SequenceScope
    //   63: astore_2
    //   64: aload_0
    //   65: getfield $text : Ljava/lang/CharSequence;
    //   68: invokeinterface length : ()I
    //   73: ifne -> 80
    //   76: iconst_1
    //   77: goto -> 81
    //   80: iconst_0
    //   81: ifeq -> 88
    //   84: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   87: areturn
    //   88: aload_0
    //   89: getfield $text : Ljava/lang/CharSequence;
    //   92: astore_3
    //   93: aload_0
    //   94: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   97: astore #4
    //   99: iconst_0
    //   100: istore #5
    //   102: iconst_0
    //   103: istore #6
    //   105: iload #6
    //   107: aload_3
    //   108: invokeinterface length : ()I
    //   113: if_icmpge -> 179
    //   116: aload_3
    //   117: iload #6
    //   119: invokeinterface charAt : (I)C
    //   124: istore #7
    //   126: iload #7
    //   128: i2c
    //   129: istore #8
    //   131: iconst_0
    //   132: istore #9
    //   134: iload #8
    //   136: i2c
    //   137: invokestatic isLowerCase : (C)Z
    //   140: ifne -> 151
    //   143: aload #4
    //   145: invokestatic access$getTokenizeByCamelCase$p : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;)Z
    //   148: ifne -> 164
    //   151: iload #8
    //   153: i2c
    //   154: invokestatic isLetter : (C)Z
    //   157: ifeq -> 164
    //   160: iconst_1
    //   161: goto -> 165
    //   164: iconst_0
    //   165: nop
    //   166: ifne -> 173
    //   169: iconst_0
    //   170: goto -> 180
    //   173: iinc #6, 1
    //   176: goto -> 105
    //   179: iconst_1
    //   180: ifeq -> 248
    //   183: aload_2
    //   184: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   187: dup
    //   188: aload_0
    //   189: getfield $text : Ljava/lang/CharSequence;
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: new kotlin/ranges/IntRange
    //   198: dup
    //   199: iconst_0
    //   200: aload_0
    //   201: getfield $text : Ljava/lang/CharSequence;
    //   204: invokeinterface length : ()I
    //   209: iconst_1
    //   210: isub
    //   211: invokespecial <init> : (II)V
    //   214: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   217: aload_0
    //   218: checkcast kotlin/coroutines/Continuation
    //   221: aload_0
    //   222: iconst_1
    //   223: putfield label : I
    //   226: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   229: dup
    //   230: aload #10
    //   232: if_acmpne -> 243
    //   235: aload #10
    //   237: areturn
    //   238: aload_1
    //   239: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   242: aload_1
    //   243: pop
    //   244: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   247: areturn
    //   248: iconst_0
    //   249: istore_3
    //   250: iconst_m1
    //   251: istore #4
    //   253: getstatic kotlin/text/CharCategory.MATH_SYMBOL : Lkotlin/text/CharCategory;
    //   256: astore #5
    //   258: bipush #95
    //   260: istore #6
    //   262: iload_3
    //   263: aload_0
    //   264: getfield $text : Ljava/lang/CharSequence;
    //   267: invokeinterface length : ()I
    //   272: if_icmpge -> 954
    //   275: aload_0
    //   276: getfield $text : Ljava/lang/CharSequence;
    //   279: iload_3
    //   280: invokeinterface charAt : (I)C
    //   285: istore #7
    //   287: iload #7
    //   289: i2c
    //   290: invokestatic getCategory : (C)Lkotlin/text/CharCategory;
    //   293: astore #8
    //   295: aload_0
    //   296: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   299: aload #8
    //   301: iload #7
    //   303: i2c
    //   304: invokestatic access$isNonSplittingPart : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;Lkotlin/text/CharCategory;C)Z
    //   307: ifeq -> 782
    //   310: aload_0
    //   311: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   314: aload #5
    //   316: iload #6
    //   318: i2c
    //   319: invokestatic access$isNonSplittingPart : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;Lkotlin/text/CharCategory;C)Z
    //   322: ifne -> 460
    //   325: iload #4
    //   327: iflt -> 460
    //   330: aload_2
    //   331: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   334: dup
    //   335: aload_0
    //   336: getfield $text : Ljava/lang/CharSequence;
    //   339: iload #4
    //   341: iload_3
    //   342: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   347: invokevirtual toString : ()Ljava/lang/String;
    //   350: new kotlin/ranges/IntRange
    //   353: dup
    //   354: iload #4
    //   356: iload_3
    //   357: iconst_1
    //   358: isub
    //   359: invokespecial <init> : (II)V
    //   362: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   365: aload_0
    //   366: checkcast kotlin/coroutines/Continuation
    //   369: aload_0
    //   370: aload_2
    //   371: putfield L$0 : Ljava/lang/Object;
    //   374: aload_0
    //   375: aload #5
    //   377: putfield L$1 : Ljava/lang/Object;
    //   380: aload_0
    //   381: aload #8
    //   383: putfield L$2 : Ljava/lang/Object;
    //   386: aload_0
    //   387: iload_3
    //   388: putfield I$0 : I
    //   391: aload_0
    //   392: iload #7
    //   394: putfield C$0 : C
    //   397: aload_0
    //   398: iconst_2
    //   399: putfield label : I
    //   402: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   405: dup
    //   406: aload #10
    //   408: if_acmpne -> 456
    //   411: aload #10
    //   413: areturn
    //   414: aload_0
    //   415: getfield C$0 : C
    //   418: istore #7
    //   420: aload_0
    //   421: getfield I$0 : I
    //   424: istore_3
    //   425: aload_0
    //   426: getfield L$2 : Ljava/lang/Object;
    //   429: checkcast kotlin/text/CharCategory
    //   432: astore #8
    //   434: aload_0
    //   435: getfield L$1 : Ljava/lang/Object;
    //   438: checkcast kotlin/text/CharCategory
    //   441: astore #5
    //   443: aload_0
    //   444: getfield L$0 : Ljava/lang/Object;
    //   447: checkcast kotlin/sequences/SequenceScope
    //   450: astore_2
    //   451: aload_1
    //   452: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   455: aload_1
    //   456: pop
    //   457: iconst_m1
    //   458: istore #4
    //   460: nop
    //   461: iload #4
    //   463: ifge -> 472
    //   466: iload_3
    //   467: istore #4
    //   469: goto -> 940
    //   472: aload_0
    //   473: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   476: invokestatic access$getTokenizeByCamelCase$p : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;)Z
    //   479: ifeq -> 621
    //   482: aload #8
    //   484: getstatic kotlin/text/CharCategory.UPPERCASE_LETTER : Lkotlin/text/CharCategory;
    //   487: if_acmpne -> 621
    //   490: aload #5
    //   492: getstatic kotlin/text/CharCategory.LOWERCASE_LETTER : Lkotlin/text/CharCategory;
    //   495: if_acmpne -> 621
    //   498: aload_2
    //   499: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   502: dup
    //   503: aload_0
    //   504: getfield $text : Ljava/lang/CharSequence;
    //   507: iload #4
    //   509: iload_3
    //   510: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   515: invokevirtual toString : ()Ljava/lang/String;
    //   518: new kotlin/ranges/IntRange
    //   521: dup
    //   522: iload #4
    //   524: iload_3
    //   525: iconst_1
    //   526: isub
    //   527: invokespecial <init> : (II)V
    //   530: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   533: aload_0
    //   534: checkcast kotlin/coroutines/Continuation
    //   537: aload_0
    //   538: aload_2
    //   539: putfield L$0 : Ljava/lang/Object;
    //   542: aload_0
    //   543: aload #8
    //   545: putfield L$1 : Ljava/lang/Object;
    //   548: aload_0
    //   549: aconst_null
    //   550: putfield L$2 : Ljava/lang/Object;
    //   553: aload_0
    //   554: iload_3
    //   555: putfield I$0 : I
    //   558: aload_0
    //   559: iload #7
    //   561: putfield C$0 : C
    //   564: aload_0
    //   565: iconst_3
    //   566: putfield label : I
    //   569: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   572: dup
    //   573: aload #10
    //   575: if_acmpne -> 614
    //   578: aload #10
    //   580: areturn
    //   581: aload_0
    //   582: getfield C$0 : C
    //   585: istore #7
    //   587: aload_0
    //   588: getfield I$0 : I
    //   591: istore_3
    //   592: aload_0
    //   593: getfield L$1 : Ljava/lang/Object;
    //   596: checkcast kotlin/text/CharCategory
    //   599: astore #8
    //   601: aload_0
    //   602: getfield L$0 : Ljava/lang/Object;
    //   605: checkcast kotlin/sequences/SequenceScope
    //   608: astore_2
    //   609: aload_1
    //   610: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   613: aload_1
    //   614: pop
    //   615: iload_3
    //   616: istore #4
    //   618: goto -> 940
    //   621: aload_0
    //   622: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   625: invokestatic access$getTokenizeByCamelCase$p : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;)Z
    //   628: ifeq -> 940
    //   631: iload_3
    //   632: iload #4
    //   634: isub
    //   635: iconst_1
    //   636: if_icmple -> 940
    //   639: aload #8
    //   641: getstatic kotlin/text/CharCategory.LOWERCASE_LETTER : Lkotlin/text/CharCategory;
    //   644: if_acmpne -> 940
    //   647: aload #5
    //   649: getstatic kotlin/text/CharCategory.UPPERCASE_LETTER : Lkotlin/text/CharCategory;
    //   652: if_acmpne -> 940
    //   655: aload_2
    //   656: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   659: dup
    //   660: aload_0
    //   661: getfield $text : Ljava/lang/CharSequence;
    //   664: iload #4
    //   666: iload_3
    //   667: iconst_1
    //   668: isub
    //   669: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   674: invokevirtual toString : ()Ljava/lang/String;
    //   677: new kotlin/ranges/IntRange
    //   680: dup
    //   681: iload #4
    //   683: iload_3
    //   684: iconst_2
    //   685: isub
    //   686: invokespecial <init> : (II)V
    //   689: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   692: aload_0
    //   693: checkcast kotlin/coroutines/Continuation
    //   696: aload_0
    //   697: aload_2
    //   698: putfield L$0 : Ljava/lang/Object;
    //   701: aload_0
    //   702: aload #8
    //   704: putfield L$1 : Ljava/lang/Object;
    //   707: aload_0
    //   708: aconst_null
    //   709: putfield L$2 : Ljava/lang/Object;
    //   712: aload_0
    //   713: iload_3
    //   714: putfield I$0 : I
    //   717: aload_0
    //   718: iload #7
    //   720: putfield C$0 : C
    //   723: aload_0
    //   724: iconst_4
    //   725: putfield label : I
    //   728: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   731: dup
    //   732: aload #10
    //   734: if_acmpne -> 773
    //   737: aload #10
    //   739: areturn
    //   740: aload_0
    //   741: getfield C$0 : C
    //   744: istore #7
    //   746: aload_0
    //   747: getfield I$0 : I
    //   750: istore_3
    //   751: aload_0
    //   752: getfield L$1 : Ljava/lang/Object;
    //   755: checkcast kotlin/text/CharCategory
    //   758: astore #8
    //   760: aload_0
    //   761: getfield L$0 : Ljava/lang/Object;
    //   764: checkcast kotlin/sequences/SequenceScope
    //   767: astore_2
    //   768: aload_1
    //   769: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   772: aload_1
    //   773: pop
    //   774: iload_3
    //   775: iconst_1
    //   776: isub
    //   777: istore #4
    //   779: goto -> 940
    //   782: iload #4
    //   784: iflt -> 932
    //   787: aload_0
    //   788: getfield this$0 : Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;
    //   791: aload #5
    //   793: iload #6
    //   795: i2c
    //   796: invokestatic access$isNonSplittingPart : (Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer;Lkotlin/text/CharCategory;C)Z
    //   799: ifne -> 809
    //   802: aload #5
    //   804: aload #8
    //   806: if_acmpeq -> 932
    //   809: aload_2
    //   810: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   813: dup
    //   814: aload_0
    //   815: getfield $text : Ljava/lang/CharSequence;
    //   818: iload #4
    //   820: iload_3
    //   821: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   826: invokevirtual toString : ()Ljava/lang/String;
    //   829: new kotlin/ranges/IntRange
    //   832: dup
    //   833: iload #4
    //   835: iload_3
    //   836: iconst_1
    //   837: isub
    //   838: invokespecial <init> : (II)V
    //   841: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   844: aload_0
    //   845: checkcast kotlin/coroutines/Continuation
    //   848: aload_0
    //   849: aload_2
    //   850: putfield L$0 : Ljava/lang/Object;
    //   853: aload_0
    //   854: aload #8
    //   856: putfield L$1 : Ljava/lang/Object;
    //   859: aload_0
    //   860: aconst_null
    //   861: putfield L$2 : Ljava/lang/Object;
    //   864: aload_0
    //   865: iload_3
    //   866: putfield I$0 : I
    //   869: aload_0
    //   870: iload #7
    //   872: putfield C$0 : C
    //   875: aload_0
    //   876: iconst_5
    //   877: putfield label : I
    //   880: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   883: dup
    //   884: aload #10
    //   886: if_acmpne -> 925
    //   889: aload #10
    //   891: areturn
    //   892: aload_0
    //   893: getfield C$0 : C
    //   896: istore #7
    //   898: aload_0
    //   899: getfield I$0 : I
    //   902: istore_3
    //   903: aload_0
    //   904: getfield L$1 : Ljava/lang/Object;
    //   907: checkcast kotlin/text/CharCategory
    //   910: astore #8
    //   912: aload_0
    //   913: getfield L$0 : Ljava/lang/Object;
    //   916: checkcast kotlin/sequences/SequenceScope
    //   919: astore_2
    //   920: aload_1
    //   921: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   924: aload_1
    //   925: pop
    //   926: iload_3
    //   927: istore #4
    //   929: goto -> 940
    //   932: iload #4
    //   934: ifge -> 940
    //   937: iload_3
    //   938: istore #4
    //   940: aload #8
    //   942: astore #5
    //   944: iload #7
    //   946: istore #6
    //   948: iinc #3, 1
    //   951: goto -> 262
    //   954: iload #4
    //   956: iflt -> 1037
    //   959: aload_2
    //   960: new ai/grazie/nlp/tokenizer/Tokenizer$Token
    //   963: dup
    //   964: aload_0
    //   965: getfield $text : Ljava/lang/CharSequence;
    //   968: iload #4
    //   970: iload_3
    //   971: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   976: invokevirtual toString : ()Ljava/lang/String;
    //   979: new kotlin/ranges/IntRange
    //   982: dup
    //   983: iload #4
    //   985: iload_3
    //   986: iconst_1
    //   987: isub
    //   988: invokespecial <init> : (II)V
    //   991: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
    //   994: aload_0
    //   995: checkcast kotlin/coroutines/Continuation
    //   998: aload_0
    //   999: aconst_null
    //   1000: putfield L$0 : Ljava/lang/Object;
    //   1003: aload_0
    //   1004: aconst_null
    //   1005: putfield L$1 : Ljava/lang/Object;
    //   1008: aload_0
    //   1009: aconst_null
    //   1010: putfield L$2 : Ljava/lang/Object;
    //   1013: aload_0
    //   1014: bipush #6
    //   1016: putfield label : I
    //   1019: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   1022: dup
    //   1023: aload #10
    //   1025: if_acmpne -> 1036
    //   1028: aload #10
    //   1030: areturn
    //   1031: aload_1
    //   1032: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   1035: aload_1
    //   1036: pop
    //   1037: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   1040: areturn
    //   1041: new java/lang/IllegalStateException
    //   1044: dup
    //   1045: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   1047: invokespecial <init> : (Ljava/lang/String;)V
    //   1050: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 3
    //   #16	-> 64
    //   #16	-> 81
    //   #18	-> 88
    //   #84	-> 102
    //   #18	-> 134
    //   #18	-> 143
    //   #18	-> 165
    //   #84	-> 166
    //   #85	-> 179
    //   #18	-> 180
    //   #19	-> 183
    //   #15	-> 235
    //   #20	-> 243
    //   #23	-> 248
    //   #24	-> 250
    //   #25	-> 253
    //   #26	-> 258
    //   #27	-> 262
    //   #28	-> 275
    //   #29	-> 287
    //   #31	-> 295
    //   #32	-> 310
    //   #33	-> 330
    //   #33	-> 350
    //   #15	-> 411
    //   #34	-> 456
    //   #38	-> 460
    //   #39	-> 461
    //   #41	-> 466
    //   #43	-> 472
    //   #45	-> 498
    //   #45	-> 518
    //   #15	-> 578
    //   #46	-> 614
    //   #48	-> 621
    //   #50	-> 655
    //   #50	-> 677
    //   #15	-> 737
    //   #51	-> 773
    //   #55	-> 782
    //   #57	-> 809
    //   #57	-> 829
    //   #15	-> 889
    //   #58	-> 925
    //   #59	-> 932
    //   #60	-> 937
    //   #65	-> 940
    //   #66	-> 944
    //   #67	-> 948
    //   #70	-> 954
    //   #71	-> 959
    //   #71	-> 979
    //   #15	-> 1028
    //   #73	-> 1036
    //   #15	-> 1041
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   64	17	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   81	7	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   88	78	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   166	7	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   173	7	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   180	49	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   248	166	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   451	130	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   609	131	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   768	124	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   920	44	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   99	81	3	$this$all$iv	Ljava/lang/CharSequence;
    //   250	164	3	index	I
    //   425	156	3	index	I
    //   592	148	3	index	I
    //   751	141	3	index	I
    //   903	76	3	index	I
    //   979	43	3	index	I
    //   253	97	4	start	I
    //   350	55	4	start	I
    //   460	6	4	start	I
    //   472	46	4	start	I
    //   518	54	4	start	I
    //   621	56	4	start	I
    //   677	54	4	start	I
    //   779	50	4	start	I
    //   829	54	4	start	I
    //   932	5	4	start	I
    //   940	39	4	start	I
    //   979	43	4	start	I
    //   258	156	5	prevType	Lkotlin/text/CharCategory;
    //   443	23	5	prevType	Lkotlin/text/CharCategory;
    //   472	26	5	prevType	Lkotlin/text/CharCategory;
    //   621	34	5	prevType	Lkotlin/text/CharCategory;
    //   782	27	5	prevType	Lkotlin/text/CharCategory;
    //   944	10	5	prevType	Lkotlin/text/CharCategory;
    //   262	68	6	prevChar	C
    //   782	27	6	prevChar	C
    //   948	6	6	prevChar	C
    //   126	5	7	element$iv	C
    //   287	127	7	curChar	C
    //   420	161	7	curChar	C
    //   587	153	7	curChar	C
    //   746	146	7	curChar	C
    //   898	53	7	curChar	C
    //   131	26	8	it	C
    //   295	119	8	curType	Lkotlin/text/CharCategory;
    //   434	147	8	curType	Lkotlin/text/CharCategory;
    //   601	139	8	curType	Lkotlin/text/CharCategory;
    //   760	132	8	curType	Lkotlin/text/CharCategory;
    //   912	39	8	curType	Lkotlin/text/CharCategory;
    //   134	32	9	$i$a$-all-HeuristicWordTokenizer$tokenizeAsSequence$1$1	I
    //   102	78	5	$i$f$all	I
    //   56	985	0	this	Lai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1;
    //   56	985	1	$result	Ljava/lang/Object;
  }
  
  @NotNull
  public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super HeuristicWordTokenizer$tokenizeAsSequence$1> $completion) {
    HeuristicWordTokenizer$tokenizeAsSequence$1 heuristicWordTokenizer$tokenizeAsSequence$1 = new HeuristicWordTokenizer$tokenizeAsSequence$1(HeuristicWordTokenizer.this, $completion);
    heuristicWordTokenizer$tokenizeAsSequence$1.L$0 = value;
    return (Continuation<Unit>)heuristicWordTokenizer$tokenizeAsSequence$1;
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
    return ((HeuristicWordTokenizer$tokenizeAsSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/word/HeuristicWordTokenizer$tokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */