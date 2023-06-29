package ai.grazie.client.ktor;

import ai.grazie.client.common.model.HTTPResponse;
import ai.grazie.client.common.model.RequestOptions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {62}, i = {}, s = {}, n = {}, m = "send", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class GrazieKtorHTTPClient$send$1 extends ContinuationImpl {
  int label;
  
  GrazieKtorHTTPClient$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieKtorHTTPClient.this.send((String)null, (byte[])null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */