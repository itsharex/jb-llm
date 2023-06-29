/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.serialization.DeserializationStrategy;
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
/*    */ @DebugMetadata(f = "AsyncDispatchableSubscriptionClient.kt", l = {41}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\004\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\002\"\004\b\003\020\0032\006\020\004\032\002H\0022\006\020\005\032\0020\006H@"}, d2 = {"<anonymous>", "", "Id", "E", "myId", "entity", ""})
/*    */ final class AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4
/*    */   extends SuspendLambda
/*    */   implements Function3<Id, String, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4(AsyncDispatchableSubscriptionClient.WithSerializer<Id, E> $receiver, Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     Object myId;
/*    */     String entity;
/* 40 */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); myId = this.L$0; entity = (String)this.L$1;
/* 41 */         this.L$0 = null; this.label = 1; if (this.$body.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this) == object1) return object1;  this.$body.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this);
/* 42 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(Object p1, @NotNull String p2, @Nullable Continuation<? super AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4> p3) {
/*    */     AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4 asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4 = new AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4(AsyncDispatchableSubscriptionClient.WithSerializer.this, p3);
/*    */     asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.L$0 = p1;
/*    */     asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.L$1 = p2;
/*    */     return asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */