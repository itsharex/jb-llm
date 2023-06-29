/*     */ package ai.grazie.nlp.tokenizer.sentence;
/*     */ 
/*     */ import ai.grazie.nlp.patterns.Pattern;
/*     */ import ai.grazie.nlp.patterns.RegexPattern;
/*     */ import ai.grazie.nlp.patterns.WithBeforeAfterPattern;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Q\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\b\003\n\002\b\003\n\002\020\016\n\002\b\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000*\003\b\013\021\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\034\032\0020\035H\002J\b\020\036\032\0020\037H\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\020\020\007\032\0020\bX\004¢\006\004\n\002\020\tR\020\020\n\032\0020\013X\004¢\006\004\n\002\020\fR\016\020\r\032\0020\016XT¢\006\002\n\000R\016\020\017\032\0020\016XT¢\006\002\n\000R\020\020\020\032\0020\021X\004¢\006\004\n\002\020\022R\016\020\023\032\0020\024X\004¢\006\002\n\000R\016\020\025\032\0020\016XT¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\016XT¢\006\002\n\000R\016\020\031\032\0020\032X\004¢\006\002\n\000R\016\020\033\032\0020\016XT¢\006\002\n\000¨\006 "}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion;", "", "()V", "Default", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "getDefault", "()Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer;", "Ellipsis", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Ellipsis$1;", "Parenthetical", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$Parenthetical$1;", "braceBullet", "", "braceBulletContents", "endPunctuation", "ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1", "Lai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$endPunctuation$1;", "ignore", "Lai/grazie/nlp/patterns/AggregatedPattern;", "normalSentenceEnd", "punctuationTokenizer", "Lai/grazie/nlp/tokenizer/rule/PatternSplitTokenizer;", "romanBullet", "sentenceContinuation", "Lkotlin/text/Regex;", "spaceOrEnd", "pairedDashes", "Lai/grazie/nlp/patterns/WithBeforeAfterPattern;", "pairedParentheses", "Lai/grazie/nlp/patterns/RegexPattern;", "nlp-tokenizer"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final StandardSentenceTokenizer getDefault() {
/*  27 */     return StandardSentenceTokenizer.access$getDefault$cp();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final RegexPattern pairedParentheses() {
/*  38 */     String noParentheses = "[^()]";
/*  39 */     String nestedParentheses = "\\(" + noParentheses + "{1,500}\\)" + noParentheses + "{0,500}";
/*  40 */     return new RegexPattern(new Regex("\\(" + noParentheses + "{1,500}(" + nestedParentheses + ")*\\)"));
/*     */   }
/*     */   
/*     */   private final WithBeforeAfterPattern pairedDashes() {
/*  44 */     Regex dashRegex = new Regex("[-–—]+([^-–—]{1,100})[-–—]+");
/*  45 */     Regex smileyRegex = new Regex("[:;]-?[()]+");
/*  46 */     return new WithBeforeAfterPattern(
/*  47 */         (Pattern)new StandardSentenceTokenizer$Companion$pairedDashes$1(dashRegex, smileyRegex), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  56 */         WithBeforeAfterPattern.BeforePattern.Companion.getWordBoundary(), 
/*  57 */         WithBeforeAfterPattern.AfterPattern.Companion.getWordBoundary());
/*     */   }
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
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\r\n\000*\001\000\b\n\030\0002\0020\001J\026\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1", "Lai/grazie/nlp/patterns/RegexPattern;", "find", "", "Lai/grazie/text/TextRange;", "text", "", "nlp-tokenizer"})
/*     */   @SourceDebugExtension({"SMAP\nStandardSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n*S KotlinDebug\n*F\n+ 1 StandardSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion$pairedDashes$1\n*L\n49#1:124\n49#1:125,2\n*E\n"})
/*     */   public static final class StandardSentenceTokenizer$Companion$pairedDashes$1
/*     */     extends RegexPattern
/*     */   {
/*     */     StandardSentenceTokenizer$Companion$pairedDashes$1(Regex $dashRegex, Regex $smileyRegex) {
/*     */       super($dashRegex);
/*     */     }
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
/*     */     @NotNull
/*     */     public List<TextRange> find(@NotNull CharSequence text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       List list1 = super.find(text);
/*     */       Regex regex1 = this.$dashRegex, regex2 = this.$smileyRegex;
/*     */       int $i$f$filter = 0;
/* 124 */       List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 125 */       for (Object element$iv$iv : list2) { TextRange it = (TextRange)element$iv$iv; int $i$a$-filter-StandardSentenceTokenizer$Companion$pairedDashes$1$find$1 = 0; CharSequence withDashes = text.subSequence(it.getStart(), it.getEndExclusive()); Intrinsics.checkNotNull(regex1.matchEntire(withDashes)); String withoutDashes = regex1.matchEntire(withDashes).getGroupValues().get(1); }
/* 126 */        return (List<TextRange>)destination$iv$iv;
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/sentence/StandardSentenceTokenizer$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */