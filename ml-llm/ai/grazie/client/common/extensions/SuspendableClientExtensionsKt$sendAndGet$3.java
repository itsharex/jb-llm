package ai.grazie.client.common.extensions;

import ai.grazie.client.common.SuspendableHTTPClient;
import ai.grazie.client.common.model.RequestOptions;
import ai.grazie.utils.json.JSON;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableClientExtensions.kt", l = {40}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "json"}, m = "sendAndGet", c = "ai.grazie.client.common.extensions.SuspendableClientExtensionsKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableClientExtensionsKt$sendAndGet$3<O> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SuspendableClientExtensionsKt$sendAndGet$3(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableClientExtensionsKt.sendAndGet((SuspendableHTTPClient)null, (String)null, (KSerializer<?>)null, (RequestOptions)null, (JSON)null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/common/extensions/SuspendableClientExtensionsKt$sendAndGet$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */