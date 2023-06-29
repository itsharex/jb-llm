/*    */ package com.intellij.ml.llm.core.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthService;
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
/*    */ @DebugMetadata(f = "LLMConfigurable.kt", l = {69}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.settings.LLMConfigurable$createPanel$2$1$3$1$1")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class LLMConfigurable$createPanel$2$1$3$1$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   LLMConfigurable$createPanel$2$1$3$1$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     GrazieAuthService grazieAuthService1;
/*    */     LLMConfigurable lLMConfigurable;
/*    */     GrazieAuthService $this$invokeSuspend_u24lambda_u240;
/*    */     int $i$a$-apply-LLMConfigurable$createPanel$2$1$3$1$1$1;
/* 66 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 67 */         grazieAuthService1 = GrazieAuthService.Companion.getInstance(); lLMConfigurable = LLMConfigurable.this; $this$invokeSuspend_u24lambda_u240 = grazieAuthService1; $i$a$-apply-LLMConfigurable$createPanel$2$1$3$1$1$1 = 0;
/* 68 */         $this$invokeSuspend_u24lambda_u240.logout();
/* 69 */         this.L$0 = grazieAuthService1; this.label = 1; if ($this$invokeSuspend_u24lambda_u240.authenticate(LLMConfigurable.access$getProject$p(lLMConfigurable), (Continuation)this) == object) return object;  $this$invokeSuspend_u24lambda_u240.authenticate(LLMConfigurable.access$getProject$p(lLMConfigurable), (Continuation)this);
/*    */         
/* 71 */         return Unit.INSTANCE;case 1: $i$a$-apply-LLMConfigurable$createPanel$2$1$3$1$1$1 = 0; grazieAuthService1 = (GrazieAuthService)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LLMConfigurable$createPanel$2$1$3$1$1> $completion) {
/*    */     return (Continuation<Unit>)new LLMConfigurable$createPanel$2$1$3$1$1($completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((LLMConfigurable$createPanel$2$1$3$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMConfigurable$createPanel$2$1$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */