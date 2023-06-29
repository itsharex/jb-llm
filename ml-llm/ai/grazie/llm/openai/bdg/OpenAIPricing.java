/*    */ package ai.grazie.llm.openai.bdg;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/llm/openai/bdg/OpenAIPricing;", "", "()V", "get", "Lai/grazie/model/llm/bdg/token/LLMPerTokenPricing;", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "llm-openai-bdg"})
/*    */ public final class OpenAIPricing {
/*    */   @Nullable
/*    */   public final LLMPerTokenPricing get(@NotNull LLMProfileID id) {
/* 12 */     Intrinsics.checkNotNullParameter(id, "id"); LLMProfileID lLMProfileID = id;
/* 13 */     if (Intrinsics.areEqual(lLMProfileID, OpenAIProfileIDs.Chat.INSTANCE.getGPT4())) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 20 */     else if (Intrinsics.areEqual(lLMProfileID, OpenAIProfileIDs.Chat.INSTANCE.getChatGPT())) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 27 */     else if (Intrinsics.areEqual(lLMProfileID, OpenAIProfileIDs.Completion.INSTANCE.getDavinci())) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 34 */     else if (Intrinsics.areEqual(lLMProfileID, OpenAIProfileIDs.Completion.INSTANCE.getCurie())) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 41 */     else if (Intrinsics.areEqual(lLMProfileID, OpenAIProfileIDs.Completion.INSTANCE.getBabbage())) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 48 */     else if (Intrinsics.areEqual(lLMProfileID, OpenAIProfileIDs.Completion.INSTANCE.getAda())) {
/*    */     
/*    */     } else {
/*    */     
/*    */     } 
/*    */ 
/*    */     
/* 55 */     return null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final OpenAIPricing INSTANCE = new OpenAIPricing();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/llm/openai/bdg/OpenAIPricing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */