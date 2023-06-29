/*    */ package ai.grazie.model.cloud.sse.continuous.events.type;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\b\b\001\030\000 \b2\b\022\004\022\0020\0000\001:\002\007\bB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006¨\006\t"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "", "(Ljava/lang/String;I)V", "Data", "Timeout", "Cancel", "Error", "$serializer", "Companion", "model-cloud"})
/*    */ public enum ContinuousSSEEventType {
/* 10 */   Data,
/*    */ 
/*    */   
/* 13 */   Timeout,
/*    */ 
/*    */   
/* 16 */   Cancel,
/*    */ 
/*    */   
/* 19 */   Error; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ContinuousSSEEventType$Companion$$cachedSerializer$delegate$1.INSTANCE); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-cloud"})
/*    */   public static final class $serializer implements GeneratedSerializer<ContinuousSSEEventType> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       return (KSerializer<?>[])new KSerializer[0];
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ContinuousSSEEventType deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       return ContinuousSSEEventType.values()[decoder.decodeEnum(getDescriptor())];
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ContinuousSSEEventType value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeEnum(getDescriptor(), value.ordinal());
/*    */     }
/*    */     
/*    */     static {
/*    */       EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType", 4);
/*    */       enumDescriptor.addElement("data", false);
/*    */       enumDescriptor.addElement("timeout", false);
/*    */       enumDescriptor.addElement("cancel", false);
/*    */       enumDescriptor.addElement("error", false);
/*    */       descriptor = enumDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class ContinuousSSEEventType$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final ContinuousSSEEventType$Companion$$cachedSerializer$delegate$1 INSTANCE = new ContinuousSSEEventType$Companion$$cachedSerializer$delegate$1();
/*    */     
/*    */     ContinuousSSEEventType$Companion$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Object> invoke() {
/*    */       return (KSerializer<Object>)ContinuousSSEEventType.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ContinuousSSEEventType> serializer() {
/*    */       return (KSerializer<ContinuousSSEEventType>)get$cachedSerializer$delegate().getValue();
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */