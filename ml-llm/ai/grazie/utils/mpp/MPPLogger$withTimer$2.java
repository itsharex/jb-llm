/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "T", "invoke"})
/*    */ final class MPPLogger$withTimer$2
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   MPPLogger$withTimer$2(Function0<String> $message) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String invoke() {
/* 22 */     return "Start " + this.$message.invoke();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/MPPLogger$withTimer$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */