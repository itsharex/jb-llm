/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*    */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*    */ import com.intellij.ml.llm.core.statistics.FinishState;
/*    */ import com.intellij.ml.llm.intentions.editor.ApplyTransformationIntention;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class FixProblemInSelectedFragment$transform$task$1$run$1$1$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   4: aload_0
/*    */     //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   8: aload_0
/*    */     //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*    */     //   12: aload_0
/*    */     //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */     //   16: aload_0
/*    */     //   17: getfield $textRange : Lcom/intellij/openapi/util/TextRange;
/*    */     //   20: aload_0
/*    */     //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */     //   24: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/util/TextRange;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*    */     //   29: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*    */     //   32: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #76	-> 0
/*    */     //   #80	-> 32
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	33	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$1$1$1;
/*    */   }
/*    */   
/*    */   private static final void invoke$lambda$0(Project $project, LLMResponseChoice $it, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity) {
/* 77 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($textRange, "$textRange"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm($project, $it.getText(), $editor.getDocument(), $textRange);
/* 78 */     CommonLoggerService.logEditFinished$default(CommonLoggerService.Companion.getInstance(), $activity, $it.getText(), FinishState.SUCCEED, null, null, 24, null);
/*    */   }
/*    */   
/*    */   FixProblemInSelectedFragment$transform$task$1$run$1$1$1(Project $project, LLMResponseChoice $it, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */