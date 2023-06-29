package ai.grazie.nlp.encoder.tiktoken.cl100k;

import ai.grazie.nlp.encoder.TiktokenEncoder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TiktokenCL100KBaseEncoder.kt", l = {20}, i = {}, s = {}, n = {}, m = "load", c = "ai.grazie.nlp.encoder.tiktoken.cl100k.TiktokenCL100KBaseEncoder$Companion")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class TiktokenCL100KBaseEncoder$Companion$load$1 extends ContinuationImpl {
  int label;
  
  TiktokenCL100KBaseEncoder$Companion$load$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TiktokenCL100KBaseEncoder.Companion.this.load(null, (Continuation<? super TiktokenEncoder>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/tiktoken/cl100k/TiktokenCL100KBaseEncoder$Companion$load$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */