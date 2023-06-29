/*    */ package ai.grazie.api.gateway.api.metrics.trf;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\004\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\000\n\002\030\002\n\002\b\037\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 =2\0020\001:\002<=Bi\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\b\020\007\032\004\030\0010\003\022\006\020\b\032\0020\003\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016\022\016\020\017\032\n\022\004\022\0020\n\030\0010\020\022\b\020\021\032\004\030\0010\022¢\006\002\020\023BM\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\b\020\007\032\004\030\0010\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016\022\f\020\017\032\b\022\004\022\0020\n0\020¢\006\002\020\024J\t\020&\032\0020\005HÆ\003J\t\020'\032\0020\005HÆ\003J\020\020(\032\004\030\0010\003HÆ\003¢\006\002\020\026J\t\020)\032\0020\003HÆ\003J\t\020*\032\0020\nHÆ\003J\t\020+\032\0020\fHÆ\003J\t\020,\032\0020\016HÆ\003J\024\020-\032\b\022\004\022\0020\n0\020HÆ\003¢\006\002\020\035Jf\020.\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\n\b\002\020\007\032\004\030\0010\0032\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\016\b\002\020\017\032\b\022\004\022\0020\n0\020HÆ\001¢\006\002\020/J\023\0200\032\0020\0052\b\0201\032\004\030\00102H\002J\b\0203\032\0020\003H\026J\t\0204\032\0020\nHÖ\001J!\0205\032\002062\006\0207\032\0020\0002\006\0208\032\002092\006\020:\032\0020;HÇ\001R\025\020\007\032\004\030\0010\003¢\006\n\n\002\020\027\032\004\b\025\020\026R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\030\020\031R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\032\020\033R\031\020\017\032\b\022\004\022\0020\n0\020¢\006\n\n\002\020\036\032\004\b\034\020\035R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\037\020 R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b!\020\"R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b#\020$R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b%\020$¨\006>"}, d2 = {"Lai/grazie/api/gateway/api/metrics/trf/SynReportData;", "Lai/grazie/api/gateway/api/metrics/ReportData;", "seen1", "", "wasDisplayed", "", "wasChosen", "chosenIndex", "timeOfDisplaySeconds", "text", "", "range", "Lai/grazie/text/TextRange;", "language", "Lai/grazie/nlp/langs/Language;", "synonyms", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZLjava/lang/Integer;ILjava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZLjava/lang/Integer;ILjava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;[Ljava/lang/String;)V", "getChosenIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getRange", "()Lai/grazie/text/TextRange;", "getSynonyms", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getTimeOfDisplaySeconds", "()I", "getWasChosen", "()Z", "getWasDisplayed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZZLjava/lang/Integer;ILjava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;[Ljava/lang/String;)Lai/grazie/api/gateway/api/metrics/trf/SynReportData;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class SynReportData extends ReportData { @NotNull
/*    */   public static final Companion Companion = new Companion(null); private final boolean wasDisplayed; private final boolean wasChosen;
/*    */   @Nullable
/*    */   private final Integer chosenIndex;
/*    */   
/*    */   @JvmStatic
/* 10 */   public static final void write$Self(@NotNull SynReportData self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeBooleanElement(serialDesc, 0, self.getWasDisplayed()); output.encodeBooleanElement(serialDesc, 1, self.wasChosen); output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)IntSerializer.INSTANCE, self.chosenIndex); output.encodeIntElement(serialDesc, 3, self.timeOfDisplaySeconds); output.encodeStringElement(serialDesc, 4, self.text); output.encodeSerializableElement(serialDesc, 5, (SerializationStrategy)TextRange$.serializer.INSTANCE, self.range); output.encodeSerializableElement(serialDesc, 6, (SerializationStrategy)Language.Serializer.INSTANCE, self.language); output.encodeSerializableElement(serialDesc, 7, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), self.synonyms); } private final int timeOfDisplaySeconds; @NotNull private final String text; @NotNull private final TextRange range; @NotNull private final Language language; @NotNull private final String[] synonyms; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/metrics/trf/SynReportData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/metrics/trf/SynReportData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<SynReportData> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[8]; arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[3] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)TextRange$.serializer.INSTANCE; arrayOfKSerializer[6] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[7] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SynReportData deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; boolean bool1 = false, bool2 = false; Object object1 = null; int j = 0; String str = null; Object object2 = null, object3 = null, object4 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1); i |= 0x2; object1 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, object1); i |= 0x4; j = compositeDecoder.decodeIntElement(serialDescriptor, 3); i |= 0x8; str = compositeDecoder.decodeStringElement(serialDescriptor, 4); i |= 0x10; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2); i |= 0x20; object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy)Language.Serializer.INSTANCE, object3); i |= 0x40; object4 = compositeDecoder.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object4); i |= 0x80; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; continue;case 1: bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1); i |= 0x2; continue;case 2: object1 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, object1); i |= 0x4; continue;case 3: j = compositeDecoder.decodeIntElement(serialDescriptor, 3); i |= 0x8; continue;case 4: str = compositeDecoder.decodeStringElement(serialDescriptor, 4); i |= 0x10; continue;case 5: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2); i |= 0x20; continue;case 6: object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy)Language.Serializer.INSTANCE, object3); i |= 0x40; continue;case 7: object4 = compositeDecoder.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object4); i |= 0x80; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new SynReportData(i, bool1, bool2, (Integer)object1, j, str, (TextRange)object2, (Language)object3, (String[])object4, null); } public void serialize(@NotNull Encoder encoder, @NotNull SynReportData value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SynReportData.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.metrics.trf.SynReportData", INSTANCE, 8); pluginGeneratedSerialDescriptor.addElement("wasDisplayed", false); pluginGeneratedSerialDescriptor.addElement("wasChosen", false); pluginGeneratedSerialDescriptor.addElement("chosenIndex", false); pluginGeneratedSerialDescriptor.addElement("timeOfDisplaySeconds", false); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("range", false); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("synonyms", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/metrics/trf/SynReportData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/metrics/trf/SynReportData;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SynReportData> serializer() { return (KSerializer<SynReportData>)SynReportData.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 13 */   public boolean getWasDisplayed() { return this.wasDisplayed; }
/* 14 */   public final boolean getWasChosen() { return this.wasChosen; } @Nullable
/* 15 */   public final Integer getChosenIndex() { return this.chosenIndex; }
/* 16 */   public final int getTimeOfDisplaySeconds() { return this.timeOfDisplaySeconds; }
/*    */   @NotNull
/* 18 */   public final String getText() { return this.text; } @NotNull
/* 19 */   public final TextRange getRange() { return this.range; } @NotNull
/* 20 */   public final Language getLanguage() { return this.language; }
/*    */   @NotNull
/* 22 */   public final String[] getSynonyms() { return this.synonyms; } public SynReportData(boolean wasDisplayed, boolean wasChosen, @Nullable Integer chosenIndex, int timeOfDisplaySeconds, @NotNull String text, @NotNull TextRange range, @NotNull Language language, @NotNull String[] synonyms) { this.wasDisplayed = wasDisplayed; this.wasChosen = wasChosen; this.chosenIndex = chosenIndex; this.timeOfDisplaySeconds = timeOfDisplaySeconds; this.text = text; this.range = range; this.language = language; this.synonyms = synonyms;
/*    */ 
/*    */     
/* 25 */     if (this.wasChosen)
/* 26 */     { if (!((this.chosenIndex != null) ? 1 : 0)) { int $i$a$-require-SynReportData$1 = 0; String str = 
/* 27 */           "If any variant was chosen, chosen index must be set";
/*    */         throw new IllegalArgumentException(str.toString()); }
/*    */        }
/* 30 */     else if (!((this.chosenIndex == null) ? 1 : 0)) { int $i$a$-require-SynReportData$2 = 0; String str = 
/* 31 */         "If neither variant was chosen, chosen index must be null";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 37 */     if (this == other) return true; 
/* 38 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 40 */     (SynReportData)other;
/*    */     
/* 42 */     if (getWasDisplayed() != ((SynReportData)other).getWasDisplayed()) return false; 
/* 43 */     if (this.wasChosen != ((SynReportData)other).wasChosen) return false; 
/* 44 */     if (!Intrinsics.areEqual(this.chosenIndex, ((SynReportData)other).chosenIndex)) return false; 
/* 45 */     if (this.timeOfDisplaySeconds != ((SynReportData)other).timeOfDisplaySeconds) return false; 
/* 46 */     if (!Intrinsics.areEqual(this.text, ((SynReportData)other).text)) return false; 
/* 47 */     if (!Intrinsics.areEqual(this.range, ((SynReportData)other).range)) return false; 
/* 48 */     if (this.language != ((SynReportData)other).language) return false; 
/* 49 */     if (!Arrays.equals((Object[])this.synonyms, (Object[])((SynReportData)other).synonyms)) return false;
/*    */     
/* 51 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 55 */     int result = Boolean.hashCode(getWasDisplayed());
/* 56 */     result = 31 * result + Boolean.hashCode(this.wasChosen);
/* 57 */     result = 31 * result + ((this.chosenIndex != null) ? this.chosenIndex.intValue() : 0);
/* 58 */     result = 31 * result + this.timeOfDisplaySeconds;
/* 59 */     result = 31 * result + this.text.hashCode();
/* 60 */     result = 31 * result + this.range.hashCode();
/* 61 */     result = 31 * result + this.language.hashCode();
/* 62 */     result = 31 * result + Arrays.hashCode((Object[])this.synonyms);
/* 63 */     return result;
/*    */   }
/*    */   
/*    */   public final boolean component1() {
/*    */     return getWasDisplayed();
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.wasChosen;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component3() {
/*    */     return this.chosenIndex;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.timeOfDisplaySeconds;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component6() {
/*    */     return this.range;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component7() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String[] component8() {
/*    */     return this.synonyms;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SynReportData copy(boolean wasDisplayed, boolean wasChosen, @Nullable Integer chosenIndex, int timeOfDisplaySeconds, @NotNull String text, @NotNull TextRange range, @NotNull Language language, @NotNull String[] synonyms) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(range, "range");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(synonyms, "synonyms");
/*    */     return new SynReportData(wasDisplayed, wasChosen, chosenIndex, timeOfDisplaySeconds, text, range, language, synonyms);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SynReportData(wasDisplayed=" + getWasDisplayed() + ", wasChosen=" + this.wasChosen + ", chosenIndex=" + this.chosenIndex + ", timeOfDisplaySeconds=" + this.timeOfDisplaySeconds + ", text=" + this.text + ", range=" + this.range + ", language=" + this.language + ", synonyms=" + Arrays.toString((Object[])this.synonyms) + ")";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/metrics/trf/SynReportData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */