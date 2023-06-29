/*   */ package ai.grazie.nlp.utils;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J'\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\t\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\b¨\006\025"}, d2 = {"Lai/grazie/nlp/utils/TextBatcherByLimits$Limits;", "", "words", "", "chars", "sentences", "(III)V", "getChars", "()I", "getSentences", "getWords", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "nlp-common"})
/*   */ public final class Limits { private final int words;
/*   */   
/* 5 */   public Limits(int words, int chars, int sentences) { this.words = words; this.chars = chars; this.sentences = sentences; } private final int chars; private final int sentences; public final int getWords() { return this.words; } public final int getChars() { return this.chars; } public final int getSentences() { return this.sentences; }
/*   */ 
/*   */   
/*   */   public final int component1() {
/*   */     return this.words;
/*   */   }
/*   */   
/*   */   public final int component2() {
/*   */     return this.chars;
/*   */   }
/*   */   
/*   */   public final int component3() {
/*   */     return this.sentences;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Limits copy(int words, int chars, int sentences) {
/*   */     return new Limits(words, chars, sentences);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "Limits(words=" + this.words + ", chars=" + this.chars + ", sentences=" + this.sentences + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = Integer.hashCode(this.words);
/*   */     result = result * 31 + Integer.hashCode(this.chars);
/*   */     return result * 31 + Integer.hashCode(this.sentences);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof Limits))
/*   */       return false; 
/*   */     Limits limits = (Limits)other;
/*   */     return (this.words != limits.words) ? false : ((this.chars != limits.chars) ? false : (!(this.sentences != limits.sentences)));
/*   */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/TextBatcherByLimits$Limits.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */