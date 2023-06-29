/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.SenderKt;
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMBaseResponse;
/*    */ import com.intellij.openapi.progress.CoroutinesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ 
/*    */ @DebugMetadata(f = "RefactorThisIntention.kt", l = {90}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.intentions.internal.editor.RefactorThisIntention$generateExplanation$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H@"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class RefactorThisIntention$generateExplanation$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super LLMBaseResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   RefactorThisIntention$generateExplanation$2(Project $project, String $selectedText, String $result, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 89 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 90 */         this.label = 1; if (CoroutinesKt.blockingContext(new Function0<LLMBaseResponse>(this.$project, this.$selectedText, this.$result) { @Nullable
/* 91 */               public final LLMBaseResponse invoke() { return SenderKt.sendCompletionChatRequest$default(
/* 92 */                     this.$project, "// Snippet 1:\n" + 
/* 93 */                     this.$selectedText + "\n//Snippet 2:\n" + this.$result + " \n// There are some differences between code in Snippet 1 and code in Snippet 2", 
/* 94 */                     "", 
/* 95 */                     Integer.valueOf(300), 
/* 96 */                     Double.valueOf(0.5D), null, null, null, null, 
/* 97 */                     5, null, null, null, 7648, null); } }(Continuation)this) == object) return object;  return CoroutinesKt.blockingContext(new Function0<LLMBaseResponse>(this.$project, this.$selectedText, this.$result) { @Nullable public final LLMBaseResponse invoke() { return SenderKt.sendCompletionChatRequest$default(this.$project, "// Snippet 1:\n" + this.$selectedText + "\n//Snippet 2:\n" + this.$result + " \n// There are some differences between code in Snippet 1 and code in Snippet 2", "", Integer.valueOf(300), Double.valueOf(0.5D), null, null, null, null, 5, null, null, null, 7648, null); }
/*    */                }
/*    */             (Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RefactorThisIntention$generateExplanation$2> $completion) {
/*    */     return (Continuation<Unit>)new RefactorThisIntention$generateExplanation$2(this.$project, this.$selectedText, this.$result, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((RefactorThisIntention$generateExplanation$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/RefactorThisIntention$generateExplanation$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */