package ai.grazie.model.llm.completion;

import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J+\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0042\n\b\002\020\006\032\004\030\0010\007H¦@ø\001\000¢\006\002\020\bø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lai/grazie/model/llm/completion/SuspendableStreamingCompletionLLMService;", "", "complete", "Lkotlinx/coroutines/flow/Flow;", "", "prompt", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
public interface SuspendableStreamingCompletionLLMService {
  @Nullable
  Object complete(@NotNull String paramString, @Nullable Attributes paramAttributes, @NotNull Continuation<? super Flow<String>> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/completion/SuspendableStreamingCompletionLLMService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */