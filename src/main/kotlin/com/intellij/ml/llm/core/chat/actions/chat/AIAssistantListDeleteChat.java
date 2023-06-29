/*    */ package com.intellij.ml.llm.core.chat.actions.chat;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionHost;
/*    */ import com.intellij.ml.llm.core.chat.ui.list.AIAssistantChatListPanel;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/chat/AIAssistantListDeleteChat;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantListDeleteChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantListDeleteChat.kt\ncom/intellij/ml/llm/core/chat/actions/chat/AIAssistantListDeleteChat\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,19:1\n29#2,3:20\n*S KotlinDebug\n*F\n+ 1 AIAssistantListDeleteChat.kt\ncom/intellij/ml/llm/core/chat/actions/chat/AIAssistantListDeleteChat\n*L\n16#1:20,3\n*E\n"})
/*    */ public final class AIAssistantListDeleteChat extends DumbAwareAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Object object1;
/* 15 */     Intrinsics.checkNotNullParameter(e, "e"); Object object3 = e.getDataContext().getData(PlatformDataKeys.CONTEXT_COMPONENT); (object3 instanceof com.intellij.ui.components.JBList) ? object3 : null; Object object2 = (((object3 instanceof com.intellij.ui.components.JBList) ? object3 : null) != null) ? ((object3 instanceof com.intellij.ui.components.JBList) ? object3 : null).getSelectedValue() : null; if (((object2 instanceof ChatSession) ? object2 : null) == null) { (object2 instanceof ChatSession) ? object2 : null; return; }
/* 16 */      if (e.getProject() != null) { ComponentManager $this$service$iv = (ComponentManager)e.getProject(); int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */       
/* 20 */       Class<ChatSessionHost> serviceClass$iv = ChatSessionHost.class;
/* 21 */       Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 22 */             "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */       ((ChatSessionHost)object).removeChatSession((ChatSession)object1); }
/*    */     else
/*    */     { e.getProject(); }
/*    */     
/*    */     if ((AIAssistantChatListPanel)AIAssistantChatListPanel.Companion.getChatList().getData(e.getDataContext()) != null) {
/*    */       ((AIAssistantChatListPanel)AIAssistantChatListPanel.Companion.getChatList().getData(e.getDataContext())).removeChat((ChatSession)object1);
/*    */     } else {
/*    */       (AIAssistantChatListPanel)AIAssistantChatListPanel.Companion.getChatList().getData(e.getDataContext());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/chat/AIAssistantListDeleteChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */