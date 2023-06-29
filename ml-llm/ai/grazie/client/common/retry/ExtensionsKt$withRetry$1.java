package ai.grazie.client.common.retry;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Extensions.kt", l = {21}, i = {0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, n = {"$this$withRetry", "strategy", "on", "block", "total", "retry"}, m = "withRetry", c = "ai.grazie.client.common.retry.ExtensionsKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class ExtensionsKt$withRetry$1<T> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  ExtensionsKt$withRetry$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExtensionsKt.withRetry(null, 0, null, null, null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/retry/ExtensionsKt$withRetry$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */