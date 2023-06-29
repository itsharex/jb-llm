/*     */ package ai.grazie.nlp.tokenizer.spacy;
/*     */ 
/*     */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.IntRange;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\007\n\002\020 \n\002\030\002\n\000\b\002\030\0002\0020\001B\005¢\006\002\020\002J\f\020\r\032\b\022\004\022\0020\0170\016R!\020\003\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\007\020\bR!\020\t\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\n\020\bR!\020\013\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006¢\006\b\n\000\032\004\b\f\020\b¨\006\020"}, d2 = {"Lai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits;", "", "()V", "prefixes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getPrefixes", "()Ljava/util/ArrayList;", "suffixes", "getSuffixes", "wordTokens", "getWordTokens", "toList", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "nlp-tokenizer"})
/*     */ @SourceDebugExtension({"SMAP\nSpacyTokenizerFast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1549#2:355\n1620#2,3:356\n*S KotlinDebug\n*F\n+ 1 SpacyTokenizerFast.kt\nai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits\n*L\n148#1:355\n148#1:356,3\n*E\n"})
/*     */ final class TokenSplits
/*     */ {
/*     */   @NotNull
/* 142 */   private final ArrayList<String> prefixes = new ArrayList<>(); @NotNull public final ArrayList<String> getPrefixes() { return this.prefixes; } @NotNull
/* 143 */   private final ArrayList<String> suffixes = new ArrayList<>(); @NotNull public final ArrayList<String> getSuffixes() { return this.suffixes; } @NotNull
/* 144 */   private final ArrayList<String> wordTokens = new ArrayList<>(); @NotNull public final ArrayList<String> getWordTokens() { return this.wordTokens; }
/*     */    @NotNull
/*     */   public final List<Tokenizer.Token> toList() {
/* 147 */     int cur = 0;
/* 148 */     Iterable $this$map$iv = CollectionsKt.plus(CollectionsKt.plus(this.prefixes, this.wordTokens), CollectionsKt.reversed(this.suffixes)); int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 355 */     Iterable iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 356 */     for (Object item$iv$iv : iterable1) {
/* 357 */       String str = (String)item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-SpacyTokenizerFast$TokenSplits$toList$1 = 0; int start = cur; cur += str.length(); collection.add(new Tokenizer.Token(str, new IntRange(start, cur - 1)));
/* 358 */     }  return (List<Tokenizer.Token>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/spacy/SpacyTokenizerFast$TokenSplits.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */