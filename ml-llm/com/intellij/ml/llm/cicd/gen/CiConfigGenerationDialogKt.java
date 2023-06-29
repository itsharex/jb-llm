/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ 
/*    */ import com.intellij.notification.Notification;
/*    */ import com.intellij.notification.NotificationType;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\032\032\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\000¨\006\006"}, d2 = {"showSaveFileFailedNotification", "", "project", "Lcom/intellij/openapi/project/Project;", "reason", "", "intellij.ml.llm"})
/*    */ public final class CiConfigGenerationDialogKt
/*    */ {
/*    */   public static final void showSaveFileFailedNotification(@NotNull Project project, @Nullable String reason) {
/* 82 */     Intrinsics.checkNotNullParameter(project, "project");
/*    */ 
/*    */ 
/*    */     
/* 86 */     if (reason == null); Notification notification = "Failed to save generated CI/CD config".createNotification(reason, "Unknown error", 
/* 87 */         NotificationType.WARNING);
/*    */     
/* 89 */     notification.notify(project);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CiConfigGenerationDialogKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */