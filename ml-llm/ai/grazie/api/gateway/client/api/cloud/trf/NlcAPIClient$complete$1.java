package ai.grazie.api.gateway.client.api.cloud.trf;

import ai.grazie.nlc.SentenceWithCompletions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NlcAPIClient.kt", l = {30}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"context", "prefix"}, m = "complete", c = "ai.grazie.api.gateway.client.api.cloud.trf.NlcAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class NlcAPIClient$complete$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  NlcAPIClient$complete$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NlcAPIClient.this.complete(null, null, null, null, (Continuation<? super SentenceWithCompletions>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/NlcAPIClient$complete$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */