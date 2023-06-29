package ai.grazie.model.llm.chat;

import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J+\020\002\032\b\022\004\022\0020\0040\0032\006\020\002\032\0020\0052\n\b\002\020\006\032\004\030\0010\007H¦@ø\001\000¢\006\002\020\bø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lai/grazie/model/llm/chat/SuspendableStreamingChatLLMService;", "", "chat", "Lkotlinx/coroutines/flow/Flow;", "", "Lai/grazie/model/llm/chat/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
public interface SuspendableStreamingChatLLMService {
  @Nullable
  Object chat(@NotNull LLMChat paramLLMChat, @Nullable Attributes paramAttributes, @NotNull Continuation<? super Flow<String>> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/chat/SuspendableStreamingChatLLMService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */