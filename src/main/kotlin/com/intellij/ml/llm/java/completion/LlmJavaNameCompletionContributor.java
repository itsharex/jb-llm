/*    */ package com.intellij.ml.llm.java.completion;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.patterns.ElementPattern;
/*    */ import com.intellij.patterns.PsiJavaElementPattern;
/*    */ import com.intellij.patterns.PsiJavaPatterns;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNamedElement;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000)\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\b\003*\001\f\b\000\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\r\020\013\032\0020\fH\002¢\006\002\020\rR!\020\004\032\025\022\f\022\n \007*\004\030\0010\0060\0060\005¢\006\002\b\bX\004¢\006\002\n\000R!\020\t\032\025\022\f\022\n \007*\004\030\0010\0060\0060\005¢\006\002\b\bX\004¢\006\002\n\000R!\020\n\032\025\022\f\022\n \007*\004\030\0010\0060\0060\005¢\006\002\b\bX\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor;", "Lcom/intellij/codeInsight/completion/CompletionContributor;", "Lcom/intellij/openapi/project/DumbAware;", "()V", "classPattern", "Lcom/intellij/patterns/PsiJavaElementPattern$Capture;", "Lcom/intellij/psi/PsiElement;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "fieldDeclarationPattern", "variableDeclarationPattern", "llmCompletionProvider", "com/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor$llmCompletionProvider$1", "()Lcom/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor$llmCompletionProvider$1;", "intellij.ml.llm.java"})
/*    */ public final class LlmJavaNameCompletionContributor extends CompletionContributor implements DumbAware {
/*    */   @NotNull
/*    */   private final PsiJavaElementPattern.Capture<PsiElement> variableDeclarationPattern;
/*    */   
/* 18 */   public LlmJavaNameCompletionContributor() { Intrinsics.checkNotNullExpressionValue(((PsiJavaElementPattern.Capture)PsiJavaPatterns.psiElement().withParent((ElementPattern)PsiJavaPatterns.psiElement(PsiLocalVariable.class).withParent(PsiDeclarationStatement.class))).withLanguage((Language)JavaLanguage.INSTANCE), "psiElement()\n    .withPa…ge(JavaLanguage.INSTANCE)"); this.variableDeclarationPattern = (PsiJavaElementPattern.Capture<PsiElement>)((PsiJavaElementPattern.Capture)PsiJavaPatterns.psiElement().withParent((ElementPattern)PsiJavaPatterns.psiElement(PsiLocalVariable.class).withParent(PsiDeclarationStatement.class))).withLanguage((Language)JavaLanguage.INSTANCE);
/*    */     
/* 20 */     Intrinsics.checkNotNullExpressionValue(((PsiJavaElementPattern.Capture)PsiJavaPatterns.psiElement().withParent(PsiClass.class)).withLanguage((Language)JavaLanguage.INSTANCE), "psiElement().withParent(…ge(JavaLanguage.INSTANCE)"); this.classPattern = (PsiJavaElementPattern.Capture<PsiElement>)((PsiJavaElementPattern.Capture)PsiJavaPatterns.psiElement().withParent(PsiClass.class)).withLanguage((Language)JavaLanguage.INSTANCE);
/*    */ 
/*    */     
/* 23 */     Intrinsics.checkNotNullExpressionValue(((PsiJavaElementPattern.Capture)((PsiJavaElementPattern.Capture)PsiJavaPatterns.psiElement().withParent(PsiField.class)).beforeLeaf((ElementPattern)PsiJavaPatterns.psiElement(PsiJavaToken.class).withElementType(JavaTokenType.EQ))).withLanguage((Language)JavaLanguage.INSTANCE), "psiElement().withParent(…ge(JavaLanguage.INSTANCE)"); this.fieldDeclarationPattern = (PsiJavaElementPattern.Capture<PsiElement>)((PsiJavaElementPattern.Capture)((PsiJavaElementPattern.Capture)PsiJavaPatterns.psiElement().withParent(PsiField.class)).beforeLeaf((ElementPattern)PsiJavaPatterns.psiElement(PsiJavaToken.class).withElementType(JavaTokenType.EQ))).withLanguage((Language)JavaLanguage.INSTANCE);
/*    */ 
/*    */     
/* 26 */     extend(CompletionType.BASIC, (ElementPattern)this.variableDeclarationPattern, llmCompletionProvider());
/* 27 */     extend(CompletionType.BASIC, (ElementPattern)this.classPattern, llmCompletionProvider());
/* 28 */     extend(CompletionType.BASIC, (ElementPattern)this.fieldDeclarationPattern, llmCompletionProvider()); } @NotNull
/*    */   private final PsiJavaElementPattern.Capture<PsiElement> classPattern; @NotNull
/*    */   private final PsiJavaElementPattern.Capture<PsiElement> fieldDeclarationPattern; private final LlmJavaNameCompletionContributor$llmCompletionProvider$1 llmCompletionProvider() {
/* 31 */     return new LlmJavaNameCompletionContributor$llmCompletionProvider$1(); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J \020\003\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\0072\006\020\b\032\0020\tH\024¨\006\n"}, d2 = {"com/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor$llmCompletionProvider$1", "Lcom/intellij/codeInsight/completion/CompletionProvider;", "Lcom/intellij/codeInsight/completion/CompletionParameters;", "addCompletions", "", "parameters", "context", "Lcom/intellij/util/ProcessingContext;", "result", "Lcom/intellij/codeInsight/completion/CompletionResultSet;", "intellij.ml.llm.java"})
/*    */   public static final class LlmJavaNameCompletionContributor$llmCompletionProvider$1 extends CompletionProvider<CompletionParameters> { protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
/* 33 */       Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(result, "result"); if (Registry.is("llm.is.internal")) {
/* 34 */         PsiNamedElement element; if ((PsiNamedElement)PsiTreeUtil.getParentOfType(parameters.getOriginalPosition(), PsiNamedElement.class) == null) { (PsiNamedElement)PsiTreeUtil.getParentOfType(parameters.getOriginalPosition(), PsiNamedElement.class); return; }
/* 35 */          List suggestNames = (List)CoroutinesKt.runBlockingCancellable(new LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(element, result, null));
/* 36 */         for (String suggestName : suggestNames)
/* 37 */           result.addElement((LookupElement)LookupElementBuilder.create(suggestName)); 
/*    */       } 
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "LlmJavaNameCompletionContributor.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.java.completion.LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1")
/*    */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */     static final class LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
/*    */       int label;
/*    */       
/*    */       LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(PsiNamedElement $element, CompletionResultSet $result, Continuation $completion) {
/*    */         super(2, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invokeSuspend(@NotNull Object $result) {
/*    */         Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */         switch (this.label) {
/*    */           case 0:
/*    */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */             Intrinsics.checkNotNullExpressionValue(this.$element.getProject(), "element.project");
/*    */             this.label = 1;
/*    */             return (LlmNameProviderKt.suggestNames(this.$element.getProject(), (PsiElement)this.$element, this.$result.getPrefixMatcher().getPrefix(), null, (Continuation)this) == object) ? object : LlmNameProviderKt.suggestNames(this.$element.getProject(), (PsiElement)this.$element, this.$result.getPrefixMatcher().getPrefix(), null, (Continuation)this);
/*    */           case 1:
/*    */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */             return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */         } 
/*    */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1> $completion) {
/*    */         return (Continuation<Unit>)new LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1(this.$element, this.$result, $completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */         return ((LlmJavaNameCompletionContributor$llmCompletionProvider$1$addCompletions$suggestNames$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/completion/LlmJavaNameCompletionContributor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */