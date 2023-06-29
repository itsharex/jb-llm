/*   */ package ai.grazie.utils.mpp;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/utils/mpp/TextRegex;", "", "()V", "punctuation", "Lkotlin/text/Regex;", "getPunctuation", "()Lkotlin/text/Regex;", "utils-common"})
/*   */ public final class TextRegex {
/*   */   @NotNull
/* 4 */   public static final TextRegex INSTANCE = new TextRegex(); @NotNull private static final Regex punctuation = new Regex("\\p{P}"); @NotNull public final Regex getPunctuation() { return punctuation; }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/TextRegex.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */