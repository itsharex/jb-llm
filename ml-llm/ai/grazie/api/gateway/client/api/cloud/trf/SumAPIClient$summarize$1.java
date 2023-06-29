package ai.grazie.api.gateway.client.api.cloud.trf;

import ai.grazie.sum.SentenceWithSummaries;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SumAPIClient.kt", l = {32}, i = {}, s = {}, n = {}, m = "summarize", c = "ai.grazie.api.gateway.client.api.cloud.trf.SumAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SumAPIClient$summarize$1 extends ContinuationImpl {
  int label;
  
  SumAPIClient$summarize$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SumAPIClient.this.summarize(null, null, null, null, (Continuation<? super List<SentenceWithSummaries>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/SumAPIClient$summarize$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */