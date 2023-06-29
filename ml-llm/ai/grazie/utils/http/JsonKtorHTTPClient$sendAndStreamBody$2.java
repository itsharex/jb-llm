/*     */ package ai.grazie.utils.http;
/*     */ 
/*     */ import io.ktor.client.HttpClient;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.client.statement.HttpStatement;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {204}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.JsonKtorHTTPClient$sendAndStreamBody$2")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "T", "it", "Lio/ktor/client/request/HttpRequestBuilder;"})
/*     */ @SourceDebugExtension({"SMAP\nJsonKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndStreamBody$2\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,217:1\n29#2:218\n*S KotlinDebug\n*F\n+ 1 JsonKtorHTTPClient.kt\nai/grazie/utils/http/JsonKtorHTTPClient$sendAndStreamBody$2\n*L\n204#1:218\n*E\n"})
/*     */ final class JsonKtorHTTPClient$sendAndStreamBody$2
/*     */   extends SuspendLambda
/*     */   implements Function2<HttpRequestBuilder, Continuation<? super T>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   JsonKtorHTTPClient$sendAndStreamBody$2(Function2<HttpResponse, Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     HttpRequestBuilder it;
/*     */     HttpClient $this$prepareRequest$iv;
/*     */     int $i$f$prepareRequest;
/* 204 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (HttpRequestBuilder)this.L$0; $this$prepareRequest$iv = JsonKtorHTTPClient.access$getClient$p(JsonKtorHTTPClient.this); $i$f$prepareRequest = 0; this.label = 1; return ((
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
/* 218 */           new HttpStatement(it, $this$prepareRequest$iv)).execute(this.$body, (Continuation)this) == object) ? object : (new HttpStatement(it, $this$prepareRequest$iv)).execute(this.$body, (Continuation)this);
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super JsonKtorHTTPClient$sendAndStreamBody$2> $completion) {
/*     */     JsonKtorHTTPClient$sendAndStreamBody$2 jsonKtorHTTPClient$sendAndStreamBody$2 = new JsonKtorHTTPClient$sendAndStreamBody$2(this.$body, $completion);
/*     */     jsonKtorHTTPClient$sendAndStreamBody$2.L$0 = value;
/*     */     return (Continuation<Unit>)jsonKtorHTTPClient$sendAndStreamBody$2;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull HttpRequestBuilder p1, @Nullable Continuation<?> p2) {
/*     */     return ((JsonKtorHTTPClient$sendAndStreamBody$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$sendAndStreamBody$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */