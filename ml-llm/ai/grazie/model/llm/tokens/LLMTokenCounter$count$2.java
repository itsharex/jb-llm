package ai.grazie.model.llm.tokens;

import ai.grazie.model.llm.chat.LLMChatMessage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMTokenCounter.kt", l = {16}, i = {0, 0}, s = {"L$0", "L$2"}, n = {"this", "it"}, m = "count", c = "ai.grazie.model.llm.tokens.LLMTokenCounter")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMTokenCounter$count$2 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int I$0;
  
  int I$1;
  
  int I$2;
  
  int label;
  
  LLMTokenCounter$count$2(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMTokenCounter.this.count((LLMChatMessage[])null, (Continuation<? super Integer>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/tokens/LLMTokenCounter$count$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */