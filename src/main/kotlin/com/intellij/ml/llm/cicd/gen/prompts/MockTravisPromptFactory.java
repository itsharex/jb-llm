/*    */ package com.intellij.ml.llm.cicd.gen.prompts;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\004\030\000 \n2\0020\001:\001\nB\005¢\006\002\020\002J\026\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\026J\016\020\b\032\b\022\004\022\0020\0050\004H\026J\020\020\t\032\0020\0052\006\020\006\032\0020\007H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/MockTravisPromptFactory;", "Lcom/intellij/ml/llm/cicd/gen/prompts/CiPromptFactory;", "()V", "getBuildSystemPromptPaths", "", "", "buildSystemType", "Lcom/intellij/ml/llm/cicd/gen/models/BuildSystemType;", "getCommonPromptPaths", "getDescriptionPrefix", "Companion", "intellij.ml.llm"})
/*    */ public final class MockTravisPromptFactory extends CiPromptFactory { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  6 */   public MockTravisPromptFactory() { super("prompts/cicd/travis"); } @NotNull
/*    */   private static final String PROMPT_BASE_DIRECTORY_PATH = "prompts/cicd/travis"; @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/MockTravisPromptFactory$Companion;", "", "()V", "PROMPT_BASE_DIRECTORY_PATH", "", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/*    */   public List<String> getCommonPromptPaths() {
/* 11 */     return CollectionsKt.emptyList(); } @NotNull
/*    */   public List<String> getBuildSystemPromptPaths(@NotNull BuildSystemType buildSystemType) {
/* 13 */     Intrinsics.checkNotNullParameter(buildSystemType, "buildSystemType"); return CollectionsKt.emptyList();
/*    */   }
/*    */   @NotNull
/*    */   public String getDescriptionPrefix(@NotNull BuildSystemType buildSystemType) {
/* 17 */     Intrinsics.checkNotNullParameter(buildSystemType, "buildSystemType"); Intrinsics.checkNotNullExpressionValue(buildSystemType.name().toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return "Create .travis.yml file for Travis CI. Project build system is " + buildSystemType.name().toLowerCase(Locale.ROOT) + ". ";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/MockTravisPromptFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */