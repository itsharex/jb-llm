/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\004\030\0010\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\005\032\002H\002H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "Lai/grazie/utils/attributes/Attributes$Value;", "Entity", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "id", "invoke", "(Lai/grazie/utils/attributes/Attributes$Key;Ljava/lang/Object;)Lai/grazie/utils/attributes/Attributes$Value;"})
/*    */ final class AttributesProvider$default$5
/*    */   extends Lambda
/*    */   implements Function2<Attributes.Key, Entity, Attributes.Value>
/*    */ {
/*    */   @Nullable
/*    */   public final Attributes.Value invoke(@NotNull Attributes.Key key, Object id) {
/* 42 */     Intrinsics.checkNotNullParameter(key, "key"); return (Attributes.Value)this.$get.invoke(key, id);
/*    */   }
/*    */   
/*    */   AttributesProvider$default$5(Function2<Attributes.Key.Double, Entity, Attributes.Value.Double> $get) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/AttributesProvider$default$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */