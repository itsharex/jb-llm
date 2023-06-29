/*     */ package com.intellij.ml.llm.intentions.internal.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.core.models.SenderKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\000 \0372\0020\001:\001\037B\005¢\006\002\020\002J0\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0162\006\020\017\032\0020\020H\002J\b\020\021\032\0020\013H\026J\b\020\022\032\0020\013H\026J%\020\023\032\0020\0072\006\020\b\032\0020\t2\b\020\r\032\004\030\0010\0162\b\020\024\032\004\030\0010\025H\002J$\020\026\032\0020\0272\006\020\b\032\0020\t2\b\020\r\032\004\030\0010\0162\b\020\024\032\004\030\0010\025H\026J0\020\030\032\0020\0072\006\020\b\032\0020\t2\006\020\r\032\0020\0162\006\020\031\032\0020\0322\006\020\017\032\0020\0202\006\020\033\032\0020\034H\002J\b\020\035\032\0020\027H\026J8\020\036\032\0020\0072\006\020\b\032\0020\t2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\033\032\0020\034H\002R\023\020\003\032\0070\004¢\006\002\b\005X\004¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "complete", "", "project", "Lcom/intellij/openapi/project/Project;", "prompt", "", "suffix", "editor", "Lcom/intellij/openapi/editor/Editor;", "offset", "", "getFamilyName", "getText", "invoke", "file", "Lcom/intellij/psi/PsiFile;", "isAvailable", "", "showSuggestionSynchronously", "response", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "activity", "Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;", "startInWriteAction", "trySendingStreamingRequest", "Companion", "intellij.ml.llm"})
/*     */ public final class CodeCompletionIntention implements IntentionAction {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Logger logger;
/*     */   
/*  34 */   public CodeCompletionIntention() { Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")"); this.logger = Logger.getInstance("#com.intellij.ml.llm"); }
/*     */   @NotNull
/*  36 */   public String getFamilyName() { return LLMBundle.message("intentions.code.completion.family.name", new Object[0]); } @NotNull
/*     */   public String getText() {
/*  38 */     return LLMBundle.message("intentions.code.completion.name", new Object[0]);
/*     */   }
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  41 */     Intrinsics.checkNotNullParameter(project, "project"); return (editor != null && file != null && Registry.is("llm.is.internal"));
/*     */   }
/*     */   
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  45 */     Intrinsics.checkNotNullParameter(project, "project"); if (editor == null || file == null)
/*     */       return; 
/*  47 */     Intrinsics.checkNotNullExpressionValue(editor.getDocument(), "editor.document"); Document document = editor.getDocument();
/*  48 */     int offset = editor.getCaretModel().getOffset();
/*  49 */     int promptLength = 256;
/*  50 */     int promptStart = RangesKt.coerceAtLeast(offset - promptLength, 0);
/*  51 */     while (promptStart < offset && !EditorActionUtil.isWordBoundary(editor.getDocument().getText(), promptStart, false, false)) {
/*  52 */       promptStart++;
/*     */     }
/*  54 */     if (promptStart == offset)
/*     */     {
/*  56 */       promptStart = RangesKt.coerceAtLeast(offset - promptLength, 0);
/*     */     }
/*  58 */     Intrinsics.checkNotNullExpressionValue(document.getText(TextRange.create(promptStart, offset)), "document.getText(TextRan…ate(promptStart, offset))"); String prompt = document.getText(TextRange.create(promptStart, offset));
/*     */     
/*  60 */     int suffixLength = 256;
/*  61 */     int suffixEnd = Math.min(offset + suffixLength, document.getTextLength());
/*  62 */     while (suffixEnd > offset && !EditorActionUtil.isWordBoundary(editor.getDocument().getText(), suffixEnd, false, false)) {
/*  63 */       suffixEnd--;
/*     */     }
/*  65 */     Intrinsics.checkNotNullExpressionValue(document.getText(new TextRange(offset, suffixEnd)), "document.getText(TextRange(offset, suffixEnd))"); String suffix = document.getText(new TextRange(offset, suffixEnd));
/*     */     
/*  67 */     complete(project, prompt, suffix, editor, offset);
/*     */   }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$complete$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"}) public static final class CodeCompletionIntention$complete$task$1 extends Task.Backgroundable {
/*     */     CodeCompletionIntention$complete$task$1(CodeCompletionIntention $receiver, Editor $editor, int $offset, String $prompt, String $suffix, CompositeStatisticsIdeActivity $activity, String $super_call_param$1) { super($project, $super_call_param$1); } public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); if (LLMSettingsManager.Companion.getInstance().isStreamingEnabled()) { CodeCompletionIntention.this.trySendingStreamingRequest(this.$project, this.$editor, this.$offset, this.$prompt, this.$suffix, this.$activity); } else { LLMBaseResponse response; Function1 onRequestSent = new CodeCompletionIntention$complete$task$1$run$onRequestSent$1(this.$activity); if (SenderKt.sendCompletionChatRequest$default(this.$project, this.$prompt, this.$suffix, null, null, null, null, null, null, 0, onRequestSent, null, null, 7160, null) == null) { SenderKt.sendCompletionChatRequest$default(this.$project, this.$prompt, this.$suffix, null, null, null, null, null, null, 0, onRequestSent, null, null, 7160, null); return; }  CodeCompletionIntention.this.showSuggestionSynchronously(this.$project, this.$editor, response, this.$offset, this.$activity); }  } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"}) static final class CodeCompletionIntention$complete$task$1$run$onRequestSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> {
/*  71 */       public final void invoke(@NotNull LLMBaseRequest request) { Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity it = this.$activity; int $i$a$-let-CodeCompletionIntention$complete$task$1$run$onRequestSent$1$1 = 0; CommonLoggerService.Companion.getInstance().logSendCompletionRequest(it, LLMRequestType.Companion.byRequest(request), request.getBody()); } CodeCompletionIntention$complete$task$1$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity) { super(1); } } } private final void complete(Project project, String prompt, String suffix, Editor editor, int offset) { CompositeStatisticsIdeActivity activity = CommonLoggerService.Companion.getInstance().logCompletionStarted(project);
/*  72 */     this.logger.info("Invoke code completion with prefix='" + prompt + "'");
/*     */     
/*  74 */     String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); CodeCompletionIntention$complete$task$1 task = new CodeCompletionIntention$complete$task$1(this, editor, offset, prompt, suffix, activity, str);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void trySendingStreamingRequest(Project project, Editor editor, int offset, String prompt, String suffix, CompositeStatisticsIdeActivity activity) {
/* 102 */     Ref.IntRef currentOffset = new Ref.IntRef(); currentOffset.element = offset;
/* 103 */     StringBuilder suggestions = new StringBuilder();
/* 104 */     CodeCompletionIntention$trySendingStreamingRequest$consumer$1 consumer = new CodeCompletionIntention$trySendingStreamingRequest$consumer$1(suggestions, project, currentOffset, editor);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     Function1 onRequestSent = new CodeCompletionIntention$trySendingStreamingRequest$onRequestSent$1(activity);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     LLMBaseResponse response = 
/* 125 */       SenderKt.sendCompletionChatRequest$default(project, prompt, suffix, null, null, null, null, null, null, 0, onRequestSent, consumer, null, 5112, null);
/* 126 */     if (response != null && !Intrinsics.areEqual(response, EmptyLLMBaseResponse.INSTANCE)) {
/* 127 */       showSuggestionSynchronously(project, editor, response, offset, activity);
/*     */     }
/*     */     
/* 130 */     Intrinsics.checkNotNullExpressionValue(suggestions.toString(), "suggestions.toString()"); CommonLoggerService.Companion.getInstance().logCompletionFinished(activity, suggestions.toString(), FinishState.SUCCEED);
/* 131 */     NotificationsKt.showScoreNotification(project, (StatisticsIdeActivities)activity); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$trySendingStreamingRequest$consumer$1", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "run", "", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"}) public static final class CodeCompletionIntention$trySendingStreamingRequest$consumer$1 extends LLMStreamingRequestConsumer {
/*     */     CodeCompletionIntention$trySendingStreamingRequest$consumer$1(StringBuilder $suggestions, Project $project, Ref.IntRef $currentOffset, Editor $editor) {} public boolean run(@NotNull LLMResponseChoice choice) { Intrinsics.checkNotNullParameter(choice, "choice"); CodeCompletionIntention.this.logger.info("Suggested completion: " + choice.getText()); ActionsKt.invokeAndWaitIfNeeded$default(null, new CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1(this.$project, this.$currentOffset, choice, this.$editor), 1, null); this.$suggestions.append(choice.getText()); return true; }
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() { // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   4: aload_0
/*     */         //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   8: aload_0
/*     */         //   9: getfield $choice : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */         //   12: aload_0
/*     */         //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   16: aload_0
/*     */         //   17: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */         //   20: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;Lkotlin/jvm/internal/Ref$IntRef;)Ljava/lang/Runnable;
/*     */         //   25: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */         //   28: aload_0
/*     */         //   29: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */         //   32: aload_0
/*     */         //   33: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */         //   36: getfield element : I
/*     */         //   39: aload_0
/*     */         //   40: getfield $choice : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */         //   43: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   46: invokevirtual length : ()I
/*     */         //   49: iadd
/*     */         //   50: putfield element : I
/*     */         //   53: aload_0
/*     */         //   54: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   57: invokeinterface getCaretModel : ()Lcom/intellij/openapi/editor/CaretModel;
/*     */         //   62: aload_0
/*     */         //   63: getfield $currentOffset : Lkotlin/jvm/internal/Ref$IntRef;
/*     */         //   66: getfield element : I
/*     */         //   69: invokeinterface moveToOffset : (I)V
/*     */         //   74: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #108	-> 0
/*     */         //   #111	-> 28
/*     */         //   #112	-> 53
/*     */         //   #113	-> 74
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	75	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1; }
/*     */       private static final void invoke$lambda$0(Project $project, LLMResponseChoice $choice, Editor $editor, Ref.IntRef $currentOffset) { Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($choice, "$choice");
/*     */         Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */         Intrinsics.checkNotNullParameter($currentOffset, "$currentOffset");
/*     */         Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*     */         CodeCompletionIntention.Companion.insertStringAndSaveChange($project, $choice.getText(), $editor.getDocument(), $currentOffset.element, false); }
/*     */       CodeCompletionIntention$trySendingStreamingRequest$consumer$1$run$1(Project $project, Ref.IntRef $currentOffset, LLMResponseChoice $choice, Editor $editor) { super(0); } } }
/* 141 */   private final void showSuggestionSynchronously(Project project, Editor editor, LLMBaseResponse response, int offset, CompositeStatisticsIdeActivity activity) { LLMResponseChoice it = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); int $i$a$-let-CodeCompletionIntention$showSuggestionSynchronously$1 = 0;
/* 142 */     this.logger.info("Suggested completion: " + it);
/* 143 */     ActionsKt.invokeLater$default(null, new CodeCompletionIntention$showSuggestionSynchronously$1$1(project, activity, it, editor, offset), 1, null); (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"}) static final class CodeCompletionIntention$trySendingStreamingRequest$onRequestSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> {
/*     */     public final void invoke(@NotNull LLMBaseRequest request) { Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity it = this.$activity; int $i$a$-let-CodeCompletionIntention$trySendingStreamingRequest$onRequestSent$1$1 = 0; CommonLoggerService.Companion.getInstance().logSendCompletionRequest(it, LLMRequestType.Companion.byRequest(request), request.getBody()); } CodeCompletionIntention$trySendingStreamingRequest$onRequestSent$1(CompositeStatisticsIdeActivity $activity) { super(1); } } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class CodeCompletionIntention$showSuggestionSynchronously$1$1 extends Lambda implements Function0<Unit> { public final void invoke() { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   4: aload_0
/*     */       //   5: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   8: aload_0
/*     */       //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */       //   12: aload_0
/*     */       //   13: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   16: aload_0
/*     */       //   17: getfield $offset : I
/*     */       //   20: aload_0
/*     */       //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   24: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lcom/intellij/openapi/editor/Editor;ILcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*     */       //   29: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */       //   32: aload_0
/*     */       //   33: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   36: aload_0
/*     */       //   37: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   40: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */       //   43: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */       //   46: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #144	-> 0
/*     */       //   #148	-> 32
/*     */       //   #149	-> 46
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	47	0	this	Lcom/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$showSuggestionSynchronously$1$1; }
/* 145 */     private static final void invoke$lambda$0(Project $project, LLMResponseChoice $it, Editor $editor, int $offset, CompositeStatisticsIdeActivity $activity) { Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); CodeCompletionIntention.Companion.insertStringAndSaveChange$default(CodeCompletionIntention.Companion, $project, $it.getText(), $editor.getDocument(), $offset, false, 16, null);
/* 146 */       CommonLoggerService.Companion.getInstance().logCompletionFinished($activity, $it.getText(), FinishState.SUCCEED); }
/*     */     
/*     */     CodeCompletionIntention$showSuggestionSynchronously$1$1(Project $project, CompositeStatisticsIdeActivity $activity, LLMResponseChoice $it, Editor $editor, int $offset) {
/*     */       super(0);
/*     */     } }
/*     */   
/*     */   public boolean startInWriteAction() {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J0\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\b\b\002\020\r\032\0020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention$Companion;", "", "()V", "insertStringAndSaveChange", "", "project", "Lcom/intellij/openapi/project/Project;", "suggestion", "", "document", "Lcom/intellij/openapi/editor/Document;", "startOffset", "", "withReformat", "", "intellij.ml.llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     public final void insertStringAndSaveChange(@NotNull Project project, @NotNull String suggestion, @NotNull Document document, int startOffset, boolean withReformat) {
/* 163 */       Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(suggestion, "suggestion"); Intrinsics.checkNotNullParameter(document, "document"); document.insertString(startOffset, suggestion);
/* 164 */       PsiDocumentManager.getInstance(project).commitDocument(document);
/*     */       
/* 166 */       if (withReformat) {
/* 167 */         PsiFile psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document);
/* 168 */         PsiFile it = psiFile; int $i$a$-let-CodeCompletionIntention$Companion$insertStringAndSaveChange$1 = 0;
/* 169 */         TextRange reformatRange = new TextRange(startOffset, startOffset + suggestion.length());
/* 170 */         CodeStyleManager.getInstance(project).reformatText(it, CollectionsKt.listOf(reformatRange));
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/CodeCompletionIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */