/*     */ package com.intellij.ml.llm.core.chat.ui.list;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*     */ import com.intellij.ml.llm.core.statistics.fus.AIAssistantChatEventLogger;
/*     */ import com.intellij.ui.components.JBList;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$2", "Ljava/awt/event/MouseAdapter;", "mouseClicked", "", "e", "Ljava/awt/event/MouseEvent;", "intellij.ml.llm"})
/*     */ public final class AIAssistantChatListPanel$list$1$2
/*     */   extends MouseAdapter
/*     */ {
/*     */   AIAssistantChatListPanel$list$1$2(JBList<ChatSession> jBList) {}
/*     */   
/*     */   public void mouseClicked(@NotNull MouseEvent e) {
/*  98 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getClickCount() == 2 && e.getButton() == 1) {
/*  99 */       AIAssistantChatListPanel.access$openSelectedChat(AIAssistantChatListPanel.this);
/* 100 */       Intrinsics.checkNotNullExpressionValue(this.$this_apply.getSelectedValue(), "selectedValue"); AIAssistantChatEventLogger.Companion.logChatOpened(AIAssistantChatListPanel.access$getProject$p(AIAssistantChatListPanel.this), (ChatSession)this.$this_apply.getSelectedValue());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$list$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */