package com.intellij.ml.llm.refactorings;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LlmNameProvider.kt", l = {41, 42, 43, 51, 56}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "I$0"}, n = {"project", "element", "prefix", "statistic", "project", "element", "prefix", "statistic", "originalName", "project", "element", "prefix", "statistic", "originalName", "virtualFile", "project", "prefix", "statistic", "originalName", "virtualFile", "textOffset", "originalName", "virtualFile", "textOffset"}, m = "suggestNames", c = "com.intellij.ml.llm.refactorings.LlmNameProviderKt")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class LlmNameProviderKt$suggestNames$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int I$0;
  
  int label;
  
  LlmNameProviderKt$suggestNames$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LlmNameProviderKt.suggestNames(null, null, null, null, (Continuation<? super List<String>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmNameProviderKt$suggestNames$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */