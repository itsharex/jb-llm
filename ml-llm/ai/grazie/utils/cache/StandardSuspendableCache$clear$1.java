package ai.grazie.utils.cache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "StandardSuspendableCache.kt", l = {53}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv"}, m = "clear", c = "ai.grazie.utils.cache.StandardSuspendableCache")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class StandardSuspendableCache$clear$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  StandardSuspendableCache$clear$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return StandardSuspendableCache.this.clear((Continuation<? super Unit>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/StandardSuspendableCache$clear$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */