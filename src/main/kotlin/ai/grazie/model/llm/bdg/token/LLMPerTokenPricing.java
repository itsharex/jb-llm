/*    */ package ai.grazie.model.llm.bdg.token;
/*    */ 
/*    */ import ai.grazie.model.bdg.price.FixedResourcePricing;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\007¢\006\b\n\000\032\004\b\013\020\t¨\006\f"}, d2 = {"Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;", "", "contextPerToken", "Lai/grazie/utils/mpp/money/Money;", "generationPerToken", "(Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;)V", "context", "Lai/grazie/model/bdg/price/FixedResourcePricing;", "getContext", "()Lai/grazie/model/bdg/price/FixedResourcePricing;", "generation", "getGeneration", "model-llm"})
/*    */ public final class LLMPerTokenPricing {
/*    */   @NotNull
/*    */   private final FixedResourcePricing context;
/*    */   @NotNull
/*    */   private final FixedResourcePricing generation;
/*    */   
/* 13 */   public LLMPerTokenPricing(@NotNull Money contextPerToken, @NotNull Money generationPerToken) { this.context = new FixedResourcePricing(contextPerToken);
/* 14 */     this.generation = new FixedResourcePricing(generationPerToken); } @NotNull public final FixedResourcePricing getGeneration() { return this.generation; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final FixedResourcePricing getContext() {
/*    */     return this.context;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/bdg/token/LLMPerTokenPricing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */