/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.plugins.websocket.DefaultClientWebSocketSession;
/*    */ import io.ktor.websocket.CloseReason;
/*    */ import io.ktor.websocket.Frame;
/*    */ import io.ktor.websocket.WebSocketSession;
/*    */ import io.ktor.websocket.WebSocketSessionKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function5;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ReceiveChannel;
/*    */ import kotlinx.coroutines.channels.SendChannel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "KtorWebSocketClient.kt", l = {43}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.KtorWebSocketClient$connect$3")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;"})
/*    */ final class KtorWebSocketClient$connect$3
/*    */   extends SuspendLambda
/*    */   implements Function2<DefaultClientWebSocketSession, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   KtorWebSocketClient$connect$3(Function5<CoroutineScope, ReceiveChannel<? extends Frame>, SendChannel<? super Frame>, Function1<? super Continuation<? super Unit>, ? extends Object>, Continuation<? super Unit>, Object> $process, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     DefaultClientWebSocketSession $this$webSocket;
/* 42 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$webSocket = (DefaultClientWebSocketSession)this.L$0;
/* 43 */         this.label = 1; if (this.$process.invoke($this$webSocket, $this$webSocket.getIncoming(), $this$webSocket.getOutgoing(), new Function1<Continuation<? super Unit>, Object>($this$webSocket, null) { int label; @NotNull public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$$this$webSocket, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @Nullable public final Object invoke(@Nullable Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }this) == object) return object;  this.$process.invoke($this$webSocket, $this$webSocket.getIncoming(), $this$webSocket.getOutgoing(), new Function1<Continuation<? super Unit>, Object>($this$webSocket, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this) == object) return object;  WebSocketSessionKt.close((WebSocketSession)this.$$this$webSocket, new CloseReason(CloseReason.Codes.NORMAL, "Terminated"), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) { return (Continuation)new Function1<>(this.$$this$webSocket, $completion); } @Nullable public final Object invoke(@Nullable Continuation<?> p1) { return ((null)create(p1)).invokeSuspend(Unit.INSTANCE); } }this);
/* 44 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super KtorWebSocketClient$connect$3> $completion) {
/*    */     KtorWebSocketClient$connect$3 ktorWebSocketClient$connect$3 = new KtorWebSocketClient$connect$3(this.$process, $completion);
/*    */     ktorWebSocketClient$connect$3.L$0 = value;
/*    */     return (Continuation<Unit>)ktorWebSocketClient$connect$3;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull DefaultClientWebSocketSession p1, @Nullable Continuation<?> p2) {
/*    */     return ((KtorWebSocketClient$connect$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/KtorWebSocketClient$connect$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */