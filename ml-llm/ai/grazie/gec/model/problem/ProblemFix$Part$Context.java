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
/*    */ @SerialName("Context")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \"2\0020\001:\002!\"B7\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\r\022\006\020\004\032\0020\005¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\005HÖ\001J!\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÇ\001R\024\020\b\032\0020\005X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\016¨\006#"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "text", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "getText", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-gec"})
/*    */ public final class Context
/*    */   extends ProblemFix.Part
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull Context self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/* 71 */     Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); ProblemFix.Part.write$Self(self, output, serialDesc); output.encodeStringElement(serialDesc, 0, self.text); if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : (
/*    */ 
/*    */       
/* 74 */       (self.getKind() != ProblemFix.Part.PartKind.CONTEXT))) output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)ProblemFix.Part.PartKind.$serializer.INSTANCE, self.getKind());  if (output.shouldEncodeElementDefault(serialDesc, 2) ? true : (!Intrinsics.areEqual(self.getDisplay(), self.text))) output.encodeStringElement(serialDesc, 2, self.getDisplay());  } @NotNull private final ProblemFix.Part.PartKind kind; @NotNull private final String display; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Context.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<Context> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ProblemFix.Part.PartKind.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ProblemFix.Part.Context deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; Object object = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemFix.Part.PartKind.$serializer.INSTANCE, object); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemFix.Part.PartKind.$serializer.INSTANCE, object); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemFix.Part.Context(i, str1, (ProblemFix.Part.PartKind)object, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Context value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemFix.Part.Context.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Context", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("kind", true); pluginGeneratedSerialDescriptor.addElement("display", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Context$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ProblemFix.Part.Context> serializer() { return (KSerializer<ProblemFix.Part.Context>)ProblemFix.Part.Context.$serializer.INSTANCE; } } public Context(@NotNull String text) { super(null); this.text = text; this.kind = ProblemFix.Part.PartKind.CONTEXT;
/* 75 */     this.display = this.text; } @NotNull public final String getText() { return this.text; } @NotNull public ProblemFix.Part.PartKind getKind() { return this.kind; } @NotNull public String getDisplay() { return this.display; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Context copy(@NotNull String text) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new Context(text);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Context(text=" + this.text + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.text.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Context))
/*    */       return false; 
/*    */     Context context = (Context)other;
/*    */     return !!Intrinsics.areEqual(this.text, context.text);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemFix$Part$Context.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */