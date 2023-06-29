/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.codeInsight.daemon.impl.HighlightInfo;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*    */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.PlatformCoreDataKeys;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.SelectionModel;
/*    */ import com.intellij.openapi.editor.ex.RangeHighlighterEx;
/*    */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020!\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\036\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\002J\b\020\016\032\0020\017H\026J0\020\020\032\0020\0042\006\020\f\032\0020\r2\006\020\021\032\0020\t2\006\020\n\032\0020\0132\006\020\022\032\0020\0232\006\020\024\032\0020\tH\002J\020\020\025\032\0020\0042\006\020\005\032\0020\006H\026¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment;", "Lcom/intellij/openapi/actionSystem/AnAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "collectMessages", "", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "project", "Lcom/intellij/openapi/project/Project;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "transform", "text", "textRange", "Lcom/intellij/openapi/util/TextRange;", "instruction", "update", "intellij.ml.llm"})
/*    */ public final class FixProblemInSelectedFragment extends AnAction {
/* 29 */   public FixProblemInSelectedFragment() { super(AllIcons.General.Warning); } @NotNull
/* 30 */   public ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.BGT; }
/*    */    public void update(@NotNull AnActionEvent e) {
/*    */     Editor editor;
/* 33 */     Intrinsics.checkNotNullParameter(e, "e"); if ((Editor)e.getDataContext().getData(PlatformCoreDataKeys.EDITOR) == null) { (Editor)e.getDataContext().getData(PlatformCoreDataKeys.EDITOR); return; }
/*    */     
/* 35 */     e.getPresentation().setEnabledAndVisible(Registry.is("llm.fix.problems.in.selected.fragment"));
/* 36 */     Intrinsics.checkNotNull(e.getProject()); e.getPresentation().setEnabled(!collectMessages(editor, e.getProject()).isEmpty());
/*    */   }
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Editor editor;
/* 40 */     Intrinsics.checkNotNullParameter(e, "e"); if ((Editor)e.getDataContext().getData(PlatformCoreDataKeys.EDITOR) == null) { (Editor)e.getDataContext().getData(PlatformCoreDataKeys.EDITOR); return; }
/* 41 */      Intrinsics.checkNotNull(e.getProject()); List<String> messages = collectMessages(editor, e.getProject());
/*    */     
/* 43 */     String instruction = "Fix the problems: " + CollectionsKt.joinToString$default(messages, "; ", null, null, 0, null, null, 62, null) + ". Don't add markdown syntax to the answer.";
/* 44 */     Intrinsics.checkNotNullExpressionValue(editor.getSelectionModel(), "editor.selectionModel"); SelectionModel selectionModel = editor.getSelectionModel();
/* 45 */     String selectedText = selectionModel.getSelectedText();
/* 46 */     if (selectedText != null) {
/* 47 */       e.getPresentation().setIcon((Icon)AnimatedIcon.Default.INSTANCE);
/* 48 */       Intrinsics.checkNotNullExpressionValue(TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()), "create(selectionModel.se…ectionModel.selectionEnd)"); TextRange range = TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd());
/* 49 */       Intrinsics.checkNotNull(e.getProject()); transform(e.getProject(), selectedText, editor, range, instruction);
/*    */     } 
/*    */   }
/*    */   
/*    */   private final List<String> collectMessages(Editor editor, Project project) {
/* 54 */     int start = editor.getSelectionModel().getSelectionStart();
/* 55 */     int end = editor.getSelectionModel().getSelectionEnd();
/*    */     
/* 57 */     List<String> messages = new ArrayList();
/* 58 */     Intrinsics.checkNotNull(DocumentMarkupModel.forDocument(editor.getDocument(), project, false), "null cannot be cast to non-null type com.intellij.openapi.editor.ex.MarkupModelEx"); ((MarkupModelEx)DocumentMarkupModel.forDocument(editor.getDocument(), project, false))
/* 59 */       .processRangeHighlightersOverlappingWith(start, end, new FixProblemInSelectedFragment$collectMessages$1(messages)::collectMessages$lambda$0);
/*    */ 
/*    */ 
/*    */     
/* 63 */     return messages;
/*    */   }
/*    */   private static final boolean collectMessages$lambda$0(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;)Ljava/lang/Boolean;"}) static final class FixProblemInSelectedFragment$collectMessages$1 extends Lambda implements Function1<RangeHighlighterEx, Boolean> {
/* 67 */     @NotNull public final Boolean invoke(RangeHighlighterEx it) { HighlightInfo.fromRangeHighlighter((RangeHighlighter)it); if (((HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null) == null) { (HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null; return Boolean.valueOf(true); }  ((HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null).add((HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null); return Boolean.valueOf(true); } FixProblemInSelectedFragment$collectMessages$1(List<String> $messages) { super(1); } } private final void transform(Project project, String text, Editor editor, TextRange textRange, String instruction) { CompositeStatisticsIdeActivity activity = CommonLoggerService.logEditStarted$default(CommonLoggerService.Companion.getInstance(), project, null, null, 6, null);
/* 68 */     String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); FixProblemInSelectedFragment$transform$task$1 task = new FixProblemInSelectedFragment$transform$task$1(project, text, instruction, activity, editor, textRange, str);
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
/* 85 */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"}) public static final class FixProblemInSelectedFragment$transform$task$1 extends Task.Backgroundable {
/*    */     FixProblemInSelectedFragment$transform$task$1(Project $project, String $text, String $instruction, CompositeStatisticsIdeActivity $activity, Editor $editor, TextRange $textRange, String $super_call_param$1) { super($project, $super_call_param$1); } public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); Function1 onRequestSent = new FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1(this.$activity); LLMBaseResponse lLMBaseResponse1 = SenderKt.sendEditRequest$default(this.$project, this.$text, this.$instruction, null, null, onRequestSent, null, 88, null); Project project = this.$project; Editor editor = this.$editor; TextRange textRange = this.$textRange; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; LLMBaseResponse it = lLMBaseResponse1; int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$1 = 0; LLMResponseChoice lLMResponseChoice = (LLMResponseChoice)CollectionsKt.firstOrNull(it.getSuggestions()); int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$1$1 = 0; ActionsKt.invokeLater$default(null, new FixProblemInSelectedFragment$transform$task$1$run$1$1$1(project, lLMResponseChoice, editor, textRange, compositeStatisticsIdeActivity), 1, null); (LLMResponseChoice)CollectionsKt.firstOrNull(it.getSuggestions()); SenderKt.sendEditRequest$default(this.$project, this.$text, this.$instruction, null, null, onRequestSent, null, 88, null); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"}) @SourceDebugExtension({"SMAP\nFixProblemInSelectedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixProblemInSelectedFragment.kt\ncom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"}) static final class FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> {
/*    */       public final void invoke(@NotNull LLMBaseRequest request) { Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity it = this.$activity;
/* 88 */         int $i$a$-let-FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1$1 = 0;
/*    */         CommonLoggerService.logSendEditRequest$default(CommonLoggerService.Companion.getInstance(), it, request.getBody(), null, null, 12, null); }
/*    */ 
/*    */       
/*    */       FixProblemInSelectedFragment$transform$task$1$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity) {
/*    */         super(1);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */     static final class FixProblemInSelectedFragment$transform$task$1$run$1$1$1 extends Lambda implements Function0<Unit> {
/*    */       public final void invoke() {
/*    */         // Byte code:
/*    */         //   0: aload_0
/*    */         //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */         //   4: aload_0
/*    */         //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */         //   8: aload_0
/*    */         //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*    */         //   12: aload_0
/*    */         //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*    */         //   16: aload_0
/*    */         //   17: getfield $textRange : Lcom/intellij/openapi/util/TextRange;
/*    */         //   20: aload_0
/*    */         //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*    */         //   24: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/util/TextRange;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*    */         //   29: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*    */         //   32: return
/*    */         // Line number table:
/*    */         //   Java source line number -> byte code offset
/*    */         //   #76	-> 0
/*    */         //   #80	-> 32
/*    */         // Local variable table:
/*    */         //   start	length	slot	name	descriptor
/*    */         //   0	33	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$transform$task$1$run$1$1$1;
/*    */       }
/*    */       
/*    */       private static final void invoke$lambda$0(Project $project, LLMResponseChoice $it, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity) {
/*    */         Intrinsics.checkNotNullParameter($project, "$project");
/*    */         Intrinsics.checkNotNullParameter($it, "$it");
/*    */         Intrinsics.checkNotNullParameter($editor, "$editor");
/*    */         Intrinsics.checkNotNullParameter($textRange, "$textRange");
/*    */         Intrinsics.checkNotNullParameter($activity, "$activity");
/*    */         Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*    */         ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm($project, $it.getText(), $editor.getDocument(), $textRange);
/*    */         CommonLoggerService.logEditFinished$default(CommonLoggerService.Companion.getInstance(), $activity, $it.getText(), FinishState.SUCCEED, null, null, 24, null);
/*    */       }
/*    */       
/*    */       FixProblemInSelectedFragment$transform$task$1$run$1$1$1(Project $project, LLMResponseChoice $it, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity) {
/*    */         super(0);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */