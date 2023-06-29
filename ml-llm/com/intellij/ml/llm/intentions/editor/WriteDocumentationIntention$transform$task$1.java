/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.core.LLMDocumentationSupport;
/*     */ import com.intellij.ml.llm.core.NotificationsKt;
/*     */ import com.intellij.ml.llm.core.models.SenderKt;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import com.intellij.ml.llm.core.settings.LLMSettingsManager;
/*     */ import com.intellij.ml.llm.core.statistics.CommonLoggerService;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.ml.llm.core.statistics.FinishState;
/*     */ import com.intellij.ml.llm.core.statistics.StatisticsIdeActivities;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.progress.Task;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.refactoring.suggested.UtilsKt;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*     */ public final class WriteDocumentationIntention$transform$task$1
/*     */   extends Task.Backgroundable
/*     */ {
/*     */   WriteDocumentationIntention$transform$task$1(LLMDocumentationSupport $languageSupport, WriteDocumentationIntention $receiver, String $instruction, String $text, Function1<LLMBaseRequest<?>, Unit> $onSent, PsiFile $file, Editor $editor, PsiElement $element, CompositeStatisticsIdeActivity $activity, Function1<String, Boolean> $validator, String $super_call_param$1) {
/* 126 */     super($project, $super_call_param$1);
/*     */   } public void run(@NotNull ProgressIndicator indicator) {
/* 128 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); if (LLMSettingsManager.Companion.getInstance().isStreamingEnabled() && this.$languageSupport != null) {
/* 129 */       Ref.ObjectRef<RangeMarker> documentRange = new Ref.ObjectRef();
/* 130 */       Ref.ObjectRef<String> newLineIndent = new Ref.ObjectRef(); newLineIndent.element = "";
/* 131 */       Ref.ObjectRef<WriteDocumentationIntention.StreamingDocumentationState> streamingState = new Ref.ObjectRef(); streamingState.element = WriteDocumentationIntention.StreamingDocumentationState.WAITING_TO_START;
/* 132 */       StringBuilder suggestion = new StringBuilder();
/* 133 */       Ref.ObjectRef<String> prevDoc = new Ref.ObjectRef();
/* 134 */       WriteDocumentationIntention.access$setStreamingConsumer$p(WriteDocumentationIntention.this, new WriteDocumentationIntention$transform$task$1$run$1(streamingState, this.$languageSupport, this.$project, WriteDocumentationIntention.this, this.$file, documentRange, this.$editor, newLineIndent, prevDoc, this.$element, this.$activity));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 207 */       SenderKt.sendCompletionChatRequest$default(this.$project, this.$instruction + "\n" + this.$instruction, "", null, null, null, null, null, null, 0, this.$onSent, 
/* 208 */           WriteDocumentationIntention.access$getStreamingConsumer$p(WriteDocumentationIntention.this), null, 5112, null);
/*     */     } else {
/*     */       
/* 211 */       LLMBaseResponse response = SenderKt.sendEditRequest$default(
/* 212 */           this.$project, 
/* 213 */           this.$text, 
/* 214 */           this.$instruction, null, null, 
/* 215 */           this.$onSent, null, 88, null);
/*     */       
/* 217 */       if (response != null) {
/* 218 */         LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); WriteDocumentationIntention writeDocumentationIntention = WriteDocumentationIntention.this; Project project = this.$project; LLMDocumentationSupport lLMDocumentationSupport = this.$languageSupport; Function1<String, Boolean> function1 = this.$validator; PsiElement psiElement = this.$element; Editor editor = this.$editor; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; LLMResponseChoice it = lLMResponseChoice1; int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$2 = 0;
/* 219 */         WriteDocumentationIntention.access$getLogger$p(writeDocumentationIntention).info("Suggested documentation: " + it);
/* 220 */         ActionsKt.invokeLater$default(null, new WriteDocumentationIntention$transform$task$1$run$2$1(writeDocumentationIntention, lLMDocumentationSupport, it, function1, psiElement, editor, compositeStatisticsIdeActivity), 1, null);
/*     */         (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "finish", "", "success", "", "run", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*     */   @SourceDebugExtension({"SMAP\nWriteDocumentationIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n1855#2,2:404\n*S KotlinDebug\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1\n*L\n163#1:404,2\n*E\n"})
/*     */   public static final class WriteDocumentationIntention$transform$task$1$run$1
/*     */     extends LLMStreamingRequestConsumer
/*     */   {
/*     */     WriteDocumentationIntention$transform$task$1$run$1(Ref.ObjectRef<WriteDocumentationIntention.StreamingDocumentationState> $streamingState, LLMDocumentationSupport $languageSupport, Project $project, WriteDocumentationIntention $receiver, PsiFile $file, Ref.ObjectRef<RangeMarker> $documentRange, Editor $editor, Ref.ObjectRef<String> $newLineIndent, Ref.ObjectRef<String> $prevDoc, PsiElement $element, CompositeStatisticsIdeActivity $activity) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean run(@NotNull LLMResponseChoice choice) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'choice'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */       //   10: aload_1
/*     */       //   11: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */       //   17: pop
/*     */       //   18: aload_0
/*     */       //   19: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   22: getfield element : Ljava/lang/Object;
/*     */       //   25: checkcast com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState
/*     */       //   28: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */       //   31: swap
/*     */       //   32: invokevirtual ordinal : ()I
/*     */       //   35: iaload
/*     */       //   36: tableswitch default -> 402, 1 -> 64, 2 -> 295, 3 -> 402
/*     */       //   64: aload_1
/*     */       //   65: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   68: checkcast java/lang/CharSequence
/*     */       //   71: aload_0
/*     */       //   72: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   75: invokeinterface getCommentStart : ()Ljava/lang/String;
/*     */       //   80: checkcast java/lang/CharSequence
/*     */       //   83: iconst_0
/*     */       //   84: iconst_2
/*     */       //   85: aconst_null
/*     */       //   86: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   89: ifeq -> 230
/*     */       //   92: aload_0
/*     */       //   93: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   96: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.IN_PROGRESS : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */       //   99: putfield element : Ljava/lang/Object;
/*     */       //   102: aload_0
/*     */       //   103: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   106: ldc 'intentions.write.documentation.write.action.name'
/*     */       //   108: iconst_0
/*     */       //   109: anewarray java/lang/Object
/*     */       //   112: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   115: aload_0
/*     */       //   116: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   119: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */       //   122: aload_0
/*     */       //   123: getfield $prevDoc : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   126: aload_0
/*     */       //   127: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   130: aload_0
/*     */       //   131: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */       //   134: aload_0
/*     */       //   135: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   138: aload_0
/*     */       //   139: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   142: aload_0
/*     */       //   143: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   146: aload_0
/*     */       //   147: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   150: aload_0
/*     */       //   151: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   154: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Runnable;
/*     */       //   159: iconst_0
/*     */       //   160: anewarray com/intellij/psi/PsiFile
/*     */       //   163: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */       //   166: aload_0
/*     */       //   167: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   170: aload_0
/*     */       //   171: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   174: aload_0
/*     */       //   175: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */       //   178: aload_0
/*     */       //   179: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   182: getfield element : Ljava/lang/Object;
/*     */       //   185: checkcast com/intellij/openapi/editor/RangeMarker
/*     */       //   188: aload_1
/*     */       //   189: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   192: aload_0
/*     */       //   193: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   196: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */       //   201: dup
/*     */       //   202: ldc 'editor.document'
/*     */       //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   207: aload_0
/*     */       //   208: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   211: dup
/*     */       //   212: ldc 'languageSupport'
/*     */       //   214: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   217: aload_0
/*     */       //   218: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   221: getfield element : Ljava/lang/Object;
/*     */       //   224: checkcast java/lang/String
/*     */       //   227: invokestatic access$insertStreamingDocumentation : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Ljava/lang/String;)V
/*     */       //   230: aload_1
/*     */       //   231: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   234: checkcast java/lang/CharSequence
/*     */       //   237: aload_0
/*     */       //   238: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   241: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */       //   246: checkcast java/lang/CharSequence
/*     */       //   249: iconst_0
/*     */       //   250: iconst_2
/*     */       //   251: aconst_null
/*     */       //   252: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   255: ifeq -> 402
/*     */       //   258: aload_0
/*     */       //   259: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   262: invokeinterface getCommentStart : ()Ljava/lang/String;
/*     */       //   267: aload_0
/*     */       //   268: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   271: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */       //   276: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   279: ifne -> 402
/*     */       //   282: aload_0
/*     */       //   283: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   286: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */       //   289: putfield element : Ljava/lang/Object;
/*     */       //   292: goto -> 402
/*     */       //   295: aload_0
/*     */       //   296: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   299: aload_0
/*     */       //   300: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   303: aload_0
/*     */       //   304: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */       //   307: aload_0
/*     */       //   308: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   311: getfield element : Ljava/lang/Object;
/*     */       //   314: checkcast com/intellij/openapi/editor/RangeMarker
/*     */       //   317: aload_1
/*     */       //   318: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   321: aload_0
/*     */       //   322: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   325: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */       //   330: dup
/*     */       //   331: ldc 'editor.document'
/*     */       //   333: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   336: aload_0
/*     */       //   337: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   340: dup
/*     */       //   341: ldc 'languageSupport'
/*     */       //   343: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   346: aload_0
/*     */       //   347: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   350: getfield element : Ljava/lang/Object;
/*     */       //   353: checkcast java/lang/String
/*     */       //   356: invokestatic access$insertStreamingDocumentation : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Ljava/lang/String;)V
/*     */       //   359: aload_1
/*     */       //   360: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   363: checkcast java/lang/CharSequence
/*     */       //   366: aload_0
/*     */       //   367: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   370: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */       //   375: checkcast java/lang/CharSequence
/*     */       //   378: iconst_0
/*     */       //   379: iconst_2
/*     */       //   380: aconst_null
/*     */       //   381: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   384: ifeq -> 402
/*     */       //   387: aload_0
/*     */       //   388: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   391: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */       //   394: putfield element : Ljava/lang/Object;
/*     */       //   397: aload_0
/*     */       //   398: iconst_1
/*     */       //   399: invokevirtual finish : (Z)V
/*     */       //   402: iconst_1
/*     */       //   403: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #136	-> 6
/*     */       //   #137	-> 18
/*     */       //   #139	-> 64
/*     */       //   #140	-> 92
/*     */       //   #144	-> 102
/*     */       //   #145	-> 115
/*     */       //   #144	-> 122
/*     */       //   #167	-> 166
/*     */       //   #168	-> 217
/*     */       //   #167	-> 227
/*     */       //   #170	-> 230
/*     */       //   #171	-> 282
/*     */       //   #175	-> 295
/*     */       //   #176	-> 359
/*     */       //   #177	-> 387
/*     */       //   #178	-> 397
/*     */       //   #183	-> 402
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	404	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1;
/*     */       //   0	404	1	choice	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final void run$lambda$2(Ref.ObjectRef $prevDoc, LLMDocumentationSupport $languageSupport, PsiElement $element, Ref.ObjectRef $newLineIndent, Project $project, Editor $editor, WriteDocumentationIntention this$0, Ref.ObjectRef $documentRange) {
/*     */       Intrinsics.checkNotNullParameter($prevDoc, "$prevDoc");
/*     */       Intrinsics.checkNotNullParameter($element, "$element");
/*     */       Intrinsics.checkNotNullParameter($newLineIndent, "$newLineIndent");
/*     */       Intrinsics.checkNotNullParameter($project, "$project");
/*     */       Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */       Intrinsics.checkNotNullParameter(WriteDocumentationIntention.this, "this$0");
/*     */       Intrinsics.checkNotNullParameter($documentRange, "$documentRange");
/*     */       $languageSupport.getDocComment($element);
/*     */       $prevDoc.element = ($languageSupport.getDocComment($element) != null) ? $languageSupport.getDocComment($element).getText() : null;
/*     */       $languageSupport.replaceComment($element, $languageSupport.getEmptyComment());
/*     */       $newLineIndent.element = $languageSupport.calculateNewLineIndent($element);
/*     */       if ((((CharSequence)$newLineIndent.element).length() > 0)) {
/*     */         String emptyCommentWithOffset = $languageSupport.getCommentStart() + "\n" + $languageSupport.getCommentStart() + $newLineIndent.element;
/*     */         $languageSupport.replaceComment($element, emptyCommentWithOffset);
/*     */       } 
/*     */       PsiDocumentManager.getInstance($project).doPostponedOperationsAndUnblockDocument($editor.getDocument());
/*     */       PsiElement it = $languageSupport.getDocComment($element);
/*     */       int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$run$1$1 = 0;
/*     */       $documentRange.element = $editor.getDocument().createRangeMarker(UtilsKt.getStartOffset(it), UtilsKt.getEndOffset(it));
/*     */       $languageSupport.getDocComment($element);
/*     */       Iterable $this$forEach$iv = WriteDocumentationIntention.access$getOnStreamingStartedListeners$p(WriteDocumentationIntention.this);
/*     */       int $i$f$forEach = 0;
/* 404 */       Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Function0 function0 = (Function0)element$iv; int $i$a$-forEach-WriteDocumentationIntention$transform$task$1$run$1$run$1$2 = 0;
/*     */         function0.invoke(); }
/*     */     
/*     */     }
/*     */     
/*     */     public void finish(boolean success) {
/*     */       // Byte code:
/*     */       //   0: iload_1
/*     */       //   1: ifne -> 20
/*     */       //   4: aload_0
/*     */       //   5: iconst_0
/*     */       //   6: invokespecial finish : (Z)V
/*     */       //   9: aload_0
/*     */       //   10: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   13: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */       //   16: putfield element : Ljava/lang/Object;
/*     */       //   19: return
/*     */       //   20: aload_0
/*     */       //   21: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   24: ldc 'intentions.write.documentation.write.action.name'
/*     */       //   26: iconst_0
/*     */       //   27: anewarray java/lang/Object
/*     */       //   30: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   33: aload_0
/*     */       //   34: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   37: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */       //   40: aload_0
/*     */       //   41: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   44: aload_0
/*     */       //   45: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */       //   48: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;)Ljava/lang/Runnable;
/*     */       //   53: iconst_0
/*     */       //   54: anewarray com/intellij/psi/PsiFile
/*     */       //   57: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */       //   60: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */       //   63: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */       //   66: aload_0
/*     */       //   67: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   70: aload_0
/*     */       //   71: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */       //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   77: dup
/*     */       //   78: ldc 'suggestion.toString()'
/*     */       //   80: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   83: getstatic com/intellij/ml/llm/core/statistics/FinishState.SUCCEED : Lcom/intellij/ml/llm/core/statistics/FinishState;
/*     */       //   86: aload_0
/*     */       //   87: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */       //   90: aload_0
/*     */       //   91: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */       //   94: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*     */       //   99: invokevirtual logDocumentationGenerationFinished : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Ljava/lang/String;Lcom/intellij/ml/llm/core/statistics/FinishState;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;)V
/*     */       //   102: aload_0
/*     */       //   103: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   106: invokestatic access$getLogger$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   109: aload_0
/*     */       //   110: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */       //   113: <illegal opcode> makeConcatWithConstants : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */       //   118: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   121: aload_0
/*     */       //   122: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   125: getfield element : Ljava/lang/Object;
/*     */       //   128: checkcast com/intellij/openapi/editor/RangeMarker
/*     */       //   131: dup
/*     */       //   132: ifnull -> 213
/*     */       //   135: astore_2
/*     */       //   136: aload_0
/*     */       //   137: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   140: astore_3
/*     */       //   141: aload_0
/*     */       //   142: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   145: astore #4
/*     */       //   147: aload_0
/*     */       //   148: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   151: astore #5
/*     */       //   153: aload_0
/*     */       //   154: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   157: astore #6
/*     */       //   159: aload_2
/*     */       //   160: astore #7
/*     */       //   162: iconst_0
/*     */       //   163: istore #8
/*     */       //   165: aload_3
/*     */       //   166: aload #4
/*     */       //   168: aload #7
/*     */       //   170: invokeinterface findEndOfCommentOffset : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/RangeMarker;)Ljava/lang/Integer;
/*     */       //   175: dup
/*     */       //   176: ifnull -> 208
/*     */       //   179: checkcast java/lang/Number
/*     */       //   182: invokevirtual intValue : ()I
/*     */       //   185: istore #9
/*     */       //   187: iconst_0
/*     */       //   188: istore #10
/*     */       //   190: aload #5
/*     */       //   192: aload #4
/*     */       //   194: aload #6
/*     */       //   196: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */       //   199: iload #9
/*     */       //   201: invokestatic showScoreNotificationInlay : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;I)V
/*     */       //   204: nop
/*     */       //   205: goto -> 210
/*     */       //   208: pop
/*     */       //   209: nop
/*     */       //   210: goto -> 215
/*     */       //   213: pop
/*     */       //   214: nop
/*     */       //   215: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #188	-> 0
/*     */       //   #189	-> 4
/*     */       //   #190	-> 9
/*     */       //   #191	-> 19
/*     */       //   #193	-> 20
/*     */       //   #194	-> 33
/*     */       //   #193	-> 40
/*     */       //   #197	-> 60
/*     */       //   #198	-> 86
/*     */       //   #197	-> 99
/*     */       //   #199	-> 102
/*     */       //   #200	-> 121
/*     */       //   #201	-> 165
/*     */       //   #202	-> 190
/*     */       //   #203	-> 204
/*     */       //   #201	-> 205
/*     */       //   #201	-> 208
/*     */       //   #200	-> 210
/*     */       //   #200	-> 213
/*     */       //   #205	-> 215
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   190	15	10	$i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$finish$2$1	I
/*     */       //   187	18	9	offset	I
/*     */       //   165	45	8	$i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$finish$2	I
/*     */       //   162	48	7	range	Lcom/intellij/openapi/editor/RangeMarker;
/*     */       //   0	216	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1;
/*     */       //   0	216	1	success	Z
/*     */     }
/*     */     
/*     */     private static final void finish$lambda$3(LLMDocumentationSupport $languageSupport, PsiElement $element) {
/*     */       Intrinsics.checkNotNullParameter($element, "$element");
/*     */       $languageSupport.reformatFinalDocumentation($element);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class WriteDocumentationIntention$transform$task$1$run$2$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   4: ldc 'intentions.write.documentation.write.action.name'
/*     */       //   6: iconst_0
/*     */       //   7: anewarray java/lang/Object
/*     */       //   10: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   13: aload_0
/*     */       //   14: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   17: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */       //   20: aload_0
/*     */       //   21: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   24: aload_0
/*     */       //   25: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */       //   28: aload_0
/*     */       //   29: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */       //   32: aload_0
/*     */       //   33: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */       //   36: aload_0
/*     */       //   37: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   40: aload_0
/*     */       //   41: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */       //   44: aload_0
/*     */       //   45: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   48: aload_0
/*     */       //   49: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   52: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*     */       //   57: iconst_0
/*     */       //   58: anewarray com/intellij/psi/PsiFile
/*     */       //   61: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */       //   64: aload_0
/*     */       //   65: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */       //   68: aload_0
/*     */       //   69: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */       //   72: aload_0
/*     */       //   73: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   76: aload_0
/*     */       //   77: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   80: aload_0
/*     */       //   81: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */       //   84: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Lcom/intellij/util/ThrowableRunnable;
/*     */       //   89: invokestatic run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */       //   92: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #221	-> 0
/*     */       //   #222	-> 13
/*     */       //   #221	-> 20
/*     */       //   #234	-> 64
/*     */       //   #240	-> 92
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	93	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$2$1;
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$0(LLMDocumentationSupport $languageSupport, WriteDocumentationIntention this$0, LLMResponseChoice $it, Function1 $validator, Project $project, PsiElement $element, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */       Intrinsics.checkNotNullParameter(WriteDocumentationIntention.this, "this$0");
/*     */       Intrinsics.checkNotNullParameter($it, "$it");
/*     */       Intrinsics.checkNotNullParameter($validator, "$validator");
/*     */       Intrinsics.checkNotNullParameter($project, "$project");
/*     */       Intrinsics.checkNotNullParameter($element, "$element");
/*     */       Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */       Intrinsics.checkNotNullParameter($activity, "$activity");
/*     */       if ($languageSupport == null || $languageSupport.getCommentStart() == null)
/*     */         $languageSupport.getCommentStart(); 
/*     */       String commentStart = "";
/*     */       if ($languageSupport == null || $languageSupport.getCommentEnd() == null)
/*     */         $languageSupport.getCommentEnd(); 
/*     */       String commentEnd = "";
/*     */       String suggestion = WriteDocumentationIntention.access$preprocessSuggestion(WriteDocumentationIntention.this, $it.getText(), commentStart, commentEnd);
/*     */       if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/*     */         WriteDocumentationIntention.access$getLogger$p(WriteDocumentationIntention.this).warn("Ignored suggestion: " + suggestion);
/*     */         return;
/*     */       } 
/*     */       Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*     */       WriteDocumentationIntention.access$replaceOrAddDocumentation(WriteDocumentationIntention.this, $project, $element, suggestion, $editor.getDocument());
/*     */       CommonLoggerService.logDocumentationGenerationFinished$default(CommonLoggerService.Companion.getInstance(), $activity, suggestion, FinishState.SUCCEED, null, null, 24, null);
/*     */     }
/*     */     
/*     */     private static final void invoke$lambda$2(LLMDocumentationSupport $languageSupport, PsiElement $element, Project $project, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */       Intrinsics.checkNotNullParameter($element, "$element");
/*     */       Intrinsics.checkNotNullParameter($project, "$project");
/*     */       Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */       Intrinsics.checkNotNullParameter($activity, "$activity");
/*     */       PsiElement docComment = $languageSupport.getDocComment($element);
/*     */       int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$2$1$2$1 = 0;
/*     */       NotificationsKt.showScoreNotificationInlay($project, $editor, (StatisticsIdeActivities)$activity, UtilsKt.getEndOffset(docComment));
/*     */       $languageSupport.getDocComment($element);
/*     */     }
/*     */     
/*     */     WriteDocumentationIntention$transform$task$1$run$2$1(WriteDocumentationIntention $receiver, LLMDocumentationSupport $languageSupport, LLMResponseChoice $it, Function1<String, Boolean> $validator, PsiElement $element, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */