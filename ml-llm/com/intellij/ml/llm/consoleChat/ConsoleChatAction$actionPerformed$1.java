/*    */ package com.intellij.ml.llm.consoleChat;
/*    */ 
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.project.Project;
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
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "ConsoleChatAction.kt", l = {34}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.consoleChat.ConsoleChatAction$actionPerformed$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class ConsoleChatAction$actionPerformed$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ConsoleChatAction$actionPerformed$1(Project $project, PsiFile $file, Document $document, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 33 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 34 */         this.label = 1; if (ConsoleChatAction.Companion.continueConversation(this.$project, this.$file, this.$document, (Continuation<? super String>)this) == object) return object;  ConsoleChatAction.Companion.continueConversation(this.$project, this.$file, this.$document, (Continuation<? super String>)this);
/* 35 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ConsoleChatAction$actionPerformed$1> $completion) {
/*    */     return (Continuation<Unit>)new ConsoleChatAction$actionPerformed$1(this.$project, this.$file, this.$document, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((ConsoleChatAction$actionPerformed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/consoleChat/ConsoleChatAction$actionPerformed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */