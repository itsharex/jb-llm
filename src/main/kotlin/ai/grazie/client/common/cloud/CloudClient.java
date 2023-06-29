/*    */ package ai.grazie.client.common.cloud;
/*    */ 
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.model.cloud.AuthVersion;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\007\n\002\030\002\n\000\b'\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\016\020\b\032\n\022\006\b\001\022\0020\0070\t¢\006\002\020\nJ\016\020\017\032\0020\0032\006\020\020\032\0020\021R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\fR\016\020\006\032\0020\007X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\022"}, d2 = {"Lai/grazie/client/common/cloud/CloudClient;", "", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "supportedAuthVersions", "", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;[Lai/grazie/model/cloud/AuthVersion;)V", "getAuthType", "()Lai/grazie/model/cloud/AuthType;", "getServerUrl", "()Ljava/lang/String;", "url", "api", "Lai/grazie/model/cloud/API;", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nCloudClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudClient.kt\nai/grazie/client/common/cloud/CloudClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/*    */ public abstract class CloudClient {
/*    */   @NotNull
/*    */   private final String serverUrl;
/*    */   
/* 20 */   public CloudClient(@NotNull String serverUrl, @Nullable AuthType authType, @NotNull AuthVersion authVersion, @NotNull AuthVersion[] supportedAuthVersions) { this.serverUrl = serverUrl;
/* 21 */     this.authType = authType;
/* 22 */     this.authVersion = authVersion;
/*    */ 
/*    */ 
/*    */     
/* 26 */     if (!((StringsKt.startsWith$default(this.serverUrl, "https://", false, 2, null) || StringsKt.startsWith$default(this.serverUrl, "http://localhost", false, 2, null)) ? 1 : 0)) { int $i$a$-require-CloudClient$1 = 0; String str = 
/*    */         
/* 28 */         "http:// protocol can be used only for usage with local server";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 31 */     if (!((((supportedAuthVersions.length == 0)) || ArraysKt.contains((Object[])supportedAuthVersions, this.authVersion)) ? 1 : 0)) { int $i$a$-require-CloudClient$2 = 0; String str = "Unsupported auth version, current version supported: " + 
/* 32 */         ArraysKt.joinToString$default((Object[])supportedAuthVersions, ", ", null, null, 0, null, null, 62, null);
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */      } @Nullable private final AuthType authType; @NotNull
/*    */   private final AuthVersion authVersion; @NotNull
/* 36 */   public final String url(@NotNull API api) { Intrinsics.checkNotNullParameter(api, "api"); AuthVersion authVersion1 = this.authVersion, authVersion2 = authVersion1;
/*    */ 
/*    */     
/* 39 */     AuthType authType = getAuthType(); String str = this.serverUrl; API aPI = api; int $i$a$-takeIf-CloudClient$url$1 = 0;
/*    */     boolean bool = (getAuthType() != null) ? true : false;
/*    */     if ((bool ? (AuthType)authVersion1 : null) == null)
/*    */       bool ? (AuthType)authVersion1 : null; 
/*    */     return str.url((String)authType, bool ? (AuthType)authVersion1 : null, AuthVersion.None); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getServerUrl() {
/*    */     return this.serverUrl;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public AuthType getAuthType() {
/*    */     return this.authType;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/cloud/CloudClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */