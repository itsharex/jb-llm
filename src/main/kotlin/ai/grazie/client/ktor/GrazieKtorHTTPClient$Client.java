/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import ai.grazie.utils.http.JsonKtorHTTPClient;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Client;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "client-ktor"})
/*    */ public final class Client
/*    */ {
/*    */   @NotNull
/* 32 */   public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$Default$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getDefault() { Lazy lazy = Default$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$Default$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$Default$2 INSTANCE = new GrazieKtorHTTPClient$Client$Default$2(); @NotNull public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getDefault()); } GrazieKtorHTTPClient$Client$Default$2() { super(0); } }
/* 33 */    @NotNull private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithExtendedTimeout$2(); GrazieKtorHTTPClient$Client$WithExtendedTimeout$2() { super(0); } @NotNull public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(JsonKtorHTTPClient.Client.INSTANCE.getWithExtendedTimeout()); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$Client.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */