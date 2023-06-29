package ai.grazie.api.gateway.client.api.user;

import ai.grazie.utils.attributes.Attributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AttributeUserAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class AttributeUserAPIClient$store$1 extends ContinuationImpl {
  int label;
  
  AttributeUserAPIClient$store$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AttributeUserAPIClient.store$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Set<? extends Attributes.Key>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/client/api/user/AttributeUserAPIClient$store$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */