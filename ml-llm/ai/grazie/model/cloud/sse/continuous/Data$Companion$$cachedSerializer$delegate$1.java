/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class Data$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
/*    */   @NotNull
/*    */   public final KSerializer<Object> invoke() {
/* 10 */     return (KSerializer<Object>)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Data.class), new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */   
/*    */   public static final Data$Companion$$cachedSerializer$delegate$1 INSTANCE = new Data$Companion$$cachedSerializer$delegate$1();
/*    */   
/*    */   Data$Companion$$cachedSerializer$delegate$1() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/cloud/sse/continuous/Data$Companion$$cachedSerializer$delegate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */