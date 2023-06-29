/*     */ package ai.grazie.gec.model.problem;
/*     */ 
/*     */ import ai.grazie.text.TextRange;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 72\0020\001:\003678B[\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\016\020\n\032\n\022\004\022\0020\f\030\0010\013\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\016\022\b\020\020\032\004\030\0010\021¢\006\002\020\022BC\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\f\020\n\032\b\022\004\022\0020\f0\013\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\016¢\006\002\020\023J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\007HÆ\003J\t\020\"\032\0020\tHÆ\003J\024\020#\032\b\022\004\022\0020\f0\013HÆ\003¢\006\002\020\030J\013\020$\032\004\030\0010\016HÆ\003J\013\020%\032\004\030\0010\016HÆ\003JT\020&\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\016\b\002\020\n\032\b\022\004\022\0020\f0\0132\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\016HÆ\001¢\006\002\020'J\023\020(\032\0020)2\b\020*\032\004\030\0010\001H\002J\b\020+\032\0020\003H\026J\t\020,\032\0020\007HÖ\001J\016\020-\032\0020\0002\006\020.\032\0020\003J!\020/\032\002002\006\0201\032\0020\0002\006\0202\032\002032\006\0204\032\00205HÇ\001R\023\020\017\032\004\030\0010\016¢\006\b\n\000\032\004\b\024\020\025R\023\020\r\032\004\030\0010\016¢\006\b\n\000\032\004\b\026\020\025R\031\020\n\032\b\022\004\022\0020\f0\013¢\006\n\n\002\020\031\032\004\b\027\020\030R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\032\020\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\034\020\035R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\036\020\037¨\0069"}, d2 = {"Lai/grazie/gec/model/problem/Problem;", "", "seen1", "", "info", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "message", "", "highlighting", "Lai/grazie/gec/model/problem/ProblemHighlighting;", "fixes", "", "Lai/grazie/gec/model/problem/ProblemFix;", "experimental", "Lai/grazie/utils/attributes/Attributes;", "condition", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/Problem$KindInfo;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemHighlighting;[Lai/grazie/gec/model/problem/ProblemFix;Lai/grazie/utils/attributes/Attributes;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/problem/Problem$KindInfo;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemHighlighting;[Lai/grazie/gec/model/problem/ProblemFix;Lai/grazie/utils/attributes/Attributes;Lai/grazie/utils/attributes/Attributes;)V", "getCondition", "()Lai/grazie/utils/attributes/Attributes;", "getExperimental", "getFixes", "()[Lai/grazie/gec/model/problem/ProblemFix;", "[Lai/grazie/gec/model/problem/ProblemFix;", "getHighlighting", "()Lai/grazie/gec/model/problem/ProblemHighlighting;", "getInfo", "()Lai/grazie/gec/model/problem/Problem$KindInfo;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lai/grazie/gec/model/problem/Problem$KindInfo;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemHighlighting;[Lai/grazie/gec/model/problem/ProblemFix;Lai/grazie/utils/attributes/Attributes;Lai/grazie/utils/attributes/Attributes;)Lai/grazie/gec/model/problem/Problem;", "equals", "", "other", "hashCode", "toString", "withOffset", "offset", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KindInfo", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,123:1\n11335#2:124\n11670#2,3:125\n11335#2:130\n11670#2,3:131\n11335#2:136\n11670#2,2:137\n11335#2:139\n11670#2,3:140\n11672#2:145\n37#3,2:128\n37#3,2:134\n37#3,2:143\n37#3,2:146\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem\n*L\n84#1:124\n84#1:125,3\n85#1:130\n85#1:131,3\n87#1:136\n87#1:137,2\n88#1:139\n88#1:140,3\n87#1:145\n84#1:128,2\n85#1:134,2\n94#1:143,2\n95#1:146,2\n*E\n"})
/*     */ public final class Problem {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final KindInfo info;
/*     */   @NotNull
/*     */   private final String message;
/*     */   @NotNull
/*     */   private final ProblemHighlighting highlighting;
/*     */   @NotNull
/*     */   private final ProblemFix[] fixes;
/*     */   @Nullable
/*     */   private final Attributes experimental;
/*     */   @Nullable
/*     */   private final Attributes condition;
/*     */   
/*  30 */   public Problem(@NotNull KindInfo info, @NotNull String message, @NotNull ProblemHighlighting highlighting, @NotNull ProblemFix[] fixes, @Nullable Attributes experimental, @Nullable Attributes condition) { this.info = info;
/*  31 */     this.message = message;
/*  32 */     this.highlighting = highlighting;
/*  33 */     this.fixes = fixes;
/*  34 */     this.experimental = experimental;
/*  35 */     this.condition = condition; } @JvmStatic public static final void write$Self(@NotNull Problem self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)KindInfo.$serializer.INSTANCE, self.info); output.encodeStringElement(serialDesc, 1, self.message); output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)ProblemHighlighting.$serializer.INSTANCE, self.highlighting); output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ProblemFix.class), (KSerializer)ProblemFix.$serializer.INSTANCE), self.fixes); if (output.shouldEncodeElementDefault(serialDesc, 4) ? true : ((self.experimental != null))) output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)Attributes$.serializer.INSTANCE, self.experimental);  if (output.shouldEncodeElementDefault(serialDesc, 5) ? true : ((self.condition != null))) output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)Attributes$.serializer.INSTANCE, self.condition);  } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<Problem> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)Problem.KindInfo.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ProblemHighlighting.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ProblemFix.class), (KSerializer)ProblemFix.$serializer.INSTANCE); arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)Attributes$.serializer.INSTANCE); arrayOfKSerializer[5] = BuiltinSerializersKt.getNullable((KSerializer)Attributes$.serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Problem deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null; String str = null; Object object2 = null, object3 = null, object4 = null, object5 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Problem.KindInfo.$serializer.INSTANCE, object1); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)ProblemHighlighting.$serializer.INSTANCE, object2); i |= 0x4; object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ProblemFix.class), (KSerializer)ProblemFix.$serializer.INSTANCE), object3); i |= 0x8; object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Attributes$.serializer.INSTANCE, object4); i |= 0x10; object5 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Attributes$.serializer.INSTANCE, object5); i |= 0x20; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Problem.KindInfo.$serializer.INSTANCE, object1); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)ProblemHighlighting.$serializer.INSTANCE, object2); i |= 0x4; continue;case 3: object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ProblemFix.class), (KSerializer)ProblemFix.$serializer.INSTANCE), object3); i |= 0x8; continue;case 4: object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Attributes$.serializer.INSTANCE, object4); i |= 0x10; continue;case 5: object5 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Attributes$.serializer.INSTANCE, object5); i |= 0x20; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem(i, (Problem.KindInfo)object1, str, (ProblemHighlighting)object2, (ProblemFix[])object3, (Attributes)object4, (Attributes)object5, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("info", false); pluginGeneratedSerialDescriptor.addElement("message", false); pluginGeneratedSerialDescriptor.addElement("highlighting", false); pluginGeneratedSerialDescriptor.addElement("fixes", false); pluginGeneratedSerialDescriptor.addElement("experimental", true); pluginGeneratedSerialDescriptor.addElement("condition", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final KindInfo getInfo() { return this.info; } @Nullable public final Attributes getCondition() { return this.condition; }
/*     */   @NotNull public final String getMessage() { return this.message; }
/*     */   @NotNull public final ProblemHighlighting getHighlighting() { return this.highlighting; } @NotNull public final ProblemFix[] getFixes() { return this.fixes; } @Nullable
/*     */   public final Attributes getExperimental() { return this.experimental; } @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 *2\0020\001:\002)*BA\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\013HÖ\001J!\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\027¨\006+"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo;", "", "seen1", "", "id", "Lai/grazie/gec/model/problem/ProblemKindID;", "category", "Lai/grazie/gec/model/problem/ProblemCategory;", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "displayName", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/ProblemCategory;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/ProblemCategory;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;)V", "getCategory", "()Lai/grazie/gec/model/problem/ProblemCategory;", "getDisplayName", "()Ljava/lang/String;", "getId", "()Lai/grazie/gec/model/problem/ProblemKindID;", "getService", "()Lai/grazie/gec/model/CorrectionServiceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-gec"})
/*     */   public static final class KindInfo
/*     */   {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null); @NotNull
/*     */     private final ProblemKindID id; @NotNull
/*     */     private final ProblemCategory category; @NotNull
/*     */     private final CorrectionServiceType service; @NotNull
/*  47 */     private final String displayName; public KindInfo(@NotNull ProblemKindID id, @NotNull ProblemCategory category, @NotNull CorrectionServiceType service, @NotNull String displayName) { this.id = id;
/*  48 */       this.category = category;
/*  49 */       this.service = service;
/*  50 */       this.displayName = displayName; } @JvmStatic public static final void write$Self(@NotNull KindInfo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)ProblemKindID.Serializer.INSTANCE, self.id); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)ProblemCategory.$serializer.INSTANCE, self.category); output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), self.service); output.encodeStringElement(serialDesc, 3, self.displayName); } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<KindInfo> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = ProblemKindID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ProblemCategory.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()); arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Problem.KindInfo deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, object1); i |= 0x1; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemCategory.$serializer.INSTANCE, object2); i |= 0x2; object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object3); i |= 0x4; str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemCategory.$serializer.INSTANCE, object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object3); i |= 0x4; continue;case 3: str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem.KindInfo(i, (ProblemKindID)object1, (ProblemCategory)object2, (CorrectionServiceType)object3, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.KindInfo.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("category", false); pluginGeneratedSerialDescriptor.addElement("service", false); pluginGeneratedSerialDescriptor.addElement("displayName", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Problem.KindInfo> serializer() { return (KSerializer<Problem.KindInfo>)Problem.KindInfo.$serializer.INSTANCE; } } @NotNull public final ProblemKindID getId() { return this.id; } @NotNull public final ProblemCategory getCategory() { return this.category; } @NotNull public final CorrectionServiceType getService() { return this.service; } @NotNull public final String getDisplayName() { return this.displayName; } @NotNull public final ProblemKindID component1() { return this.id; } @NotNull public final ProblemCategory component2() { return this.category; } @NotNull public final CorrectionServiceType component3() { return this.service; } @NotNull public final String component4() { return this.displayName; } @NotNull public final KindInfo copy(@NotNull ProblemKindID id, @NotNull ProblemCategory category, @NotNull CorrectionServiceType service, @NotNull String displayName) { Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullParameter(category, "category"); Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(displayName, "displayName"); return new KindInfo(id, category, service, displayName); } @NotNull public String toString() { return "KindInfo(id=" + this.id + ", category=" + this.category + ", service=" + this.service + ", displayName=" + this.displayName + ")"; } public int hashCode() { result = this.id.hashCode(); result = result * 31 + this.category.hashCode(); result = result * 31 + this.service.hashCode(); return result * 31 + this.displayName.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof KindInfo)) return false;  KindInfo kindInfo = (KindInfo)other; return !Intrinsics.areEqual(this.id, kindInfo.id) ? false : ((this.category != kindInfo.category) ? false : ((this.service != kindInfo.service) ? false : (!!Intrinsics.areEqual(this.displayName, kindInfo.displayName)))); }
/*     */   } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<KindInfo> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = ProblemKindID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ProblemCategory.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()); arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Problem.KindInfo deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, object1); i |= 0x1; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemCategory.$serializer.INSTANCE, object2); i |= 0x2; object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object3); i |= 0x4; str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemCategory.$serializer.INSTANCE, object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object3); i |= 0x4; continue;case 3: str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem.KindInfo(i, (ProblemKindID)object1, (ProblemCategory)object2, (CorrectionServiceType)object3, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.KindInfo.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("category", false); pluginGeneratedSerialDescriptor.addElement("service", false); pluginGeneratedSerialDescriptor.addElement("displayName", false); descriptor = pluginGeneratedSerialDescriptor; } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Companion;", "", "()V", "of", "Lai/grazie/gec/model/problem/Problem;", "correction", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"}) @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,123:1\n26#2:124\n11335#3:125\n11670#3,3:126\n37#4,2:129\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n*L\n65#1:124\n67#1:125\n67#1:126,3\n71#1:129,2\n*E\n"}) public static final class Companion { private Companion() {}
/*  53 */     @NotNull public final KSerializer<Problem> serializer() { return (KSerializer<Problem>)Problem.$serializer.INSTANCE; }
/*     */     @NotNull
/*  55 */     public final Problem of(@NotNull SentenceWithCorrections.Correction correction) { Intrinsics.checkNotNullParameter(correction, "correction");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  64 */       TextRange[] arrayOfTextRange = new TextRange[1]; arrayOfTextRange[0] = correction.getUnderlineRange();
/*  65 */       int $i$f$emptyArray = 0;
/*     */       
/*  67 */       String[] arrayOfString1 = correction.getReplacements(); ProblemHighlighting problemHighlighting1 = new ProblemHighlighting(arrayOfTextRange, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 124 */           new TextRange[0]); String str1 = correction.getMessage(); Problem.KindInfo kindInfo1 = new Problem.KindInfo(ProblemKindID.Companion.getLegacy(), ProblemCategory.OTHER, correction.getService(), "legacy"); int $i$f$map = 0;
/* 125 */       String[] arrayOfString2 = arrayOfString1; Collection destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 126 */       for (b = 0, i = arrayOfString2.length; b < i; arrayOfPart = new ProblemFix.Part[1], arrayOfPart[0] = new ProblemFix.Part.Change(correction.getErrorRange(), (String)object1)) { ProblemFix.Part[] arrayOfPart; Object item$iv$iv = arrayOfString2[b];
/* 127 */         Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-Problem$Companion$of$1 = 0; }
/* 128 */        List list2 = (List)destination$iv$iv, list1 = list2; int $i$f$toTypedArray = 0;
/* 129 */       Collection thisCollection$iv = list1; Attributes attributes1 = null, attributes2 = null;
/* 130 */       ProblemFix[] arrayOfProblemFix = (ProblemFix[])thisCollection$iv.toArray((Object[])new ProblemFix[0]); ProblemHighlighting problemHighlighting2 = problemHighlighting1; String str2 = str1; Problem.KindInfo kindInfo2 = kindInfo1; return new Problem(kindInfo2, str2, problemHighlighting2, arrayOfProblemFix, attributes2, attributes1); } } @NotNull public final Problem withOffset(int offset) { TextRange[] arrayOfTextRange2 = this.highlighting.getAlways(); ProblemHighlighting problemHighlighting = this.highlighting; String str = null; KindInfo kindInfo = null; Problem problem = this; int m = 0; TextRange[] arrayOfTextRange4 = arrayOfTextRange2; Collection<TextRange> collection4 = new ArrayList(arrayOfTextRange2.length); int $i$f$mapTo = 0; byte b; int n; for (b = 0, n = arrayOfTextRange4.length; b < n; ) { Object item$iv$iv = arrayOfTextRange4[b]; Object object1 = item$iv$iv; Collection<TextRange> collection = collection4; int $i$a$-map-Problem$withOffset$1 = 0; collection.add(ExtensionsKt.withOffset((TextRange)object1, offset)); }  List list5 = (List)collection4, list3 = list5; int k = 0; Collection collection2 = list3; TextRange[] arrayOfTextRange1 = this.highlighting.getOnHover(), arrayOfTextRange5 = (TextRange[])collection2.toArray((Object[])new TextRange[0]); problemHighlighting = problemHighlighting; str = str; kindInfo = kindInfo; problem = problem; int j = 0; TextRange[] arrayOfTextRange3 = arrayOfTextRange1; Collection<TextRange> collection3 = new ArrayList(arrayOfTextRange1.length); $i$f$mapTo = 0;
/* 131 */     for (b = 0, n = arrayOfTextRange3.length; b < n; ) { Object item$iv$iv = arrayOfTextRange3[b];
/* 132 */       Object object1 = item$iv$iv; Collection<TextRange> collection = collection3; int $i$a$-map-Problem$withOffset$2 = 0; collection.add(ExtensionsKt.withOffset((TextRange)object1, offset)); }
/* 133 */      List list6 = (List)collection3, list2 = list6; int i = 0;
/* 134 */     Collection collection1 = list2; ProblemFix[] arrayOfProblemFix1 = this.fixes;
/* 135 */     problemHighlighting = problemHighlighting.copy(arrayOfTextRange5, (TextRange[])collection1.toArray((Object[])new TextRange[0])); str = str; kindInfo = kindInfo; problem = problem; int $i$f$map = 0;
/* 136 */     ProblemFix[] arrayOfProblemFix2 = arrayOfProblemFix1; Collection destination$iv$iv = new ArrayList(arrayOfProblemFix1.length); $i$f$mapTo = 0;
/* 137 */     for (b = 0, n = arrayOfProblemFix2.length; b < n; ) { Object item$iv$iv = arrayOfProblemFix2[b];
/* 138 */       Object object1 = item$iv$iv; Collection collection6 = destination$iv$iv; int $i$a$-map-Problem$withOffset$3 = 0; ProblemFix.Part[] arrayOfPart1 = object1.getParts(); Object object2 = object1; int i1 = 0;
/* 139 */       ProblemFix.Part[] arrayOfPart2 = arrayOfPart1; Collection collection5 = new ArrayList(arrayOfPart1.length); int i2 = 0;
/* 140 */       boolean bool = false; int i3 = arrayOfPart2.length; }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     List list4 = (List)destination$iv$iv, list1 = list4; int $i$f$toTypedArray = 0;
/* 146 */     Collection thisCollection$iv = list1;
/* 147 */     return copy$default(problem, kindInfo, str, problemHighlighting, (ProblemFix[])thisCollection$iv.toArray((Object[])new ProblemFix[0]), null, null, 51, null); }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     (Problem)other;
/*     */     if (!Intrinsics.areEqual(this.info, ((Problem)other).info))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.message, ((Problem)other).message))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.highlighting, ((Problem)other).highlighting))
/*     */       return false; 
/*     */     if (!Arrays.equals((Object[])this.fixes, (Object[])((Problem)other).fixes))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.experimental, ((Problem)other).experimental))
/*     */       return false; 
/*     */     return Intrinsics.areEqual(this.condition, ((Problem)other).condition);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int result = this.info.hashCode();
/*     */     result = 31 * result + this.message.hashCode();
/*     */     result = 31 * result + this.highlighting.hashCode();
/*     */     result = 31 * result + Arrays.hashCode((Object[])this.fixes);
/*     */     result = 31 * result + ((this.experimental != null) ? this.experimental.hashCode() : 0);
/*     */     result = 31 * result + ((this.condition != null) ? this.condition.hashCode() : 0);
/*     */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final KindInfo component1() {
/*     */     return this.info;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.message;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProblemHighlighting component3() {
/*     */     return this.highlighting;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProblemFix[] component4() {
/*     */     return this.fixes;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Attributes component5() {
/*     */     return this.experimental;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Attributes component6() {
/*     */     return this.condition;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Problem copy(@NotNull KindInfo info, @NotNull String message, @NotNull ProblemHighlighting highlighting, @NotNull ProblemFix[] fixes, @Nullable Attributes experimental, @Nullable Attributes condition) {
/*     */     Intrinsics.checkNotNullParameter(info, "info");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     Intrinsics.checkNotNullParameter(highlighting, "highlighting");
/*     */     Intrinsics.checkNotNullParameter(fixes, "fixes");
/*     */     return new Problem(info, message, highlighting, fixes, experimental, condition);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Problem(info=" + this.info + ", message=" + this.message + ", highlighting=" + this.highlighting + ", fixes=" + Arrays.toString((Object[])this.fixes) + ", experimental=" + this.experimental + ", condition=" + this.condition + ")";
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/Problem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */