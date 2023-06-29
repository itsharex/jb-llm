/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import ai.grazie.model.llm.annotation.ExperimentalLLM;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$Chat;", "", "()V", "OpenAssistant", "Lai/grazie/model/llm/profile/LLMProfileID;", "getOpenAssistant$annotations", "getOpenAssistant", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Vicuna", "getVicuna$annotations", "getVicuna", "model-llm"})
/*    */ public final class Chat
/*    */ {
/*    */   @NotNull
/* 29 */   public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID Vicuna = new LLMProfileID("grazie-chat-vicuna"); @NotNull public final LLMProfileID getVicuna() { return Vicuna; }
/*    */   
/*    */   @NotNull
/* 32 */   private static final LLMProfileID OpenAssistant = new LLMProfileID("grazie-chat-open-assistant"); @NotNull public final LLMProfileID getOpenAssistant() { return OpenAssistant; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/GrazieLLMProfileIDs$Chat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */