/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\023\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006¨\006\027"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$CodeGen;", "", "()V", "LargeMulti", "Lai/grazie/model/llm/profile/LLMProfileID;", "getLargeMulti", "()Lai/grazie/model/llm/profile/LLMProfileID;", "LargePython", "getLargePython", "LargeText", "getLargeText", "SmallMulti", "getSmallMulti", "SmallPython", "getSmallPython", "SmallText", "getSmallText", "TinyMulti", "getTinyMulti", "TinyPython", "getTinyPython", "TinyText", "getTinyText", "model-llm"})
/*    */ public final class CodeGen {
/*    */   @NotNull
/*  9 */   public static final CodeGen INSTANCE = new CodeGen(); @NotNull private static final LLMProfileID LargeMulti = new LLMProfileID("grazie-codegen-large-multi"); @NotNull public final LLMProfileID getLargeMulti() { return LargeMulti; } @NotNull
/* 10 */   private static final LLMProfileID LargePython = new LLMProfileID("grazie-codegen-large-python"); @NotNull public final LLMProfileID getLargePython() { return LargePython; } @NotNull
/* 11 */   private static final LLMProfileID LargeText = new LLMProfileID("grazie-codegen-large-text"); @NotNull public final LLMProfileID getLargeText() { return LargeText; }
/*    */    @NotNull
/* 13 */   private static final LLMProfileID SmallMulti = new LLMProfileID("grazie-codegen-small-multi"); @NotNull public final LLMProfileID getSmallMulti() { return SmallMulti; } @NotNull
/* 14 */   private static final LLMProfileID SmallPython = new LLMProfileID("grazie-codegen-small-python"); @NotNull public final LLMProfileID getSmallPython() { return SmallPython; } @NotNull
/* 15 */   private static final LLMProfileID SmallText = new LLMProfileID("grazie-codegen-small-text"); @NotNull public final LLMProfileID getSmallText() { return SmallText; }
/*    */    @NotNull
/* 17 */   private static final LLMProfileID TinyMulti = new LLMProfileID("grazie-codegen-tiny-multi"); @NotNull public final LLMProfileID getTinyMulti() { return TinyMulti; } @NotNull
/* 18 */   private static final LLMProfileID TinyPython = new LLMProfileID("grazie-codegen-tiny-python"); @NotNull public final LLMProfileID getTinyPython() { return TinyPython; } @NotNull
/* 19 */   private static final LLMProfileID TinyText = new LLMProfileID("grazie-codegen-tiny-text"); @NotNull public final LLMProfileID getTinyText() { return TinyText; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/model/llm/profile/GrazieLLMProfileIDs$CodeGen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */