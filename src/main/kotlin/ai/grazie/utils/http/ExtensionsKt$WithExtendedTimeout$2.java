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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"})
/*    */ final class ExtensionsKt$WithExtendedTimeout$2
/*    */   extends Lambda
/*    */   implements Function0<JsonKtorHTTPClient>
/*    */ {
/*    */   public static final ExtensionsKt$WithExtendedTimeout$2 INSTANCE = new ExtensionsKt$WithExtendedTimeout$2();
/*    */   
/*    */   @NotNull
/*    */   public final JsonKtorHTTPClient invoke() {
/* 35 */     return JsonKtorHTTPClient.Companion.withExtendedTimeout(ExtensionsKt.server(PlatformHttpClient.INSTANCE));
/*    */   }
/*    */   
/*    */   ExtensionsKt$WithExtendedTimeout$2() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/ExtensionsKt$WithExtendedTimeout$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */