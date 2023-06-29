/*    */ package ai.grazie.qa;
/*    */ 
/*    */ import ai.grazie.text.TextRange;
/*    */ import ai.grazie.text.TextRange$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/Document.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/Document;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<Document>
/*    */ {
/*    */   @NotNull
/* 33 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)DocumentId.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TextRange$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Document deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null; String str = null; Object object2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DocumentId.$serializer.INSTANCE, object1); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DocumentId.$serializer.INSTANCE, object1); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Document(i, (DocumentId)object1, str, (TextRange)object2, null); } public void serialize(@NotNull Encoder encoder, @NotNull Document value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Document.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.Document", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("content", false); pluginGeneratedSerialDescriptor.addElement("selection", false); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/qa/Document$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */