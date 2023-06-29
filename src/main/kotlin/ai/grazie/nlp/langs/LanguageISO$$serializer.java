/*    */ package ai.grazie.nlp.langs;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/nlp/langs/LanguageISO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/nlp/langs/LanguageISO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "nlp-langs"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<LanguageISO>
/*    */ {
/*    */   @NotNull
/* 27 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { return (KSerializer<?>[])new KSerializer[0]; } @NotNull public LanguageISO deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return LanguageISO.values()[decoder.decodeEnum(getDescriptor())]; } public void serialize(@NotNull Encoder encoder, @NotNull LanguageISO value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeEnum(getDescriptor(), value.ordinal()); } static { EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.nlp.langs.LanguageISO", 32); enumDescriptor.addElement("AST", false); enumDescriptor.addElement("DE", false); enumDescriptor.addElement("EL", false); enumDescriptor.addElement("KM", false); enumDescriptor.addElement("EN", false); enumDescriptor.addElement("SL", false); enumDescriptor.addElement("SV", false); enumDescriptor.addElement("TL", false); enumDescriptor.addElement("BR", false); enumDescriptor.addElement("EO", false); enumDescriptor.addElement("CA", false); enumDescriptor.addElement("GL", false); enumDescriptor.addElement("GA", false); enumDescriptor.addElement("DA", false); enumDescriptor.addElement("ES", false); enumDescriptor.addElement("TA", false); enumDescriptor.addElement("AR", false); enumDescriptor.addElement("FA", false); enumDescriptor.addElement("FR", false); enumDescriptor.addElement("IT", false); enumDescriptor.addElement("JA", false); enumDescriptor.addElement("KO", false); enumDescriptor.addElement("NL", false); enumDescriptor.addElement("PL", false); enumDescriptor.addElement("PT", false); enumDescriptor.addElement("RO", false); enumDescriptor.addElement("RU", false); enumDescriptor.addElement("SK", false); enumDescriptor.addElement("UK", false); enumDescriptor.addElement("BE", false); enumDescriptor.addElement("ZH", false); enumDescriptor.addElement("UNKNOWN", false); descriptor = enumDescriptor; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/langs/LanguageISO$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */