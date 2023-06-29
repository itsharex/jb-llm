package ai.grazie.client.common.websocket;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableWebSocketClient.kt", l = {48, 48}, i = {0}, s = {"L$0"}, n = {"body"}, m = "connect", c = "ai.grazie.client.common.websocket.SuspendableWebSocketClient$WithV5")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableWebSocketClient$WithV5$connect$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SuspendableWebSocketClient$WithV5$connect$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableWebSocketClient.WithV5.this.connect(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/websocket/SuspendableWebSocketClient$WithV5$connect$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */