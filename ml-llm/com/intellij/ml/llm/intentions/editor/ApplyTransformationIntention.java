/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.SelectionModel;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000t\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\016\b&\030\000 72\0020\001:\0017B/\022\n\b\002\020\002\032\004\030\0010\003\022\034\b\002\020\004\032\026\022\004\022\0020\003\022\004\022\0020\006\022\004\022\0020\007\030\0010\005¢\006\002\020\bJ\025\020\020\032\0070\006¢\006\002\b\0212\006\020\022\032\0020\023H\026J\020\020\024\032\0020\0062\006\020\025\032\0020\003H\026J+\020\026\032\035\022\023\022\0210\006¢\006\f\b\030\022\b\b\031\022\004\b\b(\032\022\004\022\0020\0330\0272\006\020\025\032\0020\034H\026J\b\020\035\032\0020\006H\026J&\020\036\032\004\030\0010\0062\006\020\037\032\0020 2\b\020!\032\004\030\0010\"2\b\020\025\032\004\030\0010\003H&J\030\020#\032\0020$2\006\020%\032\0020&2\006\020!\032\0020\"H\002J\022\020'\032\004\030\0010\0232\006\020!\032\0020\"H\002J%\020(\032\0020\0072\006\020\037\032\0020 2\b\020!\032\004\030\0010\"2\b\020)\032\004\030\0010*H\002J$\020+\032\0020\0332\006\020\037\032\0020 2\b\020!\032\004\030\0010\"2\b\020)\032\004\030\0010*H\026J\020\020,\032\0020\0062\006\020\032\032\0020\006H\026J\b\020-\032\0020\033H\026J(\020.\032\0020\0072\006\020\037\032\0020 2\006\020/\032\0020\0062\006\020!\032\0020\"2\006\0200\032\0020$H\002JU\020.\032\0020\0072\006\020\037\032\0020 2\006\020/\032\0020\0062\006\020!\032\0020\"2\006\0200\032\0020$2\006\0201\032\0020\0062#\b\002\0202\032\035\022\023\022\0210\006¢\006\f\b\030\022\b\b\031\022\004\b\b(3\022\004\022\0020\0330\027H\002JE\020.\032\0020\0072\006\020\037\032\0020 2\006\0204\032\0020\0062\006\0205\032\0020\0032#\b\002\0202\032\035\022\023\022\0210\006¢\006\f\b\030\022\b\b\031\022\004\b\b(3\022\004\022\0020\0330\027H\002J\032\0206\032\0020\0072\006\020\037\032\0020 2\b\020!\032\004\030\0010\"H\002R\023\020\t\032\0070\n¢\006\002\b\013X\004¢\006\002\n\000R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\f\020\rR%\020\004\032\026\022\004\022\0020\003\022\004\022\0020\006\022\004\022\0020\007\030\0010\005¢\006\b\n\000\032\004\b\016\020\017¨\0068"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "member", "Lcom/intellij/psi/PsiElement;", "transformElementCallback", "Lkotlin/Function2;", "", "", "(Lcom/intellij/psi/PsiElement;Lkotlin/jvm/functions/Function2;)V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "getMember", "()Lcom/intellij/psi/PsiElement;", "getTransformElementCallback", "()Lkotlin/jvm/functions/Function2;", "composeQuery", "Lcom/intellij/openapi/util/NlsSafe;", "namedElement", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "composeSuffix", "element", "createValidator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "suggestion", "", "Lcom/intellij/psi/PsiNamedElement;", "getFamilyName", "getInstruction", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "getLineTextRange", "Lcom/intellij/openapi/util/TextRange;", "document", "Lcom/intellij/openapi/editor/Document;", "getParentNamedElement", "invoke", "file", "Lcom/intellij/psi/PsiFile;", "isAvailable", "preprocessSuggestion", "startInWriteAction", "transform", "text", "textRange", "instruction", "validator", "str", "message", "psiElement", "transformPsiElement", "Companion", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nApplyTransformationIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplyTransformationIntention.kt\ncom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
/*     */ public abstract class ApplyTransformationIntention implements IntentionAction {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final PsiElement member;
/*     */   @Nullable
/*     */   private final Function2<PsiElement, String, Unit> transformElementCallback;
/*     */   @NotNull
/*     */   private final Logger logger;
/*     */   
/*  34 */   public ApplyTransformationIntention(@Nullable PsiElement member, @Nullable Function2<PsiElement, String, Unit> transformElementCallback) { this.member = member;
/*  35 */     this.transformElementCallback = transformElementCallback;
/*     */     
/*  37 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")"); this.logger = Logger.getInstance("#com.intellij.ml.llm"); } @Nullable public final PsiElement getMember() { return this.member; }
/*     */   @Nullable public final Function2<PsiElement, String, Unit> getTransformElementCallback() { return this.transformElementCallback; }
/*  39 */   @NotNull public String getFamilyName() { return LLMBundle.message("intentions.apply.transformation.family.name", new Object[0]); }
/*     */   
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  42 */     Intrinsics.checkNotNullParameter(project, "project"); return (editor != null && file != null);
/*     */   }
/*     */   
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  46 */     Intrinsics.checkNotNullParameter(project, "project"); if (this.member != null) {
/*  47 */       transformPsiElement(project, editor);
/*     */       return;
/*     */     } 
/*  50 */     if (editor == null || file == null)
/*  51 */       return;  Intrinsics.checkNotNullExpressionValue(editor.getDocument(), "editor.document"); Document document = editor.getDocument();
/*  52 */     Intrinsics.checkNotNullExpressionValue(editor.getSelectionModel(), "editor.selectionModel"); SelectionModel selectionModel = editor.getSelectionModel();
/*  53 */     String selectedText = selectionModel.getSelectedText();
/*  54 */     if (selectedText != null) {
/*  55 */       Intrinsics.checkNotNullExpressionValue(TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd()), "create(selectionModel.se…ectionModel.selectionEnd)"); TextRange textRange = TextRange.create(selectionModel.getSelectionStart(), selectionModel.getSelectionEnd());
/*  56 */       transform(project, selectedText, editor, textRange);
/*     */     } else {
/*     */       
/*  59 */       PsiNameIdentifierOwner namedElement = getParentNamedElement(editor);
/*  60 */       if (namedElement != null) {
/*  61 */         String instructionText, queryText = composeQuery(namedElement);
/*  62 */         if (getInstruction(project, editor, (PsiElement)namedElement) == null) { getInstruction(project, editor, (PsiElement)namedElement); return; }
/*  63 */          Function1<String, Boolean> validator = createValidator((PsiNamedElement)namedElement);
/*  64 */         TextRange textRange = namedElement.getTextRange();
/*  65 */         selectionModel.setSelection(textRange.getStartOffset(), textRange.getEndOffset());
/*  66 */         Intrinsics.checkNotNullExpressionValue(textRange, "textRange"); transform(project, queryText, editor, textRange, instructionText, validator);
/*     */       } else {
/*     */         
/*  69 */         selectionModel.selectLineAtCaret();
/*  70 */         TextRange textRange = getLineTextRange(document, editor);
/*  71 */         Intrinsics.checkNotNullExpressionValue(document.getText(textRange), "document.getText(textRange)"); transform(project, document.getText(textRange), editor, textRange);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private final void transformPsiElement(Project project, Editor editor) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield member : Lcom/intellij/psi/PsiElement;
/*     */     //   4: ifnonnull -> 8
/*     */     //   7: return
/*     */     //   8: aload_0
/*     */     //   9: getfield member : Lcom/intellij/psi/PsiElement;
/*     */     //   12: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   17: astore_3
/*     */     //   18: aload_0
/*     */     //   19: aload_0
/*     */     //   20: getfield member : Lcom/intellij/psi/PsiElement;
/*     */     //   23: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   28: dup
/*     */     //   29: ldc 'member.project'
/*     */     //   31: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   34: aload_2
/*     */     //   35: aload_0
/*     */     //   36: getfield member : Lcom/intellij/psi/PsiElement;
/*     */     //   39: invokevirtual getInstruction : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiElement;)Ljava/lang/String;
/*     */     //   42: astore #4
/*     */     //   44: aload_0
/*     */     //   45: aload_0
/*     */     //   46: getfield member : Lcom/intellij/psi/PsiElement;
/*     */     //   49: invokevirtual composeSuffix : (Lcom/intellij/psi/PsiElement;)Ljava/lang/String;
/*     */     //   52: astore #5
/*     */     //   54: aload #4
/*     */     //   56: aload_3
/*     */     //   57: aload #5
/*     */     //   59: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: astore #6
/*     */     //   66: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */     //   69: aload_1
/*     */     //   70: aload_0
/*     */     //   71: aload_1
/*     */     //   72: aload #6
/*     */     //   74: <illegal opcode> run : (Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/openapi/project/Project;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   79: ldc 'inspection.process.code'
/*     */     //   81: iconst_0
/*     */     //   82: anewarray java/lang/Object
/*     */     //   85: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   88: aconst_null
/*     */     //   89: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   92: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #77	-> 0
/*     */     //   #78	-> 8
/*     */     //   #79	-> 18
/*     */     //   #80	-> 44
/*     */     //   #81	-> 54
/*     */     //   #82	-> 66
/*     */     //   #84	-> 79
/*     */     //   #82	-> 89
/*     */     //   #85	-> 92
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   18	75	3	text	Ljava/lang/String;
/*     */     //   44	49	4	instructionText	Ljava/lang/String;
/*     */     //   54	39	5	suffix	Ljava/lang/String;
/*     */     //   66	27	6	message	Ljava/lang/String;
/*     */     //   0	93	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */     //   0	93	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	93	2	editor	Lcom/intellij/openapi/editor/Editor;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void transformPsiElement$lambda$0(ApplyTransformationIntention this$0, Project $project, String $message) {
/*  83 */     Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($message, "$message"); transform$default(this$0, $project, $message, this$0.member, null, 8, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*  87 */   public String composeQuery(@NotNull PsiNameIdentifierOwner namedElement) { Intrinsics.checkNotNullParameter(namedElement, "namedElement"); Intrinsics.checkNotNullExpressionValue(namedElement.getText(), "namedElement.text"); return namedElement.getText(); } @NotNull
/*     */   public String composeSuffix(@NotNull PsiElement element) {
/*  89 */     Intrinsics.checkNotNullParameter(element, "element"); return "";
/*     */   }
/*     */   private final TextRange getLineTextRange(Document document, Editor editor) {
/*  92 */     int lineNumber = document.getLineNumber(editor.getCaretModel().getOffset());
/*  93 */     int startOffset = document.getLineStartOffset(lineNumber);
/*  94 */     int endOffset = document.getLineEndOffset(lineNumber);
/*  95 */     Intrinsics.checkNotNullExpressionValue(TextRange.create(startOffset, endOffset), "create(startOffset, endOffset)"); return TextRange.create(startOffset, endOffset);
/*     */   }
/*     */   
/*     */   private final PsiNameIdentifierOwner getParentNamedElement(Editor editor) {
/*  99 */     PsiElement element = PsiUtilBase.getElementAtCaret(editor);
/* 100 */     return (PsiNameIdentifierOwner)PsiTreeUtil.getParentOfType(element, PsiNameIdentifierOwner.class);
/*     */   }
/*     */   private final void transform(Project project, String text, Editor editor, TextRange textRange) {
/*     */     String instruction;
/* 104 */     if (getInstruction(project, editor, null) == null) { getInstruction(project, editor, null); return; }
/* 105 */      transform$default(this, project, text, editor, textRange, instruction, null, 32, null);
/*     */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*     */   static final class ApplyTransformationIntention$transform$1 extends Lambda implements Function1<String, Boolean> { public static final ApplyTransformationIntention$transform$1 INSTANCE = new ApplyTransformationIntention$transform$1(); ApplyTransformationIntention$transform$1() {
/*     */       super(1);
/*     */     }
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull String it) {
/* 112 */       Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(true);
/*     */     } }
/* 114 */   private final void transform(Project project, String message, PsiElement psiElement, Function1<? super String, Boolean> validator) { Intrinsics.checkNotNullExpressionValue(LanguageUtil.getRootLanguage(psiElement), "getRootLanguage(psiElement)"); Language language = LanguageUtil.getRootLanguage(psiElement);
/* 115 */     CompositeStatisticsIdeActivity activity = CommonLoggerService.Companion.getInstance().logEditStarted(project, psiElement, language);
/* 116 */     this.logger.info("Invoke transformation action with '" + message + "' message");
/*     */     
/* 118 */     String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); ApplyTransformationIntention$transform$task$1 task = new ApplyTransformationIntention$transform$task$1(message, this, activity, validator, psiElement, language, str);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task)); }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"}) public static final class ApplyTransformationIntention$transform$task$1 extends Task.Backgroundable {
/*     */     ApplyTransformationIntention$transform$task$1(String $message, ApplyTransformationIntention $receiver, CompositeStatisticsIdeActivity $activity, Function1<String, Boolean> $validator, PsiElement $psiElement, Language $language, String $super_call_param$1) { super($project, $super_call_param$1); }
/*     */     public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); int maxTokens = (this.$message.length() > 4000) ? 64 : (4000 - this.$message.length() - 1); LLMBaseResponse response = SenderKt.sendCompletionChatRequest$default(this.$project, this.$message, "", Integer.valueOf(maxTokens), null, null, null, null, null, 0, null, null, null, 8176, null); if (response != null) { LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); ApplyTransformationIntention applyTransformationIntention = ApplyTransformationIntention.this; Project project = this.$project; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; Function1<String, Boolean> function1 = this.$validator; PsiElement psiElement = this.$psiElement; Language language = this.$language; LLMResponseChoice it = lLMResponseChoice1; int $i$a$-let-ApplyTransformationIntention$transform$task$1$run$1 = 0; applyTransformationIntention.logger.info("Suggested change: " + it); ActionsKt.invokeLater$default(null, new ApplyTransformationIntention$transform$task$1$run$1$1(compositeStatisticsIdeActivity, it, function1, applyTransformationIntention, psiElement, language), 1, null); (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); }  }
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class ApplyTransformationIntention$transform$task$1$run$1$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() { // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   4: aload_0
/*     */         //   5: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */         //   8: aload_0
/*     */         //   9: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */         //   12: aload_0
/*     */         //   13: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */         //   16: aload_0
/*     */         //   17: getfield $psiElement : Lcom/intellij/psi/PsiElement;
/*     */         //   20: aload_0
/*     */         //   21: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   24: aload_0
/*     */         //   25: getfield $language : Lcom/intellij/lang/Language;
/*     */         //   28: <illegal opcode> run : (Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/psi/PsiElement;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/lang/Language;)Ljava/lang/Runnable;
/*     */         //   33: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */         //   36: aload_0
/*     */         //   37: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   40: aload_0
/*     */         //   41: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   44: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */         //   47: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */         //   50: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #136	-> 0
/*     */         //   #146	-> 36
/*     */         //   #147	-> 50
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	51	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$1$run$1$1; } private static final void invoke$lambda$0(LLMResponseChoice $it, Function1 $validator, ApplyTransformationIntention this$0, PsiElement $psiElement, CompositeStatisticsIdeActivity $activity, Language $language) { Intrinsics.checkNotNullParameter($it, "$it"); Intrinsics.checkNotNullParameter($validator, "$validator"); Intrinsics.checkNotNullParameter(ApplyTransformationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($psiElement, "$psiElement"); Intrinsics.checkNotNullParameter($activity, "$activity"); Intrinsics.checkNotNullParameter($language, "$language"); String suggestion = $it.getText(); if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) { ApplyTransformationIntention.this.logger.warn("Ignored suggestion: " + suggestion); return; }  if (ApplyTransformationIntention.this.getTransformElementCallback() != null) { ApplyTransformationIntention.this.getTransformElementCallback().invoke($psiElement, ApplyTransformationIntention.this.preprocessSuggestion(suggestion)); }
/*     */         else { ApplyTransformationIntention.this.getTransformElementCallback(); }
/*     */          CommonLoggerService.Companion.getInstance().logEditFinished($activity, suggestion, FinishState.SUCCEED, $psiElement, $language); } ApplyTransformationIntention$transform$task$1$run$1$1(CompositeStatisticsIdeActivity $activity, LLMResponseChoice $it, Function1<String, Boolean> $validator, ApplyTransformationIntention $receiver, PsiElement $psiElement, Language $language) { super(0); }
/*     */     }
/* 161 */   } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}) static final class ApplyTransformationIntention$transform$2 extends Lambda implements Function1<String, Boolean> { public static final ApplyTransformationIntention$transform$2 INSTANCE = new ApplyTransformationIntention$transform$2(); @NotNull public final Boolean invoke(@NotNull String it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(true); } ApplyTransformationIntention$transform$2() { super(1); } }
/*     */    private final void transform(Project project, String text, Editor editor, TextRange textRange, String instruction, Function1<? super String, Boolean> validator) {
/* 163 */     PsiElement psiElement = PsiUtilBase.getElementAtCaret(editor);
/* 164 */     PsiElement it = psiElement;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 225 */     int $i$a$-let-ApplyTransformationIntention$transform$language$1 = 0;
/*     */     Language language = (psiElement != null) ? LanguageUtil.getRootLanguage(it) : null;
/*     */     CompositeStatisticsIdeActivity activity = CommonLoggerService.Companion.getInstance().logEditStarted(project, psiElement, language);
/*     */     this.logger.info("Invoke transformation action with '" + instruction + "' instruction for '" + text + "'");
/*     */     String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]);
/*     */     ApplyTransformationIntention$transform$task$2 task = new ApplyTransformationIntention$transform$task$2(text, instruction, activity, psiElement, language, this, validator, editor, textRange, str);
/*     */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"})
/*     */   public static final class ApplyTransformationIntention$transform$task$2 extends Task.Backgroundable {
/*     */     ApplyTransformationIntention$transform$task$2(String $text, String $instruction, CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language, ApplyTransformationIntention $receiver, Function1<String, Boolean> $validator, Editor $editor, TextRange $textRange, String $super_call_param$1) {
/*     */       super($project, $super_call_param$1);
/*     */     }
/*     */     
/*     */     public void run(@NotNull ProgressIndicator indicator) {
/*     */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*     */       Function1 onRequestSent = new ApplyTransformationIntention$transform$task$2$run$onRequestSent$1(this.$activity, this.$psiElement, this.$language);
/*     */       LLMBaseResponse response = SenderKt.sendEditRequest$default(this.$project, this.$text, this.$instruction, null, null, onRequestSent, null, 88, null);
/*     */       if (response != null) {
/*     */         LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/*     */         ApplyTransformationIntention applyTransformationIntention = ApplyTransformationIntention.this;
/*     */         Project project = this.$project;
/*     */         CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity;
/*     */         Function1<String, Boolean> function1 = this.$validator;
/*     */         Editor editor = this.$editor;
/*     */         TextRange textRange = this.$textRange;
/*     */         PsiElement psiElement = this.$psiElement;
/*     */         Language language = this.$language;
/*     */         LLMResponseChoice it = lLMResponseChoice1;
/*     */         int $i$a$-let-ApplyTransformationIntention$transform$task$2$run$1 = 0;
/*     */         applyTransformationIntention.logger.info("Suggested change: " + it);
/*     */         ActionsKt.invokeLater$default(null, new ApplyTransformationIntention$transform$task$2$run$1$1(compositeStatisticsIdeActivity, applyTransformationIntention, it, function1, editor, textRange, psiElement, language), 1, null);
/*     */         (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions());
/*     */       } 
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"})
/*     */     static final class ApplyTransformationIntention$transform$task$2$run$onRequestSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> {
/*     */       public final void invoke(@NotNull LLMBaseRequest request) {
/*     */         Intrinsics.checkNotNullParameter(request, "request");
/*     */         CompositeStatisticsIdeActivity compositeStatisticsIdeActivity1 = this.$activity;
/*     */         PsiElement psiElement = this.$psiElement;
/*     */         Language language = this.$language;
/*     */         CompositeStatisticsIdeActivity it = compositeStatisticsIdeActivity1;
/*     */         int $i$a$-let-ApplyTransformationIntention$transform$task$2$run$onRequestSent$1$1 = 0;
/*     */         CommonLoggerService.Companion.getInstance().logSendEditRequest(it, request.getBody(), psiElement, language);
/*     */       }
/*     */       
/*     */       ApplyTransformationIntention$transform$task$2$run$onRequestSent$1(CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language) {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */     static final class ApplyTransformationIntention$transform$task$2$run$1$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   4: aload_0
/*     */         //   5: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;
/*     */         //   8: aload_0
/*     */         //   9: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */         //   12: aload_0
/*     */         //   13: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */         //   16: aload_0
/*     */         //   17: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   20: aload_0
/*     */         //   21: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   24: aload_0
/*     */         //   25: getfield $textRange : Lcom/intellij/openapi/util/TextRange;
/*     */         //   28: aload_0
/*     */         //   29: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   32: aload_0
/*     */         //   33: getfield $psiElement : Lcom/intellij/psi/PsiElement;
/*     */         //   36: aload_0
/*     */         //   37: getfield $language : Lcom/intellij/lang/Language;
/*     */         //   40: <illegal opcode> run : (Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/util/TextRange;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;)Ljava/lang/Runnable;
/*     */         //   45: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*     */         //   48: aload_0
/*     */         //   49: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   52: aload_0
/*     */         //   53: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   56: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */         //   59: invokestatic showScoreNotification : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;)V
/*     */         //   62: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #186	-> 0
/*     */         //   #195	-> 48
/*     */         //   #196	-> 62
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	63	0	this	Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$transform$task$2$run$1$1;
/*     */       }
/*     */       
/*     */       private static final void invoke$lambda$0(ApplyTransformationIntention this$0, LLMResponseChoice $it, Function1 $validator, Project $project, Editor $editor, TextRange $textRange, CompositeStatisticsIdeActivity $activity, PsiElement $psiElement, Language $language) {
/*     */         Intrinsics.checkNotNullParameter(ApplyTransformationIntention.this, "this$0");
/*     */         Intrinsics.checkNotNullParameter($it, "$it");
/*     */         Intrinsics.checkNotNullParameter($validator, "$validator");
/*     */         Intrinsics.checkNotNullParameter($project, "$project");
/*     */         Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */         Intrinsics.checkNotNullParameter($textRange, "$textRange");
/*     */         Intrinsics.checkNotNullParameter($activity, "$activity");
/*     */         Intrinsics.checkNotNullExpressionValue(StringUtil.convertLineSeparators(ApplyTransformationIntention.this.preprocessSuggestion($it.getText())), "convertLineSeparators(pr…cessSuggestion (it.text))");
/*     */         String suggestion = StringUtil.convertLineSeparators(ApplyTransformationIntention.this.preprocessSuggestion($it.getText()));
/*     */         if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/*     */           ApplyTransformationIntention.this.logger.warn("Ignored suggestion: " + suggestion);
/*     */           return;
/*     */         } 
/*     */         Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*     */         ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm($project, suggestion, $editor.getDocument(), $textRange);
/*     */         CommonLoggerService.Companion.getInstance().logEditFinished($activity, suggestion, FinishState.SUCCEED, $psiElement, $language);
/*     */       }
/*     */       
/*     */       ApplyTransformationIntention$transform$task$2$run$1$1(CompositeStatisticsIdeActivity $activity, ApplyTransformationIntention $receiver, LLMResponseChoice $it, Function1<String, Boolean> $validator, Editor $editor, TextRange $textRange, PsiElement $psiElement, Language $language) {
/*     */         super(0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Function1<String, Boolean> createValidator(@NotNull PsiNamedElement element) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     return ApplyTransformationIntention$createValidator$1.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*     */   static final class ApplyTransformationIntention$createValidator$1 extends Lambda implements Function1<String, Boolean> {
/*     */     public static final ApplyTransformationIntention$createValidator$1 INSTANCE = new ApplyTransformationIntention$createValidator$1();
/*     */     
/*     */     ApplyTransformationIntention$createValidator$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Boolean.valueOf(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String preprocessSuggestion(@NotNull String suggestion) {
/*     */     Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*     */     return suggestion;
/*     */   }
/*     */   
/*     */   public boolean startInWriteAction() {
/*     */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public abstract String getInstruction(@NotNull Project paramProject, @Nullable Editor paramEditor, @Nullable PsiElement paramPsiElement);
/*     */   
/*     */   public ApplyTransformationIntention() {
/*     */     this(null, null, 3, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\000¢\006\002\b\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$Companion;", "", "()V", "updateDocument", "", "project", "Lcom/intellij/openapi/project/Project;", "suggestion", "", "document", "Lcom/intellij/openapi/editor/Document;", "textRange", "Lcom/intellij/openapi/util/TextRange;", "updateDocument$intellij_ml_llm", "intellij.ml.llm"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final void updateDocument$intellij_ml_llm(@NotNull Project project, @NotNull String suggestion, @NotNull Document document, @NotNull TextRange textRange) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*     */       Intrinsics.checkNotNullParameter(document, "document");
/*     */       Intrinsics.checkNotNullParameter(textRange, "textRange");
/*     */       document.replaceString(textRange.getStartOffset(), textRange.getEndOffset(), suggestion);
/*     */       PsiDocumentManager.getInstance(project).commitDocument(document);
/*     */       PsiFile psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document);
/*     */       PsiFile it = psiFile;
/*     */       int $i$a$-let-ApplyTransformationIntention$Companion$updateDocument$1 = 0;
/*     */       TextRange reformatRange = new TextRange(textRange.getStartOffset(), textRange.getStartOffset() + suggestion.length());
/*     */       CodeStyleManager.getInstance(project).reformatText(it, CollectionsKt.listOf(reformatRange));
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */