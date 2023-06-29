package ai.grazie.api.gateway.client.api.cloud.meta;

import ai.grazie.qa.Answers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "QaAPIClient.kt", l = {27}, i = {}, s = {}, n = {}, m = "answer", c = "ai.grazie.api.gateway.client.api.cloud.meta.QaAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class QaAPIClient$answer$1 extends ContinuationImpl {
  int label;
  
  QaAPIClient$answer$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return QaAPIClient.this.answer(null, 0, null, (Continuation<? super Answers>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/meta/QaAPIClient$answer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */