/*    */ package com.intellij.ml.llm.cicd.gen.models;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\n\002\020 \n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\013\032\0020\0042\006\020\f\032\0020\004R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\027\020\007\032\b\022\004\022\0020\0040\b8F¢\006\006\032\004\b\t\020\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/models/CiPlatform;", "", "()V", "GITHUB_ACTIONS", "", "SPACE_AUTOMATION", "TRAVIS_CI", "all", "", "getAll", "()Ljava/util/List;", "getFileExtension", "toolchain", "intellij.ml.llm"})
/*    */ public final class CiPlatform {
/*    */   @NotNull
/*    */   public static final CiPlatform INSTANCE = new CiPlatform();
/*    */   @NotNull
/*    */   public static final String GITHUB_ACTIONS = "GitHub Actions";
/*    */   
/*    */   @NotNull
/* 10 */   public final List<String> getAll() { String[] arrayOfString = new String[3]; arrayOfString[0] = "GitHub Actions"; arrayOfString[1] = "Travis CI"; arrayOfString[2] = "Space Automation"; return CollectionsKt.listOf((Object[])arrayOfString); } @NotNull
/*    */   public static final String TRAVIS_CI = "Travis CI"; @NotNull
/*    */   public static final String SPACE_AUTOMATION = "Space Automation"; @NotNull
/* 13 */   public final String getFileExtension(@NotNull String toolchain) { Intrinsics.checkNotNullParameter(toolchain, "toolchain"); String str = toolchain; switch (str.hashCode()) { case 1962990769: if (!str.equals("Space Automation")) break; case 1458796960: if (!str.equals("GitHub Actions")) break; case -1018224727: if (str.equals("Travis CI"));
/*    */         break; }
/*    */     
/* 16 */     throw new IllegalStateException(); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/models/CiPlatform.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */