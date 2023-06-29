package com.intellij.ml.llm.core.chat.ui;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "DerivedStateFlow.kt", l = {21}, i = {}, s = {}, n = {}, m = "collect", c = "com.intellij.ml.llm.core.chat.ui.DerivedStateFlow")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class DerivedStateFlow$collect$1 extends ContinuationImpl {
  int label;
  
  DerivedStateFlow$collect$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return DerivedStateFlow.this.collect(null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/DerivedStateFlow$collect$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */