package ai.grazie.api.gateway.client.api.cloud.gec;

import ai.grazie.gec.model.SentenceWithCorrections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GecAPIClient.kt", l = {37}, i = {}, s = {}, n = {}, m = "correct", c = "ai.grazie.api.gateway.client.api.cloud.gec.GecAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class GecAPIClient$correct$1 extends ContinuationImpl {
  int label;
  
  GecAPIClient$correct$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GecAPIClient.this.correct(null, null, null, (Continuation<? super List<SentenceWithCorrections>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/gec/GecAPIClient$correct$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */