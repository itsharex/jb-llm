/*    */ package ai.grazie.nlp.utils;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\020\016\n\002\b\004\030\0002\0020\001:\001\fB\r\022\006\020\002\032\0020\003¢\006\002\020\004J \020\007\032\016\022\n\022\b\022\004\022\0020\t0\b0\b2\f\020\n\032\b\022\004\022\0020\t0\bJ\022\020\013\032\b\022\004\022\0020\t0\b*\0020\tH\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/nlp/utils/TextBatcherByLimits;", "", "limits", "Lai/grazie/nlp/utils/TextBatcherByLimits$Limits;", "(Lai/grazie/nlp/utils/TextBatcherByLimits$Limits;)V", "getLimits", "()Lai/grazie/nlp/utils/TextBatcherByLimits$Limits;", "batch", "", "", "sentences", "words", "Limits", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nBatching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Batching.kt\nai/grazie/nlp/utils/TextBatcherByLimits\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1#2:44\n766#3:45\n857#3,2:46\n*S KotlinDebug\n*F\n+ 1 Batching.kt\nai/grazie/nlp/utils/TextBatcherByLimits\n*L\n41#1:45\n41#1:46,2\n*E\n"})
/*    */ public final class TextBatcherByLimits { @NotNull
/*  4 */   private final Limits limits; public TextBatcherByLimits(@NotNull Limits limits) { this.limits = limits; } @NotNull public final Limits getLimits() { return this.limits; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J'\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\t\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\b¨\006\025"}, d2 = {"Lai/grazie/nlp/utils/TextBatcherByLimits$Limits;", "", "words", "", "chars", "sentences", "(III)V", "getChars", "()I", "getSentences", "getWords", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "nlp-common"})
/*  5 */   public static final class Limits { private final int words; private final int chars; private final int sentences; public Limits(int words, int chars, int sentences) { this.words = words; this.chars = chars; this.sentences = sentences; } public final int getWords() { return this.words; } public final int getChars() { return this.chars; } public final int component1() { return this.words; } public final int component2() { return this.chars; } public final int component3() { return this.sentences; } @NotNull public final Limits copy(int words, int chars, int sentences) { return new Limits(words, chars, sentences); } public final int getSentences() { return this.sentences; }
/*    */     @NotNull public String toString() { return "Limits(words=" + this.words + ", chars=" + this.chars + ", sentences=" + this.sentences + ")"; }
/*    */     public int hashCode() { result = Integer.hashCode(this.words); result = result * 31 + Integer.hashCode(this.chars); return result * 31 + Integer.hashCode(this.sentences); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Limits)) return false;  Limits limits = (Limits)other; return (this.words != limits.words) ? false : ((this.chars != limits.chars) ? false : (!(this.sentences != limits.sentences))); } }
/*  8 */    @NotNull public final List<List<String>> batch(@NotNull List sentences) { Intrinsics.checkNotNullParameter(sentences, "sentences"); ArrayList<ArrayList<String>> batches = new ArrayList();
/*    */     
/* 10 */     ArrayList<String> batch = new ArrayList();
/* 11 */     int limitWords = 0;
/* 12 */     int limitChars = 0;
/* 13 */     int limitSentences = 0;
/*    */     
/* 15 */     for (String sentence : sentences) {
/* 16 */       batch.add(sentence); limitSentences++;
/*    */ 
/*    */       
/* 19 */       limitChars += sentence.length();
/* 20 */       limitWords += words(sentence).size();
/*    */       
/* 22 */       if (limitSentences >= this.limits.getSentences() || limitChars >= this.limits.getChars() || limitWords >= this.limits.getWords()) {
/* 23 */         batches.add(batch);
/*    */         
/* 25 */         batch = new ArrayList<>();
/* 26 */         limitWords = 0;
/* 27 */         limitChars = 0;
/* 28 */         limitSentences = 0;
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     if (!batch.isEmpty()) {
/* 33 */       batches.add(batch);
/*    */     }
/*    */     
/* 36 */     ArrayList<ArrayList<String>> arrayList1 = batches; int i = 0; for (List<String> list : arrayList1) { List list1 = list;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 44 */       int j = i, $i$a$-sumOfInt-TextBatcherByLimits$batch$1 = 0; int k = list1.size(); i = j + k; }  if (!((i == sentences.size()) ? 1 : 0)) { int $i$a$-require-TextBatcherByLimits$batch$2 = 0; String str = "Batching for correction service generated batches sum of which is not equal to sentences"; throw new IllegalArgumentException(str.toString()); }
/* 45 */      return (List)batches; } private final List<String> words(String $this$words) { String[] arrayOfString = new String[1]; arrayOfString[0] = " "; Iterable $this$filter$iv = StringsKt.split$default($this$words, arrayOfString, false, 0, 6, null); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 46 */     for (Object element$iv$iv : iterable1) { String it = (String)element$iv$iv; int $i$a$-filter-TextBatcherByLimits$words$1 = 0; if (!StringsKt.isBlank(it)) destination$iv$iv.add(element$iv$iv);  }
/* 47 */      return (List)destination$iv$iv; }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/TextBatcherByLimits.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */