package com.intellij.ml.llm.kotlin.refactorings;

import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "KotlinNameSuggestionContextProvider.kt", l = {21, 22, 25, 26, 26, 27, 28}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "project"}, m = "getContext", c = "com.intellij.ml.llm.kotlin.refactorings.KotlinNameSuggestionContextProvider")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class KotlinNameSuggestionContextProvider$getContext$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  KotlinNameSuggestionContextProvider$getContext$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return KotlinNameSuggestionContextProvider.this.getContext(null, null, (Continuation<? super NameSuggestionContext>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/KotlinNameSuggestionContextProvider$getContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */