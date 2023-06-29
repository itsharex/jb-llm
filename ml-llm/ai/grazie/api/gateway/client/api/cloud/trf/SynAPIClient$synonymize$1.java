package ai.grazie.api.gateway.client.api.cloud.trf;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SynAPIClient.kt", l = {30}, i = {}, s = {}, n = {}, m = "synonymize", c = "ai.grazie.api.gateway.client.api.cloud.trf.SynAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SynAPIClient$synonymize$1 extends ContinuationImpl {
  int label;
  
  SynAPIClient$synonymize$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SynAPIClient.this.synonymize(null, null, null, (Continuation<? super List<String>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/trf/SynAPIClient$synonymize$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */