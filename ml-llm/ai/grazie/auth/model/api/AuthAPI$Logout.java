/*    */ package ai.grazie.auth.model.api;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\bÆ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$Logout;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "Request", "auth-model"})
/*    */ public final class Logout
/*    */   implements API
/*    */ {
/*    */   @NotNull
/* 40 */   public static final Logout INSTANCE = new Logout(); @NotNull private static final String path = "/auth/logout"; @NotNull public String getPath() { return path; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$Logout$Request;", "", "redirectBackTo", "", "(Ljava/lang/String;)V", "getRedirectBackTo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "auth-model"})
/*    */   public static final class Request {
/* 42 */     public Request(@NotNull String redirectBackTo) { this.redirectBackTo = redirectBackTo; } @NotNull private final String redirectBackTo; @NotNull public final String getRedirectBackTo() { return this.redirectBackTo; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.redirectBackTo;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull String redirectBackTo) {
/*    */       Intrinsics.checkNotNullParameter(redirectBackTo, "redirectBackTo");
/*    */       return new Request(redirectBackTo);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(redirectBackTo=" + this.redirectBackTo + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.redirectBackTo.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !!Intrinsics.areEqual(this.redirectBackTo, request.redirectBackTo);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/api/AuthAPI$Logout.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */