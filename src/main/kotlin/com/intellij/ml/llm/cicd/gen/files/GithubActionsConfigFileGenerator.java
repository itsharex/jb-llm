/*    */ package com.intellij.ml.llm.cicd.gen.files;
/*    */ import com.intellij.ml.llm.cicd.gen.utils.FileUtilsKt;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.util.io.PathKt;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/files/GithubActionsConfigFileGenerator;", "Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "createAndOpenInEditor", "", "toolchain", "", "document", "Lcom/intellij/openapi/editor/Document;", "intellij.ml.llm"})
/*    */ public final class GithubActionsConfigFileGenerator extends CiConfigFileGenerator {
/*    */   public GithubActionsConfigFileGenerator(@NotNull Project project) {
/* 13 */     super(project);
/*    */   } public void createAndOpenInEditor(@NotNull String toolchain, @NotNull Document document) {
/* 15 */     Intrinsics.checkNotNullParameter(toolchain, "toolchain"); Intrinsics.checkNotNullParameter(document, "document");
/*    */     
/* 17 */     Intrinsics.checkNotNullExpressionValue(getRootDir().toNioPath().resolve(".github").resolve("workflows"), "rootDir.toNioPath()\n    …    .resolve(\"workflows\")");
/* 18 */     Path githubDir = PathKt.createDirectories(getRootDir().toNioPath().resolve(".github").resolve("workflows"));
/*    */ 
/*    */     
/* 21 */     String extension = CiPlatform.INSTANCE.getFileExtension(toolchain);
/* 22 */     String filename = FileUtilsKt.generateUniqueFilename(githubDir, "config", extension) + FileUtilsKt.generateUniqueFilename(githubDir, "config", extension);
/*    */     
/* 24 */     Intrinsics.checkNotNullExpressionValue(githubDir.resolve(filename), "githubDir.resolve(filename)"); Path yamlFile = PathKt.createFile(githubDir.resolve(filename));
/* 25 */     Intrinsics.checkNotNullExpressionValue(document.getText(), "document.text"); PathsKt.writeText$default(yamlFile, document.getText(), null, new java.nio.file.OpenOption[0], 2, null);
/*    */     
/* 27 */     refreshAndOpenInEditor(yamlFile, getRootDir());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/files/GithubActionsConfigFileGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */