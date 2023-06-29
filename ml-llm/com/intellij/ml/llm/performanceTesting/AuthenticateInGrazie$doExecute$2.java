/*    */ package com.intellij.ml.llm.performanceTesting;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "AuthenticateInGrazie.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.performanceTesting.AuthenticateInGrazie$doExecute$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AuthenticateInGrazie$doExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     String token;
/* 17 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 18 */         token = AuthenticateInGrazie.this.extractCommandArgument("%authenticateInGrazie");
/* 19 */         CredentialsHolder.Companion.getInstance().setProxyServerToken(token);
/* 20 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   AuthenticateInGrazie$doExecute$2(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AuthenticateInGrazie$doExecute$2> $completion) {
/*    */     return (Continuation<Unit>)new AuthenticateInGrazie$doExecute$2($completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((AuthenticateInGrazie$doExecute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/performanceTesting/AuthenticateInGrazie$doExecute$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */