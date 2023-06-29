/*    */ package com.intellij.ml.llm.core.chat.actions.toolbar;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatCreationContext;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatOrigin;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*    */ import com.intellij.ml.llm.core.grazieAPI.GrazieAuthState;
/*    */ import com.intellij.openapi.actionSystem.ActionToolbar;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.actionSystem.Presentation;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.ui.components.panels.Wrapper;
/*    */ import java.beans.PropertyChangeEvent;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\b\020\016\032\0020\017H\026J\020\020\020\032\0020\0052\006\020\006\032\0020\007H\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantNewChatAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "Lcom/intellij/openapi/actionSystem/ex/CustomComponentAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "createCustomComponent", "Ljavax/swing/JComponent;", "presentation", "Lcom/intellij/openapi/actionSystem/Presentation;", "place", "", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ public final class AIAssistantNewChatAction extends DumbAwareAction implements CustomComponentAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/* 29 */     Intrinsics.checkNotNullParameter(e, "e");
/*    */   }
/*    */   public void update(@NotNull AnActionEvent e) {
/* 32 */     Intrinsics.checkNotNullParameter(e, "e"); ChatSession session = (ChatSession)e.getDataContext().getData(ChatSession.Companion.getCurrentSession());
/* 33 */     GrazieAuthState[] arrayOfGrazieAuthState = new GrazieAuthState[1]; arrayOfGrazieAuthState[0] = GrazieAuthState.Authed; e.getPresentation().setVisible(((Boolean)GrazieAuthServiceKt.isAnySelected(GrazieAuthService.Companion.getInstance().getAuthState(), arrayOfGrazieAuthState).getValue()).booleanValue());
/* 34 */     e.getPresentation().setEnabled((session == null || (!session.getMessages().isEmpty())));
/*    */   }
/*    */   
/*    */   @NotNull
/* 38 */   public JComponent createCustomComponent(@NotNull Presentation presentation, @NotNull String place) { Intrinsics.checkNotNullParameter(presentation, "presentation"); Intrinsics.checkNotNullParameter(place, "place"); String str = LLMBundle.message("new.chat", new Object[0]); AIAssistantNewChatAction$createCustomComponent$ourButton$1 ourButton = new AIAssistantNewChatAction$createCustomComponent$ourButton$1(str);
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
/* 57 */     presentation.addPropertyChangeListener(ourButton::createCustomComponent$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     Wrapper wrapper1 = new Wrapper(ourButton), $this$createCustomComponent_u24lambda_u241 = wrapper1; int $i$a$-apply-AIAssistantNewChatAction$createCustomComponent$2 = 0;
/* 65 */     $this$createCustomComponent_u24lambda_u241.setBorder((Border)JBUI.Borders.empty(0, 10));
/*    */     return (JComponent)wrapper1; }
/*    */    @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 69 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"com/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantNewChatAction$createCustomComponent$ourButton$1", "Ljavax/swing/JButton;", "intellij.ml.llm"})
/*    */   public static final class AIAssistantNewChatAction$createCustomComponent$ourButton$1 extends JButton {
/*    */     AIAssistantNewChatAction$createCustomComponent$ourButton$1(String $super_call_param$1) {
/*    */       super($super_call_param$1);
/*    */       putClientProperty("ActionToolbar.smallVariant", Boolean.valueOf(true));
/*    */       putClientProperty("customButtonInsets", (new JBInsets(1)).asUIResource());
/*    */       setOpaque(false);
/*    */       addActionListener(this::_init_$lambda$0);
/*    */     }
/*    */     
/*    */     private static final void _init_$lambda$0(AIAssistantNewChatAction$createCustomComponent$ourButton$1 this$0, ActionEvent it) {
/*    */       AIAssistantContainerPanel containerPanel;
/*    */       Project project;
/*    */       Intrinsics.checkNotNullParameter(this$0, "this$0");
/*    */       Intrinsics.checkNotNullExpressionValue(ActionToolbar.getDataContextFor(this$0), "getDataContextFor(this)");
/*    */       DataContext dataContext = ActionToolbar.getDataContextFor(this$0);
/*    */       if ((AIAssistantContainerPanel)dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()) == null) {
/*    */         (AIAssistantContainerPanel)dataContext.getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer());
/*    */         throw new IllegalStateException("Can't find chat list panel".toString());
/*    */       } 
/*    */       if ((Project)dataContext.getData(CommonDataKeys.PROJECT) == null) {
/*    */         (Project)dataContext.getData(CommonDataKeys.PROJECT);
/*    */         return;
/*    */       } 
/*    */       ChatCreationContext context = new ChatCreationContext((ChatOrigin)ChatOrigin.AIAssistantTool.INSTANCE, ChatSessionStorage.SourceAction.NEW_CHAT, null, null, 12, null);
/*    */       BuildersKt.launch$default(AIAssistantServiceScope.Companion.getScope(project), null, null, new AIAssistantNewChatAction$createCustomComponent$ourButton$1$1$1(containerPanel, context, null), 3, null);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final void createCustomComponent$lambda$0(AIAssistantNewChatAction$createCustomComponent$ourButton$1 $ourButton, PropertyChangeEvent it) {
/*    */     Intrinsics.checkNotNullParameter($ourButton, "$ourButton");
/*    */     String str = it.getPropertyName();
/*    */     if (Intrinsics.areEqual(str, "visible")) {
/*    */       Intrinsics.checkNotNull(it.getNewValue(), "null cannot be cast to non-null type kotlin.Boolean");
/*    */       $ourButton.setVisible(((Boolean)it.getNewValue()).booleanValue());
/*    */     } else if (Intrinsics.areEqual(str, "enabled")) {
/*    */       Intrinsics.checkNotNull(it.getNewValue(), "null cannot be cast to non-null type kotlin.Boolean");
/*    */       $ourButton.setEnabled(((Boolean)it.getNewValue()).booleanValue());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/toolbar/AIAssistantNewChatAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */