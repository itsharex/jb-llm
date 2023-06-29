/*    */ package com.intellij.ml.llm.core.models.openai;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\002¢\006\002\020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAIChatCompletionRequest;", "Lcom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest;", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "body", "(Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;)V", "intellij.ml.llm"})
/*    */ public final class OpenAIChatCompletionRequest
/*    */   extends OpenAIBaseRequest<OpenAiChatRequestBody>
/*    */ {
/*    */   public OpenAIChatCompletionRequest(@NotNull OpenAiChatRequestBody body) {
/* 57 */     super("chat/completions", body);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIChatCompletionRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */