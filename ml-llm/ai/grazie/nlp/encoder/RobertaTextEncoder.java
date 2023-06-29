/*    */ package ai.grazie.nlp.encoder;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\030\000 #2\0020\001:\001#B\001\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\030\020\006\032\024\022\020\022\016\022\004\022\0020\004\022\004\022\0020\0040\b0\007\022\b\b\002\020\t\032\0020\004\022\b\b\002\020\n\032\0020\004\022\b\b\002\020\013\032\0020\004\022\b\b\002\020\f\032\0020\004\022\b\b\002\020\r\032\0020\004\022\b\b\002\020\016\032\0020\004\022\b\b\002\020\017\032\0020\004\022\b\b\002\020\020\032\0020\021¢\006\002\020\022J\020\020\033\032\0020\0042\006\020\034\032\0020\005H\024J\020\020\035\032\0020\0052\006\020\036\032\0020\004H\024J\026\020\037\032\0020\0042\f\020 \032\b\022\004\022\0020\0040\007H\026J\026\020!\032\b\022\004\022\0020\0040\0072\006\020\"\032\0020\004H\024R\016\020\020\032\0020\021X\004¢\006\002\n\000R\016\020\023\032\0020\024X\004¢\006\002\n\000R\032\020\025\032\016\022\004\022\0020\005\022\004\022\0020\0040\003X\004¢\006\002\n\000R \020\006\032\024\022\020\022\016\022\004\022\0020\004\022\004\022\0020\0040\b0\007X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\024\020\030\032\0020\005X\004¢\006\b\n\000\032\004\b\031\020\032R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000¨\006$"}, d2 = {"Lai/grazie/nlp/encoder/RobertaTextEncoder;", "Lai/grazie/nlp/encoder/PreTrainedTextEncoder;", "vocabulary", "", "", "", "merges", "", "Lkotlin/Pair;", "bosToken", "eosToken", "sepToken", "clsToken", "unkToken", "padToken", "maskToken", "add_prefix_space", "", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "bpe", "Lai/grazie/nlp/encoder/BPE;", "idsToToken", "pat", "Lkotlin/text/Regex;", "vocabSize", "getVocabSize", "()I", "convertIdToToken", "id", "convertTokenToId", "token", "decodeFromTokens", "tokens", "tokenizeText", "text", "Companion", "nlp-encoder-engine"})
/*    */ @SourceDebugExtension({"SMAP\nRobertaTextEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobertaTextEncoder.kt\nai/grazie/nlp/encoder/RobertaTextEncoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,65:1\n1179#2,2:66\n1253#2,4:68\n11345#3:72\n11680#3,3:73\n970#4:76\n1041#4,3:77\n*S KotlinDebug\n*F\n+ 1 RobertaTextEncoder.kt\nai/grazie/nlp/encoder/RobertaTextEncoder\n*L\n38#1:66,2\n38#1:68,4\n54#1:72\n54#1:73,3\n62#1:76\n62#1:77,3\n*E\n"})
/*    */ public final class RobertaTextEncoder extends PreTrainedTextEncoder { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Map<String, Integer> vocabulary;
/*    */   @NotNull
/*    */   private final List<Pair<String, String>> merges;
/*    */   private final boolean add_prefix_space;
/*    */   @NotNull
/*    */   private final Map<Integer, String> idsToToken;
/*    */   @NotNull
/*    */   private final BPE bpe;
/*    */   @NotNull
/*    */   private final Regex pat;
/*    */   private final int vocabSize;
/*    */   
/* 19 */   public RobertaTextEncoder(@NotNull Map<String, Integer> vocabulary, @NotNull List<Pair<String, String>> merges, @NotNull String bosToken, @NotNull String eosToken, @NotNull String sepToken, @NotNull String clsToken, @NotNull String unkToken, @NotNull String padToken, @NotNull String maskToken, boolean add_prefix_space) { super(
/* 20 */         bosToken, eosToken, 
/*    */         
/* 22 */         unkToken, sepToken, padToken, clsToken, maskToken);
/*    */ 
/*    */ 
/*    */     
/*    */     this.vocabulary = vocabulary;
/*    */ 
/*    */ 
/*    */     
/*    */     this.merges = merges;
/*    */ 
/*    */ 
/*    */     
/*    */     this.add_prefix_space = add_prefix_space;
/*    */ 
/*    */ 
/*    */     
/* 38 */     Set<Map.Entry<String, Integer>> set1 = this.vocabulary.entrySet(); RobertaTextEncoder robertaTextEncoder = this; int $i$f$associate = 0;
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
/* 66 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set1, 10)), 16);
/* 67 */     Set<Map.Entry<String, Integer>> set2 = set1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 68 */     for (Object<String, Integer> element$iv$iv : set2) {
/* 69 */       Map<Object, Object> map = destination$iv$iv; Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-associate-RobertaTextEncoder$idsToToken$1 = 0; Pair pair = TuplesKt.to(it.getValue(), it.getKey()); map.put(pair.getFirst(), pair.getSecond());
/*    */     } 
/* 71 */     robertaTextEncoder.idsToToken = (Map)destination$iv$iv; this.bpe = new BPE(this.merges); this.pat = new Regex("'s|'t|'re|'ve|'m|'ll|'d| ?\\p{L}+| ?\\p{N}+| ?[^\\s\\p{L}\\p{N}]+|\\s+(?!\\S)|\\s+"); this.vocabSize = this.vocabulary.size(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH@ø\001\000¢\006\002\020\n\002\004\n\002\b\031¨\006\013"}, d2 = {"Lai/grazie/nlp/encoder/RobertaTextEncoder$Companion;", "", "()V", "loadPretrained", "Lai/grazie/nlp/encoder/RobertaTextEncoder;", "loader", "Lai/grazie/utils/mpp/DataLoader;", "vocabularyFile", "", "mergesFile", "(Lai/grazie/utils/mpp/DataLoader;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nlp-encoder-engine"}) @SourceDebugExtension({"SMAP\nRobertaTextEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobertaTextEncoder.kt\nai/grazie/nlp/encoder/RobertaTextEncoder$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n766#2:66\n857#2,2:67\n1179#2,2:69\n1253#2,4:71\n766#2:75\n857#2,2:76\n1549#2:78\n1620#2,3:79\n*S KotlinDebug\n*F\n+ 1 RobertaTextEncoder.kt\nai/grazie/nlp/encoder/RobertaTextEncoder$Companion\n*L\n28#1:66\n28#1:67,2\n30#1:69,2\n30#1:71,4\n32#1:75\n32#1:76,2\n33#1:78\n33#1:79,3\n*E\n"}) public static final class Companion { private Companion() {} @Nullable public final Object loadPretrained(@NotNull DataLoader loader, @NotNull String vocabularyFile, @NotNull String mergesFile, @NotNull Continuation<? super RobertaTextEncoder> param1Continuation) { // Byte code:
/*    */       //   0: aload #4
/*    */       //   2: instanceof ai/grazie/nlp/encoder/RobertaTextEncoder$Companion$loadPretrained$1
/*    */       //   5: ifeq -> 41
/*    */       //   8: aload #4
/*    */       //   10: checkcast ai/grazie/nlp/encoder/RobertaTextEncoder$Companion$loadPretrained$1
/*    */       //   13: astore #21
/*    */       //   15: aload #21
/*    */       //   17: getfield label : I
/*    */       //   20: ldc -2147483648
/*    */       //   22: iand
/*    */       //   23: ifeq -> 41
/*    */       //   26: aload #21
/*    */       //   28: dup
/*    */       //   29: getfield label : I
/*    */       //   32: ldc -2147483648
/*    */       //   34: isub
/*    */       //   35: putfield label : I
/*    */       //   38: goto -> 53
/*    */       //   41: new ai/grazie/nlp/encoder/RobertaTextEncoder$Companion$loadPretrained$1
/*    */       //   44: dup
/*    */       //   45: aload_0
/*    */       //   46: aload #4
/*    */       //   48: invokespecial <init> : (Lai/grazie/nlp/encoder/RobertaTextEncoder$Companion;Lkotlin/coroutines/Continuation;)V
/*    */       //   51: astore #21
/*    */       //   53: aload #21
/*    */       //   55: getfield result : Ljava/lang/Object;
/*    */       //   58: astore #20
/*    */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   63: astore #22
/*    */       //   65: aload #21
/*    */       //   67: getfield label : I
/*    */       //   70: tableswitch default -> 727, 0 -> 96, 1 -> 137, 2 -> 455
/*    */       //   96: aload #20
/*    */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   101: aload_1
/*    */       //   102: aload_2
/*    */       //   103: aload #21
/*    */       //   105: aload #21
/*    */       //   107: aload_1
/*    */       //   108: putfield L$0 : Ljava/lang/Object;
/*    */       //   111: aload #21
/*    */       //   113: aload_3
/*    */       //   114: putfield L$1 : Ljava/lang/Object;
/*    */       //   117: aload #21
/*    */       //   119: iconst_1
/*    */       //   120: putfield label : I
/*    */       //   123: invokeinterface text : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   128: dup
/*    */       //   129: aload #22
/*    */       //   131: if_acmpne -> 162
/*    */       //   134: aload #22
/*    */       //   136: areturn
/*    */       //   137: aload #21
/*    */       //   139: getfield L$1 : Ljava/lang/Object;
/*    */       //   142: checkcast java/lang/String
/*    */       //   145: astore_3
/*    */       //   146: aload #21
/*    */       //   148: getfield L$0 : Ljava/lang/Object;
/*    */       //   151: checkcast ai/grazie/utils/mpp/DataLoader
/*    */       //   154: astore_1
/*    */       //   155: aload #20
/*    */       //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   160: aload #20
/*    */       //   162: checkcast java/lang/CharSequence
/*    */       //   165: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*    */       //   168: checkcast java/lang/Iterable
/*    */       //   171: astore #6
/*    */       //   173: iconst_0
/*    */       //   174: istore #7
/*    */       //   176: aload #6
/*    */       //   178: astore #8
/*    */       //   180: new java/util/ArrayList
/*    */       //   183: dup
/*    */       //   184: invokespecial <init> : ()V
/*    */       //   187: checkcast java/util/Collection
/*    */       //   190: astore #9
/*    */       //   192: iconst_0
/*    */       //   193: istore #10
/*    */       //   195: aload #8
/*    */       //   197: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   202: astore #11
/*    */       //   204: aload #11
/*    */       //   206: invokeinterface hasNext : ()Z
/*    */       //   211: ifeq -> 266
/*    */       //   214: aload #11
/*    */       //   216: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   221: astore #12
/*    */       //   223: aload #12
/*    */       //   225: checkcast java/lang/String
/*    */       //   228: astore #13
/*    */       //   230: iconst_0
/*    */       //   231: istore #14
/*    */       //   233: aload #13
/*    */       //   235: checkcast java/lang/CharSequence
/*    */       //   238: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */       //   241: ifne -> 248
/*    */       //   244: iconst_1
/*    */       //   245: goto -> 249
/*    */       //   248: iconst_0
/*    */       //   249: nop
/*    */       //   250: ifeq -> 204
/*    */       //   253: aload #9
/*    */       //   255: aload #12
/*    */       //   257: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   262: pop
/*    */       //   263: goto -> 204
/*    */       //   266: aload #9
/*    */       //   268: checkcast java/util/List
/*    */       //   271: nop
/*    */       //   272: checkcast java/lang/Iterable
/*    */       //   275: invokestatic withIndex : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
/*    */       //   278: astore #6
/*    */       //   280: iconst_0
/*    */       //   281: istore #7
/*    */       //   283: aload #6
/*    */       //   285: bipush #10
/*    */       //   287: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */       //   290: invokestatic mapCapacity : (I)I
/*    */       //   293: bipush #16
/*    */       //   295: invokestatic coerceAtLeast : (II)I
/*    */       //   298: istore #8
/*    */       //   300: aload #6
/*    */       //   302: astore #9
/*    */       //   304: new java/util/LinkedHashMap
/*    */       //   307: dup
/*    */       //   308: iload #8
/*    */       //   310: invokespecial <init> : (I)V
/*    */       //   313: checkcast java/util/Map
/*    */       //   316: astore #10
/*    */       //   318: iconst_0
/*    */       //   319: istore #11
/*    */       //   321: aload #9
/*    */       //   323: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   328: astore #12
/*    */       //   330: aload #12
/*    */       //   332: invokeinterface hasNext : ()Z
/*    */       //   337: ifeq -> 413
/*    */       //   340: aload #12
/*    */       //   342: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   347: astore #13
/*    */       //   349: aload #10
/*    */       //   351: astore #14
/*    */       //   353: aload #13
/*    */       //   355: checkcast kotlin/collections/IndexedValue
/*    */       //   358: astore #15
/*    */       //   360: iconst_0
/*    */       //   361: istore #16
/*    */       //   363: aload #15
/*    */       //   365: invokevirtual component1 : ()I
/*    */       //   368: istore #17
/*    */       //   370: aload #15
/*    */       //   372: invokevirtual component2 : ()Ljava/lang/Object;
/*    */       //   375: checkcast java/lang/String
/*    */       //   378: astore #18
/*    */       //   380: aload #18
/*    */       //   382: iload #17
/*    */       //   384: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */       //   387: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*    */       //   390: astore #15
/*    */       //   392: aload #14
/*    */       //   394: aload #15
/*    */       //   396: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */       //   399: aload #15
/*    */       //   401: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */       //   404: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   409: pop
/*    */       //   410: goto -> 330
/*    */       //   413: aload #10
/*    */       //   415: nop
/*    */       //   416: astore #5
/*    */       //   418: aload_1
/*    */       //   419: aload_3
/*    */       //   420: aload #21
/*    */       //   422: aload #21
/*    */       //   424: aload #5
/*    */       //   426: putfield L$0 : Ljava/lang/Object;
/*    */       //   429: aload #21
/*    */       //   431: aconst_null
/*    */       //   432: putfield L$1 : Ljava/lang/Object;
/*    */       //   435: aload #21
/*    */       //   437: iconst_2
/*    */       //   438: putfield label : I
/*    */       //   441: invokeinterface text : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   446: dup
/*    */       //   447: aload #22
/*    */       //   449: if_acmpne -> 472
/*    */       //   452: aload #22
/*    */       //   454: areturn
/*    */       //   455: aload #21
/*    */       //   457: getfield L$0 : Ljava/lang/Object;
/*    */       //   460: checkcast java/util/Map
/*    */       //   463: astore #5
/*    */       //   465: aload #20
/*    */       //   467: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   470: aload #20
/*    */       //   472: checkcast java/lang/CharSequence
/*    */       //   475: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*    */       //   478: checkcast java/lang/Iterable
/*    */       //   481: astore #7
/*    */       //   483: iconst_0
/*    */       //   484: istore #8
/*    */       //   486: aload #7
/*    */       //   488: astore #9
/*    */       //   490: new java/util/ArrayList
/*    */       //   493: dup
/*    */       //   494: invokespecial <init> : ()V
/*    */       //   497: checkcast java/util/Collection
/*    */       //   500: astore #10
/*    */       //   502: iconst_0
/*    */       //   503: istore #11
/*    */       //   505: aload #9
/*    */       //   507: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   512: astore #12
/*    */       //   514: aload #12
/*    */       //   516: invokeinterface hasNext : ()Z
/*    */       //   521: ifeq -> 576
/*    */       //   524: aload #12
/*    */       //   526: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   531: astore #13
/*    */       //   533: aload #13
/*    */       //   535: checkcast java/lang/String
/*    */       //   538: astore #14
/*    */       //   540: iconst_0
/*    */       //   541: istore #15
/*    */       //   543: aload #14
/*    */       //   545: checkcast java/lang/CharSequence
/*    */       //   548: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */       //   551: ifne -> 558
/*    */       //   554: iconst_1
/*    */       //   555: goto -> 559
/*    */       //   558: iconst_0
/*    */       //   559: nop
/*    */       //   560: ifeq -> 514
/*    */       //   563: aload #10
/*    */       //   565: aload #13
/*    */       //   567: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   572: pop
/*    */       //   573: goto -> 514
/*    */       //   576: aload #10
/*    */       //   578: checkcast java/util/List
/*    */       //   581: nop
/*    */       //   582: checkcast java/lang/Iterable
/*    */       //   585: astore #7
/*    */       //   587: iconst_0
/*    */       //   588: istore #8
/*    */       //   590: aload #7
/*    */       //   592: astore #9
/*    */       //   594: new java/util/ArrayList
/*    */       //   597: dup
/*    */       //   598: aload #7
/*    */       //   600: bipush #10
/*    */       //   602: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */       //   605: invokespecial <init> : (I)V
/*    */       //   608: checkcast java/util/Collection
/*    */       //   611: astore #10
/*    */       //   613: iconst_0
/*    */       //   614: istore #11
/*    */       //   616: aload #9
/*    */       //   618: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   623: astore #12
/*    */       //   625: aload #12
/*    */       //   627: invokeinterface hasNext : ()Z
/*    */       //   632: ifeq -> 695
/*    */       //   635: aload #12
/*    */       //   637: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   642: astore #13
/*    */       //   644: aload #10
/*    */       //   646: aload #13
/*    */       //   648: checkcast java/lang/String
/*    */       //   651: astore #14
/*    */       //   653: astore #19
/*    */       //   655: iconst_0
/*    */       //   656: istore #15
/*    */       //   658: aload #14
/*    */       //   660: checkcast java/lang/CharSequence
/*    */       //   663: invokestatic first : (Ljava/lang/CharSequence;)C
/*    */       //   666: invokestatic valueOf : (C)Ljava/lang/String;
/*    */       //   669: aload #14
/*    */       //   671: checkcast java/lang/CharSequence
/*    */       //   674: invokestatic last : (Ljava/lang/CharSequence;)C
/*    */       //   677: invokestatic valueOf : (C)Ljava/lang/String;
/*    */       //   680: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*    */       //   683: aload #19
/*    */       //   685: swap
/*    */       //   686: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   691: pop
/*    */       //   692: goto -> 625
/*    */       //   695: aload #10
/*    */       //   697: checkcast java/util/List
/*    */       //   700: nop
/*    */       //   701: astore #6
/*    */       //   703: new ai/grazie/nlp/encoder/RobertaTextEncoder
/*    */       //   706: dup
/*    */       //   707: aload #5
/*    */       //   709: aload #6
/*    */       //   711: aconst_null
/*    */       //   712: aconst_null
/*    */       //   713: aconst_null
/*    */       //   714: aconst_null
/*    */       //   715: aconst_null
/*    */       //   716: aconst_null
/*    */       //   717: aconst_null
/*    */       //   718: iconst_0
/*    */       //   719: sipush #1020
/*    */       //   722: aconst_null
/*    */       //   723: invokespecial <init> : (Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */       //   726: areturn
/*    */       //   727: new java/lang/IllegalStateException
/*    */       //   730: dup
/*    */       //   731: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   733: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   736: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #26	-> 63
/*    */       //   #27	-> 101
/*    */       //   #26	-> 134
/*    */       //   #27	-> 162
/*    */       //   #28	-> 173
/*    */       //   #66	-> 176
/*    */       //   #67	-> 195
/*    */       //   #28	-> 233
/*    */       //   #28	-> 249
/*    */       //   #67	-> 250
/*    */       //   #68	-> 266
/*    */       //   #66	-> 271
/*    */       //   #29	-> 275
/*    */       //   #30	-> 280
/*    */       //   #69	-> 283
/*    */       //   #70	-> 300
/*    */       //   #71	-> 321
/*    */       //   #72	-> 349
/*    */       //   #30	-> 363
/*    */       //   #72	-> 390
/*    */       //   #74	-> 413
/*    */       //   #70	-> 415
/*    */       //   #30	-> 416
/*    */       //   #27	-> 416
/*    */       //   #31	-> 418
/*    */       //   #26	-> 452
/*    */       //   #31	-> 472
/*    */       //   #32	-> 483
/*    */       //   #75	-> 486
/*    */       //   #76	-> 505
/*    */       //   #32	-> 543
/*    */       //   #32	-> 559
/*    */       //   #76	-> 560
/*    */       //   #77	-> 576
/*    */       //   #75	-> 581
/*    */       //   #33	-> 587
/*    */       //   #78	-> 590
/*    */       //   #79	-> 616
/*    */       //   #80	-> 644
/*    */       //   #33	-> 658
/*    */       //   #80	-> 686
/*    */       //   #81	-> 695
/*    */       //   #78	-> 700
/*    */       //   #33	-> 701
/*    */       //   #31	-> 701
/*    */       //   #34	-> 703
/*    */       //   #26	-> 727
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   101	36	1	loader	Lai/grazie/utils/mpp/DataLoader;
/*    */       //   155	95	1	loader	Lai/grazie/utils/mpp/DataLoader;
/*    */       //   250	22	1	loader	Lai/grazie/utils/mpp/DataLoader;
/*    */       //   272	118	1	loader	Lai/grazie/utils/mpp/DataLoader;
/*    */       //   390	26	1	loader	Lai/grazie/utils/mpp/DataLoader;
/*    */       //   416	30	1	loader	Lai/grazie/utils/mpp/DataLoader;
/*    */       //   101	27	2	vocabularyFile	Ljava/lang/String;
/*    */       //   101	36	3	mergesFile	Ljava/lang/String;
/*    */       //   146	104	3	mergesFile	Ljava/lang/String;
/*    */       //   250	22	3	mergesFile	Ljava/lang/String;
/*    */       //   272	118	3	mergesFile	Ljava/lang/String;
/*    */       //   390	26	3	mergesFile	Ljava/lang/String;
/*    */       //   416	30	3	mergesFile	Ljava/lang/String;
/*    */       //   418	37	5	vocabulary	Ljava/util/Map;
/*    */       //   465	95	5	vocabulary	Ljava/util/Map;
/*    */       //   560	22	5	vocabulary	Ljava/util/Map;
/*    */       //   582	145	5	vocabulary	Ljava/util/Map;
/*    */       //   173	19	6	$this$filter$iv	Ljava/lang/Iterable;
/*    */       //   280	38	6	$this$associate$iv	Ljava/lang/Iterable;
/*    */       //   703	24	6	merges	Ljava/util/List;
/*    */       //   483	19	7	$this$filter$iv	Ljava/lang/Iterable;
/*    */       //   587	26	7	$this$map$iv	Ljava/lang/Iterable;
/*    */       //   192	12	8	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */       //   300	18	8	capacity$iv	I
/*    */       //   192	76	9	destination$iv$iv	Ljava/util/Collection;
/*    */       //   318	12	9	$this$associateTo$iv$iv	Ljava/lang/Iterable;
/*    */       //   502	12	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*    */       //   613	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */       //   318	97	10	destination$iv$iv	Ljava/util/Map;
/*    */       //   502	76	10	destination$iv$iv	Ljava/util/Collection;
/*    */       //   613	84	10	destination$iv$iv	Ljava/util/Collection;
/*    */       //   223	40	12	element$iv$iv	Ljava/lang/Object;
/*    */       //   230	18	13	it	Ljava/lang/String;
/*    */       //   349	61	13	element$iv$iv	Ljava/lang/Object;
/*    */       //   533	40	13	element$iv$iv	Ljava/lang/Object;
/*    */       //   644	48	13	item$iv$iv	Ljava/lang/Object;
/*    */       //   540	18	14	it	Ljava/lang/String;
/*    */       //   655	28	14	line	Ljava/lang/String;
/*    */       //   370	20	17	value	I
/*    */       //   380	10	18	key	Ljava/lang/String;
/*    */       //   233	17	14	$i$a$-filter-RobertaTextEncoder$Companion$loadPretrained$vocabulary$1	I
/*    */       //   195	73	10	$i$f$filterTo	I
/*    */       //   176	96	7	$i$f$filter	I
/*    */       //   363	27	16	$i$a$-associate-RobertaTextEncoder$Companion$loadPretrained$vocabulary$2	I
/*    */       //   321	94	11	$i$f$associateTo	I
/*    */       //   283	133	7	$i$f$associate	I
/*    */       //   543	17	15	$i$a$-filter-RobertaTextEncoder$Companion$loadPretrained$merges$1	I
/*    */       //   505	73	11	$i$f$filterTo	I
/*    */       //   486	96	8	$i$f$filter	I
/*    */       //   658	25	15	$i$a$-map-RobertaTextEncoder$Companion$loadPretrained$merges$2	I
/*    */       //   616	81	11	$i$f$mapTo	I
/*    */       //   590	111	8	$i$f$map	I
/*    */       //   53	674	21	$continuation	Lkotlin/coroutines/Continuation;
/*    */       //   60	667	20	$result	Ljava/lang/Object; } @DebugMetadata(f = "RobertaTextEncoder.kt", l = {27, 31}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"loader", "mergesFile", "vocabulary"}, m = "loadPretrained", c = "ai.grazie.nlp.encoder.RobertaTextEncoder$Companion") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class RobertaTextEncoder$Companion$loadPretrained$1 extends ContinuationImpl {
/* 72 */       Object L$0; Object L$1; int label; RobertaTextEncoder$Companion$loadPretrained$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return RobertaTextEncoder.Companion.this.loadPretrained(null, null, null, (Continuation<? super RobertaTextEncoder>)this); } } } public int getVocabSize() { return this.vocabSize; } @NotNull protected List<String> tokenizeText(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); ArrayList<String> bpeTokens = new ArrayList(); for (MatchResult token : Regex.findAll$default(this.pat, text, 0, 2, null)) { byte[] $this$map$iv = StringsKt.encodeToByteArray(token.getValue()); int $i$f$map = 0; byte[] arrayOfByte1 = $this$map$iv; Collection<Character> destination$iv$iv = new ArrayList($this$map$iv.length); int $i$f$mapTo = 0; byte b; int i;
/* 73 */       for (b = 0, i = arrayOfByte1.length; b < i; ) { byte item$iv$iv = arrayOfByte1[b];
/* 74 */         byte b1 = item$iv$iv; Collection<Character> collection = destination$iv$iv; int $i$a$-map-RobertaTextEncoder$tokenizeText$byteToken$1 = 0; collection.add(UtilsKt.getBytesToUnicode().get(Byte.valueOf(b1))); }
/* 75 */        String byteToken = CollectionsKt.joinToString$default(destination$iv$iv, "", null, null, 0, null, null, 62, null); String[] arrayOfString = new String[1]; arrayOfString[0] = " "; bpeTokens.addAll(StringsKt.split$default(this.bpe.tokenize(byteToken), arrayOfString, false, 0, 6, null)); }  return bpeTokens; }
/* 76 */   protected int convertTokenToId(@NotNull String token) { Intrinsics.checkNotNullParameter(token, "token"); Intrinsics.checkNotNull(this.vocabulary.get(getUnkToken())); return ((Number)this.vocabulary.getOrDefault(token, this.vocabulary.get(getUnkToken()))).intValue(); } @NotNull protected String convertIdToToken(int id) { return this.idsToToken.getOrDefault(Integer.valueOf(id), getUnkToken()); } @NotNull public String decodeFromTokens(@NotNull List tokens) { Intrinsics.checkNotNullParameter(tokens, "tokens"); String text = CollectionsKt.joinToString$default(tokens, null, null, null, 0, null, RobertaTextEncoder$decodeFromTokens$text$1.INSTANCE, 31, null); CharSequence $this$map$iv = text; int $i$f$map = 0; CharSequence charSequence1 = $this$map$iv; Collection<Byte> destination$iv$iv = new ArrayList($this$map$iv.length()); int $i$f$mapTo = 0;
/* 77 */     for (byte b = 0; b < charSequence1.length(); ) { char item$iv$iv = charSequence1.charAt(b);
/* 78 */       char c = item$iv$iv; Collection<Byte> collection = destination$iv$iv; int $i$a$-map-RobertaTextEncoder$decodeFromTokens$1 = 0; Intrinsics.checkNotNull(UtilsKt.getUnicodeToBytes().get(Character.valueOf(c))); collection.add(Byte.valueOf(UtilsKt.getUnicodeToBytes().get(Character.valueOf(c)).byteValue())); }
/* 79 */      return StringsKt.decodeToString(CollectionsKt.toByteArray(destination$iv$iv)); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */   static final class RobertaTextEncoder$decodeFromTokens$text$1 extends Lambda implements Function1<String, CharSequence> {
/*    */     public static final RobertaTextEncoder$decodeFromTokens$text$1 INSTANCE = new RobertaTextEncoder$decodeFromTokens$text$1();
/*    */     
/*    */     RobertaTextEncoder$decodeFromTokens$text$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(@NotNull String it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       return "";
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/RobertaTextEncoder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */