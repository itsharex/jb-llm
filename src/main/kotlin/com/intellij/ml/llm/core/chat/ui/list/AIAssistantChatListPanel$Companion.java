/*    */ package com.intellij.ml.llm.core.chat.ui.list;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.session.ChatSession;
/*    */ import com.intellij.openapi.actionSystem.DataKey;
/*    */ import com.intellij.openapi.util.Key;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\tR$\020\n\032\025\022\f\022\n \006*\004\030\0010\f0\f0\013¢\006\002\b\007¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$Companion;", "", "()V", "ChatList", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getChatList", "()Lcom/intellij/openapi/actionSystem/DataKey;", "SelectedElementKey", "Lcom/intellij/openapi/util/Key;", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "getSelectedElementKey", "()Lcom/intellij/openapi/util/Key;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final DataKey<AIAssistantChatListPanel> getChatList() {
/* 36 */     return AIAssistantChatListPanel.access$getChatList$cp(); } @NotNull
/* 37 */   public final Key<ChatSession> getSelectedElementKey() { return AIAssistantChatListPanel.access$getSelectedElementKey$cp(); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/list/AIAssistantChatListPanel$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */