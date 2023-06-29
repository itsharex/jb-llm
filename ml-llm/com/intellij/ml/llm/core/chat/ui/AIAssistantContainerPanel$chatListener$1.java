/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSessionHostListener;
/*    */ import com.intellij.ml.llm.core.chat.ui.chat.AIAssistantChatPanel;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.util.Disposer;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$chatListener$1", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionHostListener;", "chatCreated", "", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "chatRemoved", "intellij.ml.llm"})
/*    */ public final class AIAssistantContainerPanel$chatListener$1
/*    */   implements ChatSessionHostListener
/*    */ {
/*    */   public void chatCreated(@NotNull ChatSession session) {
/* 68 */     Intrinsics.checkNotNullParameter(session, "session");
/*    */   }
/*    */   public void chatRemoved(@NotNull ChatSession session) {
/* 71 */     Intrinsics.checkNotNullParameter(session, "session"); AIAssistantChatPanel chatPanel = (AIAssistantChatPanel)AIAssistantContainerPanel.access$getChatPanelCache$p(AIAssistantContainerPanel.this).remove(session);
/* 72 */     AIAssistantChatPanel it = chatPanel; int $i$a$-let-AIAssistantContainerPanel$chatListener$1$chatRemoved$1 = 0;
/* 73 */     Disposer.dispose((Disposable)it);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantContainerPanel$chatListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */