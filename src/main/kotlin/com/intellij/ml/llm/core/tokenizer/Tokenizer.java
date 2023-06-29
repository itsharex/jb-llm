/*    */ package com.intellij.ml.llm.core.tokenizer;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\005\032\0020\0062\006\020\007\032\0020\bJ\024\020\t\032\b\022\004\022\0020\0060\n2\006\020\007\032\0020\bJ\026\020\013\032\0020\b2\006\020\007\032\0020\b2\006\020\f\032\0020\006R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/tokenizer/Tokenizer;", "", "encoder", "Lai/grazie/nlp/encoder/TiktokenEncoder;", "(Lai/grazie/nlp/encoder/TiktokenEncoder;)V", "count", "", "text", "", "encodeAsIds", "", "trim", "limit", "intellij.ml.llm"})
/*    */ public final class Tokenizer {
/*  5 */   public Tokenizer(@NotNull TiktokenEncoder encoder) { this.encoder = encoder; } @NotNull
/*    */   private final TiktokenEncoder encoder; @NotNull
/*  7 */   public final List<Integer> encodeAsIds(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return this.encoder.encodeAsIds(text); }
/*    */   
/*    */   public final int count(@NotNull String text) {
/* 10 */     Intrinsics.checkNotNullParameter(text, "text"); return encodeAsIds(text).size();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String trim(@NotNull String text, int limit) {
/* 16 */     Intrinsics.checkNotNullParameter(text, "text"); int sum = 0;
/* 17 */     int offset = 0;
/* 18 */     for (String line : StringsKt.lines(text)) {
/* 19 */       int tokens = count(line) + 1;
/* 20 */       if (sum + tokens <= limit) {
/* 21 */         offset += line.length() + 1;
/* 22 */         sum += tokens;
/*    */       } 
/*    */     } 
/*    */     
/* 26 */     Intrinsics.checkNotNullExpressionValue(text.substring(0, Math.min(text.length(), offset)), "this as java.lang.String…ing(startIndex, endIndex)"); return text.substring(0, Math.min(text.length(), offset));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/tokenizer/Tokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */