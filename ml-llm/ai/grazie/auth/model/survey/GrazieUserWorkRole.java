/*    */ package ai.grazie.auth.model.survey;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\026\b\001\030\000 \0302\b\022\004\022\0020\0000\001:\002\027\030B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\0038F¢\006\006\032\004\b\b\020\006j\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026¨\006\031"}, d2 = {"Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "", "display", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "id", "getId", "Engineering", "Analytics", "PM", "TechnicalWriting", "CustomerSupport", "Marketing", "HR", "Sales", "Design", "CopyWriting", "Science", "Management", "Student", "None", "$serializer", "Companion", "auth-model"})
/*    */ public enum GrazieUserWorkRole {
/* 12 */   Engineering(
/* 13 */     "Engineering"),
/*    */   
/* 15 */   Analytics(
/* 16 */     "Analytics"),
/*    */   
/* 18 */   PM(
/* 19 */     "PM"),
/*    */   
/* 21 */   TechnicalWriting(
/* 22 */     "Technical Writing"),
/*    */   
/* 24 */   CustomerSupport(
/* 25 */     "Customer Support"),
/*    */   
/* 27 */   Marketing(
/* 28 */     "Marketing"),
/*    */   
/* 30 */   HR(
/* 31 */     "HR"),
/*    */   
/* 33 */   Sales(
/* 34 */     "Sales"),
/*    */   
/* 36 */   Design(
/* 37 */     "Design"),
/*    */   
/* 39 */   CopyWriting(
/* 40 */     "Copywriting"),
/*    */   
/* 42 */   Science(
/* 43 */     "Science"),
/*    */   
/* 45 */   Management(
/* 46 */     "Management"),
/*    */   
/* 48 */   Student(
/* 49 */     "Student"),
/*    */   
/* 51 */   None(
/* 52 */     "None");
/*    */   @NotNull public static final Companion Companion; @NotNull private final String display; @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; GrazieUserWorkRole(String display) { this.display = display; } @NotNull
/* 55 */   public final String getId() { switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) { case 1:
/*    */       
/*    */       case 2:
/* 58 */        }  Intrinsics.checkNotNullExpressionValue(name().toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)"); return name().toLowerCase(Locale.ROOT); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/survey/GrazieUserWorkRole.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<GrazieUserWorkRole> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public GrazieUserWorkRole deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       return GrazieUserWorkRole.values()[decoder.decodeEnum(getDescriptor())];
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull GrazieUserWorkRole value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeEnum(getDescriptor(), value.ordinal());
/*    */     }
/*    */     
/*    */     static {
/*    */       EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.auth.model.survey.GrazieUserWorkRole", 14);
/*    */       enumDescriptor.addElement("engineering", false);
/*    */       enumDescriptor.addElement("analytics", false);
/*    */       enumDescriptor.addElement("pm", false);
/*    */       enumDescriptor.addElement("technical-writing", false);
/*    */       enumDescriptor.addElement("customer-support", false);
/*    */       enumDescriptor.addElement("marketing", false);
/*    */       enumDescriptor.addElement("hr", false);
/*    */       enumDescriptor.addElement("sales", false);
/*    */       enumDescriptor.addElement("design", false);
/*    */       enumDescriptor.addElement("copywriting", false);
/*    */       enumDescriptor.addElement("science", false);
/*    */       enumDescriptor.addElement("management", false);
/*    */       enumDescriptor.addElement("student", false);
/*    */       enumDescriptor.addElement("none", false);
/*    */       descriptor = enumDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GrazieUserWorkRole$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final GrazieUserWorkRole$Companion$$cachedSerializer$delegate$1 INSTANCE = new GrazieUserWorkRole$Companion$$cachedSerializer$delegate$1();
/*    */     
/*    */     GrazieUserWorkRole$Companion$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Object> invoke() {
/*    */       return (KSerializer<Object>)GrazieUserWorkRole.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/survey/GrazieUserWorkRole$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "auth-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GrazieUserWorkRole> serializer() {
/*    */       return (KSerializer<GrazieUserWorkRole>)get$cachedSerializer$delegate().getValue();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */   
/*    */   static {
/*    */     Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, GrazieUserWorkRole$Companion$$cachedSerializer$delegate$1.INSTANCE);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/survey/GrazieUserWorkRole.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */