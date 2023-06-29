/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ 
/*     */ import ai.grazie.nlp.langs.Language;
/*     */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*     */ import ai.grazie.nlp.tokenizer.spacy.de.SpacyGerman;
/*     */ import ai.grazie.nlp.tokenizer.spacy.de.SpacyGermanTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.en.SpacyEnglish;
/*     */ import ai.grazie.nlp.tokenizer.spacy.en.SpacyEnglishTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.ru.SpacyRussian;
/*     */ import ai.grazie.nlp.tokenizer.spacy.ru.SpacyRussianTokenizerExceptions;
/*     */ import ai.grazie.nlp.tokenizer.spacy.uk.SpacyUkrainian;
/*     */ import ai.grazie.nlp.tokenizer.spacy.uk.SpacyUkrainianTokenizerExceptions;
/*     */ import ai.grazie.nlp.utils.RangesKt;
/*     */ import ai.grazie.nlp.utils.normalization.AggregatedNormalizer;
/*     */ import ai.grazie.nlp.utils.normalization.CapsNormalizer;
/*     */ import ai.grazie.nlp.utils.normalization.Normalizer;
/*     */ import ai.grazie.nlp.utils.normalization.UnicodePunctuationNormalizer;
/*     */ import ai.grazie.utils.mpp.LoggerFactory;
/*     */ import ai.grazie.utils.mpp.MPPLogger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.IntProgression;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.text.CharsKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\"\n\002\020\f\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\n\030\000 '2\0020\001:\002'(B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\036\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\0242\006\020\025\032\0020\026H\002J\026\020\027\032\b\022\004\022\0020\0310\0302\006\020\032\032\0020\026H\002J\020\020\033\032\0020\0342\006\020\032\032\0020\026H\002J\020\020\035\032\0020\0342\006\020\032\032\0020\026H\002J\020\020\036\032\0020\0372\006\020 \032\0020\026H\002J\026\020!\032\b\022\004\022\0020\0260\0212\006\020\"\032\0020\026H\002J\026\020#\032\b\022\004\022\0020\0220\0212\006\020$\032\0020\026H\026J\026\020%\032\b\022\004\022\0020\0220\0212\006\020$\032\0020\026H\002J\026\020&\032\b\022\004\022\0020\0220\0212\006\020\025\032\0020\026H\002R\016\020\004\032\0020\003X\004¢\006\002\n\000R\024\020\013\032\b\022\004\022\0020\r0\fX\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\005\032\0020\003X\004¢\006\002\n\000¨\006)"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "prefix", "Lkotlin/text/Regex;", "infix", "suffix", "specialCases", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;", "preNormalizer", "Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;", "(Lkotlin/text/Regex;Lkotlin/text/Regex;Lkotlin/text/Regex;Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;)V", "oneCharSuffixes", "", "", "getPrefix", "()Lkotlin/text/Regex;", "finalizeSplit", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "splits", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits;", "word", "", "findInfix", "Lkotlin/sequences/Sequence;", "Lkotlin/text/MatchResult;", "tok", "findPrefix", "", "findSuffix", "isSpecialOrFinal", "", "token", "splitInfixes", "remainingWord", "tokenize", "text", "tokenizeSpacyNormalized", "tokenizeToken", "Companion", "TokenSplits", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nSpacyTokenizerFast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1083#2,2:355\n1064#2,2:357\n1064#2,2:359\n1064#2,2:376\n766#3:361\n857#3,2:362\n1549#3:364\n1620#3,3:365\n1549#3:368\n1620#3,3:369\n1549#3:372\n1620#3,3:373\n1855#3,2:378\n*S KotlinDebug\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast\n*L\n170#1:355,2\n182#1:357,2\n183#1:359,2\n286#1:376,2\n200#1:361\n200#1:362,2\n201#1:364\n201#1:365,3\n214#1:368\n214#1:369,3\n226#1:372\n226#1:373,3\n292#1:378,2\n*E\n"})
/*     */ public final class SpacyTokenizerFast implements Tokenizer {
/*  44 */   public SpacyTokenizerFast(@NotNull Regex prefix, @NotNull Regex infix, @NotNull Regex suffix, @NotNull SpacyTokenizerSpecialCases specialCases, @NotNull AggregatedNormalizer preNormalizer) { this.prefix = prefix;
/*  45 */     this.infix = infix;
/*  46 */     this.suffix = suffix;
/*  47 */     this.specialCases = specialCases;
/*  48 */     this.preNormalizer = preNormalizer;
/*     */ 
/*     */ 
/*     */     
/*  52 */     Character[] arrayOfCharacter = new Character[6]; arrayOfCharacter[0] = Character.valueOf('.'); arrayOfCharacter[1] = Character.valueOf(':'); arrayOfCharacter[2] = Character.valueOf(';'); arrayOfCharacter[3] = Character.valueOf(','); arrayOfCharacter[4] = Character.valueOf('?'); arrayOfCharacter[5] = Character.valueOf('!'); this.oneCharSuffixes = SetsKt.setOf((Object[])arrayOfCharacter); } @NotNull
/*     */   public final Regex getPrefix() {
/*     */     return this.prefix;
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\020\016\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ \020\016\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ \020\017\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ \020\020\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fJ \020\021\032\0020\0062\b\b\002\020\t\032\0020\n2\016\b\002\020\013\032\b\022\004\022\0020\r0\fR\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$Companion;", "", "()V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "load", "Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;", "language", "Lai/grazie/nlp/langs/Language;", "replaceApostropheWithQuote", "", "additionalPrefixes", "", "", "loadEnglish", "loadGerman", "loadRussian", "loadUkrainian", "nlp-tokenizer"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final SpacyTokenizerFast load(@NotNull Language language, boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/*  58 */       Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes"); switch (WhenMappings.$EnumSwitchMapping$0[language.ordinal()]) { case 1: 
/*     */         case 2: 
/*     */         case 3: 
/*     */         case 4:
/*  62 */          }  throw new IllegalStateException(
/*  63 */           "Language is not supported".toString());
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadEnglish(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/*  69 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/*  70 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/*  71 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/*  73 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyEnglish.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyEnglish.INSTANCE.getPrefixes(), additionalPrefixes);
/*  74 */       return new SpacyTokenizerFast(
/*  75 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/*  76 */           SpacyBaseLanguage.INSTANCE.compileInfix(SpacyEnglish.INSTANCE.getInfixes()), 
/*  77 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyEnglish.INSTANCE.getSuffixes()), 
/*  78 */           new SpacyTokenizerSpecialCases(
/*  79 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/*  80 */             SpacyEnglishTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/*  82 */           preNormalizer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadGerman(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/*  87 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/*  88 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/*  89 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/*  91 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyGerman.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyGerman.INSTANCE.getPrefixes(), additionalPrefixes);
/*  92 */       return new SpacyTokenizerFast(
/*  93 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/*  94 */           SpacyBaseLanguage.INSTANCE.compileInfix(SpacyGerman.INSTANCE.getInfixes()), 
/*  95 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyGerman.INSTANCE.getSuffixes()), 
/*  96 */           new SpacyTokenizerSpecialCases(
/*  97 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/*  98 */             SpacyGermanTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/* 100 */           preNormalizer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadRussian(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/* 105 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/* 106 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/* 107 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/* 109 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyRussian.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyRussian.INSTANCE.getPrefixes(), additionalPrefixes);
/* 110 */       return new SpacyTokenizerFast(
/* 111 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/* 112 */           SpacyBaseLanguage.INSTANCE.compileInfix(SpacyRussian.INSTANCE.getInfixes()), 
/* 113 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyRussian.INSTANCE.getSuffixes()), 
/* 114 */           new SpacyTokenizerSpecialCases(
/* 115 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/* 116 */             SpacyRussianTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/* 118 */           preNormalizer);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpacyTokenizerFast loadUkrainian(boolean replaceApostropheWithQuote, @NotNull List additionalPrefixes) {
/* 123 */       Intrinsics.checkNotNullParameter(additionalPrefixes, "additionalPrefixes");
/* 124 */       Normalizer[] arrayOfNormalizer = new Normalizer[2]; arrayOfNormalizer[0] = (Normalizer)new UnicodePunctuationNormalizer(replaceApostropheWithQuote); arrayOfNormalizer[1] = 
/* 125 */         (Normalizer)new CapsNormalizer();
/*     */       AggregatedNormalizer preNormalizer = new AggregatedNormalizer(arrayOfNormalizer);
/* 127 */       List<String> prefixes = additionalPrefixes.isEmpty() ? SpacyUkrainian.INSTANCE.getPrefixes() : CollectionsKt.plus(SpacyUkrainian.INSTANCE.getPrefixes(), additionalPrefixes);
/* 128 */       return new SpacyTokenizerFast(
/* 129 */           SpacyBaseLanguage.INSTANCE.compilePrefix(prefixes), 
/* 130 */           SpacyBaseLanguage.INSTANCE.compileInfix(SpacyUkrainian.INSTANCE.getInfixes()), 
/* 131 */           SpacyBaseLanguage.INSTANCE.compileSuffix(SpacyUkrainian.INSTANCE.getSuffixes()), 
/* 132 */           new SpacyTokenizerSpecialCases(
/* 133 */             SpacyBaseLanguage.BaseExceptions.INSTANCE.getExceptions(), 
/* 134 */             SpacyUkrainianTokenizerExceptions.INSTANCE.getExceptions()), 
/*     */           
/* 136 */           preNormalizer); } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Regex prefix; @NotNull private final Regex infix; @NotNull private final Regex suffix; @NotNull private final SpacyTokenizerSpecialCases specialCases; @NotNull
/*     */   private final AggregatedNormalizer preNormalizer; @NotNull
/*     */   private final Set<Character> oneCharSuffixes; @NotNull
/*     */   private static final MPPLogger logger = LoggerFactory.INSTANCE.create("ai.grazie.nlp.tokenizer.spacy.SpacyTokenizer"); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\007\n\002\020 \n\002\030\002\n\000\b\002\030\0002\0020\001B\005¢\006\002\020\002J\f\020\r\032\b\022\004\022\0020\0170\016R!\020\003\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\007\020\bR!\020\t\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\n\020\bR!\020\013\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\f\020\b¨\006\020"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits;", "", "()V", "prefixes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getPrefixes", "()Ljava/util/ArrayList;", "suffixes", "getSuffixes", "wordTokens", "getWordTokens", "toList", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "nlp-tokenizer"})
/*     */   @SourceDebugExtension({"SMAP\nSpacyTokenizerFast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1549#2:355\n1620#2,3:356\n*S KotlinDebug\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits\n*L\n148#1:355\n148#1:356,3\n*E\n"})
/*     */   private static final class TokenSplits { @NotNull
/* 142 */     private final ArrayList<String> prefixes; public TokenSplits() { this.prefixes = new ArrayList<>();
/* 143 */       this.suffixes = new ArrayList<>();
/* 144 */       this.wordTokens = new ArrayList<>(); } @NotNull private final ArrayList<String> suffixes; @NotNull private final ArrayList<String> wordTokens; @NotNull public final ArrayList<String> getPrefixes() { return this.prefixes; } @NotNull public final ArrayList<String> getSuffixes() { return this.suffixes; } @NotNull public final ArrayList<String> getWordTokens() { return this.wordTokens; }
/*     */     
/*     */     @NotNull
/* 147 */     public final List<Tokenizer.Token> toList() { int cur = 0;
/* 148 */       Iterable $this$map$iv = CollectionsKt.plus(CollectionsKt.plus(this.prefixes, this.wordTokens), CollectionsKt.reversed(this.suffixes)); int $i$f$map = 0;
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
/* 355 */       Iterable iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 356 */       for (Object item$iv$iv : iterable1) {
/* 357 */         String str = (String)item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$TokenSplits$toList$1 = 0; int start = cur; cur += str.length(); collection.add(new Tokenizer.Token(str, new IntRange(start, cur - 1)));
/* 358 */       }  return (List<Tokenizer.Token>)destination$iv$iv; } } @NotNull public List<Tokenizer.Token> tokenize(@NotNull String text) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'text'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield preNormalizer : Lai/grazie/nlp/utils/normalization/AggregatedNormalizer;
/*     */     //   10: aload_1
/*     */     //   11: invokevirtual normalize : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   14: astore_2
/*     */     //   15: aload_2
/*     */     //   16: invokevirtual length : ()I
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual length : ()I
/*     */     //   23: if_icmpeq -> 43
/*     */     //   26: getstatic ai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast.logger : Lai/grazie/utils/mpp/MPPLogger;
/*     */     //   29: getstatic ai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$tokenize$1.INSTANCE : Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$tokenize$1;
/*     */     //   32: checkcast kotlin/jvm/functions/Function0
/*     */     //   35: aconst_null
/*     */     //   36: iconst_2
/*     */     //   37: aconst_null
/*     */     //   38: invokestatic error$default : (Lai/grazie/utils/mpp/MPPLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ILjava/lang/Object;)V
/*     */     //   41: aload_1
/*     */     //   42: astore_2
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial tokenizeSpacyNormalized : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   48: astore_3
/*     */     //   49: aload_3
/*     */     //   50: checkcast java/util/Collection
/*     */     //   53: invokeinterface isEmpty : ()Z
/*     */     //   58: ifne -> 65
/*     */     //   61: iconst_1
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_0
/*     */     //   66: ifeq -> 614
/*     */     //   69: aload_3
/*     */     //   70: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   73: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   76: astore #4
/*     */     //   78: aload #4
/*     */     //   80: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   83: checkcast java/lang/CharSequence
/*     */     //   86: bipush #46
/*     */     //   88: iconst_0
/*     */     //   89: iconst_2
/*     */     //   90: aconst_null
/*     */     //   91: invokestatic endsWith$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */     //   94: ifeq -> 246
/*     */     //   97: aload #4
/*     */     //   99: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   102: checkcast java/lang/CharSequence
/*     */     //   105: astore #5
/*     */     //   107: iconst_0
/*     */     //   108: istore #6
/*     */     //   110: iconst_0
/*     */     //   111: istore #7
/*     */     //   113: iload #7
/*     */     //   115: aload #5
/*     */     //   117: invokeinterface length : ()I
/*     */     //   122: if_icmpge -> 162
/*     */     //   125: aload #5
/*     */     //   127: iload #7
/*     */     //   129: invokeinterface charAt : (I)C
/*     */     //   134: istore #8
/*     */     //   136: iload #8
/*     */     //   138: istore #9
/*     */     //   140: iconst_0
/*     */     //   141: istore #10
/*     */     //   143: iload #9
/*     */     //   145: invokestatic isLetter : (C)Z
/*     */     //   148: nop
/*     */     //   149: ifeq -> 156
/*     */     //   152: iconst_1
/*     */     //   153: goto -> 163
/*     */     //   156: iinc #7, 1
/*     */     //   159: goto -> 113
/*     */     //   162: iconst_0
/*     */     //   163: ifeq -> 246
/*     */     //   166: iconst_2
/*     */     //   167: anewarray java/lang/String
/*     */     //   170: astore #6
/*     */     //   172: aload #6
/*     */     //   174: iconst_0
/*     */     //   175: aload #4
/*     */     //   177: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   180: iconst_0
/*     */     //   181: aload #4
/*     */     //   183: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   186: invokevirtual length : ()I
/*     */     //   189: iconst_1
/*     */     //   190: isub
/*     */     //   191: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   194: dup
/*     */     //   195: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
/*     */     //   197: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   200: aastore
/*     */     //   201: aload #6
/*     */     //   203: iconst_1
/*     */     //   204: ldc '.'
/*     */     //   206: aastore
/*     */     //   207: aload #6
/*     */     //   209: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   212: astore #5
/*     */     //   214: aload_3
/*     */     //   215: iconst_0
/*     */     //   216: aload_3
/*     */     //   217: invokeinterface size : ()I
/*     */     //   222: iconst_1
/*     */     //   223: isub
/*     */     //   224: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   229: checkcast java/util/Collection
/*     */     //   232: aload #4
/*     */     //   234: aload #5
/*     */     //   236: invokestatic splitToken : (Lai/grazie/nlp/tokenizer/Tokenizer$Token;Ljava/util/List;)Ljava/util/List;
/*     */     //   239: checkcast java/lang/Iterable
/*     */     //   242: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   245: astore_3
/*     */     //   246: new java/util/ArrayList
/*     */     //   249: dup
/*     */     //   250: invokespecial <init> : ()V
/*     */     //   253: astore #5
/*     */     //   255: aload_3
/*     */     //   256: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   261: astore #6
/*     */     //   263: iconst_0
/*     */     //   264: istore #7
/*     */     //   266: aload #6
/*     */     //   268: invokeinterface hasNext : ()Z
/*     */     //   273: ifeq -> 608
/*     */     //   276: iload #7
/*     */     //   278: istore #8
/*     */     //   280: iload #7
/*     */     //   282: iconst_1
/*     */     //   283: iadd
/*     */     //   284: istore #7
/*     */     //   286: aload #6
/*     */     //   288: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   293: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   296: astore #9
/*     */     //   298: iload #8
/*     */     //   300: ifne -> 314
/*     */     //   303: aload #5
/*     */     //   305: aload #9
/*     */     //   307: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   310: pop
/*     */     //   311: goto -> 266
/*     */     //   314: aload #5
/*     */     //   316: checkcast java/util/List
/*     */     //   319: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   322: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   325: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   328: checkcast java/lang/CharSequence
/*     */     //   331: astore #11
/*     */     //   333: iconst_0
/*     */     //   334: istore #12
/*     */     //   336: iconst_0
/*     */     //   337: istore #13
/*     */     //   339: iload #13
/*     */     //   341: aload #11
/*     */     //   343: invokeinterface length : ()I
/*     */     //   348: if_icmpge -> 401
/*     */     //   351: aload #11
/*     */     //   353: iload #13
/*     */     //   355: invokeinterface charAt : (I)C
/*     */     //   360: istore #14
/*     */     //   362: iload #14
/*     */     //   364: istore #15
/*     */     //   366: iconst_0
/*     */     //   367: istore #16
/*     */     //   369: iload #15
/*     */     //   371: bipush #63
/*     */     //   373: if_icmpeq -> 383
/*     */     //   376: iload #15
/*     */     //   378: bipush #33
/*     */     //   380: if_icmpne -> 387
/*     */     //   383: iconst_1
/*     */     //   384: goto -> 388
/*     */     //   387: iconst_0
/*     */     //   388: ifne -> 395
/*     */     //   391: iconst_0
/*     */     //   392: goto -> 402
/*     */     //   395: iinc #13, 1
/*     */     //   398: goto -> 339
/*     */     //   401: iconst_1
/*     */     //   402: istore #10
/*     */     //   404: aload #9
/*     */     //   406: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   409: checkcast java/lang/CharSequence
/*     */     //   412: astore #12
/*     */     //   414: iconst_0
/*     */     //   415: istore #13
/*     */     //   417: iconst_0
/*     */     //   418: istore #14
/*     */     //   420: iload #14
/*     */     //   422: aload #12
/*     */     //   424: invokeinterface length : ()I
/*     */     //   429: if_icmpge -> 482
/*     */     //   432: aload #12
/*     */     //   434: iload #14
/*     */     //   436: invokeinterface charAt : (I)C
/*     */     //   441: istore #15
/*     */     //   443: iload #15
/*     */     //   445: istore #16
/*     */     //   447: iconst_0
/*     */     //   448: istore #17
/*     */     //   450: iload #16
/*     */     //   452: bipush #63
/*     */     //   454: if_icmpeq -> 464
/*     */     //   457: iload #16
/*     */     //   459: bipush #33
/*     */     //   461: if_icmpne -> 468
/*     */     //   464: iconst_1
/*     */     //   465: goto -> 469
/*     */     //   468: iconst_0
/*     */     //   469: ifne -> 476
/*     */     //   472: iconst_0
/*     */     //   473: goto -> 483
/*     */     //   476: iinc #14, 1
/*     */     //   479: goto -> 420
/*     */     //   482: iconst_1
/*     */     //   483: istore #11
/*     */     //   485: iload #10
/*     */     //   487: ifeq -> 597
/*     */     //   490: iload #11
/*     */     //   492: ifeq -> 597
/*     */     //   495: aload #5
/*     */     //   497: checkcast java/util/List
/*     */     //   500: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   503: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   506: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   509: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
/*     */     //   512: aload #9
/*     */     //   514: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   517: invokevirtual getFirst : ()I
/*     */     //   520: if_icmpne -> 597
/*     */     //   523: aload #5
/*     */     //   525: checkcast java/util/List
/*     */     //   528: invokestatic removeLast : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   531: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   534: astore #12
/*     */     //   536: aload #5
/*     */     //   538: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   541: dup
/*     */     //   542: new ai/grazie/text/Text
/*     */     //   545: dup
/*     */     //   546: aload #12
/*     */     //   548: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   551: aload #9
/*     */     //   553: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   556: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   561: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   564: new ai/grazie/text/TextRange
/*     */     //   567: dup
/*     */     //   568: aload #12
/*     */     //   570: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   573: invokevirtual getFirst : ()I
/*     */     //   576: aload #9
/*     */     //   578: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   581: invokestatic getCheckedEndExclusive : (Lkotlin/ranges/IntRange;)I
/*     */     //   584: invokespecial <init> : (II)V
/*     */     //   587: invokespecial <init> : (Lai/grazie/text/Text;Lai/grazie/text/TextRange;)V
/*     */     //   590: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   593: pop
/*     */     //   594: goto -> 266
/*     */     //   597: aload #5
/*     */     //   599: aload #9
/*     */     //   601: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   604: pop
/*     */     //   605: goto -> 266
/*     */     //   608: aload #5
/*     */     //   610: checkcast java/util/List
/*     */     //   613: astore_3
/*     */     //   614: aload_3
/*     */     //   615: checkcast java/lang/Iterable
/*     */     //   618: astore #4
/*     */     //   620: nop
/*     */     //   621: iconst_0
/*     */     //   622: istore #5
/*     */     //   624: aload #4
/*     */     //   626: astore #6
/*     */     //   628: new java/util/ArrayList
/*     */     //   631: dup
/*     */     //   632: invokespecial <init> : ()V
/*     */     //   635: checkcast java/util/Collection
/*     */     //   638: astore #7
/*     */     //   640: iconst_0
/*     */     //   641: istore #8
/*     */     //   643: aload #6
/*     */     //   645: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   650: astore #9
/*     */     //   652: aload #9
/*     */     //   654: invokeinterface hasNext : ()Z
/*     */     //   659: ifeq -> 717
/*     */     //   662: aload #9
/*     */     //   664: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   669: astore #10
/*     */     //   671: aload #10
/*     */     //   673: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   676: astore #11
/*     */     //   678: iconst_0
/*     */     //   679: istore #12
/*     */     //   681: aload #11
/*     */     //   683: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   686: checkcast java/lang/CharSequence
/*     */     //   689: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   692: ifne -> 699
/*     */     //   695: iconst_1
/*     */     //   696: goto -> 700
/*     */     //   699: iconst_0
/*     */     //   700: nop
/*     */     //   701: ifeq -> 652
/*     */     //   704: aload #7
/*     */     //   706: aload #10
/*     */     //   708: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   713: pop
/*     */     //   714: goto -> 652
/*     */     //   717: aload #7
/*     */     //   719: checkcast java/util/List
/*     */     //   722: nop
/*     */     //   723: checkcast java/lang/Iterable
/*     */     //   726: astore #4
/*     */     //   728: nop
/*     */     //   729: iconst_0
/*     */     //   730: istore #5
/*     */     //   732: aload #4
/*     */     //   734: astore #6
/*     */     //   736: new java/util/ArrayList
/*     */     //   739: dup
/*     */     //   740: aload #4
/*     */     //   742: bipush #10
/*     */     //   744: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   747: invokespecial <init> : (I)V
/*     */     //   750: checkcast java/util/Collection
/*     */     //   753: astore #7
/*     */     //   755: iconst_0
/*     */     //   756: istore #8
/*     */     //   758: aload #6
/*     */     //   760: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   765: astore #9
/*     */     //   767: aload #9
/*     */     //   769: invokeinterface hasNext : ()Z
/*     */     //   774: ifeq -> 833
/*     */     //   777: aload #9
/*     */     //   779: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   784: astore #10
/*     */     //   786: aload #7
/*     */     //   788: aload #10
/*     */     //   790: checkcast ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   793: astore #11
/*     */     //   795: astore #18
/*     */     //   797: iconst_0
/*     */     //   798: istore #12
/*     */     //   800: new ai/grazie/nlp/tokenizer/Tokenizer$Token
/*     */     //   803: dup
/*     */     //   804: aload_1
/*     */     //   805: aload #11
/*     */     //   807: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   810: invokestatic substring : (Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;
/*     */     //   813: aload #11
/*     */     //   815: invokevirtual getRange : ()Lkotlin/ranges/IntRange;
/*     */     //   818: invokespecial <init> : (Ljava/lang/String;Lkotlin/ranges/IntRange;)V
/*     */     //   821: aload #18
/*     */     //   823: swap
/*     */     //   824: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   829: pop
/*     */     //   830: goto -> 767
/*     */     //   833: aload #7
/*     */     //   835: checkcast java/util/List
/*     */     //   838: nop
/*     */     //   839: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 6
/*     */     //   #158	-> 15
/*     */     //   #159	-> 26
/*     */     //   #162	-> 41
/*     */     //   #165	-> 43
/*     */     //   #166	-> 49
/*     */     //   #166	-> 66
/*     */     //   #167	-> 69
/*     */     //   #170	-> 78
/*     */     //   #355	-> 110
/*     */     //   #170	-> 143
/*     */     //   #170	-> 148
/*     */     //   #355	-> 149
/*     */     //   #356	-> 162
/*     */     //   #170	-> 163
/*     */     //   #171	-> 166
/*     */     //   #171	-> 201
/*     */     //   #172	-> 214
/*     */     //   #175	-> 246
/*     */     //   #176	-> 255
/*     */     //   #177	-> 298
/*     */     //   #178	-> 303
/*     */     //   #179	-> 311
/*     */     //   #182	-> 314
/*     */     //   #357	-> 336
/*     */     //   #182	-> 369
/*     */     //   #357	-> 388
/*     */     //   #358	-> 401
/*     */     //   #182	-> 402
/*     */     //   #183	-> 404
/*     */     //   #359	-> 417
/*     */     //   #183	-> 450
/*     */     //   #359	-> 469
/*     */     //   #360	-> 482
/*     */     //   #183	-> 483
/*     */     //   #184	-> 485
/*     */     //   #185	-> 523
/*     */     //   #186	-> 536
/*     */     //   #187	-> 538
/*     */     //   #188	-> 542
/*     */     //   #189	-> 564
/*     */     //   #187	-> 587
/*     */     //   #186	-> 590
/*     */     //   #193	-> 597
/*     */     //   #196	-> 608
/*     */     //   #199	-> 614
/*     */     //   #200	-> 620
/*     */     //   #361	-> 624
/*     */     //   #362	-> 643
/*     */     //   #200	-> 681
/*     */     //   #200	-> 700
/*     */     //   #362	-> 701
/*     */     //   #363	-> 717
/*     */     //   #361	-> 722
/*     */     //   #201	-> 728
/*     */     //   #364	-> 732
/*     */     //   #365	-> 758
/*     */     //   #366	-> 786
/*     */     //   #201	-> 800
/*     */     //   #366	-> 824
/*     */     //   #367	-> 833
/*     */     //   #364	-> 838
/*     */     //   #199	-> 839
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   143	6	10	$i$a$-any-SpacyTokenizerFast$tokenize$2	I
/*     */     //   140	9	9	it	C
/*     */     //   136	20	8	element$iv	C
/*     */     //   110	53	6	$i$f$any	I
/*     */     //   107	56	5	$this$any$iv	Ljava/lang/CharSequence;
/*     */     //   214	32	5	lastTokenParts	Ljava/util/List;
/*     */     //   369	19	16	$i$a$-all-SpacyTokenizerFast$tokenize$lastQE$1	I
/*     */     //   366	22	15	it	C
/*     */     //   362	33	14	element$iv	C
/*     */     //   336	66	12	$i$f$all	I
/*     */     //   333	69	11	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   450	19	17	$i$a$-all-SpacyTokenizerFast$tokenize$currentQE$1	I
/*     */     //   447	22	16	it	C
/*     */     //   443	33	15	element$iv	C
/*     */     //   417	66	13	$i$f$all	I
/*     */     //   414	69	12	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   536	58	12	lastMerged	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   404	201	10	lastQE	Z
/*     */     //   485	120	11	currentQE	Z
/*     */     //   280	328	8	i	I
/*     */     //   298	310	9	token	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   78	536	4	lastToken	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   255	359	5	mergedTokens	Ljava/util/ArrayList;
/*     */     //   681	20	12	$i$a$-filter-SpacyTokenizerFast$tokenize$3	I
/*     */     //   678	23	11	it	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   671	43	10	element$iv$iv	Ljava/lang/Object;
/*     */     //   643	76	8	$i$f$filterTo	I
/*     */     //   640	79	6	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   640	79	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   624	99	5	$i$f$filter	I
/*     */     //   621	102	4	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   800	21	12	$i$a$-map-SpacyTokenizerFast$tokenize$4	I
/*     */     //   797	24	11	it	Lai/grazie/nlp/tokenizer/Tokenizer$Token;
/*     */     //   786	44	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   758	77	8	$i$f$mapTo	I
/*     */     //   755	80	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   755	80	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   732	107	5	$i$f$map	I
/*     */     //   729	110	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   15	825	2	normalizedText	Ljava/lang/String;
/*     */     //   49	791	3	normalizedTokens	Ljava/util/List;
/*     */     //   0	840	0	this	Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;
/*     */     //   0	840	1	text	Ljava/lang/String; }
/*     */   private final List<Tokenizer.Token> tokenizeSpacyNormalized(String text) { if ((text.length() == 0))
/*     */       return CollectionsKt.emptyList();  ArrayList<Tokenizer.Token> result = new ArrayList(); int start = 0; start = -1; byte b; int i; for (b = 0, i = text.length(); b < i; ) {
/*     */       int j = b; char uc = text.charAt(b); if (CharsKt.isWhitespace(uc))
/*     */       { if (start != -1)
/*     */         { Intrinsics.checkNotNullExpressionValue(text.substring(start, j), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */           String span = text.substring(start, j);
/*     */           ArrayList<Tokenizer.Token> arrayList = result;
/*     */           Iterable<Tokenizer.Token> $this$map$iv = tokenizeToken(span);
/*     */           int $i$f$map = 0;
/* 368 */           Iterable<Tokenizer.Token> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 369 */           for (Tokenizer.Token item$iv$iv : iterable1) {
/* 370 */             Tokenizer.Token token1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$tokenizeSpacyNormalized$1 = 0; collection.add(new Tokenizer.Token(token1.getToken(), RangesKt.withOffset(token1.getRange(), start)));
/* 371 */           }  $this$map$iv = destination$iv$iv; CollectionsKt.addAll(arrayList, $this$map$iv); }  start = -1; } else if (start == -1) { start = j; }  b++;
/* 372 */     }  if (start != -1) { Intrinsics.checkNotNullExpressionValue(text.substring(start), "this as java.lang.String).substring(startIndex)"); String span = text.substring(start); ArrayList<Tokenizer.Token> arrayList = result; Iterable<Tokenizer.Token> $this$map$iv = tokenizeToken(span); int $i$f$map = 0; Iterable<Tokenizer.Token> iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 373 */       for (Tokenizer.Token item$iv$iv : iterable1) {
/* 374 */         Tokenizer.Token token1 = item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$tokenizeSpacyNormalized$2 = 0; collection.add(new Tokenizer.Token(token1.getToken(), RangesKt.withOffset(token1.getRange(), start)));
/* 375 */       }  $this$map$iv = destination$iv$iv; CollectionsKt.addAll(arrayList, $this$map$iv); }  return result; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class SpacyTokenizerFast$tokenize$1 extends Lambda implements Function0<String> {
/*     */     public static final SpacyTokenizerFast$tokenize$1 INSTANCE = new SpacyTokenizerFast$tokenize$1(); @NotNull public final String invoke() { return "Normalized length is not equal to original text length. This shouldn't happen as normalizers should preserve text length."; }
/*     */     SpacyTokenizerFast$tokenize$1() { super(0); } }
/* 378 */   private final List<Tokenizer.Token> finalizeSplit(TokenSplits splits, String word) { Iterator<SpacyTokenInfo> iterator; List<SpacyTokenInfo> special = this.specialCases.get(word); if (special != null) { Iterable<SpacyTokenInfo> $this$forEach$iv = special; int $i$f$forEach = 0; iterator = $this$forEach$iv.iterator(); } else { splits.getWordTokens().add(word); return splits.toList(); }  if (iterator.hasNext()) { Object element$iv = iterator.next(); SpacyTokenInfo it = (SpacyTokenInfo)element$iv; int $i$a$-forEach-SpacyTokenizerFast$finalizeSplit$1 = 0;
/*     */       splits.getWordTokens().add(it.getOrth()); }
/*     */      }
/*     */ 
/*     */   
/*     */   private final List<Tokenizer.Token> tokenizeToken(String word) {
/*     */     TokenSplits splits = new TokenSplits();
/*     */     String remainingWord = word;
/*     */     if (isSpecialOrFinal(remainingWord))
/*     */       return finalizeSplit(splits, remainingWord); 
/*     */     if (this.oneCharSuffixes.contains(Character.valueOf(StringsKt.last(remainingWord)))) {
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(0, remainingWord.length() - 1), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */       String minusSuffix = remainingWord.substring(0, remainingWord.length() - 1);
/*     */       if (isSpecialOrFinal(minusSuffix)) {
/*     */         Intrinsics.checkNotNullExpressionValue(remainingWord.substring(remainingWord.length() - 1), "this as java.lang.String).substring(startIndex)");
/*     */         splits.getSuffixes().add(remainingWord.substring(remainingWord.length() - 1));
/*     */         return finalizeSplit(splits, minusSuffix);
/*     */       } 
/*     */     } 
/*     */     while ((remainingWord.length() > 0)) {
/*     */       if (isSpecialOrFinal(remainingWord))
/*     */         return finalizeSplit(splits, remainingWord); 
/*     */       int prefixLength = findPrefix(remainingWord);
/*     */       if (prefixLength == 0)
/*     */         break; 
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(0, prefixLength), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */       splits.getPrefixes().add(remainingWord.substring(0, prefixLength));
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(prefixLength), "this as java.lang.String).substring(startIndex)");
/*     */       remainingWord = remainingWord.substring(prefixLength);
/*     */     } 
/*     */     while ((remainingWord.length() > 0)) {
/*     */       if (isSpecialOrFinal(remainingWord))
/*     */         return finalizeSplit(splits, remainingWord); 
/*     */       int suffixLength = findSuffix(remainingWord);
/*     */       if (suffixLength == 0)
/*     */         break; 
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(remainingWord.length() - suffixLength), "this as java.lang.String).substring(startIndex)");
/*     */       splits.getSuffixes().add(remainingWord.substring(remainingWord.length() - suffixLength));
/*     */       Intrinsics.checkNotNullExpressionValue(remainingWord.substring(0, remainingWord.length() - suffixLength), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */       remainingWord = remainingWord.substring(0, remainingWord.length() - suffixLength);
/*     */     } 
/*     */     if (isSpecialOrFinal(remainingWord) || this.specialCases.urlMatch(remainingWord))
/*     */       return finalizeSplit(splits, remainingWord); 
/*     */     splits.getWordTokens().addAll(splitInfixes(remainingWord));
/*     */     return splits.toList();
/*     */   }
/*     */   
/*     */   private final boolean isSpecialOrFinal(String token) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield specialCases : Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerSpecialCases;
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual get : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   8: ifnonnull -> 72
/*     */     //   11: aload_1
/*     */     //   12: checkcast java/lang/CharSequence
/*     */     //   15: astore_2
/*     */     //   16: iconst_0
/*     */     //   17: istore_3
/*     */     //   18: iconst_0
/*     */     //   19: istore #4
/*     */     //   21: iload #4
/*     */     //   23: aload_2
/*     */     //   24: invokeinterface length : ()I
/*     */     //   29: if_icmpge -> 68
/*     */     //   32: aload_2
/*     */     //   33: iload #4
/*     */     //   35: invokeinterface charAt : (I)C
/*     */     //   40: istore #5
/*     */     //   42: iload #5
/*     */     //   44: istore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: iload #6
/*     */     //   51: invokestatic isLetter : (C)Z
/*     */     //   54: nop
/*     */     //   55: ifne -> 62
/*     */     //   58: iconst_0
/*     */     //   59: goto -> 69
/*     */     //   62: iinc #4, 1
/*     */     //   65: goto -> 21
/*     */     //   68: iconst_1
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_1
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_0
/*     */     //   77: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #286	-> 0
/*     */     //   #376	-> 18
/*     */     //   #286	-> 49
/*     */     //   #286	-> 54
/*     */     //   #376	-> 55
/*     */     //   #377	-> 68
/*     */     //   #286	-> 77
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	6	7	$i$a$-all-SpacyTokenizerFast$isSpecialOrFinal$1	I
/*     */     //   46	9	6	it	C
/*     */     //   42	20	5	element$iv	C
/*     */     //   18	51	3	$i$f$all	I
/*     */     //   16	53	2	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   0	78	0	this	Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast;
/*     */     //   0	78	1	token	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private final int findPrefix(String tok) {
/*     */     MatchResult match = Regex.find$default(this.prefix, tok, 0, 2, null);
/*     */     return (match == null) ? 0 : (RangesKt.last((IntProgression)match.getRange()) + 1 - RangesKt.first((IntProgression)match.getRange()));
/*     */   }
/*     */   
/*     */   private final int findSuffix(String tok) {
/*     */     MatchResult match = Regex.find$default(this.suffix, tok, 0, 2, null);
/*     */     return (match == null) ? 0 : (RangesKt.last((IntProgression)match.getRange()) + 1 - RangesKt.first((IntProgression)match.getRange()));
/*     */   }
/*     */   
/*     */   private final List<String> splitInfixes(String remainingWord) {
/*     */     List<String> tokens = new ArrayList();
/*     */     Sequence<MatchResult> matches = findInfix(remainingWord);
/*     */     int start = 0;
/*     */     for (MatchResult match : matches) {
/*     */       int startInfix = match.getRange().getFirst();
/*     */       int endInfix = match.getRange().getLast() + 1;
/*     */       if (startInfix == 0)
/*     */         continue; 
/*     */       if (startInfix != start) {
/*     */         Intrinsics.checkNotNullExpressionValue(remainingWord.substring(start, startInfix), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */         String spanInfix = remainingWord.substring(start, startInfix);
/*     */         tokens.add(spanInfix);
/*     */       } 
/*     */       if (startInfix != endInfix) {
/*     */         Intrinsics.checkNotNullExpressionValue(remainingWord.substring(startInfix, endInfix), "this as java.lang.String…ing(startIndex, endIndex)");
/*     */         String infix = remainingWord.substring(startInfix, endInfix);
/*     */         tokens.add(infix);
/*     */       } 
/*     */       start = endInfix;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(remainingWord.substring(start), "this as java.lang.String).substring(startIndex)");
/*     */     String span = remainingWord.substring(start);
/*     */     if ((span.length() > 0))
/*     */       tokens.add(span); 
/*     */     return tokens;
/*     */   }
/*     */   
/*     */   private final Sequence<MatchResult> findInfix(String tok) {
/*     */     return Regex.findAll$default(this.infix, tok, 0, 2, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */