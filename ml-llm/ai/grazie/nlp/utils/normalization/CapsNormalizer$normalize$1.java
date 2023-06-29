/*    */ package ai.grazie.nlp.utils.normalization;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.MatchResult;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"})
/*    */ final class CapsNormalizer$normalize$1 extends Lambda implements Function1<MatchResult, CharSequence> {
/*    */   @NotNull
/*    */   public final CharSequence invoke(@NotNull MatchResult it) {
/* 10 */     Intrinsics.checkNotNullParameter(it, "it"); return CapsNormalizer.access$lowercaseIfAllLettersUpper(CapsNormalizer.this, it.getValue());
/*    */   }
/*    */   
/*    */   CapsNormalizer$normalize$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/normalization/CapsNormalizer$normalize$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */