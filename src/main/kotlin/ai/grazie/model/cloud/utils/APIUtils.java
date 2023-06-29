/*   */ package ai.grazie.model.cloud.utils;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/model/cloud/utils/APIUtils;", "", "()V", "absolute", "Lai/grazie/model/cloud/API;", "path", "", "model-cloud"})
/*   */ public final class APIUtils {
/*   */   @NotNull
/* 6 */   public final API absolute(@NotNull String path) { Intrinsics.checkNotNullParameter(path, "path"); return new APIUtils$absolute$1(path); } @NotNull public static final APIUtils INSTANCE = new APIUtils(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"ai/grazie/model/cloud/utils/APIUtils$absolute$1", "Lai/grazie/model/cloud/API;", "path", "", "getPath", "()Ljava/lang/String;", "model-cloud"}) public static final class APIUtils$absolute$1 implements API { @NotNull
/* 7 */     private final String path; APIUtils$absolute$1(String $path) { this.path = $path; } @NotNull public String getPath() { return this.path; }
/*   */      }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/utils/APIUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */