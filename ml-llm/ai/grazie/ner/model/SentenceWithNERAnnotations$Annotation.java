/*    */ package ai.grazie.ner.model;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\003 !\"B-\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J!\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation;", "", "seen1", "", "range", "Lai/grazie/text/TextRange;", "label", "Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation$Label;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/text/TextRange;Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation$Label;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/text/TextRange;Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation$Label;)V", "getLabel", "()Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation$Label;", "getRange", "()Lai/grazie/text/TextRange;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Label", "model-ner"})
/*    */ public final class Annotation {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TextRange range;
/*    */   @NotNull
/*    */   private final Label label;
/*    */   
/* 12 */   public Annotation(@NotNull TextRange range, @NotNull Label label) { this.range = range; this.label = label; } @JvmStatic public static final void write$Self(@NotNull Annotation self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)TextRange$.serializer.INSTANCE, self.range); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new EnumSerializer("ai.grazie.ner.model.SentenceWithNERAnnotations.Annotation.Label", (Enum[])Label.values()), self.label); } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/ner/model/SentenceWithNERAnnotations.Annotation.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-ner"}) public static final class $serializer implements GeneratedSerializer<Annotation> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)TextRange$.serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)new EnumSerializer("ai.grazie.ner.model.SentenceWithNERAnnotations.Annotation.Label", (Enum[])SentenceWithNERAnnotations.Annotation.Label.values()); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SentenceWithNERAnnotations.Annotation deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1); i |= 0x1; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new EnumSerializer("ai.grazie.ner.model.SentenceWithNERAnnotations.Annotation.Label", (Enum[])SentenceWithNERAnnotations.Annotation.Label.values()), object2); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new EnumSerializer("ai.grazie.ner.model.SentenceWithNERAnnotations.Annotation.Label", (Enum[])SentenceWithNERAnnotations.Annotation.Label.values()), object2); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithNERAnnotations.Annotation(i, (TextRange)object1, (SentenceWithNERAnnotations.Annotation.Label)object2, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithNERAnnotations.Annotation value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithNERAnnotations.Annotation.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.ner.model.SentenceWithNERAnnotations.Annotation", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("range", false); pluginGeneratedSerialDescriptor.addElement("label", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final TextRange getRange() { return this.range; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation;", "model-ner"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SentenceWithNERAnnotations.Annotation> serializer() { return (KSerializer<SentenceWithNERAnnotations.Annotation>)SentenceWithNERAnnotations.Annotation.$serializer.INSTANCE; } } @NotNull public final Label getLabel() { return this.label; } @NotNull public final TextRange component1() { return this.range; } @NotNull public final Label component2() { return this.label; } @NotNull public final Annotation copy(@NotNull TextRange range, @NotNull Label label) { Intrinsics.checkNotNullParameter(range, "range"); Intrinsics.checkNotNullParameter(label, "label"); return new Annotation(range, label); } @NotNull public String toString() { return "Annotation(range=" + this.range + ", label=" + this.label + ")"; } public int hashCode() { result = this.range.hashCode(); return result * 31 + this.label.hashCode(); }
/*    */   public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Annotation)) return false;  Annotation annotation = (Annotation)other; return !Intrinsics.areEqual(this.range, annotation.range) ? false : (!(this.label != annotation.label)); }
/* 14 */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\034\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034¨\006\035"}, d2 = {"Lai/grazie/ner/model/SentenceWithNERAnnotations$Annotation$Label;", "", "(Ljava/lang/String;I)V", "ORGANIZATION", "PERSON", "NICKNAME", "MONEY", "EMAIL", "URL", "IP", "FILE", "BINARY", "UUID", "GEO_POLITICAL_ENTITY", "LOCATION", "NATIONALITY_OR_GROUP", "LANGUAGE", "MISC", "CARDINAL", "DATE", "EVENT", "FACILITY", "LAW", "ORDINAL", "PERCENT", "PRODUCT", "QUANTITY", "TIME", "WORK_OF_ART", "model-ner"}) public enum Label { ORGANIZATION,
/*    */     
/* 16 */     PERSON,
/* 17 */     NICKNAME,
/*    */     
/* 19 */     MONEY,
/* 20 */     EMAIL,
/* 21 */     URL,
/* 22 */     IP,
/*    */     
/* 24 */     FILE,
/* 25 */     BINARY,
/* 26 */     UUID,
/*    */     
/* 28 */     GEO_POLITICAL_ENTITY,
/* 29 */     LOCATION,
/*    */ 
/*    */     
/* 32 */     NATIONALITY_OR_GROUP,
/*    */     
/* 34 */     LANGUAGE,
/* 35 */     MISC,
/*    */     
/* 37 */     CARDINAL,
/* 38 */     DATE,
/* 39 */     EVENT,
/* 40 */     FACILITY,
/* 41 */     LAW,
/* 42 */     ORDINAL,
/* 43 */     PERCENT,
/* 44 */     PRODUCT,
/* 45 */     QUANTITY,
/* 46 */     TIME,
/* 47 */     WORK_OF_ART; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/ner/model/SentenceWithNERAnnotations$Annotation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */