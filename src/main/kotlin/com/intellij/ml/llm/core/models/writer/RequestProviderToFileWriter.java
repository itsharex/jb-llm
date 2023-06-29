/*    */ package com.intellij.ml.llm.core.models.writer;
/*    */ import com.intellij.ml.llm.core.models.openai.OpenAiChatRequestBody;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.NotImplementedError;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\006\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\030\0002\0020\001B\005¢\006\002\020\002J\001\020\003\032\006\022\002\b\0030\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\b2\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\r2\b\020\017\032\004\030\0010\r2\b\020\020\032\004\030\0010\r2\b\020\021\032\004\030\0010\0132\b\020\022\032\004\030\0010\0132\006\020\023\032\0020\0132\b\020\024\032\004\030\0010\025H\026¢\006\002\020\026J&\020\027\032\006\022\002\b\0030\0042\006\020\005\032\0020\0062\006\020\030\032\0020\0312\b\020\024\032\004\030\0010\025H\026J\001\020\032\032\006\022\002\b\0030\0042\006\020\005\032\0020\0062\006\020\033\032\0020\b2\006\020\t\032\0020\b2\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\r2\b\020\017\032\004\030\0010\r2\b\020\020\032\004\030\0010\r2\b\020\021\032\004\030\0010\0132\b\020\022\032\004\030\0010\0132\006\020\023\032\0020\0132\b\020\024\032\004\030\0010\025H\026¢\006\002\020\026J4\020\034\032\006\022\002\b\0030\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\035\032\0020\b2\006\020\f\032\0020\r2\006\020\020\032\0020\rH\026J>\020\036\032\006\022\002\b\0030\0042\006\020\005\032\0020\0062\006\020\037\032\0020\b2\006\020 \032\0020\b2\006\020!\032\0020\b2\006\020\"\032\0020\b2\b\020#\032\004\030\0010\bH\026¨\006$"}, d2 = {"Lcom/intellij/ml/llm/core/models/writer/RequestProviderToFileWriter;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;", "()V", "createChatCompletionRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "project", "Lcom/intellij/openapi/project/Project;", "input", "", "suffix", "maxTokens", "", "temperature", "", "presencePenalty", "frequencyPenalty", "topP", "numberOfSuggestions", "logProbs", "numberOfAttempts", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "createChatRequest", "body", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "createCompletionRequest", "prompt", "createEditRequest", "instruction", "createNameSuggestionRequest", "oldName", "contextPrompt", "objectType", "objectToRename", "prefix", "intellij.ml.llm"})
/*    */ public final class RequestProviderToFileWriter implements LLMRequestProvider {
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createEditRequest(@NotNull Project project, @NotNull String input, @NotNull String instruction, double temperature, double topP) {
/* 15 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(instruction, "instruction"); String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*    */   }
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createChatRequest(@NotNull Project project, @NotNull OpenAiChatRequestBody body, @Nullable LLMStreamingRequestConsumer consumer) {
/* 19 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(body, "body"); String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*    */   }
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
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createChatCompletionRequest(@NotNull Project project, @NotNull String input, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/* 34 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(suffix, "suffix"); String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*    */   }
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
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createCompletionRequest(@NotNull Project project, @NotNull String prompt, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/* 49 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(prompt, "prompt"); Intrinsics.checkNotNullParameter(suffix, "suffix"); String str = "Not yet implemented"; throw new NotImplementedError("An operation is not implemented: " + str);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createNameSuggestionRequest(@NotNull Project project, @NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) {
/* 58 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(oldName, "oldName"); Intrinsics.checkNotNullParameter(contextPrompt, "contextPrompt"); Intrinsics.checkNotNullParameter(objectType, "objectType"); Intrinsics.checkNotNullParameter(objectToRename, "objectToRename"); return new NameSuggestionWriter(project, oldName, contextPrompt, objectType, objectToRename, prefix);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/writer/RequestProviderToFileWriter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */