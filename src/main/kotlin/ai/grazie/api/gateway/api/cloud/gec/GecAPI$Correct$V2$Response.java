/*    */ package ai.grazie.api.gateway.api.cloud.gec;
/*    */ 
/*    */ import ai.grazie.gec.model.problem.SentenceWithProblems;
/*    */ import ai.grazie.gec.model.problem.SentenceWithProblems$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \0352\0020\001:\002\034\035B)\b\027\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J!\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÇ\001R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/cloud/gec/GecAPI$Correct$V2$Response;", "", "seen1", "", "corrections", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getCorrections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Response {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 30 */   public Response(@NotNull List<SentenceWithProblems> corrections) { this.corrections = corrections; } @NotNull private final List<SentenceWithProblems> corrections; @NotNull public final List<SentenceWithProblems> getCorrections() { return this.corrections; }
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull Response self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */     Intrinsics.checkNotNullParameter(self, "self");
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */     output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new ArrayListSerializer((KSerializer)SentenceWithProblems$.serializer.INSTANCE), self.corrections);
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/cloud/gec/GecAPI.Correct.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/cloud/gec/GecAPI$Correct$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */   public static final class $serializer implements GeneratedSerializer<Response> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SentenceWithProblems$.serializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public GecAPI.Correct.V2.Response deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Object object = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)SentenceWithProblems$.serializer.INSTANCE), object);
/*    */         i |= 0x1;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)SentenceWithProblems$.serializer.INSTANCE), object);
/*    */               i |= 0x1;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new GecAPI.Correct.V2.Response(i, (List)object, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull GecAPI.Correct.V2.Response value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       GecAPI.Correct.V2.Response.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.cloud.gec.GecAPI.Correct.V2.Response", INSTANCE, 1);
/*    */       pluginGeneratedSerialDescriptor.addElement("corrections", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/cloud/gec/GecAPI$Correct$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/cloud/gec/GecAPI$Correct$V2$Response;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GecAPI.Correct.V2.Response> serializer() {
/*    */       return (KSerializer<GecAPI.Correct.V2.Response>)GecAPI.Correct.V2.Response.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SentenceWithProblems> component1() {
/*    */     return this.corrections;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Response copy(@NotNull List<SentenceWithProblems> corrections) {
/*    */     Intrinsics.checkNotNullParameter(corrections, "corrections");
/*    */     return new Response(corrections);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Response(corrections=" + this.corrections + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.corrections.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Response))
/*    */       return false; 
/*    */     Response response = (Response)other;
/*    */     return !!Intrinsics.areEqual(this.corrections, response.corrections);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/cloud/gec/GecAPI$Correct$V2$Response.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */