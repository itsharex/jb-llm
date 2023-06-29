/*   */ package com.intellij.ml.llm.core.grazieAPI;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\004\030\0002\0020\001B\017\022\b\020\002\032\004\030\0010\003¢\006\002\020\004R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthFailureResult;", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthResult;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "intellij.ml.llm"})
/*   */ public final class GrazieAuthFailureResult implements GrazieAuthResult {
/*   */   @Nullable
/*   */   private final Throwable exception;
/*   */   
/* 9 */   public GrazieAuthFailureResult(@Nullable Throwable exception) { this.exception = exception; } @Nullable public final Throwable getException() { return this.exception; }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthFailureResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */