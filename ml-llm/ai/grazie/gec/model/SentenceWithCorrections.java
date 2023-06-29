/*    */ package ai.grazie.gec.model;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\003$%&B3\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\024\020\023\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\016J(\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001H\002J\b\020\031\032\0020\003H\026J\t\020\032\032\0020\005HÖ\001J\016\020\033\032\0020\0002\006\020\034\032\0020\003J!\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÇ\001R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\017\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021¨\006'"}, d2 = {"Lai/grazie/gec/model/SentenceWithCorrections;", "", "seen1", "", "text", "", "corrections", "", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/gec/model/SentenceWithCorrections$Correction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/gec/model/SentenceWithCorrections$Correction;)V", "getCorrections", "()[Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "[Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Lai/grazie/gec/model/SentenceWithCorrections$Correction;)Lai/grazie/gec/model/SentenceWithCorrections;", "equals", "", "other", "hashCode", "toString", "withOffset", "offset", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Correction", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceWithCorrections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n11335#2:78\n11670#2,3:79\n37#3,2:82\n*S KotlinDebug\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections\n*L\n56#1:78\n56#1:79,3\n56#1:82,2\n*E\n"})
/*    */ public final class SentenceWithCorrections { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final Correction[] corrections;
/*    */   
/* 10 */   public SentenceWithCorrections(@NotNull String text, @NotNull Correction[] corrections) { this.text = text; this.corrections = corrections; } @JvmStatic public static final void write$Self(@NotNull SentenceWithCorrections self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeStringElement(serialDesc, 0, self.text); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Correction.class), (KSerializer)Correction.$serializer.INSTANCE), self.corrections); } @NotNull public final String getText() { return this.text; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/SentenceWithCorrections.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/SentenceWithCorrections;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<SentenceWithCorrections> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(SentenceWithCorrections.Correction.class), (KSerializer)SentenceWithCorrections.Correction.$serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SentenceWithCorrections deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Object object = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(SentenceWithCorrections.Correction.class), (KSerializer)SentenceWithCorrections.Correction.$serializer.INSTANCE), object); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(SentenceWithCorrections.Correction.class), (KSerializer)SentenceWithCorrections.Correction.$serializer.INSTANCE), object); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithCorrections(i, str, (SentenceWithCorrections.Correction[])object, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithCorrections value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithCorrections.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.SentenceWithCorrections", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("corrections", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final Correction[] getCorrections() { return this.corrections; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\004¢\006\002\020\bJ\017\020\t\032\b\022\004\022\0020\0050\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/gec/model/SentenceWithCorrections$Companion;", "", "()V", "empty", "", "Lai/grazie/gec/model/SentenceWithCorrections;", "texts", "", "([Ljava/lang/String;)[Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"}) @SourceDebugExtension({"SMAP\nSentenceWithCorrections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n11335#2:78\n11670#2,2:79\n11672#2:82\n26#3:81\n37#4,2:83\n*S KotlinDebug\n*F\n+ 1 SentenceWithCorrections.kt\nai/grazie/gec/model/SentenceWithCorrections$Companion\n*L\n13#1:78\n13#1:79,2\n13#1:82\n13#1:81\n13#1:83,2\n*E\n"}) public static final class Companion { private Companion() {} @NotNull
/* 11 */     public final KSerializer<SentenceWithCorrections> serializer() { return (KSerializer<SentenceWithCorrections>)SentenceWithCorrections.$serializer.INSTANCE; } @NotNull
/*    */     public final SentenceWithCorrections[] empty(@NotNull String[] texts) {
/* 13 */       Intrinsics.checkNotNullParameter(texts, "texts"); String[] arrayOfString1 = texts; int $i$f$map = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 78 */       String[] arrayOfString2 = arrayOfString1; Collection destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 79 */       for (b = 0, i = arrayOfString2.length; b < i; $i$f$emptyArray = 0) { int $i$f$emptyArray; Object item$iv$iv = arrayOfString2[b];
/* 80 */         Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-SentenceWithCorrections$Companion$empty$1 = 0; }
/*    */       
/* 82 */       List list = (List)destination$iv$iv; int $i$f$toTypedArray = 0;
/* 83 */       Collection thisCollection$iv = list;
/* 84 */       return (SentenceWithCorrections[])thisCollection$iv.toArray((Object[])new SentenceWithCorrections[0]);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\021\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 12\0020\001:\00201BQ\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\016\020\t\032\n\022\004\022\0020\b\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B3\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\f\020\t\032\b\022\004\022\0020\b0\n\022\006\020\013\032\0020\f¢\006\002\020\020J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\bHÆ\003J\024\020\036\032\b\022\004\022\0020\b0\nHÆ\003¢\006\002\020\026J\t\020\037\032\0020\fHÆ\003JF\020 \032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\b0\n2\b\b\002\020\013\032\0020\fHÆ\001¢\006\002\020!J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001H\002J\b\020%\032\0020\003H\026J\t\020&\032\0020\bHÖ\001J\016\020'\032\0020\0002\006\020(\032\0020\003J!\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÇ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\023\020\024R\031\020\t\032\b\022\004\022\0020\b0\n¢\006\n\n\002\020\027\032\004\b\025\020\026R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\030\020\031R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\032\020\022¨\0062"}, d2 = {"Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "", "seen1", "", "errorRange", "Lai/grazie/text/TextRange;", "underlineRange", "message", "", "replacements", "", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/text/TextRange;Lai/grazie/text/TextRange;Ljava/lang/String;[Ljava/lang/String;Lai/grazie/gec/model/CorrectionServiceType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/text/TextRange;Lai/grazie/text/TextRange;Ljava/lang/String;[Ljava/lang/String;Lai/grazie/gec/model/CorrectionServiceType;)V", "getErrorRange", "()Lai/grazie/text/TextRange;", "getMessage", "()Ljava/lang/String;", "getReplacements", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getService", "()Lai/grazie/gec/model/CorrectionServiceType;", "getUnderlineRange", "component1", "component2", "component3", "component4", "component5", "copy", "(Lai/grazie/text/TextRange;Lai/grazie/text/TextRange;Ljava/lang/String;[Ljava/lang/String;Lai/grazie/gec/model/CorrectionServiceType;)Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "equals", "", "other", "hashCode", "toString", "withOffset", "offset", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-gec"})
/*    */   public static final class Correction {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final TextRange errorRange;
/*    */     @NotNull
/*    */     private final TextRange underlineRange;
/*    */     @NotNull
/*    */     private final String message;
/*    */     @NotNull
/*    */     private final String[] replacements;
/*    */     @NotNull
/*    */     private final CorrectionServiceType service;
/*    */     
/*    */     public Correction(@NotNull TextRange errorRange, @NotNull TextRange underlineRange, @NotNull String message, @NotNull String[] replacements, @NotNull CorrectionServiceType service) {
/*    */       this.errorRange = errorRange;
/*    */       this.underlineRange = underlineRange;
/*    */       this.message = message;
/*    */       this.replacements = replacements;
/*    */       this.service = service;
/*    */     }
/*    */     
/*    */     @JvmStatic
/*    */     public static final void write$Self(@NotNull Correction self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */       Intrinsics.checkNotNullParameter(self, "self");
/*    */       Intrinsics.checkNotNullParameter(output, "output");
/*    */       Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */       output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)TextRange$.serializer.INSTANCE, self.errorRange);
/*    */       output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)TextRange$.serializer.INSTANCE, self.underlineRange);
/*    */       output.encodeStringElement(serialDesc, 2, self.message);
/*    */       output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), self.replacements);
/*    */       output.encodeSerializableElement(serialDesc, 4, (SerializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), self.service);
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/SentenceWithCorrections.Correction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */     public static final class $serializer implements GeneratedSerializer<Correction> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */         arrayOfKSerializer[0] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */         arrayOfKSerializer[1] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */         arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE);
/*    */         arrayOfKSerializer[4] = (KSerializer)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values());
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SentenceWithCorrections.Correction deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         Object object1 = null, object2 = null;
/*    */         String str = null;
/*    */         Object object3 = null, object4 = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1);
/*    */           i |= 0x1;
/*    */           object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2);
/*    */           i |= 0x2;
/*    */           str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */           i |= 0x4;
/*    */           object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object3);
/*    */           i |= 0x8;
/*    */           object4 = compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object4);
/*    */           i |= 0x10;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */               case 2:
/*    */                 str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */                 i |= 0x4;
/*    */                 continue;
/*    */               case 3:
/*    */                 object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object3);
/*    */                 i |= 0x8;
/*    */                 continue;
/*    */               case 4:
/*    */                 object4 = compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object4);
/*    */                 i |= 0x10;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new SentenceWithCorrections.Correction(i, (TextRange)object1, (TextRange)object2, str, (String[])object3, (CorrectionServiceType)object4, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithCorrections.Correction value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         SentenceWithCorrections.Correction.write$Self(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.SentenceWithCorrections.Correction", INSTANCE, 5);
/*    */         pluginGeneratedSerialDescriptor.addElement("errorRange", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("underlineRange", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("message", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("replacements", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("service", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/SentenceWithCorrections$Correction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "model-gec"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<SentenceWithCorrections.Correction> serializer() {
/*    */         return (KSerializer<SentenceWithCorrections.Correction>)SentenceWithCorrections.Correction.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final TextRange getErrorRange() {
/*    */       return this.errorRange;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final TextRange getUnderlineRange() {
/*    */       return this.underlineRange;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getMessage() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String[] getReplacements() {
/*    */       return this.replacements;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CorrectionServiceType getService() {
/*    */       return this.service;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Correction withOffset(int offset) {
/*    */       return new Correction(ExtensionsKt.withOffset(this.errorRange, offset), ExtensionsKt.withOffset(this.underlineRange, offset), this.message, this.replacements, this.service);
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (other == null || getClass() != other.getClass())
/*    */         return false; 
/*    */       (Correction)other;
/*    */       if (!Intrinsics.areEqual(this.errorRange, ((Correction)other).errorRange))
/*    */         return false; 
/*    */       if (!Intrinsics.areEqual(this.underlineRange, ((Correction)other).underlineRange))
/*    */         return false; 
/*    */       if (!Intrinsics.areEqual(this.message, ((Correction)other).message))
/*    */         return false; 
/*    */       if (!Arrays.equals((Object[])this.replacements, (Object[])((Correction)other).replacements))
/*    */         return false; 
/*    */       if (this.service != ((Correction)other).service)
/*    */         return false; 
/*    */       return true;
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       int result = this.errorRange.hashCode();
/*    */       result = 31 * result + this.underlineRange.hashCode();
/*    */       result = 31 * result + this.message.hashCode();
/*    */       result = 31 * result + Arrays.hashCode((Object[])this.replacements);
/*    */       result = 31 * result + this.service.hashCode();
/*    */       return result;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final TextRange component1() {
/*    */       return this.errorRange;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final TextRange component2() {
/*    */       return this.underlineRange;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component3() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String[] component4() {
/*    */       return this.replacements;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CorrectionServiceType component5() {
/*    */       return this.service;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Correction copy(@NotNull TextRange errorRange, @NotNull TextRange underlineRange, @NotNull String message, @NotNull String[] replacements, @NotNull CorrectionServiceType service) {
/*    */       Intrinsics.checkNotNullParameter(errorRange, "errorRange");
/*    */       Intrinsics.checkNotNullParameter(underlineRange, "underlineRange");
/*    */       Intrinsics.checkNotNullParameter(message, "message");
/*    */       Intrinsics.checkNotNullParameter(replacements, "replacements");
/*    */       Intrinsics.checkNotNullParameter(service, "service");
/*    */       return new Correction(errorRange, underlineRange, message, replacements, service);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Correction(errorRange=" + this.errorRange + ", underlineRange=" + this.underlineRange + ", message=" + this.message + ", replacements=" + Arrays.toString((Object[])this.replacements) + ", service=" + this.service + ")";
/*    */     }
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/SentenceWithCorrections.Correction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */   public static final class $serializer implements GeneratedSerializer<Correction> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */       arrayOfKSerializer[0] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = (KSerializer)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values());
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SentenceWithCorrections.Correction deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Object object1 = null, object2 = null;
/*    */       String str = null;
/*    */       Object object3 = null, object4 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1);
/*    */         i |= 0x1;
/*    */         object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2);
/*    */         i |= 0x2;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object3);
/*    */         i |= 0x8;
/*    */         object4 = compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE), object3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               object4 = compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SentenceWithCorrections.Correction(i, (TextRange)object1, (TextRange)object2, str, (String[])object3, (CorrectionServiceType)object4, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithCorrections.Correction value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SentenceWithCorrections.Correction.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.SentenceWithCorrections.Correction", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("errorRange", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("underlineRange", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("message", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("replacements", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("service", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceWithCorrections withOffset(int offset) {
/*    */     Correction[] arrayOfCorrection1 = this.corrections;
/*    */     String str1 = this.text;
/*    */     int $i$f$map = 0;
/*    */     Correction[] arrayOfCorrection2 = arrayOfCorrection1;
/*    */     Collection<Correction> destination$iv$iv = new ArrayList(arrayOfCorrection1.length);
/*    */     int $i$f$mapTo = 0;
/*    */     byte b;
/*    */     int i;
/*    */     for (b = 0, i = arrayOfCorrection2.length; b < i; ) {
/*    */       Object item$iv$iv = arrayOfCorrection2[b];
/*    */       Object object1 = item$iv$iv;
/*    */       Collection<Correction> collection = destination$iv$iv;
/*    */       int $i$a$-map-SentenceWithCorrections$withOffset$1 = 0;
/*    */       collection.add(object1.withOffset(offset));
/*    */     } 
/*    */     List list = (List)destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/*    */     Collection thisCollection$iv = list;
/*    */     Correction[] arrayOfCorrection3 = (Correction[])thisCollection$iv.toArray((Object[])new Correction[0]);
/*    */     String str2 = str1;
/*    */     return new SentenceWithCorrections(str2, arrayOfCorrection3);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (SentenceWithCorrections)other;
/*    */     if (!Intrinsics.areEqual(this.text, ((SentenceWithCorrections)other).text))
/*    */       return false; 
/*    */     if (!Arrays.equals((Object[])this.corrections, (Object[])((SentenceWithCorrections)other).corrections))
/*    */       return false; 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = this.text.hashCode();
/*    */     result = 31 * result + Arrays.hashCode((Object[])this.corrections);
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Correction[] component2() {
/*    */     return this.corrections;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceWithCorrections copy(@NotNull String text, @NotNull Correction[] corrections) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(corrections, "corrections");
/*    */     return new SentenceWithCorrections(text, corrections);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SentenceWithCorrections(text=" + this.text + ", corrections=" + Arrays.toString((Object[])this.corrections) + ")";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/SentenceWithCorrections.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */