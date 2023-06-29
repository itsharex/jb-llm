/*    */ package com.intellij.ml.llm.core.models.requestResponse;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.openai.OpenAiChatRequestBody;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\006\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\bf\030\0002\0020\001J\001\020\002\032\006\022\002\b\0030\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\f2\n\b\002\020\016\032\004\030\0010\f2\n\b\002\020\017\032\004\030\0010\f2\n\b\002\020\020\032\004\030\0010\n2\n\b\002\020\021\032\004\030\0010\n2\b\b\002\020\022\032\0020\n2\n\b\002\020\023\032\004\030\0010\024H&¢\006\002\020\025J(\020\026\032\006\022\002\b\0030\0032\006\020\004\032\0020\0052\006\020\027\032\0020\0302\n\b\002\020\023\032\004\030\0010\024H&J\001\020\031\032\006\022\002\b\0030\0032\006\020\004\032\0020\0052\006\020\032\032\0020\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\f2\n\b\002\020\016\032\004\030\0010\f2\n\b\002\020\017\032\004\030\0010\f2\n\b\002\020\020\032\004\030\0010\n2\n\b\002\020\021\032\004\030\0010\n2\b\b\002\020\022\032\0020\n2\n\b\002\020\023\032\004\030\0010\024H\026¢\006\002\020\025J4\020\033\032\006\022\002\b\0030\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\034\032\0020\0072\006\020\013\032\0020\f2\006\020\017\032\0020\fH&J>\020\035\032\006\022\002\b\0030\0032\006\020\004\032\0020\0052\006\020\036\032\0020\0072\006\020\037\032\0020\0072\006\020 \032\0020\0072\006\020!\032\0020\0072\b\020\"\032\004\030\0010\007H&ø\001\000\002\006\n\004\b!0\001¨\006#À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;", "", "createChatCompletionRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "project", "Lcom/intellij/openapi/project/Project;", "input", "", "suffix", "maxTokens", "", "temperature", "", "presencePenalty", "frequencyPenalty", "topP", "numberOfSuggestions", "logProbs", "numberOfAttempts", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "createChatRequest", "body", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "createCompletionRequest", "prompt", "createEditRequest", "instruction", "createNameSuggestionRequest", "oldName", "contextPrompt", "objectType", "objectToRename", "prefix", "intellij.ml.llm"})
/*    */ public interface LLMRequestProvider
/*    */ {
/*    */   @NotNull
/*    */   default LLMBaseRequest<?> createCompletionRequest(@NotNull Project project, @NotNull String prompt, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/* 54 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(prompt, "prompt"); Intrinsics.checkNotNullParameter(suffix, "suffix"); return createChatCompletionRequest(
/* 55 */         project, prompt, suffix, maxTokens, temperature, presencePenalty, 
/* 56 */         frequencyPenalty, topP, numberOfSuggestions, logProbs, 
/* 57 */         numberOfAttempts, consumer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   LLMBaseRequest<?> createEditRequest(@NotNull Project paramProject, @NotNull String paramString1, @NotNull String paramString2, double paramDouble1, double paramDouble2);
/*    */   
/*    */   @NotNull
/*    */   LLMBaseRequest<?> createChatRequest(@NotNull Project paramProject, @NotNull OpenAiChatRequestBody paramOpenAiChatRequestBody, @Nullable LLMStreamingRequestConsumer paramLLMStreamingRequestConsumer);
/*    */   
/*    */   @NotNull
/*    */   LLMBaseRequest<?> createChatCompletionRequest(@NotNull Project paramProject, @NotNull String paramString1, @NotNull String paramString2, @Nullable Integer paramInteger1, @Nullable Double paramDouble1, @Nullable Double paramDouble2, @Nullable Double paramDouble3, @Nullable Double paramDouble4, @Nullable Integer paramInteger2, @Nullable Integer paramInteger3, int paramInt, @Nullable LLMStreamingRequestConsumer paramLLMStreamingRequestConsumer);
/*    */   
/*    */   @NotNull
/*    */   LLMBaseRequest<?> createNameSuggestionRequest(@NotNull Project paramProject, @NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4, @Nullable String paramString5);
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */