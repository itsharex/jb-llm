package ai.grazie.client.common;

import ai.grazie.client.common.model.HTTPResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableHTTPClient.kt", l = {109, 109}, i = {}, s = {}, n = {}, m = "get", c = "ai.grazie.client.common.SuspendableHTTPClient$WithV5")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableHTTPClient$WithV5$get$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SuspendableHTTPClient$WithV5$get$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableHTTPClient.WithV5.this.get(null, null, (Continuation<? super HTTPResponse>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/SuspendableHTTPClient$WithV5$get$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */