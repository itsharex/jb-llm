/*    */ package com.intellij.ml.llm.cicd.gen.prompts;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\004\030\000 \n2\0020\001:\001\nB\005¢\006\002\020\002J\026\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\026J\016\020\b\032\b\022\004\022\0020\0050\004H\026J\020\020\t\032\0020\0052\006\020\006\032\0020\007H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/SpaceAutomationPromptFactory;", "Lcom/intellij/ml/llm/cicd/gen/prompts/CiPromptFactory;", "()V", "getBuildSystemPromptPaths", "", "", "buildSystemType", "Lcom/intellij/ml/llm/cicd/gen/models/BuildSystemType;", "getCommonPromptPaths", "getDescriptionPrefix", "Companion", "intellij.ml.llm"})
/*    */ public final class SpaceAutomationPromptFactory extends CiPromptFactory { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private static final String PROMPT_BASE_DIRECTORY_PATH = "prompts/cicd/space"; @NotNull
/*  5 */   private static final String PROMPT_COMMON_ARTIFACTS_PATH = "common/space_automation_artifacts.prompt"; public SpaceAutomationPromptFactory() { super("prompts/cicd/space"); }
/*    */   
/*    */   @NotNull
/*    */   private static final String PROMPT_COMMON_EVENTS_PATH = "common/space_automation_events.prompt"; @NotNull
/*    */   private static final String PROMPT_COMMON_PARALLEL_PATH = "common/space_automation_parallel.prompt"; @NotNull
/*    */   private static final String PROMPT_COMMON_PUBLISH_DOCKER_PATH = "common/space_automation_publish_docker.prompt"; @NotNull
/*    */   private static final String PROMPT_COMMON_REQUIREMENTS_PATH = "common/space_automation_requirements.prompt"; @NotNull
/*    */   private static final String PROMPT_COMMON_SCRIPTS_PATH = "common/space_automation_scripts.prompt"; @NotNull
/*    */   private static final String PROMPT_GRADLE_BUILD_PATH = "gradle/space_automation_build_gradle.prompt"; @NotNull
/*    */   private static final String PROMPT_GRADLE_PUBLISH_PATH = "gradle/space_automation_publish_gradle.prompt"; @NotNull
/*    */   private static final String PROMPT_MAVEN_BUILD_PATH = "maven/space_automation_build_maven.prompt";
/*    */   @NotNull
/*    */   private static final String PROMPT_MAVEN_PUBLISH_PATH = "maven/space_automation_publish_maven.prompt";
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000R\016\020\n\032\0020\004XT¢\006\002\n\000R\016\020\013\032\0020\004XT¢\006\002\n\000R\016\020\f\032\0020\004XT¢\006\002\n\000R\016\020\r\032\0020\004XT¢\006\002\n\000R\016\020\016\032\0020\004XT¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/SpaceAutomationPromptFactory$Companion;", "", "()V", "PROMPT_BASE_DIRECTORY_PATH", "", "PROMPT_COMMON_ARTIFACTS_PATH", "PROMPT_COMMON_EVENTS_PATH", "PROMPT_COMMON_PARALLEL_PATH", "PROMPT_COMMON_PUBLISH_DOCKER_PATH", "PROMPT_COMMON_REQUIREMENTS_PATH", "PROMPT_COMMON_SCRIPTS_PATH", "PROMPT_GRADLE_BUILD_PATH", "PROMPT_GRADLE_PUBLISH_PATH", "PROMPT_MAVEN_BUILD_PATH", "PROMPT_MAVEN_PUBLISH_PATH", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   
/*    */   @NotNull
/*    */   public List<String> getCommonPromptPaths() {
/* 25 */     String[] arrayOfString = new String[6]; arrayOfString[0] = "common/space_automation_artifacts.prompt"; arrayOfString[1] = 
/* 26 */       "common/space_automation_events.prompt";
/* 27 */     arrayOfString[2] = "common/space_automation_parallel.prompt";
/* 28 */     arrayOfString[3] = "common/space_automation_publish_docker.prompt";
/* 29 */     arrayOfString[4] = "common/space_automation_requirements.prompt";
/* 30 */     arrayOfString[5] = "common/space_automation_scripts.prompt";
/*    */     return CollectionsKt.listOf((Object[])arrayOfString); } @NotNull
/*    */   public List<String> getBuildSystemPromptPaths(@NotNull BuildSystemType buildSystemType) {
/*    */     String[] arrayOfString;
/* 34 */     Intrinsics.checkNotNullParameter(buildSystemType, "buildSystemType"); switch (WhenMappings.$EnumSwitchMapping$0[buildSystemType.ordinal()]) {
/*    */       case 1:
/* 36 */         arrayOfString = new String[2]; arrayOfString[0] = "gradle/space_automation_build_gradle.prompt"; arrayOfString[1] = 
/* 37 */           "gradle/space_automation_publish_gradle.prompt";
/*    */ 
/*    */       
/*    */       case 2:
/* 41 */         arrayOfString = new String[2]; arrayOfString[0] = "maven/space_automation_build_maven.prompt"; arrayOfString[1] = 
/* 42 */           "maven/space_automation_publish_maven.prompt";
/*    */     } 
/*    */     
/* 45 */     return CollectionsKt.emptyList();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getDescriptionPrefix(@NotNull BuildSystemType buildSystemType) {
/* 50 */     Intrinsics.checkNotNullParameter(buildSystemType, "buildSystemType"); Intrinsics.checkNotNullExpressionValue(buildSystemType.name().toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return "Create .space.kts file for Space Automation CI. Project build system is " + buildSystemType.name().toLowerCase(Locale.ROOT) + ". ";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/SpaceAutomationPromptFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */