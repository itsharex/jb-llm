/*    */ package ai.grazie.qa;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 (2\0020\001:\002'(B=\b\027\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB'\022\f\020\004\032\b\022\004\022\0020\0060\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\016J\024\020\026\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\020J\013\020\027\032\004\030\0010\bHÆ\003J\013\020\030\032\004\030\0010\nHÆ\003J6\020\031\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\nHÆ\001¢\006\002\020\032J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001H\002J\b\020\036\032\0020\003H\026J\t\020\037\032\0020\bHÖ\001J!\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÇ\001R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\022\020\023R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/qa/Answers;", "", "seen1", "", "documents", "", "Lai/grazie/qa/Document;", "summary", "", "summaryWithRefs", "Lai/grazie/qa/Summary;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/qa/Document;Ljava/lang/String;Lai/grazie/qa/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/qa/Document;Ljava/lang/String;Lai/grazie/qa/Summary;)V", "getDocuments", "()[Lai/grazie/qa/Document;", "[Lai/grazie/qa/Document;", "getSummary", "()Ljava/lang/String;", "getSummaryWithRefs", "()Lai/grazie/qa/Summary;", "component1", "component2", "component3", "copy", "([Lai/grazie/qa/Document;Ljava/lang/String;Lai/grazie/qa/Summary;)Lai/grazie/qa/Answers;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-qa"})
/*    */ public final class Answers { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Document[] documents; @Nullable
/*    */   private final String summary;
/*    */   @Nullable
/*    */   private final Summary summaryWithRefs;
/*    */   
/* 10 */   public Answers(@NotNull Document[] documents, @Nullable String summary, @Nullable Summary summaryWithRefs) { this.documents = documents;
/* 11 */     this.summary = summary;
/* 12 */     this.summaryWithRefs = summaryWithRefs; } @JvmStatic public static final void write$Self(@NotNull Answers self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Document.class), (KSerializer)Document.$serializer.INSTANCE), self.documents); output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)StringSerializer.INSTANCE, self.summary); output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)Summary.$serializer.INSTANCE, self.summaryWithRefs); } @Nullable public final Summary getSummaryWithRefs() { return this.summaryWithRefs; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/Answers.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/Answers;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"}) public static final class $serializer implements GeneratedSerializer<Answers> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Document.class), (KSerializer)Document.$serializer.INSTANCE); arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)Summary.$serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Answers deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Document.class), (KSerializer)Document.$serializer.INSTANCE), object1); i |= 0x1; object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, object2); i |= 0x2; object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Summary.$serializer.INSTANCE, object3); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Document.class), (KSerializer)Document.$serializer.INSTANCE), object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Summary.$serializer.INSTANCE, object3); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Answers(i, (Document[])object1, (String)object2, (Summary)object3, null); } public void serialize(@NotNull Encoder encoder, @NotNull Answers value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Answers.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.Answers", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("documents", false); pluginGeneratedSerialDescriptor.addElement("summary", false); pluginGeneratedSerialDescriptor.addElement("summaryWithRefs", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/Answers$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/Answers;", "model-qa"}) public static final class Companion {
/* 15 */     private Companion() {} @NotNull public final KSerializer<Answers> serializer() { return (KSerializer<Answers>)Answers.$serializer.INSTANCE; } } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 16 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 18 */     (Answers)other;
/*    */     
/* 20 */     if (!Arrays.equals((Object[])this.documents, (Object[])((Answers)other).documents)) return false; 
/* 21 */     if (!Intrinsics.areEqual(this.summary, ((Answers)other).summary)) return false; 
/* 22 */     return Intrinsics.areEqual(this.summaryWithRefs, ((Answers)other).summaryWithRefs); }
/*    */   @NotNull
/*    */   public final Document[] getDocuments() { return this.documents; }
/*    */   @Nullable
/* 26 */   public final String getSummary() { return this.summary; } public int hashCode() { int result = Arrays.hashCode((Object[])this.documents);
/* 27 */     result = 31 * result + ((this.summary != null) ? this.summary.hashCode() : 0);
/* 28 */     result = 31 * result + ((this.summaryWithRefs != null) ? this.summaryWithRefs.hashCode() : 0);
/* 29 */     return result; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Document[] component1() {
/*    */     return this.documents;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.summary;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Summary component3() {
/*    */     return this.summaryWithRefs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Answers copy(@NotNull Document[] documents, @Nullable String summary, @Nullable Summary summaryWithRefs) {
/*    */     Intrinsics.checkNotNullParameter(documents, "documents");
/*    */     return new Answers(documents, summary, summaryWithRefs);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Answers(documents=" + Arrays.toString((Object[])this.documents) + ", summary=" + this.summary + ", summaryWithRefs=" + this.summaryWithRefs + ")";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/qa/Answers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */