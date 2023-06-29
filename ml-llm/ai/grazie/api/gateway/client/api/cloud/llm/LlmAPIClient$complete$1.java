package ai.grazie.api.gateway.client.api.cloud.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LlmAPIClient.kt", l = {55}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.cloud.llm.LlmAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LlmAPIClient$complete$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  LlmAPIClient$complete$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LlmAPIClient.this.complete(null, null, null, (Continuation<? super Flow<String>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */