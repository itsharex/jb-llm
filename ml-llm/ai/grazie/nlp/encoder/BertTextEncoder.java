/*    */ package ai.grazie.nlp.encoder;
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import ai.grazie.nlp.tokenizer.word.BasicWordTokenizer;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\020\b\n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\020 \n\002\b\003\b\026\030\0002\0020\001B]\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\007\022\b\b\002\020\t\032\0020\004\022\b\b\002\020\n\032\0020\004\022\b\b\002\020\013\032\0020\004\022\b\b\002\020\f\032\0020\004\022\b\b\002\020\r\032\0020\004¢\006\002\020\016J\020\020\027\032\0020\0042\006\020\030\032\0020\005H\024J\020\020\031\032\0020\0052\006\020\032\032\0020\004H\024J\026\020\033\032\0020\0042\f\020\034\032\b\022\004\022\0020\0040\035H\026J\026\020\036\032\b\022\004\022\0020\0040\0352\006\020\037\032\0020\004H\024R\016\020\017\032\0020\020X\004¢\006\002\n\000R\016\020\b\032\0020\007X\004¢\006\002\n\000R\032\020\021\032\016\022\004\022\0020\005\022\004\022\0020\0040\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\022\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\024R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000R\016\020\025\032\0020\026X\004¢\006\002\n\000¨\006 "}, d2 = {"Lai/grazie/nlp/encoder/BertTextEncoder;", "Lai/grazie/nlp/encoder/PreTrainedTextEncoder;", "vocabulary", "", "", "", "toLowerCase", "", "doBasicTokenize", "unkToken", "sepToken", "padToken", "clsToken", "maskToken", "(Ljava/util/Map;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "basicWordTokenizer", "Lai/grazie/nlp/tokenizer/word/BasicWordTokenizer;", "idsToToken", "vocabSize", "getVocabSize", "()I", "wordPieceTokenizer", "Lai/grazie/nlp/encoder/WordPiece;", "convertIdToToken", "id", "convertTokenToId", "token", "decodeFromTokens", "tokens", "", "tokenizeText", "text", "nlp-encoder-engine"})
/*    */ @SourceDebugExtension({"SMAP\nBertTextEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BertTextEncoder.kt\nai/grazie/nlp/encoder/BertTextEncoder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1179#2,2:55\n1253#2,4:57\n*S KotlinDebug\n*F\n+ 1 BertTextEncoder.kt\nai/grazie/nlp/encoder/BertTextEncoder\n*L\n27#1:55,2\n27#1:57,4\n*E\n"})
/*    */ public class BertTextEncoder extends PreTrainedTextEncoder {
/*    */   public BertTextEncoder(@NotNull Map<String, Integer> vocabulary, boolean toLowerCase, boolean doBasicTokenize, @NotNull String unkToken, @NotNull String sepToken, @NotNull String padToken, @NotNull String clsToken, @NotNull String maskToken) {
/* 21 */     super(
/* 22 */         null, null, 
/*    */         
/* 24 */         unkToken, sepToken, padToken, clsToken, maskToken); this.vocabulary = vocabulary;
/*    */     this.toLowerCase = toLowerCase;
/*    */     this.doBasicTokenize = doBasicTokenize;
/* 27 */     Set<Map.Entry<String, Integer>> set1 = this.vocabulary.entrySet(); BertTextEncoder bertTextEncoder = this; int $i$f$associate = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set1, 10)), 16);
/* 56 */     Set<Map.Entry<String, Integer>> set2 = set1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 57 */     for (Object<String, Integer> element$iv$iv : set2) {
/* 58 */       Map<Object, Object> map = destination$iv$iv; Map.Entry it = (Map.Entry)element$iv$iv; int $i$a$-associate-BertTextEncoder$idsToToken$1 = 0; Pair pair = TuplesKt.to(it.getValue(), it.getKey()); map.put(pair.getFirst(), pair.getSecond());
/*    */     } 
/* 60 */     bertTextEncoder.idsToToken = (Map)destination$iv$iv;
/*    */     this.wordPieceTokenizer = new WordPiece(this.vocabulary, unkToken, 0, 4, null);
/*    */     this.basicWordTokenizer = new BasicWordTokenizer(this.toLowerCase, false);
/*    */     this.vocabSize = this.vocabulary.size();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Map<String, Integer> vocabulary;
/*    */   private final boolean toLowerCase;
/*    */   private final boolean doBasicTokenize;
/*    */   @NotNull
/*    */   private final Map<Integer, String> idsToToken;
/*    */   @NotNull
/*    */   private final WordPiece wordPieceTokenizer;
/*    */   @NotNull
/*    */   private final BasicWordTokenizer basicWordTokenizer;
/*    */   private final int vocabSize;
/*    */   
/*    */   public int getVocabSize() {
/*    */     return this.vocabSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected String convertIdToToken(int id) {
/*    */     return this.idsToToken.getOrDefault(Integer.valueOf(id), getUnkToken());
/*    */   }
/*    */   
/*    */   protected int convertTokenToId(@NotNull String token) {
/*    */     Intrinsics.checkNotNullParameter(token, "token");
/*    */     return ((Number)this.vocabulary.getOrDefault(token, MapsKt.getValue(this.vocabulary, getUnkToken()))).intValue();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected List<String> tokenizeText(@NotNull String text) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     ArrayList<String> splitTokens = new ArrayList();
/*    */     if (this.doBasicTokenize) {
/*    */       for (Tokenizer.Token token : this.basicWordTokenizer.tokenize(text))
/*    */         CollectionsKt.addAll(splitTokens, this.wordPieceTokenizer.tokenize(token.getToken())); 
/*    */     } else {
/*    */       CollectionsKt.addAll(splitTokens, this.wordPieceTokenizer.tokenize(text));
/*    */     } 
/*    */     return splitTokens;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String decodeFromTokens(@NotNull List tokens) {
/*    */     Intrinsics.checkNotNullParameter(tokens, "tokens");
/*    */     return CollectionsKt.joinToString$default(tokens, " ", null, null, 0, null, BertTextEncoder$decodeFromTokens$1.INSTANCE, 30, null);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */   static final class BertTextEncoder$decodeFromTokens$1 extends Lambda implements Function1<String, CharSequence> {
/*    */     public static final BertTextEncoder$decodeFromTokens$1 INSTANCE = new BertTextEncoder$decodeFromTokens$1();
/*    */     
/*    */     BertTextEncoder$decodeFromTokens$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(@NotNull String it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       return StringsKt.replace$default(it, " ##", "", false, 4, null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/BertTextEncoder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */