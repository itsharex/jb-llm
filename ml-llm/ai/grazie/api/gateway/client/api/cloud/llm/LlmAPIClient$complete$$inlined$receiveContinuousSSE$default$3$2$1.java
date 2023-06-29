package ai.grazie.api.gateway.client.api.cloud.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
@DebugMetadata(f = "LlmAPIClient.kt", l = {223}, i = {}, s = {}, n = {}, m = "emit", c = "ai.grazie.api.gateway.client.api.cloud.llm.LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$3$2")
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
public final class null extends ContinuationImpl {
  int label;
  
  Object L$0;
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$3.null.this.emit(null, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/cloud/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$3$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */