package com.intellij.ml.llm.core.chat.services;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AIRequestService.kt", l = {41, 42}, i = {0}, s = {"L$0"}, n = {"consumer"}, m = "generateDialogTitle", c = "com.intellij.ml.llm.core.chat.services.AIRequestService")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class AIRequestService$generateDialogTitle$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AIRequestService$generateDialogTitle$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AIRequestService.this.generateDialogTitle(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/services/AIRequestService$generateDialogTitle$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */