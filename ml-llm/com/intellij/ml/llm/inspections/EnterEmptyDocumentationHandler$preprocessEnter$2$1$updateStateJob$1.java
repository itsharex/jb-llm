/*    */ package com.intellij.ml.llm.inspections;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMSuggestGenerationPresentation;
/*    */ import com.intellij.ml.llm.intentions.editor.WriteDocumentationIntention;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "EnterEmptyDocumentationHandler.kt", l = {88}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.inspections.EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1(MutableStateFlow<LLMSuggestGenerationPresentation.State> $uiStateFlow, LLMSuggestGenerationPresentation $suggestButtonPresentation, Editor $editor, PsiFile $file, WriteDocumentationIntention $intention, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 87 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 88 */         this.label = 1; if (EnterEmptyDocumentationHandler.access$collectUIStateFlow(EnterEmptyDocumentationHandler.this, this.$uiStateFlow, this.$suggestButtonPresentation, this.$editor, this.$file, this.$intention, (Continuation)this) == object) return object;  EnterEmptyDocumentationHandler.access$collectUIStateFlow(EnterEmptyDocumentationHandler.this, this.$uiStateFlow, this.$suggestButtonPresentation, this.$editor, this.$file, this.$intention, (Continuation)this);
/* 89 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1> $completion) {
/*    */     return (Continuation<Unit>)new EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1(this.$uiStateFlow, this.$suggestButtonPresentation, this.$editor, this.$file, this.$intention, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler$preprocessEnter$2$1$updateStateJob$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */