/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\031\020\t\032\b\022\004\022\0020\0040\n¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006\016"}, d2 = {"Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;", "", "()V", "ChatGPT", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChatGPT", "()Lai/grazie/model/llm/profile/LLMProfileID;", "GPT4", "getGPT4", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public final class Chat
/*    */ {
/*    */   @NotNull
/* 14 */   public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID GPT4 = new LLMProfileID("openai-gpt-4"); @NotNull public final LLMProfileID getGPT4() { return GPT4; } @NotNull
/* 15 */   private static final LLMProfileID ChatGPT = new LLMProfileID("openai-chat-gpt"); @NotNull public final LLMProfileID getChatGPT() { return ChatGPT; } @NotNull
/*    */   private static final LLMProfileID[] all; @NotNull
/* 17 */   public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[2]; arrayOfLLMProfileID[0] = GPT4; arrayOfLLMProfileID[1] = ChatGPT; all = arrayOfLLMProfileID; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/OpenAIProfileIDs$Chat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */