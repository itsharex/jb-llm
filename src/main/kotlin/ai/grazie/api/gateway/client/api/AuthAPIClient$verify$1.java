package ai.grazie.api.gateway.client.api;

import ai.grazie.utils.mpp.time.Timestamp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AuthAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "verify", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class AuthAPIClient$verify$1 extends ContinuationImpl {
  int label;
  
  AuthAPIClient$verify$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AuthAPIClient.this.verify((Continuation<? super Timestamp>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */