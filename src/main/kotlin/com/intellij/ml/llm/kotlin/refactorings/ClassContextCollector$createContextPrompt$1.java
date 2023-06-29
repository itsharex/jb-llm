package com.intellij.ml.llm.kotlin.refactorings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ClassContextCollector.kt", l = {14, 27, 28}, i = {0, 0, 0, 1, 1, 1, 1, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0"}, n = {"project", "clazz", "namePlaceholder", "project", "clazz", "namePlaceholder", "classCopy", "packageText"}, m = "createContextPrompt", c = "com.intellij.ml.llm.kotlin.refactorings.ClassContextCollector")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class ClassContextCollector$createContextPrompt$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  ClassContextCollector$createContextPrompt$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ClassContextCollector.this.createContextPrompt(null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */