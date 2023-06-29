package com.intellij.ml.llm.python.refactorings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FunctionContextCollector.kt", l = {11, 12}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "function"}, m = "createContextPrompt", c = "com.intellij.ml.llm.python.refactorings.FunctionContextCollector")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class FunctionContextCollector$createContextPrompt$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  FunctionContextCollector$createContextPrompt$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FunctionContextCollector.this.createContextPrompt(null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/FunctionContextCollector$createContextPrompt$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */