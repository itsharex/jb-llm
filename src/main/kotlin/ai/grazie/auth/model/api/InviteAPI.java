/*   */ package ai.grazie.auth.model.api;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\b\032\0020\004R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/api/InviteAPI;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "absolute", "code", "auth-model"})
/*   */ public final class InviteAPI implements API {
/*   */   @NotNull
/* 6 */   public static final InviteAPI INSTANCE = new InviteAPI(); @NotNull private static final String path = "/invite/{code}"; @NotNull public String getPath() { return path; } @NotNull
/*   */   public final String absolute(@NotNull String code) {
/* 8 */     Intrinsics.checkNotNullParameter(code, "code"); return "/invite/" + code;
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/api/InviteAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */