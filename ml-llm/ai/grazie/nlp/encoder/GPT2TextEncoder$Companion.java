package ai.grazie.nlp.encoder;

import ai.grazie.utils.mpp.DataLoader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH@ø\001\000¢\006\002\020\n\002\004\n\002\b\031¨\006\013"}, d2 = {"Lai/grazie/nlp/encoder/GPT2TextEncoder$Companion;", "", "()V", "loadPretrained", "Lai/grazie/nlp/encoder/GPT2TextEncoder;", "loader", "Lai/grazie/utils/mpp/DataLoader;", "vocabularyFile", "", "mergesFile", "(Lai/grazie/utils/mpp/DataLoader;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nlp-encoder-engine"})
@SourceDebugExtension({"SMAP\nGPT2TextEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GPT2TextEncoder.kt\nai/grazie/nlp/encoder/GPT2TextEncoder$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n766#2:82\n857#2,2:83\n1179#2,2:85\n1253#2,4:87\n766#2:91\n857#2,2:92\n1549#2:94\n1620#2,3:95\n*S KotlinDebug\n*F\n+ 1 GPT2TextEncoder.kt\nai/grazie/nlp/encoder/GPT2TextEncoder$Companion\n*L\n29#1:82\n29#1:83,2\n31#1:85,2\n31#1:87,4\n33#1:91\n33#1:92,2\n34#1:94\n34#1:95,3\n*E\n"})
public final class Companion {
  private Companion() {}
  
  @Nullable
  public final Object loadPretrained(@NotNull DataLoader loader, @NotNull String vocabularyFile, @NotNull String mergesFile, @NotNull Continuation<? super GPT2TextEncoder> paramContinuation) {
    // Byte code:
    //   0: aload #4
    //   2: instanceof ai/grazie/nlp/encoder/GPT2TextEncoder$Companion$loadPretrained$1
    //   5: ifeq -> 41
    //   8: aload #4
    //   10: checkcast ai/grazie/nlp/encoder/GPT2TextEncoder$Companion$loadPretrained$1
    //   13: astore #21
    //   15: aload #21
    //   17: getfield label : I
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #21
    //   28: dup
    //   29: getfield label : I
    //   32: ldc -2147483648
    //   34: isub
    //   35: putfield label : I
    //   38: goto -> 53
    //   41: new ai/grazie/nlp/encoder/GPT2TextEncoder$Companion$loadPretrained$1
    //   44: dup
    //   45: aload_0
    //   46: aload #4
    //   48: invokespecial <init> : (Lai/grazie/nlp/encoder/GPT2TextEncoder$Companion;Lkotlin/coroutines/Continuation;)V
    //   51: astore #21
    //   53: aload #21
    //   55: getfield result : Ljava/lang/Object;
    //   58: astore #20
    //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   63: astore #22
    //   65: aload #21
    //   67: getfield label : I
    //   70: tableswitch default -> 725, 0 -> 96, 1 -> 137, 2 -> 455
    //   96: aload #20
    //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   101: aload_1
    //   102: aload_2
    //   103: aload #21
    //   105: aload #21
    //   107: aload_1
    //   108: putfield L$0 : Ljava/lang/Object;
    //   111: aload #21
    //   113: aload_3
    //   114: putfield L$1 : Ljava/lang/Object;
    //   117: aload #21
    //   119: iconst_1
    //   120: putfield label : I
    //   123: invokeinterface text : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   128: dup
    //   129: aload #22
    //   131: if_acmpne -> 162
    //   134: aload #22
    //   136: areturn
    //   137: aload #21
    //   139: getfield L$1 : Ljava/lang/Object;
    //   142: checkcast java/lang/String
    //   145: astore_3
    //   146: aload #21
    //   148: getfield L$0 : Ljava/lang/Object;
    //   151: checkcast ai/grazie/utils/mpp/DataLoader
    //   154: astore_1
    //   155: aload #20
    //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   160: aload #20
    //   162: checkcast java/lang/CharSequence
    //   165: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
    //   168: checkcast java/lang/Iterable
    //   171: astore #6
    //   173: iconst_0
    //   174: istore #7
    //   176: aload #6
    //   178: astore #8
    //   180: new java/util/ArrayList
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: checkcast java/util/Collection
    //   190: astore #9
    //   192: iconst_0
    //   193: istore #10
    //   195: aload #8
    //   197: invokeinterface iterator : ()Ljava/util/Iterator;
    //   202: astore #11
    //   204: aload #11
    //   206: invokeinterface hasNext : ()Z
    //   211: ifeq -> 266
    //   214: aload #11
    //   216: invokeinterface next : ()Ljava/lang/Object;
    //   221: astore #12
    //   223: aload #12
    //   225: checkcast java/lang/String
    //   228: astore #13
    //   230: iconst_0
    //   231: istore #14
    //   233: aload #13
    //   235: checkcast java/lang/CharSequence
    //   238: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   241: ifne -> 248
    //   244: iconst_1
    //   245: goto -> 249
    //   248: iconst_0
    //   249: nop
    //   250: ifeq -> 204
    //   253: aload #9
    //   255: aload #12
    //   257: invokeinterface add : (Ljava/lang/Object;)Z
    //   262: pop
    //   263: goto -> 204
    //   266: aload #9
    //   268: checkcast java/util/List
    //   271: nop
    //   272: checkcast java/lang/Iterable
    //   275: invokestatic withIndex : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
    //   278: astore #6
    //   280: iconst_0
    //   281: istore #7
    //   283: aload #6
    //   285: bipush #10
    //   287: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   290: invokestatic mapCapacity : (I)I
    //   293: bipush #16
    //   295: invokestatic coerceAtLeast : (II)I
    //   298: istore #8
    //   300: aload #6
    //   302: astore #9
    //   304: new java/util/LinkedHashMap
    //   307: dup
    //   308: iload #8
    //   310: invokespecial <init> : (I)V
    //   313: checkcast java/util/Map
    //   316: astore #10
    //   318: iconst_0
    //   319: istore #11
    //   321: aload #9
    //   323: invokeinterface iterator : ()Ljava/util/Iterator;
    //   328: astore #12
    //   330: aload #12
    //   332: invokeinterface hasNext : ()Z
    //   337: ifeq -> 413
    //   340: aload #12
    //   342: invokeinterface next : ()Ljava/lang/Object;
    //   347: astore #13
    //   349: aload #10
    //   351: astore #14
    //   353: aload #13
    //   355: checkcast kotlin/collections/IndexedValue
    //   358: astore #15
    //   360: iconst_0
    //   361: istore #16
    //   363: aload #15
    //   365: invokevirtual component1 : ()I
    //   368: istore #17
    //   370: aload #15
    //   372: invokevirtual component2 : ()Ljava/lang/Object;
    //   375: checkcast java/lang/String
    //   378: astore #18
    //   380: aload #18
    //   382: iload #17
    //   384: invokestatic boxInt : (I)Ljava/lang/Integer;
    //   387: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   390: astore #15
    //   392: aload #14
    //   394: aload #15
    //   396: invokevirtual getFirst : ()Ljava/lang/Object;
    //   399: aload #15
    //   401: invokevirtual getSecond : ()Ljava/lang/Object;
    //   404: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   409: pop
    //   410: goto -> 330
    //   413: aload #10
    //   415: nop
    //   416: astore #5
    //   418: aload_1
    //   419: aload_3
    //   420: aload #21
    //   422: aload #21
    //   424: aload #5
    //   426: putfield L$0 : Ljava/lang/Object;
    //   429: aload #21
    //   431: aconst_null
    //   432: putfield L$1 : Ljava/lang/Object;
    //   435: aload #21
    //   437: iconst_2
    //   438: putfield label : I
    //   441: invokeinterface text : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   446: dup
    //   447: aload #22
    //   449: if_acmpne -> 472
    //   452: aload #22
    //   454: areturn
    //   455: aload #21
    //   457: getfield L$0 : Ljava/lang/Object;
    //   460: checkcast java/util/Map
    //   463: astore #5
    //   465: aload #20
    //   467: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   470: aload #20
    //   472: checkcast java/lang/CharSequence
    //   475: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
    //   478: checkcast java/lang/Iterable
    //   481: astore #7
    //   483: iconst_0
    //   484: istore #8
    //   486: aload #7
    //   488: astore #9
    //   490: new java/util/ArrayList
    //   493: dup
    //   494: invokespecial <init> : ()V
    //   497: checkcast java/util/Collection
    //   500: astore #10
    //   502: iconst_0
    //   503: istore #11
    //   505: aload #9
    //   507: invokeinterface iterator : ()Ljava/util/Iterator;
    //   512: astore #12
    //   514: aload #12
    //   516: invokeinterface hasNext : ()Z
    //   521: ifeq -> 576
    //   524: aload #12
    //   526: invokeinterface next : ()Ljava/lang/Object;
    //   531: astore #13
    //   533: aload #13
    //   535: checkcast java/lang/String
    //   538: astore #14
    //   540: iconst_0
    //   541: istore #15
    //   543: aload #14
    //   545: checkcast java/lang/CharSequence
    //   548: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   551: ifne -> 558
    //   554: iconst_1
    //   555: goto -> 559
    //   558: iconst_0
    //   559: nop
    //   560: ifeq -> 514
    //   563: aload #10
    //   565: aload #13
    //   567: invokeinterface add : (Ljava/lang/Object;)Z
    //   572: pop
    //   573: goto -> 514
    //   576: aload #10
    //   578: checkcast java/util/List
    //   581: nop
    //   582: checkcast java/lang/Iterable
    //   585: astore #7
    //   587: iconst_0
    //   588: istore #8
    //   590: aload #7
    //   592: astore #9
    //   594: new java/util/ArrayList
    //   597: dup
    //   598: aload #7
    //   600: bipush #10
    //   602: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   605: invokespecial <init> : (I)V
    //   608: checkcast java/util/Collection
    //   611: astore #10
    //   613: iconst_0
    //   614: istore #11
    //   616: aload #9
    //   618: invokeinterface iterator : ()Ljava/util/Iterator;
    //   623: astore #12
    //   625: aload #12
    //   627: invokeinterface hasNext : ()Z
    //   632: ifeq -> 695
    //   635: aload #12
    //   637: invokeinterface next : ()Ljava/lang/Object;
    //   642: astore #13
    //   644: aload #10
    //   646: aload #13
    //   648: checkcast java/lang/String
    //   651: astore #14
    //   653: astore #19
    //   655: iconst_0
    //   656: istore #15
    //   658: aload #14
    //   660: checkcast java/lang/CharSequence
    //   663: invokestatic first : (Ljava/lang/CharSequence;)C
    //   666: invokestatic valueOf : (C)Ljava/lang/String;
    //   669: aload #14
    //   671: checkcast java/lang/CharSequence
    //   674: invokestatic last : (Ljava/lang/CharSequence;)C
    //   677: invokestatic valueOf : (C)Ljava/lang/String;
    //   680: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    //   683: aload #19
    //   685: swap
    //   686: invokeinterface add : (Ljava/lang/Object;)Z
    //   691: pop
    //   692: goto -> 625
    //   695: aload #10
    //   697: checkcast java/util/List
    //   700: nop
    //   701: astore #6
    //   703: new ai/grazie/nlp/encoder/GPT2TextEncoder
    //   706: dup
    //   707: aload #5
    //   709: aload #6
    //   711: aconst_null
    //   712: aconst_null
    //   713: aconst_null
    //   714: aconst_null
    //   715: iconst_0
    //   716: iconst_0
    //   717: sipush #252
    //   720: aconst_null
    //   721: invokespecial <init> : (Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    //   724: areturn
    //   725: new java/lang/IllegalStateException
    //   728: dup
    //   729: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   731: invokespecial <init> : (Ljava/lang/String;)V
    //   734: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #27	-> 63
    //   #28	-> 101
    //   #27	-> 134
    //   #28	-> 162
    //   #29	-> 173
    //   #82	-> 176
    //   #83	-> 195
    //   #29	-> 233
    //   #29	-> 249
    //   #83	-> 250
    //   #84	-> 266
    //   #82	-> 271
    //   #30	-> 275
    //   #31	-> 280
    //   #85	-> 283
    //   #86	-> 300
    //   #87	-> 321
    //   #88	-> 349
    //   #31	-> 363
    //   #88	-> 390
    //   #90	-> 413
    //   #86	-> 415
    //   #31	-> 416
    //   #28	-> 416
    //   #32	-> 418
    //   #27	-> 452
    //   #32	-> 472
    //   #33	-> 483
    //   #91	-> 486
    //   #92	-> 505
    //   #33	-> 543
    //   #33	-> 559
    //   #92	-> 560
    //   #93	-> 576
    //   #91	-> 581
    //   #34	-> 587
    //   #94	-> 590
    //   #95	-> 616
    //   #96	-> 644
    //   #34	-> 658
    //   #96	-> 686
    //   #97	-> 695
    //   #94	-> 700
    //   #34	-> 701
    //   #32	-> 701
    //   #35	-> 703
    //   #27	-> 725
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   101	36	1	loader	Lai/grazie/utils/mpp/DataLoader;
    //   155	95	1	loader	Lai/grazie/utils/mpp/DataLoader;
    //   250	22	1	loader	Lai/grazie/utils/mpp/DataLoader;
    //   272	118	1	loader	Lai/grazie/utils/mpp/DataLoader;
    //   390	26	1	loader	Lai/grazie/utils/mpp/DataLoader;
    //   416	30	1	loader	Lai/grazie/utils/mpp/DataLoader;
    //   101	27	2	vocabularyFile	Ljava/lang/String;
    //   101	36	3	mergesFile	Ljava/lang/String;
    //   146	104	3	mergesFile	Ljava/lang/String;
    //   250	22	3	mergesFile	Ljava/lang/String;
    //   272	118	3	mergesFile	Ljava/lang/String;
    //   390	26	3	mergesFile	Ljava/lang/String;
    //   416	30	3	mergesFile	Ljava/lang/String;
    //   418	37	5	vocabulary	Ljava/util/Map;
    //   465	95	5	vocabulary	Ljava/util/Map;
    //   560	22	5	vocabulary	Ljava/util/Map;
    //   582	143	5	vocabulary	Ljava/util/Map;
    //   173	19	6	$this$filter$iv	Ljava/lang/Iterable;
    //   280	38	6	$this$associate$iv	Ljava/lang/Iterable;
    //   703	22	6	merges	Ljava/util/List;
    //   483	19	7	$this$filter$iv	Ljava/lang/Iterable;
    //   587	26	7	$this$map$iv	Ljava/lang/Iterable;
    //   192	12	8	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   300	18	8	capacity$iv	I
    //   192	76	9	destination$iv$iv	Ljava/util/Collection;
    //   318	12	9	$this$associateTo$iv$iv	Ljava/lang/Iterable;
    //   502	12	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   613	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   318	97	10	destination$iv$iv	Ljava/util/Map;
    //   502	76	10	destination$iv$iv	Ljava/util/Collection;
    //   613	84	10	destination$iv$iv	Ljava/util/Collection;
    //   223	40	12	element$iv$iv	Ljava/lang/Object;
    //   230	18	13	it	Ljava/lang/String;
    //   349	61	13	element$iv$iv	Ljava/lang/Object;
    //   533	40	13	element$iv$iv	Ljava/lang/Object;
    //   644	48	13	item$iv$iv	Ljava/lang/Object;
    //   540	18	14	it	Ljava/lang/String;
    //   655	28	14	line	Ljava/lang/String;
    //   370	20	17	value	I
    //   380	10	18	key	Ljava/lang/String;
    //   233	17	14	$i$a$-filter-GPT2TextEncoder$Companion$loadPretrained$vocabulary$1	I
    //   195	73	10	$i$f$filterTo	I
    //   176	96	7	$i$f$filter	I
    //   363	27	16	$i$a$-associate-GPT2TextEncoder$Companion$loadPretrained$vocabulary$2	I
    //   321	94	11	$i$f$associateTo	I
    //   283	133	7	$i$f$associate	I
    //   543	17	15	$i$a$-filter-GPT2TextEncoder$Companion$loadPretrained$merges$1	I
    //   505	73	11	$i$f$filterTo	I
    //   486	96	8	$i$f$filter	I
    //   658	25	15	$i$a$-map-GPT2TextEncoder$Companion$loadPretrained$merges$2	I
    //   616	81	11	$i$f$mapTo	I
    //   590	111	8	$i$f$map	I
    //   53	672	21	$continuation	Lkotlin/coroutines/Continuation;
    //   60	665	20	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "GPT2TextEncoder.kt", l = {28, 32}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"loader", "mergesFile", "vocabulary"}, m = "loadPretrained", c = "ai.grazie.nlp.encoder.GPT2TextEncoder$Companion")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class GPT2TextEncoder$Companion$loadPretrained$1 extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    int label;
    
    GPT2TextEncoder$Companion$loadPretrained$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return GPT2TextEncoder.Companion.this.loadPretrained(null, null, null, (Continuation<? super GPT2TextEncoder>)this);
    }
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/GPT2TextEncoder$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */