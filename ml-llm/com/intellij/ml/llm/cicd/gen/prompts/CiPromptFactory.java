/*    */ package com.intellij.ml.llm.cicd.gen.prompts;
/*    */ import com.intellij.ml.llm.cicd.gen.models.BuildSystemType;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\006\b&\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\026\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\003J\026\020\f\032\b\022\004\022\0020\0030\r2\006\020\016\032\0020\017H&J\016\020\020\032\b\022\004\022\0020\0030\rH&J\020\020\021\032\0020\0032\006\020\016\032\0020\017H&J\020\020\022\032\0020\0032\006\020\t\032\0020\nH\002J\026\020\023\032\0020\0032\f\020\024\032\b\022\004\022\0020\0030\rH\002R\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/CiPromptFactory;", "", "promptsBasePath", "", "(Ljava/lang/String;)V", "promptsLoader", "Lcom/intellij/ml/llm/cicd/gen/prompts/PromptsLoader;", "createPrompt", "Lcom/intellij/ml/llm/cicd/gen/models/CiPrompt;", "project", "Lcom/intellij/openapi/project/Project;", "description", "getBuildSystemPromptPaths", "", "buildSystemType", "Lcom/intellij/ml/llm/cicd/gen/models/BuildSystemType;", "getCommonPromptPaths", "getDescriptionPrefix", "getProjectStructureContext", "loadPrompts", "paths", "intellij.ml.llm"})
/*    */ public abstract class CiPromptFactory {
/*    */   public CiPromptFactory(@NotNull String promptsBasePath) {
/* 10 */     this.promptsLoader = new PromptsLoader(promptsBasePath);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final PromptsLoader promptsLoader;
/*    */ 
/*    */   
/*    */   private final String getProjectStructureContext(Project project) {
/* 19 */     return ProjectStructureContextBuilder.INSTANCE.buildProjectContext(project);
/*    */   }
/*    */   
/*    */   private final String loadPrompts(List paths) {
/* 23 */     Intrinsics.checkNotNullExpressionValue(System.lineSeparator(), "lineSeparator()"); return CollectionsKt.joinToString$default(paths, System.lineSeparator(), null, null, 0, null, new CiPromptFactory$loadPrompts$1(), 30, null); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}) static final class CiPromptFactory$loadPrompts$1 extends Lambda implements Function1<String, CharSequence> { @NotNull
/* 24 */     public final CharSequence invoke(@NotNull String it) { Intrinsics.checkNotNullParameter(it, "it"); return CiPromptFactory.this.promptsLoader.getPrompt(it); }
/*    */      CiPromptFactory$loadPrompts$1() {
/*    */       super(1);
/*    */     } } @NotNull
/*    */   public final CiPrompt createPrompt(@NotNull Project project, @NotNull String description) {
/* 29 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(description, "description"); BuildSystemType buildSystemType = BuildSystemTypeDescriptor.INSTANCE.getBuildSystemType(project);
/* 30 */     return new CiPrompt(
/* 31 */         loadPrompts(getCommonPromptPaths()), 
/* 32 */         loadPrompts(getBuildSystemPromptPaths(buildSystemType)), 
/* 33 */         getProjectStructureContext(project), 
/* 34 */         getDescriptionPrefix(buildSystemType), 
/* 35 */         description);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public abstract List<String> getCommonPromptPaths();
/*    */   
/*    */   @NotNull
/*    */   public abstract List<String> getBuildSystemPromptPaths(@NotNull BuildSystemType paramBuildSystemType);
/*    */   
/*    */   @NotNull
/*    */   public abstract String getDescriptionPrefix(@NotNull BuildSystemType paramBuildSystemType);
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/CiPromptFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */