/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1\n*L\n93#1:124\n93#1:125,2\n*E\n"})
/*     */ public final class StandardSentenceTokenizer$Companion$endPunctuation$1
/*     */   extends RegexPattern
/*     */ {
/*     */   StandardSentenceTokenizer$Companion$endPunctuation$1(Regex $super_call_param$1) {
/*  88 */     super(
/*  89 */         $super_call_param$1);
/*     */   }
/*     */   @NotNull
/*     */   public List<TextRange> find(@NotNull CharSequence text) {
/*  93 */     Intrinsics.checkNotNullParameter(text, "text"); Iterable $this$filter$iv = super.find(text); int $i$f$filter = 0;
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
/* 124 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 125 */     for (Object element$iv$iv : iterable1) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-StandardSentenceTokenizer$Companion$endPunctuation$1$find$1 = 0; if (!StandardSentenceTokenizer.access$getSentenceContinuation$cp().matchesAt(text, it.getStart())) destination$iv$iv.add(element$iv$iv);  }
/* 126 */      return (List)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */