/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\b\022\004\022\0020\0020\001B\025\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005¢\006\002\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAIStreamingCompletionsRequest;", "Lcom/intellij/ml/llm/core/models/openai/OpenAIStreamingRequest;", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "body", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)V", "intellij.ml.llm"})
/*     */ public final class OpenAIStreamingCompletionsRequest
/*     */   extends OpenAIStreamingRequest<OpenAiChatRequestBody>
/*     */ {
/*     */   public OpenAIStreamingCompletionsRequest(@NotNull OpenAiChatRequestBody body, @NotNull LLMStreamingRequestConsumer consumer) {
/* 120 */     super("completions", body, consumer);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIStreamingCompletionsRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */