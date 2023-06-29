/*    */ package ai.grazie.auth.model.feedback;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class UserFeedback$Companion$$cachedSerializer$delegate$1
/*    */   extends Lambda implements Function0<KSerializer<Object>> {
/*    */   @NotNull
/*    */   public final KSerializer<Object> invoke() {
/* 17 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(CorrectionFalsePositive.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(CorrectionSuggestionIncorrect.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)CorrectionFalsePositive.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)CorrectionSuggestionIncorrect.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.auth.model.feedback.UserFeedback", Reflection.getOrCreateKotlinClass(UserFeedback.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */   
/*    */   public static final UserFeedback$Companion$$cachedSerializer$delegate$1 INSTANCE = new UserFeedback$Companion$$cachedSerializer$delegate$1();
/*    */   
/*    */   UserFeedback$Companion$$cachedSerializer$delegate$1() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/auth/model/feedback/UserFeedback$Companion$$cachedSerializer$delegate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */