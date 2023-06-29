package ai.grazie.api.gateway.client.api.cloud.gec;

import ai.grazie.gec.model.problem.SentenceWithProblems;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GecAPIClient.kt", l = {37}, i = {}, s = {}, n = {}, m = "problems", c = "ai.grazie.api.gateway.client.api.cloud.gec.GecAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class GecAPIClient$problems$1 extends ContinuationImpl {
  int label;
  
  GecAPIClient$problems$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GecAPIClient.this.problems(null, null, null, (Continuation<? super List<SentenceWithProblems>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/gec/GecAPIClient$problems$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */