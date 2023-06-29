/*    */ package ai.grazie.qa;
/*    */ 
/*    */ import ai.grazie.text.TextRange;
/*    */ import ai.grazie.text.TextRange$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\000 %2\0020\001:\002$%B7\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\t\020\026\032\0020\tHÆ\003J'\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\007HÖ\001J!\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÇ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023¨\006&"}, d2 = {"Lai/grazie/qa/Document;", "", "seen1", "", "id", "Lai/grazie/qa/DocumentId;", "content", "", "selection", "Lai/grazie/text/TextRange;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/qa/DocumentId;Ljava/lang/String;Lai/grazie/text/TextRange;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/qa/DocumentId;Ljava/lang/String;Lai/grazie/text/TextRange;)V", "getContent", "()Ljava/lang/String;", "getId", "()Lai/grazie/qa/DocumentId;", "getSelection", "()Lai/grazie/text/TextRange;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "model-qa"})
/*    */ public final class Document {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final DocumentId id;
/*    */   
/* 36 */   public Document(@NotNull DocumentId id, @NotNull String content, @NotNull TextRange selection) { this.id = id;
/* 37 */     this.content = content;
/* 38 */     this.selection = selection; } @NotNull private final String content; @NotNull private final TextRange selection; @NotNull public final TextRange getSelection() { return this.selection; }
/*    */ 
/*    */   
/*    */   @JvmStatic
/*    */   public static final void write$Self(@NotNull Document self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
/*    */     Intrinsics.checkNotNullParameter(self, "self");
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
/*    */     output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)DocumentId.$serializer.INSTANCE, self.id);
/*    */     output.encodeStringElement(serialDesc, 1, self.content);
/*    */     output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)TextRange$.serializer.INSTANCE, self.selection);
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/qa/Document.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/qa/Document;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-qa"})
/*    */   public static final class $serializer implements GeneratedSerializer<Document> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = (KSerializer)DocumentId.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Document deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Object object1 = null;
/*    */       String str = null;
/*    */       Object object2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DocumentId.$serializer.INSTANCE, object1);
/*    */         i |= 0x1;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               object1 = compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DocumentId.$serializer.INSTANCE, object1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               object2 = compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TextRange$.serializer.INSTANCE, object2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Document(i, (DocumentId)object1, str, (TextRange)object2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Document value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Document.write$Self(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.qa.Document", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("content", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("selection", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/qa/Document$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/qa/Document;", "model-qa"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Document> serializer() {
/*    */       return (KSerializer<Document>)Document.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DocumentId getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getContent() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DocumentId component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component3() {
/*    */     return this.selection;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Document copy(@NotNull DocumentId id, @NotNull String content, @NotNull TextRange selection) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(selection, "selection");
/*    */     return new Document(id, content, selection);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Document(id=" + this.id + ", content=" + this.content + ", selection=" + this.selection + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     return result * 31 + this.selection.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Document))
/*    */       return false; 
/*    */     Document document = (Document)other;
/*    */     return !Intrinsics.areEqual(this.id, document.id) ? false : (!Intrinsics.areEqual(this.content, document.content) ? false : (!!Intrinsics.areEqual(this.selection, document.selection)));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/qa/Document.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */