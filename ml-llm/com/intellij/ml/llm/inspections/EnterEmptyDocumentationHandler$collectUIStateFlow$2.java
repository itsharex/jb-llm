/*     */ package com.intellij.ml.llm.inspections;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMOnHoverButton;
/*     */ import com.intellij.ml.llm.LLMSuggestGenerationPresentation;
/*     */ import com.intellij.ml.llm.intentions.editor.WriteDocumentationIntention;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H@¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "state", "Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;", "emit", "(Lcom/intellij/ml/llm/LLMSuggestGenerationPresentation$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"})
/*     */ final class EnterEmptyDocumentationHandler$collectUIStateFlow$2<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   @Nullable
/*     */   public final Object emit(@NotNull LLMSuggestGenerationPresentation.State state, @NotNull Continuation $completion) {
/* 118 */     if (this.$uiStateFlow.getValue() == state) {
/* 119 */       LLMOnHoverButton errorButton; switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
/*     */         
/*     */         case 1:
/* 122 */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 123 */                       this.$suggestButtonPresentation.onDispose();
/* 124 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$suggestButtonPresentation.onDispose(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$suggestButtonPresentation.onDispose(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */                 @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion); }
/*     */                 @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE;
/*     */         case 2:
/* 128 */           errorButton = EnterEmptyDocumentationHandler.access$getExceptionButtonInlayPresentation(EnterEmptyDocumentationHandler.this, this.$editor, this.$file, this.$intention);
/* 129 */           return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, errorButton, this.$intention, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 130 */                       this.$suggestButtonPresentation.showException(this.$errorButton);
/*     */ 
/*     */                       
/* 133 */                       return this.$intention.stopStreaming(); }
/*     */                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */                 @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, this.$errorButton, this.$intention, $completion); }
/*     */                 @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);
/*     */         case 3:
/* 138 */           if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 139 */                       this.$suggestButtonPresentation.onDispose();
/* 140 */                       return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$suggestButtonPresentation.onDispose(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$suggestButtonPresentation, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$suggestButtonPresentation.onDispose(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */                 @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$suggestButtonPresentation, $completion); }
/*     */                 @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }$completion); return Unit.INSTANCE;
/*     */       } 
/* 144 */     }  return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   EnterEmptyDocumentationHandler$collectUIStateFlow$2(EnterEmptyDocumentationHandler $receiver, Editor $editor, PsiFile $file, WriteDocumentationIntention $intention, LLMSuggestGenerationPresentation $suggestButtonPresentation) {}
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler$collectUIStateFlow$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */