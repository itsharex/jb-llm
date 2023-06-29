/*    */ package com.intellij.ml.llm.python.completion;
/*    */ 
/*    */ import com.intellij.codeInsight.completion.CompletionResultSet;
/*    */ import com.intellij.ml.llm.refactorings.LlmNameProviderKt;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNamedElement;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "LlmPythonNameCompletionContributor.kt", l = {33}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.python.completion.LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1
/*    */   extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
/*    */   int label;
/*    */   
/*    */   LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(PsiNamedElement $element, CompletionResultSet $result, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 33 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); Intrinsics.checkNotNullExpressionValue(this.$element.getProject(), "element.project"); this.label = 1; return (LlmNameProviderKt.suggestNames(this.$element.getProject(), (PsiElement)this.$element, this.$result.getPrefixMatcher().getPrefix(), null, (Continuation)this) == object) ? object : LlmNameProviderKt.suggestNames(this.$element.getProject(), (PsiElement)this.$element, this.$result.getPrefixMatcher().getPrefix(), null, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1> $completion) {
/*    */     return (Continuation<Unit>)new LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(this.$element, this.$result, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/completion/LlmPythonNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */