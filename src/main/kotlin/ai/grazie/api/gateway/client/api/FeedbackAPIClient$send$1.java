package ai.grazie.api.gateway.client.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FeedbackAPIClient.kt", l = {24}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.api.gateway.client.api.FeedbackAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class FeedbackAPIClient$send$1 extends ContinuationImpl {
  int label;
  
  FeedbackAPIClient$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FeedbackAPIClient.this.send(null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/FeedbackAPIClient$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */