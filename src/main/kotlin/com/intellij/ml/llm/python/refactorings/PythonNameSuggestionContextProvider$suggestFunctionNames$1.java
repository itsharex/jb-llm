package com.intellij.ml.llm.python.refactorings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "PythonNameSuggestionContextProvider.kt", l = {49, 54}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "function", "newMethodName"}, m = "suggestFunctionNames", c = "com.intellij.ml.llm.python.refactorings.PythonNameSuggestionContextProvider")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class PythonNameSuggestionContextProvider$suggestFunctionNames$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  PythonNameSuggestionContextProvider$suggestFunctionNames$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return PythonNameSuggestionContextProvider.access$suggestFunctionNames(PythonNameSuggestionContextProvider.this, null, null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestFunctionNames$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */