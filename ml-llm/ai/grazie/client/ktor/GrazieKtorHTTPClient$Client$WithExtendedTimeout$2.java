/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import ai.grazie.utils.http.JsonKtorHTTPClient;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"})
/*    */ final class GrazieKtorHTTPClient$Client$WithExtendedTimeout$2
/*    */   extends Lambda
/*    */   implements Function0<GrazieKtorHTTPClient>
/*    */ {
/*    */   public static final GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithExtendedTimeout$2();
/*    */   
/*    */   GrazieKtorHTTPClient$Client$WithExtendedTimeout$2() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieKtorHTTPClient invoke() {
/* 33 */     return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getWithExtendedTimeout());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$Client$WithExtendedTimeout$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */