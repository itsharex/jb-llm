/*    */ package ai.grazie.auth.model;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\024\b\001\030\000 \0302\b\022\004\022\0020\0000\001:\002\027\030B!\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003¢\006\002\020\007R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013j\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026¨\006\031"}, d2 = {"Lai/grazie/auth/model/GrazieUserState;", "", "shouldHaveAccess", "", "display", "", "requireLicense", "(Ljava/lang/String;IZLjava/lang/String;Z)V", "getDisplay", "()Ljava/lang/String;", "getRequireLicense", "()Z", "getShouldHaveAccess", "NONE", "WAIT_LIST", "LICENSE_ISSUING", "LICENSE_DECLINED", "LICENSE_OUTDATED", "EAP", "SERVICE", "INTERNAL", "FREE", "PAID", "$serializer", "Companion", "auth-model"})
/*    */ public enum GrazieUserState {
/* 15 */   NONE(false, "Registered", false, 4, null),
/* 16 */   WAIT_LIST(false, "In Wait List", false, 4, null),
/*    */   
/* 18 */   LICENSE_ISSUING(false, "License Issuing", false, 4, null),
/* 19 */   LICENSE_DECLINED(false, "License Declined", false, 4, null),
/* 20 */   LICENSE_OUTDATED(false, "License Outdated", false, 4, null),
/*    */   
/* 22 */   EAP(true, "In EAP", false, 4, null),
/*    */ 
/*    */   
/* 25 */   SERVICE(true, "Service", false),
/* 26 */   INTERNAL(true, "Internal", false),
/*    */ 
/*    */   
/* 29 */   FREE(true, "Free", false, 4, null),
/* 30 */   PAID(true, "Paid", false, 4, null); @NotNull public static final Companion Companion; private final boolean shouldHaveAccess; @NotNull private final String display; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, GrazieUserState$Companion$$cachedSerializer$delegate$1.INSTANCE); }
/*    */ 
/*    */   
/*    */   private final boolean requireLicense;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   GrazieUserState(boolean shouldHaveAccess, String display, boolean requireLicense) {
/*    */     this.shouldHaveAccess = shouldHaveAccess;
/*    */     this.display = display;
/*    */     this.requireLicense = requireLicense;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/GrazieUserState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/GrazieUserState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<GrazieUserState> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public GrazieUserState deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       return GrazieUserState.values()[decoder.decodeEnum(getDescriptor())];
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull GrazieUserState value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeEnum(getDescriptor(), value.ordinal());
/*    */     }
/*    */     
/*    */     static {
/*    */       EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.auth.model.GrazieUserState", 10);
/*    */       enumDescriptor.addElement("NONE", false);
/*    */       enumDescriptor.addElement("WAIT_LIST", false);
/*    */       enumDescriptor.addElement("LICENSE_ISSUING", false);
/*    */       enumDescriptor.addElement("LICENSE_DECLINED", false);
/*    */       enumDescriptor.addElement("LICENSE_OUTDATED", false);
/*    */       enumDescriptor.addElement("EAP", false);
/*    */       enumDescriptor.addElement("SERVICE", false);
/*    */       enumDescriptor.addElement("INTERNAL", false);
/*    */       enumDescriptor.addElement("FREE", false);
/*    */       enumDescriptor.addElement("PAID", false);
/*    */       descriptor = enumDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class GrazieUserState$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final GrazieUserState$Companion$$cachedSerializer$delegate$1 INSTANCE = new GrazieUserState$Companion$$cachedSerializer$delegate$1();
/*    */     
/*    */     GrazieUserState$Companion$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Object> invoke() {
/*    */       return (KSerializer<Object>)GrazieUserState.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/GrazieUserState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/GrazieUserState;", "auth-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GrazieUserState> serializer() {
/*    */       return (KSerializer<GrazieUserState>)get$cachedSerializer$delegate().getValue();
/*    */     }
/*    */   }
/*    */   
/*    */   public final boolean getShouldHaveAccess() {
/*    */     return this.shouldHaveAccess;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */   
/*    */   public final boolean getRequireLicense() {
/*    */     return this.requireLicense;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/GrazieUserState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */