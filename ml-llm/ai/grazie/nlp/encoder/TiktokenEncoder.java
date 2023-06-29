/*    */ package ai.grazie.nlp.encoder;
/*    */ import java.util.List;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\004\n\002\020\016\n\002\b\007\n\002\030\002\n\002\b\004\b&\030\0002\0020\001B)\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\007\022\006\020\b\032\0020\005¢\006\002\020\tJ\026\020\n\032\b\022\004\022\0020\0050\0132\006\020\f\032\0020\004H\002J\026\020\r\032\b\022\004\022\0020\0050\0132\006\020\f\032\0020\004H\002J\020\020\016\032\0020\0052\006\020\017\032\0020\020H\026J\024\020\021\032\b\022\004\022\0020\0050\0132\006\020\017\032\0020\020J'\020\022\032\004\030\0010\0052\006\020\f\032\0020\0042\006\020\023\032\0020\0052\006\020\024\032\0020\005H\002¢\006\002\020\025JA\020\026\032\004\030\0010\0052\006\020\f\032\0020\0042\030\020\027\032\024\022\020\022\016\022\004\022\0020\005\022\004\022\0020\0050\0300\0132\006\020\023\032\0020\0052\006\020\031\032\0020\005H\002¢\006\002\020\032J\f\020\033\032\0020\004*\0020\020H\002R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\005X\004¢\006\002\n\000R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000¨\006\034"}, d2 = {"Lai/grazie/nlp/encoder/TiktokenEncoder;", "Lai/grazie/model/nlp/encoder/TokenCounter;", "vocabulary", "", "Lai/grazie/nlp/encoder/ByteArrayKey;", "", "pattern", "Lkotlin/text/Regex;", "unkTokenId", "(Ljava/util/Map;Lkotlin/text/Regex;I)V", "bytePairEncode", "", "bytes", "bytePairMerge", "count", "text", "", "encodeAsIds", "f", "start", "end", "(Lai/grazie/nlp/encoder/ByteArrayKey;II)Ljava/lang/Integer;", "getRank", "parts", "Lai/grazie/nlp/encoder/MutablePair;", "skip", "(Lai/grazie/nlp/encoder/ByteArrayKey;Ljava/util/List;II)Ljava/lang/Integer;", "toByteArrayKey", "nlp-encoder-engine"})
/*    */ @SourceDebugExtension({"SMAP\nTiktokenEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiktokenEncoder.kt\nai/grazie/nlp/encoder/TiktokenEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1#2:75\n1#2:103\n1796#3,14:76\n1569#4,11:90\n1864#4,2:101\n1866#4:104\n1580#4:105\n*S KotlinDebug\n*F\n+ 1 TiktokenEncoder.kt\nai/grazie/nlp/encoder/TiktokenEncoder\n*L\n54#1:103\n42#1:76,14\n54#1:90,11\n54#1:101,2\n54#1:104\n54#1:105\n*E\n"})
/*    */ public abstract class TiktokenEncoder implements TokenCounter {
/*    */   @NotNull
/*    */   private final Map<ByteArrayKey, Integer> vocabulary;
/*    */   
/*    */   public TiktokenEncoder(@NotNull Map<ByteArrayKey, Integer> vocabulary, @NotNull Regex pattern, int unkTokenId) {
/* 11 */     this.vocabulary = vocabulary;
/* 12 */     this.pattern = pattern;
/* 13 */     this.unkTokenId = unkTokenId;
/*    */   } @NotNull
/*    */   private final Regex pattern; private final int unkTokenId; public int count(@NotNull String text) {
/* 16 */     Intrinsics.checkNotNullParameter(text, "text"); return encodeAsIds(text).size();
/*    */   } @NotNull
/*    */   public final List<Integer> encodeAsIds(@NotNull String text) {
/* 19 */     Intrinsics.checkNotNullParameter(text, "text"); Sequence matches = Regex.findAll$default(this.pattern, text, 0, 2, null);
/* 20 */     return 
/*    */ 
/*    */       
/* 23 */       SequencesKt.toList(SequencesKt.flattenSequenceOfIterable(SequencesKt.map(matches, new TiktokenEncoder$encodeAsIds$1())));
/*    */   }
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
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\020\b\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "", "match", "Lkotlin/text/MatchResult;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nTiktokenEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TiktokenEncoder.kt\nai/grazie/nlp/encoder/TiktokenEncoder$encodeAsIds$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/*    */   static final class TiktokenEncoder$encodeAsIds$1
/*    */     extends Lambda
/*    */     implements Function1<MatchResult, List<? extends Integer>>
/*    */   {
/*    */     @NotNull
/*    */     public final List<Integer> invoke(@NotNull MatchResult match) {
/*    */       Intrinsics.checkNotNullParameter(match, "match");
/*    */       String piece = match.getValue();
/*    */       if ((Integer)TiktokenEncoder.this.vocabulary.get(TiktokenEncoder.this.toByteArrayKey(piece)) != null) {
/*    */         int it = ((Integer)TiktokenEncoder.this.vocabulary.get(TiktokenEncoder.this.toByteArrayKey(piece))).intValue();
/* 75 */         int $i$a$-let-TiktokenEncoder$encodeAsIds$1$1 = 0;
/*    */         if (CollectionsKt.listOf(Integer.valueOf(it)) == null) {
/*    */           CollectionsKt.listOf(Integer.valueOf(it));
/*    */           return TiktokenEncoder.this.bytePairEncode(TiktokenEncoder.this.toByteArrayKey(piece));
/*    */         } 
/*    */         return CollectionsKt.listOf(Integer.valueOf(it));
/*    */       } 
/*    */       CollectionsKt.listOf(Integer.valueOf(it));
/*    */       return TiktokenEncoder.this.bytePairEncode(TiktokenEncoder.this.toByteArrayKey(piece));
/*    */     }
/*    */     
/*    */     TiktokenEncoder$encodeAsIds$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */   
/*    */   private final List<Integer> bytePairEncode(ByteArrayKey bytes) {
/*    */     if (bytes.getSize() == 1) {
/*    */       (Integer)this.vocabulary.get(bytes);
/*    */       return CollectionsKt.listOf(Integer.valueOf(((Integer)this.vocabulary.get(bytes) != null) ? ((Integer)this.vocabulary.get(bytes)).intValue() : this.unkTokenId));
/*    */     } 
/*    */     return bytePairMerge(bytes);
/*    */   }
/*    */   
/*    */   private final List<Integer> bytePairMerge(ByteArrayKey bytes) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual getSize : ()I
/*    */     //   4: iconst_1
/*    */     //   5: iadd
/*    */     //   6: istore_3
/*    */     //   7: new java/util/ArrayList
/*    */     //   10: dup
/*    */     //   11: iload_3
/*    */     //   12: invokespecial <init> : (I)V
/*    */     //   15: astore #4
/*    */     //   17: iconst_0
/*    */     //   18: istore #5
/*    */     //   20: iload #5
/*    */     //   22: iload_3
/*    */     //   23: if_icmpge -> 67
/*    */     //   26: iload #5
/*    */     //   28: istore #6
/*    */     //   30: aload #4
/*    */     //   32: iload #6
/*    */     //   34: istore #7
/*    */     //   36: astore #22
/*    */     //   38: iconst_0
/*    */     //   39: istore #8
/*    */     //   41: iload #7
/*    */     //   43: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   46: ldc 2147483647
/*    */     //   48: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   51: invokestatic toM : (Ljava/lang/Object;Ljava/lang/Object;)Lai/grazie/nlp/encoder/MutablePair;
/*    */     //   54: aload #22
/*    */     //   56: swap
/*    */     //   57: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   60: pop
/*    */     //   61: iinc #5, 1
/*    */     //   64: goto -> 20
/*    */     //   67: aload #4
/*    */     //   69: checkcast java/util/List
/*    */     //   72: astore_2
/*    */     //   73: iconst_0
/*    */     //   74: istore_3
/*    */     //   75: aload_2
/*    */     //   76: invokeinterface size : ()I
/*    */     //   81: iconst_2
/*    */     //   82: isub
/*    */     //   83: istore #4
/*    */     //   85: iload_3
/*    */     //   86: iload #4
/*    */     //   88: if_icmpge -> 139
/*    */     //   91: aload_0
/*    */     //   92: aload_1
/*    */     //   93: aload_2
/*    */     //   94: iload_3
/*    */     //   95: iconst_0
/*    */     //   96: invokespecial getRank : (Lai/grazie/nlp/encoder/ByteArrayKey;Ljava/util/List;II)Ljava/lang/Integer;
/*    */     //   99: dup
/*    */     //   100: ifnull -> 109
/*    */     //   103: invokevirtual intValue : ()I
/*    */     //   106: goto -> 113
/*    */     //   109: pop
/*    */     //   110: goto -> 133
/*    */     //   113: istore #5
/*    */     //   115: aload_2
/*    */     //   116: iload_3
/*    */     //   117: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   122: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   125: iload #5
/*    */     //   127: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   130: invokevirtual setSecond : (Ljava/lang/Object;)V
/*    */     //   133: iinc #3, 1
/*    */     //   136: goto -> 85
/*    */     //   139: aload_2
/*    */     //   140: invokeinterface size : ()I
/*    */     //   145: iconst_1
/*    */     //   146: if_icmple -> 437
/*    */     //   149: aload_2
/*    */     //   150: checkcast java/lang/Iterable
/*    */     //   153: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*    */     //   156: aload_2
/*    */     //   157: invokeinterface size : ()I
/*    */     //   162: iconst_1
/*    */     //   163: isub
/*    */     //   164: invokestatic take : (Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;
/*    */     //   167: astore #4
/*    */     //   169: iconst_0
/*    */     //   170: istore #5
/*    */     //   172: aload #4
/*    */     //   174: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   179: astore #6
/*    */     //   181: aload #6
/*    */     //   183: invokeinterface hasNext : ()Z
/*    */     //   188: ifne -> 199
/*    */     //   191: new java/util/NoSuchElementException
/*    */     //   194: dup
/*    */     //   195: invokespecial <init> : ()V
/*    */     //   198: athrow
/*    */     //   199: aload #6
/*    */     //   201: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   206: astore #7
/*    */     //   208: aload #6
/*    */     //   210: invokeinterface hasNext : ()Z
/*    */     //   215: ifne -> 223
/*    */     //   218: aload #7
/*    */     //   220: goto -> 305
/*    */     //   223: aload #7
/*    */     //   225: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   228: astore #8
/*    */     //   230: iconst_0
/*    */     //   231: istore #9
/*    */     //   233: aload #8
/*    */     //   235: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   238: checkcast java/lang/Number
/*    */     //   241: invokevirtual intValue : ()I
/*    */     //   244: istore #8
/*    */     //   246: aload #6
/*    */     //   248: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   253: astore #9
/*    */     //   255: aload #9
/*    */     //   257: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   260: astore #10
/*    */     //   262: iconst_0
/*    */     //   263: istore #11
/*    */     //   265: aload #10
/*    */     //   267: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   270: checkcast java/lang/Number
/*    */     //   273: invokevirtual intValue : ()I
/*    */     //   276: istore #10
/*    */     //   278: iload #8
/*    */     //   280: iload #10
/*    */     //   282: if_icmple -> 293
/*    */     //   285: aload #9
/*    */     //   287: astore #7
/*    */     //   289: iload #10
/*    */     //   291: istore #8
/*    */     //   293: aload #6
/*    */     //   295: invokeinterface hasNext : ()Z
/*    */     //   300: ifne -> 246
/*    */     //   303: aload #7
/*    */     //   305: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   308: astore_3
/*    */     //   309: aload_3
/*    */     //   310: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   313: checkcast java/lang/Number
/*    */     //   316: invokevirtual intValue : ()I
/*    */     //   319: ldc 2147483647
/*    */     //   321: if_icmpeq -> 434
/*    */     //   324: aload_2
/*    */     //   325: aload_3
/*    */     //   326: invokeinterface indexOf : (Ljava/lang/Object;)I
/*    */     //   331: istore #4
/*    */     //   333: aload_2
/*    */     //   334: iload #4
/*    */     //   336: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   341: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   344: aload_0
/*    */     //   345: aload_1
/*    */     //   346: aload_2
/*    */     //   347: iload #4
/*    */     //   349: iconst_1
/*    */     //   350: invokespecial getRank : (Lai/grazie/nlp/encoder/ByteArrayKey;Ljava/util/List;II)Ljava/lang/Integer;
/*    */     //   353: dup
/*    */     //   354: ifnull -> 363
/*    */     //   357: invokevirtual intValue : ()I
/*    */     //   360: goto -> 366
/*    */     //   363: pop
/*    */     //   364: ldc 2147483647
/*    */     //   366: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   369: invokevirtual setSecond : (Ljava/lang/Object;)V
/*    */     //   372: iload #4
/*    */     //   374: ifle -> 420
/*    */     //   377: aload_2
/*    */     //   378: iload #4
/*    */     //   380: iconst_1
/*    */     //   381: isub
/*    */     //   382: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   387: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   390: aload_0
/*    */     //   391: aload_1
/*    */     //   392: aload_2
/*    */     //   393: iload #4
/*    */     //   395: iconst_1
/*    */     //   396: isub
/*    */     //   397: iconst_1
/*    */     //   398: invokespecial getRank : (Lai/grazie/nlp/encoder/ByteArrayKey;Ljava/util/List;II)Ljava/lang/Integer;
/*    */     //   401: dup
/*    */     //   402: ifnull -> 411
/*    */     //   405: invokevirtual intValue : ()I
/*    */     //   408: goto -> 414
/*    */     //   411: pop
/*    */     //   412: ldc 2147483647
/*    */     //   414: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   417: invokevirtual setSecond : (Ljava/lang/Object;)V
/*    */     //   420: aload_2
/*    */     //   421: iload #4
/*    */     //   423: iconst_1
/*    */     //   424: iadd
/*    */     //   425: invokeinterface remove : (I)Ljava/lang/Object;
/*    */     //   430: pop
/*    */     //   431: goto -> 139
/*    */     //   434: goto -> 437
/*    */     //   437: aload_2
/*    */     //   438: checkcast java/lang/Iterable
/*    */     //   441: astore_3
/*    */     //   442: iconst_0
/*    */     //   443: istore #4
/*    */     //   445: aload_3
/*    */     //   446: astore #5
/*    */     //   448: new java/util/ArrayList
/*    */     //   451: dup
/*    */     //   452: invokespecial <init> : ()V
/*    */     //   455: checkcast java/util/Collection
/*    */     //   458: astore #6
/*    */     //   460: iconst_0
/*    */     //   461: istore #7
/*    */     //   463: aload #5
/*    */     //   465: astore #8
/*    */     //   467: iconst_0
/*    */     //   468: istore #9
/*    */     //   470: iconst_0
/*    */     //   471: istore #10
/*    */     //   473: aload #8
/*    */     //   475: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   480: astore #11
/*    */     //   482: aload #11
/*    */     //   484: invokeinterface hasNext : ()Z
/*    */     //   489: ifeq -> 624
/*    */     //   492: aload #11
/*    */     //   494: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   499: astore #12
/*    */     //   501: iload #10
/*    */     //   503: iinc #10, 1
/*    */     //   506: istore #13
/*    */     //   508: iload #13
/*    */     //   510: ifge -> 516
/*    */     //   513: invokestatic throwIndexOverflow : ()V
/*    */     //   516: iload #13
/*    */     //   518: aload #12
/*    */     //   520: astore #14
/*    */     //   522: istore #15
/*    */     //   524: iconst_0
/*    */     //   525: istore #16
/*    */     //   527: iload #15
/*    */     //   529: aload #14
/*    */     //   531: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   534: astore #17
/*    */     //   536: istore #18
/*    */     //   538: iconst_0
/*    */     //   539: istore #19
/*    */     //   541: iload #18
/*    */     //   543: aload_2
/*    */     //   544: invokeinterface size : ()I
/*    */     //   549: iconst_1
/*    */     //   550: isub
/*    */     //   551: if_icmplt -> 558
/*    */     //   554: aconst_null
/*    */     //   555: goto -> 596
/*    */     //   558: aload_0
/*    */     //   559: aload_1
/*    */     //   560: aload #17
/*    */     //   562: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   565: checkcast java/lang/Number
/*    */     //   568: invokevirtual intValue : ()I
/*    */     //   571: aload_2
/*    */     //   572: iload #18
/*    */     //   574: iconst_1
/*    */     //   575: iadd
/*    */     //   576: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   581: checkcast ai/grazie/nlp/encoder/MutablePair
/*    */     //   584: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   587: checkcast java/lang/Number
/*    */     //   590: invokevirtual intValue : ()I
/*    */     //   593: invokespecial f : (Lai/grazie/nlp/encoder/ByteArrayKey;II)Ljava/lang/Integer;
/*    */     //   596: nop
/*    */     //   597: dup
/*    */     //   598: ifnull -> 619
/*    */     //   601: astore #20
/*    */     //   603: iconst_0
/*    */     //   604: istore #21
/*    */     //   606: aload #6
/*    */     //   608: aload #20
/*    */     //   610: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   615: pop
/*    */     //   616: goto -> 620
/*    */     //   619: pop
/*    */     //   620: nop
/*    */     //   621: goto -> 482
/*    */     //   624: nop
/*    */     //   625: aload #6
/*    */     //   627: checkcast java/util/List
/*    */     //   630: nop
/*    */     //   631: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #75	-> 36
/*    */     //   #34	-> 41
/*    */     //   #34	-> 57
/*    */     //   #34	-> 72
/*    */     //   #36	-> 73
/*    */     //   #37	-> 91
/*    */     //   #38	-> 115
/*    */     //   #36	-> 133
/*    */     //   #41	-> 139
/*    */     //   #42	-> 149
/*    */     //   #76	-> 172
/*    */     //   #77	-> 181
/*    */     //   #78	-> 199
/*    */     //   #79	-> 208
/*    */     //   #80	-> 223
/*    */     //   #42	-> 233
/*    */     //   #80	-> 244
/*    */     //   #82	-> 246
/*    */     //   #83	-> 255
/*    */     //   #42	-> 265
/*    */     //   #83	-> 276
/*    */     //   #84	-> 278
/*    */     //   #85	-> 285
/*    */     //   #86	-> 289
/*    */     //   #88	-> 293
/*    */     //   #89	-> 303
/*    */     //   #42	-> 305
/*    */     //   #43	-> 309
/*    */     //   #44	-> 324
/*    */     //   #45	-> 333
/*    */     //   #46	-> 372
/*    */     //   #47	-> 377
/*    */     //   #49	-> 420
/*    */     //   #51	-> 434
/*    */     //   #54	-> 437
/*    */     //   #90	-> 445
/*    */     //   #100	-> 463
/*    */     //   #101	-> 470
/*    */     //   #102	-> 473
/*    */     //   #102	-> 518
/*    */     //   #100	-> 527
/*    */     //   #55	-> 541
/*    */     //   #56	-> 558
/*    */     //   #55	-> 596
/*    */     //   #100	-> 597
/*    */     //   #103	-> 603
/*    */     //   #100	-> 606
/*    */     //   #100	-> 616
/*    */     //   #100	-> 619
/*    */     //   #102	-> 620
/*    */     //   #104	-> 624
/*    */     //   #105	-> 625
/*    */     //   #90	-> 630
/*    */     //   #54	-> 631
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	13	8	$i$a$-MutableList-TiktokenEncoder$bytePairMerge$parts$1	I
/*    */     //   38	16	7	it	I
/*    */     //   115	18	5	rank	I
/*    */     //   75	64	3	i	I
/*    */     //   233	11	9	$i$a$-minByOrThrow-TiktokenEncoder$bytePairMerge$minRank$1	I
/*    */     //   230	14	8	it	Lai/grazie/nlp/encoder/MutablePair;
/*    */     //   265	11	11	$i$a$-minByOrThrow-TiktokenEncoder$bytePairMerge$minRank$1	I
/*    */     //   262	14	10	it	Lai/grazie/nlp/encoder/MutablePair;
/*    */     //   255	38	9	e$iv	Ljava/lang/Object;
/*    */     //   278	15	10	v$iv	I
/*    */     //   172	133	5	$i$f$minByOrThrow	I
/*    */     //   181	124	6	iterator$iv	Ljava/util/Iterator;
/*    */     //   208	97	7	minElem$iv	Ljava/lang/Object;
/*    */     //   246	59	8	minValue$iv	I
/*    */     //   169	136	4	$this$minBy$iv	Lkotlin/sequences/Sequence;
/*    */     //   333	98	4	i	I
/*    */     //   309	128	3	minRank	Lai/grazie/nlp/encoder/MutablePair;
/*    */     //   541	56	19	$i$a$-mapIndexedNotNull-TiktokenEncoder$bytePairMerge$1	I
/*    */     //   538	59	18	i	I
/*    */     //   538	59	17	part	Lai/grazie/nlp/encoder/MutablePair;
/*    */     //   606	10	21	$i$a$-let-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$1$iv$iv	I
/*    */     //   603	13	20	it$iv$iv	Ljava/lang/Object;
/*    */     //   527	93	16	$i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv$iv	I
/*    */     //   524	96	15	index$iv$iv	I
/*    */     //   524	96	14	element$iv$iv	Ljava/lang/Object;
/*    */     //   501	120	12	item$iv$iv$iv	Ljava/lang/Object;
/*    */     //   470	155	9	$i$f$forEachIndexed	I
/*    */     //   473	152	10	index$iv$iv$iv	I
/*    */     //   467	158	8	$this$forEachIndexed$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   463	164	7	$i$f$mapIndexedNotNullTo	I
/*    */     //   460	167	5	$this$mapIndexedNotNullTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   460	167	6	destination$iv$iv	Ljava/util/Collection;
/*    */     //   445	186	4	$i$f$mapIndexedNotNull	I
/*    */     //   442	189	3	$this$mapIndexedNotNull$iv	Ljava/lang/Iterable;
/*    */     //   73	559	2	parts	Ljava/util/List;
/*    */     //   0	632	0	this	Lai/grazie/nlp/encoder/TiktokenEncoder;
/*    */     //   0	632	1	bytes	Lai/grazie/nlp/encoder/ByteArrayKey;
/*    */   }
/*    */   
/*    */   private final Integer getRank(ByteArrayKey bytes, List<MutablePair> parts, int start, int skip) {
/*    */     return (start + skip + 2 < parts.size()) ? this.vocabulary.get(bytes.range(((Number)((MutablePair)parts.get(start)).getFirst()).intValue(), ((Number)((MutablePair)parts.get(start + skip + 2)).getFirst()).intValue())) : null;
/*    */   }
/*    */   
/*    */   private final Integer f(ByteArrayKey bytes, int start, int end) {
/*    */     return this.vocabulary.get(bytes.range(start, end));
/*    */   }
/*    */   
/*    */   private final ByteArrayKey toByteArrayKey(String $this$toByteArrayKey) {
/*    */     return new ByteArrayKey(StringsKt.encodeToByteArray($this$toByteArrayKey));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/TiktokenEncoder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */