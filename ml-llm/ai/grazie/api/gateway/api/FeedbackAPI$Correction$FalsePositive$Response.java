/*    */ package ai.grazie.api.gateway.api;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\t\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \0322\0020\001:\002\031\032B!\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\013\032\0020\005HÆ\003J\023\020\f\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\r\032\0020\0052\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\003HÖ\001J\t\020\020\032\0020\021HÖ\001J!\020\022\032\0020\0232\006\020\024\032\0020\0002\006\020\025\032\0020\0262\006\020\027\032\0020\030HÇ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\n¨\006\033"}, d2 = {"Lai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response;", "", "seen1", "", "isOk", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Response {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 16 */   public Response(boolean isOk) { this.isOk = isOk; } private final boolean isOk; @JvmStatic public static final void write$Self(@NotNull Response self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeBooleanElement(serialDesc, 0, self.isOk); } public final boolean isOk() { return this.isOk; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/FeedbackAPI.Correction.FalsePositive.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */       arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public FeedbackAPI.Correction.FalsePositive.Response deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       boolean bool1 = false;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new FeedbackAPI.Correction.FalsePositive.Response(i, bool1, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull FeedbackAPI.Correction.FalsePositive.Response value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       FeedbackAPI.Correction.FalsePositive.Response.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.FeedbackAPI.Correction.FalsePositive.Response", INSTANCE, 1);
/*    */       pluginGeneratedSerialDescriptor.addElement("isOk", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<FeedbackAPI.Correction.FalsePositive.Response> serializer() {
/*    */       return (KSerializer<FeedbackAPI.Correction.FalsePositive.Response>)FeedbackAPI.Correction.FalsePositive.Response.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   public final boolean component1() {
/*    */     return this.isOk;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Response copy(boolean isOk) {
/*    */     return new Response(isOk);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Response(isOk=" + this.isOk + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     if (this.isOk);
/*    */     return 1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Response))
/*    */       return false; 
/*    */     Response response = (Response)other;
/*    */     return !(this.isOk != response.isOk);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/FeedbackAPI$Correction$FalsePositive$Response.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */