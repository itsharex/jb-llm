package com.intellij.ml.llm.core.chat.session;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bf\030\0002\0020\001:\003\002\003\004ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;", "", "AIAssistantTool", "CustomIntention", "Restored", "intellij.ml.llm"})
public interface ChatOrigin {
  @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatOrigin$AIAssistantTool;", "Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;", "()V", "intellij.ml.llm"})
  public static final class AIAssistantTool implements ChatOrigin {
    @NotNull
    public static final AIAssistantTool INSTANCE = new AIAssistantTool();
  }
  
  @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatOrigin$CustomIntention;", "Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;", "()V", "intellij.ml.llm"})
  public static final class CustomIntention implements ChatOrigin {
    @NotNull
    public static final CustomIntention INSTANCE = new CustomIntention();
  }
  
  @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatOrigin$Restored;", "Lcom/intellij/ml/llm/core/chat/session/ChatOrigin;", "()V", "intellij.ml.llm"})
  public static final class Restored implements ChatOrigin {
    @NotNull
    public static final Restored INSTANCE = new Restored();
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatOrigin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */