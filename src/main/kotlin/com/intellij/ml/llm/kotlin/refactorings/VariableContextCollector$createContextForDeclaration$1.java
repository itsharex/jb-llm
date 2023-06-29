package com.intellij.ml.llm.kotlin.refactorings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "VariableContextCollector.kt", l = {142, 147}, i = {0}, s = {"L$0"}, n = {"project"}, m = "createContextForDeclaration", c = "com.intellij.ml.llm.kotlin.refactorings.VariableContextCollector")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class VariableContextCollector$createContextForDeclaration$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  VariableContextCollector$createContextForDeclaration$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return VariableContextCollector.access$createContextForDeclaration(VariableContextCollector.this, null, null, null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextForDeclaration$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */