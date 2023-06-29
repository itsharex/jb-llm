/*    */ package com.intellij.ml.llm.core.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*    */ import com.intellij.openapi.actionSystem.ex.ActionUtil;
/*    */ import com.intellij.openapi.project.DumbAware;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import com.intellij.openapi.wm.ToolWindowFactory;
/*    */ import com.intellij.openapi.wm.ex.ToolWindowEx;
/*    */ import com.intellij.openapi.wm.impl.content.ToolWindowContentUi;
/*    */ import com.intellij.ui.content.Content;
/*    */ import com.intellij.ui.content.ContentFactory;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\000 \n2\0020\0012\0020\002:\001\nB\005¢\006\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/chat/AIAssistantToolWindowFactory;", "Lcom/intellij/openapi/wm/ToolWindowFactory;", "Lcom/intellij/openapi/project/DumbAware;", "()V", "createToolWindowContent", "", "project", "Lcom/intellij/openapi/project/Project;", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "Companion", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantToolWindowFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantToolWindowFactory.kt\ncom/intellij/ml/llm/core/chat/AIAssistantToolWindowFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/*    */ public final class AIAssistantToolWindowFactory
/*    */   implements ToolWindowFactory, DumbAware {
/*    */   public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
/* 26 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); Intrinsics.checkNotNullExpressionValue(toolWindow.getDisposable(), "toolWindow.disposable"); AIAssistantContainerPanel container = new AIAssistantContainerPanel(project, toolWindow.getDisposable());
/* 27 */     Content content1 = ContentFactory.getInstance().createContent((JComponent)container, null, false);
/* 28 */     Content $this$createToolWindowContent_u24lambda_u240 = content1;
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
/* 57 */     int $i$a$-apply-AIAssistantToolWindowFactory$createToolWindowContent$dialogContent$1 = 0;
/*    */     $this$createToolWindowContent_u24lambda_u240.setCloseable(false);
/*    */     Intrinsics.checkNotNullExpressionValue(content1, "getInstance().createCont…y { isCloseable = false }");
/*    */     Content dialogContent = content1;
/*    */     ToolWindowEx toolWindowEx1 = (ToolWindowEx)toolWindow, $this$createToolWindowContent_u24lambda_u241 = toolWindowEx1;
/*    */     int $i$a$-apply-AIAssistantToolWindowFactory$createToolWindowContent$1 = 0;
/*    */     $this$createToolWindowContent_u24lambda_u241.getContentManager().addContent(dialogContent);
/*    */     $this$createToolWindowContent_u24lambda_u241.setTitleActions(CollectionsKt.listOfNotNull(ActionUtil.getActionGroup("AIAssistant.ToolWindow.Chat.TitleActions")));
/*    */     $this$createToolWindowContent_u24lambda_u241.setAdditionalGearActions(ActionUtil.getActionGroup("AIAssistant.ToolWindow.Chat.SecondaryGearActions"));
/*    */     $this$createToolWindowContent_u24lambda_u241.getComponent().putClientProperty(ToolWindowContentUi.DONT_HIDE_TOOLBAR_IN_HEADER, Boolean.valueOf(true));
/*    */     $this$createToolWindowContent_u24lambda_u241.getComponent().putClientProperty(ToolWindowContentUi.SHOW_BETA_LABEL, Boolean.valueOf(true));
/*    */     $this$createToolWindowContent_u24lambda_u241.updateContentUi();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   public static final String ID = "AIAssistant";
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/AIAssistantToolWindowFactory$Companion;", "", "()V", "ID", "", "intellij.ml.llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/AIAssistantToolWindowFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */