/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ import ai.grazie.utils.mpp.time.Timestamp;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ByteArraySerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @SerialName("bytes")
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \"2\0020\001:\002!\"B-\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\027\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\003H\026J\t\020\030\032\0020\031HÖ\001J!\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÇ\001R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Value$Bytes;", "Lai/grazie/utils/attributes/Attributes$Value;", "seen1", "", "value", "", "modified", "Lai/grazie/utils/mpp/time/Timestamp;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[BLai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([BLai/grazie/utils/mpp/time/Timestamp;)V", "getModified", "()Lai/grazie/utils/mpp/time/Timestamp;", "getValue", "()[B", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "utils-common"})
/*     */ public final class Bytes extends Attributes.Value {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final byte[] value;
/*     */   @NotNull
/*     */   private final Timestamp modified;
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Value.Bytes.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Value$Bytes;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*     */   public static final class $serializer implements GeneratedSerializer<Bytes> {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */       arrayOfKSerializer[0] = (KSerializer)ByteArraySerializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Attributes.Value.Bytes deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       Object object1 = null, object2 = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ByteArraySerializer.INSTANCE, object1);
/*     */         i |= 0x1;
/*     */         object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, object2);
/*     */         i |= 0x2;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ByteArraySerializer.INSTANCE, object1);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, object2);
/*     */               i |= 0x2;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new Attributes.Value.Bytes(i, (byte[])object1, (Timestamp)object2, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Value.Bytes value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       Attributes.Value.Bytes.write$Self(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("bytes", INSTANCE, 2);
/*     */       pluginGeneratedSerialDescriptor.addElement("value", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("modified", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @JvmStatic
/* 107 */   public static final void write$Self(@NotNull Bytes self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); Attributes.Value.write$Self(self, output, serialDesc); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)ByteArraySerializer.INSTANCE, self.value); if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : (
/*     */ 
/*     */       
/* 110 */       !Intrinsics.areEqual(self.getModified(), Timestamp.Companion.now()))) output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)Timestamp.Serializer.INSTANCE, self.getModified());  } public Bytes(@NotNull byte[] value, @NotNull Timestamp modified) { super(null); this.value = value; this.modified = modified; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Value$Bytes$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Value$Bytes;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Value.Bytes> serializer() { return (KSerializer<Attributes.Value.Bytes>)Attributes.Value.Bytes.$serializer.INSTANCE; } } @NotNull public final byte[] getValue() { return this.value; } @NotNull public Timestamp getModified() { return this.modified; }
/*     */    public boolean equals(@Nullable Object other) {
/* 112 */     if (this == other) return true; 
/* 113 */     if (other == null || getClass() != other.getClass()) return false;
/*     */     
/* 115 */     (Bytes)other;
/*     */     
/* 117 */     if (!Intrinsics.areEqual(getModified(), ((Bytes)other).getModified())) return false; 
/* 118 */     if (!Arrays.equals(this.value, ((Bytes)other).value)) return false;
/*     */     
/* 120 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 124 */     int result = getModified().hashCode();
/* 125 */     result = 31 * result + Arrays.hashCode(this.value);
/* 126 */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final byte[] component1() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp component2() {
/*     */     return getModified();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Bytes copy(@NotNull byte[] value, @NotNull Timestamp modified) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Intrinsics.checkNotNullParameter(modified, "modified");
/*     */     return new Bytes(value, modified);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Bytes(value=" + Arrays.toString(this.value) + ", modified=" + getModified() + ")";
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/attributes/Attributes$Value$Bytes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */