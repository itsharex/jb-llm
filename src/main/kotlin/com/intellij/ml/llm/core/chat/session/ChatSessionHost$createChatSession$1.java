package com.intellij.ml.llm.core.chat.session;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ChatSessionHost.kt", l = {25}, i = {0}, s = {"L$0"}, n = {"session"}, m = "createChatSession", c = "com.intellij.ml.llm.core.chat.session.ChatSessionHost")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class ChatSessionHost$createChatSession$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  ChatSessionHost$createChatSession$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ChatSessionHost.this.createChatSession(null, (Continuation<? super ChatSession>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionHost$createChatSession$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */