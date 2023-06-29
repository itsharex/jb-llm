/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
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
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 *2\0020\001:\002)*BA\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\013HÖ\001J!\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\027¨\006+"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo;", "", "seen1", "", "id", "Lai/grazie/gec/model/problem/ProblemKindID;", "category", "Lai/grazie/gec/model/problem/ProblemCategory;", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "displayName", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/ProblemCategory;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/ProblemCategory;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;)V", "getCategory", "()Lai/grazie/gec/model/problem/ProblemCategory;", "getDisplayName", "()Ljava/lang/String;", "getId", "()Lai/grazie/gec/model/problem/ProblemKindID;", "getService", "()Lai/grazie/gec/model/CorrectionServiceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-gec"})
/*    */ public final class KindInfo
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ProblemKindID id;
/*    */   @NotNull
/*    */   private final ProblemCategory category;
/*    */   @NotNull
/*    */   private final CorrectionServiceType service;
/*    */   @NotNull
/*    */   private final String displayName;
/*    */   
/*    */   public KindInfo(@NotNull ProblemKindID id, @NotNull ProblemCategory category, @NotNull CorrectionServiceType service, @NotNull String displayName) {
/* 47 */     this.id = id;
/* 48 */     this.category = category;
/* 49 */     this.service = service;
/* 50 */     this.displayName = displayName; } @NotNull public final String getDisplayName() { return this.displayName; }
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull KindInfo self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */     Intrinsics.checkNotNullParameter(self, "self");
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */     output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)ProblemKindID.Serializer.INSTANCE, self.id);
/*    */     output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)ProblemCategory.$serializer.INSTANCE, self.category);
/*    */     output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), self.service);
/*    */     output.encodeStringElement(serialDesc, 3, self.displayName);
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */   public static final class $serializer implements GeneratedSerializer<KindInfo> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */       arrayOfKSerializer[0] = ProblemKindID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)ProblemCategory.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values());
/*    */       arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Problem.KindInfo deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Object object1 = null, object2 = null, object3 = null;
/*    */       String str = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, object1);
/*    */         i |= 0x1;
/*    */         object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemCategory.$serializer.INSTANCE, object2);
/*    */         i |= 0x2;
/*    */         object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object3);
/*    */         i |= 0x4;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, object1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)ProblemCategory.$serializer.INSTANCE, object2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               object3 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)new EnumSerializer("ai.grazie.gec.model.CorrectionServiceType", (Enum[])CorrectionServiceType.values()), object3);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Problem.KindInfo(i, (ProblemKindID)object1, (ProblemCategory)object2, (CorrectionServiceType)object3, str, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Problem.KindInfo.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("category", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("service", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("displayName", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "model-gec"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Problem.KindInfo> serializer() {
/*    */       return (KSerializer<Problem.KindInfo>)Problem.KindInfo.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemKindID getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemCategory getCategory() {
/*    */     return this.category;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CorrectionServiceType getService() {
/*    */     return this.service;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemKindID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemCategory component2() {
/*    */     return this.category;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CorrectionServiceType component3() {
/*    */     return this.service;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.displayName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KindInfo copy(@NotNull ProblemKindID id, @NotNull ProblemCategory category, @NotNull CorrectionServiceType service, @NotNull String displayName) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(category, "category");
/*    */     Intrinsics.checkNotNullParameter(service, "service");
/*    */     Intrinsics.checkNotNullParameter(displayName, "displayName");
/*    */     return new KindInfo(id, category, service, displayName);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "KindInfo(id=" + this.id + ", category=" + this.category + ", service=" + this.service + ", displayName=" + this.displayName + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.category.hashCode();
/*    */     result = result * 31 + this.service.hashCode();
/*    */     return result * 31 + this.displayName.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof KindInfo))
/*    */       return false; 
/*    */     KindInfo kindInfo = (KindInfo)other;
/*    */     return !Intrinsics.areEqual(this.id, kindInfo.id) ? false : ((this.category != kindInfo.category) ? false : ((this.service != kindInfo.service) ? false : (!!Intrinsics.areEqual(this.displayName, kindInfo.displayName))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/Problem$KindInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */