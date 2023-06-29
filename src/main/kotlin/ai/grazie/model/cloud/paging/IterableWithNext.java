/*    */ package ai.grazie.model.cloud.paging;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\000\n\002\020\034\n\000\n\002\020\b\n\000\n\002\020 \n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\013\n\002\020\000\n\002\b\002\n\002\020(\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 +*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\002*+B1\b\027\022\006\020\003\032\0020\004\022\016\020\005\032\n\022\004\022\0028\000\030\0010\006\022\006\020\007\032\0020\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\f\020\005\032\b\022\004\022\0028\0000\006\022\006\020\007\032\0020\b¢\006\002\020\fJ\017\020\021\032\b\022\004\022\0028\0000\006HÆ\003J\t\020\022\032\0020\bHÆ\003J)\020\023\032\b\022\004\022\0028\0000\0002\016\b\002\020\005\032\b\022\004\022\0028\0000\0062\b\b\002\020\007\032\0020\bHÆ\001J\023\020\024\032\0020\b2\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\004HÖ\001J\017\020\030\032\b\022\004\022\0028\0000\031H\003J&\020\032\032\b\022\004\022\002H\0330\000\"\004\b\001\020\0332\022\020\034\032\016\022\004\022\0028\000\022\004\022\002H\0330\035J\t\020\036\032\0020\037HÖ\001J;\020 \032\0020!\"\004\b\001\020\"2\f\020#\032\b\022\004\022\002H\"0\0002\006\020$\032\0020%2\006\020&\032\0020'2\f\020(\032\b\022\004\022\002H\"0)HÇ\001R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\r\020\016R\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\017\020\020¨\006,"}, d2 = {"Lai/grazie/model/cloud/paging/IterableWithNext;", "T", "", "seen1", "", "values", "", "hasNext", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Z)V", "getHasNext", "()Z", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "iterator", "", "map", "E", "transform", "Lkotlin/Function1;", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "$serializer", "Companion", "model-cloud"})
/*    */ @SourceDebugExtension({"SMAP\nIterableWithNext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IterableWithNext.kt\nai/grazie/model/cloud/paging/IterableWithNext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1549#2:16\n1620#2,3:17\n*S KotlinDebug\n*F\n+ 1 IterableWithNext.kt\nai/grazie/model/cloud/paging/IterableWithNext\n*L\n7#1:16\n7#1:17,3\n*E\n"})
/*    */ public final class IterableWithNext<T> implements Iterable<T>, KMappedMarker {
/*  6 */   public IterableWithNext(@NotNull List<T> values, boolean hasNext) { this.values = values; this.hasNext = hasNext; } @JvmStatic public static final <T0> void write$Self(@NotNull IterableWithNext self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new ArrayListSerializer(typeSerial0), self.values); output.encodeBooleanElement(serialDesc, 1, self.hasNext); } @NotNull public final List<T> getValues() { return this.values; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\b\007\030\000*\004\b\001\020\0012\016\022\n\022\b\022\004\022\0028\0000\0030\002B\007\b\002¢\006\002\020\004B\025\b\027\022\f\020\005\032\b\022\004\022\0028\0010\006¢\006\002\020\007J\030\020\016\032\f\022\b\022\006\022\002\b\0030\0060\017HÖ\001¢\006\002\020\020J\027\020\021\032\b\022\004\022\0028\0000\0032\006\020\022\032\0020\023HÖ\001J\037\020\024\032\0020\0252\006\020\026\032\0020\0272\f\020\030\032\b\022\004\022\0028\0000\003HÖ\001J\030\020\031\032\f\022\b\022\006\022\002\b\0030\0060\017HÖ\001¢\006\002\020\020R\024\020\b\032\0020\t8VXÖ\005¢\006\006\032\004\b\n\020\013R\032\020\005\032\b\022\004\022\0028\0010\0068BXÂ\005¢\006\006\032\004\b\f\020\r¨\006\032"}, d2 = {"ai/grazie/model/cloud/paging/IterableWithNext.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/cloud/paging/IterableWithNext;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "model-cloud"}) public static final class $serializer<T> implements GeneratedSerializer<IterableWithNext<T>> { private $serializer() { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.cloud.paging.IterableWithNext", this, 2); pluginGeneratedSerialDescriptor.addElement("values", false); pluginGeneratedSerialDescriptor.addElement("hasNext", false); this.descriptor = pluginGeneratedSerialDescriptor; } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)this.descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer(this.typeSerial0); arrayOfKSerializer[1] = (KSerializer)BooleanSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public IterableWithNext<T> deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object = null; boolean bool1 = false; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer(this.typeSerial0), object); i |= 0x1; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer(this.typeSerial0), object); i |= 0x1; continue;case 1: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new IterableWithNext<>(i, (List)object, bool1, null); } public void serialize(@NotNull Encoder encoder, @NotNull IterableWithNext<?> value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); IterableWithNext.write$Self(value, compositeEncoder, serialDescriptor, this.typeSerial0); compositeEncoder.endStructure(serialDescriptor); } @NotNull public KSerializer<?>[] typeParametersSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = this.typeSerial0; return (KSerializer<?>[])arrayOfKSerializer; } private final KSerializer<T> getTypeSerial0() { return (KSerializer)this.typeSerial0; } } public final boolean getHasNext() { return this.hasNext; } @NotNull
/*  7 */   public final <E> IterableWithNext<E> map(@NotNull Function1 transform) { Intrinsics.checkNotNullParameter(transform, "transform"); Iterable<T> $this$map$iv = this.values; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     Iterable<T> iterable1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 17 */     for (T item$iv$iv : iterable1)
/* 18 */       destination$iv$iv.add(transform.invoke(item$iv$iv));  boolean bool = this.hasNext;
/* 19 */     List<? extends T> list = (List)destination$iv$iv;
/*    */     return new IterableWithNext(list, bool); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final List<T> values;
/*    */   private final boolean hasNext;
/*    */   @NotNull
/*    */   private static final SerialDescriptor $cachedDescriptor;
/*    */   
/*    */   static {
/*    */     PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.cloud.paging.IterableWithNext", null, 2);
/*    */     pluginGeneratedSerialDescriptor.addElement("values", false);
/*    */     pluginGeneratedSerialDescriptor.addElement("hasNext", false);
/*    */     $cachedDescriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterator<T> iterator() {
/*    */     return this.values.iterator();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<T> component1() {
/*    */     return this.values;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.hasNext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IterableWithNext<T> copy(@NotNull List<? extends T> values, boolean hasNext) {
/*    */     Intrinsics.checkNotNullParameter(values, "values");
/*    */     return new IterableWithNext(values, hasNext);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "IterableWithNext(values=" + this.values + ", hasNext=" + this.hasNext + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.values.hashCode();
/*    */     if (this.hasNext);
/*    */     return result * 31 + 1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof IterableWithNext))
/*    */       return false; 
/*    */     IterableWithNext iterableWithNext = (IterableWithNext)other;
/*    */     return !Intrinsics.areEqual(this.values, iterableWithNext.values) ? false : (!(this.hasNext != iterableWithNext.hasNext));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\001\020\005J.\020\006\032\b\022\004\022\002H\0050\004\"\004\b\001\020\0052\f\020\007\032\b\022\004\022\002H\0050\b2\f\020\t\032\b\022\004\022\002H\0050\nJ)\020\013\032\016\022\n\022\b\022\004\022\002H\r0\0040\f\"\004\b\001\020\r2\f\020\016\032\b\022\004\022\002H\r0\fHÆ\001¨\006\017"}, d2 = {"Lai/grazie/model/cloud/paging/IterableWithNext$Companion;", "", "()V", "empty", "Lai/grazie/model/cloud/paging/IterableWithNext;", "T", "from", "values", "", "page", "Lai/grazie/model/cloud/paging/IterablePage;", "serializer", "Lkotlinx/serialization/KSerializer;", "T0", "typeSerial0", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final <T0> KSerializer<IterableWithNext<T0>> serializer(@NotNull KSerializer typeSerial0) {
/*    */       Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
/*    */       return (KSerializer<IterableWithNext<T0>>)new IterableWithNext.$serializer(typeSerial0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final <T> IterableWithNext<T> empty() {
/*    */       return new IterableWithNext<>(CollectionsKt.emptyList(), false);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final <T> IterableWithNext<T> from(@NotNull List<? extends T> values, @NotNull IterablePage page) {
/*    */       Intrinsics.checkNotNullParameter(values, "values");
/*    */       Intrinsics.checkNotNullParameter(page, "page");
/*    */       return new IterableWithNext<>(values, (values.size() == page.getSize()));
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/paging/IterableWithNext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */