/*    */ package com.intellij.ml.llm.cicd.gen.prompts;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import git4idea.GitRemoteBranch;
/*    */ import git4idea.repo.GitRepository;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J0\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\0072\006\020\b\032\0020\0052\006\020\t\032\0020\0052\b\b\002\020\n\032\0020\013H\002J\020\020\f\032\0020\0052\006\020\006\032\0020\007H\002J\016\020\r\032\0020\0052\006\020\006\032\0020\007¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder;", "", "()V", "buildFileContext", "", "", "project", "Lcom/intellij/openapi/project/Project;", "fileName", "fileKey", "withContent", "", "buildGitContext", "buildProjectContext", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nProjectStructureContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectStructureContextBuilder.kt\ncom/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1360#2:49\n1446#2,5:50\n1855#2,2:55\n*S KotlinDebug\n*F\n+ 1 ProjectStructureContextBuilder.kt\ncom/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder\n*L\n32#1:49\n32#1:50,5\n21#1:55,2\n*E\n"})
/*    */ public final class ProjectStructureContextBuilder {
/*    */   private static final void buildFileContext$lambda$1(Project $project, String $fileName, String $fileKey, List $filesContext, boolean $withContent) {
/* 19 */     Intrinsics.checkNotNullParameter($project, "$project"); Intrinsics.checkNotNullParameter($fileName, "$fileName"); Intrinsics.checkNotNullParameter($fileKey, "$fileKey"); Intrinsics.checkNotNullParameter($filesContext, "$filesContext"); Set set = PsiUtilsKt.extractPsiFilesByPredicate($project, new ProjectStructureContextBuilder$buildFileContext$1$1($fileName));
/*    */     
/* 21 */     int $i$f$forEach = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     Iterator iterator = set.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PsiFile it = (PsiFile)element$iv; int $i$a$-forEach-ProjectStructureContextBuilder$buildFileContext$1$2 = 0;
/*    */       String filePathContext = $fileKey + "=" + $fileKey + it.getVirtualFile().getPath(); }
/*    */   
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ProjectStructureContextBuilder INSTANCE = new ProjectStructureContextBuilder();
/*    */   
/*    */   private final List<String> buildFileContext(Project project, String fileName, String fileKey, boolean withContent) {
/*    */     // Byte code:
/*    */     //   0: new java/util/ArrayList
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: checkcast java/util/List
/*    */     //   10: astore #5
/*    */     //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   15: aload_1
/*    */     //   16: aload_2
/*    */     //   17: aload_3
/*    */     //   18: aload #5
/*    */     //   20: iload #4
/*    */     //   22: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/Runnable;
/*    */     //   27: invokeinterface runReadAction : (Ljava/lang/Runnable;)V
/*    */     //   32: aload #5
/*    */     //   34: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     //   #16	-> 10
/*    */     //   #18	-> 12
/*    */     //   #27	-> 32
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   12	23	5	filesContext	Ljava/util/List;
/*    */     //   0	35	0	this	Lcom/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder;
/*    */     //   0	35	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	35	2	fileName	Ljava/lang/String;
/*    */     //   0	35	3	fileKey	Ljava/lang/String;
/*    */     //   0	35	4	withContent	Z
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "invoke", "(Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/Boolean;"})
/*    */   static final class ProjectStructureContextBuilder$buildFileContext$1$1 extends Lambda implements Function1<VirtualFile, Boolean> {
/*    */     @NotNull
/*    */     public final Boolean invoke(@NotNull VirtualFile it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       Intrinsics.checkNotNullExpressionValue(it.getName(), "it.name");
/*    */       return Boolean.valueOf(StringsKt.contains$default(it.getName(), this.$fileName, false, 2, null));
/*    */     }
/*    */     
/*    */     ProjectStructureContextBuilder$buildFileContext$1$1(String $fileName) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */   
/*    */   private final String buildGitContext(Project project) {
/*    */     Intrinsics.checkNotNullExpressionValue(GitRepositoryManager.getInstance(project).getRepositories(), "getInstance(project).repositories");
/*    */     List list1 = GitRepositoryManager.getInstance(project).getRepositories();
/*    */     int $i$f$flatMap = 0;
/*    */     List list2 = list1;
/*    */     Collection destination$iv$iv = new ArrayList();
/*    */     int $i$f$flatMapTo = 0;
/*    */     for (Object element$iv$iv : list2) {
/*    */       GitRepository it = (GitRepository)element$iv$iv;
/*    */       int $i$a$-flatMap-ProjectStructureContextBuilder$buildGitContext$branchesContext$1 = 0;
/*    */       Intrinsics.checkNotNullExpressionValue(it.getBranches().getRemoteBranches(), "it.branches.remoteBranches");
/*    */       Iterable list$iv$iv = it.getBranches().getRemoteBranches();
/*    */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/*    */     Intrinsics.checkNotNullExpressionValue(System.lineSeparator(), "lineSeparator()");
/*    */     String branchesContext = CollectionsKt.joinToString$default(destination$iv$iv, System.lineSeparator(), null, null, 0, null, ProjectStructureContextBuilder$buildGitContext$branchesContext$2.INSTANCE, 30, null);
/*    */     return "Github remote branches:" + System.lineSeparator() + branchesContext;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\r\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "it", "Lgit4idea/GitRemoteBranch;", "kotlin.jvm.PlatformType", "invoke"})
/*    */   static final class ProjectStructureContextBuilder$buildGitContext$branchesContext$2 extends Lambda implements Function1<GitRemoteBranch, CharSequence> {
/*    */     public static final ProjectStructureContextBuilder$buildGitContext$branchesContext$2 INSTANCE = new ProjectStructureContextBuilder$buildGitContext$branchesContext$2();
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(GitRemoteBranch it) {
/*    */       Intrinsics.checkNotNullExpressionValue(it.getName(), "it.name");
/*    */       return it.getName();
/*    */     }
/*    */     
/*    */     ProjectStructureContextBuilder$buildGitContext$branchesContext$2() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String buildProjectContext(@NotNull Project project) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     StringBuilder stringBuilder1 = new StringBuilder(), $this$buildProjectContext_u24lambda_u243 = stringBuilder1;
/*    */     int $i$a$-buildString-ProjectStructureContextBuilder$buildProjectContext$1 = 0;
/*    */     buildFileContext$default(INSTANCE, project, "build.gradle", "BUILD_GRADLE_PATH", false, 8, null);
/*    */     buildFileContext$default(INSTANCE, project, "gradle.properties", "GRADLE_PROPERTIES_PATH", false, 8, null);
/*    */     buildFileContext$default(INSTANCE, project, "pom.xml", "POM_XML_PATH", false, 8, null);
/*    */     buildFileContext$default(INSTANCE, project, ".Dockerfile", "DOCKER_PATH", false, 8, null);
/*    */     INSTANCE.buildGitContext(project);
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/prompts/ProjectStructureContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */