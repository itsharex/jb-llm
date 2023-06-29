package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Coroutines.kt", l = {9}, i = {}, s = {}, n = {}, m = "toText", c = "ai.grazie.utils.CoroutinesKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class CoroutinesKt$toText$1 extends ContinuationImpl {
  int label;
  
  CoroutinesKt$toText$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CoroutinesKt.toText(null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/CoroutinesKt$toText$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */