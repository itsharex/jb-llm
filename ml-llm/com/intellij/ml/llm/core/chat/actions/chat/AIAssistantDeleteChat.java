/*    */ package com.intellij.ml.llm.core.chat.actions.chat;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantContainerPanel;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J \020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/chat/AIAssistantDeleteChat;", "Lcom/intellij/ml/llm/core/chat/actions/chat/BaseAIAssistantChatAction;", "()V", "doAction", "", "project", "Lcom/intellij/openapi/project/Project;", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantDeleteChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantDeleteChat.kt\ncom/intellij/ml/llm/core/chat/actions/chat/AIAssistantDeleteChat\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,21:1\n29#2,3:22\n*S KotlinDebug\n*F\n+ 1 AIAssistantDeleteChat.kt\ncom/intellij/ml/llm/core/chat/actions/chat/AIAssistantDeleteChat\n*L\n17#1:22,3\n*E\n"})
/*    */ public final class AIAssistantDeleteChat extends BaseAIAssistantChatAction {
/*    */   public AIAssistantDeleteChat() {
/* 11 */     super("Delete Chat");
/*    */   } public void doAction(@NotNull Project project, @NotNull ChatSession session, @NotNull AnActionEvent e) {
/* 13 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullParameter(e, "e"); int sure = Messages.showOkCancelDialog(project, "Do you want to delete current dialog?", "Delete Dialog", 
/* 14 */         "Yes", "No", Messages.getQuestionIcon(), null);
/*    */     
/* 16 */     if (sure == 0) {
/* 17 */       ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       Class<ChatSessionHost> serviceClass$iv = ChatSessionHost.class;
/* 23 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 24 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */       ((ChatSessionHost)object).removeChatSession(session);
/*    */       if ((AIAssistantContainerPanel)e.getDataContext().getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer()) != null) {
/*    */         ((AIAssistantContainerPanel)e.getDataContext().getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer())).goToAllDialogs();
/*    */       } else {
/*    */         (AIAssistantContainerPanel)e.getDataContext().getData(AIAssistantContainerPanel.Companion.getAIAssistantContainer());
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/chat/AIAssistantDeleteChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */