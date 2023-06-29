/*    */ package ai.grazie.model.llm.bdg.token;
/*    */ 
/*    */ import ai.grazie.model.bdg.estimator.PerTokenBudgetEstimator;
/*    */ import ai.grazie.model.bdg.price.ResourcePricing;
/*    */ import ai.grazie.model.nlp.encoder.TokenCounter;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\b¢\006\b\n\000\032\004\b\f\020\n¨\006\r"}, d2 = {"Lai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting;", "", "pricing", "Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;", "counter", "Lai/grazie/model/nlp/encoder/TokenCounter;", "(Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;Lai/grazie/model/nlp/encoder/TokenCounter;)V", "context", "Lai/grazie/model/bdg/estimator/PerTokenBudgetEstimator;", "getContext", "()Lai/grazie/model/bdg/estimator/PerTokenBudgetEstimator;", "generation", "getGeneration", "model-llm"})
/*    */ public final class LLMPerTokenBudgeting {
/*    */   @NotNull
/*    */   private final PerTokenBudgetEstimator context;
/*    */   @NotNull
/*    */   private final PerTokenBudgetEstimator generation;
/*    */   
/* 16 */   public LLMPerTokenBudgeting(@NotNull LLMPerTokenPricing pricing, @NotNull TokenCounter counter) { this.context = new PerTokenBudgetEstimator(counter, (ResourcePricing)pricing.getContext());
/* 17 */     this.generation = new PerTokenBudgetEstimator(counter, (ResourcePricing)pricing.getGeneration()); } @NotNull public final PerTokenBudgetEstimator getGeneration() { return this.generation; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final PerTokenBudgetEstimator getContext() {
/*    */     return this.context;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */