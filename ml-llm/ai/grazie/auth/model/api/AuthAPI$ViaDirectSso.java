/*    */ package ai.grazie.auth.model.api;
/*    */ 
/*    */ import ai.grazie.auth.model.SSO;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\bÆ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$ViaDirectSso;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "Request", "auth-model"})
/*    */ public final class ViaDirectSso
/*    */   implements API
/*    */ {
/*    */   @NotNull
/* 34 */   public static final ViaDirectSso INSTANCE = new ViaDirectSso(); @NotNull private static final String path = "/auth/via-direct-sso"; @NotNull public String getPath() { return path; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\005HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$ViaDirectSso$Request;", "", "sso", "Lai/grazie/auth/model/SSO;", "path", "", "(Lai/grazie/auth/model/SSO;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getSso", "()Lai/grazie/auth/model/SSO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "auth-model"})
/*    */   public static final class Request { @NotNull
/* 36 */     private final SSO sso; public Request(@NotNull SSO sso, @NotNull String path) { this.sso = sso; this.path = path; } @NotNull private final String path; @NotNull public final SSO getSso() { return this.sso; } @NotNull public final String getPath() { return this.path; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final SSO component1() {
/*    */       return this.sso;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.path;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull SSO sso, @NotNull String path) {
/*    */       Intrinsics.checkNotNullParameter(sso, "sso");
/*    */       Intrinsics.checkNotNullParameter(path, "path");
/*    */       return new Request(sso, path);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(sso=" + this.sso + ", path=" + this.path + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.sso.hashCode();
/*    */       return result * 31 + this.path.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return (this.sso != request.sso) ? false : (!!Intrinsics.areEqual(this.path, request.path));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/api/AuthAPI$ViaDirectSso.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */