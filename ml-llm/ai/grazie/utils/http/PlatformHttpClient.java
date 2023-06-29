/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClient;
/*    */ import io.ktor.client.HttpClientKt;
/*    */ import io.ktor.client.engine.HttpClientEngineFactory;
/*    */ import io.ktor.client.engine.cio.CIO;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/utils/http/PlatformHttpClient;", "", "()V", "client", "Lio/ktor/client/HttpClient;", "utils-ktor"})
/*    */ public final class PlatformHttpClient
/*    */ {
/*    */   @NotNull
/*    */   public final HttpClient client() {
/* 16 */     return HttpClientKt.HttpClient$default((HttpClientEngineFactory)CIO.INSTANCE, null, 2, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final PlatformHttpClient INSTANCE = new PlatformHttpClient();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/PlatformHttpClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */