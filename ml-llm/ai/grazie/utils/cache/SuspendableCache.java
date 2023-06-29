package ai.grazie.utils.cache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\006\bf\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002J\021\020\004\032\0020\005H¦@ø\001\000¢\006\002\020\006J\031\020\007\032\0020\b2\006\020\t\032\0028\000H@ø\001\000¢\006\002\020\nJ\033\020\013\032\004\030\0018\0012\006\020\t\032\0028\000H¦@ø\001\000¢\006\002\020\nJ'\020\f\032\0028\0012\006\020\t\032\0028\0002\f\020\r\032\b\022\004\022\0028\0010\016H¦@ø\001\000¢\006\002\020\017J\031\020\020\032\0020\0052\006\020\t\032\0028\000H¦@ø\001\000¢\006\002\020\nJ!\020\021\032\0020\0052\006\020\t\032\0028\0002\006\020\022\032\0028\001H¦@ø\001\000¢\006\002\020\023ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Lai/grazie/utils/cache/SuspendableCache;", "Key", "", "Value", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exists", "", "key", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "getOrPut", "loader", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidate", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
public interface SuspendableCache<Key, Value> {
  @Nullable
  default Object exists(@NotNull Object key, @NotNull Continuation<? super Boolean> $completion) {
    return exists$suspendImpl(this, (Key)key, $completion);
  }
  
  @Nullable
  Object get(@NotNull Key paramKey, @NotNull Continuation<? super Value> paramContinuation);
  
  @Nullable
  Object put(@NotNull Key paramKey, @NotNull Value paramValue, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object invalidate(@NotNull Key paramKey, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object clear(@NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object getOrPut(@NotNull Key paramKey, @NotNull Function0<? extends Value> paramFunction0, @NotNull Continuation<? super Value> paramContinuation);
  
  @DebugMetadata(f = "Caching.kt", l = {16}, i = {}, s = {}, n = {}, m = "exists$suspendImpl", c = "ai.grazie.utils.cache.SuspendableCache")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableCache$exists$1 extends ContinuationImpl {
    int label;
    
    SuspendableCache$exists$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableCache.exists$suspendImpl(SuspendableCache.this, null, (Continuation<? super Boolean>)this);
    }
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/SuspendableCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */