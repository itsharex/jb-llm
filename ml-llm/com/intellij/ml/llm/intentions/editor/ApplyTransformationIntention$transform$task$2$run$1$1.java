/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.openapi.util.text.StringUtil;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class ApplyTransformationIntention$transform$task$2$run$1$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: aload_0
/*     */     //   5: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */     //   8: aload_0
/*     */     //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     //   12: aload_0
/*     */     //   13: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */     //   16: aload_0
/*     */     //   17: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   20: aload_0
/*     */     //   21: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   24: aload_0
/*     */     //   25: getfield $textRange : Lcom/intellij/openapi/util/TextRange;
/*     */     //   28: aload_0
/*     */     //   29: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   32: aload_0
/*     */     //   33: getfield $psiElement : Lcom/intellij/psi/PsiElement;
/*     */     //   36: aload_0
/*     */     //   37: getfield $language : Lcom/intellij/lang/Language;
/*     */     //   40: <illegal opcode> run : (Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/util/TextRange;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;)Ljava/lang/Runnable;
/*     */     //   45: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */     //   48: aload_0
/*     */     //   49: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   52: aload_0
/*     */     //   53: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   56: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */     //   59: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */     //   62: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #186	-> 0
/*     */     //   #195	-> 48
/*     */     //   #196	-> 62
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	63	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2$run$1$1;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$0(ApplyTransformationIntention this$0, LLMResponseChoice $it, Function1 $validator, Project $project, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language) {
/* 187 */     Intrinsics.checkNotNullParameter(ApplyTransformationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($validator, "$validator"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($textRange, "$textRange"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullExpressionValue(StringUtil.convertLineSeparators(ApplyTransformationIntention.this.preprocessSuggestion($it.getText())), "convertLineSeparators(pr…cessSuggestion (it.text))"); String suggestion = StringUtil.convertLineSeparators(ApplyTransformationIntention.this.preprocessSuggestion($it.getText()));
/* 188 */     if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/* 189 */       ApplyTransformationIntention.access$getLogger$p(ApplyTransformationIntention.this).warn("Ignored suggestion: " + suggestion);
/*     */       return;
/*     */     } 
/* 192 */     Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm($project, suggestion, $editor.getDocument(), $textRange);
/* 193 */     CommonLoggerService.Companion.getInstance().logEditFinished($activity, suggestion, FinishState.SUCCEED, $psiElement, $language);
/*     */   }
/*     */   
/*     */   ApplyTransformationIntention$transform$task$2$run$1$1(CompositeStatisticsIdeActivity $activity, ApplyTransformationIntention $receiver, LLMResponseChoice $it, Function1<String, Boolean> $validator, Editor $editor, TextRange $textRange, PsiElement $psiElement, Language $language) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2$run$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */