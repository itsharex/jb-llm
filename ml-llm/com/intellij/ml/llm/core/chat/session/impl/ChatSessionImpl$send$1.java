package com.intellij.ml.llm.core.chat.session.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ChatSessionImpl.kt", l = {49, 52}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "project", "text", "kind"}, m = "send", c = "com.intellij.ml.llm.core.chat.session.impl.ChatSessionImpl")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class ChatSessionImpl$send$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  ChatSessionImpl$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ChatSessionImpl.this.send(null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/impl/ChatSessionImpl$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */