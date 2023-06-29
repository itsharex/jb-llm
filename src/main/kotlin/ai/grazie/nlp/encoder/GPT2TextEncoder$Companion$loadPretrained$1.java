package ai.grazie.nlp.encoder;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GPT2TextEncoder.kt", l = {28, 32}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"loader", "mergesFile", "vocabulary"}, m = "loadPretrained", c = "ai.grazie.nlp.encoder.GPT2TextEncoder$Companion")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class GPT2TextEncoder$Companion$loadPretrained$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  GPT2TextEncoder$Companion$loadPretrained$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GPT2TextEncoder.Companion.this.loadPretrained(null, null, null, (Continuation<? super GPT2TextEncoder>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/GPT2TextEncoder$Companion$loadPretrained$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */