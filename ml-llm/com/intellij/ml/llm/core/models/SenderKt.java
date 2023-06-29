/*     */ package com.intellij.ml.llm.core.models;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMRequestProvider;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.io.HttpRequests;
/*     */ import java.io.IOException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000\n\002\020\006\n\002\b\006\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\022\032©\001\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\b2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\r2\n\b\002\020\017\032\004\030\0010\r2\n\b\002\020\020\032\004\030\0010\r2\n\b\002\020\021\032\004\030\0010\0132\b\b\002\020\022\032\0020\0132\032\b\002\020\023\032\024\022\b\022\006\022\002\b\0030\025\022\004\022\0020\026\030\0010\0242\n\b\002\020\027\032\004\030\0010\0302\b\b\002\020\031\032\0020\032¢\006\002\020\033\032\001\020\034\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\035\032\0020\b2\006\020\t\032\0020\b2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\r2\n\b\002\020\017\032\004\030\0010\r2\n\b\002\020\020\032\004\030\0010\r2\n\b\002\020\021\032\004\030\0010\0132\b\b\002\020\022\032\0020\0132\n\b\002\020\027\032\004\030\0010\0302\b\b\002\020\031\032\0020\032¢\006\002\020\036\032c\020\037\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020 \032\0020\b2\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\020\032\004\030\0010\r2\032\b\002\020\023\032\024\022\b\022\006\022\002\b\0030\025\022\004\022\0020\026\030\0010\0242\b\b\002\020!\032\0020\032¢\006\002\020\"\032O\020#\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020$\032\0020\b2\006\020%\032\0020\b2\006\020&\032\0020\b2\006\020'\032\0020\b2\b\020(\032\004\030\0010\b2\b\b\002\020!\032\0020\032H@ø\001\000¢\006\002\020)\032\034\020*\032\004\030\0010\0042\006\020\005\032\0020\0062\n\020+\032\006\022\002\b\0030\025\"\023\020\000\032\0070\001¢\006\002\b\002X\004¢\006\002\n\000\002\004\n\002\b\031¨\006,"}, d2 = {"logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "sendCompletionChatRequest", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "project", "Lcom/intellij/openapi/project/Project;", "input", "", "suffix", "maxTokens", "", "temperature", "", "presencePenalty", "frequencyPenalty", "topP", "numberOfSuggestions", "numberOfAttempts", "onRequestSent", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "", "consumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "llmRequestProviderImpl", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "sendCompletionRequest", "prompt", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;ILcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "sendEditRequest", "instruction", "llmRequestProvider", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;)Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "sendNameSuggestionRequest", "oldName", "contextPrompt", "objectType", "objectToRename", "prefix", "(Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/models/requestResponse/LLMRequestProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendRequest", "request", "intellij.ml.llm"})
/*     */ public final class SenderKt {
/*     */   @NotNull
/*  19 */   private static final Logger logger = Logger.getInstance("#com.intellij.ml.llm.models"); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm.models"), "getInstance(\"#com.intellij.ml.llm.models\")"); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final LLMBaseResponse sendEditRequest(@NotNull Project project, @NotNull String input, @NotNull String instruction, @Nullable Double temperature, @Nullable Double topP, @Nullable Function1 onRequestSent, @NotNull LLMRequestProvider llmRequestProvider) {
/*  31 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(instruction, "instruction"); Intrinsics.checkNotNullParameter(llmRequestProvider, "llmRequestProvider"); LLMBaseRequest<?> request = llmRequestProvider.createEditRequest(
/*  32 */         project, 
/*  33 */         input, 
/*  34 */         instruction, 
/*  35 */         (temperature != null) ? temperature.doubleValue() : 0.0D, 
/*  36 */         (topP != null) ? topP.doubleValue() : 1.0D);
/*     */ 
/*     */     
/*  39 */     if (onRequestSent != null) { onRequestSent.invoke(request); } else {  }
/*  40 */      return sendRequest(project, request);
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
/*     */   @Nullable
/*     */   public static final LLMBaseResponse sendCompletionRequest(@NotNull Project project, @NotNull String prompt, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, int numberOfAttempts, @Nullable LLMStreamingRequestConsumer consumer, @NotNull LLMRequestProvider llmRequestProviderImpl) {
/*  57 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(prompt, "prompt"); Intrinsics.checkNotNullParameter(suffix, "suffix"); Intrinsics.checkNotNullParameter(llmRequestProviderImpl, "llmRequestProviderImpl"); LLMBaseRequest<?> request = llmRequestProviderImpl.createCompletionRequest(
/*  58 */         project, 
/*  59 */         prompt, 
/*  60 */         suffix, 
/*  61 */         maxTokens, 
/*  62 */         temperature, 
/*     */ 
/*     */         
/*  65 */         presencePenalty, 
/*  66 */         frequencyPenalty, topP, numberOfSuggestions, 
/*  67 */         Integer.valueOf(1), 
/*  68 */         numberOfAttempts, 
/*  69 */         consumer);
/*     */ 
/*     */     
/*  72 */     return sendRequest(project, request);
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
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final LLMBaseResponse sendCompletionChatRequest(@NotNull Project project, @NotNull String input, @NotNull String suffix, @Nullable Integer maxTokens, @Nullable Double temperature, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Double topP, @Nullable Integer numberOfSuggestions, int numberOfAttempts, @Nullable Function1 onRequestSent, @Nullable LLMStreamingRequestConsumer consumer, @NotNull LLMRequestProvider llmRequestProviderImpl) {
/*  91 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(input, "input"); Intrinsics.checkNotNullParameter(suffix, "suffix"); Intrinsics.checkNotNullParameter(llmRequestProviderImpl, "llmRequestProviderImpl"); LLMBaseRequest<?> request = llmRequestProviderImpl.createChatCompletionRequest(
/*  92 */         project, 
/*  93 */         input, 
/*  94 */         suffix, 
/*  95 */         maxTokens, 
/*  96 */         temperature, 
/*     */ 
/*     */         
/*  99 */         presencePenalty, 
/* 100 */         frequencyPenalty, topP, numberOfSuggestions, 
/* 101 */         Integer.valueOf(1), 
/* 102 */         numberOfAttempts, 
/* 103 */         consumer);
/*     */ 
/*     */     
/* 106 */     if (onRequestSent != null) { onRequestSent.invoke(request); } else {  }
/* 107 */      return sendRequest(project, request);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final Object sendNameSuggestionRequest(@NotNull Project project, @NotNull String oldName, @NotNull String contextPrompt, @NotNull String objectType, @NotNull String objectToRename, @Nullable String prefix, @NotNull LLMRequestProvider llmRequestProvider, @NotNull Continuation $completion) {
/* 117 */     LLMBaseRequest<?> request = llmRequestProvider.createNameSuggestionRequest(project, oldName, contextPrompt, objectType, objectToRename, prefix);
/* 118 */     return CoroutinesKt.blockingContext(new SenderKt$sendNameSuggestionRequest$2(project, request), $completion); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "invoke"}) static final class SenderKt$sendNameSuggestionRequest$2 extends Lambda implements Function0<LLMBaseResponse> { SenderKt$sendNameSuggestionRequest$2(Project $project, LLMBaseRequest<?> $request) { super(0); } @Nullable public final LLMBaseResponse invoke() { return SenderKt.sendRequest(this.$project, this.$request); }
/*     */      }
/*     */   @Nullable
/*     */   public static final LLMBaseResponse sendRequest(@NotNull Project project, @NotNull LLMBaseRequest request) {
/* 122 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(request, "request"); try {
/* 123 */       return request.sendSync();
/*     */     }
/* 125 */     catch (AuthorizationException e) {
/* 126 */       NotificationsKt.showUnauthorizedNotification(project);
/*     */     }
/* 128 */     catch (com.intellij.util.io.HttpRequests.HttpStatusException e) {
/* 129 */       if (e.getStatusCode() == 
/* 130 */         401) { NotificationsKt.showAuthorizationFailedNotification(project); }
/*     */       else
/*     */       
/* 133 */       { Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = LLMRequestType.Companion.byRequest(request).getDisplayName(); if (e.getMessage() == null) e.getMessage();  true[e.getMessage()] = ""; NotificationsKt.showRequestFailedNotification((Project)"notification.request.failed.message", LLMBundle.message((String)arrayOfObject, arrayOfObject));
/*     */         
/* 135 */         logger.warn((Throwable)e); }
/*     */ 
/*     */     
/*     */     }
/* 139 */     catch (IOException e) {
/*     */       
/* 141 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = LLMRequestType.Companion.byRequest(request).getDisplayName(); if (e.getMessage() == null) e.getMessage();  true[e.getMessage()] = ""; NotificationsKt.showRequestFailedNotification((Project)"notification.request.failed.message", LLMBundle.message((String)arrayOfObject, arrayOfObject));
/*     */       
/* 143 */       logger.warn(e);
/*     */     } 
/* 145 */     return null;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/SenderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */