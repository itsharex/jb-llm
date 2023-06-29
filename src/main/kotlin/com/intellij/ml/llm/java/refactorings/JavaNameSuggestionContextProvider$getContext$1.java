package com.intellij.ml.llm.java.refactorings;

import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JavaNameSuggestionContextProvider.kt", l = {14, 15, 18, 19, 20}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "project"}, m = "getContext", c = "com.intellij.ml.llm.java.refactorings.JavaNameSuggestionContextProvider")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class JavaNameSuggestionContextProvider$getContext$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  JavaNameSuggestionContextProvider$getContext$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JavaNameSuggestionContextProvider.this.getContext(null, null, (Continuation<? super NameSuggestionContext>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$getContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */