/*    */ package ai.grazie.gec.model.problem;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 (2\0020\001:\002'(B=\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\016\020\b\032\n\022\004\022\0020\n\030\0010\t\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\016J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J\024\020\030\032\b\022\004\022\0020\n0\tHÆ\003¢\006\002\020\022J2\020\031\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001¢\006\002\020\032J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001H\002J\b\020\036\032\0020\003H\026J\t\020\037\032\0020\005HÖ\001J!\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\031\020\b\032\b\022\004\022\0020\n0\t¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/gec/model/problem/SentenceWithProblems;", "", "seen1", "", "sentence", "", "language", "Lai/grazie/nlp/langs/Language;", "problems", "", "Lai/grazie/gec/model/problem/Problem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/nlp/langs/Language;[Lai/grazie/gec/model/problem/Problem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;[Lai/grazie/gec/model/problem/Problem;)V", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getProblems", "()[Lai/grazie/gec/model/problem/Problem;", "[Lai/grazie/gec/model/problem/Problem;", "getSentence", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;[Lai/grazie/gec/model/problem/Problem;)Lai/grazie/gec/model/problem/SentenceWithProblems;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-gec"})
/*    */ public final class SentenceWithProblems { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String sentence; @NotNull
/*    */   private final Language language;
/*    */   @NotNull
/*    */   private final Problem[] problems;
/*    */   
/* 10 */   public SentenceWithProblems(@NotNull String sentence, @NotNull Language language, @NotNull Problem[] problems) { this.sentence = sentence; this.language = language; this.problems = problems; } @JvmStatic public static final void write$Self(@NotNull SentenceWithProblems self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeStringElement(serialDesc, 0, self.sentence); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)Language.Serializer.INSTANCE, self.language); output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Problem.class), (KSerializer)Problem.$serializer.INSTANCE), self.problems); } @NotNull public final String getSentence() { return this.sentence; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/SentenceWithProblems.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<SentenceWithProblems> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Problem.class), (KSerializer)Problem.$serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SentenceWithProblems deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Object object1 = null, object2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, object1); i |= 0x2; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Problem.class), (KSerializer)Problem.$serializer.INSTANCE), object2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, object1); i |= 0x2; continue;case 2: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Problem.class), (KSerializer)Problem.$serializer.INSTANCE), object2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithProblems(i, str, (Language)object1, (Problem[])object2, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithProblems value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithProblems.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.SentenceWithProblems", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("sentence", false); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("problems", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final Language getLanguage() { return this.language; } @NotNull public final Problem[] getProblems() { return this.problems; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J'\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\0042\006\020\b\032\0020\t¢\006\002\020\nJ\026\020\013\032\0020\0052\006\020\b\032\0020\t2\006\020\f\032\0020\rJ\017\020\016\032\b\022\004\022\0020\0050\017HÆ\001¨\006\020"}, d2 = {"Lai/grazie/gec/model/problem/SentenceWithProblems$Companion;", "", "()V", "empty", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "sentences", "", "language", "Lai/grazie/nlp/langs/Language;", "([Ljava/lang/String;Lai/grazie/nlp/langs/Language;)[Lai/grazie/gec/model/problem/SentenceWithProblems;", "of", "corrections", "Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"}) @SourceDebugExtension({"SMAP\nSentenceWithProblems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,42:1\n11335#2:43\n11670#2,2:44\n11672#2:47\n11335#2:50\n11670#2,3:51\n26#3:46\n37#4,2:48\n37#4,2:54\n*S KotlinDebug\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n*L\n13#1:43\n13#1:44,2\n13#1:47\n17#1:50\n17#1:51,3\n13#1:46\n13#1:48,2\n20#1:54,2\n*E\n"}) public static final class Companion { private Companion() {} @NotNull
/* 11 */     public final KSerializer<SentenceWithProblems> serializer() { return (KSerializer<SentenceWithProblems>)SentenceWithProblems.$serializer.INSTANCE; }
/*    */     @NotNull
/* 13 */     public final SentenceWithProblems[] empty(@NotNull String[] sentences, @NotNull Language language) { Intrinsics.checkNotNullParameter(sentences, "sentences"); Intrinsics.checkNotNullParameter(language, "language"); String[] arrayOfString1 = sentences; int $i$f$map = 0;
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
/* 43 */       String[] arrayOfString2 = arrayOfString1; Collection destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 44 */       for (b = 0, i = arrayOfString2.length; b < i; $i$f$emptyArray = 0) { int $i$f$emptyArray; Object item$iv$iv = arrayOfString2[b];
/* 45 */         Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$empty$1 = 0; }
/*    */       
/* 47 */       List list = (List)destination$iv$iv; int $i$f$toTypedArray = 0;
/* 48 */       Collection thisCollection$iv = list;
/* 49 */       return (SentenceWithProblems[])thisCollection$iv.toArray((Object[])new SentenceWithProblems[0]); } @NotNull public final SentenceWithProblems of(@NotNull Language language, @NotNull SentenceWithCorrections corrections) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(corrections, "corrections"); SentenceWithCorrections.Correction[] arrayOfCorrection1 = corrections.getCorrections(); int $i$f$map = 0;
/* 50 */       SentenceWithCorrections.Correction[] arrayOfCorrection2 = arrayOfCorrection1; Collection<Problem> destination$iv$iv = new ArrayList(arrayOfCorrection1.length); int $i$f$mapTo = 0; byte b; int i;
/* 51 */       for (b = 0, i = arrayOfCorrection2.length; b < i; ) { Object item$iv$iv = arrayOfCorrection2[b];
/* 52 */         Object object1 = item$iv$iv; Collection<Problem> collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$of$problems$1 = 0; collection.add(Problem.Companion.of((SentenceWithCorrections.Correction)object1)); }
/* 53 */        List problems = (List)destination$iv$iv; Collection $this$toTypedArray$iv = problems; int $i$f$toTypedArray = 0;
/* 54 */       Collection thisCollection$iv = $this$toTypedArray$iv;
/* 55 */       return new SentenceWithProblems(corrections.getText(), language, (Problem[])thisCollection$iv.toArray((Object[])new Problem[0])); }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (SentenceWithProblems)other;
/*    */     if (!Intrinsics.areEqual(this.sentence, ((SentenceWithProblems)other).sentence))
/*    */       return false; 
/*    */     if (this.language != ((SentenceWithProblems)other).language)
/*    */       return false; 
/*    */     return Arrays.equals((Object[])this.problems, (Object[])((SentenceWithProblems)other).problems);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = this.sentence.hashCode();
/*    */     result = 31 * result + this.language.hashCode();
/*    */     result = 31 * result + Arrays.hashCode((Object[])this.problems);
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.sentence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component2() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Problem[] component3() {
/*    */     return this.problems;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceWithProblems copy(@NotNull String sentence, @NotNull Language language, @NotNull Problem[] problems) {
/*    */     Intrinsics.checkNotNullParameter(sentence, "sentence");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(problems, "problems");
/*    */     return new SentenceWithProblems(sentence, language, problems);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SentenceWithProblems(sentence=" + this.sentence + ", language=" + this.language + ", problems=" + Arrays.toString((Object[])this.problems) + ")";
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/SentenceWithProblems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */