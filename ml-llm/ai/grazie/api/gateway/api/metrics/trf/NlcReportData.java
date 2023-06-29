/*    */ package ai.grazie.api.gateway.api.metrics.trf;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\024\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\003./0BI\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B/\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\b\b\002\020\f\032\0020\r¢\006\002\020\021J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\t\020\036\032\0020\tHÆ\003J\t\020\037\032\0020\013HÆ\003J\t\020 \032\0020\rHÆ\003J;\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rHÆ\001J\023\020\"\032\0020\0052\b\020#\032\004\030\0010$HÖ\003J\t\020%\032\0020\003HÖ\001J\t\020&\032\0020\rHÖ\001J!\020'\032\0020(2\006\020)\032\0020\0002\006\020*\032\0020+2\006\020,\032\0020-HÇ\001R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\024\020\025R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\026\020\027R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\030\020\031R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\032\020\033¨\0061"}, d2 = {"Lai/grazie/api/gateway/api/metrics/trf/NlcReportData;", "Lai/grazie/api/gateway/api/metrics/ReportData;", "seen1", "", "wasDisplayed", "", "wasApplied", "Lai/grazie/api/gateway/api/metrics/trf/NlcReportData$WasApplied;", "language", "Lai/grazie/nlp/langs/Language;", "completions", "Lai/grazie/nlc/SentenceWithCompletions;", "profile", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLai/grazie/api/gateway/api/metrics/trf/NlcReportData$WasApplied;Lai/grazie/nlp/langs/Language;Lai/grazie/nlc/SentenceWithCompletions;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLai/grazie/api/gateway/api/metrics/trf/NlcReportData$WasApplied;Lai/grazie/nlp/langs/Language;Lai/grazie/nlc/SentenceWithCompletions;Ljava/lang/String;)V", "getCompletions", "()Lai/grazie/nlc/SentenceWithCompletions;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getProfile", "()Ljava/lang/String;", "getWasApplied", "()Lai/grazie/api/gateway/api/metrics/trf/NlcReportData$WasApplied;", "getWasDisplayed", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "WasApplied", "api-gateway-api"})
/*    */ public final class NlcReportData extends ReportData { @NotNull
/*    */   public static final Companion Companion = new Companion(null); private final boolean wasDisplayed; @NotNull
/*    */   private final WasApplied wasApplied; @NotNull
/*    */   private final Language language; @NotNull
/*    */   private final SentenceWithCompletions completions; @NotNull
/*    */   private final String profile;
/*    */   
/*    */   @JvmStatic
/* 11 */   public static final void write$Self(@NotNull NlcReportData self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeBooleanElement(serialDesc, 0, self.getWasDisplayed()); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new EnumSerializer("ai.grazie.api.gateway.api.metrics.trf.NlcReportData.WasApplied", (Enum[])WasApplied.values()), self.wasApplied); output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)Language.Serializer.INSTANCE, self.language); output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)SentenceWithCompletions$.serializer.INSTANCE, self.completions); if (output.shouldEncodeElementDefault(serialDesc, 4) ? true : (
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 18 */       !Intrinsics.areEqual(self.profile, "Always"))) output.encodeStringElement(serialDesc, 4, self.profile);  } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/metrics/trf/NlcReportData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/metrics/trf/NlcReportData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<NlcReportData> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)new EnumSerializer("ai.grazie.api.gateway.api.metrics.trf.NlcReportData.WasApplied", (Enum[])NlcReportData.WasApplied.values()); arrayOfKSerializer[2] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)SentenceWithCompletions$.serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public NlcReportData deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; boolean bool1 = false; Object object1 = null, object2 = null, object3 = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new EnumSerializer("ai.grazie.api.gateway.api.metrics.trf.NlcReportData.WasApplied", (Enum[])NlcReportData.WasApplied.values()), object1); i |= 0x2; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, object2); i |= 0x4; object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)SentenceWithCompletions$.serializer.INSTANCE, object3); i |= 0x8; str = compositeDecoder.decodeStringElement(serialDescriptor, 4); i |= 0x10; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new EnumSerializer("ai.grazie.api.gateway.api.metrics.trf.NlcReportData.WasApplied", (Enum[])NlcReportData.WasApplied.values()), object1); i |= 0x2; continue;case 2: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, object2); i |= 0x4; continue;case 3: object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)SentenceWithCompletions$.serializer.INSTANCE, object3); i |= 0x8; continue;case 4: str = compositeDecoder.decodeStringElement(serialDescriptor, 4); i |= 0x10; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NlcReportData(i, bool1, (NlcReportData.WasApplied)object1, (Language)object2, (SentenceWithCompletions)object3, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull NlcReportData value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NlcReportData.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.metrics.trf.NlcReportData", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("wasDisplayed", false); pluginGeneratedSerialDescriptor.addElement("wasApplied", false); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("completions", false); pluginGeneratedSerialDescriptor.addElement("profile", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getProfile() { return this.profile; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/metrics/trf/NlcReportData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/metrics/trf/NlcReportData;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NlcReportData> serializer() { return (KSerializer<NlcReportData>)NlcReportData.$serializer.INSTANCE; } } public boolean getWasDisplayed() { return this.wasDisplayed; } @NotNull public final WasApplied getWasApplied() { return this.wasApplied; } @NotNull public final Language getLanguage() { return this.language; } @NotNull public final SentenceWithCompletions getCompletions() { return this.completions; } public NlcReportData(boolean wasDisplayed, @NotNull WasApplied wasApplied, @NotNull Language language, @NotNull SentenceWithCompletions completions, @NotNull String profile) { this.wasDisplayed = wasDisplayed; this.wasApplied = wasApplied; this.language = language; this.completions = completions; this.profile = profile; } public final boolean component1() { return getWasDisplayed(); } @NotNull public final WasApplied component2() { return this.wasApplied; } @NotNull public final Language component3() { return this.language; } @NotNull public final SentenceWithCompletions component4() { return this.completions; } @NotNull public final String component5() { return this.profile; } @NotNull public final NlcReportData copy(boolean wasDisplayed, @NotNull WasApplied wasApplied, @NotNull Language language, @NotNull SentenceWithCompletions completions, @NotNull String profile) { Intrinsics.checkNotNullParameter(wasApplied, "wasApplied"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(completions, "completions"); Intrinsics.checkNotNullParameter(profile, "profile"); return new NlcReportData(wasDisplayed, wasApplied, language, completions, profile); }
/*    */   @NotNull public String toString() { return "NlcReportData(wasDisplayed=" + getWasDisplayed() + ", wasApplied=" + this.wasApplied + ", language=" + this.language + ", completions=" + this.completions + ", profile=" + this.profile + ")"; }
/*    */   public int hashCode() { if (getWasDisplayed()) getWasDisplayed();  result = 1; result = result * 31 + this.wasApplied.hashCode(); result = result * 31 + this.language.hashCode(); result = result * 31 + this.completions.hashCode(); return result * 31 + this.profile.hashCode(); }
/*    */   public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof NlcReportData)) return false;  NlcReportData nlcReportData = (NlcReportData)other; return (getWasDisplayed() != nlcReportData.getWasDisplayed()) ? false : ((this.wasApplied != nlcReportData.wasApplied) ? false : ((this.language != nlcReportData.language) ? false : (!Intrinsics.areEqual(this.completions, nlcReportData.completions) ? false : (!!Intrinsics.areEqual(this.profile, nlcReportData.profile))))); }
/* 22 */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/metrics/trf/NlcReportData$WasApplied;", "", "(Ljava/lang/String;I)V", "Fully", "Part", "Rejected", "api-gateway-api"}) public enum WasApplied { Fully,
/* 23 */     Part,
/* 24 */     Rejected; }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/metrics/trf/NlcReportData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */