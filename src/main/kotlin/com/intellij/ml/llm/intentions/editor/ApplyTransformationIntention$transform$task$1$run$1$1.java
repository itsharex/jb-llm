/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */ final class ApplyTransformationIntention$transform$task$1$run$1$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: aload_0
/*     */     //   5: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     //   8: aload_0
/*     */     //   9: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */     //   12: aload_0
/*     */     //   13: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */     //   16: aload_0
/*     */     //   17: getfield $psiElement : Lcom/intellij/psi/PsiElement;
/*     */     //   20: aload_0
/*     */     //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   24: aload_0
/*     */     //   25: getfield $language : Lcom/intellij/lang/Language;
/*     */     //   28: <illegal opcode> run : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/psi/PsiElement;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/lang/Language;)Ljava/lang/Runnable;
/*     */     //   33: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   40: aload_0
/*     */     //   41: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   44: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */     //   47: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */     //   50: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     //   #146	-> 36
/*     */     //   #147	-> 50
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	51	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1$run$1$1;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$0(LLMResponseChoice $it, Function1 $validator, ApplyTransformationIntention this$0, PsiElement $psiElement, CompositeStatisticsIdeActivity $activity, Language $language) {
/* 138 */     Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($validator, "$validator"); Intrinsics.checkNotNullParameter(ApplyTransformationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($psiElement, "$psiElement"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullParameter($language, "$language"); String suggestion = $it.getText();
/* 139 */     if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/* 140 */       ApplyTransformationIntention.access$getLogger$p(ApplyTransformationIntention.this).warn("Ignored suggestion: " + suggestion);
/*     */       return;
/*     */     } 
/* 143 */     if (ApplyTransformationIntention.this.getTransformElementCallback() != null) { ApplyTransformationIntention.this.getTransformElementCallback().invoke($psiElement, ApplyTransformationIntention.this.preprocessSuggestion(suggestion)); } else { ApplyTransformationIntention.this.getTransformElementCallback(); }
/* 144 */      CommonLoggerService.Companion.getInstance().logEditFinished($activity, suggestion, FinishState.SUCCEED, $psiElement, $language);
/*     */   }
/*     */   
/*     */   ApplyTransformationIntention$transform$task$1$run$1$1(CompositeStatisticsIdeActivity $activity, LLMResponseChoice $it, Function1<String, Boolean> $validator, ApplyTransformationIntention $receiver, PsiElement $psiElement, Language $language) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1$run$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */