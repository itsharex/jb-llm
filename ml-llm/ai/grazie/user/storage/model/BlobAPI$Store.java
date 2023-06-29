/*    */ package ai.grazie.user.storage.model;
/*    */ import ai.grazie.model.cloud.ContentType;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\bÆ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/user/storage/model/BlobAPI$Store;", "Lai/grazie/model/cloud/API;", "()V", "path", "", "getPath", "()Ljava/lang/String;", "Request", "user-strg-model"})
/*    */ public final class Store implements API {
/*    */   @NotNull
/*  9 */   public static final Store INSTANCE = new Store(); @NotNull private static final String path = "/blob/store"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000  2\0020\001:\002\037 B-\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\005HÖ\001J!\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006!"}, d2 = {"Lai/grazie/user/storage/model/BlobAPI$Store$Request;", "", "seen1", "", "key", "", "contentType", "Lai/grazie/model/cloud/ContentType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/model/cloud/ContentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/model/cloud/ContentType;)V", "getContentType", "()Lai/grazie/model/cloud/ContentType;", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user-strg-model"}) public static final class Request { @NotNull
/*    */     public static final Companion Companion = new Companion(null); @NotNull
/*    */     private final String key; @NotNull
/* 12 */     private final ContentType contentType; public Request(@NotNull String key, @NotNull ContentType contentType) { this.key = key; this.contentType = contentType; } @JvmStatic public static final void write$Self(@NotNull Request self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); output.encodeStringElement(serialDesc, 0, self.key); output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)ContentType.Serializer.INSTANCE, self.contentType); } @NotNull public final String getKey() { return this.key; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/BlobAPI.Store.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/BlobAPI$Store$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ContentType.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public BlobAPI.Store.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Object object = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ContentType.Serializer.INSTANCE, object); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: object = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ContentType.Serializer.INSTANCE, object); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new BlobAPI.Store.Request(i, str, (ContentType)object, null); } public void serialize(@NotNull Encoder encoder, @NotNull BlobAPI.Store.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); BlobAPI.Store.Request.write$Self(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.BlobAPI.Store.Request", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("key", false); pluginGeneratedSerialDescriptor.addElement("contentType", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/BlobAPI$Store$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/BlobAPI$Store$Request;", "user-strg-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<BlobAPI.Store.Request> serializer() { return (KSerializer<BlobAPI.Store.Request>)BlobAPI.Store.Request.$serializer.INSTANCE; } } @NotNull public final ContentType getContentType() { return this.contentType; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.key;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ContentType component2() {
/*    */       return this.contentType;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull String key, @NotNull ContentType contentType) {
/*    */       Intrinsics.checkNotNullParameter(key, "key");
/*    */       Intrinsics.checkNotNullParameter(contentType, "contentType");
/*    */       return new Request(key, contentType);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(key=" + this.key + ", contentType=" + this.contentType + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.key.hashCode();
/*    */       return result * 31 + this.contentType.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !Intrinsics.areEqual(this.key, request.key) ? false : (!!Intrinsics.areEqual(this.contentType, request.contentType));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/user/storage/model/BlobAPI$Store.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */