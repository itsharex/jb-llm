/*     */ package com.intellij.ml.llm.inspections;
/*     */ import com.intellij.codeInsight.hints.presentation.InlayPresentation;
/*     */ import com.intellij.codeInsight.hints.presentation.PresentationRenderer;
/*     */ import com.intellij.ml.llm.LLMOnHoverButton;
/*     */ import com.intellij.ml.llm.LLMSuggestGenerationPresentation;
/*     */ import com.intellij.ml.llm.LLMTextPresentation;
/*     */ import com.intellij.ml.llm.LLMTextWithIconPresentation;
/*     */ import com.intellij.ml.llm.intentions.editor.WriteDocumentationIntention;
/*     */ import com.intellij.openapi.actionSystem.DataContext;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Ref;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J?\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\b2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H@ø\001\000¢\006\002\020\022J \020\023\032\0020\0242\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\002J \020\025\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\002JF\020\026\032\0020\0272\006\020\016\032\0020\0172\006\020\f\032\0020\r2\f\020\030\032\b\022\004\022\0020\0320\0312\f\020\033\032\b\022\004\022\0020\0320\0312\006\020\034\032\0020\0352\b\020\036\032\004\030\0010\037H\026R\016\020\003\032\0020\004XD¢\006\002\n\000\002\004\n\002\b\031¨\006 "}, d2 = {"Lcom/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler;", "Lcom/intellij/codeInsight/editorActions/enter/EnterHandlerDelegateAdapter;", "()V", "UI_FLOW_TIMEOUT", "", "collectUIStateFlow", "", "uiStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "suggestButtonPresentation", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "intention", "Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;Lcom/intellij/ml/llm/intentions/editor/WriteDocumentationIntention;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExceptionButtonInlayPresentation", "Lcom/intellij/ml/llm/LLMOnHoverButton;", "getSuggestInlayPresentation", "preprocessEnter", "Lcom/intellij/codeInsight/editorActions/enter/EnterHandlerDelegate$Result;", "caretOffset", "Lcom/intellij/openapi/util/Ref;", "", "caretAdvance", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "originalHandler", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nEnterEmptyDocumentationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterEmptyDocumentationHandler.kt\ncom/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n766#2:216\n857#2,2:217\n766#2:219\n857#2,2:220\n1855#2,2:222\n*S KotlinDebug\n*F\n+ 1 EnterEmptyDocumentationHandler.kt\ncom/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler\n*L\n61#1:216\n61#1:217,2\n62#1:219\n62#1:220,2\n65#1:222,2\n*E\n"})
/*     */ public final class EnterEmptyDocumentationHandler extends EnterHandlerDelegateAdapter {
/*  38 */   private final long UI_FLOW_TIMEOUT = 5000L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public EnterHandlerDelegate.Result preprocessEnter(@NotNull PsiFile file, @NotNull Editor editor, @NotNull Ref caretOffset, @NotNull Ref caretAdvance, @NotNull DataContext dataContext, @Nullable EditorActionHandler originalHandler) {
/*     */     LLMSuggestGenerationPresentation suggestButtonPresentation;
/*  46 */     Intrinsics.checkNotNullParameter(file, "file"); Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(caretOffset, "caretOffset"); Intrinsics.checkNotNullParameter(caretAdvance, "caretAdvance"); Intrinsics.checkNotNullParameter(dataContext, "dataContext"); if (!(editor.getInlayModel() instanceof com.intellij.openapi.editor.impl.InlayModelImpl)) return EnterHandlerDelegate.Result.Continue;
/*     */     
/*  48 */     Integer offset = (Integer)caretOffset.get();
/*  49 */     Intrinsics.checkNotNullExpressionValue(offset, "offset"); CodeDocumentationUtil.CommentContext commentContext1 = CodeDocumentationUtil.tryParseCommentContext(file, editor.getDocument().getCharsSequence(), offset.intValue(), 
/*  50 */         editor.getDocument().getLineStartOffset(
/*  51 */           editor.getDocument().getLineNumber(offset.intValue()))); Intrinsics.checkNotNullExpressionValue(commentContext1, "tryParseCommentContext(f…                  )\n    )"); CodeDocumentationUtil.CommentContext commentContext = commentContext1;
/*     */ 
/*     */ 
/*     */     
/*  55 */     if (commentContext.docStart)
/*  56 */     { file.findElementAt(offset.intValue()); PsiElement caretParent = (file.findElementAt(offset.intValue()) != null) ? file.findElementAt(offset.intValue()).getParent() : null;
/*  57 */       if (caretParent instanceof com.intellij.psi.PsiComment)
/*  58 */       { Intrinsics.checkNotNullExpressionValue(editor.getInlayModel().getAfterLineEndElementsInRange(UtilsKt.getStartOffset(caretParent), UtilsKt.getStartOffset(caretParent)), "editor.inlayModel.getAft… caretParent.startOffset)"); List existingInlays = editor.getInlayModel().getAfterLineEndElementsInRange(UtilsKt.getStartOffset(caretParent), UtilsKt.getStartOffset(caretParent));
/*     */         
/*  60 */         List list1 = existingInlays;
/*  61 */         int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 216 */         List list2 = list1; Collection<Object> collection1 = new ArrayList(); int $i$f$filterTo = 0;
/* 217 */         for (Object element$iv$iv : list2) { Inlay it = (Inlay)element$iv$iv; int $i$a$-filter-EnterEmptyDocumentationHandler$preprocessEnter$llmInlays$1 = 0; if (it.getRenderer() instanceof PresentationRenderer) collection1.add(element$iv$iv);  }
/* 218 */          Iterable $this$filter$iv = collection1; $i$f$filter = 0;
/* 219 */         Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); $i$f$filterTo = 0;
/* 220 */         for (Object element$iv$iv : $this$filterTo$iv$iv) { Inlay it = (Inlay)element$iv$iv; int $i$a$-filter-EnterEmptyDocumentationHandler$preprocessEnter$llmInlays$2 = 0; Intrinsics.checkNotNull(it.getRenderer(), "null cannot be cast to non-null type com.intellij.codeInsight.hints.presentation.PresentationRenderer"); if (((PresentationRenderer)it.getRenderer()).getPresentation() instanceof LLMSuggestGenerationPresentation) destination$iv$iv.add(element$iv$iv);  }
/* 221 */          List llmInlays = (List)destination$iv$iv; if (!llmInlays.isEmpty())
/* 222 */         { Iterable $this$forEach$iv = llmInlays; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); } else { MutableStateFlow<LLMSuggestGenerationPresentation.State> uiStateFlow = StateFlowKt.MutableStateFlow(LLMSuggestGenerationPresentation.State.SUGGESTION); WriteDocumentationIntention intention = new WriteDocumentationIntention(caretParent); suggestButtonPresentation = getSuggestInlayPresentation(editor, file, intention); Inlay<PresentationRenderer> inlay = editor.getInlayModel().addAfterLineEndElement(UtilsKt.getStartOffset(caretParent), true, (EditorCustomElementRenderer)new PresentationRenderer((InlayPresentation)suggestButtonPresentation)); Inlay<PresentationRenderer> it = inlay; int $i$a$-let-EnterEmptyDocumentationHandler$preprocessEnter$2 = 0; Function0 repaintOnChange = new EnterEmptyDocumentationHandler$preprocessEnter$2$repaintOnChange$1(it); suggestButtonPresentation.addPresentationChangedListener(repaintOnChange); Project project = editor.getProject(); int $i$a$-let-EnterEmptyDocumentationHandler$preprocessEnter$2$1 = 0; Intrinsics.checkNotNullExpressionValue(project, "it"); CoroutineScope scope = LLMCoroutineScope.Companion.getScope(project); Job updateStateJob = BuildersKt.launch$default(scope, null, null, new EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1(uiStateFlow, suggestButtonPresentation, editor, file, intention, null), 3, null); Function0 disposeInlayAction = new EnterEmptyDocumentationHandler$preprocessEnter$2$1$disposeInlayAction$1(updateStateJob, inlay); suggestButtonPresentation.addDisposeListener(disposeInlayAction); suggestButtonPresentation.addStateChangedListener(new EnterEmptyDocumentationHandler$preprocessEnter$2$1$1(uiStateFlow)); editor.getProject(); Intrinsics.checkNotNullExpressionValue(super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler), "super.preprocessEnter(fi…Context, originalHandler)"); return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler); }  } else { Intrinsics.checkNotNullExpressionValue(super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler), "super.preprocessEnter(fi…Context, originalHandler)"); return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler); }  } else { Intrinsics.checkNotNullExpressionValue(super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler), "super.preprocessEnter(fi…Context, originalHandler)"); return super.preprocessEnter(file, editor, caretOffset, caretAdvance, dataContext, originalHandler); }  if (suggestButtonPresentation.hasNext()) { Object element$iv = suggestButtonPresentation.next(); Inlay it = (Inlay)element$iv; int $i$a$-forEach-EnterEmptyDocumentationHandler$preprocessEnter$1 = 0;
/*     */       it.repaint(); }
/*     */     
/*     */     return EnterHandlerDelegate.Result.Continue;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class EnterEmptyDocumentationHandler$preprocessEnter$2$repaintOnChange$1 extends Lambda implements Function0<Unit> {
/*     */     EnterEmptyDocumentationHandler$preprocessEnter$2$repaintOnChange$1(Inlay<PresentationRenderer> $it) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final void invoke() {
/*     */       this.$it.update();
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EnterEmptyDocumentationHandler.kt", l = {88}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.inspections.EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1(MutableStateFlow<LLMSuggestGenerationPresentation.State> $uiStateFlow, LLMSuggestGenerationPresentation $suggestButtonPresentation, Editor $editor, PsiFile $file, WriteDocumentationIntention $intention, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (EnterEmptyDocumentationHandler.this.collectUIStateFlow(this.$uiStateFlow, this.$suggestButtonPresentation, this.$editor, this.$file, this.$intention, (Continuation)this) == object)
/*     */             return object; 
/*     */           EnterEmptyDocumentationHandler.this.collectUIStateFlow(this.$uiStateFlow, this.$suggestButtonPresentation, this.$editor, this.$file, this.$intention, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1> $completion) {
/*     */       return (Continuation<Unit>)new EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1(this.$uiStateFlow, this.$suggestButtonPresentation, this.$editor, this.$file, this.$intention, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class EnterEmptyDocumentationHandler$preprocessEnter$2$1$disposeInlayAction$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Job.DefaultImpls.cancel$default(this.$updateStateJob, null, 1, null);
/*     */       Disposer.dispose((Disposable)this.$inlay);
/*     */     }
/*     */     
/*     */     EnterEmptyDocumentationHandler$preprocessEnter$2$1$disposeInlayAction$1(Job $updateStateJob, Inlay<PresentationRenderer> $inlay) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "state1", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "state2", "invoke"})
/*     */   static final class EnterEmptyDocumentationHandler$preprocessEnter$2$1$1 extends Lambda implements Function2<LLMSuggestGenerationPresentation.State, LLMSuggestGenerationPresentation.State, Unit> {
/*     */     public final void invoke(@NotNull LLMSuggestGenerationPresentation.State state1, @NotNull LLMSuggestGenerationPresentation.State state2) {
/*     */       Intrinsics.checkNotNullParameter(state1, "state1");
/*     */       Intrinsics.checkNotNullParameter(state2, "state2");
/*     */       this.$uiStateFlow.setValue(state2);
/*     */     }
/*     */     
/*     */     EnterEmptyDocumentationHandler$preprocessEnter$2$1$1(MutableStateFlow<LLMSuggestGenerationPresentation.State> $uiStateFlow) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object collectUIStateFlow(MutableStateFlow<LLMSuggestGenerationPresentation.State> uiStateFlow, LLMSuggestGenerationPresentation suggestButtonPresentation, Editor editor, PsiFile file, WriteDocumentationIntention intention, Continuation $completion) {
/*     */     if (FlowKt.debounce((Flow)uiStateFlow, this.UI_FLOW_TIMEOUT).collect(new EnterEmptyDocumentationHandler$collectUIStateFlow$2(this, editor, file, intention, suggestButtonPresentation), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return FlowKt.debounce((Flow)uiStateFlow, this.UI_FLOW_TIMEOUT).collect(new EnterEmptyDocumentationHandler$collectUIStateFlow$2(this, editor, file, intention, suggestButtonPresentation), $completion); 
/*     */     FlowKt.debounce((Flow)uiStateFlow, this.UI_FLOW_TIMEOUT).collect(new EnterEmptyDocumentationHandler$collectUIStateFlow$2(this, editor, file, intention, suggestButtonPresentation), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "state", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "emit", "(Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*     */   static final class EnterEmptyDocumentationHandler$collectUIStateFlow$2<T> implements FlowCollector {
/*     */     @Nullable
/*     */     public final Object emit(@NotNull LLMSuggestGenerationPresentation.State state, @NotNull Continuation $completion) {
/*     */       if (this.$uiStateFlow.getValue() == state) {
/*     */         LLMOnHoverButton errorButton;
/*     */         switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
/*     */           case 1:
/*     */             if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) {
/*     */                   int label;
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invokeSuspend(@NotNull Object $result) {
/*     */                     IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.$suggestButtonPresentation.onDispose();
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   @NotNull
/*     */                   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion);
/*     */                   }
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */               return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) {
/*     */                     int label;
/*     */                     
/*     */                     @Nullable
/*     */                     public final Object invokeSuspend(@NotNull Object $result) {
/*     */                       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                       switch (this.label) {
/*     */                         case 0:
/*     */                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                           this.$suggestButtonPresentation.onDispose();
/*     */                           return Unit.INSTANCE;
/*     */                       } 
/*     */                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                     }
/*     */                     
/*     */                     @NotNull
/*     */                     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                       return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion);
/*     */                     }
/*     */                     
/*     */                     @Nullable
/*     */                     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                       return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                     }
/*     */                   }$completion); 
/*     */             BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) {
/*     */                   int label;
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invokeSuspend(@NotNull Object $result) {
/*     */                     IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.$suggestButtonPresentation.onDispose();
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   @NotNull
/*     */                   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion);
/*     */                   }
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }$completion);
/*     */             return Unit.INSTANCE;
/*     */           case 2:
/*     */             errorButton = EnterEmptyDocumentationHandler.this.getExceptionButtonInlayPresentation(this.$editor, this.$file, this.$intention);
/*     */             return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, errorButton, this.$intention, null) {
/*     */                   int label;
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invokeSuspend(@NotNull Object $result) {
/*     */                     IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.$suggestButtonPresentation.showException(this.$errorButton);
/*     */                         return this.$intention.stopStreaming();
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   @NotNull
/*     */                   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$suggestButtonPresentation, this.$errorButton, this.$intention, $completion);
/*     */                   }
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }$completion);
/*     */           case 3:
/*     */             if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) {
/*     */                   int label;
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invokeSuspend(@NotNull Object $result) {
/*     */                     IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.$suggestButtonPresentation.onDispose();
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   @NotNull
/*     */                   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion);
/*     */                   }
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */               return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) {
/*     */                     int label;
/*     */                     
/*     */                     @Nullable
/*     */                     public final Object invokeSuspend(@NotNull Object $result) {
/*     */                       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                       switch (this.label) {
/*     */                         case 0:
/*     */                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                           this.$suggestButtonPresentation.onDispose();
/*     */                           return Unit.INSTANCE;
/*     */                       } 
/*     */                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                     }
/*     */                     
/*     */                     @NotNull
/*     */                     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                       return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion);
/*     */                     }
/*     */                     
/*     */                     @Nullable
/*     */                     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                       return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                     }
/*     */                   }$completion); 
/*     */             BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) {
/*     */                   int label;
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invokeSuspend(@NotNull Object $result) {
/*     */                     IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.$suggestButtonPresentation.onDispose();
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   @NotNull
/*     */                   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion);
/*     */                   }
/*     */                   
/*     */                   @Nullable
/*     */                   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }$completion);
/*     */             return Unit.INSTANCE;
/*     */         } 
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     EnterEmptyDocumentationHandler$collectUIStateFlow$2(EnterEmptyDocumentationHandler $receiver, Editor $editor, PsiFile $file, WriteDocumentationIntention $intention, LLMSuggestGenerationPresentation $suggestButtonPresentation) {}
/*     */   }
/*     */   
/*     */   private final LLMSuggestGenerationPresentation getSuggestInlayPresentation(Editor editor, PsiFile file, WriteDocumentationIntention intention) {
/*     */     String processingText = LLMBundle.message("inlay.generation.processing", new Object[0]);
/*     */     AnimatedIcon.Default processingIcon = new AnimatedIcon.Default();
/*     */     String suggestionText = LLMBundle.message("inlay.documentation.generation.suggestion", new Object[0]);
/*     */     Intrinsics.checkNotNullExpressionValue(MLLlmIcons.AiAssistant, "AiAssistant");
/*     */     Icon suggestionIcon = MLLlmIcons.AiAssistant;
/*     */     Function2 suggestClickListener = new EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1(editor, intention, file);
/*     */     LLMOnHoverButton suggestButton = new LLMOnHoverButton((InlayPresentation)new LLMTextWithIconPresentation(editor, (InlayPresentation)new LLMTextPresentation(editor, suggestionText, false, null, false, 24, null), suggestionIcon), (InlayPresentation)new LLMTextWithIconPresentation(editor, (InlayPresentation)new LLMTextPresentation(editor, suggestionText, true, null, false, 24, null), suggestionIcon), suggestClickListener, null, 8, null);
/*     */     LLMSuggestGenerationPresentation suggestPresentation = new LLMSuggestGenerationPresentation(editor, suggestButton, new LLMOnHoverButton((InlayPresentation)new LLMTextWithIconPresentation(editor, (InlayPresentation)new LLMTextPresentation(editor, processingText, false, null, false, 24, null), (Icon)processingIcon), null, null, null, 14, null));
/*     */     intention.addOnStreamingStartedListener(new EnterEmptyDocumentationHandler$getSuggestInlayPresentation$1(suggestPresentation));
/*     */     return suggestPresentation;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/awt/event/MouseEvent;", "<anonymous parameter 1>", "Ljava/awt/Point;", "invoke", "(Ljava/awt/event/MouseEvent;Ljava/awt/Point;)Ljava/lang/Boolean;"})
/*     */   static final class EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1 extends Lambda implements Function2<MouseEvent, Point, Boolean> {
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull MouseEvent param1MouseEvent, @NotNull Point param1Point) {
/*     */       Intrinsics.checkNotNullParameter(param1MouseEvent, "<anonymous parameter 0>");
/*     */       Intrinsics.checkNotNullParameter(param1Point, "<anonymous parameter 1>");
/*     */       Project project1 = this.$editor.getProject();
/*     */       WriteDocumentationIntention writeDocumentationIntention = this.$intention;
/*     */       Editor editor = this.$editor;
/*     */       PsiFile psiFile = this.$file;
/*     */       Project it = project1;
/*     */       int $i$a$-let-EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1$1 = 0;
/*     */       writeDocumentationIntention.invoke(it, editor, psiFile);
/*     */       this.$editor.getProject();
/*     */       return Boolean.valueOf(true);
/*     */     }
/*     */     
/*     */     EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1(Editor $editor, WriteDocumentationIntention $intention, PsiFile $file) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class EnterEmptyDocumentationHandler$getSuggestInlayPresentation$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       this.$suggestPresentation.onDispose();
/*     */     }
/*     */     
/*     */     EnterEmptyDocumentationHandler$getSuggestInlayPresentation$1(LLMSuggestGenerationPresentation $suggestPresentation) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   private final LLMOnHoverButton getExceptionButtonInlayPresentation(Editor editor, PsiFile file, WriteDocumentationIntention intention) {
/*     */     String errorText = LLMBundle.message("inlay.generation.error.server.unavailable", new Object[0]);
/*     */     Intrinsics.checkNotNullExpressionValue(AllIcons.General.BalloonError, "BalloonError");
/*     */     Icon errorIcon = AllIcons.General.BalloonError;
/*     */     String retryText = LLMBundle.message("inlay.generation.error.retry", new Object[0]);
/*     */     PresentationFactory factory = new PresentationFactory(editor);
/*     */     TextAttributes ideErrorAttributes = editor.getColorsScheme().getAttributes(ConsoleViewContentType.ERROR_OUTPUT_KEY);
/*     */     TextAttributes retryAttributes = editor.getColorsScheme().getAttributes(EditorColors.REFERENCE_HYPERLINK_COLOR);
/*     */     TextAttributes hoveredRetryAttributes = editor.getColorsScheme().getAttributes(CodeInsightColors.HYPERLINK_ATTRIBUTES);
/*     */     LLMTextWithIconPresentation errorMessage = new LLMTextWithIconPresentation(editor, (InlayPresentation)new LLMTextPresentation(editor, errorText, false, ideErrorAttributes, false, 16, null), errorIcon);
/*     */     LLMTextPresentation retryButton = new LLMTextPresentation(editor, retryText, false, retryAttributes, true);
/*     */     LLMTextPresentation retryButtonHovered = new LLMTextPresentation(editor, retryText, true, hoveredRetryAttributes, false, 16, null);
/*     */     Function2<? super MouseEvent, ? super Point, Boolean> isRetry = new EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$isRetry$1(errorMessage);
/*     */     Function2 onClick = new EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$onClick$1(isRetry, editor, intention, file);
/*     */     InlayPresentation[] arrayOfInlayPresentation = new InlayPresentation[2];
/*     */     arrayOfInlayPresentation[0] = (InlayPresentation)errorMessage;
/*     */     arrayOfInlayPresentation[1] = (InlayPresentation)retryButton;
/*     */     arrayOfInlayPresentation = new InlayPresentation[2];
/*     */     arrayOfInlayPresentation[0] = (InlayPresentation)errorMessage;
/*     */     arrayOfInlayPresentation[1] = (InlayPresentation)retryButtonHovered;
/*     */     return new LLMOnHoverButton(factory.seq(arrayOfInlayPresentation), factory.seq(arrayOfInlayPresentation), onClick, isRetry);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/awt/event/MouseEvent;", "translated", "Ljava/awt/Point;", "invoke", "(Ljava/awt/event/MouseEvent;Ljava/awt/Point;)Ljava/lang/Boolean;"})
/*     */   static final class EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$isRetry$1 extends Lambda implements Function2<MouseEvent, Point, Boolean> {
/*     */     EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$isRetry$1(LLMTextWithIconPresentation $errorMessage) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull MouseEvent param1MouseEvent, @NotNull Point translated) {
/*     */       Intrinsics.checkNotNullParameter(param1MouseEvent, "<anonymous parameter 0>");
/*     */       Intrinsics.checkNotNullParameter(translated, "translated");
/*     */       return Boolean.valueOf((translated.x >= this.$errorMessage.getWidth()));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "e", "Ljava/awt/event/MouseEvent;", "translated", "Ljava/awt/Point;", "invoke", "(Ljava/awt/event/MouseEvent;Ljava/awt/Point;)Ljava/lang/Boolean;"})
/*     */   static final class EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$onClick$1 extends Lambda implements Function2<MouseEvent, Point, Boolean> {
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull MouseEvent e, @NotNull Point translated) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       Intrinsics.checkNotNullParameter(translated, "translated");
/*     */       boolean retry = ((Boolean)this.$isRetry.invoke(e, translated)).booleanValue();
/*     */       if (retry) {
/*     */         Project project1 = this.$editor.getProject();
/*     */         WriteDocumentationIntention writeDocumentationIntention = this.$intention;
/*     */         Editor editor = this.$editor;
/*     */         PsiFile psiFile = this.$file;
/*     */         Project it = project1;
/*     */         int $i$a$-let-EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$onClick$1$1 = 0;
/*     */         writeDocumentationIntention.invoke(it, editor, psiFile);
/*     */         this.$editor.getProject();
/*     */       } 
/*     */       return Boolean.valueOf(retry);
/*     */     }
/*     */     
/*     */     EnterEmptyDocumentationHandler$getExceptionButtonInlayPresentation$onClick$1(Function2<MouseEvent, Point, Boolean> $isRetry, Editor $editor, WriteDocumentationIntention $intention, PsiFile $file) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */