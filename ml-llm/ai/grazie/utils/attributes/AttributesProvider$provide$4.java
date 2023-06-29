/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\005\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\0022\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "Lai/grazie/utils/attributes/Attributes$Value;", "Entity", "id", "value", "invoke", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes$Value;)Lai/grazie/utils/attributes/Attributes$Value;"})
/*    */ final class AttributesProvider$provide$4
/*    */   extends Lambda
/*    */   implements Function2<Entity, Attributes.Value, Attributes.Value>
/*    */ {
/*    */   @NotNull
/*    */   public final Attributes.Value invoke(Object id, @NotNull Attributes.Value value) {
/* 93 */     Intrinsics.checkNotNullParameter(value, "value"); return (Attributes.Value)this.$set.invoke(id, Double.valueOf(((Attributes.Value.Double)value).getValue()));
/*    */   }
/*    */   
/*    */   AttributesProvider$provide$4(Function2<Entity, Double, Attributes.Value.Double> $set) {
/*    */     super(2);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/AttributesProvider$provide$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */