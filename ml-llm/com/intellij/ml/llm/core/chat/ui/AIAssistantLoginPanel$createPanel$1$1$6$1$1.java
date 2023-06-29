/*     */ package com.intellij.ml.llm.core.chat.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @DebugMetadata(f = "AIAssistantLoginPanel.kt", l = {105}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.chat.ui.AIAssistantLoginPanel$createPanel$1$1$6$1$1")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class AIAssistantLoginPanel$createPanel$1$1$6$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   AIAssistantLoginPanel$createPanel$1$1$6$1$1(Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     GrazieAuthService grazieAuthService1;
/*     */     Project project;
/*     */     GrazieAuthService $this$invokeSuspend_u24lambda_u240;
/*     */     int $i$a$-apply-AIAssistantLoginPanel$createPanel$1$1$6$1$1$1;
/* 102 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 103 */         grazieAuthService1 = GrazieAuthService.Companion.getInstance(); project = this.$project; $this$invokeSuspend_u24lambda_u240 = grazieAuthService1; $i$a$-apply-AIAssistantLoginPanel$createPanel$1$1$6$1$1$1 = 0;
/* 104 */         $this$invokeSuspend_u24lambda_u240.logout();
/* 105 */         this.L$0 = grazieAuthService1; this.label = 1; if ($this$invokeSuspend_u24lambda_u240.authenticate(project, (Continuation)this) == object) return object;  $this$invokeSuspend_u24lambda_u240.authenticate(project, (Continuation)this);
/*     */         
/* 107 */         return Unit.INSTANCE;case 1: $i$a$-apply-AIAssistantLoginPanel$createPanel$1$1$6$1$1$1 = 0; grazieAuthService1 = (GrazieAuthService)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AIAssistantLoginPanel$createPanel$1$1$6$1$1> $completion) {
/*     */     return (Continuation<Unit>)new AIAssistantLoginPanel$createPanel$1$1$6$1$1(this.$project, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((AIAssistantLoginPanel$createPanel$1$1$6$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantLoginPanel$createPanel$1$1$6$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */