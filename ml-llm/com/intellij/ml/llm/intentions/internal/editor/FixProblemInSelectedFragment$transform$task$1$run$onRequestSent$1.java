/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*    */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nFixProblemInSelectedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixProblemInSelectedFragment.kt\ncom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/*    */ final class FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1
/*    */   extends Lambda
/*    */   implements Function1<LLMBaseRequest<?>, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull LLMBaseRequest request) {
/* 71 */     Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity it = this.$activity;
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
/* 88 */     int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1$1 = 0;
/*    */     CommonLoggerService.logSendEditRequest$default(CommonLoggerService.Companion.getInstance(), it, request.getBody(), null, null, 12, null);
/*    */   }
/*    */   
/*    */   FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */