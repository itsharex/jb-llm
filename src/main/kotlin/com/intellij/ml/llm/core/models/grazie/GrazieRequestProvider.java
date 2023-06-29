/*    */ package com.intellij.ml.llm.core.models.grazie;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import com.intellij.ml.llm.core.models.ChatRecipesKt;
/*    */ import com.intellij.ml.llm.core.models.openai.OpenAiChatRequestBody;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\006\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\030\0002\0020\001B\005¢\006\002\020\002J\001\020\005\032\006\022\002\b\0030\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\b\020\020\032\004\030\0010\0172\b\020\021\032\004\030\0010\0172\b\020\022\032\004\030\0010\0172\b\020\023\032\004\030\0010\r2\b\020\024\032\004\030\0010\r2\006\020\025\032\0020\r2\b\020\026\032\004\030\0010\027H\026¢\006\002\020\030J&\020\031\032\006\022\002\b\0030\0062\006\020\007\032\0020\b2\006\020\032\032\0020\0332\b\020\026\032\004\030\0010\027H\026J\001\020\034\032\006\022\002\b\0030\0062\006\020\007\032\0020\b2\006\020\035\032\0020\n2\006\020\013\032\0020\n2\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\b\020\020\032\004\030\0010\0172\b\020\021\032\004\030\0010\0172\b\020\022\032\004\030\0010\0172\b\020\023\032\004\030\0010\r2\b\020\024\032\004\030\0010\r2\006\020\025\032\0020\r2\b\020\026\032\004\030\0010\027H\026¢\006\002\020\030J4\020\036\032\006\022\002\b\0030\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\037\032\0020\n2\006\020\016\032\0020\0172\006\020\022\032\0020\017H\026J>\020 \032\006\022\002\b\0030\0062\006\020\007\032\0020\b2\006\020!\032\0020\n2\006\020\"\032\0020\n2\006\020#\032\0020\n2\006\020$\032\0020\n2\b\020%\032\004\030\0010\nH\026R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006&"}, d2 = {"Lcom/intellij/ml/llm/core/models/grazie/GrazieRequestProvider;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;", "()V", "completionModel", "Lai/grazie/model/llm/profile/LLMProfileID;", "createChatCompletionRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "project", "Lcom/intellij/openapi/project/Project;", "input", "", "suffix", "maxTokens", "", "temperature", "", "presencePenalty", "frequencyPenalty", "topP", "numberOfSuggestions", "logProbs", "numberOfAttempts", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;ILcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "createChatRequest", "body", "Lcom/intellij/ml/llm/core/models/openai/OpenAiChatRequestBody;", "createCompletionRequest", "prompt", "createEditRequest", "instruction", "createNameSuggestionRequest", "oldName", "contextPrompt", "objectType", "objectToRename", "prefix", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieRequestProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieRequestProvider.kt\ncom/intellij/ml/llm/core/models/grazie/GrazieRequestProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/*    */ public final class GrazieRequestProvider implements LLMRequestProvider {
/*    */   public GrazieRequestProvider() {
/* 18 */     String str = System.getProperty("llm.completion.model");
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
/* 79 */     GrazieRequestProvider grazieRequestProvider = this; int $i$a$-let-GrazieRequestProvider$completionModel$1 = 0;
/*    */     System.getProperty("llm.completion.model");
/*    */     this.completionModel = (System.getProperty("llm.completion.model") != null) ? new LLMProfileID(str) : GrazieLLMProfileIDs.CodeGen.INSTANCE.getSmallMulti();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final LLMProfileID completionModel;
/*    */   
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createEditRequest(@NotNull Project project, @NotNull String input, @NotNull String instruction, double temperature, double topP) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(input, "input");
/*    */     Intrinsics.checkNotNullParameter(instruction, "instruction");
/*    */     GrazieRequestProviderKt.access$getLogger$p().info("Sending request to Grazie, temperature, topP, number of suggestions are ignored");
/*    */     return new GrazieEditRequest(project, ChatRecipesKt.toGrazieChat(ChatRecipesKt.customEditChat(input, instruction)), instruction);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createChatRequest(@NotNull Project project, @NotNull OpenAiChatRequestBody body, @Nullable LLMStreamingRequestConsumer consumer) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(body, "body");
/*    */     if (body.getMessages() == null)
/*    */       body.getMessages(); 
/*    */     super((Project)body.getMessages(), ChatRecipesKt.toGrazieChat(CollectionsKt.emptyList()));
/*    */     return new GrazieChatRequest();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createCompletionRequest(@NotNull Project project, @NotNull String prompt, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*    */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*    */     return new GrazieCompletionRequest(prompt, project, this.completionModel, consumer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createChatCompletionRequest(@NotNull Project project, @NotNull String input, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Integer logProbs, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(input, "input");
/*    */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*    */     return new GrazieChatCompletionRequest(input, project, consumer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public LLMBaseRequest<?> createNameSuggestionRequest(@NotNull Project project, @NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     Intrinsics.checkNotNullParameter(oldName, "oldName");
/*    */     Intrinsics.checkNotNullParameter(contextPrompt, "contextPrompt");
/*    */     Intrinsics.checkNotNullParameter(objectType, "objectType");
/*    */     Intrinsics.checkNotNullParameter(objectToRename, "objectToRename");
/*    */     return new GrazieNameSuggestionRequest(project, contextPrompt, objectType, objectToRename, prefix);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/grazie/GrazieRequestProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */