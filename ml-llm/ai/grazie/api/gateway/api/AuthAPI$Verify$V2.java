/*    */ package ai.grazie.api.gateway.api;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\bÆ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$Verify$V2;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "Response", "api-gateway-api"})
/*    */ public final class V2 implements API {
/*    */   @NotNull
/* 22 */   public static final V2 INSTANCE = new V2(); @NotNull private static final String path = "/auth/jwt/verify"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 \0342\0020\001:\002\033\034B#\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\017\022\b\020\004\032\004\030\0010\005¢\006\002\020\tJ\013\020\f\032\004\030\0010\005HÆ\003J\025\020\r\032\0020\0002\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J!\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÇ\001R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response;", "", "seen1", "", "expires", "Lai/grazie/utils/mpp/time/Timestamp;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/time/Timestamp;)V", "getExpires", "()Lai/grazie/utils/mpp/time/Timestamp;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Response { @NotNull
/*    */     public static final Companion Companion = new Companion(null); @Nullable
/* 25 */     private final Timestamp expires; public Response(@Nullable Timestamp expires) { this.expires = expires; } @Nullable public final Timestamp getExpires() { return this.expires; }
/*    */ 
/*    */     
/*    */     @JvmStatic
/*    */     public static final void write$Self(@NotNull Response self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */       Intrinsics.checkNotNullParameter(self, "self");
/*    */       Intrinsics.checkNotNullParameter(output, "output");
/*    */       Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */       output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)Timestamp.Serializer.INSTANCE, self.expires);
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.Verify.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */     public static final class $serializer implements GeneratedSerializer<Response> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */         arrayOfKSerializer[0] = BuiltinSerializersKt.getNullable((KSerializer)Timestamp.Serializer.INSTANCE);
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public AuthAPI.Verify.V2.Response deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         Object object = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           object = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, object);
/*    */           i |= 0x1;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 object = compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, object);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new AuthAPI.Verify.V2.Response(i, (Timestamp)object, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.Verify.V2.Response value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         AuthAPI.Verify.V2.Response.write$Self(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.Verify.V2.Response", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("expires", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AuthAPI.Verify.V2.Response> serializer() {
/*    */         return (KSerializer<AuthAPI.Verify.V2.Response>)AuthAPI.Verify.V2.Response.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Timestamp component1() {
/*    */       return this.expires;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@Nullable Timestamp expires) {
/*    */       return new Response(expires);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(expires=" + this.expires + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return (this.expires == null) ? 0 : this.expires.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.expires, response.expires);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/api/gateway/api/AuthAPI$Verify$V2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */