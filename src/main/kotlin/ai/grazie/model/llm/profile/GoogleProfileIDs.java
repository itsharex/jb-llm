/*    */ package ai.grazie.model.llm.profile;
/*    */ import ai.grazie.model.llm.annotation.ExperimentalLLM;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GoogleProfileIDs;", "", "()V", "ChatBison", "Lai/grazie/model/llm/profile/LLMProfileID;", "getChatBison$annotations", "getChatBison", "()Lai/grazie/model/llm/profile/LLMProfileID;", "CodeChatBison", "getCodeChatBison$annotations", "getCodeChatBison", "model-llm"})
/*    */ public final class GoogleProfileIDs {
/*    */   @NotNull
/*  9 */   public static final GoogleProfileIDs INSTANCE = new GoogleProfileIDs(); @NotNull private static final LLMProfileID ChatBison = new LLMProfileID("google-chat-bison"); @NotNull public final LLMProfileID getChatBison() { return ChatBison; }
/*    */    @NotNull
/* 11 */   private static final LLMProfileID CodeChatBison = new LLMProfileID("google-code-chat-bison"); @NotNull public final LLMProfileID getCodeChatBison() { return CodeChatBison; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/GoogleProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */