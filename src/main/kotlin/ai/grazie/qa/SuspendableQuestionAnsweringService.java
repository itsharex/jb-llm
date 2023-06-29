package ai.grazie.qa;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\bf\030\0002\0020\001J)\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\005H¦@ø\001\000¢\006\002\020\tø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/qa/SuspendableQuestionAnsweringService;", "", "answer", "Lai/grazie/qa/Answers;", "query", "", "size", "", "dataSource", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-qa"})
public interface SuspendableQuestionAnsweringService {
  @Nullable
  Object answer(@NotNull String paramString1, int paramInt, @NotNull String paramString2, @NotNull Continuation<? super Answers> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/qa/SuspendableQuestionAnsweringService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */