/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*    */ final class BertTextEncoder$decodeFromTokens$1
/*    */   extends Lambda
/*    */   implements Function1<String, CharSequence>
/*    */ {
/*    */   public static final BertTextEncoder$decodeFromTokens$1 INSTANCE = new BertTextEncoder$decodeFromTokens$1();
/*    */   
/*    */   BertTextEncoder$decodeFromTokens$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CharSequence invoke(@NotNull String it) {
/* 51 */     Intrinsics.checkNotNullParameter(it, "it"); return StringsKt.replace$default(it, " ##", "", false, 4, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/BertTextEncoder$decodeFromTokens$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */