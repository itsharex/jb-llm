/*   */ package com.intellij.ml.llm.core.models.grazie;
/*   */ 
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020 \n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\007\032\b\022\004\022\0020\t0\bH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/models/grazie/GrazieResponse;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "response", "", "(Ljava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "getSuggestions", "", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*   */ public final class GrazieResponse implements LLMBaseResponse {
/* 7 */   public GrazieResponse(@NotNull String response) { this.response = response; } @NotNull private final String response; @NotNull public final String getResponse() { return this.response; } @NotNull
/*   */   public List<LLMResponseChoice> getSuggestions() {
/* 9 */     return CollectionsKt.listOf(new LLMResponseChoice(this.response));
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */