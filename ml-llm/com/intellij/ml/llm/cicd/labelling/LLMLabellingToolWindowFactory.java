/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\020\020\t\032\0020\n2\006\020\005\032\0020\006H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowFactory;", "Lcom/intellij/openapi/wm/ToolWindowFactory;", "()V", "createToolWindowContent", "", "project", "Lcom/intellij/openapi/project/Project;", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "isApplicable", "", "intellij.ml.llm"})
/*    */ public final class LLMLabellingToolWindowFactory implements ToolWindowFactory {
/*    */   public boolean isApplicable(@NotNull Project project) {
/* 10 */     Intrinsics.checkNotNullParameter(project, "project"); return Registry.is("llm.is.internal");
/*    */   }
/*    */   public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
/* 13 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); LLMLabellingToolWindowPanel toolWindowPanel = new LLMLabellingToolWindowPanel(project);
/* 14 */     Intrinsics.checkNotNullExpressionValue(ContentFactory.getInstance().createContent(toolWindowPanel.getComponent(), null, false), "getInstance().createCont…l.component, null, false)"); Content content = ContentFactory.getInstance().createContent(toolWindowPanel.getComponent(), null, false);
/* 15 */     toolWindow.getContentManager().addContent(content);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */