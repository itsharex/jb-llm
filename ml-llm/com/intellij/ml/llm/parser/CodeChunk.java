/*   */ package com.intellij.ml.llm.parser;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/parser/CodeChunk;", "Lcom/intellij/ml/llm/parser/TextChunk;", "rawText", "", "languageName", "(Ljava/lang/String;Ljava/lang/String;)V", "getLanguageName", "()Ljava/lang/String;", "getRawText", "intellij.ml.llm"})
/*   */ public final class CodeChunk extends TextChunk { @NotNull
/* 3 */   private final String rawText; public CodeChunk(@NotNull String rawText, @NotNull String languageName) { super(rawText); this.rawText = rawText; this.languageName = languageName; } @NotNull private final String languageName; @NotNull public String getRawText() { return this.rawText; } @NotNull public final String getLanguageName() { return this.languageName; }
/*   */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/parser/CodeChunk.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */