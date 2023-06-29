/*    */ package com.intellij.ml.llm.core.chat.actions.message;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanelController;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\b\020\007\032\0020\bH\026J\020\020\t\032\0020\0042\006\020\005\032\0020\006H\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantEditMessageAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "intellij.ml.llm"})
/*    */ public final class AIAssistantEditMessageAction extends DumbAwareAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     AIAssistantChatPanelController controller;
/*    */     CompletableMessage message;
/* 14 */     Intrinsics.checkNotNullParameter(e, "e"); if ((AIAssistantChatPanelController)AIAssistantChatPanelController.Companion.getKey().getData(e.getDataContext()) == null) { (AIAssistantChatPanelController)AIAssistantChatPanelController.Companion.getKey().getData(e.getDataContext()); return; }
/* 15 */      if ((CompletableMessage)CompletableMessage.Companion.getKey().getData(e.getDataContext()) == null) { (CompletableMessage)CompletableMessage.Companion.getKey().getData(e.getDataContext()); return; }
/* 16 */      controller.startEditMessage(message);
/*    */   }
/*    */ 
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'e'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: getstatic com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel.Companion : Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$Companion;
/*    */     //   9: invokevirtual getCurrentDialogKey : ()Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   12: aload_1
/*    */     //   13: invokevirtual getDataContext : ()Lcom/intellij/openapi/actionSystem/DataContext;
/*    */     //   16: invokevirtual getData : (Lcom/intellij/openapi/actionSystem/DataContext;)Ljava/lang/Object;
/*    */     //   19: checkcast com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel
/*    */     //   22: astore_2
/*    */     //   23: getstatic com/intellij/ml/llm/core/chat/session/ChatSession.Companion : Lcom/intellij/ml/llm/core/chat/session/ChatSession$Companion;
/*    */     //   26: invokevirtual getCurrentSession : ()Lcom/intellij/openapi/actionSystem/DataKey;
/*    */     //   29: aload_1
/*    */     //   30: invokevirtual getDataContext : ()Lcom/intellij/openapi/actionSystem/DataContext;
/*    */     //   33: invokevirtual getData : (Lcom/intellij/openapi/actionSystem/DataContext;)Ljava/lang/Object;
/*    */     //   36: checkcast com/intellij/ml/llm/core/chat/session/ChatSession
/*    */     //   39: astore_3
/*    */     //   40: aload_1
/*    */     //   41: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*    */     //   44: aload_2
/*    */     //   45: ifnull -> 56
/*    */     //   48: aload_3
/*    */     //   49: ifnull -> 56
/*    */     //   52: iconst_1
/*    */     //   53: goto -> 57
/*    */     //   56: iconst_0
/*    */     //   57: invokevirtual setVisible : (Z)V
/*    */     //   60: aload_1
/*    */     //   61: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*    */     //   64: aload_1
/*    */     //   65: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*    */     //   68: invokevirtual isVisible : ()Z
/*    */     //   71: ifeq -> 99
/*    */     //   74: aload_3
/*    */     //   75: dup
/*    */     //   76: ifnull -> 87
/*    */     //   79: invokeinterface getState : ()Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
/*    */     //   84: goto -> 89
/*    */     //   87: pop
/*    */     //   88: aconst_null
/*    */     //   89: getstatic com/intellij/ml/llm/core/chat/session/ChatSessionState.Busy : Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;
/*    */     //   92: if_acmpeq -> 99
/*    */     //   95: iconst_1
/*    */     //   96: goto -> 100
/*    */     //   99: iconst_0
/*    */     //   100: invokevirtual setEnabled : (Z)V
/*    */     //   103: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 6
/*    */     //   #21	-> 23
/*    */     //   #22	-> 40
/*    */     //   #23	-> 60
/*    */     //   #24	-> 103
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   23	81	2	chatPanel	Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel;
/*    */     //   40	64	3	session	Lcom/intellij/ml/llm/core/chat/session/ChatSession;
/*    */     //   0	104	0	this	Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantEditMessageAction;
/*    */     //   0	104	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 26 */     return ActionUpdateThread.EDT;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/message/AIAssistantEditMessageAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */