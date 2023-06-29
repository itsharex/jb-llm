/*    */ package com.intellij.ml.llm.core.models.mock;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\030\0002\b\022\004\022\0020\0020\001B\005¢\006\002\020\003J\b\020\004\032\0020\005H\026¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/core/models/mock/MockNameSuggestionRequest;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "", "()V", "sendSync", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "intellij.ml.llm"})
/*    */ public final class MockNameSuggestionRequest
/*    */   extends LLMBaseRequest<String>
/*    */ {
/*    */   public MockNameSuggestionRequest() {
/* 37 */     super(""); } @NotNull
/*    */   public LLMBaseResponse sendSync() {
/* 39 */     return new MockResponse("1.betterName");
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/mock/MockNameSuggestionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */