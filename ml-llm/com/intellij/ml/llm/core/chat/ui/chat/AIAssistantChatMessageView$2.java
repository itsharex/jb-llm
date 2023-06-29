/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.core.chat.messages.ChatMessageButton;
/*     */ import com.intellij.ml.llm.core.chat.messages.CompletableMessageButtonListener;
/*     */ import com.intellij.openapi.observable.util.RevertOnDisposeUtilKt;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import javax.swing.JButton;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$2", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageButtonListener;", "onButtonsChanged", "", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nAIAssistantChatMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatMessageView.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n1855#2,2:364\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatMessageView.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$2\n*L\n105#1:364,2\n*E\n"})
/*     */ public final class null
/*     */   implements CompletableMessageButtonListener
/*     */ {
/*     */   public void onButtonsChanged() {
/* 103 */     AIAssistantChatMessageView.access$getButtonsContainer$p(AIAssistantChatMessageView.this).removeAll();
/*     */     
/* 105 */     List list = AIAssistantChatMessageView.access$getCompletableMessage$p(AIAssistantChatMessageView.this).getButtons(); AIAssistantChatMessageView aIAssistantChatMessageView = AIAssistantChatMessageView.this; int $i$f$forEach = 0;
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
/* 364 */     Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ChatMessageButton messageButton = (ChatMessageButton)element$iv; int $i$a$-forEach-AIAssistantChatMessageView$2$onButtonsChanged$1 = 0;
/*     */       JButton button = new JButton(messageButton.getText());
/*     */       RevertOnDisposeUtilKt.addComponent$default(AIAssistantChatMessageView.access$getButtonsContainer$p(aIAssistantChatMessageView), button, null, 2, null);
/*     */       button.addActionListener(messageButton::onButtonsChanged$lambda$1$lambda$0); }
/*     */     
/*     */     AIAssistantChatMessageView.access$getButtonsContainer$p(AIAssistantChatMessageView.this).setVisible(!AIAssistantChatMessageView.access$getCompletableMessage$p(AIAssistantChatMessageView.this).getButtons().isEmpty());
/*     */     AIAssistantChatMessageView.access$getButtonsContainer$p(AIAssistantChatMessageView.this).revalidate();
/*     */     AIAssistantChatMessageView.access$getButtonsContainer$p(AIAssistantChatMessageView.this).repaint();
/*     */   }
/*     */   
/*     */   private static final void onButtonsChanged$lambda$1$lambda$0(ChatMessageButton $messageButton, ActionEvent it) {
/*     */     Intrinsics.checkNotNullParameter($messageButton, "$messageButton");
/*     */     $messageButton.getAction().invoke();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageView$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */