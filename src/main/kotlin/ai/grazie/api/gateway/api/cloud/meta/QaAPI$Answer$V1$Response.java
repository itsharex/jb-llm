/*    */ package ai.grazie.api.gateway.api.cloud.meta;
/*    */ 
/*    */ import ai.grazie.qa.Answers;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \0342\0020\001:\002\033\034B#\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J!\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÇ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/api/gateway/api/cloud/meta/QaAPI$Answer$V1$Response;", "", "seen1", "", "answers", "Lai/grazie/qa/Answers;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/qa/Answers;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/qa/Answers;)V", "getAnswers", "()Lai/grazie/qa/Answers;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Response {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 16 */   public Response(@NotNull Answers answers) { this.answers = answers; } @NotNull private final Answers answers; @JvmStatic public static final void write$Self(@NotNull Response self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)Answers$.serializer.INSTANCE, self.answers); } @NotNull public final Answers getAnswers() { return this.answers; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/cloud/meta/QaAPI.Answer.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/cloud/meta/QaAPI$Answer$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */       arrayOfKSerializer[0] = (KSerializer)Answers$.serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public QaAPI.Answer.V1.Response deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Object object = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Answers$.serializer.INSTANCE, object);
/*    */         i |= 0x1;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               object = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Answers$.serializer.INSTANCE, object);
/*    */               i |= 0x1;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new QaAPI.Answer.V1.Response(i, (Answers)object, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Answer.V1.Response value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       QaAPI.Answer.V1.Response.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.cloud.meta.QaAPI.Answer.V1.Response", INSTANCE, 1);
/*    */       pluginGeneratedSerialDescriptor.addElement("answers", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/cloud/meta/QaAPI$Answer$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/cloud/meta/QaAPI$Answer$V1$Response;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<QaAPI.Answer.V1.Response> serializer() {
/*    */       return (KSerializer<QaAPI.Answer.V1.Response>)QaAPI.Answer.V1.Response.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Answers component1() {
/*    */     return this.answers;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Response copy(@NotNull Answers answers) {
/*    */     Intrinsics.checkNotNullParameter(answers, "answers");
/*    */     return new Response(answers);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Response(answers=" + this.answers + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.answers.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Response))
/*    */       return false; 
/*    */     Response response = (Response)other;
/*    */     return !!Intrinsics.areEqual(this.answers, response.answers);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/cloud/meta/QaAPI$Answer$V1$Response.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */