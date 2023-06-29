/*    */ package ai.grazie.def;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\003-./BS\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\005\022\b\020\013\032\004\030\0010\005\022\b\020\f\032\004\030\0010\r¢\006\002\020\016BA\022\006\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\005\022\n\b\002\020\n\032\004\030\0010\005\022\n\b\002\020\013\032\004\030\0010\005¢\006\002\020\017J\t\020\032\032\0020\005HÆ\003J\024\020\033\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\021J\013\020\034\032\004\030\0010\005HÆ\003J\013\020\035\032\004\030\0010\005HÆ\003J\013\020\036\032\004\030\0010\005HÆ\003JL\020\037\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\0052\n\b\002\020\n\032\004\030\0010\0052\n\b\002\020\013\032\004\030\0010\005HÆ\001¢\006\002\020 J\023\020!\032\0020\"2\b\020#\032\004\030\0010\001H\002J\b\020$\032\0020\003H\026J\t\020%\032\0020\005HÖ\001J!\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÇ\001R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\022\032\004\b\020\020\021R\023\020\013\032\004\030\0010\005¢\006\b\n\000\032\004\b\023\020\024R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\025\020\024R\023\020\t\032\004\030\0010\005¢\006\b\n\000\032\004\b\026\020\024R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\027\020\030\032\004\b\031\020\024¨\0060"}, d2 = {"Lai/grazie/def/WordDefinition;", "", "seen1", "", "word", "", "definitions", "", "Lai/grazie/def/WordDefinition$Definition;", "transcription", "pos", "image_link", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/def/WordDefinition$Definition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/def/WordDefinition$Definition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDefinitions", "()[Lai/grazie/def/WordDefinition$Definition;", "[Lai/grazie/def/WordDefinition$Definition;", "getImage_link", "()Ljava/lang/String;", "getPos", "getTranscription", "getWord$annotations", "()V", "getWord", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;[Lai/grazie/def/WordDefinition$Definition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/grazie/def/WordDefinition;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Definition", "model-def"})
/*    */ @SourceDebugExtension({"SMAP\nWordDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordDefinition.kt\nai/grazie/def/WordDefinition\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,50:1\n26#2:51\n*S KotlinDebug\n*F\n+ 1 WordDefinition.kt\nai/grazie/def/WordDefinition\n*L\n12#1:51\n*E\n"})
/*    */ public final class WordDefinition {
/*    */   public WordDefinition(@NotNull String word, @NotNull Definition[] definitions, @Nullable String transcription, @Nullable String pos, @Nullable String image_link) {
/* 10 */     this.word = word;
/*    */     
/* 12 */     this.definitions = definitions;
/* 13 */     this.transcription = transcription;
/* 14 */     this.pos = pos;
/* 15 */     this.image_link = image_link;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final String word;
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final Definition[] definitions;
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   private final String transcription;
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   private final String pos;
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   private final String image_link;
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull WordDefinition self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */     Intrinsics.checkNotNullParameter(self, "self");
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */     output.encodeStringElement(serialDesc, 0, self.word);
/*    */     int $i$f$emptyArray = 0;
/* 51 */     if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : (!Intrinsics.areEqual(self.definitions, new Definition[0])))
/*    */       output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Definition.class), (KSerializer)Definition.$serializer.INSTANCE), self.definitions); 
/*    */     if (output.shouldEncodeElementDefault(serialDesc, 2) ? true : ((self.transcription != null)))
/*    */       output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)StringSerializer.INSTANCE, self.transcription); 
/*    */     if (output.shouldEncodeElementDefault(serialDesc, 3) ? true : ((self.pos != null)))
/*    */       output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)StringSerializer.INSTANCE, self.pos); 
/*    */     if (output.shouldEncodeElementDefault(serialDesc, 4) ? true : ((self.image_link != null)))
/*    */       output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)StringSerializer.INSTANCE, self.image_link); 
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/def/WordDefinition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/def/WordDefinition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-def"})
/*    */   public static final class $serializer implements GeneratedSerializer<WordDefinition> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(WordDefinition.Definition.class), (KSerializer)WordDefinition.Definition.$serializer.INSTANCE);
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public WordDefinition deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       Object object1 = null, object2 = null, object3 = null, object4 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(WordDefinition.Definition.class), (KSerializer)WordDefinition.Definition.$serializer.INSTANCE), object1);
/*    */         i |= 0x2;
/*    */         object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object2);
/*    */         i |= 0x4;
/*    */         object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, object3);
/*    */         i |= 0x8;
/*    */         object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, object4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(WordDefinition.Definition.class), (KSerializer)WordDefinition.Definition.$serializer.INSTANCE), object1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, object3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, object4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new WordDefinition(i, str, (WordDefinition.Definition[])object1, (String)object2, (String)object3, (String)object4, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull WordDefinition value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       WordDefinition.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.def.WordDefinition", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("text", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("definitions", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("transcription", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("pos", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("image_link", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/def/WordDefinition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/def/WordDefinition;", "model-def"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<WordDefinition> serializer() {
/*    */       return (KSerializer<WordDefinition>)WordDefinition.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getWord() {
/*    */     return this.word;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Definition[] getDefinitions() {
/*    */     return this.definitions;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getTranscription() {
/*    */     return this.transcription;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getPos() {
/*    */     return this.pos;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getImage_link() {
/*    */     return this.image_link;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 (2\0020\001:\002'(BI\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB;\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\n\b\002\020\007\032\004\030\0010\005\022\n\b\002\020\b\032\004\030\0010\005\022\n\b\002\020\t\032\004\030\0010\005¢\006\002\020\rJ\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\003HÆ\003J\013\020\027\032\004\030\0010\005HÆ\003J\013\020\030\032\004\030\0010\005HÆ\003J\013\020\031\032\004\030\0010\005HÆ\003JA\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\0052\n\b\002\020\t\032\004\030\0010\005HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\005HÖ\001J!\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÇ\001R\023\020\t\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\017R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\021\020\022R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\023\020\017R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\017¨\006)"}, d2 = {"Lai/grazie/def/WordDefinition$Definition;", "", "seen1", "", "definition", "", "id", "topic", "tags", "content_link", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent_link", "()Ljava/lang/String;", "getDefinition", "getId", "()I", "getTags", "getTopic", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-def"})
/*    */   public static final class Definition {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final String definition;
/*    */     private final int id;
/*    */     @Nullable
/*    */     private final String topic;
/*    */     @Nullable
/*    */     private final String tags;
/*    */     @Nullable
/*    */     private final String content_link;
/*    */     
/*    */     public Definition(@NotNull String definition, int id, @Nullable String topic, @Nullable String tags, @Nullable String content_link) {
/*    */       this.definition = definition;
/*    */       this.id = id;
/*    */       this.topic = topic;
/*    */       this.tags = tags;
/*    */       this.content_link = content_link;
/*    */     }
/*    */     
/*    */     @JvmStatic
/*    */     public static final void write$Self(@NotNull Definition self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */       Intrinsics.checkNotNullParameter(self, "self");
/*    */       Intrinsics.checkNotNullParameter(output, "output");
/*    */       Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */       output.encodeStringElement(serialDesc, 0, self.definition);
/*    */       if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : ((self.id != -1)))
/*    */         output.encodeIntElement(serialDesc, 1, self.id); 
/*    */       if (output.shouldEncodeElementDefault(serialDesc, 2) ? true : ((self.topic != null)))
/*    */         output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)StringSerializer.INSTANCE, self.topic); 
/*    */       if (output.shouldEncodeElementDefault(serialDesc, 3) ? true : ((self.tags != null)))
/*    */         output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)StringSerializer.INSTANCE, self.tags); 
/*    */       if (output.shouldEncodeElementDefault(serialDesc, 4) ? true : ((self.content_link != null)))
/*    */         output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)StringSerializer.INSTANCE, self.content_link); 
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/def/WordDefinition.Definition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/def/WordDefinition$Definition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-def"})
/*    */     public static final class $serializer implements GeneratedSerializer<Definition> {
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
/*    */         arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */         arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */         arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */         arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public WordDefinition.Definition deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         String str = null;
/*    */         int j = 0;
/*    */         Object object1 = null, object2 = null, object3 = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */           i |= 0x1;
/*    */           j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */           i |= 0x2;
/*    */           object1 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object1);
/*    */           i |= 0x4;
/*    */           object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, object2);
/*    */           i |= 0x8;
/*    */           object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, object3);
/*    */           i |= 0x10;
/*    */         } else {
/*    */           while (bool) {
/*    */             int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (k) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */               case 2:
/*    */                 object1 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object1);
/*    */                 i |= 0x4;
/*    */                 continue;
/*    */               case 3:
/*    */                 object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, object2);
/*    */                 i |= 0x8;
/*    */                 continue;
/*    */               case 4:
/*    */                 object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, object3);
/*    */                 i |= 0x10;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(k);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new WordDefinition.Definition(i, str, j, (String)object1, (String)object2, (String)object3, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull WordDefinition.Definition value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         WordDefinition.Definition.write$Self(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.def.WordDefinition.Definition", INSTANCE, 5);
/*    */         pluginGeneratedSerialDescriptor.addElement("definition", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("id", true);
/*    */         pluginGeneratedSerialDescriptor.addElement("topic", true);
/*    */         pluginGeneratedSerialDescriptor.addElement("tags", true);
/*    */         pluginGeneratedSerialDescriptor.addElement("content_link", true);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/def/WordDefinition$Definition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/def/WordDefinition$Definition;", "model-def"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<WordDefinition.Definition> serializer() {
/*    */         return (KSerializer<WordDefinition.Definition>)WordDefinition.Definition.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getDefinition() {
/*    */       return this.definition;
/*    */     }
/*    */     
/*    */     public final int getId() {
/*    */       return this.id;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String getTopic() {
/*    */       return this.topic;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String getTags() {
/*    */       return this.tags;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String getContent_link() {
/*    */       return this.content_link;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.definition;
/*    */     }
/*    */     
/*    */     public final int component2() {
/*    */       return this.id;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component3() {
/*    */       return this.topic;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component4() {
/*    */       return this.tags;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component5() {
/*    */       return this.content_link;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Definition copy(@NotNull String definition, int id, @Nullable String topic, @Nullable String tags, @Nullable String content_link) {
/*    */       Intrinsics.checkNotNullParameter(definition, "definition");
/*    */       return new Definition(definition, id, topic, tags, content_link);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Definition(definition=" + this.definition + ", id=" + this.id + ", topic=" + this.topic + ", tags=" + this.tags + ", content_link=" + this.content_link + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.definition.hashCode();
/*    */       result = result * 31 + Integer.hashCode(this.id);
/*    */       result = result * 31 + ((this.topic == null) ? 0 : this.topic.hashCode());
/*    */       result = result * 31 + ((this.tags == null) ? 0 : this.tags.hashCode());
/*    */       return result * 31 + ((this.content_link == null) ? 0 : this.content_link.hashCode());
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Definition))
/*    */         return false; 
/*    */       Definition definition = (Definition)other;
/*    */       return !Intrinsics.areEqual(this.definition, definition.definition) ? false : ((this.id != definition.id) ? false : (!Intrinsics.areEqual(this.topic, definition.topic) ? false : (!Intrinsics.areEqual(this.tags, definition.tags) ? false : (!!Intrinsics.areEqual(this.content_link, definition.content_link)))));
/*    */     }
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/def/WordDefinition.Definition.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/def/WordDefinition$Definition;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-def"})
/*    */   public static final class $serializer implements GeneratedSerializer<Definition> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public WordDefinition.Definition deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       int j = 0;
/*    */       Object object1 = null, object2 = null, object3 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         object1 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object1);
/*    */         i |= 0x4;
/*    */         object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, object2);
/*    */         i |= 0x8;
/*    */         object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, object3);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               object1 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, object1);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, object2);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, object3);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new WordDefinition.Definition(i, str, j, (String)object1, (String)object2, (String)object3, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull WordDefinition.Definition value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       WordDefinition.Definition.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.def.WordDefinition.Definition", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("definition", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("topic", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("tags", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("content_link", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (WordDefinition)other;
/*    */     if (!Intrinsics.areEqual(this.word, ((WordDefinition)other).word))
/*    */       return false; 
/*    */     if (!Arrays.equals((Object[])this.definitions, (Object[])((WordDefinition)other).definitions))
/*    */       return false; 
/*    */     if (!Intrinsics.areEqual(this.transcription, ((WordDefinition)other).transcription))
/*    */       return false; 
/*    */     if (!Intrinsics.areEqual(this.pos, ((WordDefinition)other).pos))
/*    */       return false; 
/*    */     if (!Intrinsics.areEqual(this.image_link, ((WordDefinition)other).image_link))
/*    */       return false; 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = this.word.hashCode();
/*    */     result = 31 * result + Arrays.hashCode((Object[])this.definitions);
/*    */     result = 31 * result + ((this.transcription != null) ? this.transcription.hashCode() : 0);
/*    */     result = 31 * result + ((this.pos != null) ? this.pos.hashCode() : 0);
/*    */     result = 31 * result + ((this.image_link != null) ? this.image_link.hashCode() : 0);
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.word;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Definition[] component2() {
/*    */     return this.definitions;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.transcription;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.pos;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.image_link;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final WordDefinition copy(@NotNull String word, @NotNull Definition[] definitions, @Nullable String transcription, @Nullable String pos, @Nullable String image_link) {
/*    */     Intrinsics.checkNotNullParameter(word, "word");
/*    */     Intrinsics.checkNotNullParameter(definitions, "definitions");
/*    */     return new WordDefinition(word, definitions, transcription, pos, image_link);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "WordDefinition(word=" + this.word + ", definitions=" + Arrays.toString((Object[])this.definitions) + ", transcription=" + this.transcription + ", pos=" + this.pos + ", image_link=" + this.image_link + ")";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/def/WordDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */