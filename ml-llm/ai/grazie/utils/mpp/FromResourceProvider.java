package ai.grazie.utils.mpp;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\000*\004\b\000\020\0012\0020\002J\031\020\003\032\0028\0002\006\020\004\032\0020\005H¦@ø\001\000¢\006\002\020\006ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/utils/mpp/FromResourceProvider;", "T", "", "load", "loader", "Lai/grazie/utils/mpp/RootDataLoader;", "(Lai/grazie/utils/mpp/RootDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
public interface FromResourceProvider<T> {
  @Nullable
  Object load(@NotNull RootDataLoader paramRootDataLoader, @NotNull Continuation<? super T> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/FromResourceProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */