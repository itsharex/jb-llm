/*    */ package ai.grazie.auth.model.feedback;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.EnumDescriptor;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\002\t\nB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\b¨\006\013"}, d2 = {"Lai/grazie/auth/model/feedback/FeedbackErrorType;", "", "display", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "FALSE_POSITIVE", "INCORRECT_SUGGESTION", "$serializer", "Companion", "auth-model"})
/*    */ public enum FeedbackErrorType
/*    */ {
/* 33 */   FALSE_POSITIVE("False Positive"),
/* 34 */   INCORRECT_SUGGESTION("Incorrect Suggestion"); static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, FeedbackErrorType$Companion$$cachedSerializer$delegate$1.INSTANCE); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String display;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   FeedbackErrorType(String display) {
/*    */     this.display = display;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/feedback/FeedbackErrorType.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/feedback/FeedbackErrorType;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<FeedbackErrorType> {
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
/*    */     public FeedbackErrorType deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       return FeedbackErrorType.values()[decoder.decodeEnum(getDescriptor())];
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull FeedbackErrorType value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       encoder.encodeEnum(getDescriptor(), value.ordinal());
/*    */     }
/*    */     
/*    */     static {
/*    */       EnumDescriptor enumDescriptor = new EnumDescriptor("ai.grazie.auth.model.feedback.FeedbackErrorType", 2);
/*    */       enumDescriptor.addElement("FALSE_POSITIVE", false);
/*    */       enumDescriptor.addElement("INCORRECT_SUGGESTION", false);
/*    */       descriptor = enumDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class FeedbackErrorType$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final FeedbackErrorType$Companion$$cachedSerializer$delegate$1 INSTANCE = new FeedbackErrorType$Companion$$cachedSerializer$delegate$1();
/*    */     
/*    */     FeedbackErrorType$Companion$$cachedSerializer$delegate$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Object> invoke() {
/*    */       return (KSerializer<Object>)FeedbackErrorType.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/feedback/FeedbackErrorType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/feedback/FeedbackErrorType;", "auth-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<FeedbackErrorType> serializer() {
/*    */       return (KSerializer<FeedbackErrorType>)get$cachedSerializer$delegate().getValue();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/feedback/FeedbackErrorType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */