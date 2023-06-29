/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/utils/http/JsonKtorHTTPClient$Client;", "", "()V", "Default", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "getDefault", "()Lai/grazie/utils/http/JsonKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "utils-ktor"})
/*    */ public final class Client
/*    */ {
/*    */   @NotNull
/* 29 */   public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(JsonKtorHTTPClient$Client$Default$2.INSTANCE); @NotNull public final JsonKtorHTTPClient getDefault() { Lazy lazy = Default$delegate; return (JsonKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"}) static final class JsonKtorHTTPClient$Client$Default$2 extends Lambda implements Function0<JsonKtorHTTPClient> { public static final JsonKtorHTTPClient$Client$Default$2 INSTANCE = new JsonKtorHTTPClient$Client$Default$2(); @NotNull public final JsonKtorHTTPClient invoke() { return JsonKtorHTTPClient.Companion.default(PlatformHttpClient.INSTANCE.client()); } JsonKtorHTTPClient$Client$Default$2() { super(0); } }
/*    */    @NotNull
/* 31 */   private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(JsonKtorHTTPClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final JsonKtorHTTPClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (JsonKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/http/JsonKtorHTTPClient;", "invoke"}) static final class JsonKtorHTTPClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<JsonKtorHTTPClient> { public static final JsonKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new JsonKtorHTTPClient$Client$WithExtendedTimeout$2(); JsonKtorHTTPClient$Client$WithExtendedTimeout$2() { super(0); } @NotNull public final JsonKtorHTTPClient invoke() { return JsonKtorHTTPClient.Companion.withExtendedTimeout(PlatformHttpClient.INSTANCE.client()); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$Client.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */