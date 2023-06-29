/*    */ package com.intellij.ml.llm.cicd.gen.files;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.util.io.PathKt;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/files/SpaceAutomationConfigFileGenerator;", "Lcom/intellij/ml/llm/cicd/gen/files/CiConfigFileGenerator;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "createAndOpenInEditor", "", "ciTool", "", "document", "Lcom/intellij/openapi/editor/Document;", "intellij.ml.llm"})
/*    */ public final class SpaceAutomationConfigFileGenerator extends CiConfigFileGenerator {
/*    */   public SpaceAutomationConfigFileGenerator(@NotNull Project project) {
/* 12 */     super(project);
/*    */   } public void createAndOpenInEditor(@NotNull String ciTool, @NotNull Document document) {
/* 14 */     Intrinsics.checkNotNullParameter(ciTool, "ciTool"); Intrinsics.checkNotNullParameter(document, "document"); Path file = getRootDir().toNioPath().resolve(".space.kts");
/* 15 */     Intrinsics.checkNotNullExpressionValue(file, "file"); if (!Files.exists(file, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) PathKt.createFile(file);
/*    */     
/* 17 */     String prefix = SpaceAutomationConfigFileGeneratorKt.access$isLineBreakOrBlank(PathKt.readText(file)) ? "" : System.lineSeparator();
/* 18 */     PathsKt.appendText$default(file, prefix + prefix, null, 2, null);
/*    */     
/* 20 */     refreshAndOpenInEditor(file, getRootDir());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/files/SpaceAutomationConfigFileGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */