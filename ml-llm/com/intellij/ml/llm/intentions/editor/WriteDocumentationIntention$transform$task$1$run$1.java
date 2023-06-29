/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.ml.llm.core.LLMDocumentationSupport;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.refactoring.suggested.UtilsKt;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "finish", "", "success", "", "run", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nWriteDocumentationIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n1855#2,2:404\n*S KotlinDebug\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1\n*L\n163#1:404,2\n*E\n"})
/*     */ public final class WriteDocumentationIntention$transform$task$1$run$1
/*     */   extends LLMStreamingRequestConsumer
/*     */ {
/*     */   WriteDocumentationIntention$transform$task$1$run$1(Ref.ObjectRef<WriteDocumentationIntention.StreamingDocumentationState> $streamingState, LLMDocumentationSupport $languageSupport, Project $project, WriteDocumentationIntention $receiver, PsiFile $file, Ref.ObjectRef<RangeMarker> $documentRange, Editor $editor, Ref.ObjectRef<String> $newLineIndent, Ref.ObjectRef<String> $prevDoc, PsiElement $element, CompositeStatisticsIdeActivity $activity) {}
/*     */   
/*     */   public boolean run(@NotNull LLMResponseChoice choice) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'choice'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */     //   10: aload_1
/*     */     //   11: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   17: pop
/*     */     //   18: aload_0
/*     */     //   19: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   22: getfield element : Ljava/lang/Object;
/*     */     //   25: checkcast com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState
/*     */     //   28: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   31: swap
/*     */     //   32: invokevirtual ordinal : ()I
/*     */     //   35: iaload
/*     */     //   36: tableswitch default -> 402, 1 -> 64, 2 -> 295, 3 -> 402
/*     */     //   64: aload_1
/*     */     //   65: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   68: checkcast java/lang/CharSequence
/*     */     //   71: aload_0
/*     */     //   72: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   75: invokeinterface getCommentStart : ()Ljava/lang/String;
/*     */     //   80: checkcast java/lang/CharSequence
/*     */     //   83: iconst_0
/*     */     //   84: iconst_2
/*     */     //   85: aconst_null
/*     */     //   86: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   89: ifeq -> 230
/*     */     //   92: aload_0
/*     */     //   93: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   96: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.IN_PROGRESS : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */     //   99: putfield element : Ljava/lang/Object;
/*     */     //   102: aload_0
/*     */     //   103: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   106: ldc 'intentions.write.documentation.write.action.name'
/*     */     //   108: iconst_0
/*     */     //   109: anewarray java/lang/Object
/*     */     //   112: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   115: aload_0
/*     */     //   116: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   119: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */     //   122: aload_0
/*     */     //   123: getfield $prevDoc : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   126: aload_0
/*     */     //   127: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   130: aload_0
/*     */     //   131: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */     //   134: aload_0
/*     */     //   135: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   138: aload_0
/*     */     //   139: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   142: aload_0
/*     */     //   143: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   146: aload_0
/*     */     //   147: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   150: aload_0
/*     */     //   151: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   154: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Runnable;
/*     */     //   159: iconst_0
/*     */     //   160: anewarray com/intellij/psi/PsiFile
/*     */     //   163: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   166: aload_0
/*     */     //   167: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   170: aload_0
/*     */     //   171: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   174: aload_0
/*     */     //   175: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */     //   178: aload_0
/*     */     //   179: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   182: getfield element : Ljava/lang/Object;
/*     */     //   185: checkcast com/intellij/openapi/editor/RangeMarker
/*     */     //   188: aload_1
/*     */     //   189: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   192: aload_0
/*     */     //   193: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   196: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   201: dup
/*     */     //   202: ldc 'editor.document'
/*     */     //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   207: aload_0
/*     */     //   208: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   211: dup
/*     */     //   212: ldc 'languageSupport'
/*     */     //   214: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   217: aload_0
/*     */     //   218: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   221: getfield element : Ljava/lang/Object;
/*     */     //   224: checkcast java/lang/String
/*     */     //   227: invokestatic access$insertStreamingDocumentation : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Ljava/lang/String;)V
/*     */     //   230: aload_1
/*     */     //   231: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   234: checkcast java/lang/CharSequence
/*     */     //   237: aload_0
/*     */     //   238: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   241: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */     //   246: checkcast java/lang/CharSequence
/*     */     //   249: iconst_0
/*     */     //   250: iconst_2
/*     */     //   251: aconst_null
/*     */     //   252: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   255: ifeq -> 402
/*     */     //   258: aload_0
/*     */     //   259: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   262: invokeinterface getCommentStart : ()Ljava/lang/String;
/*     */     //   267: aload_0
/*     */     //   268: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   271: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */     //   276: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   279: ifne -> 402
/*     */     //   282: aload_0
/*     */     //   283: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   286: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */     //   289: putfield element : Ljava/lang/Object;
/*     */     //   292: goto -> 402
/*     */     //   295: aload_0
/*     */     //   296: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   299: aload_0
/*     */     //   300: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   303: aload_0
/*     */     //   304: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */     //   307: aload_0
/*     */     //   308: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   311: getfield element : Ljava/lang/Object;
/*     */     //   314: checkcast com/intellij/openapi/editor/RangeMarker
/*     */     //   317: aload_1
/*     */     //   318: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   321: aload_0
/*     */     //   322: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   325: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   330: dup
/*     */     //   331: ldc 'editor.document'
/*     */     //   333: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   336: aload_0
/*     */     //   337: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   340: dup
/*     */     //   341: ldc 'languageSupport'
/*     */     //   343: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   346: aload_0
/*     */     //   347: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   350: getfield element : Ljava/lang/Object;
/*     */     //   353: checkcast java/lang/String
/*     */     //   356: invokestatic access$insertStreamingDocumentation : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Ljava/lang/String;)V
/*     */     //   359: aload_1
/*     */     //   360: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   363: checkcast java/lang/CharSequence
/*     */     //   366: aload_0
/*     */     //   367: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   370: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */     //   375: checkcast java/lang/CharSequence
/*     */     //   378: iconst_0
/*     */     //   379: iconst_2
/*     */     //   380: aconst_null
/*     */     //   381: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   384: ifeq -> 402
/*     */     //   387: aload_0
/*     */     //   388: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   391: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */     //   394: putfield element : Ljava/lang/Object;
/*     */     //   397: aload_0
/*     */     //   398: iconst_1
/*     */     //   399: invokevirtual finish : (Z)V
/*     */     //   402: iconst_1
/*     */     //   403: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 6
/*     */     //   #137	-> 18
/*     */     //   #139	-> 64
/*     */     //   #140	-> 92
/*     */     //   #144	-> 102
/*     */     //   #145	-> 115
/*     */     //   #144	-> 122
/*     */     //   #167	-> 166
/*     */     //   #168	-> 217
/*     */     //   #167	-> 227
/*     */     //   #170	-> 230
/*     */     //   #171	-> 282
/*     */     //   #175	-> 295
/*     */     //   #176	-> 359
/*     */     //   #177	-> 387
/*     */     //   #178	-> 397
/*     */     //   #183	-> 402
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	404	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1;
/*     */     //   0	404	1	choice	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */   }
/*     */   
/*     */   private static final void run$lambda$2(Ref.ObjectRef $prevDoc, LLMDocumentationSupport $languageSupport, PsiElement $element, Ref.ObjectRef $newLineIndent, Project $project, Editor $editor, WriteDocumentationIntention this$0, Ref.ObjectRef $documentRange) {
/* 147 */     Intrinsics.checkNotNullParameter($prevDoc, "$prevDoc"); Intrinsics.checkNotNullParameter($element, "$element"); Intrinsics.checkNotNullParameter($newLineIndent, "$newLineIndent"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter(WriteDocumentationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($documentRange, "$documentRange"); $languageSupport.getDocComment($element); $prevDoc.element = ($languageSupport.getDocComment($element) != null) ? $languageSupport.getDocComment($element).getText() : null;
/* 148 */     $languageSupport.replaceComment($element, $languageSupport.getEmptyComment());
/*     */     
/* 150 */     $newLineIndent.element = $languageSupport.calculateNewLineIndent($element);
/* 151 */     if ((((CharSequence)$newLineIndent.element).length() > 0)) {
/* 152 */       String emptyCommentWithOffset = $languageSupport.getCommentStart() + "\n" + $languageSupport.getCommentStart() + 
/* 153 */         $newLineIndent.element;
/*     */       
/* 155 */       $languageSupport.replaceComment($element, emptyCommentWithOffset);
/*     */     } 
/*     */     
/* 158 */     PsiDocumentManager.getInstance($project).doPostponedOperationsAndUnblockDocument(
/* 159 */         $editor.getDocument());
/* 160 */     PsiElement it = $languageSupport.getDocComment($element); int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$run$1$1 = 0;
/* 161 */     $documentRange.element = $editor.getDocument().createRangeMarker(UtilsKt.getStartOffset(it), UtilsKt.getEndOffset(it));
/*     */     $languageSupport.getDocComment($element);
/* 163 */     Iterable $this$forEach$iv = WriteDocumentationIntention.access$getOnStreamingStartedListeners$p(WriteDocumentationIntention.this); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 404 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Function0 function0 = (Function0)element$iv; int $i$a$-forEach-WriteDocumentationIntention$transform$task$1$run$1$run$1$2 = 0;
/*     */       function0.invoke(); }
/*     */   
/*     */   }
/*     */   
/*     */   public void finish(boolean success) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: ifne -> 20
/*     */     //   4: aload_0
/*     */     //   5: iconst_0
/*     */     //   6: invokespecial finish : (Z)V
/*     */     //   9: aload_0
/*     */     //   10: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   13: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */     //   16: putfield element : Ljava/lang/Object;
/*     */     //   19: return
/*     */     //   20: aload_0
/*     */     //   21: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   24: ldc 'intentions.write.documentation.write.action.name'
/*     */     //   26: iconst_0
/*     */     //   27: anewarray java/lang/Object
/*     */     //   30: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   33: aload_0
/*     */     //   34: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   37: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */     //   40: aload_0
/*     */     //   41: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   44: aload_0
/*     */     //   45: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */     //   48: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;)Ljava/lang/Runnable;
/*     */     //   53: iconst_0
/*     */     //   54: anewarray com/intellij/psi/PsiFile
/*     */     //   57: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   60: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */     //   63: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */     //   66: aload_0
/*     */     //   67: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   70: aload_0
/*     */     //   71: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */     //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   77: dup
/*     */     //   78: ldc 'suggestion.toString()'
/*     */     //   80: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   83: getstatic com/intellij/ml/llm/core/statistics/FinishState.SUCCEED : Lcom/intellij/ml/llm/core/statistics/FinishState;
/*     */     //   86: aload_0
/*     */     //   87: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */     //   90: aload_0
/*     */     //   91: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */     //   94: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*     */     //   99: invokevirtual logDocumentationGenerationFinished : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Ljava/lang/String;Lcom/intellij/ml/llm/core/statistics/FinishState;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;)V
/*     */     //   102: aload_0
/*     */     //   103: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   106: invokestatic access$getLogger$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   109: aload_0
/*     */     //   110: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */     //   113: <illegal opcode> makeConcatWithConstants : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */     //   118: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   121: aload_0
/*     */     //   122: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   125: getfield element : Ljava/lang/Object;
/*     */     //   128: checkcast com/intellij/openapi/editor/RangeMarker
/*     */     //   131: dup
/*     */     //   132: ifnull -> 213
/*     */     //   135: astore_2
/*     */     //   136: aload_0
/*     */     //   137: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   140: astore_3
/*     */     //   141: aload_0
/*     */     //   142: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   145: astore #4
/*     */     //   147: aload_0
/*     */     //   148: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   151: astore #5
/*     */     //   153: aload_0
/*     */     //   154: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */     //   157: astore #6
/*     */     //   159: aload_2
/*     */     //   160: astore #7
/*     */     //   162: iconst_0
/*     */     //   163: istore #8
/*     */     //   165: aload_3
/*     */     //   166: aload #4
/*     */     //   168: aload #7
/*     */     //   170: invokeinterface findEndOfCommentOffset : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/RangeMarker;)Ljava/lang/Integer;
/*     */     //   175: dup
/*     */     //   176: ifnull -> 208
/*     */     //   179: checkcast java/lang/Number
/*     */     //   182: invokevirtual intValue : ()I
/*     */     //   185: istore #9
/*     */     //   187: iconst_0
/*     */     //   188: istore #10
/*     */     //   190: aload #5
/*     */     //   192: aload #4
/*     */     //   194: aload #6
/*     */     //   196: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */     //   199: iload #9
/*     */     //   201: invokestatic showScoreNotificationInlay : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;I)V
/*     */     //   204: nop
/*     */     //   205: goto -> 210
/*     */     //   208: pop
/*     */     //   209: nop
/*     */     //   210: goto -> 215
/*     */     //   213: pop
/*     */     //   214: nop
/*     */     //   215: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #188	-> 0
/*     */     //   #189	-> 4
/*     */     //   #190	-> 9
/*     */     //   #191	-> 19
/*     */     //   #193	-> 20
/*     */     //   #194	-> 33
/*     */     //   #193	-> 40
/*     */     //   #197	-> 60
/*     */     //   #198	-> 86
/*     */     //   #197	-> 99
/*     */     //   #199	-> 102
/*     */     //   #200	-> 121
/*     */     //   #201	-> 165
/*     */     //   #202	-> 190
/*     */     //   #203	-> 204
/*     */     //   #201	-> 205
/*     */     //   #201	-> 208
/*     */     //   #200	-> 210
/*     */     //   #200	-> 213
/*     */     //   #205	-> 215
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   190	15	10	$i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$finish$2$1	I
/*     */     //   187	18	9	offset	I
/*     */     //   165	45	8	$i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$finish$2	I
/*     */     //   162	48	7	range	Lcom/intellij/openapi/editor/RangeMarker;
/*     */     //   0	216	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1;
/*     */     //   0	216	1	success	Z
/*     */   }
/*     */   
/*     */   private static final void finish$lambda$3(LLMDocumentationSupport $languageSupport, PsiElement $element) {
/*     */     Intrinsics.checkNotNullParameter($element, "$element");
/*     */     $languageSupport.reformatFinalDocumentation($element);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */