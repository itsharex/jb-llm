/*    */ package ai.grazie.gec.model.problem;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class ProblemFix$Part$Companion$$cachedSerializer$delegate$1
/*    */   extends Lambda
/*    */   implements Function0<KSerializer<Object>>
/*    */ {
/*    */   public static final ProblemFix$Part$Companion$$cachedSerializer$delegate$1 INSTANCE = new ProblemFix$Part$Companion$$cachedSerializer$delegate$1();
/*    */   
/*    */   ProblemFix$Part$Companion$$cachedSerializer$delegate$1() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Object> invoke() {
/* 44 */     KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ProblemFix.Part.Change.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProblemFix.Part.Context.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProblemFix.Part.Skip.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)ProblemFix.Part.Change.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ProblemFix.Part.Context.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ProblemFix.Part.Skip.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.gec.model.problem.ProblemFix.Part", Reflection.getOrCreateKotlinClass(ProblemFix.Part.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/gec/model/problem/ProblemFix$Part$Companion$$cachedSerializer$delegate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */