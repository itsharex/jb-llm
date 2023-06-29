/*    */ package com.intellij.ml.llm.evaluation;
/*    */ 
/*    */ import com.intellij.ide.scratch.ScratchUtil;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.io.path.PathsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004¨\006\005"}, d2 = {"relativeName", "", "Lcom/intellij/openapi/vfs/VirtualFile;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ public final class TextRangeCallLocationKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String relativeName(@NotNull VirtualFile $this$relativeName, @NotNull Project project) {
/* 40 */     Intrinsics.checkNotNullParameter($this$relativeName, "<this>"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullExpressionValue($this$relativeName.getPresentableName(), "presentableName");
/* 41 */     Intrinsics.checkNotNullExpressionValue($this$relativeName.toNioPath(), "toNioPath()"); Intrinsics.checkNotNull(project.getBasePath()); Intrinsics.checkNotNullExpressionValue(Path.of(project.getBasePath(), new String[0]), "of(project.basePath!!)"); if (PathsKt.relativeToOrNull($this$relativeName.toNioPath(), Path.of(project.getBasePath(), new String[0])) == null || PathsKt.relativeToOrNull($this$relativeName.toNioPath(), Path.of(project.getBasePath(), new String[0])).toString() == null) { PathsKt.relativeToOrNull($this$relativeName.toNioPath(), Path.of(project.getBasePath(), new String[0])).toString();
/* 42 */       Intrinsics.checkNotNullExpressionValue($this$relativeName.getPresentableName(), "relativeName"); }  return (ScratchUtil.isScratch($this$relativeName) || $this$relativeName instanceof com.intellij.testFramework.LightVirtualFile) ? $this$relativeName.getPresentableName() : $this$relativeName.getPresentableName();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/evaluation/TextRangeCallLocationKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */