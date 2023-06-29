/*    */ package com.intellij.ml.llm.java.completion;
/*    */ 
/*    */ import com.intellij.codeInsight.completion.CompletionParameters;
/*    */ import com.intellij.codeInsight.completion.CompletionProvider;
/*    */ import com.intellij.codeInsight.completion.CompletionResultSet;
/*    */ import com.intellij.codeInsight.lookup.LookupElement;
/*    */ import com.intellij.codeInsight.lookup.LookupElementBuilder;
/*    */ import com.intellij.ml.llm.refactorings.LlmNameProviderKt;
/*    */ import com.intellij.openapi.progress.CoroutinesKt;
/*    */ import com.intellij.openapi.util.registry.Registry;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNamedElement;
/*    */ import com.intellij.psi.util.PsiTreeUtil;
/*    */ import com.intellij.util.ProcessingContext;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J \020\003\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\0072\006\020\b\032\0020\tH\024¨\006\n"}, d2 = {"com/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor$llmCompletionProvider$1", "Lcom/intellij/codeInsight/completion/CompletionProvider;", "Lcom/intellij/codeInsight/completion/CompletionParameters;", "addCompletions", "", "parameters", "context", "Lcom/intellij/util/ProcessingContext;", "result", "Lcom/intellij/codeInsight/completion/CompletionResultSet;", "intellij.ml.llm.java"})
/*    */ public final class LlmJavaNameCompletionContributor$llmCompletionProvider$1
/*    */   extends CompletionProvider<CompletionParameters> {
/*    */   protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
/* 33 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(result, "result"); if (Registry.is("llm.is.internal")) {
/* 34 */       PsiNamedElement element; if ((PsiNamedElement)PsiTreeUtil.getParentOfType(parameters.getOriginalPosition(), PsiNamedElement.class) == null) { (PsiNamedElement)PsiTreeUtil.getParentOfType(parameters.getOriginalPosition(), PsiNamedElement.class); return; }
/* 35 */        List suggestNames = (List)CoroutinesKt.runBlockingCancellable(new LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(element, result, null));
/* 36 */       for (String suggestName : suggestNames)
/* 37 */         result.addElement((LookupElement)LookupElementBuilder.create(suggestName)); 
/*    */     } 
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LlmJavaNameCompletionContributor.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.java.completion.LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1")
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
/*    */     int label;
/*    */     
/*    */     LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(PsiNamedElement $element, CompletionResultSet $result, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           Intrinsics.checkNotNullExpressionValue(this.$element.getProject(), "element.project");
/*    */           this.label = 1;
/*    */           return (LlmNameProviderKt.suggestNames(this.$element.getProject(), (PsiElement)this.$element, this.$result.getPrefixMatcher().getPrefix(), null, (Continuation)this) == object) ? object : LlmNameProviderKt.suggestNames(this.$element.getProject(), (PsiElement)this.$element, this.$result.getPrefixMatcher().getPrefix(), null, (Continuation)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1> $completion) {
/*    */       return (Continuation<Unit>)new LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(this.$element, this.$result, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor$llmCompletionProvider$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */