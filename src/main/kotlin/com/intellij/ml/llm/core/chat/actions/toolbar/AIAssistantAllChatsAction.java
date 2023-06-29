/*    */ package com.intellij.ml.llm.core.chat.actions.toolbar;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*    */ import com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanel;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.actionSystem.Presentation;
/*    */ import com.intellij.ui.HyperlinkLabel;
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\b\020\016\032\0020\017H\026J\020\020\020\032\0020\0052\006\020\006\032\0020\007H\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantAllChatsAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "Lcom/intellij/openapi/actionSystem/ex/CustomComponentAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "createCustomComponent", "Ljavax/swing/JComponent;", "presentation", "Lcom/intellij/openapi/actionSystem/Presentation;", "place", "", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ public final class AIAssistantAllChatsAction extends DumbAwareAction implements CustomComponentAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/* 15 */     Intrinsics.checkNotNullParameter(e, "e");
/*    */   }
/*    */   @NotNull
/* 18 */   public JComponent createCustomComponent(@NotNull Presentation presentation, @NotNull String place) { Intrinsics.checkNotNullParameter(presentation, "presentation"); Intrinsics.checkNotNullParameter(place, "place"); HyperlinkLabel hyperlinkLabel1 = new HyperlinkLabel(LLMBundle.message("link.label.all.chats", new Object[0])), $this$createCustomComponent_u24lambda_u242 = hyperlinkLabel1; int $i$a$-apply-AIAssistantAllChatsAction$createCustomComponent$1 = 0;
/* 19 */     presentation.addPropertyChangeListener($this$createCustomComponent_u24lambda_u242::createCustomComponent$lambda$2$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     $this$createCustomComponent_u24lambda_u242.addHyperlinkListener($this$createCustomComponent_u24lambda_u242::createCustomComponent$lambda$2$lambda$1); return (JComponent)hyperlinkLabel1; } private static final void createCustomComponent$lambda$2$lambda$1(HyperlinkLabel $this_apply, HyperlinkEvent it) { AIAssistantContainerPanel allChatsPanel;
/* 26 */     Intrinsics.checkNotNullParameter($this_apply, "$this_apply"); Intrinsics.checkNotNullExpressionValue(ActionToolbar.getDataContextFor((Component)$this_apply), "getDataContextFor(this)"); DataContext dataContext = ActionToolbar.getDataContextFor((Component)$this_apply);
/* 27 */     if ((AIAssistantContainerPanel)dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()) == null) { (AIAssistantContainerPanel)dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()); throw new IllegalStateException("Can't find chat list panel".toString()); }
/* 28 */      AIAssistantChatEventLogger.Companion.logAllChatsClicked((Project)dataContext.getData(PlatformDataKeys.PROJECT));
/* 29 */     allChatsPanel.goToAllDialogs(); }
/*    */   private static final void createCustomComponent$lambda$2$lambda$0(HyperlinkLabel $this_apply, PropertyChangeEvent it) { Intrinsics.checkNotNullParameter($this_apply, "$this_apply"); String str = it.getPropertyName(); if (Intrinsics.areEqual(str, "visible")) {
/*    */       Intrinsics.checkNotNull(it.getNewValue(), "null cannot be cast to non-null type kotlin.Boolean"); $this_apply.setVisible(((Boolean)it.getNewValue()).booleanValue());
/*    */     } else if (Intrinsics.areEqual(str, "enabled")) {
/*    */       Intrinsics.checkNotNull(it.getNewValue(), "null cannot be cast to non-null type kotlin.Boolean");
/*    */       $this_apply.setEnabled(((Boolean)it.getNewValue()).booleanValue());
/* 35 */     }  } public void update(@NotNull AnActionEvent e) { Intrinsics.checkNotNullParameter(e, "e"); AIAssistantChatPanel currentDialog = (AIAssistantChatPanel)e.getDataContext().getData(AIAssistantChatPanel.Companion.getCurrentDialogKey());
/* 36 */     e.getPresentation().setEnabled((currentDialog != null));
/* 37 */     e.getPresentation().setVisible(GrazieAuthService.Companion.getInstance().isAuthenticated()); }
/*    */    @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 40 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantAllChatsAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */