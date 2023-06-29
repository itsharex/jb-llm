package com.intellij.ml.llm.consoleChat;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ConsoleChatAction.kt", l = {53, 56}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"project", "document", "response"}, m = "continueConversation", c = "com.intellij.ml.llm.consoleChat.ConsoleChatAction$Companion")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class ConsoleChatAction$Companion$continueConversation$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  ConsoleChatAction$Companion$continueConversation$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ConsoleChatAction.Companion.this.continueConversation(null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/consoleChat/ConsoleChatAction$Companion$continueConversation$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */