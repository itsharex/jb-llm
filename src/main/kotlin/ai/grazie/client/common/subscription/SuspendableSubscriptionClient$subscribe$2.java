/*    */ package ai.grazie.client.common.subscription;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$subscribe$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "E"})
/*    */ final class SuspendableSubscriptionClient$subscribe$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   SuspendableSubscriptionClient$subscribe$2(Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 24 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@NotNull Continuation<? super SuspendableSubscriptionClient$subscribe$2> $completion) {
/*    */     return (Continuation<Unit>)new SuspendableSubscriptionClient$subscribe$2($completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@Nullable Continuation<?> p1) {
/*    */     return ((SuspendableSubscriptionClient$subscribe$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/subscription/SuspendableSubscriptionClient$subscribe$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */