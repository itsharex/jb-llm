/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"})
/*    */ final class JsonKtorHTTPClient$Client$WithExtendedTimeout$2
/*    */   extends Lambda
/*    */   implements Function0<JsonKtorHTTPClient>
/*    */ {
/*    */   public static final JsonKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new JsonKtorHTTPClient$Client$WithExtendedTimeout$2();
/*    */   
/*    */   JsonKtorHTTPClient$Client$WithExtendedTimeout$2() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JsonKtorHTTPClient invoke() {
/* 31 */     return JsonKtorHTTPClient.Companion.withExtendedTimeout(PlatformHttpClient.INSTANCE.client());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$Client$WithExtendedTimeout$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */