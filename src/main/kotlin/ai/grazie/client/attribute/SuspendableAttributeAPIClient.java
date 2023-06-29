package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\033\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H@ø\001\000¢\006\002\020\006J\033\020\002\032\004\030\0010\0072\006\020\004\032\0020\bH@ø\001\000¢\006\002\020\tJ\033\020\002\032\004\030\0010\n2\006\020\004\032\0020\013H@ø\001\000¢\006\002\020\fJ\033\020\002\032\004\030\0010\r2\006\020\004\032\0020\016H@ø\001\000¢\006\002\020\017J\037\020\002\032\0020\0202\f\020\021\032\b\022\004\022\0020\0230\022H¦@ø\001\000¢\006\002\020\024J\037\020\025\032\b\022\004\022\0020\0230\0222\006\020\026\032\0020\020H¦@ø\001\000¢\006\002\020\027J!\020\025\032\0020\0052\006\020\004\032\0020\0052\006\020\030\032\0020\003H@ø\001\000¢\006\002\020\031J!\020\025\032\0020\b2\006\020\004\032\0020\b2\006\020\030\032\0020\007H@ø\001\000¢\006\002\020\032J!\020\025\032\0020\0132\006\020\004\032\0020\0132\006\020\030\032\0020\nH@ø\001\000¢\006\002\020\033J!\020\025\032\0020\0162\006\020\004\032\0020\0162\006\020\030\032\0020\rH@ø\001\000¢\006\002\020\034J!\020\035\032\0020\0232\006\020\004\032\0020\0232\006\020\030\032\0020\036H@ø\001\000¢\006\002\020\037ø\001\001\002\n\n\002\b\031\n\004\b!0\001¨\006 À\006\001"}, d2 = {"Lai/grazie/client/attribute/SuspendableAttributeAPIClient;", "", "get", "Lai/grazie/utils/attributes/Attributes$Value$Double;", "key", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "(Lai/grazie/utils/attributes/Attributes$Key$Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Json;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "(Lai/grazie/utils/attributes/Attributes$Key$Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "(Lai/grazie/utils/attributes/Attributes$Key$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/utils/attributes/Attributes;", "keys", "", "Lai/grazie/utils/attributes/Attributes$Key;", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "store", "attrs", "(Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "(Lai/grazie/utils/attributes/Attributes$Key$Double;Lai/grazie/utils/attributes/Attributes$Value$Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;Lai/grazie/utils/attributes/Attributes$Value$Json;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Long;Lai/grazie/utils/attributes/Attributes$Value$Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lai/grazie/utils/attributes/Attributes$Key$Text;Lai/grazie/utils/attributes/Attributes$Value$Text;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeUnsafe", "Lai/grazie/utils/attributes/Attributes$Value;", "(Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-attribute"})
public interface SuspendableAttributeAPIClient {
  @Nullable
  default Object store(@NotNull Attributes.Key.Long key, @NotNull Attributes.Value.Long value, @NotNull Continuation<? super Attributes.Key.Long> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Double key, @NotNull Attributes.Value.Double value, @NotNull Continuation<? super Attributes.Key.Double> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Text key, @NotNull Attributes.Value.Text value, @NotNull Continuation<? super Attributes.Key.Text> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object store(@NotNull Attributes.Key.Json key, @NotNull Attributes.Value.Json value, @NotNull Continuation<? super Attributes.Key.Json> $completion) {
    return store$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  default Object storeUnsafe(@NotNull Attributes.Key key, @NotNull Attributes.Value value, @NotNull Continuation<? super Attributes.Key> $completion) {
    return storeUnsafe$suspendImpl(this, key, value, $completion);
  }
  
  @Nullable
  Object store(@NotNull Attributes paramAttributes, @NotNull Continuation<? super Set<? extends Attributes.Key>> paramContinuation);
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Long key, @NotNull Continuation<? super Attributes.Value.Long> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Double key, @NotNull Continuation<? super Attributes.Value.Double> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Text key, @NotNull Continuation<? super Attributes.Value.Text> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  default Object get(@NotNull Attributes.Key.Json key, @NotNull Continuation<? super Attributes.Value.Json> $completion) {
    return get$suspendImpl(this, key, $completion);
  }
  
  @Nullable
  Object get(@NotNull Set<? extends Attributes.Key> paramSet, @NotNull Continuation<? super Attributes> paramContinuation);
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {20}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$1 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Long)null, (Continuation<? super Attributes.Value.Long>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {22}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$2 extends ContinuationImpl {
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
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {24}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$3 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Text)null, (Continuation<? super Attributes.Value.Text>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {26}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$get$4 extends ContinuationImpl {
    Object L$0;
    
    int label;
    
    SuspendableAttributeAPIClient$get$4(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Json)null, (Continuation<? super Attributes.Value.Json>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {6}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$1 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Long)null, (Attributes.Value.Long)null, (Continuation<? super Attributes.Key.Long>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {8}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$2 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$2(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Double)null, (Attributes.Value.Double)null, (Continuation<? super Attributes.Key.Double>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {10}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$3 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$3(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Text)null, (Attributes.Value.Text)null, (Continuation<? super Attributes.Key.Text>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {12}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$store$4 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$store$4(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.store$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Json)null, (Attributes.Value.Json)null, (Continuation<? super Attributes.Key.Json>)this);
    }
  }
  
  @DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {15}, i = {}, s = {}, n = {}, m = "storeUnsafe$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableAttributeAPIClient$storeUnsafe$1 extends ContinuationImpl {
    int label;
    
    SuspendableAttributeAPIClient$storeUnsafe$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableAttributeAPIClient.storeUnsafe$suspendImpl(SuspendableAttributeAPIClient.this, null, null, (Continuation<? super Attributes.Key>)this);
    }
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/client/attribute/SuspendableAttributeAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */