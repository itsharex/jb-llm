/*     */ package com.intellij.ml.llm.python.intentions.inline;
/*     */ import com.intellij.ml.llm.python.PythonLLMBundle;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.NavigatablePsiElement;
/*     */ import com.intellij.psi.PsiComment;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.jetbrains.python.psi.PyIndentUtil;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\004\030\0002\0020\001:\001%B\005¢\006\002\020\002J\022\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H\002J\b\020\f\032\0020\007H\026J\b\020\r\032\0020\007H\026J:\020\016\032\0020\0172\006\020\020\032\0020\0212\b\020\022\032\004\030\0010\0232\006\020\024\032\0020\0072\006\020\025\032\0020\0072\006\020\026\032\0020\0272\006\020\030\032\0020\007H\002J%\020\031\032\0020\0172\006\020\020\032\0020\0212\b\020\n\032\004\030\0010\0132\b\020\032\032\004\030\0010\033H\002J$\020\034\032\0020\0352\006\020\020\032\0020\0212\b\020\n\032\004\030\0010\0132\b\020\032\032\004\030\0010\033H\026J\b\020\036\032\0020\035H\026J@\020\037\032\0020\0172\006\020 \032\0020\0072\006\020\020\032\0020\0212\006\020\n\032\0020\0132\006\020!\032\0020\"2\006\020#\032\0020\t2\006\020$\032\0020\0072\006\020\024\032\0020\007H\002R\023\020\003\032\0070\004¢\006\002\b\005X\004¢\006\002\n\000R\016\020\006\032\0020\007XD¢\006\002\n\000¨\006&"}, d2 = {"Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "writeActionGroupId", "", "getCommentToCompleteUnder", "Lcom/intellij/psi/PsiComment;", "editor", "Lcom/intellij/openapi/editor/Editor;", "getFamilyName", "getText", "insertStreaming", "", "project", "Lcom/intellij/openapi/project/Project;", "documentRange", "Lcom/intellij/openapi/editor/RangeMarker;", "endCommentText", "suggestion", "document", "Lcom/intellij/openapi/editor/Document;", "newLineIndent", "invoke", "file", "Lcom/intellij/psi/PsiFile;", "isAvailable", "", "startInWriteAction", "startStreamingCompletion", "instruction", "scopeOwner", "Lcom/intellij/psi/PsiElement;", "endComment", "startCommentText", "StreamingState", "intellij.ml.llm.python"})
/*     */ public final class PythonCodeCompletionUnderCommentIntention implements IntentionAction {
/*     */   @NotNull
/*     */   private final Logger logger;
/*     */   @NotNull
/*     */   private final String writeActionGroupId;
/*     */   
/*     */   public PythonCodeCompletionUnderCommentIntention() {
/*  29 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")"); this.logger = Logger.getInstance("#com.intellij.ml.llm");
/*     */     
/*  31 */     this.writeActionGroupId = "python.add.type.annotations.write.action";
/*     */   }
/*  33 */   public boolean startInWriteAction() { return false; }
/*     */   @NotNull
/*  35 */   public String getFamilyName() { return PythonLLMBundle.message("intentions.code.completion.under.comment.family.name", new Object[0]); } @NotNull
/*     */   public String getText() {
/*  37 */     return PythonLLMBundle.message("intentions.code.completion.under.comment.name", new Object[0]);
/*     */   }
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  40 */     Intrinsics.checkNotNullParameter(project, "project"); if (!Registry.is("llm.is.internal")) return false; 
/*  41 */     return (editor != null && file != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: aload_1
/*     */     //   8: aload_2
/*     */     //   9: aload_3
/*     */     //   10: invokevirtual isAvailable : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;)Z
/*     */     //   13: ifne -> 17
/*     */     //   16: return
/*     */     //   17: aload_2
/*     */     //   18: ifnonnull -> 22
/*     */     //   21: return
/*     */     //   22: aload_3
/*     */     //   23: ifnonnull -> 27
/*     */     //   26: return
/*     */     //   27: aload_0
/*     */     //   28: aload_2
/*     */     //   29: invokespecial getCommentToCompleteUnder : (Lcom/intellij/openapi/editor/Editor;)Lcom/intellij/psi/PsiComment;
/*     */     //   32: dup
/*     */     //   33: ifnonnull -> 38
/*     */     //   36: pop
/*     */     //   37: return
/*     */     //   38: astore #4
/*     */     //   40: aload #4
/*     */     //   42: checkcast com/intellij/psi/PsiElement
/*     */     //   45: invokestatic getScopeOwner : (Lcom/intellij/psi/PsiElement;)Lcom/jetbrains/python/codeInsight/controlflow/ScopeOwner;
/*     */     //   48: dup
/*     */     //   49: ifnull -> 58
/*     */     //   52: checkcast com/intellij/psi/NavigatablePsiElement
/*     */     //   55: goto -> 69
/*     */     //   58: pop
/*     */     //   59: aload #4
/*     */     //   61: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
/*     */     //   66: checkcast com/intellij/psi/NavigatablePsiElement
/*     */     //   69: dup
/*     */     //   70: ifnonnull -> 75
/*     */     //   73: pop
/*     */     //   74: return
/*     */     //   75: astore #5
/*     */     //   77: aload #4
/*     */     //   79: checkcast com/intellij/psi/PsiElement
/*     */     //   82: invokestatic getElementIndent : (Lcom/intellij/psi/PsiElement;)Ljava/lang/String;
/*     */     //   85: dup
/*     */     //   86: ldc 'getElementIndent(comment)'
/*     */     //   88: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   91: astore #6
/*     */     //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   96: dup
/*     */     //   97: invokespecial <init> : ()V
/*     */     //   100: astore #7
/*     */     //   102: aload #7
/*     */     //   104: aload_1
/*     */     //   105: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/jetbrains/python/psi/PyElementGenerator;
/*     */     //   108: aload #4
/*     */     //   110: checkcast com/intellij/psi/PsiElement
/*     */     //   113: invokestatic forElement : (Lcom/intellij/psi/PsiElement;)Lcom/jetbrains/python/psi/LanguageLevel;
/*     */     //   116: ldc com/intellij/psi/PsiComment
/*     */     //   118: ldc '# end of the code completion'
/*     */     //   120: invokevirtual createFromText : (Lcom/jetbrains/python/psi/LanguageLevel;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   123: dup
/*     */     //   124: ldc 'getInstance(project).cre… of the code completion")'
/*     */     //   126: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   129: putfield element : Ljava/lang/Object;
/*     */     //   132: aload #4
/*     */     //   134: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   139: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiParserFacade;
/*     */     //   142: astore #8
/*     */     //   144: aload #8
/*     */     //   146: aload #6
/*     */     //   148: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   153: invokeinterface createWhiteSpaceFromText : (Ljava/lang/String;)Lcom/intellij/psi/PsiElement;
/*     */     //   158: dup
/*     */     //   159: ldc 'parserFacade.createWhite…mText("\n$commentIndent")'
/*     */     //   161: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   164: astore #9
/*     */     //   166: aload #4
/*     */     //   168: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   173: astore #10
/*     */     //   175: aload #7
/*     */     //   177: getfield element : Ljava/lang/Object;
/*     */     //   180: checkcast com/intellij/psi/PsiComment
/*     */     //   183: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   188: astore #11
/*     */     //   190: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */     //   193: aload_1
/*     */     //   194: aload #4
/*     */     //   196: aload #7
/*     */     //   198: aload #9
/*     */     //   200: <illegal opcode> run : (Lcom/intellij/psi/PsiComment;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/psi/PsiElement;)Ljava/lang/Runnable;
/*     */     //   205: ldc 'intentions.code.completion.under.comment.command.add.end.comment'
/*     */     //   207: iconst_0
/*     */     //   208: anewarray java/lang/Object
/*     */     //   211: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   214: aconst_null
/*     */     //   215: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   218: aload #5
/*     */     //   220: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   225: astore #12
/*     */     //   227: ldc 'intentions.request.background.process.title'
/*     */     //   229: iconst_0
/*     */     //   230: anewarray java/lang/Object
/*     */     //   233: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   236: astore #14
/*     */     //   238: new com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$invoke$task$1
/*     */     //   241: dup
/*     */     //   242: aload_1
/*     */     //   243: aload #12
/*     */     //   245: aload_0
/*     */     //   246: aload_2
/*     */     //   247: aload #5
/*     */     //   249: aload #7
/*     */     //   251: aload #10
/*     */     //   253: aload #11
/*     */     //   255: aload #14
/*     */     //   257: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/NavigatablePsiElement;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   260: astore #13
/*     */     //   262: invokestatic getInstance : ()Lcom/intellij/openapi/progress/ProgressManager;
/*     */     //   265: aload #13
/*     */     //   267: checkcast com/intellij/openapi/progress/Task$Backgroundable
/*     */     //   270: new com/intellij/openapi/progress/impl/BackgroundableProcessIndicator
/*     */     //   273: dup
/*     */     //   274: aload #13
/*     */     //   276: checkcast com/intellij/openapi/progress/Task$Backgroundable
/*     */     //   279: invokespecial <init> : (Lcom/intellij/openapi/progress/Task$Backgroundable;)V
/*     */     //   282: checkcast com/intellij/openapi/progress/ProgressIndicator
/*     */     //   285: invokevirtual runProcessWithProgressAsynchronously : (Lcom/intellij/openapi/progress/Task$Backgroundable;Lcom/intellij/openapi/progress/ProgressIndicator;)V
/*     */     //   288: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 6
/*     */     //   #46	-> 17
/*     */     //   #47	-> 22
/*     */     //   #48	-> 27
/*     */     //   #49	-> 40
/*     */     //   #50	-> 77
/*     */     //   #52	-> 93
/*     */     //   #53	-> 132
/*     */     //   #54	-> 144
/*     */     //   #56	-> 166
/*     */     //   #57	-> 175
/*     */     //   #59	-> 190
/*     */     //   #65	-> 205
/*     */     //   #59	-> 215
/*     */     //   #67	-> 218
/*     */     //   #70	-> 227
/*     */     //   #69	-> 260
/*     */     //   #86	-> 262
/*     */     //   #87	-> 288
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	249	4	comment	Lcom/intellij/psi/PsiComment;
/*     */     //   77	212	5	scopeOwner	Lcom/intellij/psi/NavigatablePsiElement;
/*     */     //   93	196	6	commentIndent	Ljava/lang/String;
/*     */     //   102	187	7	endComment	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   144	145	8	parserFacade	Lcom/intellij/psi/PsiParserFacade;
/*     */     //   166	123	9	whiteSpace	Lcom/intellij/psi/PsiElement;
/*     */     //   175	114	10	startCommentText	Ljava/lang/String;
/*     */     //   190	99	11	endCommentText	Ljava/lang/String;
/*     */     //   227	62	12	scopeOwnerText	Ljava/lang/String;
/*     */     //   262	27	13	task	Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$invoke$task$1;
/*     */     //   0	289	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */     //   0	289	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	289	2	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   0	289	3	file	Lcom/intellij/psi/PsiFile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void invoke$lambda$0(PsiComment $comment, Ref.ObjectRef<PsiComment> $endComment, PsiElement $whiteSpace)
/*     */   {
/*  60 */     Intrinsics.checkNotNullParameter($comment, "$comment"); Intrinsics.checkNotNullParameter($endComment, "$endComment"); Intrinsics.checkNotNullParameter($whiteSpace, "$whiteSpace"); ActionsKt.runWriteAction(new PythonCodeCompletionUnderCommentIntention$invoke$1$1($comment, $endComment, $whiteSpace)); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*  61 */   static final class PythonCodeCompletionUnderCommentIntention$invoke$1$1 extends Lambda implements Function0<Unit> { public final void invoke() { PsiElement parent = this.$comment.getParent();
/*  62 */       Intrinsics.checkNotNull(parent.addAfter((PsiElement)this.$endComment.element, (PsiElement)this.$comment), "null cannot be cast to non-null type com.intellij.psi.PsiComment"); this.$endComment.element = parent.addAfter((PsiElement)this.$endComment.element, (PsiElement)this.$comment);
/*  63 */       parent.addAfter(this.$whiteSpace, (PsiElement)this.$comment); }
/*     */     
/*     */     PythonCodeCompletionUnderCommentIntention$invoke$1$1(PsiComment $comment, Ref.ObjectRef<PsiComment> $endComment, PsiElement $whiteSpace) {
/*     */       super(0);
/*     */     } }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$invoke$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.python"})
/*     */   public static final class PythonCodeCompletionUnderCommentIntention$invoke$task$1 extends Task.Backgroundable { PythonCodeCompletionUnderCommentIntention$invoke$task$1(String $scopeOwnerText, PythonCodeCompletionUnderCommentIntention $receiver, Editor $editor, NavigatablePsiElement $scopeOwner, Ref.ObjectRef<PsiComment> $endComment, String $startCommentText, String $endCommentText, String $super_call_param$1) {
/*  70 */       super($project, $super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void run(@NotNull ProgressIndicator indicator) {
/*  78 */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*     */       
/*  80 */       String instruction = StringsKt.trimIndent("\nComplete code strictly between TODO comment and the end of completion comment\nYou MUST NOT add code not between this comments and MUST NOT change comments text\n\n```\n" + this.$scopeOwnerText + "\n```\n          ");
/*     */       
/*  82 */       Intrinsics.checkNotNullExpressionValue(this.$startCommentText, "startCommentText"); Intrinsics.checkNotNullExpressionValue(this.$endCommentText, "endCommentText"); PythonCodeCompletionUnderCommentIntention.this.startStreamingCompletion(instruction, this.$project, this.$editor, (PsiElement)this.$scopeOwner, (PsiComment)this.$endComment.element, this.$startCommentText, this.$endCommentText);
/*     */     } }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "finish", "", "success", "", "run", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm.python"}) public static final class PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1 extends LLMStreamingRequestConsumer {
/*     */     PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1(Ref.ObjectRef<PythonCodeCompletionUnderCommentIntention.StreamingState> $streamingState, String $startCommentText, Project $project, PythonCodeCompletionUnderCommentIntention $receiver, Ref.ObjectRef<RangeMarker> $documentRange, String $endCommentText, Editor $editor, Ref.ObjectRef<String> $newLineIndent, PsiElement $scopeOwner, PsiComment $endComment) {}
/*     */     public boolean run(@NotNull LLMResponseChoice choice) { // Byte code:
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
/*     */       //   19: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */       //   22: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   25: dup
/*     */       //   26: ldc 'suggestion.toString()'
/*     */       //   28: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   31: astore_2
/*     */       //   32: aload_0
/*     */       //   33: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   36: getfield element : Ljava/lang/Object;
/*     */       //   39: checkcast com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState
/*     */       //   42: getstatic com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */       //   45: swap
/*     */       //   46: invokevirtual ordinal : ()I
/*     */       //   49: iaload
/*     */       //   50: tableswitch default -> 411, 1 -> 76, 2 -> 318, 3 -> 411
/*     */       //   76: aload_2
/*     */       //   77: checkcast java/lang/CharSequence
/*     */       //   80: aload_0
/*     */       //   81: getfield $startCommentText : Ljava/lang/String;
/*     */       //   84: checkcast java/lang/CharSequence
/*     */       //   87: iconst_0
/*     */       //   88: iconst_2
/*     */       //   89: aconst_null
/*     */       //   90: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   93: ifeq -> 411
/*     */       //   96: aload_0
/*     */       //   97: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   100: getstatic com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState.IN_PROGRESS : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState;
/*     */       //   103: putfield element : Ljava/lang/Object;
/*     */       //   106: aload_0
/*     */       //   107: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   110: ldc 'Write action start streaming'
/*     */       //   112: aload_0
/*     */       //   113: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */       //   116: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;)Ljava/lang/String;
/*     */       //   119: aload_0
/*     */       //   120: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   123: aload_0
/*     */       //   124: getfield $scopeOwner : Lcom/intellij/psi/PsiElement;
/*     */       //   127: aload_0
/*     */       //   128: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   131: aload_0
/*     */       //   132: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   135: aload_0
/*     */       //   136: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   139: aload_0
/*     */       //   140: getfield $endComment : Lcom/intellij/psi/PsiComment;
/*     */       //   143: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/psi/PsiComment;)Ljava/lang/Runnable;
/*     */       //   148: iconst_0
/*     */       //   149: anewarray com/intellij/psi/PsiFile
/*     */       //   152: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */       //   155: aload_1
/*     */       //   156: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   159: astore_3
/*     */       //   160: ldc ''
/*     */       //   162: astore #4
/*     */       //   164: iconst_0
/*     */       //   165: istore #5
/*     */       //   167: aload_3
/*     */       //   168: invokevirtual length : ()I
/*     */       //   171: istore #6
/*     */       //   173: iload #5
/*     */       //   175: iload #6
/*     */       //   177: if_icmpge -> 242
/*     */       //   180: aload_3
/*     */       //   181: iconst_0
/*     */       //   182: aload_3
/*     */       //   183: invokevirtual length : ()I
/*     */       //   186: iload #5
/*     */       //   188: isub
/*     */       //   189: invokevirtual substring : (II)Ljava/lang/String;
/*     */       //   192: dup
/*     */       //   193: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
/*     */       //   195: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   198: astore #7
/*     */       //   200: aload_0
/*     */       //   201: getfield $startCommentText : Ljava/lang/String;
/*     */       //   204: aload #7
/*     */       //   206: iconst_0
/*     */       //   207: iconst_2
/*     */       //   208: aconst_null
/*     */       //   209: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   212: ifne -> 242
/*     */       //   215: aload_3
/*     */       //   216: aload_3
/*     */       //   217: invokevirtual length : ()I
/*     */       //   220: iconst_1
/*     */       //   221: isub
/*     */       //   222: iload #5
/*     */       //   224: isub
/*     */       //   225: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   228: dup
/*     */       //   229: ldc 'this as java.lang.String).substring(startIndex)'
/*     */       //   231: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   234: astore #4
/*     */       //   236: iinc #5, 1
/*     */       //   239: goto -> 173
/*     */       //   242: aload #4
/*     */       //   244: checkcast java/lang/CharSequence
/*     */       //   247: invokeinterface length : ()I
/*     */       //   252: ifle -> 259
/*     */       //   255: iconst_1
/*     */       //   256: goto -> 260
/*     */       //   259: iconst_0
/*     */       //   260: ifeq -> 411
/*     */       //   263: aload_0
/*     */       //   264: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */       //   267: aload_0
/*     */       //   268: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   271: aload_0
/*     */       //   272: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   275: getfield element : Ljava/lang/Object;
/*     */       //   278: checkcast com/intellij/openapi/editor/RangeMarker
/*     */       //   281: aload_0
/*     */       //   282: getfield $endCommentText : Ljava/lang/String;
/*     */       //   285: aload #4
/*     */       //   287: aload_0
/*     */       //   288: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   291: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */       //   296: dup
/*     */       //   297: ldc 'editor.document'
/*     */       //   299: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   302: aload_0
/*     */       //   303: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   306: getfield element : Ljava/lang/Object;
/*     */       //   309: checkcast java/lang/String
/*     */       //   312: invokestatic access$insertStreaming : (Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)V
/*     */       //   315: goto -> 411
/*     */       //   318: aload_2
/*     */       //   319: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   322: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   325: dup
/*     */       //   326: ldc 'this as java.lang.String).toLowerCase(Locale.ROOT)'
/*     */       //   328: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   331: checkcast java/lang/CharSequence
/*     */       //   334: aload_0
/*     */       //   335: getfield $endCommentText : Ljava/lang/String;
/*     */       //   338: checkcast java/lang/CharSequence
/*     */       //   341: iconst_0
/*     */       //   342: iconst_2
/*     */       //   343: aconst_null
/*     */       //   344: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */       //   347: ifeq -> 357
/*     */       //   350: aload_0
/*     */       //   351: iconst_1
/*     */       //   352: invokevirtual finish : (Z)V
/*     */       //   355: iconst_1
/*     */       //   356: ireturn
/*     */       //   357: aload_0
/*     */       //   358: getfield this$0 : Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */       //   361: aload_0
/*     */       //   362: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   365: aload_0
/*     */       //   366: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   369: getfield element : Ljava/lang/Object;
/*     */       //   372: checkcast com/intellij/openapi/editor/RangeMarker
/*     */       //   375: aload_0
/*     */       //   376: getfield $endCommentText : Ljava/lang/String;
/*     */       //   379: aload_1
/*     */       //   380: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   383: aload_0
/*     */       //   384: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */       //   387: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */       //   392: dup
/*     */       //   393: ldc 'editor.document'
/*     */       //   395: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   398: aload_0
/*     */       //   399: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   402: getfield element : Ljava/lang/Object;
/*     */       //   405: checkcast java/lang/String
/*     */       //   408: invokestatic access$insertStreaming : (Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;)V
/*     */       //   411: iconst_1
/*     */       //   412: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #100	-> 6
/*     */       //   #101	-> 18
/*     */       //   #102	-> 32
/*     */       //   #104	-> 76
/*     */       //   #105	-> 96
/*     */       //   #109	-> 106
/*     */       //   #110	-> 112
/*     */       //   #109	-> 119
/*     */       //   #120	-> 155
/*     */       //   #121	-> 160
/*     */       //   #122	-> 164
/*     */       //   #123	-> 180
/*     */       //   #123	-> 198
/*     */       //   #124	-> 200
/*     */       //   #125	-> 215
/*     */       //   #125	-> 234
/*     */       //   #122	-> 236
/*     */       //   #128	-> 242
/*     */       //   #128	-> 260
/*     */       //   #129	-> 263
/*     */       //   #135	-> 318
/*     */       //   #135	-> 331
/*     */       //   #136	-> 350
/*     */       //   #137	-> 355
/*     */       //   #139	-> 357
/*     */       //   #145	-> 411
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   200	36	7	substr	Ljava/lang/String;
/*     */       //   167	75	5	i	I
/*     */       //   160	155	3	choiceText	Ljava/lang/String;
/*     */       //   164	151	4	textToInsert	Ljava/lang/String;
/*     */       //   32	381	2	currentSuggestion	Ljava/lang/String;
/*     */       //   0	413	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1;
/*     */       //   0	413	1	choice	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice; } private static final void run$lambda$0(Ref.ObjectRef $newLineIndent, PsiElement $scopeOwner, Project $project, Editor $editor, Ref.ObjectRef $documentRange, PsiComment $endComment) { Intrinsics.checkNotNullParameter($newLineIndent, "$newLineIndent"); Intrinsics.checkNotNullParameter($scopeOwner, "$scopeOwner"); Intrinsics.checkNotNullParameter($project, "$project");
/*     */       Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */       Intrinsics.checkNotNullParameter($documentRange, "$documentRange");
/*     */       Intrinsics.checkNotNullParameter($endComment, "$endComment");
/*     */       Intrinsics.checkNotNullExpressionValue(PyIndentUtil.getElementIndent($scopeOwner), "getElementIndent(scopeOwner)");
/*     */       $newLineIndent.element = PyIndentUtil.getElementIndent($scopeOwner);
/*     */       PsiDocumentManager.getInstance($project).doPostponedOperationsAndUnblockDocument($editor.getDocument());
/*     */       $documentRange.element = $editor.getDocument().createRangeMarker($endComment.getTextRange()); } public void finish(boolean success) { super.finish(success); }
/*     */   } private final void insertStreaming(Project project, RangeMarker documentRange, String endCommentText, String suggestion, Document document, String newLineIndent) { // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w '\\n'
/*     */     //   5: aload #6
/*     */     //   7: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   12: iconst_0
/*     */     //   13: iconst_4
/*     */     //   14: aconst_null
/*     */     //   15: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   18: astore #7
/*     */     //   20: aload #7
/*     */     //   22: aload_2
/*     */     //   23: aload_3
/*     */     //   24: aload #6
/*     */     //   26: aload #5
/*     */     //   28: aload_1
/*     */     //   29: <illegal opcode> run : (Ljava/lang/String;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/project/Project;)Ljava/lang/Runnable;
/*     */     //   34: astore #8
/*     */     //   36: aload_1
/*     */     //   37: ldc_w 'intentions.write.documentation.write.action.name'
/*     */     //   40: iconst_0
/*     */     //   41: anewarray java/lang/Object
/*     */     //   44: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   47: aload_0
/*     */     //   48: getfield writeActionGroupId : Ljava/lang/String;
/*     */     //   51: aload #8
/*     */     //   53: iconst_0
/*     */     //   54: anewarray com/intellij/psi/PsiFile
/*     */     //   57: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   60: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #159	-> 0
/*     */     //   #160	-> 2
/*     */     //   #159	-> 18
/*     */     //   #162	-> 20
/*     */     //   #170	-> 36
/*     */     //   #171	-> 60
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   20	41	7	cleanedText	Ljava/lang/String;
/*     */     //   36	25	8	task	Ljava/lang/Runnable;
/*     */     //   0	61	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention;
/*     */     //   0	61	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	61	2	documentRange	Lcom/intellij/openapi/editor/RangeMarker;
/*     */     //   0	61	3	endCommentText	Ljava/lang/String;
/*     */     //   0	61	4	suggestion	Ljava/lang/String;
/*     */     //   0	61	5	document	Lcom/intellij/openapi/editor/Document;
/*  94 */     //   0	61	6	newLineIndent	Ljava/lang/String; } private final void startStreamingCompletion(String instruction, Project project, Editor editor, PsiElement scopeOwner, PsiComment endComment, String startCommentText, String endCommentText) { Ref.ObjectRef<RangeMarker> documentRange = new Ref.ObjectRef();
/*  95 */     Ref.ObjectRef<String> newLineIndent = new Ref.ObjectRef(); newLineIndent.element = "";
/*  96 */     Ref.ObjectRef<StreamingState> streamingState = new Ref.ObjectRef(); streamingState.element = StreamingState.WAITING_TO_START;
/*  97 */     StringBuilder suggestion = new StringBuilder();
/*  98 */     PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1 consumer = new PythonCodeCompletionUnderCommentIntention$startStreamingCompletion$consumer$1(streamingState, startCommentText, project, this, documentRange, endCommentText, editor, newLineIndent, scopeOwner, endComment);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     SenderKt.sendCompletionChatRequest$default(project, instruction, "", null, null, null, null, null, null, 0, null, consumer, null, 6136, null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void insertStreaming$lambda$1(String $cleanedText, RangeMarker $documentRange, String $endCommentText, String $newLineIndent, Document $document, Project $project) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w '$cleanedText'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w '$endCommentText'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w '$newLineIndent'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload #4
/*     */     //   23: ldc_w '$document'
/*     */     //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   29: aload #5
/*     */     //   31: ldc_w '$project'
/*     */     //   34: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   37: aload_0
/*     */     //   38: checkcast java/lang/CharSequence
/*     */     //   41: invokeinterface length : ()I
/*     */     //   46: ifne -> 53
/*     */     //   49: iconst_1
/*     */     //   50: goto -> 54
/*     */     //   53: iconst_0
/*     */     //   54: ifeq -> 58
/*     */     //   57: return
/*     */     //   58: aload_1
/*     */     //   59: dup
/*     */     //   60: ifnull -> 83
/*     */     //   63: invokeinterface getEndOffset : ()I
/*     */     //   68: aload_2
/*     */     //   69: invokevirtual length : ()I
/*     */     //   72: aload_3
/*     */     //   73: invokevirtual length : ()I
/*     */     //   76: iadd
/*     */     //   77: iconst_1
/*     */     //   78: iadd
/*     */     //   79: isub
/*     */     //   80: goto -> 85
/*     */     //   83: pop
/*     */     //   84: return
/*     */     //   85: istore #6
/*     */     //   87: aload #4
/*     */     //   89: iload #6
/*     */     //   91: aload_0
/*     */     //   92: checkcast java/lang/CharSequence
/*     */     //   95: invokeinterface insertString : (ILjava/lang/CharSequence;)V
/*     */     //   100: aload #5
/*     */     //   102: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   105: aload #4
/*     */     //   107: invokevirtual commitDocument : (Lcom/intellij/openapi/editor/Document;)V
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #163	-> 37
/*     */     //   #163	-> 54
/*     */     //   #165	-> 58
/*     */     //   #166	-> 87
/*     */     //   #167	-> 100
/*     */     //   #168	-> 110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   87	24	6	insertingOffset	I
/*     */     //   0	111	0	$cleanedText	Ljava/lang/String;
/*     */     //   0	111	1	$documentRange	Lcom/intellij/openapi/editor/RangeMarker;
/*     */     //   0	111	2	$endCommentText	Ljava/lang/String;
/*     */     //   0	111	3	$newLineIndent	Ljava/lang/String;
/*     */     //   0	111	4	$document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	111	5	$project	Lcom/intellij/openapi/project/Project;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final PsiComment getCommentToCompleteUnder(Editor editor) {
/* 174 */     PsiElement element = PsiUtilBase.getElementAtCaret(editor);
/* 175 */     if (element instanceof PsiComment) return (PsiComment)element; 
/* 176 */     return (PsiComment)PsiTreeUtil.getParentOfType(element, PsiComment.class);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention$StreamingState;", "", "(Ljava/lang/String;I)V", "WAITING_TO_START", "IN_PROGRESS", "FINISHED", "intellij.ml.llm.python"})
/* 180 */   private enum StreamingState { WAITING_TO_START,
/* 181 */     IN_PROGRESS,
/* 182 */     FINISHED; }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonCodeCompletionUnderCommentIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */