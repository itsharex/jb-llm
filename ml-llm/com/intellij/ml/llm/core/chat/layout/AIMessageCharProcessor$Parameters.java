/*    */ package com.intellij.ml.llm.core.chat.layout;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\f\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters;", "", "char", "", "charIndex", "", "fullMessage", "", "(CILjava/lang/String;)V", "getChar", "()C", "getCharIndex", "()I", "getFullMessage", "()Ljava/lang/String;", "intellij.ml.llm"})
/*    */ public final class Parameters
/*    */ {
/*    */   private final char char;
/*    */   private final int charIndex;
/*    */   @NotNull
/*    */   private final String fullMessage;
/*    */   
/*    */   public Parameters(char char, int charIndex, @NotNull String fullMessage) {
/* 24 */     this.char = char; this.charIndex = charIndex; this.fullMessage = fullMessage; } public final char getChar() { return this.char; } public final int getCharIndex() { return this.charIndex; } @NotNull public final String getFullMessage() { return this.fullMessage; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$Parameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */