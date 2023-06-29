package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\000\n\002\b\003\bf\030\000*\006\b\000\020\001 \0012\0020\002J\021\020\003\032\0028\000H¦Bø\001\000¢\006\002\020\004ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Lai/grazie/utils/SuspendLazy;", "T", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
public interface SuspendLazy<T> {
  @Nullable
  Object invoke(@NotNull Continuation<? super T> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/SuspendLazy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */