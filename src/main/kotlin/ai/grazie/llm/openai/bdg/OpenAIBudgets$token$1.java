package ai.grazie.llm.openai.bdg;

import ai.grazie.model.llm.bdg.token.LLMPerTokenBudgeting;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenAIBudgets.kt", l = {22}, i = {0}, s = {"L$0"}, n = {"pricing"}, m = "token", c = "ai.grazie.llm.openai.bdg.OpenAIBudgets")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class OpenAIBudgets$token$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  OpenAIBudgets$token$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenAIBudgets.this.token(null, null, (Continuation<? super LLMPerTokenBudgeting>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/llm/openai/bdg/OpenAIBudgets$token$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */