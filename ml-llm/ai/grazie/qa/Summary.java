/*    */ package ai.grazie.qa;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.ReferenceArraySerializer;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \"2\0020\001:\002!\"B3\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\005\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\0050\007¢\006\002\020\013J\t\020\021\032\0020\005HÆ\003J\024\020\022\032\b\022\004\022\0020\0050\007HÆ\003¢\006\002\020\rJ(\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\0050\007HÆ\001¢\006\002\020\024J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001H\002J\b\020\030\032\0020\003H\026J\t\020\031\032\0020\005HÖ\001J!\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÇ\001R\031\020\006\032\b\022\004\022\0020\0050\007¢\006\n\n\002\020\016\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006#"}, d2 = {"Lai/grazie/qa/Summary;", "", "seen1", "", "text", "", "references", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Ljava/lang/String;)V", "getReferences", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lai/grazie/qa/Summary;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-qa"})
/*    */ public final class Summary
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   public Summary(@NotNull String text, @NotNull String[] references) {
/* 51 */     this.text = text;
/* 52 */     this.references = references; } @NotNull private final String[] references; @JvmStatic public static final void write$Self(@NotNull Summary self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeStringElement(serialDesc, 0, self.text); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), self.references); } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/Summary.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/Summary;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"}) public static final class $serializer implements GeneratedSerializer<Summary> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Summary deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Object object = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Summary(i, str, (String[])object, null); } public void serialize(@NotNull Encoder encoder, @NotNull Summary value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Summary.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.Summary", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("references", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String[] getReferences() { return this.references; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/Summary$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/Summary;", "model-qa"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<Summary> serializer() { return (KSerializer<Summary>)Summary.$serializer.INSTANCE; } }
/*    */   @NotNull public final String getText() { return this.text; }
/* 55 */   public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 56 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 58 */     (Summary)other;
/*    */     
/* 60 */     if (!Intrinsics.areEqual(this.text, ((Summary)other).text)) return false; 
/* 61 */     return Arrays.equals((Object[])this.references, (Object[])((Summary)other).references); }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 65 */     int result = this.text.hashCode();
/* 66 */     result = 31 * result + Arrays.hashCode((Object[])this.references);
/* 67 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String[] component2() {
/*    */     return this.references;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Summary copy(@NotNull String text, @NotNull String[] references) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(references, "references");
/*    */     return new Summary(text, references);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Summary(text=" + this.text + ", references=" + Arrays.toString((Object[])this.references) + ")";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/qa/Summary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */