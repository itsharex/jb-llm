/*   */ package ai.grazie.model.cloud.sse.continuous;
/*   */ import kotlin.jvm.internal.Reflection;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;", "model-cloud"})
/*   */ public final class Companion {
/*   */   @NotNull
/*   */   public final KSerializer<ContinuousSSEEvent> serializer() {
/* 9 */     KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.Cancellation.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.Error.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEvent.Timeout.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(Data.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)ContinuousSSEExceptionEvent.Cancellation.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ContinuousSSEExceptionEvent.Error.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ContinuousSSEExceptionEvent.Timeout.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Data.class), new java.lang.annotation.Annotation[0]); return (KSerializer<ContinuousSSEEvent>)new SealedClassSerializer("ai.grazie.model.cloud.sse.continuous.ContinuousSSEEvent", Reflection.getOrCreateKotlinClass(ContinuousSSEEvent.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */