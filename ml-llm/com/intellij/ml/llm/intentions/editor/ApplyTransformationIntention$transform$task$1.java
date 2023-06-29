/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.models.SenderKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.progress.Task;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*     */ public final class ApplyTransformationIntention$transform$task$1
/*     */   extends Task.Backgroundable
/*     */ {
/*     */   ApplyTransformationIntention$transform$task$1(String $message, ApplyTransformationIntention $receiver, CompositeStatisticsIdeActivity $activity, Function1<String, Boolean> $validator, PsiElement $psiElement, Language $language, String $super_call_param$1) {
/* 118 */     super($project, $super_call_param$1);
/*     */   }
/* 120 */   public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); int maxTokens = (this.$message.length() > 4000) ? 
/* 121 */       64 : (
/*     */ 
/*     */       
/* 124 */       4000 - this.$message.length() - 1);
/*     */     
/* 126 */     LLMBaseResponse response = SenderKt.sendCompletionChatRequest$default(
/* 127 */         this.$project, 
/* 128 */         this.$message, 
/* 129 */         "", 
/* 130 */         Integer.valueOf(maxTokens), null, null, null, null, null, 0, null, null, null, 8176, null);
/*     */     
/* 132 */     if (response != null) {
/* 133 */       LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); ApplyTransformationIntention applyTransformationIntention = ApplyTransformationIntention.this; Project project = this.$project; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; Function1<String, Boolean> function1 = this.$validator; PsiElement psiElement = this.$psiElement; Language language = this.$language; LLMResponseChoice it = lLMResponseChoice1; int $i$a$-let-ApplyTransformationIntention$transform$task$1$run$1 = 0;
/* 134 */       ApplyTransformationIntention.access$getLogger$p(applyTransformationIntention).info("Suggested change: " + it);
/* 135 */       ActionsKt.invokeLater$default(null, new ApplyTransformationIntention$transform$task$1$run$1$1(compositeStatisticsIdeActivity, it, function1, applyTransformationIntention, psiElement, language), 1, null);
/*     */       (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/*     */     }  } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/* 138 */   static final class ApplyTransformationIntention$transform$task$1$run$1$1 extends Lambda implements Function0<Unit> { private static final void invoke$lambda$0(LLMResponseChoice $it, Function1 $validator, ApplyTransformationIntention this$0, PsiElement $psiElement, CompositeStatisticsIdeActivity $activity, Language $language) { Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($validator, "$validator"); Intrinsics.checkNotNullParameter(ApplyTransformationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($psiElement, "$psiElement"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullParameter($language, "$language"); String suggestion = $it.getText();
/* 139 */       if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/* 140 */         ApplyTransformationIntention.access$getLogger$p(ApplyTransformationIntention.this).warn("Ignored suggestion: " + suggestion);
/*     */         return;
/*     */       } 
/* 143 */       if (ApplyTransformationIntention.this.getTransformElementCallback() != null) { ApplyTransformationIntention.this.getTransformElementCallback().invoke($psiElement, ApplyTransformationIntention.this.preprocessSuggestion(suggestion)); } else { ApplyTransformationIntention.this.getTransformElementCallback(); }
/* 144 */        CommonLoggerService.Companion.getInstance().logEditFinished($activity, suggestion, FinishState.SUCCEED, $psiElement, $language); }
/*     */ 
/*     */     
/*     */     public final void invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   4: aload_0
/*     */       //   5: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */       //   8: aload_0
/*     */       //   9: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */       //   12: aload_0
/*     */       //   13: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */       //   16: aload_0
/*     */       //   17: getfield $psiElement : Lcom/intellij/psi/PsiElement;
/*     */       //   20: aload_0
/*     */       //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   24: aload_0
/*     */       //   25: getfield $language : Lcom/intellij/lang/Language;
/*     */       //   28: <illegal opcode> run : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/psi/PsiElement;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/lang/Language;)Ljava/lang/Runnable;
/*     */       //   33: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   40: aload_0
/*     */       //   41: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   44: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */       //   47: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */       //   50: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #136	-> 0
/*     */       //   #146	-> 36
/*     */       //   #147	-> 50
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	51	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1$run$1$1;
/*     */     }
/*     */     
/*     */     ApplyTransformationIntention$transform$task$1$run$1$1(CompositeStatisticsIdeActivity $activity, LLMResponseChoice $it, Function1<String, Boolean> $validator, ApplyTransformationIntention $receiver, PsiElement $psiElement, Language $language) {
/*     */       super(0);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */