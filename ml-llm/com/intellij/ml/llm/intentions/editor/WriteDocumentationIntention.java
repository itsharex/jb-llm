/*     */ package com.intellij.ml.llm.intentions.editor;
/*     */ import com.intellij.ml.llm.context.MethodContext;
/*     */ import com.intellij.ml.llm.core.LLMDocumentationSupport;
/*     */ import com.intellij.ml.llm.core.LLMDocumentationSupportBean;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseRequest;
/*     */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*     */ import com.intellij.ml.llm.core.statistics.CompositeStatisticsIdeActivity;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.PsiNameIdentifierOwner;
/*     */ import com.intellij.psi.PsiNamedElement;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000¢\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\025\030\0002\0020\001:\001QB\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\024\020\022\032\0020\0132\f\020\023\032\b\022\004\022\0020\0130\nJ\020\020\024\032\0020\0212\006\020\025\032\0020\026H\002J+\020\027\032\035\022\023\022\0210\021¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\004\022\0020\0340\0302\006\020\035\032\0020\036H\002J&\020\037\032\b\022\004\022\0020\0260 2\006\020!\032\0020\"2\006\020#\032\0020$2\006\020%\032\0020&H\002J\b\020'\032\0020\021H\002J\020\020(\032\0020\0212\006\020)\032\0020*H\002J\022\020+\032\004\030\0010\0262\006\020\035\032\0020\003H\002J\022\020,\032\004\030\0010\0262\006\020!\032\0020\"H\002J\b\020-\032\0020\021H\026J\022\020.\032\0020\0212\b\020\035\032\004\030\0010\003H\002J\020\020/\032\0020\0212\006\020\035\032\0020\003H\002J\030\0200\032\0020\0212\006\0201\032\002022\006\020)\032\00203H\002J\b\0204\032\0020\021H\026J\020\0205\032\0020\0212\006\020)\032\00206H\002JB\0207\032\0020\0132\006\020#\032\0020$2\006\0208\032\002092\b\020:\032\004\030\0010;2\006\020\033\032\0020\0212\006\020<\032\0020=2\006\020>\032\002022\006\020?\032\0020\021H\002J%\020@\032\0020\0132\006\020#\032\0020$2\b\020!\032\004\030\0010\"2\b\0208\032\004\030\00109H\002J$\020A\032\0020\0342\006\020#\032\0020$2\b\020!\032\004\030\0010\"2\b\0208\032\004\030\00109H\026J(\020B\032\0020\0132\006\020#\032\0020$2\006\020!\032\0020\"2\006\0208\032\002092\006\020\025\032\0020\026H\002J \020C\032\0020\0212\006\020\033\032\0020\0212\006\020D\032\0020\0212\006\020E\032\0020\021H\002J(\020F\032\0020\0132\006\020#\032\0020$2\006\020\035\032\0020\0032\006\020\033\032\0020\0212\006\020<\032\0020=H\002J(\020G\032\0020\0132\006\020#\032\0020$2\006\020>\032\002022\006\020\035\032\0020\0032\006\020H\032\0020\021H\002J\b\020I\032\0020\034H\026J\r\020J\032\004\030\0010\013¢\006\002\020KJ]\020L\032\0020\0132\006\020#\032\0020$2\006\020!\032\0020\"2\006\0208\032\002092\006\020M\032\0020\0212\006\020\035\032\0020\0032\006\020N\032\0020\0212#\b\002\020O\032\035\022\023\022\0210\021¢\006\f\b\031\022\b\b\032\022\004\b\b(P\022\004\022\0020\0340\030H\002R\023\020\005\032\0070\006¢\006\002\b\007X\004¢\006\002\n\000R\032\020\b\032\016\022\n\022\b\022\004\022\0020\0130\n0\tX\004¢\006\002\n\000R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\f\020\rR\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000R\016\020\020\032\0020\021XD¢\006\002\n\000¨\006R"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;", "Lcom/intellij/codeInsight/intention/IntentionAction;", "psiElement", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/psi/PsiElement;)V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "onStreamingStartedListeners", "", "Lkotlin/Function0;", "", "getPsiElement", "()Lcom/intellij/psi/PsiElement;", "streamingConsumer", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "writeActionGroupId", "", "addOnStreamingStartedListener", "listener", "composeQuery", "namedElement", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "createValidator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "suggestion", "", "element", "Lcom/intellij/psi/PsiNamedElement;", "findSelectedElementToDocument", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "project", "Lcom/intellij/openapi/project/Project;", "selectionModel", "Lcom/intellij/openapi/editor/SelectionModel;", "getBaseInstruction", "getClassInstruction", "context", "Lcom/intellij/ml/llm/context/ClassContext;", "getClosestNamedElement", "getClosestToCaretNamedElement", "getFamilyName", "getInstruction", "getInstructionSuffix", "getMethodInstruction", "llmSupport", "Lcom/intellij/ml/llm/core/LLMDocumentationSupport;", "Lcom/intellij/ml/llm/context/MethodContext;", "getText", "getVariableInstruction", "Lcom/intellij/ml/llm/context/VariableContext;", "insertStreamingDocumentation", "file", "Lcom/intellij/psi/PsiFile;", "documentRange", "Lcom/intellij/openapi/editor/RangeMarker;", "document", "Lcom/intellij/openapi/editor/Document;", "support", "newLineIndent", "invoke", "isAvailable", "prepareAndTransformNamedElement", "preprocessSuggestion", "commentStart", "commentEnd", "replaceOrAddDocumentation", "restorePrevDocumentation", "prevDoc", "startInWriteAction", "stopStreaming", "()Lkotlin/Unit;", "transform", "text", "instruction", "validator", "str", "StreamingDocumentationState", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nWriteDocumentationIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1855#2,2:404\n1#3:406\n*S KotlinDebug\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention\n*L\n90#1:404,2\n*E\n"})
/*     */ public final class WriteDocumentationIntention implements IntentionAction {
/*     */   @Nullable
/*     */   private final PsiElement psiElement;
/*     */   @NotNull
/*     */   private final Logger logger;
/*     */   @NotNull
/*     */   private final String writeActionGroupId;
/*     */   @NotNull
/*     */   private final List<Function0<Unit>> onStreamingStartedListeners;
/*     */   @Nullable
/*     */   private LLMStreamingRequestConsumer streamingConsumer;
/*     */   
/*     */   public WriteDocumentationIntention(@Nullable PsiElement psiElement) {
/*  40 */     this.psiElement = psiElement;
/*     */     
/*  42 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance("#com.intellij.ml.llm"), "getInstance(\"#com.intellij.ml.llm\")"); this.logger = Logger.getInstance("#com.intellij.ml.llm");
/*     */     
/*  44 */     this.writeActionGroupId = "write.documentation.intention.write.action";
/*     */     
/*  46 */     this.onStreamingStartedListeners = new ArrayList<>();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PsiElement getPsiElement() {
/*     */     return this.psiElement;
/*     */   }
/*     */   
/*     */   public final void addOnStreamingStartedListener(@NotNull Function0<Unit> listener) {
/*  55 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.onStreamingStartedListeners.add(listener);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Unit stopStreaming() {
/*  61 */     this.streamingConsumer.finish(false); return (this.streamingConsumer != null) ? Unit.INSTANCE : null;
/*     */   }
/*  63 */   public boolean startInWriteAction() { return false; }
/*     */   @NotNull
/*  65 */   public String getFamilyName() { return LLMBundle.message("intentions.write.documentation.family.name", new Object[0]); } @NotNull
/*     */   public String getText() {
/*  67 */     return LLMBundle.message("intentions.write.documentation.name", new Object[0]);
/*     */   }
/*     */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*  70 */     Intrinsics.checkNotNullParameter(project, "project"); if (editor == null || file == null) return false; 
/*     */     try {
/*  72 */       if ((LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(file.getLanguage()) == null) { (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(file.getLanguage()); return false; }  (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(file.getLanguage());
/*     */     }
/*  74 */     catch (Exception e) {
/*  75 */       return false;
/*     */     } 
/*  77 */     return true;
/*     */   }
/*     */   
/*     */   public void invoke(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) { PsiNameIdentifierOwner it;
/*  81 */     Intrinsics.checkNotNullParameter(project, "project"); if (editor == null || file == null)
/*  82 */       return;  if (!isAvailable(project, editor, file))
/*  83 */       return;  if (this.psiElement != null && this.psiElement instanceof PsiNameIdentifierOwner) {
/*  84 */       prepareAndTransformNamedElement(project, editor, file, (PsiNameIdentifierOwner)this.psiElement);
/*     */       return;
/*     */     } 
/*  87 */     Intrinsics.checkNotNullExpressionValue(editor.getSelectionModel(), "editor.selectionModel"); SelectionModel selectionModel = editor.getSelectionModel();
/*  88 */     String selectedText = selectionModel.getSelectedText();
/*  89 */     if (selectedText != null)
/*  90 */     { Iterable<PsiNameIdentifierOwner> $this$forEach$iv = findSelectedElementToDocument(editor, project, selectionModel); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 404 */       Iterator<PsiNameIdentifierOwner> iterator = $this$forEach$iv.iterator(); } else { it = getClosestToCaretNamedElement(editor); int $i$a$-let-WriteDocumentationIntention$invoke$2 = 0; prepareAndTransformNamedElement(project, editor, file, it); getClosestToCaretNamedElement(editor); return; }  if (it.hasNext()) { Object element$iv = it.next(); PsiNameIdentifierOwner psiNameIdentifierOwner = (PsiNameIdentifierOwner)element$iv; int $i$a$-forEach-WriteDocumentationIntention$invoke$1 = 0; prepareAndTransformNamedElement(project, editor, file, psiNameIdentifierOwner); }  } private final void prepareAndTransformNamedElement(Project project, Editor editor, PsiFile file, PsiNameIdentifierOwner namedElement) { String queryText = composeQuery(namedElement); String instructionText = getInstruction((PsiElement)namedElement); Function1<String, Boolean> validator = createValidator((PsiNamedElement)namedElement); transform(project, editor, file, queryText, (PsiElement)namedElement, instructionText, validator); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}) static final class WriteDocumentationIntention$transform$1 extends Lambda implements Function1<String, Boolean> { public static final WriteDocumentationIntention$transform$1 INSTANCE = new WriteDocumentationIntention$transform$1(); WriteDocumentationIntention$transform$1() { super(1); } @NotNull public final Boolean invoke(@NotNull String it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(true); } } private final void transform(Project project, Editor editor, PsiFile file, String text, PsiElement element, String instruction, Function1<? super String, Boolean> validator) { LLMDocumentationSupport languageSupport = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage()); LLMCommonEventFieldsKt.askDataSharingConsentIfNeeded(project); CompositeStatisticsIdeActivity activity = CommonLoggerService.Companion.getInstance().logDocumentationGenerationStarted(project, element, element.getLanguage()); Function1<? super LLMBaseRequest<?>, Unit> onSent = new WriteDocumentationIntention$transform$onSent$1(activity, element); this.logger.info("Invoke documentation generation with '" + instruction + "' instruction for '" + text + "'"); String str = LLMBundle.message("intentions.request.background.process.title", new Object[0]); WriteDocumentationIntention$transform$task$1 task = new WriteDocumentationIntention$transform$task$1(languageSupport, this, instruction, text, onSent, file, editor, element, activity, validator, str); ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task)); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "request", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseRequest;", "invoke"}) @SourceDebugExtension({"SMAP\nWriteDocumentationIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$onSent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"}) static final class WriteDocumentationIntention$transform$onSent$1 extends Lambda implements Function1<LLMBaseRequest<?>, Unit> { WriteDocumentationIntention$transform$onSent$1(CompositeStatisticsIdeActivity $activity, PsiElement $element) { super(1); } public final void invoke(@NotNull LLMBaseRequest request) { Intrinsics.checkNotNullParameter(request, "request"); CompositeStatisticsIdeActivity compositeStatisticsIdeActivity1 = this.$activity; PsiElement psiElement = this.$element; CompositeStatisticsIdeActivity it = compositeStatisticsIdeActivity1; int $i$a$-let-WriteDocumentationIntention$transform$onSent$1$1 = 0; CommonLoggerService.Companion.getInstance().logDocumentationGenerationRequestSent(it, request.getBody(), psiElement, psiElement.getLanguage()); } } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm"}) public static final class WriteDocumentationIntention$transform$task$1 extends Task.Backgroundable { WriteDocumentationIntention$transform$task$1(LLMDocumentationSupport $languageSupport, WriteDocumentationIntention $receiver, String $instruction, String $text, Function1<LLMBaseRequest<?>, Unit> $onSent, PsiFile $file, Editor $editor, PsiElement $element, CompositeStatisticsIdeActivity $activity, Function1<String, Boolean> $validator, String $super_call_param$1) { super($project, $super_call_param$1); } public void run(@NotNull ProgressIndicator indicator) { Intrinsics.checkNotNullParameter(indicator, "indicator"); if (LLMSettingsManager.Companion.getInstance().isStreamingEnabled() && this.$languageSupport != null) { Ref.ObjectRef<RangeMarker> documentRange = new Ref.ObjectRef(); Ref.ObjectRef<String> newLineIndent = new Ref.ObjectRef(); newLineIndent.element = ""; Ref.ObjectRef<WriteDocumentationIntention.StreamingDocumentationState> streamingState = new Ref.ObjectRef(); streamingState.element = WriteDocumentationIntention.StreamingDocumentationState.WAITING_TO_START; StringBuilder suggestion = new StringBuilder(); Ref.ObjectRef<String> prevDoc = new Ref.ObjectRef(); WriteDocumentationIntention.this.streamingConsumer = new WriteDocumentationIntention$transform$task$1$run$1(streamingState, this.$languageSupport, this.$project, WriteDocumentationIntention.this, this.$file, documentRange, this.$editor, newLineIndent, prevDoc, this.$element, this.$activity); SenderKt.sendCompletionChatRequest$default(this.$project, this.$instruction + "\n" + this.$instruction, "", null, null, null, null, null, null, 0, this.$onSent, WriteDocumentationIntention.this.streamingConsumer, null, 5112, null); } else { LLMBaseResponse response = SenderKt.sendEditRequest$default(this.$project, this.$text, this.$instruction, null, null, this.$onSent, null, 88, null); if (response != null) { LLMResponseChoice lLMResponseChoice1 = (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); WriteDocumentationIntention writeDocumentationIntention = WriteDocumentationIntention.this; Project project = this.$project; LLMDocumentationSupport lLMDocumentationSupport = this.$languageSupport; Function1<String, Boolean> function1 = this.$validator; PsiElement psiElement = this.$element; Editor editor = this.$editor; CompositeStatisticsIdeActivity compositeStatisticsIdeActivity = this.$activity; LLMResponseChoice it = lLMResponseChoice1; int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$2 = 0; writeDocumentationIntention.logger.info("Suggested documentation: " + it); ActionsKt.invokeLater$default(null, new WriteDocumentationIntention$transform$task$1$run$2$1(writeDocumentationIntention, lLMDocumentationSupport, it, function1, psiElement, editor, compositeStatisticsIdeActivity), 1, null); (LLMResponseChoice)CollectionsKt.firstOrNull(response.getSuggestions()); }  }  } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMStreamingRequestConsumer;", "finish", "", "success", "", "run", "choice", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"}) @SourceDebugExtension({"SMAP\nWriteDocumentationIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n1855#2,2:404\n*S KotlinDebug\n*F\n+ 1 WriteDocumentationIntention.kt\ncom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1\n*L\n163#1:404,2\n*E\n"}) public static final class WriteDocumentationIntention$transform$task$1$run$1 extends LLMStreamingRequestConsumer { private static final void run$lambda$2(Ref.ObjectRef $prevDoc, LLMDocumentationSupport $languageSupport, PsiElement $element, Ref.ObjectRef $newLineIndent, Project $project, Editor $editor, WriteDocumentationIntention this$0, Ref.ObjectRef $documentRange) { Intrinsics.checkNotNullParameter($prevDoc, "$prevDoc"); Intrinsics.checkNotNullParameter($element, "$element"); Intrinsics.checkNotNullParameter($newLineIndent, "$newLineIndent"); Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($editor, "$editor"); Intrinsics.checkNotNullParameter(WriteDocumentationIntention.this, "this$0"); Intrinsics.checkNotNullParameter($documentRange, "$documentRange"); $languageSupport.getDocComment($element); $prevDoc.element = ($languageSupport.getDocComment($element) != null) ? $languageSupport.getDocComment($element).getText() : null; $languageSupport.replaceComment($element, $languageSupport.getEmptyComment()); $newLineIndent.element = $languageSupport.calculateNewLineIndent($element); if ((((CharSequence)$newLineIndent.element).length() > 0)) { String emptyCommentWithOffset = $languageSupport.getCommentStart() + "\n" + $languageSupport.getCommentStart() + $newLineIndent.element; $languageSupport.replaceComment($element, emptyCommentWithOffset); }  PsiDocumentManager.getInstance($project).doPostponedOperationsAndUnblockDocument($editor.getDocument()); PsiElement it = $languageSupport.getDocComment($element); int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$run$1$1 = 0; $documentRange.element = $editor.getDocument().createRangeMarker(UtilsKt.getStartOffset(it), UtilsKt.getEndOffset(it)); $languageSupport.getDocComment($element); Iterable $this$forEach$iv = WriteDocumentationIntention.this.onStreamingStartedListeners; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Function0 function0 = (Function0)element$iv; int $i$a$-forEach-WriteDocumentationIntention$transform$task$1$run$1$run$1$2 = 0;
/*     */           function0.invoke(); }
/*     */          }
/*     */ 
/*     */       
/*     */       WriteDocumentationIntention$transform$task$1$run$1(Ref.ObjectRef<WriteDocumentationIntention.StreamingDocumentationState> $streamingState, LLMDocumentationSupport $languageSupport, Project $project, WriteDocumentationIntention $receiver, PsiFile $file, Ref.ObjectRef<RangeMarker> $documentRange, Editor $editor, Ref.ObjectRef<String> $newLineIndent, Ref.ObjectRef<String> $prevDoc, PsiElement $element, CompositeStatisticsIdeActivity $activity) {}
/*     */       
/*     */       public boolean run(@NotNull LLMResponseChoice choice) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: ldc 'choice'
/*     */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   6: aload_0
/*     */         //   7: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */         //   10: aload_1
/*     */         //   11: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */         //   17: pop
/*     */         //   18: aload_0
/*     */         //   19: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   22: getfield element : Ljava/lang/Object;
/*     */         //   25: checkcast com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState
/*     */         //   28: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */         //   31: swap
/*     */         //   32: invokevirtual ordinal : ()I
/*     */         //   35: iaload
/*     */         //   36: tableswitch default -> 402, 1 -> 64, 2 -> 295, 3 -> 402
/*     */         //   64: aload_1
/*     */         //   65: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   68: checkcast java/lang/CharSequence
/*     */         //   71: aload_0
/*     */         //   72: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   75: invokeinterface getCommentStart : ()Ljava/lang/String;
/*     */         //   80: checkcast java/lang/CharSequence
/*     */         //   83: iconst_0
/*     */         //   84: iconst_2
/*     */         //   85: aconst_null
/*     */         //   86: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */         //   89: ifeq -> 230
/*     */         //   92: aload_0
/*     */         //   93: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   96: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.IN_PROGRESS : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */         //   99: putfield element : Ljava/lang/Object;
/*     */         //   102: aload_0
/*     */         //   103: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   106: ldc 'intentions.write.documentation.write.action.name'
/*     */         //   108: iconst_0
/*     */         //   109: anewarray java/lang/Object
/*     */         //   112: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */         //   115: aload_0
/*     */         //   116: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   119: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */         //   122: aload_0
/*     */         //   123: getfield $prevDoc : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   126: aload_0
/*     */         //   127: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   130: aload_0
/*     */         //   131: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */         //   134: aload_0
/*     */         //   135: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   138: aload_0
/*     */         //   139: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   142: aload_0
/*     */         //   143: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   146: aload_0
/*     */         //   147: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   150: aload_0
/*     */         //   151: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   154: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Runnable;
/*     */         //   159: iconst_0
/*     */         //   160: anewarray com/intellij/psi/PsiFile
/*     */         //   163: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */         //   166: aload_0
/*     */         //   167: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   170: aload_0
/*     */         //   171: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   174: aload_0
/*     */         //   175: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */         //   178: aload_0
/*     */         //   179: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   182: getfield element : Ljava/lang/Object;
/*     */         //   185: checkcast com/intellij/openapi/editor/RangeMarker
/*     */         //   188: aload_1
/*     */         //   189: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   192: aload_0
/*     */         //   193: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   196: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */         //   201: dup
/*     */         //   202: ldc 'editor.document'
/*     */         //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   207: aload_0
/*     */         //   208: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   211: dup
/*     */         //   212: ldc 'languageSupport'
/*     */         //   214: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   217: aload_0
/*     */         //   218: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   221: getfield element : Ljava/lang/Object;
/*     */         //   224: checkcast java/lang/String
/*     */         //   227: invokestatic access$insertStreamingDocumentation : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Ljava/lang/String;)V
/*     */         //   230: aload_1
/*     */         //   231: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   234: checkcast java/lang/CharSequence
/*     */         //   237: aload_0
/*     */         //   238: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   241: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */         //   246: checkcast java/lang/CharSequence
/*     */         //   249: iconst_0
/*     */         //   250: iconst_2
/*     */         //   251: aconst_null
/*     */         //   252: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */         //   255: ifeq -> 402
/*     */         //   258: aload_0
/*     */         //   259: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   262: invokeinterface getCommentStart : ()Ljava/lang/String;
/*     */         //   267: aload_0
/*     */         //   268: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   271: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */         //   276: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */         //   279: ifne -> 402
/*     */         //   282: aload_0
/*     */         //   283: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   286: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */         //   289: putfield element : Ljava/lang/Object;
/*     */         //   292: goto -> 402
/*     */         //   295: aload_0
/*     */         //   296: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   299: aload_0
/*     */         //   300: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   303: aload_0
/*     */         //   304: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */         //   307: aload_0
/*     */         //   308: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   311: getfield element : Ljava/lang/Object;
/*     */         //   314: checkcast com/intellij/openapi/editor/RangeMarker
/*     */         //   317: aload_1
/*     */         //   318: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   321: aload_0
/*     */         //   322: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   325: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */         //   330: dup
/*     */         //   331: ldc 'editor.document'
/*     */         //   333: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   336: aload_0
/*     */         //   337: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   340: dup
/*     */         //   341: ldc 'languageSupport'
/*     */         //   343: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   346: aload_0
/*     */         //   347: getfield $newLineIndent : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   350: getfield element : Ljava/lang/Object;
/*     */         //   353: checkcast java/lang/String
/*     */         //   356: invokestatic access$insertStreamingDocumentation : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/editor/RangeMarker;Ljava/lang/String;Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Ljava/lang/String;)V
/*     */         //   359: aload_1
/*     */         //   360: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   363: checkcast java/lang/CharSequence
/*     */         //   366: aload_0
/*     */         //   367: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   370: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */         //   375: checkcast java/lang/CharSequence
/*     */         //   378: iconst_0
/*     */         //   379: iconst_2
/*     */         //   380: aconst_null
/*     */         //   381: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */         //   384: ifeq -> 402
/*     */         //   387: aload_0
/*     */         //   388: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   391: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */         //   394: putfield element : Ljava/lang/Object;
/*     */         //   397: aload_0
/*     */         //   398: iconst_1
/*     */         //   399: invokevirtual finish : (Z)V
/*     */         //   402: iconst_1
/*     */         //   403: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #136	-> 6
/*     */         //   #137	-> 18
/*     */         //   #139	-> 64
/*     */         //   #140	-> 92
/*     */         //   #144	-> 102
/*     */         //   #145	-> 115
/*     */         //   #144	-> 122
/*     */         //   #167	-> 166
/*     */         //   #168	-> 217
/*     */         //   #167	-> 227
/*     */         //   #170	-> 230
/*     */         //   #171	-> 282
/*     */         //   #175	-> 295
/*     */         //   #176	-> 359
/*     */         //   #177	-> 387
/*     */         //   #178	-> 397
/*     */         //   #183	-> 402
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	404	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1;
/*     */         //   0	404	1	choice	Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */       }
/*     */       
/*     */       public void finish(boolean success) {
/*     */         // Byte code:
/*     */         //   0: iload_1
/*     */         //   1: ifne -> 20
/*     */         //   4: aload_0
/*     */         //   5: iconst_0
/*     */         //   6: invokespecial finish : (Z)V
/*     */         //   9: aload_0
/*     */         //   10: getfield $streamingState : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   13: getstatic com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState.FINISHED : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;
/*     */         //   16: putfield element : Ljava/lang/Object;
/*     */         //   19: return
/*     */         //   20: aload_0
/*     */         //   21: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   24: ldc 'intentions.write.documentation.write.action.name'
/*     */         //   26: iconst_0
/*     */         //   27: anewarray java/lang/Object
/*     */         //   30: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */         //   33: aload_0
/*     */         //   34: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   37: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */         //   40: aload_0
/*     */         //   41: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   44: aload_0
/*     */         //   45: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */         //   48: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;)Ljava/lang/Runnable;
/*     */         //   53: iconst_0
/*     */         //   54: anewarray com/intellij/psi/PsiFile
/*     */         //   57: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */         //   60: getstatic com/intellij/ml/llm/core/statistics/CommonLoggerService.Companion : Lcom/intellij/ml/llm/core/statistics/CommonLoggerService$Companion;
/*     */         //   63: invokevirtual getInstance : ()Lcom/intellij/ml/llm/core/statistics/CommonLoggerService;
/*     */         //   66: aload_0
/*     */         //   67: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   70: aload_0
/*     */         //   71: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */         //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   77: dup
/*     */         //   78: ldc 'suggestion.toString()'
/*     */         //   80: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   83: getstatic com/intellij/ml/llm/core/statistics/FinishState.SUCCEED : Lcom/intellij/ml/llm/core/statistics/FinishState;
/*     */         //   86: aload_0
/*     */         //   87: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */         //   90: aload_0
/*     */         //   91: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */         //   94: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*     */         //   99: invokevirtual logDocumentationGenerationFinished : (Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;Ljava/lang/String;Lcom/intellij/ml/llm/core/statistics/FinishState;Lcom/intellij/psi/PsiElement;Lcom/intellij/lang/Language;)V
/*     */         //   102: aload_0
/*     */         //   103: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   106: invokestatic access$getLogger$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   109: aload_0
/*     */         //   110: getfield $suggestion : Ljava/lang/StringBuilder;
/*     */         //   113: <illegal opcode> makeConcatWithConstants : (Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */         //   118: invokevirtual info : (Ljava/lang/String;)V
/*     */         //   121: aload_0
/*     */         //   122: getfield $documentRange : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   125: getfield element : Ljava/lang/Object;
/*     */         //   128: checkcast com/intellij/openapi/editor/RangeMarker
/*     */         //   131: dup
/*     */         //   132: ifnull -> 213
/*     */         //   135: astore_2
/*     */         //   136: aload_0
/*     */         //   137: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   140: astore_3
/*     */         //   141: aload_0
/*     */         //   142: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   145: astore #4
/*     */         //   147: aload_0
/*     */         //   148: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   151: astore #5
/*     */         //   153: aload_0
/*     */         //   154: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   157: astore #6
/*     */         //   159: aload_2
/*     */         //   160: astore #7
/*     */         //   162: iconst_0
/*     */         //   163: istore #8
/*     */         //   165: aload_3
/*     */         //   166: aload #4
/*     */         //   168: aload #7
/*     */         //   170: invokeinterface findEndOfCommentOffset : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/RangeMarker;)Ljava/lang/Integer;
/*     */         //   175: dup
/*     */         //   176: ifnull -> 208
/*     */         //   179: checkcast java/lang/Number
/*     */         //   182: invokevirtual intValue : ()I
/*     */         //   185: istore #9
/*     */         //   187: iconst_0
/*     */         //   188: istore #10
/*     */         //   190: aload #5
/*     */         //   192: aload #4
/*     */         //   194: aload #6
/*     */         //   196: checkcast com/intellij/ml/llm/core/statistics/StatisticsIdeActivities
/*     */         //   199: iload #9
/*     */         //   201: invokestatic showScoreNotificationInlay : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/StatisticsIdeActivities;I)V
/*     */         //   204: nop
/*     */         //   205: goto -> 210
/*     */         //   208: pop
/*     */         //   209: nop
/*     */         //   210: goto -> 215
/*     */         //   213: pop
/*     */         //   214: nop
/*     */         //   215: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #188	-> 0
/*     */         //   #189	-> 4
/*     */         //   #190	-> 9
/*     */         //   #191	-> 19
/*     */         //   #193	-> 20
/*     */         //   #194	-> 33
/*     */         //   #193	-> 40
/*     */         //   #197	-> 60
/*     */         //   #198	-> 86
/*     */         //   #197	-> 99
/*     */         //   #199	-> 102
/*     */         //   #200	-> 121
/*     */         //   #201	-> 165
/*     */         //   #202	-> 190
/*     */         //   #203	-> 204
/*     */         //   #201	-> 205
/*     */         //   #201	-> 208
/*     */         //   #200	-> 210
/*     */         //   #200	-> 213
/*     */         //   #205	-> 215
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   190	15	10	$i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$finish$2$1	I
/*     */         //   187	18	9	offset	I
/*     */         //   165	45	8	$i$a$-let-WriteDocumentationIntention$transform$task$1$run$1$finish$2	I
/*     */         //   162	48	7	range	Lcom/intellij/openapi/editor/RangeMarker;
/*     */         //   0	216	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$1;
/*     */         //   0	216	1	success	Z
/*     */       }
/*     */       
/*     */       private static final void finish$lambda$3(LLMDocumentationSupport $languageSupport, PsiElement $element) {
/*     */         Intrinsics.checkNotNullParameter($element, "$element");
/*     */         $languageSupport.reformatFinalDocumentation($element);
/*     */       } }
/*     */ 
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */     static final class WriteDocumentationIntention$transform$task$1$run$2$1 extends Lambda implements Function0<Unit> {
/*     */       public final void invoke() {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   4: ldc 'intentions.write.documentation.write.action.name'
/*     */         //   6: iconst_0
/*     */         //   7: anewarray java/lang/Object
/*     */         //   10: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */         //   13: aload_0
/*     */         //   14: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   17: invokestatic access$getWriteActionGroupId$p : (Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;)Ljava/lang/String;
/*     */         //   20: aload_0
/*     */         //   21: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   24: aload_0
/*     */         //   25: getfield this$0 : Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */         //   28: aload_0
/*     */         //   29: getfield $it : Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;
/*     */         //   32: aload_0
/*     */         //   33: getfield $validator : Lkotlin/jvm/functions/Function1;
/*     */         //   36: aload_0
/*     */         //   37: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   40: aload_0
/*     */         //   41: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */         //   44: aload_0
/*     */         //   45: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   48: aload_0
/*     */         //   49: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   52: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Ljava/lang/Runnable;
/*     */         //   57: iconst_0
/*     */         //   58: anewarray com/intellij/psi/PsiFile
/*     */         //   61: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */         //   64: aload_0
/*     */         //   65: getfield $languageSupport : Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */         //   68: aload_0
/*     */         //   69: getfield $element : Lcom/intellij/psi/PsiElement;
/*     */         //   72: aload_0
/*     */         //   73: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   76: aload_0
/*     */         //   77: getfield $editor : Lcom/intellij/openapi/editor/Editor;
/*     */         //   80: aload_0
/*     */         //   81: getfield $activity : Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;
/*     */         //   84: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/ml/llm/core/statistics/CompositeStatisticsIdeActivity;)Lcom/intellij/util/ThrowableRunnable;
/*     */         //   89: invokestatic run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */         //   92: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #221	-> 0
/*     */         //   #222	-> 13
/*     */         //   #221	-> 20
/*     */         //   #234	-> 64
/*     */         //   #240	-> 92
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	93	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$transform$task$1$run$2$1;
/*     */       }
/*     */       
/*     */       private static final void invoke$lambda$0(LLMDocumentationSupport $languageSupport, WriteDocumentationIntention this$0, LLMResponseChoice $it, Function1 $validator, Project $project, PsiElement $element, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */         Intrinsics.checkNotNullParameter(WriteDocumentationIntention.this, "this$0");
/*     */         Intrinsics.checkNotNullParameter($it, "$it");
/*     */         Intrinsics.checkNotNullParameter($validator, "$validator");
/*     */         Intrinsics.checkNotNullParameter($project, "$project");
/*     */         Intrinsics.checkNotNullParameter($element, "$element");
/*     */         Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */         Intrinsics.checkNotNullParameter($activity, "$activity");
/*     */         if ($languageSupport == null || $languageSupport.getCommentStart() == null)
/*     */           $languageSupport.getCommentStart(); 
/*     */         String commentStart = "";
/*     */         if ($languageSupport == null || $languageSupport.getCommentEnd() == null)
/*     */           $languageSupport.getCommentEnd(); 
/*     */         String commentEnd = "";
/*     */         String suggestion = WriteDocumentationIntention.this.preprocessSuggestion($it.getText(), commentStart, commentEnd);
/*     */         if (!((Boolean)$validator.invoke(suggestion)).booleanValue()) {
/*     */           WriteDocumentationIntention.this.logger.warn("Ignored suggestion: " + suggestion);
/*     */           return;
/*     */         } 
/*     */         Intrinsics.checkNotNullExpressionValue($editor.getDocument(), "editor.document");
/*     */         WriteDocumentationIntention.this.replaceOrAddDocumentation($project, $element, suggestion, $editor.getDocument());
/*     */         CommonLoggerService.logDocumentationGenerationFinished$default(CommonLoggerService.Companion.getInstance(), $activity, suggestion, FinishState.SUCCEED, null, null, 24, null);
/*     */       }
/*     */       
/*     */       private static final void invoke$lambda$2(LLMDocumentationSupport $languageSupport, PsiElement $element, Project $project, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */         Intrinsics.checkNotNullParameter($element, "$element");
/*     */         Intrinsics.checkNotNullParameter($project, "$project");
/*     */         Intrinsics.checkNotNullParameter($editor, "$editor");
/*     */         Intrinsics.checkNotNullParameter($activity, "$activity");
/*     */         PsiElement docComment = $languageSupport.getDocComment($element);
/*     */         int $i$a$-let-WriteDocumentationIntention$transform$task$1$run$2$1$2$1 = 0;
/*     */         NotificationsKt.showScoreNotificationInlay($project, $editor, (StatisticsIdeActivities)$activity, UtilsKt.getEndOffset(docComment));
/*     */         $languageSupport.getDocComment($element);
/*     */       }
/*     */       
/*     */       WriteDocumentationIntention$transform$task$1$run$2$1(WriteDocumentationIntention $receiver, LLMDocumentationSupport $languageSupport, LLMResponseChoice $it, Function1<String, Boolean> $validator, PsiElement $element, Editor $editor, CompositeStatisticsIdeActivity $activity) {
/*     */         super(0);
/*     */       }
/*     */     } }
/*     */ 
/*     */   
/*     */   private final void insertStreamingDocumentation(Project project, PsiFile file, RangeMarker documentRange, String suggestion, Document document, LLMDocumentationSupport support, String newLineIndent) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: astore #10
/*     */     //   4: iconst_0
/*     */     //   5: istore #11
/*     */     //   7: aload #6
/*     */     //   9: invokeinterface getCommentBoundsRegex : ()Ljava/util/regex/Pattern;
/*     */     //   14: aload #10
/*     */     //   16: checkcast java/lang/CharSequence
/*     */     //   19: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/*     */     //   22: invokevirtual find : ()Z
/*     */     //   25: ifeq -> 45
/*     */     //   28: aload #10
/*     */     //   30: ldc_w '\\n'
/*     */     //   33: ldc_w ''
/*     */     //   36: iconst_0
/*     */     //   37: iconst_4
/*     */     //   38: aconst_null
/*     */     //   39: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   42: goto -> 47
/*     */     //   45: aload #10
/*     */     //   47: nop
/*     */     //   48: astore #10
/*     */     //   50: iconst_0
/*     */     //   51: istore #11
/*     */     //   53: aload #6
/*     */     //   55: invokeinterface getCommentBoundsRegex : ()Ljava/util/regex/Pattern;
/*     */     //   60: aload #10
/*     */     //   62: checkcast java/lang/CharSequence
/*     */     //   65: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/*     */     //   68: ldc_w ''
/*     */     //   71: invokevirtual replaceAll : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   74: nop
/*     */     //   75: dup
/*     */     //   76: ldc_w 'suggestion\\n      .let { …cher(it).replaceAll("") }'
/*     */     //   79: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   82: ldc_w '\\n'
/*     */     //   85: aload #7
/*     */     //   87: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   92: iconst_0
/*     */     //   93: iconst_4
/*     */     //   94: aconst_null
/*     */     //   95: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   98: astore #8
/*     */     //   100: aload #8
/*     */     //   102: aload_3
/*     */     //   103: aload #6
/*     */     //   105: aload #5
/*     */     //   107: aload_1
/*     */     //   108: aload_2
/*     */     //   109: <illegal opcode> run : (Ljava/lang/String;Lcom/intellij/openapi/editor/RangeMarker;Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;)Ljava/lang/Runnable;
/*     */     //   114: astore #9
/*     */     //   116: aload_1
/*     */     //   117: ldc_w 'intentions.write.documentation.write.action.name'
/*     */     //   120: iconst_0
/*     */     //   121: anewarray java/lang/Object
/*     */     //   124: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   127: aload_0
/*     */     //   128: getfield writeActionGroupId : Ljava/lang/String;
/*     */     //   131: aload #9
/*     */     //   133: iconst_0
/*     */     //   134: anewarray com/intellij/psi/PsiFile
/*     */     //   137: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   140: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #251	-> 0
/*     */     //   #252	-> 2
/*     */     //   #406	-> 4
/*     */     //   #252	-> 7
/*     */     //   #252	-> 47
/*     */     //   #253	-> 48
/*     */     //   #406	-> 50
/*     */     //   #253	-> 53
/*     */     //   #253	-> 74
/*     */     //   #253	-> 75
/*     */     //   #254	-> 82
/*     */     //   #251	-> 98
/*     */     //   #256	-> 100
/*     */     //   #267	-> 116
/*     */     //   #269	-> 140
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   7	40	11	$i$a$-let-WriteDocumentationIntention$insertStreamingDocumentation$cleanedText$1	I
/*     */     //   4	43	10	it	Ljava/lang/String;
/*     */     //   53	21	11	$i$a$-let-WriteDocumentationIntention$insertStreamingDocumentation$cleanedText$2	I
/*     */     //   50	24	10	it	Ljava/lang/String;
/*     */     //   100	41	8	cleanedText	Ljava/lang/String;
/*     */     //   116	25	9	task	Ljava/lang/Runnable;
/*     */     //   0	141	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   0	141	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	141	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   0	141	3	documentRange	Lcom/intellij/openapi/editor/RangeMarker;
/*     */     //   0	141	4	suggestion	Ljava/lang/String;
/*     */     //   0	141	5	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	141	6	support	Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   0	141	7	newLineIndent	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final void insertStreamingDocumentation$lambda$4(String $cleanedText, RangeMarker $documentRange, LLMDocumentationSupport $support, Document $document, Project $project, PsiFile $file) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w '$cleanedText'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w '$support'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w '$document'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload #4
/*     */     //   23: ldc_w '$project'
/*     */     //   26: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   29: aload #5
/*     */     //   31: ldc_w '$file'
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
/*     */     //   60: ifnull -> 81
/*     */     //   63: invokeinterface getEndOffset : ()I
/*     */     //   68: aload_2
/*     */     //   69: invokeinterface getCommentEnd : ()Ljava/lang/String;
/*     */     //   74: invokevirtual length : ()I
/*     */     //   77: isub
/*     */     //   78: goto -> 83
/*     */     //   81: pop
/*     */     //   82: return
/*     */     //   83: istore #6
/*     */     //   85: aload_3
/*     */     //   86: iload #6
/*     */     //   88: aload_0
/*     */     //   89: checkcast java/lang/CharSequence
/*     */     //   92: invokeinterface insertString : (ILjava/lang/CharSequence;)V
/*     */     //   97: aload #4
/*     */     //   99: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   102: aload_3
/*     */     //   103: invokevirtual commitDocument : (Lcom/intellij/openapi/editor/Document;)V
/*     */     //   106: new com/intellij/openapi/util/TextRange
/*     */     //   109: dup
/*     */     //   110: aload_1
/*     */     //   111: invokeinterface getStartOffset : ()I
/*     */     //   116: iload #6
/*     */     //   118: aload_0
/*     */     //   119: invokevirtual length : ()I
/*     */     //   122: iadd
/*     */     //   123: invokespecial <init> : (II)V
/*     */     //   126: astore #7
/*     */     //   128: aload #4
/*     */     //   130: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/codeStyle/CodeStyleManager;
/*     */     //   133: aload #5
/*     */     //   135: aload #7
/*     */     //   137: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   140: checkcast java/util/Collection
/*     */     //   143: invokevirtual reformatText : (Lcom/intellij/psi/PsiFile;Ljava/util/Collection;)V
/*     */     //   146: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #257	-> 37
/*     */     //   #257	-> 54
/*     */     //   #259	-> 58
/*     */     //   #260	-> 85
/*     */     //   #261	-> 97
/*     */     //   #263	-> 106
/*     */     //   #264	-> 128
/*     */     //   #265	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   85	62	6	insertingOffset	I
/*     */     //   128	19	7	reformatRange	Lcom/intellij/openapi/util/TextRange;
/*     */     //   0	147	0	$cleanedText	Ljava/lang/String;
/*     */     //   0	147	1	$documentRange	Lcom/intellij/openapi/editor/RangeMarker;
/*     */     //   0	147	2	$support	Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   0	147	3	$document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	147	4	$project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	147	5	$file	Lcom/intellij/psi/PsiFile;
/*     */   }
/*     */   
/*     */   private final void replaceOrAddDocumentation(Project project, PsiElement element, String suggestion, Document document) {
/*     */     try {
/*     */       if ((LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage()) != null) {
/*     */         ((LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage())).replaceComment(element, suggestion);
/*     */       } else {
/*     */         (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage());
/*     */       } 
/*     */     } catch (IncorrectOperationException _) {
/*     */       ApplyTransformationIntention.Companion.updateDocument$intellij_ml_llm(project, suggestion, document, new TextRange(element.getTextRange().getStartOffset(), element.getTextRange().getStartOffset()));
/*     */     } 
/*     */   }
/*     */   
/*     */   private final List<PsiNameIdentifierOwner> findSelectedElementToDocument(Editor editor, Project project, SelectionModel selectionModel) {
/*     */     PsiFile rootPsiFile;
/*     */     VirtualFile rootFile = editor.getVirtualFile();
/*     */     if (PsiManager.getInstance(project).findFile(rootFile) == null) {
/*     */       PsiManager.getInstance(project).findFile(rootFile);
/*     */       return CollectionsKt.emptyList();
/*     */     } 
/*     */     LLMDocumentationSupport support = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(rootPsiFile.getLanguage());
/*     */     return support.getSelectedElementToDocument((PsiElement)rootPsiFile, selectionModel);
/*     */   }
/*     */   
/*     */   private final String getInstruction(PsiElement element) {
/*     */     String instruction = getBaseInstruction();
/*     */     if (element != null) {
/*     */       LLMDocumentationSupport llmSupport = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage());
/*     */       VariableContext variableContext = (new VariableContextProvider(false, false, false, 7, null)).from(element);
/*     */       if (variableContext.getName() != null)
/*     */         instruction = getVariableInstruction(variableContext); 
/*     */       MethodContext methodContext = (new MethodContextProvider(false, false, 3, null)).from(element);
/*     */       if (methodContext.getName() != null) {
/*     */         Intrinsics.checkNotNullExpressionValue(llmSupport, "llmSupport");
/*     */         instruction = getMethodInstruction(llmSupport, methodContext);
/*     */       } 
/*     */       ClassContext classContext = (new ClassContextProvider(false, 1, null)).from(element);
/*     */       if (classContext.getName() != null)
/*     */         instruction = getClassInstruction(classContext); 
/*     */       instruction = instruction + instruction;
/*     */     } 
/*     */     return instruction;
/*     */   }
/*     */   
/*     */   private final String getInstructionSuffix(PsiElement element) {
/*     */     String instruction = ", do not return example code, do not use @author and @version tags";
/*     */     LLMDocumentationSupport llmSupport = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage());
/*     */     if (llmSupport != null)
/*     */       instruction = instruction + ", " + instruction; 
/*     */     String format = llmSupport.getDocumentationFormatInfoForElement(element);
/*     */     if ((((CharSequence)format).length() == 0))
/*     */       return instruction; 
/*     */     instruction = instruction + "\n" + instruction;
/*     */     return instruction;
/*     */   }
/*     */   
/*     */   private final String getBaseInstruction() {
/*     */     return "write documentation for given code";
/*     */   }
/*     */   
/*     */   private final String getVariableInstruction(VariableContext context) {
/*     */     return "write documentation for given variable " + context.getName();
/*     */   }
/*     */   
/*     */   private final String getMethodInstruction(LLMDocumentationSupport llmSupport, MethodContext context) {
/*     */     String instruction = "write documentation for given method " + context.getName();
/*     */     if (!context.getParamNames().isEmpty())
/*     */       instruction = instruction + "\n" + instruction; 
/*     */     CharSequence charSequence = context.getReturnType();
/*     */     if (!((charSequence == null || charSequence.length() == 0) ? 1 : 0))
/*     */       instruction = instruction + "\n" + instruction; 
/*     */     return instruction;
/*     */   }
/*     */   
/*     */   private final String getClassInstruction(ClassContext context) {
/*     */     return "write documentation for given class " + context.getName();
/*     */   }
/*     */   
/*     */   private final Function1<String, Boolean> createValidator(PsiNamedElement element) {
/*     */     LLMDocumentationSupport support = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage());
/*     */     if (support != null)
/*     */       return new WriteDocumentationIntention$createValidator$1(support, element); 
/*     */     return WriteDocumentationIntention$createValidator$2.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*     */   static final class WriteDocumentationIntention$createValidator$1 extends Lambda implements Function1<String, Boolean> {
/*     */     WriteDocumentationIntention$createValidator$1(LLMDocumentationSupport $support, PsiNamedElement $element) {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       Intrinsics.checkNotNullExpressionValue(this.$element.getProject(), "element.project");
/*     */       return Boolean.valueOf(this.$support.isValidComment(this.$element.getProject(), it));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*     */   static final class WriteDocumentationIntention$createValidator$2 extends Lambda implements Function1<String, Boolean> {
/*     */     public static final WriteDocumentationIntention$createValidator$2 INSTANCE = new WriteDocumentationIntention$createValidator$2();
/*     */     
/*     */     WriteDocumentationIntention$createValidator$2() {
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
/*     */   private final String preprocessSuggestion(String suggestion, String commentStart, String commentEnd) {
/*     */     int startIndex = StringsKt.indexOf$default(suggestion, commentStart, 0, false, 6, null);
/*     */     int endIndex = StringsKt.indexOf$default(suggestion, commentEnd, 0, false, 6, null);
/*     */     if (startIndex < 0 || endIndex < 0)
/*     */       return suggestion + "\n"; 
/*     */     Intrinsics.checkNotNullExpressionValue(suggestion.substring(startIndex, endIndex + 2), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */     return suggestion.substring(startIndex, endIndex + 2) + "\n";
/*     */   }
/*     */   
/*     */   private final String composeQuery(PsiNameIdentifierOwner namedElement) {
/*     */     LLMDocumentationSupport support = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(namedElement.getLanguage());
/*     */     String elementText = support.getElementToDocumentText((PsiElement)namedElement);
/*     */     if (support != null) {
/*     */       Pair exampleComment = support.findExampleComment(namedElement);
/*     */       if (exampleComment != null)
/*     */         return "Q: " + exampleComment.getFirst() + "\nA: " + exampleComment.getSecond() + "\nQ: " + elementText + "\n"; 
/*     */     } 
/*     */     return elementText;
/*     */   }
/*     */   
/*     */   private final PsiNameIdentifierOwner getClosestNamedElement(PsiElement element) {
/*     */     LLMDocumentationSupport support = (LLMDocumentationSupport)LLMDocumentationSupportBean.INSTANCE.forLanguage(element.getLanguage());
/*     */     return support.getClosestNamedElement(element);
/*     */   }
/*     */   
/*     */   private final PsiNameIdentifierOwner getClosestToCaretNamedElement(Editor editor) {
/*     */     PsiElement element;
/*     */     if (PsiUtilBase.getElementAtCaret(editor) == null) {
/*     */       PsiUtilBase.getElementAtCaret(editor);
/*     */       return null;
/*     */     } 
/*     */     return getClosestNamedElement(element);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention$StreamingDocumentationState;", "", "(Ljava/lang/String;I)V", "WAITING_TO_START", "IN_PROGRESS", "FINISHED", "intellij.ml.llm"})
/*     */   private enum StreamingDocumentationState {
/*     */     WAITING_TO_START, IN_PROGRESS, FINISHED;
/*     */   }
/*     */   
/*     */   private final void restorePrevDocumentation(Project project, LLMDocumentationSupport support, PsiElement element, String prevDoc) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'intentions.write.documentation.write.action.name'
/*     */     //   4: iconst_0
/*     */     //   5: anewarray java/lang/Object
/*     */     //   8: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   11: aload_0
/*     */     //   12: getfield writeActionGroupId : Ljava/lang/String;
/*     */     //   15: aload_2
/*     */     //   16: aload_3
/*     */     //   17: aload #4
/*     */     //   19: <illegal opcode> run : (Lcom/intellij/ml/llm/core/LLMDocumentationSupport;Lcom/intellij/psi/PsiElement;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   24: iconst_0
/*     */     //   25: anewarray com/intellij/psi/PsiFile
/*     */     //   28: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;[Lcom/intellij/psi/PsiFile;)V
/*     */     //   31: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #396	-> 0
/*     */     //   #399	-> 31
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	32	0	this	Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;
/*     */     //   0	32	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	32	2	support	Lcom/intellij/ml/llm/core/LLMDocumentationSupport;
/*     */     //   0	32	3	element	Lcom/intellij/psi/PsiElement;
/*     */     //   0	32	4	prevDoc	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final void restorePrevDocumentation$lambda$5(LLMDocumentationSupport $support, PsiElement $element, String $prevDoc) {
/*     */     Intrinsics.checkNotNullParameter($support, "$support");
/*     */     Intrinsics.checkNotNullParameter($element, "$element");
/*     */     Intrinsics.checkNotNullParameter($prevDoc, "$prevDoc");
/*     */     $support.replaceComment($element, $prevDoc);
/*     */   }
/*     */   
/*     */   public WriteDocumentationIntention() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/WriteDocumentationIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */