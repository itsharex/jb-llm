/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Serializable
/*    */ @SerialName("Skip")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\000 \0352\0020\001:\002\034\035B-\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\005¢\006\002\020\013J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023H\002J\b\020\024\032\0020\003H\026J!\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÇ\001R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\f\020\rR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\017¨\006\036"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "equals", "", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-gec"})
/*    */ public final class Skip
/*    */   extends ProblemFix.Part
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ProblemFix.Part.PartKind kind;
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull Skip self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/* 56 */     Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); ProblemFix.Part.write$Self(self, output, serialDesc); if (output.shouldEncodeElementDefault(serialDesc, 0) ? true : (
/*    */ 
/*    */       
/* 59 */       (self.getKind() != ProblemFix.Part.PartKind.SKIP)))
/* 60 */       output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)ProblemFix.Part.PartKind.$serializer.INSTANCE, self.getKind());  if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : (!Intrinsics.areEqual(self.getDisplay(), "…"))) output.encodeStringElement(serialDesc, 1, self.getDisplay());  } @NotNull private final String display; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Skip.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<Skip> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)ProblemFix.Part.PartKind.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ProblemFix.Part.Skip deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemFix.Part.PartKind.$serializer.INSTANCE, object); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemFix.Part.PartKind.$serializer.INSTANCE, object); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemFix.Part.Skip(i, (ProblemFix.Part.PartKind)object, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Skip value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemFix.Part.Skip.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Skip", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("kind", true); pluginGeneratedSerialDescriptor.addElement("display", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Skip$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ProblemFix.Part.Skip> serializer() { return (KSerializer<ProblemFix.Part.Skip>)ProblemFix.Part.Skip.$serializer.INSTANCE; } } public Skip() { super(null); this.kind = ProblemFix.Part.PartKind.SKIP; this.display = "…"; } @NotNull public ProblemFix.Part.PartKind getKind() { return this.kind; } @NotNull public String getDisplay() { return this.display; }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 63 */     return other instanceof Skip;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 67 */     return ProblemFix.Part.PartKind.SKIP.hashCode();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemFix$Part$Skip.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */