/*    */ package ai.grazie.utils.mpp.time;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\n\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\002\t\nB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\013"}, d2 = {"Lai/grazie/utils/mpp/time/TimePeriod;", "", "(Ljava/lang/String;I)V", "Second", "Minute", "Hour", "Day", "Month", "Year", "$serializer", "Companion", "utils-common"})
/*    */ public enum TimePeriod {
/*  9 */   Second,
/* 10 */   Minute,
/* 11 */   Hour,
/* 12 */   Day,
/* 13 */   Month,
/* 14 */   Year; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, TimePeriod$Companion$$cachedSerializer$delegate$1.INSTANCE); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/mpp/time/TimePeriod.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/mpp/time/TimePeriod;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */   public static final class $serializer implements GeneratedSerializer<TimePeriod> {
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
/*    */     public TimePeriod deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       return TimePeriod.values()[decoder.decodeEnum(getDescriptor())];
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull TimePeriod value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeEnum(getDescriptor(), value.ordinal());
/*    */     }
/*    */     
/*    */     static {
/*    */       EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.utils.mpp.time.TimePeriod", 6);
/*    */       enumDescriptor.addElement("Second", false);
/*    */       enumDescriptor.addElement("Minute", false);
/*    */       enumDescriptor.addElement("Hour", false);
/*    */       enumDescriptor.addElement("Day", false);
/*    */       enumDescriptor.addElement("Month", false);
/*    */       enumDescriptor.addElement("Year", false);
/*    */       descriptor = enumDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class TimePeriod$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final TimePeriod$Companion$$cachedSerializer$delegate$1 INSTANCE = new TimePeriod$Companion$$cachedSerializer$delegate$1();
/*    */     
/*    */     TimePeriod$Companion$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Object> invoke() {
/*    */       return (KSerializer<Object>)TimePeriod.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/time/TimePeriod$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/mpp/time/TimePeriod;", "utils-common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TimePeriod> serializer() {
/*    */       return (KSerializer<TimePeriod>)get$cachedSerializer$delegate().getValue();
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/time/TimePeriod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */