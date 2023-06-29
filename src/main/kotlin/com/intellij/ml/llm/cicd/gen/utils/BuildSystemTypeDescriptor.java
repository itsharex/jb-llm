/*    */ package com.intellij.ml.llm.cicd.gen.utils;
/*    */ import com.intellij.ml.llm.cicd.gen.models.BuildSystemType;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.roots.ProjectRootManager;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/utils/BuildSystemTypeDescriptor;", "", "()V", "getBuildSystemType", "Lcom/intellij/ml/llm/cicd/gen/models/BuildSystemType;", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ public final class BuildSystemTypeDescriptor {
/*    */   @NotNull
/*    */   public final BuildSystemType getBuildSystemType(@NotNull Project project) {
/* 13 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullExpressionValue(ProjectRootManager.getInstance(project).getContentRoots(), "getInstance(project).contentRoots"); VirtualFile[] contentRoots = ProjectRootManager.getInstance(project).getContentRoots(); byte b; int i;
/* 14 */     for (b = 0, i = contentRoots.length; b < i; ) { VirtualFile contentRoot = contentRoots[b];
/* 15 */       if (contentRoot.findChild("pom.xml") != null) {
/* 16 */         return BuildSystemType.MAVEN;
/*    */       }
/*    */       
/*    */       b++; }
/*    */     
/* 21 */     return BuildSystemType.GRADLE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final BuildSystemTypeDescriptor INSTANCE = new BuildSystemTypeDescriptor();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/utils/BuildSystemTypeDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */