package com.intellij.ml.llm.kotlin.refactorings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "VariableContextCollector.kt", l = {17, 19, 31, 34, 35, 38, 40, 42, 44}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"this", "project", "variable", "newVariableName", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "usagesOfPassedVariables", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "usagesOfPassedVariables", "usages", "this", "project", "variable", "newVariableName", "variablesInsideInitializer", "usagesOfPassedVariables", "project", "variable", "variablesInsideInitializer", "usagesOfPassedVariables", "usageContext", "project", "variable", "usagesOfPassedVariables", "usageContext", "declarationContext", "destination$iv$iv", "project", "variable", "usagesOfPassedVariables", "usageContext", "declarationContext", "destination$iv$iv"}, m = "createContextPrompt", c = "com.intellij.ml.llm.kotlin.refactorings.VariableContextCollector")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class VariableContextCollector$createContextPrompt$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  int label;
  
  VariableContextCollector$createContextPrompt$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return VariableContextCollector.this.createContextPrompt(null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */