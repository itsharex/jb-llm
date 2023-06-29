/*    */ package ai.grazie.gec.model.problem;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\013\n\002\b\r\b\001\030\000 \0202\b\022\004\022\0020\0000\001:\002\017\020B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\0048F¢\006\006\032\004\b\003\020\005R\021\020\006\032\0020\0048F¢\006\006\032\004\b\006\020\005R\021\020\007\032\0020\0048F¢\006\006\032\004\b\007\020\005j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016¨\006\021"}, d2 = {"Lai/grazie/gec/model/problem/ProblemCategory;", "", "(Ljava/lang/String;I)V", "isSpelling", "", "()Z", "isStyle", "isTypography", "SPELLING", "PUNCTUATION", "TYPOGRAPHY", "GRAMMAR", "SEMANTICS", "STYLE", "OTHER", "$serializer", "Companion", "model-gec"})
/*    */ public enum ProblemCategory {
/* 16 */   SPELLING,
/* 17 */   PUNCTUATION,
/* 18 */   TYPOGRAPHY,
/* 19 */   GRAMMAR,
/* 20 */   SEMANTICS,
/* 21 */   STYLE,
/* 22 */   OTHER; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null); $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, ProblemCategory$Companion$$cachedSerializer$delegate$1.INSTANCE); }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemCategory.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemCategory;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<ProblemCategory> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer();
/* 25 */     @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { return (KSerializer<?>[])new KSerializer[0]; } @NotNull public ProblemCategory deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return ProblemCategory.values()[decoder.decodeEnum(getDescriptor())]; } public void serialize(@NotNull Encoder encoder, @NotNull ProblemCategory value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeEnum(getDescriptor(), value.ordinal()); } static { EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.gec.model.problem.ProblemCategory", 7); enumDescriptor.addElement("SPELLING", false); enumDescriptor.addElement("PUNCTUATION", false); enumDescriptor.addElement("TYPOGRAPHY", false); enumDescriptor.addElement("GRAMMAR", false); enumDescriptor.addElement("SEMANTICS", false); enumDescriptor.addElement("STYLE", false); enumDescriptor.addElement("OTHER", false); descriptor = enumDescriptor; } } public final boolean isSpelling() { return (this == SPELLING); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class ProblemCategory$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final ProblemCategory$Companion$$cachedSerializer$delegate$1 INSTANCE = new ProblemCategory$Companion$$cachedSerializer$delegate$1(); ProblemCategory$Companion$$cachedSerializer$delegate$1() { super(0); } @NotNull public final KSerializer<Object> invoke() { return (KSerializer<Object>)ProblemCategory.$serializer.INSTANCE; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemCategory$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemCategory;", "model-gec"}) public static final class Companion {
/* 28 */     private Companion() {} @NotNull public final KSerializer<ProblemCategory> serializer() { return (KSerializer<ProblemCategory>)get$cachedSerializer$delegate().getValue(); } } public final boolean isStyle() { return (this == STYLE); }
/*    */   
/*    */   public final boolean isTypography() {
/* 31 */     return (this == TYPOGRAPHY);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemCategory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */