/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */ public final class StandardSentenceTokenizer$newLinesPattern$1
/*     */   extends RegexPattern
/*     */ {
/*     */   StandardSentenceTokenizer$newLinesPattern$1(Regex $super_call_param$1) {
/* 103 */     super($super_call_param$1);
/*     */   } @NotNull
/*     */   public List<TextRange> find(@NotNull CharSequence text) {
/* 106 */     Intrinsics.checkNotNullParameter(text, "text"); return super.find(text);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */