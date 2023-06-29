/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import ai.grazie.client.ktor.extensions.ExceptionExtensionsKt;
/*    */ import ai.grazie.model.cloud.exceptions.HTTPStatusException;
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import ai.grazie.utils.http.JsonKtorHTTPClient;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient$receiveContinuousSSE$3")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\020\003\020\000\032\0020\001*\b\022\004\022\0020\0030\0022\006\020\004\032\0020\005H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "it", ""})
/*    */ final class GrazieKtorHTTPClient$receiveContinuousSSE$3
/*    */   extends SuspendLambda
/*    */   implements Function3<FlowCollector<? super ServerSentEvent>, Throwable, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieKtorHTTPClient$receiveContinuousSSE$3(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invokeSuspend(@NotNull Object $result) {
/*    */     Throwable it;
/* 78 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Throwable)this.L$0; if (it instanceof JsonKtorHTTPClient.KtorHttpException) throw ExceptionExtensionsKt.of(HTTPStatusException.Companion, (JsonKtorHTTPClient.KtorHttpException)it);  throw it; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object invoke(@NotNull FlowCollector p1, @NotNull Throwable p2, @Nullable Continuation<? super GrazieKtorHTTPClient$receiveContinuousSSE$3> p3) {
/*    */     GrazieKtorHTTPClient$receiveContinuousSSE$3 grazieKtorHTTPClient$receiveContinuousSSE$3 = new GrazieKtorHTTPClient$receiveContinuousSSE$3(p3);
/*    */     grazieKtorHTTPClient$receiveContinuousSSE$3.L$0 = p2;
/*    */     return grazieKtorHTTPClient$receiveContinuousSSE$3.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */