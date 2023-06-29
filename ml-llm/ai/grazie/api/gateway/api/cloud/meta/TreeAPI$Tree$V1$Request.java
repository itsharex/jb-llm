/*    */ package ai.grazie.api.gateway.api.cloud.meta;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 (2\0020\001:\002'(BM\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\b\022\016\020\n\032\n\022\004\022\0020\b\030\0010\007\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB9\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\b\022\020\b\002\020\n\032\n\022\004\022\0020\b\030\0010\007¢\006\002\020\016J\t\020\026\032\0020\005HÆ\003J\017\020\027\032\b\022\004\022\0020\b0\007HÆ\003J\013\020\030\032\004\030\0010\bHÆ\003J\021\020\031\032\n\022\004\022\0020\b\030\0010\007HÆ\003JA\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\b2\020\b\002\020\n\032\n\022\004\022\0020\b\030\0010\007HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\bHÖ\001J!\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÇ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\031\020\n\032\n\022\004\022\0020\b\030\0010\007¢\006\b\n\000\032\004\b\021\020\022R\023\020\t\032\004\030\0010\b¢\006\b\n\000\032\004\b\023\020\024R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\025\020\022¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request;", "", "seen1", "", "lang", "Lai/grazie/nlp/langs/Language;", "texts", "", "", "parser", "options", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getOptions", "()Ljava/util/List;", "getParser", "()Ljava/lang/String;", "getTexts", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Language lang;
/*    */   @NotNull
/*    */   private final List<String> texts;
/*    */   @Nullable
/*    */   private final String parser;
/*    */   @Nullable
/*    */   private final List<String> options;
/*    */   
/* 14 */   public Request(@NotNull Language lang, @NotNull List<String> texts, @Nullable String parser, @Nullable List<String> options) { this.lang = lang; this.texts = texts; this.parser = parser; this.options = options; } @JvmStatic public static final void write$Self(@NotNull Request self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)Language.Serializer.INSTANCE, self.lang); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), self.texts); if (output.shouldEncodeElementDefault(serialDesc, 2) ? true : ((self.parser != null))) output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)StringSerializer.INSTANCE, self.parser);  if (output.shouldEncodeElementDefault(serialDesc, 3) ? true : ((self.options != null))) output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), self.options);  } @NotNull public final Language getLang() { return this.lang; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/cloud/meta/TreeAPI.Tree.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE)); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TreeAPI.Tree.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null, object4 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, object1); i |= 0x1; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object2); i |= 0x2; object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object3); i |= 0x4; object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object4); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object3); i |= 0x4; continue;case 3: object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object4); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TreeAPI.Tree.V1.Request(i, (Language)object1, (List)object2, (String)object3, (List)object4, null); } public void serialize(@NotNull Encoder encoder, @NotNull TreeAPI.Tree.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TreeAPI.Tree.V1.Request.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.cloud.meta.TreeAPI.Tree.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("lang", false); pluginGeneratedSerialDescriptor.addElement("texts", false); pluginGeneratedSerialDescriptor.addElement("parser", true); pluginGeneratedSerialDescriptor.addElement("options", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TreeAPI.Tree.V1.Request> serializer() { return (KSerializer<TreeAPI.Tree.V1.Request>)TreeAPI.Tree.V1.Request.$serializer.INSTANCE; } } @NotNull public final List<String> getTexts() { return this.texts; } @Nullable public final String getParser() { return this.parser; } @Nullable public final List<String> getOptions() { return this.options; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.lang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.texts;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.parser;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component4() {
/*    */     return this.options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull Language lang, @NotNull List<String> texts, @Nullable String parser, @Nullable List<String> options) {
/*    */     Intrinsics.checkNotNullParameter(lang, "lang");
/*    */     Intrinsics.checkNotNullParameter(texts, "texts");
/*    */     return new Request(lang, texts, parser, options);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(lang=" + this.lang + ", texts=" + this.texts + ", parser=" + this.parser + ", options=" + this.options + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.lang.hashCode();
/*    */     result = result * 31 + this.texts.hashCode();
/*    */     result = result * 31 + ((this.parser == null) ? 0 : this.parser.hashCode());
/*    */     return result * 31 + ((this.options == null) ? 0 : this.options.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return (this.lang != request.lang) ? false : (!Intrinsics.areEqual(this.texts, request.texts) ? false : (!Intrinsics.areEqual(this.parser, request.parser) ? false : (!!Intrinsics.areEqual(this.options, request.options))));
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/cloud/meta/TreeAPI$Tree$V1$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */