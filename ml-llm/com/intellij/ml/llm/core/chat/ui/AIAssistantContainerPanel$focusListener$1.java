/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ml.llm.core.chat.session.FocusedChatSessionListener;
/*    */ import javax.swing.JComponent;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$focusListener$1", "Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionListener;", "onFocusChanged", "", "chatSession", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "intellij.ml.llm"})
/*    */ public final class AIAssistantContainerPanel$focusListener$1
/*    */   implements FocusedChatSessionListener
/*    */ {
/*    */   public void onFocusChanged(@NotNull ChatSession chatSession) {
/* 89 */     Intrinsics.checkNotNullParameter(chatSession, "chatSession"); AIAssistantContainerPanel.access$goToPanel(AIAssistantContainerPanel.this, (JComponent)AIAssistantContainerPanel.access$getOrCreateChatPanel(AIAssistantContainerPanel.this, chatSession));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$focusListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */