/*    */ package ai.grazie.client.common;
/*    */ 
/*    */ import ai.grazie.annotation.TestOnly;
/*    */ import ai.grazie.client.common.model.HeaderCollection;
/*    */ import ai.grazie.client.common.model.HeaderCollectionKt;
/*    */ import ai.grazie.model.cloud.AuthVersion;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
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
/*    */ @TestOnly
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithError;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "code", "", "(Lai/grazie/client/common/SuspendableHTTPClient;I)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "getCode", "()I", "client-common"})
/*    */ public final class WithError
/*    */   extends SuspendableHTTPClient.WithHeaders
/*    */ {
/*    */   private final int code;
/*    */   @NotNull
/*    */   private final AuthVersion authVersion;
/*    */   
/*    */   public WithError(@NotNull SuspendableHTTPClient client, int code) {
/* 44 */     super(
/* 45 */         client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Force-HTTP-Error", CollectionsKt.listOf(String.valueOf(code))))));
/*    */     this.code = code;
/* 47 */     this.authVersion = client.getAuthVersion(); } @NotNull public AuthVersion getAuthVersion() { return this.authVersion; }
/*    */ 
/*    */   
/*    */   public final int getCode() {
/*    */     return this.code;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/SuspendableHTTPClient$WithError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */