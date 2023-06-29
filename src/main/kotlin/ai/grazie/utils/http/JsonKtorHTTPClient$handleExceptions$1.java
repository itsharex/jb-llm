package ai.grazie.utils.http;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JsonKtorHTTPClient.kt", l = {208}, i = {0}, s = {"L$0"}, n = {"request"}, m = "handleExceptions", c = "ai.grazie.utils.http.JsonKtorHTTPClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class JsonKtorHTTPClient$handleExceptions$1<T> extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  JsonKtorHTTPClient$handleExceptions$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JsonKtorHTTPClient.access$handleExceptions(JsonKtorHTTPClient.this, null, null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/http/JsonKtorHTTPClient$handleExceptions$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */