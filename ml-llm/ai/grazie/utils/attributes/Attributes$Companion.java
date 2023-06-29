/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\007\032\0020\0042\024\b\002\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tH\002J\017\020\f\032\b\022\004\022\0020\0040\rHÆ\001J!\020\016\032\002H\017\"\004\b\000\020\0172\006\020\020\032\0020\n2\006\020\021\032\0020\013¢\006\002\020\022J!\020\023\032\0020\013\"\004\b\000\020\0172\006\020\021\032\002H\0172\006\020\020\032\0020\n¢\006\002\020\024R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\025"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Companion;", "", "()V", "empty", "Lai/grazie/utils/attributes/Attributes;", "getEmpty", "()Lai/grazie/utils/attributes/Attributes;", "invoke", "data", "", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "serializer", "Lkotlinx/serialization/KSerializer;", "unwrap", "T", "key", "value", "(Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;)Ljava/lang/Object;", "wrap", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes$Key;)Lai/grazie/utils/attributes/Attributes$Value;", "utils-common"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 15 */   public final KSerializer<Attributes> serializer() { return (KSerializer<Attributes>)Attributes.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final Attributes invoke(@NotNull Map data) {
/* 17 */     Intrinsics.checkNotNullParameter(data, "data"); return new Attributes(MapsKt.toMutableMap(data)); } @NotNull
/*    */   public final Attributes getEmpty() {
/* 19 */     return Attributes.access$getEmpty$cp();
/*    */   }
/*    */ 
/*    */   
/*    */   public final <T> T unwrap(@NotNull Attributes.Key key, @NotNull Attributes.Value value) {
/* 24 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Attributes.Key key1 = key;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     if (key1 instanceof Attributes.Key.Text) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (key1 instanceof Attributes.Key.Bool) ? (T)Boolean.valueOf(((Attributes.Value.Bool)value).getValue()) : ((key1 instanceof Attributes.Key.Bytes) ? (T)((Attributes.Value.Bytes)value).getValue() : ((key1 instanceof Attributes.Key.Double) ? (T)Double.valueOf(((Attributes.Value.Double)value).getValue()) : ((key1 instanceof Attributes.Key.Json) ? (T)((Attributes.Value.Json)value).getValue() : ((key1 instanceof Attributes.Key.Long) ? (T)Long.valueOf(((Attributes.Value.Long)value).getValue()) : (T)"JD-Core does not support Kotlin"))));
/*    */   } @NotNull
/*    */   public final <T> Attributes.Value wrap(Object value, @NotNull Attributes.Key key) {
/* 35 */     Intrinsics.checkNotNullParameter(key, "key"); Attributes.Key key1 = key;
/* 36 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
/* 37 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.ByteArray");
/* 38 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
/* 39 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
/* 40 */     Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
/* 41 */     if (key1 instanceof Attributes.Key.Text) { Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String"); } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (key1 instanceof Attributes.Key.Bool) ? new Attributes.Value.Bool(((Boolean)value).booleanValue(), null, 2, null) : ((key1 instanceof Attributes.Key.Bytes) ? new Attributes.Value.Bytes((byte[])value, null, 2, null) : ((key1 instanceof Attributes.Key.Double) ? new Attributes.Value.Double(((Double)value).doubleValue(), null, 2, null) : ((key1 instanceof Attributes.Key.Json) ? new Attributes.Value.Json((String)value, null, 2, null) : ((key1 instanceof Attributes.Key.Long) ? new Attributes.Value.Long(((Long)value).longValue(), null, 2, null) : (Attributes.Value)"JD-Core does not support Kotlin"))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/Attributes$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */