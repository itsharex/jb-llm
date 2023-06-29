package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {22}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableAttributeAPIClient$get$2 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  SuspendableAttributeAPIClient$get$2(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Double)null, (Continuation<? super Attributes.Value.Double>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/attribute/SuspendableAttributeAPIClient$get$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */