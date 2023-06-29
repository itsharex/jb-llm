/*    */ package com.intellij.ml.llm.cicd.gen.prompts;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\004\030\000 \n2\0020\001:\001\nB\005¢\006\002\020\002J\026\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\026J\016\020\b\032\b\022\004\022\0020\0050\004H\026J\020\020\t\032\0020\0052\006\020\006\032\0020\007H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/GithubActionsPromptFactory;", "Lcom/intellij/ml/llm/cicd/gen/prompts/CiPromptFactory;", "()V", "getBuildSystemPromptPaths", "", "", "buildSystemType", "Lcom/intellij/ml/llm/cicd/gen/models/BuildSystemType;", "getCommonPromptPaths", "getDescriptionPrefix", "Companion", "intellij.ml.llm"})
/*    */ public final class GithubActionsPromptFactory extends CiPromptFactory { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private static final String PROMPT_BASE_DIRECTORY_PATH = "prompts/cicd/github"; public GithubActionsPromptFactory() {
/*  5 */     super("prompts/cicd/github");
/*    */   }
/*    */   @NotNull
/*    */   private static final String PROMPT_COMMON_EVENTS_PATH = "common/github_actions_events.prompt"; @NotNull
/*    */   private static final String PROMPT_COMMON_PUBLISH_DOCKER_PATH = "common/github_actions_publish_docker.prompt"; @NotNull
/*    */   private static final String PROMPT_GRADLE_BUILD_PATH = "gradle/github_actions_build_gradle.prompt"; @NotNull
/*    */   private static final String PROMPT_GRADLE_PUBLISH_PATH = "gradle/github_actions_publish_gradle.prompt"; @NotNull
/*    */   private static final String PROMPT_MAVEN_BUILD_PATH = "maven/github_actions_build_maven.prompt"; @NotNull
/*    */   private static final String PROMPT_MAVEN_PUBLISH_PATH = "maven/github_actions_publish_maven.prompt";
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000R\016\020\b\032\0020\004XT¢\006\002\n\000R\016\020\t\032\0020\004XT¢\006\002\n\000R\016\020\n\032\0020\004XT¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/GithubActionsPromptFactory$Companion;", "", "()V", "PROMPT_BASE_DIRECTORY_PATH", "", "PROMPT_COMMON_EVENTS_PATH", "PROMPT_COMMON_PUBLISH_DOCKER_PATH", "PROMPT_GRADLE_BUILD_PATH", "PROMPT_GRADLE_PUBLISH_PATH", "PROMPT_MAVEN_BUILD_PATH", "PROMPT_MAVEN_PUBLISH_PATH", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   
/*    */   @NotNull
/*    */   public List<String> getCommonPromptPaths() {
/* 21 */     String[] arrayOfString = new String[2]; arrayOfString[0] = "common/github_actions_events.prompt"; arrayOfString[1] = 
/* 22 */       "common/github_actions_publish_docker.prompt";
/*    */     return CollectionsKt.listOf((Object[])arrayOfString); } @NotNull
/*    */   public List<String> getBuildSystemPromptPaths(@NotNull BuildSystemType buildSystemType) {
/*    */     String[] arrayOfString;
/* 26 */     Intrinsics.checkNotNullParameter(buildSystemType, "buildSystemType"); switch (WhenMappings.$EnumSwitchMapping$0[buildSystemType.ordinal()]) {
/*    */       case 1:
/* 28 */         arrayOfString = new String[2]; arrayOfString[0] = "gradle/github_actions_build_gradle.prompt"; arrayOfString[1] = 
/* 29 */           "gradle/github_actions_publish_gradle.prompt";
/*    */ 
/*    */       
/*    */       case 2:
/* 33 */         arrayOfString = new String[2]; arrayOfString[0] = "maven/github_actions_build_maven.prompt"; arrayOfString[1] = 
/* 34 */           "maven/github_actions_publish_maven.prompt";
/*    */     } 
/*    */     
/* 37 */     return CollectionsKt.emptyList();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getDescriptionPrefix(@NotNull BuildSystemType buildSystemType) {
/* 42 */     Intrinsics.checkNotNullParameter(buildSystemType, "buildSystemType"); return "Create build.yml YAML file for GitHub Action CI. Project build system is " + buildSystemType.name() + ". ";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/GithubActionsPromptFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */