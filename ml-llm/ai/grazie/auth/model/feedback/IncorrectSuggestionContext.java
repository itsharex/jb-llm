/*    */ package ai.grazie.auth.model.feedback;
/*    */ 
/*    */ import ai.grazie.gec.model.SentenceWithCorrections;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 '2\0020\001:\002&'B=\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\016\020\b\032\n\022\004\022\0020\003\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB#\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\0030\t¢\006\002\020\rJ\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\007HÆ\003J\024\020\027\032\b\022\004\022\0020\0030\tHÆ\003¢\006\002\020\021J2\020\030\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\0030\tHÆ\001¢\006\002\020\031J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001H\002J\b\020\035\032\0020\003H\026J\t\020\036\032\0020\005HÖ\001J!\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\031\020\b\032\b\022\004\022\0020\0030\t¢\006\n\n\002\020\022\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024¨\006("}, d2 = {"Lai/grazie/auth/model/feedback/IncorrectSuggestionContext;", "", "seen1", "", "sentence", "", "correction", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "indices", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gec/model/SentenceWithCorrections$Correction;[Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/gec/model/SentenceWithCorrections$Correction;[Ljava/lang/Integer;)V", "getCorrection", "()Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "getIndices", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "getSentence", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lai/grazie/gec/model/SentenceWithCorrections$Correction;[Ljava/lang/Integer;)Lai/grazie/auth/model/feedback/IncorrectSuggestionContext;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "auth-model"})
/*    */ public final class IncorrectSuggestionContext {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String sentence;
/*    */   @NotNull
/*    */   private final SentenceWithCorrections.Correction correction;
/*    */   @NotNull
/*    */   private final Integer[] indices;
/*    */   
/* 25 */   public IncorrectSuggestionContext(@NotNull String sentence, @NotNull SentenceWithCorrections.Correction correction, @NotNull Integer[] indices) { this.sentence = sentence; this.correction = correction; this.indices = indices; } @JvmStatic public static final void write$Self(@NotNull IncorrectSuggestionContext self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeStringElement(serialDesc, 0, self.sentence); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)SentenceWithCorrections$Correction$.serializer.INSTANCE, self.correction); output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Integer.class), (KSerializer)IntSerializer.INSTANCE), self.indices); } @NotNull public final String getSentence() { return this.sentence; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/feedback/IncorrectSuggestionContext.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/feedback/IncorrectSuggestionContext;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"}) public static final class $serializer implements GeneratedSerializer<IncorrectSuggestionContext> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)SentenceWithCorrections$Correction$.serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Integer.class), (KSerializer)IntSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public IncorrectSuggestionContext deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Object object1 = null, object2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)SentenceWithCorrections$Correction$.serializer.INSTANCE, object1); i |= 0x2; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Integer.class), (KSerializer)IntSerializer.INSTANCE), object2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)SentenceWithCorrections$Correction$.serializer.INSTANCE, object1); i |= 0x2; continue;case 2: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Integer.class), (KSerializer)IntSerializer.INSTANCE), object2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new IncorrectSuggestionContext(i, str, (SentenceWithCorrections.Correction)object1, (Integer[])object2, null); } public void serialize(@NotNull Encoder encoder, @NotNull IncorrectSuggestionContext value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); IncorrectSuggestionContext.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.feedback.IncorrectSuggestionContext", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("sentence", false); pluginGeneratedSerialDescriptor.addElement("correction", false); pluginGeneratedSerialDescriptor.addElement("indices", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/feedback/IncorrectSuggestionContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/feedback/IncorrectSuggestionContext;", "auth-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<IncorrectSuggestionContext> serializer() { return (KSerializer<IncorrectSuggestionContext>)IncorrectSuggestionContext.$serializer.INSTANCE; } } @NotNull public final SentenceWithCorrections.Correction getCorrection() { return this.correction; } @NotNull public final Integer[] getIndices() { return this.indices; }
/*    */    public boolean equals(@Nullable Object other) {
/* 27 */     if (this == other) return true; 
/* 28 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 30 */     (IncorrectSuggestionContext)other;
/*    */     
/* 32 */     if (!Intrinsics.areEqual(this.sentence, ((IncorrectSuggestionContext)other).sentence)) return false; 
/* 33 */     if (!Intrinsics.areEqual(this.correction, ((IncorrectSuggestionContext)other).correction)) return false; 
/* 34 */     if (!Arrays.equals((Object[])this.indices, (Object[])((IncorrectSuggestionContext)other).indices)) return false;
/*    */     
/* 36 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 40 */     int result = this.sentence.hashCode();
/* 41 */     result = 31 * result + this.correction.hashCode();
/* 42 */     result = 31 * result + Arrays.hashCode((Object[])this.indices);
/* 43 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.sentence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceWithCorrections.Correction component2() {
/*    */     return this.correction;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Integer[] component3() {
/*    */     return this.indices;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IncorrectSuggestionContext copy(@NotNull String sentence, @NotNull SentenceWithCorrections.Correction correction, @NotNull Integer[] indices) {
/*    */     Intrinsics.checkNotNullParameter(sentence, "sentence");
/*    */     Intrinsics.checkNotNullParameter(correction, "correction");
/*    */     Intrinsics.checkNotNullParameter(indices, "indices");
/*    */     return new IncorrectSuggestionContext(sentence, correction, indices);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "IncorrectSuggestionContext(sentence=" + this.sentence + ", correction=" + this.correction + ", indices=" + Arrays.toString((Object[])this.indices) + ")";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/feedback/IncorrectSuggestionContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */