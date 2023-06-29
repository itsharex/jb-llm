/*    */ package ai.grazie.client.ktor;
/*    */ 
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
/*    */ @DebugMetadata(f = "GrazieKtorWebSocketClient.kt", l = {57}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorWebSocketClient$connect$2$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H@"}, d2 = {"<anonymous>", ""})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Function1<Continuation<? super Unit>, Object> $close, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/* 57 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$close.invoke(this) == object) return object;  this.$close.invoke(this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object(this.$close, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@Nullable Continuation<?> p1) {
/*    */     return ((null)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorWebSocketClient$connect$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */