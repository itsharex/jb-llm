/*     */ package com.intellij.ml.llm.python.intentions.inline;
/*     */ 
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMStreamingRequestConsumer;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiComment;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.jetbrains.python.psi.PyIndentUtil;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "finish", "", "success", "", "run", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm.python"})
/*     */ public final class PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1
/*     */   extends LLMStreamingRequestConsumer
/*     */ {
/*     */   PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1(Ref.ObjectRef<PythonCodeCompletionUnderCommentIntention.StreamingState> $streamingState, String $startCommentText, Project $project, PythonCodeCompletionUnderCommentIntention $receiver, Ref.ObjectRef<RangeMarker> $documentRange, String $endCommentText, Editor $editor, Ref.ObjectRef<String> $newLineIndent, PsiElement $scopeOwner, PsiComment $endComment) {}
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
/*     */     //   19: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */     //   22: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   25: dup
/*     */     //   26: ldc 'suggestion.toString()'
/*     */     //   28: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   31: astore_2
/*     */     //   32: aload_0
/*     */     //   33: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   36: getfield element : Ljava/lang/Object;
/*     */     //   39: checkcast com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState
/*     */     //   42: getstatic com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   45: swap
/*     */     //   46: invokevirtual ordinal : ()I
/*     */     //   49: iaload
/*     */     //   50: tableswitch default -> 411, 1 -> 76, 2 -> 318, 3 -> 411
/*     */     //   76: aload_2
/*     */     //   77: checkcast java/lang/CharSequence
/*     */     //   80: aload_0
/*     */     //   81: getfield $startCommentText : Ljava/lang/String;
/*     */     //   84: checkcast java/lang/CharSequence
/*     */     //   87: iconst_0
/*     */     //   88: iconst_2
/*     */     //   89: aconst_null
/*     */     //   90: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   93: ifeq -> 411
/*     */     //   96: aload_0
/*     */     //   97: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   100: getstatic com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState.IN_PROGRESS : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState;
/*     */     //   103: putfield element : Ljava/lang/Object;
/*     */     //   106: aload_0
/*     */     //   107: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   110: ldc 'Write action start streaming'
/*     */     //   112: aload_0
/*     */     //   113: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */     //   116: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;)Ljava/lang/String;
/*     */     //   119: aload_0
/*     */     //   120: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   123: aload_0
/*     */     //   124: getfield $scopeOwner : Lcom/intellij/psi/PsiElement;
/*     */     //   127: aload_0
/*     */     //   128: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   131: aload_0
/*     */     //   132: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   135: aload_0
/*     */     //   136: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   139: aload_0
/*     */     //   140: getfield $endComment : Lcom/intellij/psi/PsiComment;
/*     */     //   143: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/psi/PsiComment;)Ljava/lang/Runnable;
/*     */     //   148: iconst_0
/*     */     //   149: anewarray com/intellij/psi/PsiFile
/*     */     //   152: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   155: aload_1
/*     */     //   156: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   159: astore_3
/*     */     //   160: ldc ''
/*     */     //   162: astore #4
/*     */     //   164: iconst_0
/*     */     //   165: istore #5
/*     */     //   167: aload_3
/*     */     //   168: invokevirtual length : ()I
/*     */     //   171: istore #6
/*     */     //   173: iload #5
/*     */     //   175: iload #6
/*     */     //   177: if_icmpge -> 242
/*     */     //   180: aload_3
/*     */     //   181: iconst_0
/*     */     //   182: aload_3
/*     */     //   183: invokevirtual length : ()I
/*     */     //   186: iload #5
/*     */     //   188: isub
/*     */     //   189: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   192: dup
/*     */     //   193: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
/*     */     //   195: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   198: astore #7
/*     */     //   200: aload_0
/*     */     //   201: getfield $startCommentText : Ljava/lang/String;
/*     */     //   204: aload #7
/*     */     //   206: iconst_0
/*     */     //   207: iconst_2
/*     */     //   208: aconst_null
/*     */     //   209: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   212: ifne -> 242
/*     */     //   215: aload_3
/*     */     //   216: aload_3
/*     */     //   217: invokevirtual length : ()I
/*     */     //   220: iconst_1
/*     */     //   221: isub
/*     */     //   222: iload #5
/*     */     //   224: isub
/*     */     //   225: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   228: dup
/*     */     //   229: ldc 'this as java.lang.String).substring(startIndex)'
/*     */     //   231: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   234: astore #4
/*     */     //   236: iinc #5, 1
/*     */     //   239: goto -> 173
/*     */     //   242: aload #4
/*     */     //   244: checkcast java/lang/CharSequence
/*     */     //   247: invokeinterface length : ()I
/*     */     //   252: ifle -> 259
/*     */     //   255: iconst_1
/*     */     //   256: goto -> 260
/*     */     //   259: iconst_0
/*     */     //   260: ifeq -> 411
/*     */     //   263: aload_0
/*     */     //   264: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */     //   267: aload_0
/*     */     //   268: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   271: aload_0
/*     */     //   272: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   275: getfield element : Ljava/lang/Object;
/*     */     //   278: checkcast com/intellij/openapi/editor/RangeMarker
/*     */     //   281: aload_0
/*     */     //   282: getfield $endCommentText : Ljava/lang/String;
/*     */     //   285: aload #4
/*     */     //   287: aload_0
/*     */     //   288: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   291: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   296: dup
/*     */     //   297: ldc 'editor.document'
/*     */     //   299: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   302: aload_0
/*     */     //   303: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   306: getfield element : Ljava/lang/Object;
/*     */     //   309: checkcast java/lang/String
/*     */     //   312: invokestatic access$insertStreaming : (Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)V
/*     */     //   315: goto -> 411
/*     */     //   318: aload_2
/*     */     //   319: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   322: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   325: dup
/*     */     //   326: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */     //   328: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   331: checkcast java/lang/CharSequence
/*     */     //   334: aload_0
/*     */     //   335: getfield $endCommentText : Ljava/lang/String;
/*     */     //   338: checkcast java/lang/CharSequence
/*     */     //   341: iconst_0
/*     */     //   342: iconst_2
/*     */     //   343: aconst_null
/*     */     //   344: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   347: ifeq -> 357
/*     */     //   350: aload_0
/*     */     //   351: iconst_1
/*     */     //   352: invokevirtual finish : (Z)V
/*     */     //   355: iconst_1
/*     */     //   356: ireturn
/*     */     //   357: aload_0
/*     */     //   358: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */     //   361: aload_0
/*     */     //   362: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   365: aload_0
/*     */     //   366: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   369: getfield element : Ljava/lang/Object;
/*     */     //   372: checkcast com/intellij/openapi/editor/RangeMarker
/*     */     //   375: aload_0
/*     */     //   376: getfield $endCommentText : Ljava/lang/String;
/*     */     //   379: aload_1
/*     */     //   380: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   383: aload_0
/*     */     //   384: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */     //   387: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   392: dup
/*     */     //   393: ldc 'editor.document'
/*     */     //   395: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   398: aload_0
/*     */     //   399: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   402: getfield element : Ljava/lang/Object;
/*     */     //   405: checkcast java/lang/String
/*     */     //   408: invokestatic access$insertStreaming : (Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)V
/*     */     //   411: iconst_1
/*     */     //   412: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #100	-> 6
/*     */     //   #101	-> 18
/*     */     //   #102	-> 32
/*     */     //   #104	-> 76
/*     */     //   #105	-> 96
/*     */     //   #109	-> 106
/*     */     //   #110	-> 112
/*     */     //   #109	-> 119
/*     */     //   #120	-> 155
/*     */     //   #121	-> 160
/*     */     //   #122	-> 164
/*     */     //   #123	-> 180
/*     */     //   #123	-> 198
/*     */     //   #124	-> 200
/*     */     //   #125	-> 215
/*     */     //   #125	-> 234
/*     */     //   #122	-> 236
/*     */     //   #128	-> 242
/*     */     //   #128	-> 260
/*     */     //   #129	-> 263
/*     */     //   #135	-> 318
/*     */     //   #135	-> 331
/*     */     //   #136	-> 350
/*     */     //   #137	-> 355
/*     */     //   #139	-> 357
/*     */     //   #145	-> 411
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   200	36	7	substr	Ljava/lang/String;
/*     */     //   167	75	5	i	I
/*     */     //   160	155	3	choiceText	Ljava/lang/String;
/*     */     //   164	151	4	textToInsert	Ljava/lang/String;
/*     */     //   32	381	2	currentSuggestion	Ljava/lang/String;
/*     */     //   0	413	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1;
/*     */     //   0	413	1	choice	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */   }
/*     */   
/*     */   private static final void run$lambda$0(Ref.ObjectRef $newLineIndent, PsiElement $scopeOwner, Project $project, Editor $editor, Ref.ObjectRef $documentRange, PsiComment $endComment) {
/* 112 */     Intrinsics.checkNotNullParameter($newLineIndent, "$newLineIndent"); Intrinsics.checkNotNullParameter($scopeOwner, "$scopeOwner"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter($documentRange, "$documentRange"); Intrinsics.checkNotNullParameter($endComment, "$endComment"); Intrinsics.checkNotNullExpressionValue(PyIndentUtil.getElementIndent($scopeOwner), "getElementIndent(scopeOwner)"); $newLineIndent.element = PyIndentUtil.getElementIndent($scopeOwner);
/*     */     
/* 114 */     PsiDocumentManager.getInstance($project).doPostponedOperationsAndUnblockDocument(
/* 115 */         $editor.getDocument());
/*     */     
/* 117 */     $documentRange.element = $editor.getDocument().createRangeMarker($endComment.getTextRange());
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
/*     */   public void finish(boolean success) {
/* 149 */     super.finish(success);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */