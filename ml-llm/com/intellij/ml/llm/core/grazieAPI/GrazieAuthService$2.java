/*    */ package com.intellij.ml.llm.core.grazieAPI;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.openai.CredentialsHolder;
/*    */ import com.intellij.util.ApplicationKt;
/*    */ import java.util.Locale;
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
/*    */ @DebugMetadata(f = "GrazieAuthService.kt", l = {91}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService$2")
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     String authToken, str1;
/* 74 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 75 */         if (ApplicationKt.getApplication().isHeadlessEnvironment()) {
/* 76 */           GrazieAuthService.access$getMutableAuthState$p(GrazieAuthService.this).setValue(GrazieAuthState.NoAuth);
/* 77 */           return Unit.INSTANCE;
/*    */         } 
/*    */         try {
/* 80 */           str1 = CredentialsHolder.Companion.getInstance().getProxyServerToken();
/*    */         }
/* 82 */         catch (Throwable t) {
/* 83 */           GrazieAuthServiceKt.access$getLogger$p().warn(t);
/* 84 */           str1 = null;
/*    */         } 
/*    */         authToken = str1;
/* 87 */         Intrinsics.checkNotNullExpressionValue(authToken.toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); GrazieAuthService.access$getMutableAuthState$p(GrazieAuthService.this).setValue((authToken != null && Intrinsics.areEqual(authToken.toLowerCase(Locale.ROOT), "wait_list")) ? GrazieAuthState.WaitList : (
/* 88 */             (authToken != null) ? GrazieAuthState.Authed : 
/* 89 */             GrazieAuthState.NoAuth));
/*    */         
/* 91 */         this.label = 1; if (GrazieAuthService.access$refreshToken(GrazieAuthService.this, (Continuation)this) == object) return object;  GrazieAuthService.access$refreshToken(GrazieAuthService.this, (Continuation)this);
/* 92 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(GrazieAuthService.this, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */