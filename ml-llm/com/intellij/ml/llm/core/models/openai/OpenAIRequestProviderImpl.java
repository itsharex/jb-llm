/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.ChatRecipesKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMRequestProvider;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\006\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\020\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003¢\006\002\020\006J\001\020\007\032\006\022\002\b\0030\b2\006\020\t\032\0020\n2\006\020\013\032\0020\0032\006\020\f\032\0020\0032\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\0202\b\020\022\032\004\030\0010\0202\b\020\023\032\004\030\0010\0202\b\020\024\032\004\030\0010\0162\b\020\025\032\004\030\0010\0162\006\020\026\032\0020\0162\b\020\027\032\004\030\0010\030H\026¢\006\002\020\031J(\020\032\032\b\022\004\022\0020\0340\0332\006\020\t\032\0020\n2\006\020\035\032\0020\0342\b\020\027\032\004\030\0010\030H\026J\001\020\036\032\006\022\002\b\0030\b2\006\020\t\032\0020\n2\006\020\037\032\0020\0032\006\020\f\032\0020\0032\b\020\r\032\004\030\0010\0162\b\020\017\032\004\030\0010\0202\b\020\021\032\004\030\0010\0202\b\020\022\032\004\030\0010\0202\b\020\023\032\004\030\0010\0202\b\020\024\032\004\030\0010\0162\b\020\025\032\004\030\0010\0162\006\020\026\032\0020\0162\b\020\027\032\004\030\0010\030H\026¢\006\002\020\031J4\020 \032\006\022\002\b\0030\b2\006\020\t\032\0020\n2\006\020\013\032\0020\0032\006\020!\032\0020\0032\006\020\017\032\0020\0202\006\020\023\032\0020\020H\026J>\020\"\032\006\022\002\b\0030\b2\006\020\t\032\0020\n2\006\020#\032\0020\0032\006\020$\032\0020\0032\006\020%\032\0020\0032\006\020&\032\0020\0032\b\020'\032\004\030\0010\003H\026Ju\020(\032\b\022\004\022\0020\0340\0332\006\020\013\032\0020\0032\006\020\f\032\0020\0032\b\020\r\032\004\030\0010\0162\n\b\002\020\024\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\023\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0202\n\b\002\020\022\032\004\030\0010\0202\n\b\002\020\027\032\004\030\0010\030H\002¢\006\002\020)Jm\020*\032\b\022\004\022\0020\0340\0332\006\020\037\032\0020\0032\b\020\r\032\004\030\0010\0162\n\b\002\020\024\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\023\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0202\n\b\002\020\022\032\004\030\0010\0202\n\b\002\020\027\032\004\030\0010\030H\002¢\006\002\020+R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\005\032\0020\003X\004¢\006\002\n\000¨\006,"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/OpenAIRequestProviderImpl;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;", "chatModel", "", "completionModel", "editModel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "createChatCompletionRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "project", "Lcom/intellij/openapi/project/Project;", "input", "suffix", "maxTokens", "", "temperature", "", "presencePenalty", "frequencyPenalty", "topP", "numberOfSuggestions", "logProbs", "numberOfAttempts", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "createChatRequest", "Lcom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest;", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "body", "createCompletionRequest", "prompt", "createEditRequest", "instruction", "createNameSuggestionRequest", "oldName", "contextPrompt", "objectType", "objectToRename", "prefix", "createOpenAiChatCompletionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)Lcom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest;", "createOpenAiCompletionRequest", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)Lcom/intellij/ml/llm/core/models/openai/OpenAIBaseRequest;", "intellij.ml.llm"})
/*     */ public final class OpenAIRequestProviderImpl implements LLMRequestProvider {
/*     */   @NotNull
/*     */   private final String chatModel;
/*     */   @NotNull
/*     */   private final String completionModel;
/*     */   @NotNull
/*     */   private final String editModel;
/*     */   
/*     */   public OpenAIRequestProviderImpl(@NotNull String chatModel, @NotNull String completionModel, @NotNull String editModel) {
/*  26 */     this.chatModel = chatModel;
/*  27 */     this.completionModel = completionModel;
/*  28 */     this.editModel = editModel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public LLMBaseRequest<?> createEditRequest(@NotNull Project project, @NotNull String input, @NotNull String instruction, double temperature, double topP) {
/*  37 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(instruction, "instruction"); OpenAIRequestProviderImplKt.access$getLogger$p().info("Sending request to OpenAI API with temperature=" + temperature + ", topP=" + topP);
/*  38 */     return new OpenAIEditRequest(
/*  39 */         new OpenAiChatRequestBody(this.editModel, null, ChatRecipesKt.customEditChat(input, instruction), Double.valueOf(temperature), Double.valueOf(topP), null, null, null, null, null, null, null, null, 8162, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public OpenAIBaseRequest<OpenAiChatRequestBody> createChatRequest(@NotNull Project project, @NotNull OpenAiChatRequestBody body, @Nullable LLMStreamingRequestConsumer consumer) {
/*  49 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(body, "body"); OpenAIRequestProviderImplKt.access$getLogger$p().info("Sending request to OpenAI API with model=" + this.chatModel + " and messages=" + body.getMessages());
/*     */     
/*  51 */     if (consumer == null) {
/*  52 */       return new OpenAIChatRequest(body);
/*     */     }
/*  54 */     return new OpenAIStreamingChatRequest(body, consumer);
/*     */   }
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
/*     */   @NotNull
/*     */   public LLMBaseRequest<?> createChatCompletionRequest(@NotNull Project project, @NotNull String input, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/*  71 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(suffix, "suffix"); return createOpenAiChatCompletionRequest(input, suffix, maxTokens, numberOfSuggestions, temperature, topP, presencePenalty, 
/*  72 */         frequencyPenalty, consumer);
/*     */   }
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
/*     */   @NotNull
/*     */   public LLMBaseRequest<?> createCompletionRequest(@NotNull Project project, @NotNull String prompt, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/*  89 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(prompt, "prompt"); Intrinsics.checkNotNullParameter(suffix, "suffix"); return createOpenAiCompletionRequest(prompt, maxTokens, numberOfSuggestions, temperature, topP, presencePenalty, 
/*  90 */         frequencyPenalty, consumer);
/*     */   }
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
/*     */   private final OpenAIBaseRequest<OpenAiChatRequestBody> createOpenAiChatCompletionRequest(String input, String suffix, Integer maxTokens, Integer numberOfSuggestions, Double temperature, Double topP, Double presencePenalty, Double frequencyPenalty, LLMStreamingRequestConsumer consumer) {
/* 105 */     LLMSettingsManager settings = LLMSettingsManager.Companion.getInstance();
/*     */     
/* 107 */     String str = this.completionModel; List list = ChatRecipesKt.customCompletionChat(input); OpenAiChatRequestBody body = new OpenAiChatRequestBody(str, null, list, 
/*     */         
/* 109 */         temperature, 
/* 110 */         topP, numberOfSuggestions, null, null, null, 
/* 111 */         presencePenalty, 
/* 112 */         frequencyPenalty, null, null, 6594, null);
/*     */ 
/*     */     
/* 115 */     OpenAIRequestProviderImplKt.access$getLogger$p().info("Sending completion request to OpenAI API with maxTokens=" + 
/*     */         
/* 117 */         maxTokens + ", temperature=" + temperature + ", topP=" + topP + ", suggestions=" + numberOfSuggestions);
/*     */ 
/*     */     
/* 120 */     if (consumer == null) {
/* 121 */       return new OpenAIChatCompletionRequest(body);
/*     */     }
/* 123 */     return new OpenAIStreamingChatCompletionsRequest(body, consumer);
/*     */   }
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
/*     */   private final OpenAIBaseRequest<OpenAiChatRequestBody> createOpenAiCompletionRequest(String prompt, Integer maxTokens, Integer numberOfSuggestions, Double temperature, Double topP, Double presencePenalty, Double frequencyPenalty, LLMStreamingRequestConsumer consumer) {
/* 136 */     LLMSettingsManager settings = LLMSettingsManager.Companion.getInstance();
/*     */     
/* 138 */     String str = this.completionModel; OpenAiChatRequestBody body = new OpenAiChatRequestBody(str, prompt, null, 
/*     */         
/* 140 */         temperature, 
/* 141 */         topP, numberOfSuggestions, null, null, null, 
/* 142 */         presencePenalty, 
/* 143 */         frequencyPenalty, null, null, 6592, null);
/*     */ 
/*     */     
/* 146 */     OpenAIRequestProviderImplKt.access$getLogger$p().info("Sending completion request to OpenAI API with maxTokens=" + 
/*     */         
/* 148 */         maxTokens + ", temperature=" + temperature + ", topP=" + topP + ", suggestions=" + numberOfSuggestions);
/*     */ 
/*     */     
/* 151 */     if (consumer == null) {
/* 152 */       return new OpenAICompletionRequest(body);
/*     */     }
/* 154 */     return new OpenAIStreamingCompletionsRequest(body, consumer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public LLMBaseRequest<?> createNameSuggestionRequest(@NotNull Project project, @NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) {
/* 165 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(oldName, "oldName"); Intrinsics.checkNotNullParameter(contextPrompt, "contextPrompt"); Intrinsics.checkNotNullParameter(objectType, "objectType"); Intrinsics.checkNotNullParameter(objectToRename, "objectToRename"); return new OpenAINameRequest(new OpenAiChatRequestBody(this.editModel, "", ChatRecipesKt.customRenameChat(contextPrompt, objectType), null, null, null, null, null, null, null, null, null, null, 8184, null));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIRequestProviderImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */