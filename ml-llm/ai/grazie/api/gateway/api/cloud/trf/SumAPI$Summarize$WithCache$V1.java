/*    */ package ai.grazie.api.gateway.api.cloud.trf;
/*    */ 
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.sum.Format;
/*    */ import ai.grazie.sum.Format$;
/*    */ import ai.grazie.sum.SentenceWithSummaries;
/*    */ import ai.grazie.sum.SentenceWithSummaries$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "Request", "Response", "api-gateway-api"})
/*    */ public final class V1
/*    */   implements API
/*    */ {
/*    */   @NotNull
/* 46 */   public static final V1 INSTANCE = new V1(); @NotNull private static final String path = "/trf/sum/summarize-with-cache"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\021\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 +2\0020\001:\002*+BG\b\027\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\003\022\b\020\n\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB7\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\003\022\n\b\002\020\n\032\004\030\0010\003¢\006\002\020\016J\017\020\027\032\b\022\004\022\0020\0060\005HÆ\003J\013\020\030\032\004\030\0010\bHÆ\003J\020\020\031\032\004\030\0010\003HÆ\003¢\006\002\020\022J\020\020\032\032\004\030\0010\003HÆ\003¢\006\002\020\022JB\020\033\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\0032\n\b\002\020\n\032\004\030\0010\003HÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020\006HÖ\001J!\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÇ\001R\026\020\007\032\004\030\0010\bX\004¢\006\b\n\000\032\004\b\017\020\020R\030\020\n\032\004\030\0010\003X\004¢\006\n\n\002\020\023\032\004\b\021\020\022R\030\020\t\032\004\030\0010\003X\004¢\006\n\n\002\020\023\032\004\b\024\020\022R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\025\020\026¨\006,"}, d2 = {"Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request;", "Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$SummarizeRequest;", "seen1", "", "texts", "", "", "format", "Lai/grazie/sum/Format;", "minimumBPE", "maximumBPE", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFormat", "()Lai/grazie/sum/Format;", "getMaximumBPE", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinimumBPE", "getTexts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"}) public static final class Request implements SumAPI.Summarize.SummarizeRequest { @NotNull
/*    */     public static final Companion Companion = new Companion(null); @NotNull
/*    */     private final List<String> texts; @Nullable
/*    */     private final Format format; @Nullable
/* 50 */     private final Integer minimumBPE; public Request(@NotNull List<String> texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE) { this.texts = texts;
/* 51 */       this.format = format;
/* 52 */       this.minimumBPE = minimumBPE;
/* 53 */       this.maximumBPE = maximumBPE; } @Nullable private final Integer maximumBPE; @JvmStatic public static final void write$Self(@NotNull Request self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), self.texts); if (output.shouldEncodeElementDefault(serialDesc, 1) ? true : ((self.getFormat() != null))) output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)Format$.serializer.INSTANCE, self.getFormat());  if (output.shouldEncodeElementDefault(serialDesc, 2) ? true : ((self.getMinimumBPE() != null))) output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)IntSerializer.INSTANCE, self.getMinimumBPE());  if (output.shouldEncodeElementDefault(serialDesc, 3) ? true : ((self.getMaximumBPE() != null))) output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)IntSerializer.INSTANCE, self.getMaximumBPE());  } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/cloud/trf/SumAPI.Summarize.WithCache.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)Format$.serializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SumAPI.Summarize.WithCache.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object1 = null, object2 = null, object3 = null, object4 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object1); i |= 0x1; object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Format$.serializer.INSTANCE, object2); i |= 0x2; object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, object3); i |= 0x4; object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, object4); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), object1); i |= 0x1; continue;case 1: object2 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Format$.serializer.INSTANCE, object2); i |= 0x2; continue;case 2: object3 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, object3); i |= 0x4; continue;case 3: object4 = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, object4); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SumAPI.Summarize.WithCache.V1.Request(i, (List)object1, (Format)object2, (Integer)object3, (Integer)object4, null); } public void serialize(@NotNull Encoder encoder, @NotNull SumAPI.Summarize.WithCache.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SumAPI.Summarize.WithCache.V1.Request.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.cloud.trf.SumAPI.Summarize.WithCache.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("texts", false); pluginGeneratedSerialDescriptor.addElement("format", true); pluginGeneratedSerialDescriptor.addElement("minimumBPE", true); pluginGeneratedSerialDescriptor.addElement("maximumBPE", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SumAPI.Summarize.WithCache.V1.Request> serializer() { return (KSerializer<SumAPI.Summarize.WithCache.V1.Request>)SumAPI.Summarize.WithCache.V1.Request.$serializer.INSTANCE; } } @NotNull public final List<String> getTexts() { return this.texts; } @Nullable public Format getFormat() { return this.format; } @Nullable public Integer getMinimumBPE() { return this.minimumBPE; } @Nullable public Integer getMaximumBPE() { return this.maximumBPE; } @NotNull public final List<String> component1() { return this.texts; } @Nullable public final Format component2() { return getFormat(); } @Nullable public final Integer component3() { return getMinimumBPE(); } @Nullable public final Integer component4() { return getMaximumBPE(); } @NotNull public final Request copy(@NotNull List<String> texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE) { Intrinsics.checkNotNullParameter(texts, "texts"); return new Request(texts, format, minimumBPE, maximumBPE); } @NotNull public String toString() { return "Request(texts=" + this.texts + ", format=" + getFormat() + ", minimumBPE=" + getMinimumBPE() + ", maximumBPE=" + getMaximumBPE() + ")"; }
/*    */     public int hashCode() { result = this.texts.hashCode(); result = result * 31 + ((getFormat() == null) ? 0 : getFormat().hashCode()); result = result * 31 + ((getMinimumBPE() == null) ? 0 : getMinimumBPE().hashCode()); return result * 31 + ((getMaximumBPE() == null) ? 0 : getMaximumBPE().hashCode()); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.texts, request.texts) ? false : ((getFormat() != request.getFormat()) ? false : (!Intrinsics.areEqual(getMinimumBPE(), request.getMinimumBPE()) ? false : (!!Intrinsics.areEqual(getMaximumBPE(), request.getMaximumBPE())))); } }
/*    */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \0352\0020\001:\002\034\035B)\b\027\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J!\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÇ\001R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response;", "", "seen1", "", "summaries", "", "Lai/grazie/sum/SentenceWithSummaries;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getSummaries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<SentenceWithSummaries> summaries;
/* 57 */     public Response(@NotNull List<SentenceWithSummaries> summaries) { this.summaries = summaries; } @JvmStatic public static final void write$Self(@NotNull Response self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new ArrayListSerializer((KSerializer)SentenceWithSummaries$.serializer.INSTANCE), self.summaries); } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/cloud/trf/SumAPI.Summarize.WithCache.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SentenceWithSummaries$.serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SumAPI.Summarize.WithCache.V1.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Object object = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)SentenceWithSummaries$.serializer.INSTANCE), object); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)SentenceWithSummaries$.serializer.INSTANCE), object); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SumAPI.Summarize.WithCache.V1.Response(i, (List)object, null); } public void serialize(@NotNull Encoder encoder, @NotNull SumAPI.Summarize.WithCache.V1.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SumAPI.Summarize.WithCache.V1.Response.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.cloud.trf.SumAPI.Summarize.WithCache.V1.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("summaries", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SumAPI.Summarize.WithCache.V1.Response> serializer() { return (KSerializer<SumAPI.Summarize.WithCache.V1.Response>)SumAPI.Summarize.WithCache.V1.Response.$serializer.INSTANCE; } } @NotNull public final List<SentenceWithSummaries> getSummaries() { return this.summaries; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final List<SentenceWithSummaries> component1() {
/*    */       return this.summaries;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@NotNull List<SentenceWithSummaries> summaries) {
/*    */       Intrinsics.checkNotNullParameter(summaries, "summaries");
/*    */       return new Response(summaries);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(summaries=" + this.summaries + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.summaries.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.summaries, response.summaries);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/cloud/trf/SumAPI$Summarize$WithCache$V1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */