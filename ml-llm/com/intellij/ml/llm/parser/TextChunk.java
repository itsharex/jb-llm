/*   */ package com.intellij.ml.llm.parser;
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\b\026\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/parser/TextChunk;", "Lcom/intellij/ml/llm/parser/Chunk;", "rawText", "", "(Ljava/lang/String;)V", "getRawText", "()Ljava/lang/String;", "intellij.ml.llm"})
/* 3 */ public class TextChunk implements Chunk { public TextChunk(@NotNull String rawText) { this.rawText = rawText; } @NotNull private final String rawText; @NotNull public String getRawText() { return this.rawText; }
/*   */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/parser/TextChunk.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */