/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMRequestType;
/*    */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*    */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*    */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$complete$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */ public final class CodeCompletionIntention$complete$task$1
/*    */   extends Task.Backgroundable
/*    */ {
/*    */   CodeCompletionIntention$complete$task$1(CodeCompletionIntention $receiver, Editor $editor, int $offset, String $prompt, String $suffix, CompositeStatisticsIdeActivity $activity, String $super_call_param$1) {
/* 74 */     super($project, $super_call_param$1);
/*    */   } public void run(@NotNull ProgressIndicator indicator) {
/* 76 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); if (LLMSettingsManager.Companion.getInstance().isStreamingEnabled()) {
/* 77 */       CodeCompletionIntention.access$trySendingStreamingRequest(CodeCompletionIntention.this, this.$project, this.$editor, this.$offset, this.$prompt, this.$suffix, this.$activity);
/*    */     } else {
/*    */       LLMBaseResponse response;
/* 80 */       Function1 onRequestSent = new CodeCompletionIntention$complete$task$1$run$onRequestSent$1(this.$activity);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 86 */       if (SenderKt.sendCompletionChatRequest$default(this.$project, this.$prompt, this.$suffix, null, null, null, null, null, null, 0, onRequestSent, null, null, 7160, null) == null) { SenderKt.sendCompletionChatRequest$default(this.$project, this.$prompt, this.$suffix, null, null, null, null, null, null, 0, onRequestSent, null, null, 7160, null); return; }
/* 87 */        CodeCompletionIntention.access$showSuggestionSynchronously(CodeCompletionIntention.this, this.$project, this.$editor, response, this.$offset, this.$activity);
/*    */     } 
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"})
/*    */   static final class CodeCompletionIntention$complete$task$1$run$onRequestSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> {
/*    */     public final void invoke(@NotNull LLMBaseRequest request) {
/*    */       Intrinsics.checkNotNullParameter(request, "request");
/*    */       CompositeStatisticsIdeActivity it = this.$activity;
/*    */       int $i$a$-let-CodeCompletionIntention$complete$task$1$run$onRequestSent$1$1 = 0;
/*    */       CommonLoggerService.Companion.getInstance().logSendCompletionRequest(it, LLMRequestType.Companion.byRequest(request), request.getBody());
/*    */     }
/*    */     
/*    */     CodeCompletionIntention$complete$task$1$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$complete$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */