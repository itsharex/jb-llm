/*    */ package ai.grazie.nlp.langs.alphabet;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\f\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(C)Ljava/lang/Boolean;"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Character, Boolean>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Boolean invoke(char it) {
/* 21 */     return Boolean.valueOf(('Ͱ' <= it) ? ((it < 'Ѐ')) : false);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/langs/alphabet/Alphabet$Group$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */