/*    */ package ai.grazie.model.auth.v5;
/*    */ 
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\000 \0332\0020\001:\001\033B1\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\013\020\020\032\004\030\0010\003HÆ\003J\013\020\021\032\004\030\0010\003HÆ\003J\013\020\022\032\004\030\0010\007HÆ\003J7\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\003HÖ\001R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\t\020\nR\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\013\020\fR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\f¨\006\034"}, d2 = {"Lai/grazie/model/auth/v5/AuthData;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "token", "", "originalUserToken", "originalServiceToken", "grazieAgent", "Lai/grazie/model/auth/GrazieAgent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/auth/GrazieAgent;)V", "getGrazieAgent", "()Lai/grazie/model/auth/GrazieAgent;", "getOriginalServiceToken", "()Ljava/lang/String;", "getOriginalUserToken", "getToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "model-auth"})
/*    */ public final class AuthData extends AbstractCoroutineContextElement {
/*    */   @NotNull
/*    */   public static final Key Key = new Key(null);
/*    */   @NotNull
/*    */   private final String token;
/*    */   
/*    */   @NotNull
/* 15 */   public final String getToken() { return this.token; } @Nullable private final String originalUserToken; @Nullable private final String originalServiceToken; @Nullable private final GrazieAgent grazieAgent; @Nullable
/* 16 */   public final String getOriginalUserToken() { return this.originalUserToken; } @Nullable
/* 17 */   public final String getOriginalServiceToken() { return this.originalServiceToken; } @Nullable
/* 18 */   public final GrazieAgent getGrazieAgent() { return this.grazieAgent; } public AuthData(@NotNull String token, @Nullable String originalUserToken, @Nullable String originalServiceToken, @Nullable GrazieAgent grazieAgent) {
/* 19 */     super(Key);
/*    */     this.token = token;
/*    */     this.originalUserToken = originalUserToken;
/*    */     this.originalServiceToken = originalServiceToken;
/*    */     this.grazieAgent = grazieAgent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.token;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.originalUserToken;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.originalServiceToken;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final GrazieAgent component4() {
/*    */     return this.grazieAgent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AuthData copy(@NotNull String token, @Nullable String originalUserToken, @Nullable String originalServiceToken, @Nullable GrazieAgent grazieAgent) {
/*    */     Intrinsics.checkNotNullParameter(token, "token");
/*    */     return new AuthData(token, originalUserToken, originalServiceToken, grazieAgent);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AuthData(token=" + this.token + ", originalUserToken=" + this.originalUserToken + ", originalServiceToken=" + this.originalServiceToken + ", grazieAgent=" + this.grazieAgent + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.token.hashCode();
/*    */     result = result * 31 + ((this.originalUserToken == null) ? 0 : this.originalUserToken.hashCode());
/*    */     result = result * 31 + ((this.originalServiceToken == null) ? 0 : this.originalServiceToken.hashCode());
/*    */     return result * 31 + ((this.grazieAgent == null) ? 0 : this.grazieAgent.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AuthData))
/*    */       return false; 
/*    */     AuthData authData = (AuthData)other;
/*    */     return !Intrinsics.areEqual(this.token, authData.token) ? false : (!Intrinsics.areEqual(this.originalUserToken, authData.originalUserToken) ? false : (!Intrinsics.areEqual(this.originalServiceToken, authData.originalServiceToken) ? false : (!!Intrinsics.areEqual(this.grazieAgent, authData.grazieAgent))));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/auth/v5/AuthData$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lai/grazie/model/auth/v5/AuthData;", "()V", "model-auth"})
/*    */   public static final class Key implements CoroutineContext.Key<AuthData> {
/*    */     private Key() {}
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/auth/v5/AuthData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */