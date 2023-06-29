package ai.grazie.model.llm.profile;

import ai.grazie.model.llm.tokens.LLMTokenCounter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMProfileMetadata.kt", l = {32, 23}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "loader", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "tokenCounter", c = "ai.grazie.model.llm.profile.LLMProfileMetadata")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMProfileMetadata$tokenCounter$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  LLMProfileMetadata$tokenCounter$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMProfileMetadata.this.tokenCounter(null, (Continuation<? super LLMTokenCounter>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/LLMProfileMetadata$tokenCounter$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */