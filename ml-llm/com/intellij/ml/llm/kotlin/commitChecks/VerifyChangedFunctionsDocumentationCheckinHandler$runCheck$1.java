package com.intellij.ml.llm.kotlin.commitChecks;

import com.intellij.openapi.vcs.checkin.CommitProblem;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "VerifyChangedFunctionsDocumentationCheckinHandler.kt", l = {64}, i = {}, s = {}, n = {}, m = "runCheck", c = "com.intellij.ml.llm.kotlin.commitChecks.VerifyChangedFunctionsDocumentationCheckinHandler")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1 extends ContinuationImpl {
  int label;
  
  VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return VerifyChangedFunctionsDocumentationCheckinHandler.this.runCheck(null, (Continuation<? super CommitProblem>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */