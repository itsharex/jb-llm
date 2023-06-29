package com.intellij.ml.llm.java.refactorings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JavaNameSuggestionContextProvider.kt", l = {27, 28, 30}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "project", "name"}, m = "isNameAlreadyUsed", c = "com.intellij.ml.llm.java.refactorings.JavaNameSuggestionContextProvider")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class JavaNameSuggestionContextProvider$isNameAlreadyUsed$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  JavaNameSuggestionContextProvider$isNameAlreadyUsed$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JavaNameSuggestionContextProvider.this.isNameAlreadyUsed(null, null, null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */