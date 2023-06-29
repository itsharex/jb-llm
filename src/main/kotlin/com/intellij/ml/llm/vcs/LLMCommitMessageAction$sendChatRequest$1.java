package com.intellij.ml.llm.vcs;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMCommitMessageAction.kt", l = {127}, i = {0, 0, 0}, s = {"L$0", "L$1", "I$0"}, n = {"activity", "loggerService", "numberOfFiles"}, m = "sendChatRequest", c = "com.intellij.ml.llm.vcs.LLMCommitMessageAction")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class LLMCommitMessageAction$sendChatRequest$1 extends ContinuationImpl {
  int I$0;
  
  Object L$0;
  
  Object L$1;
  
  int label;
  
  LLMCommitMessageAction$sendChatRequest$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMCommitMessageAction.access$sendChatRequest(LLMCommitMessageAction.this, null, 0, null, null, null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/vcs/LLMCommitMessageAction$sendChatRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */