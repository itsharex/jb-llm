/*    */ package ai.grazie.client.ktor;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\n\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R!\020\003\032\0020\0048FX\002¢\006\022\n\004\b\b\020\t\022\004\b\005\020\002\032\004\b\006\020\007R!\020\n\032\0020\0048FX\002¢\006\022\n\004\b\r\020\t\022\004\b\013\020\002\032\004\b\f\020\007¨\006\016"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Companion;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "getDefault$annotations", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout$annotations", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "client-ktor"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final GrazieKtorHTTPClient getDefault() {
/* 48 */     Lazy lazy = GrazieKtorHTTPClient.access$getDefault$delegate$cp(); return (GrazieKtorHTTPClient)lazy.getValue();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final GrazieKtorHTTPClient getWithExtendedTimeout() {
/* 54 */     Lazy lazy = GrazieKtorHTTPClient.access$getWithExtendedTimeout$delegate$cp(); return (GrazieKtorHTTPClient)lazy.getValue();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */