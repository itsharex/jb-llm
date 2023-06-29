/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageTextListener;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$1", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageTextListener;", "onTextChanged", "", "delta", "", "intellij.ml.llm"})
/*    */ public final class AIAssistantChatPanelController$2$onMessagesChanged$1
/*    */   implements CompletableMessageTextListener
/*    */ {
/*    */   AIAssistantChatPanelController$2$onMessagesChanged$1(AIAssistantChatPanelController $receiver) {}
/*    */   
/*    */   public void onTextChanged(@NotNull String delta) {
/* 61 */     Intrinsics.checkNotNullParameter(delta, "delta"); this.$message.addToLastPart(delta);
/* 62 */     AIAssistantChatPanelController.access$getView$p(AIAssistantChatPanelController.this).scrollToEndIfNeeded();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanelController$2$onMessagesChanged$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */