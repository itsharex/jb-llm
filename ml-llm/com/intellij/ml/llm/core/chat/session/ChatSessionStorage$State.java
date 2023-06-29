/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\005\030\0002\0020\001B\005¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$State;", "", "()V", "chats", "", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChat;", "getChats", "()Ljava/util/List;", "setChats", "(Ljava/util/List;)V", "currentChatIndex", "", "getCurrentChatIndex", "()I", "setCurrentChatIndex", "(I)V", "intellij.ml.llm"})
/*    */ public final class State
/*    */ {
/*    */   private int currentChatIndex;
/*    */   @NotNull
/* 54 */   private List<ChatSessionStorage.SerializedChat> chats = new ArrayList<>(); @NotNull public final List<ChatSessionStorage.SerializedChat> getChats() { return this.chats; } public final void setChats(@NotNull List<ChatSessionStorage.SerializedChat> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.chats = <set-?>; }
/* 55 */   public final int getCurrentChatIndex() { return this.currentChatIndex; } public final void setCurrentChatIndex(int <set-?>) { this.currentChatIndex = <set-?>; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage$State.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */