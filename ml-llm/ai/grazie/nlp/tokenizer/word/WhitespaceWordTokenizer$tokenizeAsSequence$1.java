/*    */ package ai.grazie.nlp.tokenizer.word;
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import ai.grazie.text.TextRange;
/*    */ import kotlin.Pair;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\000\020\000\032\0020\0012\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "it", "Lkotlin/Pair;", "Lai/grazie/text/TextRange;", "", "invoke"})
/*    */ final class WhitespaceWordTokenizer$tokenizeAsSequence$1 extends Lambda implements Function1<Pair<? extends TextRange, ? extends String>, Tokenizer.Token> {
/*    */   @NotNull
/*    */   public final Tokenizer.Token invoke(@NotNull Pair it) {
/* 12 */     Intrinsics.checkNotNullParameter(it, "it"); return new Tokenizer.Token(new Text((String)it.getSecond()), (TextRange)it.getFirst());
/*    */   }
/*    */   
/*    */   public static final WhitespaceWordTokenizer$tokenizeAsSequence$1 INSTANCE = new WhitespaceWordTokenizer$tokenizeAsSequence$1();
/*    */   
/*    */   WhitespaceWordTokenizer$tokenizeAsSequence$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/tokenizer/word/WhitespaceWordTokenizer$tokenizeAsSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */