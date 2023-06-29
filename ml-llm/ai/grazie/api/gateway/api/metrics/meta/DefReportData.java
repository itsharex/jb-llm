/*    */ package ai.grazie.api.gateway.api.metrics.meta;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 32\0020\001:\00223BQ\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\020¢\006\002\020\021B7\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\022J\t\020\037\032\0020\005HÆ\003J\t\020 \032\0020\003HÆ\003J\t\020!\032\0020\bHÆ\003J\t\020\"\032\0020\nHÆ\003J\t\020#\032\0020\fHÆ\003J\013\020$\032\004\030\0010\016HÆ\003JG\020%\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\016HÆ\001J\023\020&\032\0020\0052\b\020'\032\004\030\0010(HÖ\003J\t\020)\032\0020\003HÖ\001J\t\020*\032\0020\bHÖ\001J!\020+\032\0020,2\006\020-\032\0020\0002\006\020.\032\0020/2\006\0200\032\00201HÇ\001R\023\020\r\032\004\030\0010\016¢\006\b\n\000\032\004\b\023\020\024R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\025\020\026R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\027\020\030R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\031\020\032R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\033\020\034R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\035\020\036¨\0064"}, d2 = {"Lai/grazie/api/gateway/api/metrics/meta/DefReportData;", "Lai/grazie/api/gateway/api/metrics/ReportData;", "seen1", "", "wasDisplayed", "", "timeOfDisplaySeconds", "text", "", "selection", "Lai/grazie/text/TextRange;", "language", "Lai/grazie/nlp/langs/Language;", "definition", "Lai/grazie/def/WordDefinition;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZILjava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;Lai/grazie/def/WordDefinition;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZILjava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;Lai/grazie/def/WordDefinition;)V", "getDefinition", "()Lai/grazie/def/WordDefinition;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getSelection", "()Lai/grazie/text/TextRange;", "getText", "()Ljava/lang/String;", "getTimeOfDisplaySeconds", "()I", "getWasDisplayed", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class DefReportData extends ReportData {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final boolean wasDisplayed;
/*    */   private final int timeOfDisplaySeconds;
/*    */   
/*    */   @JvmStatic
/* 11 */   public static final void write$Self(@NotNull DefReportData self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeBooleanElement(serialDesc, 0, self.getWasDisplayed()); output.encodeIntElement(serialDesc, 1, self.timeOfDisplaySeconds); output.encodeStringElement(serialDesc, 2, self.text); output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)TextRange$.serializer.INSTANCE, self.selection); output.encodeSerializableElement(serialDesc, 4, (SerializationStrategy)Language.Serializer.INSTANCE, self.language); output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)WordDefinition$.serializer.INSTANCE, self.definition); } @NotNull private final String text; @NotNull private final TextRange selection; @NotNull private final Language language; @Nullable private final WordDefinition definition; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/metrics/meta/DefReportData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/metrics/meta/DefReportData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<DefReportData> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TextRange$.serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[5] = BuiltinSerializersKt.getNullable((KSerializer)WordDefinition$.serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public DefReportData deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; boolean bool1 = false; int j = 0; String str = null; Object object1 = null, object2 = null, object3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1); i |= 0x8; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Language.Serializer.INSTANCE, object2); i |= 0x10; object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)WordDefinition$.serializer.INSTANCE, object3); i |= 0x20; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1); i |= 0x8; continue;case 4: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Language.Serializer.INSTANCE, object2); i |= 0x10; continue;case 5: object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)WordDefinition$.serializer.INSTANCE, object3); i |= 0x20; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new DefReportData(i, bool1, j, str, (TextRange)object1, (Language)object2, (WordDefinition)object3, null); } public void serialize(@NotNull Encoder encoder, @NotNull DefReportData value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); DefReportData.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.metrics.meta.DefReportData", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("wasDisplayed", false); pluginGeneratedSerialDescriptor.addElement("timeOfDisplaySeconds", false); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("selection", false); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("definition", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/metrics/meta/DefReportData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/metrics/meta/DefReportData;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<DefReportData> serializer() { return (KSerializer<DefReportData>)DefReportData.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 14 */   public boolean getWasDisplayed() { return this.wasDisplayed; }
/* 15 */   public final int getTimeOfDisplaySeconds() { return this.timeOfDisplaySeconds; }
/*    */   @NotNull
/* 17 */   public final String getText() { return this.text; } @NotNull
/* 18 */   public final TextRange getSelection() { return this.selection; } @NotNull
/* 19 */   public final Language getLanguage() { return this.language; }
/*    */   @Nullable
/* 21 */   public final WordDefinition getDefinition() { return this.definition; } public DefReportData(boolean wasDisplayed, int timeOfDisplaySeconds, @NotNull String text, @NotNull TextRange selection, @NotNull Language language, @Nullable WordDefinition definition) { this.wasDisplayed = wasDisplayed; this.timeOfDisplaySeconds = timeOfDisplaySeconds; this.text = text; this.selection = selection; this.language = language; this.definition = definition; }
/*    */ 
/*    */   
/*    */   public final boolean component1() {
/*    */     return getWasDisplayed();
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.timeOfDisplaySeconds;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component4() {
/*    */     return this.selection;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component5() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final WordDefinition component6() {
/*    */     return this.definition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DefReportData copy(boolean wasDisplayed, int timeOfDisplaySeconds, @NotNull String text, @NotNull TextRange selection, @NotNull Language language, @Nullable WordDefinition definition) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(selection, "selection");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     return new DefReportData(wasDisplayed, timeOfDisplaySeconds, text, selection, language, definition);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DefReportData(wasDisplayed=" + getWasDisplayed() + ", timeOfDisplaySeconds=" + this.timeOfDisplaySeconds + ", text=" + this.text + ", selection=" + this.selection + ", language=" + this.language + ", definition=" + this.definition + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     if (getWasDisplayed())
/*    */       getWasDisplayed(); 
/*    */     result = 1;
/*    */     result = result * 31 + Integer.hashCode(this.timeOfDisplaySeconds);
/*    */     result = result * 31 + this.text.hashCode();
/*    */     result = result * 31 + this.selection.hashCode();
/*    */     result = result * 31 + this.language.hashCode();
/*    */     return result * 31 + ((this.definition == null) ? 0 : this.definition.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DefReportData))
/*    */       return false; 
/*    */     DefReportData defReportData = (DefReportData)other;
/*    */     return (getWasDisplayed() != defReportData.getWasDisplayed()) ? false : ((this.timeOfDisplaySeconds != defReportData.timeOfDisplaySeconds) ? false : (!Intrinsics.areEqual(this.text, defReportData.text) ? false : (!Intrinsics.areEqual(this.selection, defReportData.selection) ? false : ((this.language != defReportData.language) ? false : (!!Intrinsics.areEqual(this.definition, defReportData.definition))))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/metrics/meta/DefReportData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */