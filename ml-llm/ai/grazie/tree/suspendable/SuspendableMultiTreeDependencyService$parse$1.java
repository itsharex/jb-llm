package ai.grazie.tree.suspendable;

import ai.grazie.tree.model.SentenceWithTreeDependencies;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableMultiTreeDependencyService.kt", l = {16}, i = {}, s = {}, n = {}, m = "parse$suspendImpl", c = "ai.grazie.tree.suspendable.SuspendableMultiTreeDependencyService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableMultiTreeDependencyService$parse$1 extends ContinuationImpl {
  int label;
  
  SuspendableMultiTreeDependencyService$parse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableMultiTreeDependencyService.parse$suspendImpl(SuspendableMultiTreeDependencyService.this, null, null, (Continuation<? super SentenceWithTreeDependencies>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService$parse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */