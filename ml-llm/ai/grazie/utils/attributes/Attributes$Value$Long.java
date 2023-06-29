/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LongSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @SerialName("int")
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\t\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \"2\0020\001:\002!\"B+\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\027\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J!\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÇ\001R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Value$Long;", "Lai/grazie/utils/attributes/Attributes$Value;", "seen1", "", "value", "", "modified", "Lai/grazie/utils/mpp/time/Timestamp;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLai/grazie/utils/mpp/time/Timestamp;)V", "getModified", "()Lai/grazie/utils/mpp/time/Timestamp;", "getValue", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "utils-common"})
/*    */ public final class Long
/*    */   extends Attributes.Value
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long value;
/*    */   @NotNull
/*    */   private final Timestamp modified;
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Long))
/*    */       return false; 
/*    */     Long long_ = (Long)other;
/*    */     return (this.value != long_.value) ? false : (!!Intrinsics.areEqual(getModified(), long_.getModified()));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Long.hashCode(this.value);
/*    */     return result * 31 + getModified().hashCode();
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull Long self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/* 87 */     Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); Attributes.Value.write$Self(self, output, serialDesc); output.encodeLongElement(serialDesc, 0, self.value); if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : (
/*    */ 
/*    */       
/* 90 */       !Intrinsics.areEqual(self.getModified(), Timestamp.Companion.now()))) output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)Timestamp.Serializer.INSTANCE, self.getModified());  } @NotNull public String toString() { return "Long(value=" + this.value + ", modified=" + getModified() + ")"; } @NotNull public final Long copy(long value, @NotNull Timestamp modified) { Intrinsics.checkNotNullParameter(modified, "modified"); return new Long(value, modified); } @NotNull public final Timestamp component2() { return getModified(); } public final long component1() { return this.value; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Value.Long.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Long> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)LongSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Value.Long deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; long l = 0L; Object object = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { l = compositeDecoder.decodeLongElement(serialDescriptor, 0); i |= 0x1; object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, object); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: l = compositeDecoder.decodeLongElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, object); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Value.Long(i, l, (Timestamp)object, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Value.Long value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Value.Long.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("int", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("value", false); pluginGeneratedSerialDescriptor.addElement("modified", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Value$Long$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Value$Long;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Value.Long> serializer() { return (KSerializer<Attributes.Value.Long>)Attributes.Value.Long.$serializer.INSTANCE; } } @NotNull public Timestamp getModified() { return this.modified; } public final long getValue() { return this.value; } public Long(long value, @NotNull Timestamp modified) { super(null); this.value = value; this.modified = modified; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/Attributes$Value$Long.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */