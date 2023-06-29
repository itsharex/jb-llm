/*    */ package ai.grazie.model.llm.bdg.chat;
/*    */ 
/*    */ import ai.grazie.model.bdg.estimator.BudgetEstimator;
/*    */ import ai.grazie.model.llm.bdg.token.LLMPerTokenBudgeting;
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChatMessage;
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import java.util.Collection;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\013\n\000\030\0002\b\022\004\022\0020\0020\001B\035\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\002\020\bJ\020\020\r\032\0020\0162\006\020\017\032\0020\002H\026J\f\020\020\032\0020\021*\0020\002H\002R\021\020\005\032\0020\t¢\006\b\n\000\032\004\b\n\020\013R\021\020\007\032\0020\t¢\006\b\n\000\032\004\b\f\020\013¨\006\022"}, d2 = {"Lai/grazie/model/llm/bdg/chat/LLMChatBudgeting;", "Lai/grazie/model/bdg/estimator/BudgetEstimator;", "Lai/grazie/model/llm/chat/LLMChat;", "budgeting", "Lai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting;", "context", "Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster;", "generation", "(Lai/grazie/model/llm/bdg/token/LLMPerTokenBudgeting;Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster;Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator$Adjuster;)V", "Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator;", "getContext", "()Lai/grazie/model/llm/bdg/chat/LLMChatBudgetEstimator;", "getGeneration", "estimate", "Lai/grazie/utils/mpp/money/Money;", "input", "isResponse", "", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMChatBudgeting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMChatBudgeting.kt\nai/grazie/model/llm/bdg/chat/LLMChatBudgeting\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n37#2,2:40\n*S KotlinDebug\n*F\n+ 1 LLMChatBudgeting.kt\nai/grazie/model/llm/bdg/chat/LLMChatBudgeting\n*L\n30#1:40,2\n*E\n"})
/*    */ public final class LLMChatBudgeting implements BudgetEstimator<LLMChat> {
/*    */   @NotNull
/*    */   private final LLMChatBudgetEstimator context;
/*    */   @NotNull
/*    */   private final LLMChatBudgetEstimator generation;
/*    */   
/* 23 */   public LLMChatBudgeting(@NotNull LLMPerTokenBudgeting budgeting, @NotNull LLMChatBudgetEstimator.Adjuster context, @NotNull LLMChatBudgetEstimator.Adjuster generation) { this.context = new LLMChatBudgetEstimator(budgeting.getContext(), context);
/* 24 */     this.generation = new LLMChatBudgetEstimator(budgeting.getGeneration(), generation); } @NotNull public final LLMChatBudgetEstimator getGeneration() { return this.generation; }
/*    */   @NotNull
/*    */   public final LLMChatBudgetEstimator getContext() { return this.context; } @NotNull
/* 27 */   public Money estimate(@NotNull LLMChat input) { Intrinsics.checkNotNullParameter(input, "input"); if (((input.getMessages()).length == 0)) return Money.Companion.getZERO_DOLLARS();
/*    */ 
/*    */     
/* 30 */     Collection $this$toTypedArray$iv = ArraysKt.dropLast((Object[])input.getMessages(), 1); int $i$f$toTypedArray = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 41 */     return isResponse(input) ? this.context.estimate(new LLMChat((LLMChatMessage[])thisCollection$iv.toArray((Object[])new LLMChatMessage[0]))).plus(this.generation.estimate((LLMChatMessage)ArraysKt.last((Object[])input.getMessages()))) : this.context.estimate(input); }
/*    */ 
/*    */   
/*    */   private final boolean isResponse(LLMChat $this$isResponse) {
/*    */     return (((LLMChatMessage)ArraysKt.last((Object[])$this$isResponse.getMessages())).getRole() == LLMChatRole.Assistant);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/bdg/chat/LLMChatBudgeting.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */