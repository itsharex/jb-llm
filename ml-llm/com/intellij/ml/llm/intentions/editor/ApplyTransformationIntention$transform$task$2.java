/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.models.SenderKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.progress.Task;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.openapi.util.text.StringUtil;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*     */ public final class ApplyTransformationIntention$transform$task$2
/*     */   extends Task.Backgroundable
/*     */ {
/*     */   ApplyTransformationIntention$transform$task$2(String $text, String $instruction, CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language, ApplyTransformationIntention $receiver, Function1<String, Boolean> $validator, Editor $editor, TextRange $textRange, String $super_call_param$1) {
/* 168 */     super($project, $super_call_param$1);
/*     */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"}) static final class ApplyTransformationIntention$transform$task$2$run$onRequestSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> {
/* 170 */     public final void invoke(@NotNull LLMBaseRequest request) { Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity compositeStatisticsIdeActivity1 = this.$activity; PsiElement psiElement = this.$psiElement; Language language = this.$language; CompositeStatisticsIdeActivity it = compositeStatisticsIdeActivity1; int $i$a$-let-ApplyTransformationIntention$transform$task$2$run$onRequestSent$1$1 = 0; CommonLoggerService.Companion.getInstance().logSendEditRequest(it, request.getBody(), psiElement, language); } ApplyTransformationIntention$transform$task$2$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language) { super(1); } } public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); Function1 onRequestSent = new ApplyTransformationIntention$transform$task$2$run$onRequestSent$1(this.$activity, this.$psiElement, this.$language);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     LLMBaseResponse response = SenderKt.sendEditRequest$default(
/* 177 */         this.$project, 
/* 178 */         this.$text, 
/* 179 */         this.$instruction, null, null, 
/* 180 */         onRequestSent, null, 88, null);
/*     */     
/* 182 */     if (response != null) {
/* 183 */       LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); ApplyTransformationIntention applyTransformationIntention = ApplyTransformationIntention.this; Project project = this.$project; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; Function1<String, Boolean> function1 = this.$validator; Editor editor = this.$editor; TextRange textRange = this.$textRange; PsiElement psiElement = this.$psiElement; Language language = this.$language; LLMResponseChoice it = lLMResponseChoice1; int $i$a$-let-ApplyTransformationIntention$transform$task$2$run$1 = 0;
/* 184 */       ApplyTransformationIntention.access$getLogger$p(applyTransformationIntention).info("Suggested change: " + it);
/* 185 */       ActionsKt.invokeLater$default(null, new ApplyTransformationIntention$transform$task$2$run$1$1(compositeStatisticsIdeActivity, applyTransformationIntention, it, function1, editor, textRange, psiElement, language), 1, null);
/*     */       (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/* 187 */     }  } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class ApplyTransformationIntention$transform$task$2$run$1$1 extends Lambda implements Function0<Unit> { private static final void invoke$lambda$0(ApplyTransformationIntention this$0, LLMResponseChoice $it, Function1 $validator, Project $project, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language) { Intrinsics.checkNotNullParameter(ApplyTransformationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($validator, "$validator"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($textRange, "$textRange"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullExpressionValue(StringUtil.convertLineSeparators(ApplyTransformationIntention.this.preprocessSuggestion($it.getText())), "convertLineSeparators(pr…cessSuggestion (it.text))"); String suggestion = StringUtil.convertLineSeparators(ApplyTransformationIntention.this.preprocessSuggestion($it.getText()));
/* 188 */       if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/* 189 */         ApplyTransformationIntention.access$getLogger$p(ApplyTransformationIntention.this).warn("Ignored suggestion: " + suggestion);
/*     */         return;
/*     */       } 
/* 192 */       Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm($project, suggestion, $editor.getDocument(), $textRange);
/* 193 */       CommonLoggerService.Companion.getInstance().logEditFinished($activity, suggestion, FinishState.SUCCEED, $psiElement, $language); }
/*     */ 
/*     */     
/*     */     public final void invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   4: aload_0
/*     */       //   5: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */       //   8: aload_0
/*     */       //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */       //   12: aload_0
/*     */       //   13: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */       //   16: aload_0
/*     */       //   17: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   20: aload_0
/*     */       //   21: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   24: aload_0
/*     */       //   25: getfield $textRange : Lcom/intellij/openapi/util/TextRange;
/*     */       //   28: aload_0
/*     */       //   29: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   32: aload_0
/*     */       //   33: getfield $psiElement : Lcom/intellij/psi/PsiElement;
/*     */       //   36: aload_0
/*     */       //   37: getfield $language : Lcom/intellij/lang/Language;
/*     */       //   40: <illegal opcode> run : (Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/util/TextRange;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;)Ljava/lang/Runnable;
/*     */       //   45: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */       //   48: aload_0
/*     */       //   49: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   52: aload_0
/*     */       //   53: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   56: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */       //   59: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */       //   62: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #186	-> 0
/*     */       //   #195	-> 48
/*     */       //   #196	-> 62
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	63	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2$run$1$1;
/*     */     }
/*     */     
/*     */     ApplyTransformationIntention$transform$task$2$run$1$1(CompositeStatisticsIdeActivity $activity, ApplyTransformationIntention $receiver, LLMResponseChoice $it, Function1<String, Boolean> $validator, Editor $editor, TextRange $textRange, PsiElement $psiElement, Language $language) {
/*     */       super(0);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */