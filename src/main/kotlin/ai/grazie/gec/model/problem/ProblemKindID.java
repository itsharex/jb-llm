/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = ProblemKindID.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\b\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\b\030\000 \0212\0020\001:\002\021\022B\017\b\000\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\t\032\0020\003HÆ\003J\023\020\n\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\001HÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\0038F¢\006\006\032\004\b\b\020\006¨\006\023"}, d2 = {"Lai/grazie/gec/model/problem/ProblemKindID;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "local", "getLocal", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "model-gec"})
/*    */ public final class ProblemKindID {
/* 21 */   public ProblemKindID(@NotNull String id) { this.id = id; } @NotNull public final String getId() { return this.id; }
/*    */   @NotNull
/* 23 */   public final String getLocal() { String[] arrayOfString = new String[1]; arrayOfString[0] = "."; return CollectionsKt.joinToString$default(CollectionsKt.drop(StringsKt.split$default(this.id, arrayOfString, false, 0, 6, null), 2), ".", null, null, 0, null, null, 62, null); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\036\020\007\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rJ\036\020\016\032\0020\0042\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rJ\017\020\017\032\b\022\004\022\0020\0040\020HÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/gec/model/problem/ProblemKindID$Companion;", "", "()V", "legacy", "Lai/grazie/gec/model/problem/ProblemKindID;", "getLegacy", "()Lai/grazie/gec/model/problem/ProblemKindID;", "local", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "language", "Lai/grazie/nlp/langs/Language;", "id", "", "of", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 25 */     public final KSerializer<ProblemKindID> serializer() { return ProblemKindID.Serializer.INSTANCE; } @NotNull
/* 26 */     public final ProblemKindID getLegacy() { return ProblemKindID.legacy; }
/*    */      @NotNull
/*    */     public final ProblemKindID local(@NotNull CorrectionServiceType service, @NotNull Language language, @NotNull String id) {
/* 29 */       Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullExpressionValue((service.name() + ".local." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return new ProblemKindID((service.name() + ".local." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT));
/*    */     }
/*    */     
/*    */     @NotNull
/* 33 */     public final ProblemKindID of(@NotNull CorrectionServiceType service, @NotNull Language language, @NotNull String id) { Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullExpressionValue((service.name() + "." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return new ProblemKindID((service.name() + "." + service.name() + "." + language.getIso().name()).toLowerCase(Locale.ROOT)); } }
/*    */   
/*    */   @NotNull public static final Companion Companion = new Companion(null);
/*    */   @NotNull private final String id; @NotNull private static final ProblemKindID legacy = new ProblemKindID("legacy"); @NotNull public final String component1() { return this.id; } @NotNull public final ProblemKindID copy(@NotNull String id) { Intrinsics.checkNotNullParameter(id, "id"); return new ProblemKindID(id); } @NotNull public String toString() { return "ProblemKindID(id=" + this.id + ")"; } public int hashCode() { return this.id.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ProblemKindID))
/*    */       return false;  ProblemKindID problemKindID = (ProblemKindID)other; return !!Intrinsics.areEqual(this.id, problemKindID.id); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/gec/model/problem/ProblemKindID$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemKindID;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class Serializer implements KSerializer<ProblemKindID>
/*    */   {
/* 39 */     @NotNull public ProblemKindID deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return new ProblemKindID(decoder.decodeString()); } @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/* 42 */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("ProblemKindID", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*    */     }
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ProblemKindID value) {
/* 45 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeString(value.getId());
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemKindID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */