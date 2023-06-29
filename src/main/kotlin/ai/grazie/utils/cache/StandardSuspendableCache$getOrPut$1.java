package ai.grazie.utils.cache;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "StandardSuspendableCache.kt", l = {53, 33, 35, 37}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"}, n = {"this", "key", "loader", "$this$withLock_u24default$iv", "this", "key", "loader", "$this$withLock_u24default$iv", "this", "key", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m = "getOrPut", c = "ai.grazie.utils.cache.StandardSuspendableCache")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class StandardSuspendableCache$getOrPut$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  StandardSuspendableCache$getOrPut$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return StandardSuspendableCache.this.getOrPut(null, null, (Continuation<? super Value>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/StandardSuspendableCache$getOrPut$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */