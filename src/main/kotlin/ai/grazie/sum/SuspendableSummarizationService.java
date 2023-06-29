package ai.grazie.sum;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\bf\030\0002\0020\001JI\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\0032\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\nH¦@ø\001\000¢\006\002\020\fJI\020\r\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\0032\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\nH¦@ø\001\000¢\006\002\020\fø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lai/grazie/sum/SuspendableSummarizationService;", "", "summarize", "", "Lai/grazie/sum/SentenceWithSummaries;", "texts", "", "format", "Lai/grazie/sum/Format;", "minimumBPE", "", "maximumBPE", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "summarizeWithCache", "model-sum"})
public interface SuspendableSummarizationService {
  @Nullable
  Object summarize(@NotNull List<String> paramList, @Nullable Format paramFormat, @Nullable Integer paramInteger1, @Nullable Integer paramInteger2, @NotNull Continuation<? super List<SentenceWithSummaries>> paramContinuation);
  
  @Nullable
  Object summarizeWithCache(@NotNull List<String> paramList, @Nullable Format paramFormat, @Nullable Integer paramInteger1, @Nullable Integer paramInteger2, @NotNull Continuation<? super List<SentenceWithSummaries>> paramContinuation);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/sum/SuspendableSummarizationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */