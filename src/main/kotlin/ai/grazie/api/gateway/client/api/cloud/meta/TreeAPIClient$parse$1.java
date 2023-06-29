package ai.grazie.api.gateway.client.api.cloud.meta;

import ai.grazie.tree.model.SentenceWithTreeDependencies;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TreeAPIClient.kt", l = {27}, i = {}, s = {}, n = {}, m = "parse", c = "ai.grazie.api.gateway.client.api.cloud.meta.TreeAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class TreeAPIClient$parse$1 extends ContinuationImpl {
  int label;
  
  TreeAPIClient$parse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TreeAPIClient.this.parse(null, null, (Continuation<? super List<SentenceWithTreeDependencies>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/meta/TreeAPIClient$parse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */