/*   */ package ai.grazie.model.cloud.sse.continuous;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class ContinuousSSEExceptionEvent$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*   */   @NotNull
/*   */   public final KSerializer<Object> invoke() {
/* 8 */     KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.Cancellation.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.Error.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.Timeout.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)ContinuousSSEExceptionEvent.Cancellation.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ContinuousSSEExceptionEvent.Error.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ContinuousSSEExceptionEvent.Timeout.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.cloud.sse.continuous.ContinuousSSEExceptionEvent", Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */   
/*   */   public static final ContinuousSSEExceptionEvent$Companion$$cachedSerializer$delegate$1 INSTANCE = new ContinuousSSEExceptionEvent$Companion$$cachedSerializer$delegate$1();
/*   */   
/*   */   ContinuousSSEExceptionEvent$Companion$$cachedSerializer$delegate$1() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEvent$Companion$$cachedSerializer$delegate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */