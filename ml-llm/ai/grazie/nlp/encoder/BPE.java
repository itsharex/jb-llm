/*     */ package ai.grazie.nlp.encoder;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Pair;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020\b\n\000\n\002\020\"\n\002\b\005\030\0002\0020\001B\037\022\030\020\002\032\024\022\020\022\016\022\004\022\0020\005\022\004\022\0020\0050\0040\003¢\006\002\020\006J(\020\f\032\024\022\020\022\016\022\004\022\0020\005\022\004\022\0020\0050\0040\r2\f\020\016\032\b\022\004\022\0020\0050\003H\002J\020\020\017\032\0020\0052\006\020\020\032\0020\005H\002J\016\020\021\032\0020\0052\006\020\020\032\0020\005R\032\020\007\032\016\022\004\022\0020\005\022\004\022\0020\0050\bX\004¢\006\002\n\000R&\020\t\032\032\022\020\022\016\022\004\022\0020\005\022\004\022\0020\0050\004\022\004\022\0020\0130\nX\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/nlp/encoder/BPE;", "", "bpeMerges", "", "Lkotlin/Pair;", "", "(Ljava/util/List;)V", "bpeCache", "Lai/grazie/utils/cache/Cache;", "bpeRanks", "", "", "getPairs", "", "bpeWord", "runBpeTokenization", "word", "tokenize", "nlp-encoder-engine"})
/*     */ @SourceDebugExtension({"SMAP\nBPE.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BPE.kt\nai/grazie/nlp/encoder/BPE\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1559#2:97\n1590#2,4:98\n1549#2:102\n1620#2,3:103\n2333#2,14:106\n*S KotlinDebug\n*F\n+ 1 BPE.kt\nai/grazie/nlp/encoder/BPE\n*L\n15#1:97\n15#1:98,4\n32#1:102\n32#1:103,3\n40#1:106,14\n*E\n"})
/*     */ public final class BPE {
/*     */   @NotNull
/*     */   private final Map<Pair<String, String>, Integer> bpeRanks;
/*     */   
/*  15 */   public BPE(@NotNull List bpeMerges) { List list1 = bpeMerges; BPE bPE = this; int $i$f$mapIndexed = 0;
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
/*  97 */     List list2 = list1; Collection<Pair> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapIndexedTo = 0;
/*  98 */     int index$iv$iv = 0;
/*  99 */     for (Object item$iv$iv : list2) {
/* 100 */       int i = index$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  Pair pair = (Pair)item$iv$iv; int j = i; Collection<Pair> collection = destination$iv$iv; int $i$a$-mapIndexed-BPE$bpeRanks$1 = 0; collection.add(TuplesKt.to(pair, Integer.valueOf(j)));
/* 101 */     }  bPE.bpeRanks = MapsKt.toMap(destination$iv$iv); this.bpeCache = Caching.INSTANCE.default(5000); }
/* 102 */   @NotNull private final Cache<String, String> bpeCache; @NotNull public final String tokenize(@NotNull String word) { Intrinsics.checkNotNullParameter(word, "word"); String cached = (String)this.bpeCache.get(word); if (cached != null) return cached;  String bpeWord = runBpeTokenization(word); this.bpeCache.put(word, bpeWord); return bpeWord; } private final String runBpeTokenization(String word) { Iterable $this$map$iv = StringsKt.toList(word); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 103 */     for (Object item$iv$iv : iterable1) {
/* 104 */       char c = ((Character)item$iv$iv).charValue(); Collection<String> collection = destination$iv$iv; int $i$a$-map-BPE$runBpeTokenization$bpeWord$1 = 0; collection.add(String.valueOf(c));
/* 105 */     }  List<String> bpeWord = (List)destination$iv$iv; Set<Pair<String, String>> pairs = getPairs(bpeWord); if (pairs.isEmpty())
/* 106 */       return word;  while (true) { Iterable<Pair<String, String>> $this$minByOrNull$iv = pairs; int $i$f$minByOrNull = 0; Iterator<Pair<String, String>> iterator$iv = $this$minByOrNull$iv.iterator();
/* 107 */       if (!iterator$iv.hasNext());
/* 108 */       Object<String, String> minElem$iv = (Object<String, String>)iterator$iv.next();
/* 109 */       if (!iterator$iv.hasNext());
/* 110 */       Pair it = (Pair)minElem$iv; int $i$a$-minByOrNull-BPE$runBpeTokenization$bigram$1 = 0, minValue$iv = ((Number)this.bpeRanks.getOrDefault(it, Integer.valueOf(2147483647))).intValue();
/*     */       while (true) {
/* 112 */         Object<String, String> e$iv = (Object<String, String>)iterator$iv.next();
/* 113 */         Pair pair = (Pair)e$iv; int i = 0, v$iv = ((Number)this.bpeRanks.getOrDefault(pair, Integer.valueOf(2147483647))).intValue();
/* 114 */         if (minValue$iv > v$iv) {
/* 115 */           minElem$iv = e$iv;
/* 116 */           minValue$iv = v$iv;
/*     */         } 
/* 118 */         if (!iterator$iv.hasNext()) {
/* 119 */           Intrinsics.checkNotNull(minElem$iv); Pair bigram = (Pair)minElem$iv;
/*     */         } 
/*     */       } 
/*     */       pairs = getPairs(bpeWord); }
/*     */     
/*     */     return CollectionsKt.joinToString$default(bpeWord, " ", null, null, 0, null, null, 62, null); }
/*     */ 
/*     */   
/*     */   private final Set<Pair<String, String>> getPairs(List<String> bpeWord) {
/*     */     if (bpeWord.isEmpty())
/*     */       return SetsKt.emptySet(); 
/*     */     HashSet<Pair> pairs = new HashSet();
/*     */     String prevSymbol = bpeWord.get(0);
/*     */     for (int idx = 1, i = bpeWord.size(); idx < i; idx++) {
/*     */       pairs.add(TuplesKt.to(prevSymbol, bpeWord.get(idx)));
/*     */       prevSymbol = bpeWord.get(idx);
/*     */     } 
/*     */     return (Set)pairs;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/BPE.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */