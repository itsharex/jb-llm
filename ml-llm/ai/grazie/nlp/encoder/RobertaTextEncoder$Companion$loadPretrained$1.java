package ai.grazie.nlp.encoder;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RobertaTextEncoder.kt", l = {27, 31}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"loader", "mergesFile", "vocabulary"}, m = "loadPretrained", c = "ai.grazie.nlp.encoder.RobertaTextEncoder$Companion")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class RobertaTextEncoder$Companion$loadPretrained$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  RobertaTextEncoder$Companion$loadPretrained$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RobertaTextEncoder.Companion.this.loadPretrained(null, null, null, (Continuation<? super RobertaTextEncoder>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/RobertaTextEncoder$Companion$loadPretrained$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */