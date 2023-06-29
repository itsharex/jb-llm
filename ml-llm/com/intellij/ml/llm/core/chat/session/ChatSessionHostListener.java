package com.intellij.ml.llm.core.chat.session;

import java.util.EventListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionHostListener;", "Ljava/util/EventListener;", "chatCreated", "", "session", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "chatRemoved", "intellij.ml.llm"})
public interface ChatSessionHostListener extends EventListener {
  void chatCreated(@NotNull ChatSession paramChatSession);
  
  void chatRemoved(@NotNull ChatSession paramChatSession);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionHostListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */