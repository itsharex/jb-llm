/*    */ package ai.grazie.utils;
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000f\n\000\n\002\030\002\n\002\020\001\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020 \n\000\n\002\020\013\n\000\n\002\020$\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020%\n\002\b\002\n\002\020\b\n\000\n\002\020\021\n\002\020\034\n\002\b\005\n\002\020\000\n\002\020\036\n\002\b\002\n\002\030\002\n\000\032\034\020\000\032\022\022\004\022\002H\0040\001j\b\022\004\022\002H\004`\003\"\004\b\000\020\004\0322\020\005\032\024\022\020\022\016\022\004\022\002H\004\022\004\022\002H\0040\0070\006\"\004\b\000\020\004*\b\022\004\022\002H\0040\b2\b\b\002\020\t\032\0020\n\032\001\020\013\032\016\022\004\022\002H\r\022\004\022\002H\0160\f\"\004\b\000\020\r\"\004\b\001\020\016*\016\022\004\022\002H\r\022\004\022\002H\0160\f2\022\020\017\032\016\022\004\022\002H\r\022\004\022\002H\0160\f2K\020\020\032G\022\023\022\021H\r¢\006\f\b\022\022\b\b\023\022\004\b\b(\024\022\023\022\021H\016¢\006\f\b\022\022\b\b\023\022\004\b\b(\025\022\023\022\021H\016¢\006\f\b\022\022\b\b\023\022\004\b\b(\026\022\004\022\002H\0160\021\032\001\020\027\032\016\022\004\022\002H\r\022\004\022\002H\0160\030\"\004\b\000\020\r\"\004\b\001\020\016*\016\022\004\022\002H\r\022\004\022\002H\0160\0302\022\020\017\032\016\022\004\022\002H\r\022\004\022\002H\0160\f2K\020\020\032G\022\023\022\021H\r¢\006\f\b\022\022\b\b\023\022\004\b\b(\024\022\023\022\021H\016¢\006\f\b\022\022\b\b\023\022\004\b\b(\025\022\023\022\021H\016¢\006\f\b\022\022\b\b\023\022\004\b\b(\026\022\004\022\002H\0160\021\032$\020\031\032\b\022\004\022\002H\0040\b\"\004\b\000\020\004*\b\022\004\022\002H\0040\b2\006\020\032\032\0020\033\032&\020\034\032\b\022\004\022\002H\0040\035\"\006\b\000\020\004\030\001*\b\022\004\022\002H\0040\036H\b¢\006\002\020\037\032-\020 \032\022\022\004\022\002H\0040\001j\b\022\004\022\002H\004`\003\"\004\b\000\020\004*\n\022\006\b\001\022\002H\0040\035¢\006\002\020!\032&\020 \032\022\022\004\022\002H\0040\001j\b\022\004\022\002H\004`\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\036\032&\020 \032\022\022\004\022\002H\0040\001j\b\022\004\022\002H\004`\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\006\032(\020\"\032\016\022\004\022\002H\r\022\004\022\0020\0330\030\"\004\b\000\020\r*\016\022\004\022\002H\r\022\004\022\0020\0330\f\0320\020#\032\020\022\f\022\n\022\006\022\004\030\001H\0040\b0\006\"\b\b\000\020\004*\0020$*\b\022\004\022\002H\0040%2\006\020&\032\0020\033\"\036\020\000\032\022\022\004\022\0020\0020\001j\b\022\004\022\0020\002`\003X\004¢\006\002\n\000*\034\020'\032\004\b\000\020\004\"\b\022\004\022\002H\004`(2\b\022\004\022\002H\0040\001¨\006)"}, d2 = {"emptyLinkedSet", "Ljava/util/LinkedHashSet;", "", "Lai/grazie/utils/LinkedSet;", "T", "decarteMult", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "", "excludeDiagonal", "", "merge", "", "K", "V", "other", "merger", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "key", "valueOne", "valueSecond", "mergeInplace", "", "suffix", "fromIndex", "", "toDistinctTypedArray", "", "", "(Ljava/lang/Iterable;)[Ljava/lang/Object;", "toLinkedSet", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "toSmallMemoryFootprintIntValueMap", "windowedPartial", "", "", "size", "LinkedSet", "Lkotlin/collections/LinkedHashSet;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nai/grazie/utils/CollectionsKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,83:1\n37#2,2:84\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nai/grazie/utils/CollectionsKt\n*L\n76#1:84,2\n*E\n"})
/*    */ public final class CollectionsKt { @NotNull
/*  5 */   public static final <T> LinkedHashSet<T> toLinkedSet(@NotNull Object[] $this$toLinkedSet) { Intrinsics.checkNotNullParameter($this$toLinkedSet, "<this>"); return (LinkedHashSet<T>)ArraysKt.toCollection($this$toLinkedSet, new LinkedHashSet()); } @NotNull
/*  6 */   public static final <T> LinkedHashSet<T> toLinkedSet(@NotNull Iterable $this$toLinkedSet) { Intrinsics.checkNotNullParameter($this$toLinkedSet, "<this>"); return (LinkedHashSet<T>)kotlin.collections.CollectionsKt.toCollection($this$toLinkedSet, new LinkedHashSet()); } @NotNull
/*  7 */   public static final <T> LinkedHashSet<T> toLinkedSet(@NotNull Sequence $this$toLinkedSet) { Intrinsics.checkNotNullParameter($this$toLinkedSet, "<this>"); return (LinkedHashSet<T>)SequencesKt.toCollection($this$toLinkedSet, new LinkedHashSet()); }
/*    */    @NotNull
/*  9 */   private static final LinkedHashSet emptyLinkedSet = new LinkedHashSet();
/*    */   
/*    */   @NotNull
/* 12 */   public static final <T> LinkedHashSet<T> emptyLinkedSet() { Intrinsics.checkNotNull(emptyLinkedSet, "null cannot be cast to non-null type java.util.LinkedHashSet<T of ai.grazie.utils.CollectionsKt.emptyLinkedSet>{ ai.grazie.utils.CollectionsKt.LinkedSet<T of ai.grazie.utils.CollectionsKt.emptyLinkedSet> }"); return emptyLinkedSet; } @NotNull
/*    */   public static final <T> Sequence<List<T>> windowedPartial(@NotNull Collection<? extends T> $this$windowedPartial, int size) {
/* 14 */     Intrinsics.checkNotNullParameter($this$windowedPartial, "<this>"); return SequencesKt.sequence(new CollectionsKt$windowedPartial$1($this$windowedPartial, size, null));
/*    */   } @DebugMetadata(f = "Collections.kt", l = {23, 34}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$3"}, n = {"$this$sequence", "window", "value"}, m = "invokeSuspend", c = "ai.grazie.utils.CollectionsKt$windowedPartial$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\020\000\n\002\030\002\n\002\020 \020\000\032\0020\001\"\b\b\000\020\002*\0020\003*\020\022\f\022\n\022\006\022\004\030\001H\0020\0050\004H@"}, d2 = {"<anonymous>", "", "T", "", "Lkotlin/sequences/SequenceScope;", ""})
/*    */   @SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nai/grazie/utils/CollectionsKt$windowedPartial$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nai/grazie/utils/CollectionsKt$windowedPartial$1\n*L\n17#1:84\n17#1:85,3\n*E\n"})
/*    */   static final class CollectionsKt$windowedPartial$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
/*    */     Object L$1; Object L$2; Object L$3; int label; CollectionsKt$windowedPartial$1(Collection<T> $receiver, int $size, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #14
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 536, 0 -> 36, 1 -> 396, 2 -> 526
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield L$0 : Ljava/lang/Object;
/*    */       //   44: checkcast kotlin/sequences/SequenceScope
/*    */       //   47: astore_2
/*    */       //   48: aload_0
/*    */       //   49: getfield $this_windowedPartial : Ljava/util/Collection;
/*    */       //   52: invokeinterface isEmpty : ()Z
/*    */       //   57: ifeq -> 64
/*    */       //   60: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   63: areturn
/*    */       //   64: iconst_0
/*    */       //   65: aload_0
/*    */       //   66: getfield $size : I
/*    */       //   69: iconst_1
/*    */       //   70: isub
/*    */       //   71: invokestatic until : (II)Lkotlin/ranges/IntRange;
/*    */       //   74: checkcast java/lang/Iterable
/*    */       //   77: astore #4
/*    */       //   79: iconst_0
/*    */       //   80: istore #5
/*    */       //   82: aload #4
/*    */       //   84: astore #6
/*    */       //   86: new java/util/ArrayList
/*    */       //   89: dup
/*    */       //   90: aload #4
/*    */       //   92: bipush #10
/*    */       //   94: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */       //   97: invokespecial <init> : (I)V
/*    */       //   100: checkcast java/util/Collection
/*    */       //   103: astore #7
/*    */       //   105: iconst_0
/*    */       //   106: istore #8
/*    */       //   108: aload #6
/*    */       //   110: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   115: astore #9
/*    */       //   117: aload #9
/*    */       //   119: invokeinterface hasNext : ()Z
/*    */       //   124: ifeq -> 157
/*    */       //   127: aload #9
/*    */       //   129: checkcast kotlin/collections/IntIterator
/*    */       //   132: invokevirtual nextInt : ()I
/*    */       //   135: istore #10
/*    */       //   137: aload #7
/*    */       //   139: astore #12
/*    */       //   141: iconst_0
/*    */       //   142: istore #11
/*    */       //   144: aconst_null
/*    */       //   145: aload #12
/*    */       //   147: swap
/*    */       //   148: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   153: pop
/*    */       //   154: goto -> 117
/*    */       //   157: aload #7
/*    */       //   159: checkcast java/util/List
/*    */       //   162: nop
/*    */       //   163: checkcast java/util/Collection
/*    */       //   166: aload_0
/*    */       //   167: getfield $this_windowedPartial : Ljava/util/Collection;
/*    */       //   170: checkcast java/lang/Iterable
/*    */       //   173: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   176: checkcast java/util/Collection
/*    */       //   179: iconst_0
/*    */       //   180: aload_0
/*    */       //   181: getfield $size : I
/*    */       //   184: iconst_1
/*    */       //   185: isub
/*    */       //   186: invokestatic until : (II)Lkotlin/ranges/IntRange;
/*    */       //   189: checkcast java/lang/Iterable
/*    */       //   192: astore #4
/*    */       //   194: astore #12
/*    */       //   196: iconst_0
/*    */       //   197: istore #5
/*    */       //   199: aload #4
/*    */       //   201: astore #6
/*    */       //   203: new java/util/ArrayList
/*    */       //   206: dup
/*    */       //   207: aload #4
/*    */       //   209: bipush #10
/*    */       //   211: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */       //   214: invokespecial <init> : (I)V
/*    */       //   217: checkcast java/util/Collection
/*    */       //   220: astore #7
/*    */       //   222: iconst_0
/*    */       //   223: istore #8
/*    */       //   225: aload #6
/*    */       //   227: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   232: astore #9
/*    */       //   234: aload #9
/*    */       //   236: invokeinterface hasNext : ()Z
/*    */       //   241: ifeq -> 274
/*    */       //   244: aload #9
/*    */       //   246: checkcast kotlin/collections/IntIterator
/*    */       //   249: invokevirtual nextInt : ()I
/*    */       //   252: istore #10
/*    */       //   254: aload #7
/*    */       //   256: astore #13
/*    */       //   258: iconst_0
/*    */       //   259: istore #11
/*    */       //   261: aconst_null
/*    */       //   262: aload #13
/*    */       //   264: swap
/*    */       //   265: invokeinterface add : (Ljava/lang/Object;)Z
/*    */       //   270: pop
/*    */       //   271: goto -> 234
/*    */       //   274: aload #7
/*    */       //   276: checkcast java/util/List
/*    */       //   279: nop
/*    */       //   280: aload #12
/*    */       //   282: swap
/*    */       //   283: checkcast java/lang/Iterable
/*    */       //   286: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */       //   289: astore_3
/*    */       //   290: new kotlin/collections/ArrayDeque
/*    */       //   293: dup
/*    */       //   294: invokespecial <init> : ()V
/*    */       //   297: astore #4
/*    */       //   299: aload_3
/*    */       //   300: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   305: astore #5
/*    */       //   307: aload #5
/*    */       //   309: invokeinterface hasNext : ()Z
/*    */       //   314: ifeq -> 472
/*    */       //   317: aload #5
/*    */       //   319: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   324: astore #6
/*    */       //   326: nop
/*    */       //   327: aload #4
/*    */       //   329: invokevirtual size : ()I
/*    */       //   332: aload_0
/*    */       //   333: getfield $size : I
/*    */       //   336: if_icmpne -> 450
/*    */       //   339: aload_2
/*    */       //   340: new java/util/ArrayList
/*    */       //   343: dup
/*    */       //   344: aload #4
/*    */       //   346: checkcast java/util/Collection
/*    */       //   349: invokespecial <init> : (Ljava/util/Collection;)V
/*    */       //   352: aload_0
/*    */       //   353: checkcast kotlin/coroutines/Continuation
/*    */       //   356: aload_0
/*    */       //   357: aload_2
/*    */       //   358: putfield L$0 : Ljava/lang/Object;
/*    */       //   361: aload_0
/*    */       //   362: aload #4
/*    */       //   364: putfield L$1 : Ljava/lang/Object;
/*    */       //   367: aload_0
/*    */       //   368: aload #5
/*    */       //   370: putfield L$2 : Ljava/lang/Object;
/*    */       //   373: aload_0
/*    */       //   374: aload #6
/*    */       //   376: putfield L$3 : Ljava/lang/Object;
/*    */       //   379: aload_0
/*    */       //   380: iconst_1
/*    */       //   381: putfield label : I
/*    */       //   384: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   387: dup
/*    */       //   388: aload #14
/*    */       //   390: if_acmpne -> 433
/*    */       //   393: aload #14
/*    */       //   395: areturn
/*    */       //   396: aload_0
/*    */       //   397: getfield L$3 : Ljava/lang/Object;
/*    */       //   400: astore #6
/*    */       //   402: aload_0
/*    */       //   403: getfield L$2 : Ljava/lang/Object;
/*    */       //   406: checkcast java/util/Iterator
/*    */       //   409: astore #5
/*    */       //   411: aload_0
/*    */       //   412: getfield L$1 : Ljava/lang/Object;
/*    */       //   415: checkcast kotlin/collections/ArrayDeque
/*    */       //   418: astore #4
/*    */       //   420: aload_0
/*    */       //   421: getfield L$0 : Ljava/lang/Object;
/*    */       //   424: checkcast kotlin/sequences/SequenceScope
/*    */       //   427: astore_2
/*    */       //   428: aload_1
/*    */       //   429: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   432: aload_1
/*    */       //   433: pop
/*    */       //   434: aload #4
/*    */       //   436: invokevirtual removeFirst : ()Ljava/lang/Object;
/*    */       //   439: pop
/*    */       //   440: aload #4
/*    */       //   442: aload #6
/*    */       //   444: invokevirtual addLast : (Ljava/lang/Object;)V
/*    */       //   447: goto -> 307
/*    */       //   450: aload #4
/*    */       //   452: invokevirtual size : ()I
/*    */       //   455: aload_0
/*    */       //   456: getfield $size : I
/*    */       //   459: if_icmpge -> 307
/*    */       //   462: aload #4
/*    */       //   464: aload #6
/*    */       //   466: invokevirtual addLast : (Ljava/lang/Object;)V
/*    */       //   469: goto -> 307
/*    */       //   472: aload_2
/*    */       //   473: new java/util/ArrayList
/*    */       //   476: dup
/*    */       //   477: aload #4
/*    */       //   479: checkcast java/util/Collection
/*    */       //   482: invokespecial <init> : (Ljava/util/Collection;)V
/*    */       //   485: aload_0
/*    */       //   486: checkcast kotlin/coroutines/Continuation
/*    */       //   489: aload_0
/*    */       //   490: aconst_null
/*    */       //   491: putfield L$0 : Ljava/lang/Object;
/*    */       //   494: aload_0
/*    */       //   495: aconst_null
/*    */       //   496: putfield L$1 : Ljava/lang/Object;
/*    */       //   499: aload_0
/*    */       //   500: aconst_null
/*    */       //   501: putfield L$2 : Ljava/lang/Object;
/*    */       //   504: aload_0
/*    */       //   505: aconst_null
/*    */       //   506: putfield L$3 : Ljava/lang/Object;
/*    */       //   509: aload_0
/*    */       //   510: iconst_2
/*    */       //   511: putfield label : I
/*    */       //   514: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   517: dup
/*    */       //   518: aload #14
/*    */       //   520: if_acmpne -> 531
/*    */       //   523: aload #14
/*    */       //   525: areturn
/*    */       //   526: aload_1
/*    */       //   527: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   530: aload_1
/*    */       //   531: pop
/*    */       //   532: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   535: areturn
/*    */       //   536: new java/lang/IllegalStateException
/*    */       //   539: dup
/*    */       //   540: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   542: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   545: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #14	-> 3
/*    */       //   #15	-> 48
/*    */       //   #17	-> 64
/*    */       //   #84	-> 82
/*    */       //   #85	-> 108
/*    */       //   #86	-> 137
/*    */       //   #17	-> 144
/*    */       //   #86	-> 148
/*    */       //   #87	-> 157
/*    */       //   #84	-> 162
/*    */       //   #17	-> 166
/*    */       //   #84	-> 199
/*    */       //   #85	-> 225
/*    */       //   #86	-> 254
/*    */       //   #17	-> 261
/*    */       //   #86	-> 265
/*    */       //   #87	-> 274
/*    */       //   #84	-> 279
/*    */       //   #17	-> 286
/*    */       //   #19	-> 290
/*    */       //   #20	-> 299
/*    */       //   #21	-> 326
/*    */       //   #22	-> 327
/*    */       //   #23	-> 339
/*    */       //   #14	-> 393
/*    */       //   #25	-> 433
/*    */       //   #26	-> 440
/*    */       //   #28	-> 450
/*    */       //   #29	-> 462
/*    */       //   #34	-> 472
/*    */       //   #14	-> 523
/*    */       //   #35	-> 531
/*    */       //   #14	-> 536
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   48	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   64	81	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   145	18	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   163	99	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   262	18	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   280	116	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   428	89	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   290	17	3	toIterate	Ljava/util/List;
/*    */       //   79	26	4	$this$map$iv	Ljava/lang/Iterable;
/*    */       //   196	26	4	$this$map$iv	Ljava/lang/Iterable;
/*    */       //   299	97	4	window	Lkotlin/collections/ArrayDeque;
/*    */       //   420	97	4	window	Lkotlin/collections/ArrayDeque;
/*    */       //   105	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */       //   222	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */       //   326	70	6	value	Ljava/lang/Object;
/*    */       //   402	48	6	value	Ljava/lang/Object;
/*    */       //   450	19	6	value	Ljava/lang/Object;
/*    */       //   105	54	7	destination$iv$iv	Ljava/util/Collection;
/*    */       //   222	54	7	destination$iv$iv	Ljava/util/Collection;
/*    */       //   137	17	10	item$iv$iv	I
/*    */       //   254	17	10	item$iv$iv	I
/*    */       //   144	1	11	$i$a$-map-CollectionsKt$windowedPartial$1$toIterate$1	I
/*    */       //   108	51	8	$i$f$mapTo	I
/*    */       //   82	81	5	$i$f$map	I
/*    */       //   261	1	11	$i$a$-map-CollectionsKt$windowedPartial$1$toIterate$2	I
/*    */       //   225	51	8	$i$f$mapTo	I
/*    */       //   199	81	5	$i$f$map	I
/*    */       //   40	496	0	this	Lai/grazie/utils/CollectionsKt$windowedPartial$1;
/*    */       //   40	496	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CollectionsKt$windowedPartial$1> $completion) {
/*    */       CollectionsKt$windowedPartial$1 collectionsKt$windowedPartial$1 = new CollectionsKt$windowedPartial$1(this.$this_windowedPartial, this.$size, $completion);
/*    */       collectionsKt$windowedPartial$1.L$0 = value;
/*    */       return (Continuation<Unit>)collectionsKt$windowedPartial$1;
/*    */     }
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((CollectionsKt$windowedPartial$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */   @NotNull
/*    */   public static final <K, V> Map<K, V> mergeInplace(@NotNull Map<Object, Object> $this$mergeInplace, @NotNull Map other, @NotNull Function3 merger) {
/* 38 */     Intrinsics.checkNotNullParameter($this$mergeInplace, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); Intrinsics.checkNotNullParameter(merger, "merger"); for (Map.Entry entry : $this$mergeInplace.entrySet()) { Object key = entry.getKey(), value = entry.getValue();
/* 39 */       if (other.containsKey(key)) {
/* 40 */         Intrinsics.checkNotNull(other.get(key)); $this$mergeInplace.put(key, merger.invoke(key, value, other.get(key)));
/*    */       }  }
/*    */ 
/*    */     
/* 44 */     for (Map.Entry entry : other.entrySet()) { Object key = entry.getKey(), value = entry.getValue();
/* 45 */       if (!$this$mergeInplace.containsKey(key)) {
/* 46 */         $this$mergeInplace.put(key, value);
/*    */       } }
/*    */ 
/*    */     
/* 50 */     return (Map)$this$mergeInplace;
/*    */   }
/*    */   @NotNull
/*    */   public static final <K, V> Map<K, V> merge(@NotNull Map<? extends K, ? extends V> $this$merge, @NotNull Map<K, ? extends V> other, @NotNull Function3<? super K, ? super V, ? super V, ? extends V> merger) {
/* 54 */     Intrinsics.checkNotNullParameter($this$merge, "<this>"); Intrinsics.checkNotNullParameter(other, "other"); Intrinsics.checkNotNullParameter(merger, "merger"); return mergeInplace(new HashMap<>($this$merge), other, merger);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <T> Sequence<Pair<T, T>> decarteMult(@NotNull List<? extends T> $this$decarteMult, boolean excludeDiagonal) {
/* 61 */     Intrinsics.checkNotNullParameter($this$decarteMult, "<this>"); return SequencesKt.sequence(new CollectionsKt$decarteMult$1($this$decarteMult, excludeDiagonal, null));
/*    */   }
/*    */   @DebugMetadata(f = "Collections.kt", l = {67}, i = {0, 0, 0}, s = {"L$0", "I$0", "I$2"}, n = {"$this$sequence", "i", "j"}, m = "invokeSuspend", c = "ai.grazie.utils.CollectionsKt$decarteMult$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0020\0040\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "Lkotlin/Pair;"})
/*    */   static final class CollectionsKt$decarteMult$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Pair<? extends T, ? extends T>>, Continuation<? super Unit>, Object> {
/*    */     int I$0;
/*    */     int I$1;
/*    */     int I$2; int I$3; int label; CollectionsKt$decarteMult$1(List<T> $receiver, boolean $excludeDiagonal, Continuation $completion) { super(2, $completion); } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #7
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 227, 0 -> 32, 1 -> 174
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield L$0 : Ljava/lang/Object;
/*    */       //   40: checkcast kotlin/sequences/SequenceScope
/*    */       //   43: astore_2
/*    */       //   44: iconst_0
/*    */       //   45: istore_3
/*    */       //   46: aload_0
/*    */       //   47: getfield $this_decarteMult : Ljava/util/List;
/*    */       //   50: invokeinterface size : ()I
/*    */       //   55: istore #4
/*    */       //   57: iload_3
/*    */       //   58: iload #4
/*    */       //   60: if_icmpge -> 223
/*    */       //   63: iconst_0
/*    */       //   64: istore #5
/*    */       //   66: aload_0
/*    */       //   67: getfield $this_decarteMult : Ljava/util/List;
/*    */       //   70: invokeinterface size : ()I
/*    */       //   75: istore #6
/*    */       //   77: iload #5
/*    */       //   79: iload #6
/*    */       //   81: if_icmpge -> 217
/*    */       //   84: aload_0
/*    */       //   85: getfield $excludeDiagonal : Z
/*    */       //   88: ifeq -> 100
/*    */       //   91: iload_3
/*    */       //   92: iload #5
/*    */       //   94: if_icmpne -> 100
/*    */       //   97: goto -> 211
/*    */       //   100: aload_2
/*    */       //   101: aload_0
/*    */       //   102: getfield $this_decarteMult : Ljava/util/List;
/*    */       //   105: iload_3
/*    */       //   106: invokeinterface get : (I)Ljava/lang/Object;
/*    */       //   111: aload_0
/*    */       //   112: getfield $this_decarteMult : Ljava/util/List;
/*    */       //   115: iload #5
/*    */       //   117: invokeinterface get : (I)Ljava/lang/Object;
/*    */       //   122: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*    */       //   125: aload_0
/*    */       //   126: checkcast kotlin/coroutines/Continuation
/*    */       //   129: aload_0
/*    */       //   130: aload_2
/*    */       //   131: putfield L$0 : Ljava/lang/Object;
/*    */       //   134: aload_0
/*    */       //   135: iload_3
/*    */       //   136: putfield I$0 : I
/*    */       //   139: aload_0
/*    */       //   140: iload #4
/*    */       //   142: putfield I$1 : I
/*    */       //   145: aload_0
/*    */       //   146: iload #5
/*    */       //   148: putfield I$2 : I
/*    */       //   151: aload_0
/*    */       //   152: iload #6
/*    */       //   154: putfield I$3 : I
/*    */       //   157: aload_0
/*    */       //   158: iconst_1
/*    */       //   159: putfield label : I
/*    */       //   162: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   165: dup
/*    */       //   166: aload #7
/*    */       //   168: if_acmpne -> 210
/*    */       //   171: aload #7
/*    */       //   173: areturn
/*    */       //   174: aload_0
/*    */       //   175: getfield I$3 : I
/*    */       //   178: istore #6
/*    */       //   180: aload_0
/*    */       //   181: getfield I$2 : I
/*    */       //   184: istore #5
/*    */       //   186: aload_0
/*    */       //   187: getfield I$1 : I
/*    */       //   190: istore #4
/*    */       //   192: aload_0
/*    */       //   193: getfield I$0 : I
/*    */       //   196: istore_3
/*    */       //   197: aload_0
/*    */       //   198: getfield L$0 : Ljava/lang/Object;
/*    */       //   201: checkcast kotlin/sequences/SequenceScope
/*    */       //   204: astore_2
/*    */       //   205: aload_1
/*    */       //   206: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   209: aload_1
/*    */       //   210: pop
/*    */       //   211: iinc #5, 1
/*    */       //   214: goto -> 77
/*    */       //   217: iinc #3, 1
/*    */       //   220: goto -> 57
/*    */       //   223: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   226: areturn
/*    */       //   227: new java/lang/IllegalStateException
/*    */       //   230: dup
/*    */       //   231: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   233: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   236: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #61	-> 3
/*    */       //   #62	-> 44
/*    */       //   #63	-> 63
/*    */       //   #64	-> 84
/*    */       //   #65	-> 97
/*    */       //   #67	-> 100
/*    */       //   #61	-> 171
/*    */       //   #63	-> 210
/*    */       //   #62	-> 217
/*    */       //   #70	-> 223
/*    */       //   #61	-> 227
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   44	19	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   63	21	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   84	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   100	74	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   205	22	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*    */       //   46	17	3	i	I
/*    */       //   63	21	3	i	I
/*    */       //   84	16	3	i	I
/*    */       //   100	74	3	i	I
/*    */       //   197	26	3	i	I
/*    */       //   66	18	5	j	I
/*    */       //   84	16	5	j	I
/*    */       //   100	74	5	j	I
/*    */       //   186	31	5	j	I
/*    */       //   36	191	0	this	Lai/grazie/utils/CollectionsKt$decarteMult$1;
/*    */       //   36	191	1	$result	Ljava/lang/Object; } @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super CollectionsKt$decarteMult$1> $completion) { CollectionsKt$decarteMult$1 collectionsKt$decarteMult$1 = new CollectionsKt$decarteMult$1(this.$this_decarteMult, this.$excludeDiagonal, $completion);
/*    */       collectionsKt$decarteMult$1.L$0 = value;
/*    */       return (Continuation<Unit>)collectionsKt$decarteMult$1; } @Nullable
/*    */     public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) { return ((CollectionsKt$decarteMult$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @NotNull
/* 73 */   public static final <T> List<T> suffix(@NotNull List<T> $this$suffix, int fromIndex) { Intrinsics.checkNotNullParameter($this$suffix, "<this>"); return $this$suffix.subList(fromIndex, $this$suffix.size()); }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final <K> Map<K, Integer> toSmallMemoryFootprintIntValueMap(@NotNull Map<?, ? extends Integer> $this$toSmallMemoryFootprintIntValueMap) {
/* 79 */     Intrinsics.checkNotNullParameter($this$toSmallMemoryFootprintIntValueMap, "<this>"); Map<?, Integer> result = CollectionFactory.INSTANCE.smallMemoryFootprintIntValueMap($this$toSmallMemoryFootprintIntValueMap.size());
/* 80 */     result.putAll($this$toSmallMemoryFootprintIntValueMap);
/* 81 */     return (Map)result;
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/CollectionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */