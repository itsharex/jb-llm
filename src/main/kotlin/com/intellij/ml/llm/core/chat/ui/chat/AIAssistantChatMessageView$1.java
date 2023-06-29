/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageStateListener;
/*    */ import com.intellij.ml.llm.core.chat.messages.MessageState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$1", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "onStateChanged", "", "intellij.ml.llm"})
/*    */ public final class null
/*    */   implements CompletableMessageStateListener
/*    */ {
/*    */   null(Ref.ObjectRef<MessageState> $previousState) {}
/*    */   
/*    */   public void onStateChanged() {
/* 82 */     MessageState newState = AIAssistantChatMessageView.access$getCompletableMessage$p(AIAssistantChatMessageView.this).getState();
/* 83 */     if (Intrinsics.areEqual(this.$previousState.element, newState))
/* 84 */       return;  AIAssistantChatMessageView.access$updateMessageState(AIAssistantChatMessageView.this, (MessageState)this.$previousState.element, newState);
/* 85 */     this.$previousState.element = newState;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */