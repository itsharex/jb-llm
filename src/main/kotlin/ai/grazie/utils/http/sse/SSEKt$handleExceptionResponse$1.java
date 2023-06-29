package ai.grazie.utils.http.sse;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SSE.kt", l = {97}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"response", "statusCode"}, m = "handleExceptionResponse", c = "ai.grazie.utils.http.sse.SSEKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SSEKt$handleExceptionResponse$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SSEKt$handleExceptionResponse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SSEKt.access$handleExceptionResponse(null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/sse/SSEKt$handleExceptionResponse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */