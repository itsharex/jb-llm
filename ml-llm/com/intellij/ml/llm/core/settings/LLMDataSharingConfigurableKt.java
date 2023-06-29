/*    */ package com.intellij.ml.llm.core.settings;
/*    */ 
/*    */ import com.intellij.openapi.options.ShowSettingsUtil;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\032\022\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\000¨\006\004"}, d2 = {"openDataSharingSettingsDialog", "", "project", "Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
/*    */ public final class LLMDataSharingConfigurableKt
/*    */ {
/*    */   public static final void openDataSharingSettingsDialog(@Nullable Project project) {
/* 42 */     ShowSettingsUtil.getInstance().showSettingsDialog(project, LLMDataSharingConfigurable.class);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/settings/LLMDataSharingConfigurableKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */