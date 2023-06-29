/*    */ package ai.grazie.model.llm.stream;
/*    */ 
/*    */ @Serializable(with = LLMStreamID.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\b\030\000 \0202\0020\001:\002\020\021B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\017HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/model/llm/stream/LLMStreamID;", "", "id", "Lai/grazie/utils/mpp/UUID;", "(Lai/grazie/utils/mpp/UUID;)V", "getId", "()Lai/grazie/utils/mpp/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Serializer", "model-llm"})
/*    */ public final class LLMStreamID {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final UUID id;
/*    */   
/* 11 */   public LLMStreamID(@NotNull UUID id) { this.id = id; } @NotNull public final UUID getId() { return this.id; } @NotNull public final UUID component1() { return this.id; } @NotNull public final LLMStreamID copy(@NotNull UUID id) { Intrinsics.checkNotNullParameter(id, "id"); return new LLMStreamID(id); } @NotNull public String toString() { return "LLMStreamID(id=" + this.id + ")"; } public int hashCode() { return this.id.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LLMStreamID)) return false;  LLMStreamID lLMStreamID = (LLMStreamID)other; return !!Intrinsics.areEqual(this.id, lLMStreamID.id); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\017\020\005\032\b\022\004\022\0020\0040\006HÆ\001¨\006\007"}, d2 = {"Lai/grazie/model/llm/stream/LLMStreamID$Companion;", "", "()V", "random", "Lai/grazie/model/llm/stream/LLMStreamID;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"}) public static final class Companion {
/* 12 */     @NotNull public final KSerializer<LLMStreamID> serializer() { return LLMStreamID.Serializer.INSTANCE; } private Companion() {} @NotNull
/* 13 */     public final LLMStreamID random() { return new LLMStreamID(UUID.Companion.random()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/model/llm/stream/LLMStreamID$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/stream/LLMStreamID;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class Serializer implements KSerializer<LLMStreamID> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); @NotNull
/*    */     public LLMStreamID deserialize(@NotNull Decoder decoder) {
/* 17 */       Intrinsics.checkNotNullParameter(decoder, "decoder"); return new LLMStreamID(UUID.Companion.ofText(decoder.decodeString()));
/*    */     } @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 20 */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("LLMStreamID", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull LLMStreamID value) {
/* 23 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeString(value.getId().getText());
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/stream/LLMStreamID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */