/*   */ package com.intellij.ml.llm.core.grazieAPI;
/*   */ 
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthSuccessResult;", "Lcom/intellij/ml/llm/core/grazieAPI/GrazieAuthToken;", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "intellij.ml.llm"})
/*   */ public final class GrazieAuthSuccessResult implements GrazieAuthToken {
/* 7 */   public GrazieAuthSuccessResult(@NotNull String token) { this.token = token; } @NotNull private final String token; @NotNull public String getToken() { return this.token; }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthSuccessResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */