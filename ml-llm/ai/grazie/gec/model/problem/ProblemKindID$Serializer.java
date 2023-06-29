/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/gec/model/problem/ProblemKindID$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemKindID;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */ public final class Serializer
/*    */   implements KSerializer<ProblemKindID>
/*    */ {
/*    */   @NotNull
/*    */   public static final Serializer INSTANCE = new Serializer();
/*    */   
/*    */   @NotNull
/*    */   public ProblemKindID deserialize(@NotNull Decoder decoder) {
/* 39 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); return new ProblemKindID(decoder.decodeString());
/*    */   } @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 42 */     return SerialDescriptorsKt.PrimitiveSerialDescriptor("ProblemKindID", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */   }
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull ProblemKindID value) {
/* 45 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeString(value.getId());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemKindID$Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */