/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\006\b\007\030\0002\0020\001B\005¢\006\002\020\002J\016\020\b\032\0020\t2\006\020\n\032\0020\007J\016\020\013\032\0020\t2\006\020\f\032\0020\004J\b\020\r\032\004\030\0010\004J\016\020\016\032\0020\t2\006\020\n\032\0020\007R\020\020\003\032\004\030\0010\004X\016¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionHost;", "", "()V", "focusedChatSession", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "listeners", "", "Lcom/intellij/ml/llm/core/chat/session/FocusedChatSessionListener;", "addListener", "", "listener", "focusChatSession", "chatSession", "getFocusedChatSession", "removeListener", "intellij.ml.llm"})
/*    */ public final class FocusedChatSessionHost {
/*    */   @NotNull
/* 10 */   private final List<FocusedChatSessionListener> listeners = new ArrayList<>(); @Nullable
/*    */   private ChatSession focusedChatSession; @Nullable
/*    */   public final ChatSession getFocusedChatSession() {
/* 13 */     return this.focusedChatSession;
/*    */   }
/*    */   
/*    */   public final void focusChatSession(@NotNull ChatSession chatSession) {
/* 17 */     Intrinsics.checkNotNullParameter(chatSession, "chatSession"); this.focusedChatSession = chatSession;
/* 18 */     for (FocusedChatSessionListener listener : this.listeners)
/* 19 */       listener.onFocusChanged(chatSession); 
/*    */   }
/*    */   
/*    */   public final void addListener(@NotNull FocusedChatSessionListener listener) {
/* 23 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.add(listener);
/*    */   }
/*    */   
/*    */   public final void removeListener(@NotNull FocusedChatSessionListener listener) {
/* 27 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.remove(listener);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/FocusedChatSessionHost.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */