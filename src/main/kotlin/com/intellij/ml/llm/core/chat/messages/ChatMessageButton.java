/*   */ package com.intellij.ml.llm.core.chat.messages;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\002\n\002\b\006\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ChatMessageButton;", "", "text", "", "action", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getText", "()Ljava/lang/String;", "intellij.ml.llm"})
/*   */ public final class ChatMessageButton { @NotNull
/* 3 */   private final String text; public ChatMessageButton(@NotNull String text, @NotNull Function0<Unit> action) { this.text = text; this.action = action; } @NotNull private final Function0<Unit> action; @NotNull public final String getText() { return this.text; } @NotNull public final Function0<Unit> getAction() { return this.action; }
/*   */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/ChatMessageButton.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */