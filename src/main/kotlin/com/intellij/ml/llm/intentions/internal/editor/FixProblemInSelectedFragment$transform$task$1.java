/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*    */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*    */ import com.intellij.ml.llm.core.statistics.FinishState;
/*    */ import com.intellij.ml.llm.intentions.editor.ApplyTransformationIntention;
/*    */ import com.intellij.openapi.application.ActionsKt;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*    */ public final class FixProblemInSelectedFragment$transform$task$1
/*    */   extends Task.Backgroundable
/*    */ {
/*    */   FixProblemInSelectedFragment$transform$task$1(Project $project, String $text, String $instruction, CompositeStatisticsIdeActivity $activity, Editor $editor, TextRange $textRange, String $super_call_param$1) {
/* 68 */     super($project, $super_call_param$1);
/*    */   } public void run(@NotNull ProgressIndicator indicator) {
/* 70 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); Function1 onRequestSent = new FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1(this.$activity);
/*    */ 
/*    */     
/* 73 */     LLMBaseResponse lLMBaseResponse1 = SenderKt.sendEditRequest$default(this.$project, this.$text, this.$instruction, null, null, onRequestSent, null, 88, null); Project project = this.$project; Editor editor = this.$editor; TextRange textRange = this.$textRange; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; LLMBaseResponse it = lLMBaseResponse1; int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$1 = 0;
/* 74 */     LLMResponseChoice lLMResponseChoice = (LLMResponseChoice)CollectionsKt.firstOrNull(it.getSuggestions()); int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$1$1 = 0;
/* 75 */     ActionsKt.invokeLater$default(null, new FixProblemInSelectedFragment$transform$task$1$run$1$1$1(project, lLMResponseChoice, editor, textRange, compositeStatisticsIdeActivity), 1, null);
/*    */     (LLMResponseChoice)CollectionsKt.firstOrNull(it.getSuggestions());
/*    */     SenderKt.sendEditRequest$default(this.$project, this.$text, this.$instruction, null, null, onRequestSent, null, 88, null);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nFixProblemInSelectedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixProblemInSelectedFragment.kt\ncom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/*    */   static final class FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1
/*    */     extends Lambda
/*    */     implements Function1<LLMBaseRequest<?>, Unit> {
/*    */     public final void invoke(@NotNull LLMBaseRequest request) {
/*    */       Intrinsics.checkNotNullParameter(request, "request");
/*    */       CompositeStatisticsIdeActivity it = this.$activity;
/* 88 */       int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1$1 = 0;
/*    */       CommonLoggerService.logSendEditRequest$default(CommonLoggerService.Companion.getInstance(), it, request.getBody(), null, null, 12, null);
/*    */     }
/*    */     
/*    */     FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class FixProblemInSelectedFragment$transform$task$1$run$1$1$1 extends Lambda implements Function0<Unit> {
/*    */     public final void invoke() {
/*    */       // Byte code:
/*    */       //   0: aload_0
/*    */       //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   4: aload_0
/*    */       //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   8: aload_0
/*    */       //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*    */       //   12: aload_0
/*    */       //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */       //   16: aload_0
/*    */       //   17: getfield $textRange : Lcom/intellij/openapi/util/TextRange;
/*    */       //   20: aload_0
/*    */       //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */       //   24: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/util/TextRange;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*    */       //   29: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*    */       //   32: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #76	-> 0
/*    */       //   #80	-> 32
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	33	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$1$1$1;
/*    */     }
/*    */     
/*    */     private static final void invoke$lambda$0(Project $project, LLMResponseChoice $it, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity) {
/*    */       Intrinsics.checkNotNullParameter($project, "$project");
/*    */       Intrinsics.checkNotNullParameter($it, "$it");
/*    */       Intrinsics.checkNotNullParameter($editor, "$editor");
/*    */       Intrinsics.checkNotNullParameter($textRange, "$textRange");
/*    */       Intrinsics.checkNotNullParameter($activity, "$activity");
/*    */       Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*    */       ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm($project, $it.getText(), $editor.getDocument(), $textRange);
/*    */       CommonLoggerService.logEditFinished$default(CommonLoggerService.Companion.getInstance(), $activity, $it.getText(), FinishState.SUCCEED, null, null, 24, null);
/*    */     }
/*    */     
/*    */     FixProblemInSelectedFragment$transform$task$1$run$1$1$1(Project $project, LLMResponseChoice $it, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */