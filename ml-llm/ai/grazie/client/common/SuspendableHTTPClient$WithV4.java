/*    */ package ai.grazie.client.common;
/*    */ 
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithV4;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "token", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "getToken", "()Ljava/lang/String;", "client-common"})
/*    */ public final class WithV4
/*    */   extends SuspendableHTTPClient.WithHeaders
/*    */ {
/*    */   @NotNull
/*    */   private final String token;
/*    */   @NotNull
/*    */   private final AuthVersion authVersion;
/*    */   
/*    */   public WithV4(@NotNull SuspendableHTTPClient client, @NotNull String token) {
/* 65 */     super(client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Authenticate-JWT", CollectionsKt.listOf(token))))); this.token = token;
/* 66 */     this.authVersion = AuthVersion.V4; } @NotNull public AuthVersion getAuthVersion() { return this.authVersion; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getToken() {
/*    */     return this.token;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/SuspendableHTTPClient$WithV4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */