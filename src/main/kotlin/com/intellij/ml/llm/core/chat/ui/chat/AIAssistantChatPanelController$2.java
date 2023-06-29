/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageStateListener;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageTextListener;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionMessageListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionMessageListener;", "onMessagesChanged", "", "newMessage", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "intellij.ml.llm"})
/*    */ public final class null
/*    */   implements ChatSessionMessageListener
/*    */ {
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$1", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageTextListener;", "onTextChanged", "", "delta", "", "intellij.ml.llm"})
/*    */   public static final class AIAssistantChatPanelController$2$onMessagesChanged$1
/*    */     implements CompletableMessageTextListener
/*    */   {
/*    */     AIAssistantChatPanelController$2$onMessagesChanged$1(AIAssistantChatPanelController $receiver) {}
/*    */     
/*    */     public void onTextChanged(@NotNull String delta) {
/*    */       Intrinsics.checkNotNullParameter(delta, "delta");
/*    */       this.$message.addToLastPart(delta);
/*    */       AIAssistantChatPanelController.access$getView$p(AIAssistantChatPanelController.this).scrollToEndIfNeeded();
/*    */     }
/*    */   }
/*    */   
/*    */   public void onMessagesChanged(@NotNull CompletableMessage newMessage) {
/* 51 */     Intrinsics.checkNotNullParameter(newMessage, "newMessage"); if (newMessage.getAuthor() == ChatMessageAuthor.User) {
/* 52 */       AIAssistantChatPanelController.access$getView$p(AIAssistantChatPanelController.this).addUserRequest(newMessage);
/*    */       
/*    */       return;
/*    */     } 
/* 56 */     AIAssistantChatPanelController.access$setLastCompletableMessage$p(AIAssistantChatPanelController.this, newMessage);
/* 57 */     AIAssistantChatMessageView message = AIAssistantChatPanelController.access$getView$p(AIAssistantChatPanelController.this).addAIResponse(newMessage);
/*    */     
/* 59 */     newMessage.addTextListener(new AIAssistantChatPanelController$2$onMessagesChanged$1(AIAssistantChatPanelController.this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 66 */     newMessage.addStateListener(new AIAssistantChatPanelController$2$onMessagesChanged$2(newMessage, message)); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$2", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "onStateChanged", "", "intellij.ml.llm"})
/*    */   public static final class AIAssistantChatPanelController$2$onMessagesChanged$2 implements CompletableMessageStateListener { public void onStateChanged() {
/* 68 */       if (this.$newMessage.getState() instanceof com.intellij.ml.llm.core.chat.messages.CompletedState)
/* 69 */         this.$message.layoutAll(); 
/*    */     }
/*    */     
/*    */     AIAssistantChatPanelController$2$onMessagesChanged$2(CompletableMessage $newMessage, AIAssistantChatMessageView $message) {} }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */