/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\006\b\007\030\0002\0020\001:\004\003\004\005\006B\005¢\006\002\020\002¨\006\007"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs;", "", "()V", "Chat", "CodeGen", "GPT", "Replit", "model-llm"})
/*    */ public final class GrazieLLMProfileIDs {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\023\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006¨\006\027"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$CodeGen;", "", "()V", "LargeMulti", "Lai/grazie/model/llm/profile/LLMProfileID;", "getLargeMulti", "()Lai/grazie/model/llm/profile/LLMProfileID;", "LargePython", "getLargePython", "LargeText", "getLargeText", "SmallMulti", "getSmallMulti", "SmallPython", "getSmallPython", "SmallText", "getSmallText", "TinyMulti", "getTinyMulti", "TinyPython", "getTinyPython", "TinyText", "getTinyText", "model-llm"})
/*    */   public static final class CodeGen { @NotNull
/*  9 */     public static final CodeGen INSTANCE = new CodeGen(); @NotNull private static final LLMProfileID LargeMulti = new LLMProfileID("grazie-codegen-large-multi"); @NotNull public final LLMProfileID getLargeMulti() { return LargeMulti; } @NotNull
/* 10 */     private static final LLMProfileID LargePython = new LLMProfileID("grazie-codegen-large-python"); @NotNull public final LLMProfileID getLargePython() { return LargePython; } @NotNull
/* 11 */     private static final LLMProfileID LargeText = new LLMProfileID("grazie-codegen-large-text"); @NotNull public final LLMProfileID getLargeText() { return LargeText; }
/*    */      @NotNull
/* 13 */     private static final LLMProfileID SmallMulti = new LLMProfileID("grazie-codegen-small-multi"); @NotNull public final LLMProfileID getSmallMulti() { return SmallMulti; } @NotNull
/* 14 */     private static final LLMProfileID SmallPython = new LLMProfileID("grazie-codegen-small-python"); @NotNull public final LLMProfileID getSmallPython() { return SmallPython; } @NotNull
/* 15 */     private static final LLMProfileID SmallText = new LLMProfileID("grazie-codegen-small-text"); @NotNull public final LLMProfileID getSmallText() { return SmallText; }
/*    */      @NotNull
/* 17 */     private static final LLMProfileID TinyMulti = new LLMProfileID("grazie-codegen-tiny-multi"); @NotNull public final LLMProfileID getTinyMulti() { return TinyMulti; } @NotNull
/* 18 */     private static final LLMProfileID TinyPython = new LLMProfileID("grazie-codegen-tiny-python"); @NotNull public final LLMProfileID getTinyPython() { return TinyPython; } @NotNull
/* 19 */     private static final LLMProfileID TinyText = new LLMProfileID("grazie-codegen-tiny-text"); @NotNull public final LLMProfileID getTinyText() { return TinyText; }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$Replit;", "", "()V", "CodeV1Small", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCodeV1Small$annotations", "getCodeV1Small", "()Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Replit { @NotNull
/* 24 */     public static final Replit INSTANCE = new Replit(); @NotNull private static final LLMProfileID CodeV1Small = new LLMProfileID("grazie-replit-code-v1-small"); @NotNull public final LLMProfileID getCodeV1Small() { return CodeV1Small; }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$Chat;", "", "()V", "OpenAssistant", "Lai/grazie/model/llm/profile/LLMProfileID;", "getOpenAssistant$annotations", "getOpenAssistant", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Vicuna", "getVicuna$annotations", "getVicuna", "model-llm"})
/*    */   public static final class Chat { @NotNull
/* 29 */     public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID Vicuna = new LLMProfileID("grazie-chat-vicuna"); @NotNull public final LLMProfileID getVicuna() { return Vicuna; }
/*    */     
/*    */     @NotNull
/* 32 */     private static final LLMProfileID OpenAssistant = new LLMProfileID("grazie-chat-open-assistant"); @NotNull public final LLMProfileID getOpenAssistant() { return OpenAssistant; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$GPT;", "", "()V", "TinyText", "Lai/grazie/model/llm/profile/LLMProfileID;", "getTinyText", "()Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class GPT { @NotNull
/* 36 */     public static final GPT INSTANCE = new GPT(); @NotNull private static final LLMProfileID TinyText = new LLMProfileID("grazie-gpt-neo-tiny-text"); @NotNull public final LLMProfileID getTinyText() { return TinyText; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/GrazieLLMProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */