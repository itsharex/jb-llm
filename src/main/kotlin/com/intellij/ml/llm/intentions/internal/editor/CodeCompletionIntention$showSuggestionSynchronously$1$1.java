/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */ final class CodeCompletionIntention$showSuggestionSynchronously$1$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: aload_0
/*     */     //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   8: aload_0
/*     */     //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     //   12: aload_0
/*     */     //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   16: aload_0
/*     */     //   17: getfield $offset : I
/*     */     //   20: aload_0
/*     */     //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   24: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;ILcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*     */     //   29: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */     //   32: aload_0
/*     */     //   33: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   36: aload_0
/*     */     //   37: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   40: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */     //   43: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */     //   46: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #144	-> 0
/*     */     //   #148	-> 32
/*     */     //   #149	-> 46
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	47	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$showSuggestionSynchronously$1$1;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$0(Project $project, LLMResponseChoice $it, Editor $editor, int $offset, CompositeStatisticsIdeActivity $activity) {
/* 145 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); CodeCompletionIntention.Companion.insertStringAndSaveChange$default(CodeCompletionIntention.Companion, $project, $it.getText(), $editor.getDocument(), $offset, false, 16, null);
/* 146 */     CommonLoggerService.Companion.getInstance().logCompletionFinished($activity, $it.getText(), FinishState.SUCCEED);
/*     */   }
/*     */   
/*     */   CodeCompletionIntention$showSuggestionSynchronously$1$1(Project $project, CompositeStatisticsIdeActivity $activity, LLMResponseChoice $it, Editor $editor, int $offset) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$showSuggestionSynchronously$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */