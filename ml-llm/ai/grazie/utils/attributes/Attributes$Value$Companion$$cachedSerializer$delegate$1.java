/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class Attributes$Value$Companion$$cachedSerializer$delegate$1
/*    */   extends Lambda
/*    */   implements Function0<KSerializer<Object>>
/*    */ {
/*    */   public static final Attributes$Value$Companion$$cachedSerializer$delegate$1 INSTANCE = new Attributes$Value$Companion$$cachedSerializer$delegate$1();
/*    */   
/*    */   Attributes$Value$Companion$$cachedSerializer$delegate$1() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Object> invoke() {
/* 77 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(Attributes.Value.Bool.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(Attributes.Value.Bytes.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(Attributes.Value.Double.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(Attributes.Value.Json.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(Attributes.Value.Long.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(Attributes.Value.Text.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)Attributes.Value.Bool.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Attributes.Value.Bytes.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Attributes.Value.Double.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)Attributes.Value.Json.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)Attributes.Value.Long.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)Attributes.Value.Text.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.utils.attributes.Attributes.Value", Reflection.getOrCreateKotlinClass(Attributes.Value.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/Attributes$Value$Companion$$cachedSerializer$delegate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */