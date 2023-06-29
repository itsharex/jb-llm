/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Map;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\020\b\n\002\b\004\n\002\020 \n\002\b\002\030\0002\0020\001B+\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\004\022\b\b\002\020\007\032\0020\005¢\006\002\020\bJ\024\020\t\032\b\022\004\022\0020\0040\n2\006\020\013\032\0020\004R\016\020\007\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\004X\004¢\006\002\n\000R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/nlp/encoder/WordPiece;", "", "vocabulary", "", "", "", "unknownToken", "maxInputCharsPerWord", "(Ljava/util/Map;Ljava/lang/String;I)V", "tokenize", "", "text", "nlp-encoder-engine"})
/*    */ public final class WordPiece {
/*    */   @NotNull
/*    */   private final Map<String, Integer> vocabulary;
/*    */   
/* 13 */   public WordPiece(@NotNull Map<String, Integer> vocabulary, @NotNull String unknownToken, int maxInputCharsPerWord) { this.vocabulary = vocabulary; this.unknownToken = unknownToken; this.maxInputCharsPerWord = maxInputCharsPerWord; } @NotNull
/*    */   private final String unknownToken; private final int maxInputCharsPerWord; @NotNull
/*    */   public final List<String> tokenize(@NotNull String text) {
/* 16 */     Intrinsics.checkNotNullParameter(text, "text"); ArrayList<String> out = new ArrayList();
/*    */     
/* 18 */     for (String token : UtilsKt.tokenizeByWhitespace(text)) {
/* 19 */       if (token.length() > this.maxInputCharsPerWord) {
/* 20 */         out.add(this.unknownToken);
/*    */         
/*    */         continue;
/*    */       } 
/* 24 */       boolean isUnknown = false;
/* 25 */       int start = 0;
/* 26 */       ArrayList<String> subTokens = new ArrayList(); while (true) {
/* 27 */         int end; String curSubstr; if (start < token.length())
/* 28 */         { end = token.length();
/* 29 */           curSubstr = null; } else { break; }
/* 30 */          if (start < end);
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
/* 41 */         if (curSubstr == null) {
/* 42 */           isUnknown = true;
/*    */           break;
/*    */         } 
/* 45 */         subTokens.add(curSubstr);
/* 46 */         start = end;
/*    */       } 
/* 48 */       if (isUnknown) {
/* 49 */         out.add(this.unknownToken); continue;
/*    */       } 
/* 51 */       out.addAll(subTokens);
/*    */     } 
/*    */     
/* 54 */     return out;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/WordPiece.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */