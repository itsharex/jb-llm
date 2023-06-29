/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.Direction;
/*     */ import ai.grazie.nlp.patterns.AggregatedPattern;
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.nlp.patterns.WithBeforeAfterPattern;
/*     */ import ai.grazie.nlp.patterns.standard.LikelyPatterns;
/*     */ import ai.grazie.nlp.patterns.standard.StrictPatterns;
/*     */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*     */ import ai.grazie.nlp.tokenizer.rule.PatternSplitTokenizer;
/*     */ import ai.grazie.text.Text;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000;\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000\n\002\030\002\n\002\030\002\n\002\b\002*\001\b\030\000 \0222\0020\001:\001\022B\021\022\n\b\002\020\002\032\004\030\0010\003¢\006\002\020\004J\025\020\007\032\0020\b2\006\020\002\032\0020\003H\002¢\006\002\020\tJ\024\020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\016J\026\020\017\032\b\022\004\022\0020\0200\0132\006\020\r\032\0020\021H\026R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "splitByNewLinesNumber", "", "(Ljava/lang/Integer;)V", "newLineTokenizer", "Lai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer;", "newLinesPattern", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1", "(I)Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1;", "tokenRanges", "", "Lai/grazie/text/TextRange;", "text", "", "tokenize", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "Lai/grazie/text/Text;", "Companion", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1549#2:124\n1620#2,3:125\n1360#2:128\n1446#2,2:129\n1549#2:131\n1620#2,3:132\n1448#2,3:135\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer\n*L\n111#1:124\n111#1:125,3\n117#1:128\n117#1:129,2\n118#1:131\n118#1:132,3\n117#1:135,3\n*E\n"})
/*     */ public final class StandardSentenceTokenizer
/*     */   implements Tokenizer
/*     */ {
/*     */   public StandardSentenceTokenizer(@Nullable Integer splitByNewLinesNumber) {
/* 101 */     this.newLineTokenizer = (splitByNewLinesNumber == null) ? null : new PatternSplitTokenizer((Pattern)newLinesPattern(splitByNewLinesNumber.intValue()), Direction.Right, null);
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Q\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\b\003\n\002\b\003\n\002\020\016\n\002\b\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000*\003\b\013\021\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\034\032\0020\035H\002J\b\020\036\032\0020\037H\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\020\020\007\032\0020\bX\004¢\006\004\n\002\020\tR\020\020\n\032\0020\013X\004¢\006\004\n\002\020\fR\016\020\r\032\0020\016XT¢\006\002\n\000R\016\020\017\032\0020\016XT¢\006\002\n\000R\020\020\020\032\0020\021X\004¢\006\004\n\002\020\022R\016\020\023\032\0020\024X\004¢\006\002\n\000R\016\020\025\032\0020\016XT¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\016XT¢\006\002\n\000R\016\020\031\032\0020\032X\004¢\006\002\n\000R\016\020\033\032\0020\016XT¢\006\002\n\000¨\006 "}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion;", "", "()V", "Default", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "getDefault", "()Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "Ellipsis", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1;", "Parenthetical", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1;", "braceBullet", "", "braceBulletContents", "endPunctuation", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1;", "ignore", "Lai/grazie/nlp/patterns/AggregatedPattern;", "normalSentenceEnd", "punctuationTokenizer", "Lai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer;", "romanBullet", "sentenceContinuation", "Lkotlin/text/Regex;", "spaceOrEnd", "pairedDashes", "Lai/grazie/nlp/patterns/WithBeforeAfterPattern;", "pairedParentheses", "Lai/grazie/nlp/patterns/RegexPattern;", "nlp-tokenizer"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final StandardSentenceTokenizer getDefault() {
/*     */       return StandardSentenceTokenizer.Default;
/*     */     } private final RegexPattern pairedParentheses() {
/*     */       String noParentheses = "[^()]";
/*     */       String nestedParentheses = "\\(" + noParentheses + "{1,500}\\)" + noParentheses + "{0,500}";
/*     */       return new RegexPattern(new Regex("\\(" + noParentheses + "{1,500}(" + nestedParentheses + ")*\\)"));
/*     */     } private final WithBeforeAfterPattern pairedDashes() {
/*     */       Regex dashRegex = new Regex("[-–—]+([^-–—]{1,100})[-–—]+");
/*     */       Regex smileyRegex = new Regex("[:;]-?[()]+");
/*     */       return new WithBeforeAfterPattern((Pattern)new StandardSentenceTokenizer$Companion$pairedDashes$1(dashRegex, smileyRegex), WithBeforeAfterPattern.BeforePattern.Companion.getWordBoundary(), WithBeforeAfterPattern.AfterPattern.Companion.getWordBoundary());
/*     */     } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */     @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n*L\n49#1:124\n49#1:125,2\n*E\n"})
/*     */     public static final class StandardSentenceTokenizer$Companion$pairedDashes$1 extends RegexPattern { StandardSentenceTokenizer$Companion$pairedDashes$1(Regex $dashRegex, Regex $smileyRegex) {
/*     */         super($dashRegex);
/*     */       }
/*     */       @NotNull
/*     */       public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text");
/*     */         List list1 = super.find(text);
/*     */         Regex regex1 = this.$dashRegex, regex2 = this.$smileyRegex;
/*     */         int $i$f$filter = 0;
/* 124 */         List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 125 */         for (Object element$iv$iv : list2) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-StandardSentenceTokenizer$Companion$pairedDashes$1$find$1 = 0; CharSequence withDashes = text.subSequence(it.getStart(), it.getEndExclusive()); Intrinsics.checkNotNull(regex1.matchEntire(withDashes)); String withoutDashes = regex1.matchEntire(withDashes).getGroupValues().get(1); }
/* 126 */          return (List<TextRange>)destination$iv$iv; } } } @NotNull public static final Companion Companion = new Companion(null); @Nullable private final PatternSplitTokenizer newLineTokenizer; @NotNull private static final StandardSentenceTokenizer Default = new StandardSentenceTokenizer(Integer.valueOf(2)); @NotNull private static final StandardSentenceTokenizer$Companion$Parenthetical$1 Parenthetical; @NotNull private static final StandardSentenceTokenizer$Companion$Ellipsis$1 Ellipsis; @NotNull private static final AggregatedPattern ignore; @NotNull private static final String normalSentenceEnd = "[?!.]+[)}\\]'\"]?"; @NotNull private static final String romanBullet = "(^|\n)[ivxlmcdIVXLMCD]+\\)"; @NotNull private static final String braceBulletContents = "[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*"; @NotNull private static final String braceBullet = "(^|\n)(\\([\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\)|\\[[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\])"; @NotNull private static final String spaceOrEnd = "\n+|\\s+|$"; @NotNull private static final Regex sentenceContinuation; @NotNull private static final StandardSentenceTokenizer$Companion$endPunctuation$1 endPunctuation; static { Pattern[] arrayOfPattern3 = new Pattern[2]; arrayOfPattern3[0] = (Pattern)Companion.pairedParentheses(); arrayOfPattern3[1] = (Pattern)Companion.pairedDashes(); Pattern[] arrayOfPattern2 = arrayOfPattern3; Parenthetical = new StandardSentenceTokenizer$Companion$Parenthetical$1(arrayOfPattern2); Regex regex2 = new Regex("(^|\"|\\s)(\\.{3,}|…)($|\"|\\s)"); Ellipsis = new StandardSentenceTokenizer$Companion$Ellipsis$1(regex2); Pattern[] arrayOfPattern1 = new Pattern[12]; arrayOfPattern1[0] = (Pattern)Parenthetical; arrayOfPattern1[1] = (Pattern)Ellipsis; arrayOfPattern1[2] = (Pattern)LikelyPatterns.INSTANCE.getNameInitials(); arrayOfPattern1[3] = (Pattern)LikelyPatterns.INSTANCE.getActionNameEllipsis(); arrayOfPattern1[4] = (Pattern)LikelyPatterns.INSTANCE.getPunctuationOperator(); arrayOfPattern1[5] = (Pattern)LikelyPatterns.INSTANCE.getIsEmail(); arrayOfPattern1[6] = (Pattern)LikelyPatterns.INSTANCE.getIsAbbreviation(); arrayOfPattern1[7] = (Pattern)LikelyPatterns.INSTANCE.getIsOrdinalNumeral(); arrayOfPattern1[8] = (Pattern)LikelyPatterns.INSTANCE.getIsIPv4(); arrayOfPattern1[9] = LikelyPatterns.INSTANCE.getIsURL(); arrayOfPattern1[10] = (Pattern)LikelyPatterns.INSTANCE.getIsFilePath(); arrayOfPattern1[11] = (Pattern)StrictPatterns.INSTANCE.getIsUUID(); ignore = new AggregatedPattern(arrayOfPattern1); Companion $this$sentenceContinuation_u24lambda_u243 = Companion; int $i$a$-run-StandardSentenceTokenizer$Companion$sentenceContinuation$1 = 0; String dashes = "(\\s+[-–—]+)"; String emotionalPunctuation = "([?!]|([:;]-?[()]+))"; String directSpeechEnd = "(\\?\"|!(\\.+\"?|\\.*\")|\\.{3,}[\"?]*)"; sentenceContinuation = new Regex("(" + directSpeechEnd + dashes + "?|" + emotionalPunctuation + dashes + ")\\s+\\p{Ll}"); Regex regex1 = new Regex("([?!.]+[)}\\]'\"]?|(^|\n)[ivxlmcdIVXLMCD]+\\)|(^|\n)(\\([\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\)|\\[[\\d\\p{L}]{1,3}(\\.[\\d\\p{L}]{1,3})*\\]))(\n+|\\s+|$)|([:;]-?[()]+)(\n+|\\s+|$|[?!.]+[)}\\]'\"]?)+"); endPunctuation = new StandardSentenceTokenizer$Companion$endPunctuation$1(regex1); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1", "Lai/grazie/nlp/patterns/AggregatedPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"}) public static final class StandardSentenceTokenizer$Companion$Parenthetical$1 extends AggregatedPattern { StandardSentenceTokenizer$Companion$Parenthetical$1(Pattern[] $super_call_param$1) { super($super_call_param$1); } @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"}) public static final class StandardSentenceTokenizer$Companion$Ellipsis$1 extends RegexPattern { StandardSentenceTokenizer$Companion$Ellipsis$1(Regex $super_call_param$1) { super($super_call_param$1); } @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"}) @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1\n*L\n93#1:124\n93#1:125,2\n*E\n"}) public static final class StandardSentenceTokenizer$Companion$endPunctuation$1 extends RegexPattern { @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable $this$filter$iv = super.find(text); int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (Object element$iv$iv : iterable1) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-StandardSentenceTokenizer$Companion$endPunctuation$1$find$1 = 0; if (!StandardSentenceTokenizer.sentenceContinuation.matchesAt(text, it.getStart())) destination$iv$iv.add(element$iv$iv);  }  return (List)destination$iv$iv; } StandardSentenceTokenizer$Companion$endPunctuation$1(Regex $super_call_param$1) { super($super_call_param$1); } } @NotNull private static final PatternSplitTokenizer punctuationTokenizer = new PatternSplitTokenizer((Pattern)endPunctuation, Direction.Right, (Pattern)ignore); private final StandardSentenceTokenizer$newLinesPattern$1 newLinesPattern(int splitByNewLinesNumber) { Regex regex = new Regex("\n{" + splitByNewLinesNumber + ",}"); return new StandardSentenceTokenizer$newLinesPattern$1(regex); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$newLinesPattern$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"}) public static final class StandardSentenceTokenizer$newLinesPattern$1 extends RegexPattern { StandardSentenceTokenizer$newLinesPattern$1(Regex $super_call_param$1) { super($super_call_param$1); } @NotNull public List<TextRange> find(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); return super.find(text); } } @NotNull public List<Tokenizer.Token> tokenize(@NotNull Text text) { Intrinsics.checkNotNullParameter(text, "text"); Iterable<TextRange> $this$map$iv = tokenRanges((CharSequence)text); int $i$f$map = 0; Iterable<TextRange> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0; for (TextRange item$iv$iv : iterable1) { TextRange textRange1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-StandardSentenceTokenizer$tokenize$1 = 0; collection.add(new Tokenizer.Token(text.substring(textRange1), textRange1)); }
/* 127 */      return (List<Tokenizer.Token>)destination$iv$iv; } @NotNull public final List<TextRange> tokenRanges(@NotNull CharSequence text) { Intrinsics.checkNotNullParameter(text, "text"); if (this.newLineTokenizer == null || this.newLineTokenizer.tokenRanges(text) == null)
/* 128 */       this.newLineTokenizer.tokenRanges(text);  List hard = CollectionsKt.listOf(new TextRange(0, text.length())); Iterable $this$flatMap$iv = hard; int $i$f$flatMap = 0; Iterable iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 129 */     for (Object element$iv$iv : iterable1) {
/* 130 */       TextRange chunk = (TextRange)element$iv$iv; int $i$a$-flatMap-StandardSentenceTokenizer$tokenRanges$1 = 0; Iterable $this$map$iv = punctuationTokenizer.tokenRanges(text.subSequence(chunk.getStart(), chunk.getEndExclusive())); int $i$f$map = 0;
/* 131 */       Iterable iterable2 = $this$map$iv; Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 132 */       Iterator iterator = iterable2.iterator();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 137 */     return (List<TextRange>)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   public StandardSentenceTokenizer() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */