/*    */ package ai.grazie.auth.model.feedback;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b7\030\000 \"*\004\b\000\020\0012\0020\002:\001\"B\031\b\027\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006¢\006\002\020\007B\007\b\004¢\006\002\020\bJ;\020\030\032\0020\031\"\004\b\001\020\0322\f\020\033\032\b\022\004\022\002H\0320\0002\006\020\034\032\0020\0352\006\020\036\032\0020\0372\f\020 \032\b\022\004\022\002H\0320!HÇ\001R\022\020\t\032\0028\000X¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\rX¦\004¢\006\006\032\004\b\016\020\017R\022\020\020\032\0020\021X¦\004¢\006\006\032\004\b\022\020\023R\022\020\024\032\0020\025X¦\004¢\006\006\032\004\b\026\020\027\001\002#$¨\006%"}, d2 = {"Lai/grazie/auth/model/feedback/UserFeedback;", "ContextType", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "context", "getContext", "()Ljava/lang/Object;", "data", "Lai/grazie/auth/model/feedback/FeedbackAdditionalData;", "getData", "()Lai/grazie/auth/model/feedback/FeedbackAdditionalData;", "language", "Lai/grazie/nlp/langs/Language;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "type", "Lai/grazie/auth/model/feedback/FeedbackErrorType;", "getType", "()Lai/grazie/auth/model/feedback/FeedbackErrorType;", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "Companion", "Lai/grazie/auth/model/feedback/CorrectionFalsePositive;", "Lai/grazie/auth/model/feedback/CorrectionSuggestionIncorrect;", "auth-model"})
/*    */ public abstract class UserFeedback<ContextType> {
/*    */   @NotNull
/* 17 */   public static final Companion Companion = new Companion(null); private UserFeedback() {} @NotNull public abstract Language getLanguage(); @NotNull public abstract FeedbackAdditionalData getData(); @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, UserFeedback$Companion$$cachedSerializer$delegate$1.INSTANCE); public abstract ContextType getContext(); @NotNull public abstract FeedbackErrorType getType(); @JvmStatic public static final <T0> void write$Self(@NotNull UserFeedback self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(self, "self"); Intrinsics.checkNotNullParameter(output, "output"); Intrinsics.checkNotNullParameter(serialDesc, "serialDesc"); Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class UserFeedback$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> { public static final UserFeedback$Companion$$cachedSerializer$delegate$1 INSTANCE = new UserFeedback$Companion$$cachedSerializer$delegate$1(); UserFeedback$Companion$$cachedSerializer$delegate$1() { super(0); } @NotNull public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(CorrectionFalsePositive.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(CorrectionSuggestionIncorrect.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)CorrectionFalsePositive.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)CorrectionSuggestionIncorrect.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.auth.model.feedback.UserFeedback", Reflection.getOrCreateKotlinClass(UserFeedback.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\016\022\n\022\b\022\004\022\002H\0060\0050\004\"\004\b\001\020\0062\f\020\007\032\b\022\004\022\002H\0060\004HÆ\001¨\006\b"}, d2 = {"Lai/grazie/auth/model/feedback/UserFeedback$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/feedback/UserFeedback;", "T0", "typeSerial0", "auth-model"}) public static final class Companion { private Companion() {} @NotNull public final <T0> KSerializer<UserFeedback<T0>> serializer(@NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<UserFeedback<T0>>)get$cachedSerializer$delegate().getValue(); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/feedback/UserFeedback.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */