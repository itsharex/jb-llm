/*    */ package ai.grazie.model.llm.profile;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\bÇ\002\030\0002\0020\001:\002\013\fB\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007¨\006\r"}, d2 = {"Lai/grazie/model/llm/profile/OpenAIProfileIDs;", "", "()V", "ChatGPT", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChatGPT$annotations", "getChatGPT", "()Lai/grazie/model/llm/profile/LLMProfileID;", "GPT4", "getGPT4$annotations", "getGPT4", "Chat", "Completion", "model-llm"})
/*    */ public final class OpenAIProfileIDs {
/*    */   @NotNull
/*  8 */   public static final OpenAIProfileIDs INSTANCE = new OpenAIProfileIDs(); @NotNull private static final LLMProfileID GPT4 = Chat.INSTANCE.getGPT4(); @NotNull public final LLMProfileID getGPT4() { return GPT4; }
/*    */   
/*    */   @NotNull
/* 11 */   private static final LLMProfileID ChatGPT = Chat.INSTANCE.getChatGPT(); @NotNull public final LLMProfileID getChatGPT() { return ChatGPT; }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\031\020\t\032\b\022\004\022\0020\0040\n¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006\016"}, d2 = {"Lai/grazie/model/llm/profile/OpenAIProfileIDs$Chat;", "", "()V", "ChatGPT", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChatGPT", "()Lai/grazie/model/llm/profile/LLMProfileID;", "GPT4", "getGPT4", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Chat { @NotNull
/* 14 */     public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID GPT4 = new LLMProfileID("openai-gpt-4"); @NotNull public final LLMProfileID getGPT4() { return GPT4; } @NotNull
/* 15 */     private static final LLMProfileID ChatGPT = new LLMProfileID("openai-chat-gpt"); @NotNull public final LLMProfileID getChatGPT() { return ChatGPT; } @NotNull
/*    */     private static final LLMProfileID[] all; @NotNull
/* 17 */     public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[2]; arrayOfLLMProfileID[0] = GPT4; arrayOfLLMProfileID[1] = ChatGPT; all = arrayOfLLMProfileID; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\021\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\031\020\r\032\b\022\004\022\0020\0040\016¢\006\n\n\002\020\021\032\004\b\017\020\020¨\006\022"}, d2 = {"Lai/grazie/model/llm/profile/OpenAIProfileIDs$Completion;", "", "()V", "Ada", "Lai/grazie/model/llm/profile/LLMProfileID;", "getAda", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Babbage", "getBabbage", "Curie", "getCurie", "Davinci", "getDavinci", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Completion { @NotNull
/* 21 */     public static final Completion INSTANCE = new Completion(); @NotNull private static final LLMProfileID Davinci = new LLMProfileID("openai-davinci"); @NotNull public final LLMProfileID getDavinci() { return Davinci; } @NotNull
/* 22 */     private static final LLMProfileID Curie = new LLMProfileID("openai-curie"); @NotNull public final LLMProfileID getCurie() { return Curie; } @NotNull
/* 23 */     private static final LLMProfileID Babbage = new LLMProfileID("openai-babbage"); @NotNull public final LLMProfileID getBabbage() { return Babbage; } @NotNull
/* 24 */     private static final LLMProfileID Ada = new LLMProfileID("openai-ada"); @NotNull private static final LLMProfileID[] all; @NotNull public final LLMProfileID getAda() { return Ada; }
/*    */     @NotNull
/* 26 */     public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[4]; arrayOfLLMProfileID[0] = Davinci; arrayOfLLMProfileID[1] = Curie; arrayOfLLMProfileID[2] = Babbage; arrayOfLLMProfileID[3] = Ada; all = arrayOfLLMProfileID; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/OpenAIProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */