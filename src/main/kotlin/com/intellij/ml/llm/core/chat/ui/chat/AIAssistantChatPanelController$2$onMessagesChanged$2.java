/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageStateListener;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$2", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "onStateChanged", "", "intellij.ml.llm"})
/*    */ public final class AIAssistantChatPanelController$2$onMessagesChanged$2
/*    */   implements CompletableMessageStateListener
/*    */ {
/*    */   AIAssistantChatPanelController$2$onMessagesChanged$2(CompletableMessage $newMessage, AIAssistantChatMessageView $message) {}
/*    */   
/*    */   public void onStateChanged() {
/* 68 */     if (this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState)
/* 69 */       this.$message.layoutAll(); 
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */