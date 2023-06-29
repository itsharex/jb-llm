/*    */ package ai.grazie.model.auth;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \"2\0020\001:\002!\"B-\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\nJ\t\020\016\032\0020\005HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\016\020\025\032\0020\0222\006\020\026\032\0020\027J\006\020\030\032\0020\005J\t\020\031\032\0020\005HÖ\001J!\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÇ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006#"}, d2 = {"Lai/grazie/model/auth/GrazieAgent;", "", "seen1", "", "name", "", "version", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isProduct", "product", "Lai/grazie/model/auth/GrazieProduct;", "json", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-auth"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAgent.kt\nai/grazie/model/auth/GrazieAgent\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,19:1\n28#2:20\n24#3:21\n80#4:22\n*S KotlinDebug\n*F\n+ 1 GrazieAgent.kt\nai/grazie/model/auth/GrazieAgent\n*L\n17#1:20\n17#1:21\n17#1:22\n*E\n"})
/*    */ public final class GrazieAgent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String version;
/*    */   
/* 14 */   public GrazieAgent(@NotNull String name, @NotNull String version) { this.name = name; this.version = version; } @JvmStatic public static final void write$Self(@NotNull GrazieAgent self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeStringElement(serialDesc, 0, self.name); output.encodeStringElement(serialDesc, 1, self.version); } @NotNull public final String getName() { return this.name; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/auth/GrazieAgent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/auth/GrazieAgent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-auth"}) public static final class $serializer implements GeneratedSerializer<GrazieAgent> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public GrazieAgent deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new GrazieAgent(i, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull GrazieAgent value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); GrazieAgent.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.auth.GrazieAgent", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("name", false); pluginGeneratedSerialDescriptor.addElement("version", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/auth/GrazieAgent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/auth/GrazieAgent;", "model-auth"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<GrazieAgent> serializer() { return (KSerializer<GrazieAgent>)GrazieAgent.$serializer.INSTANCE; } } @NotNull public final String getVersion() { return this.version; }
/* 15 */   public final boolean isProduct(@NotNull GrazieProduct product) { Intrinsics.checkNotNullParameter(product, "product"); Intrinsics.checkNotNullExpressionValue(this.name.toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return ArraysKt.contains((Object[])product.getAgents(), this.name.toLowerCase(Locale.ROOT)); } @NotNull
/*    */   public final String json() {
/* 17 */     JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*    */ 
/*    */     
/* 20 */     int $i$f$serializer = 0;
/* 21 */     KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(GrazieAgent.class)); int $i$f$cast = 0;
/* 22 */     Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); return this_$iv.string((SerializationStrategy)$this$cast$iv$iv$iv, this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.version;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GrazieAgent copy(@NotNull String name, @NotNull String version) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(version, "version");
/*    */     return new GrazieAgent(name, version);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GrazieAgent(name=" + this.name + ", version=" + this.version + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     return result * 31 + this.version.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GrazieAgent))
/*    */       return false; 
/*    */     GrazieAgent grazieAgent = (GrazieAgent)other;
/*    */     return !Intrinsics.areEqual(this.name, grazieAgent.name) ? false : (!!Intrinsics.areEqual(this.version, grazieAgent.version));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/auth/GrazieAgent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */