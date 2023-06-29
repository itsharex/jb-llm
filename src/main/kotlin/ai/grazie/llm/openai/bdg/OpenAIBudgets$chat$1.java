package ai.grazie.llm.openai.bdg;

import ai.grazie.model.llm.bdg.chat.LLMChatBudgeting;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenAIBudgets.kt", l = {39}, i = {}, s = {}, n = {}, m = "chat", c = "ai.grazie.llm.openai.bdg.OpenAIBudgets")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class OpenAIBudgets$chat$1 extends ContinuationImpl {
  int label;
  
  OpenAIBudgets$chat$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenAIBudgets.this.chat(null, null, (Continuation<? super LLMChatBudgeting>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/llm/openai/bdg/OpenAIBudgets$chat$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */