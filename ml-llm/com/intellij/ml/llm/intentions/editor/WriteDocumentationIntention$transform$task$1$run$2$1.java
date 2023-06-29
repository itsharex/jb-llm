/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.core.LLMDocumentationSupport;
/*     */ import com.intellij.ml.llm.core.NotificationsKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.ml.llm.core.statistics.StatisticsIdeActivities;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.refactoring.suggested.UtilsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class WriteDocumentationIntention$transform$task$1$run$2$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: ldc 'intentions.write.documentation.write.action.name'
/*     */     //   6: iconst_0
/*     */     //   7: anewarray java/lang/Object
/*     */     //   10: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   13: aload_0
/*     */     //   14: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   17: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */     //   20: aload_0
/*     */     //   21: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   24: aload_0
/*     */     //   25: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   28: aload_0
/*     */     //   29: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     //   32: aload_0
/*     */     //   33: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */     //   36: aload_0
/*     */     //   37: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   40: aload_0
/*     */     //   41: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */     //   44: aload_0
/*     */     //   45: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   48: aload_0
/*     */     //   49: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   52: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*     */     //   57: iconst_0
/*     */     //   58: anewarray com/intellij/psi/PsiFile
/*     */     //   61: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   64: aload_0
/*     */     //   65: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   68: aload_0
/*     */     //   69: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */     //   72: aload_0
/*     */     //   73: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   76: aload_0
/*     */     //   77: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   80: aload_0
/*     */     //   81: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   84: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Lcom/intellij/util/ThrowableRunnable;
/*     */     //   89: invokestatic run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */     //   92: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #221	-> 0
/*     */     //   #222	-> 13
/*     */     //   #221	-> 20
/*     */     //   #234	-> 64
/*     */     //   #240	-> 92
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	93	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$2$1;
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$0(LLMDocumentationSupport $languageSupport, WriteDocumentationIntention this$0, LLMResponseChoice $it, Function1 $validator, Project $project, PsiElement $element, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/* 223 */     Intrinsics.checkNotNullParameter(WriteDocumentationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($validator, "$validator"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($element, "$element"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($activity, "$activity"); if ($languageSupport == null || $languageSupport.getCommentStart() == null) $languageSupport.getCommentStart();  String commentStart = "";
/* 224 */     if ($languageSupport == null || $languageSupport.getCommentEnd() == null) $languageSupport.getCommentEnd();  String commentEnd = "";
/* 225 */     String suggestion = WriteDocumentationIntention.access$preprocessSuggestion(WriteDocumentationIntention.this, $it.getText(), commentStart, commentEnd);
/* 226 */     if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/* 227 */       WriteDocumentationIntention.access$getLogger$p(WriteDocumentationIntention.this).warn("Ignored suggestion: " + suggestion);
/*     */       return;
/*     */     } 
/* 230 */     Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document"); WriteDocumentationIntention.access$replaceOrAddDocumentation(WriteDocumentationIntention.this, $project, $element, suggestion, $editor.getDocument());
/* 231 */     CommonLoggerService.logDocumentationGenerationFinished$default(CommonLoggerService.Companion.getInstance(), $activity, suggestion, FinishState.SUCCEED, null, null, 24, null);
/*     */   }
/*     */   
/*     */   private static final void invoke$lambda$2(LLMDocumentationSupport $languageSupport, PsiElement $element, Project $project, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/* 235 */     Intrinsics.checkNotNullParameter($element, "$element"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($activity, "$activity"); PsiElement docComment = $languageSupport.getDocComment($element); int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$2$1$2$1 = 0;
/*     */     
/* 237 */     NotificationsKt.showScoreNotificationInlay($project, $editor, (StatisticsIdeActivities)$activity, UtilsKt.getEndOffset(docComment));
/*     */     $languageSupport.getDocComment($element);
/*     */   }
/*     */   
/*     */   WriteDocumentationIntention$transform$task$1$run$2$1(WriteDocumentationIntention $receiver, LLMDocumentationSupport $languageSupport, LLMResponseChoice $it, Function1<String, Boolean> $validator, PsiElement $element, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */