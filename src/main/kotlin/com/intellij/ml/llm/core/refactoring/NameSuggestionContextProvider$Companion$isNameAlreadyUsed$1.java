package com.intellij.ml.llm.core.refactoring;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NameSuggestionContextProvider.kt", l = {39}, i = {}, s = {}, n = {}, m = "isNameAlreadyUsed", c = "com.intellij.ml.llm.core.refactoring.NameSuggestionContextProvider$Companion")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1 extends ContinuationImpl {
  int label;
  
  NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NameSuggestionContextProvider.Companion.this.isNameAlreadyUsed(null, null, null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/refactoring/NameSuggestionContextProvider$Companion$isNameAlreadyUsed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */