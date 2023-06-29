package ai.grazie.client.ktor;

import ai.grazie.model.cloud.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {77}, i = {}, s = {}, n = {}, m = "receiveContinuousSSE", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class GrazieKtorHTTPClient$receiveContinuousSSE$1 extends ContinuationImpl {
  int label;
  
  GrazieKtorHTTPClient$receiveContinuousSSE$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieKtorHTTPClient.this.receiveContinuousSSE(null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */