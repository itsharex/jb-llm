/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"})
/*    */ final class PreTrainedTextEncoder$maskId$2
/*    */   extends Lambda
/*    */   implements Function0<Integer>
/*    */ {
/*    */   PreTrainedTextEncoder$maskId$2() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Integer invoke() {
/* 58 */     return Integer.valueOf(PreTrainedTextEncoder.this.convertTokenToId(PreTrainedTextEncoder.this.getMaskToken()));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/PreTrainedTextEncoder$maskId$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */