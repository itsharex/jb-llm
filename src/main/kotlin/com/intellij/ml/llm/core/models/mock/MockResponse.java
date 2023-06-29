/*   */ package com.intellij.ml.llm.core.models.mock;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\005\032\b\022\004\022\0020\0070\006H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/models/mock/MockResponse;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "response", "", "(Ljava/lang/String;)V", "getSuggestions", "", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*   */ public final class MockResponse implements LLMBaseResponse {
/* 6 */   public MockResponse(@NotNull String response) { this.response = response; } @NotNull private final String response; @NotNull
/* 7 */   public List<LLMResponseChoice> getSuggestions() { return CollectionsKt.listOf(new LLMResponseChoice(this.response)); }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/mock/MockResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */