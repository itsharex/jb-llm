/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import io.ktor.client.request.HttpRequestKt;
/*    */ import io.ktor.http.HeadersBuilder;
/*    */ import io.ktor.http.HttpMessageBuilder;
/*    */ import io.ktor.http.HttpMethod;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/request/HttpRequestBuilder;", "invoke"})
/*    */ final class KtorWebSocketClient$connect$2
/*    */   extends Lambda
/*    */   implements Function1<HttpRequestBuilder, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull HttpRequestBuilder $this$webSocket) {
/* 35 */     Intrinsics.checkNotNullParameter($this$webSocket, "$this$webSocket"); HttpRequestKt.url($this$webSocket, this.$url);
/* 36 */     HttpRequestKt.headers((HttpMessageBuilder)$this$webSocket, new Function1<HeadersBuilder, Unit>(this.$headers) {
/* 37 */           public final void invoke(@NotNull HeadersBuilder $this$headers) { Intrinsics.checkNotNullParameter($this$headers, "$this$headers"); for (Map.Entry<String, String> entry : this.$headers.entrySet()) { String key = (String)entry.getKey(), value = (String)entry.getValue();
/* 38 */               $this$headers.append(key, value); }
/*    */              }
/*    */         });
/* 41 */     $this$webSocket.setMethod(HttpMethod.Companion.getGet());
/*    */   }
/*    */   
/*    */   KtorWebSocketClient$connect$2(String $url, Map<String, String> $headers) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/KtorWebSocketClient$connect$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */