/*    */ package ai.grazie.api.gateway.api.cloud.trf;
/*    */ 
/*    */ import ai.grazie.sum.Format;
/*    */ import ai.grazie.sum.Format$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/cloud/trf/SumAPI.Summarize.WithCache.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */ public final class $serializer
/*    */   implements GeneratedSerializer<SumAPI.Summarize.WithCache.V1.Request>
/*    */ {
/*    */   @NotNull
/* 48 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)Format$.serializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SumAPI.Summarize.WithCache.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null, object4 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object1); i |= 0x1; object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Format$.serializer.INSTANCE, object2); i |= 0x2; object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, object3); i |= 0x4; object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, object4); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Format$.serializer.INSTANCE, object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, object3); i |= 0x4; continue;case 3: object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, object4); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SumAPI.Summarize.WithCache.V1.Request(i, (List)object1, (Format)object2, (Integer)object3, (Integer)object4, null); } public void serialize(@NotNull Encoder encoder, @NotNull SumAPI.Summarize.WithCache.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SumAPI.Summarize.WithCache.V1.Request.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.cloud.trf.SumAPI.Summarize.WithCache.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("texts", false); pluginGeneratedSerialDescriptor.addElement("format", true); pluginGeneratedSerialDescriptor.addElement("minimumBPE", true); pluginGeneratedSerialDescriptor.addElement("maximumBPE", true); descriptor = pluginGeneratedSerialDescriptor; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */