/*    */ package ai.grazie.text;
/*    */ import ai.grazie.utils.Hash;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/utils/Hash;", "invoke"})
/*    */ final class Text$hash$1 extends Lambda implements Function0<Hash> {
/*    */   @NotNull
/*    */   public final Hash invoke() {
/* 11 */     return HashKt.hash(Text.this.getValue());
/*    */   }
/*    */   
/*    */   Text$hash$1() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/text/Text$hash$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */