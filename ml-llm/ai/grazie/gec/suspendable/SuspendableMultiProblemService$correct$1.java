package ai.grazie.gec.suspendable;

import ai.grazie.gec.model.problem.SentenceWithProblems;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableMultiProblemService.kt", l = {9}, i = {}, s = {}, n = {}, m = "correct$suspendImpl", c = "ai.grazie.gec.suspendable.SuspendableMultiProblemService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableMultiProblemService$correct$1 extends ContinuationImpl {
  int label;
  
  SuspendableMultiProblemService$correct$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableMultiProblemService.correct$suspendImpl(SuspendableMultiProblemService.this, null, null, (Continuation<? super SentenceWithProblems>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/suspendable/SuspendableMultiProblemService$correct$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */