/*    */ package ai.grazie.nlp.utils;
/*    */ import kotlin.text.CharCategory;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\"\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\f\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nJ\016\020\013\032\0020\b2\006\020\t\032\0020\nR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/nlp/utils/CharUtils;", "", "()V", "controlChars", "", "Lkotlin/text/CharCategory;", "punctuationChars", "isControl", "", "char", "", "isPunctuation", "nlp-common"})
/*    */ public final class CharUtils {
/*    */   @NotNull
/*  8 */   public static final CharUtils INSTANCE = new CharUtils(); @NotNull
/*  9 */   private static final Set<CharCategory> controlChars; static { CharCategory[] arrayOfCharCategory = new CharCategory[5]; arrayOfCharCategory[0] = CharCategory.UNASSIGNED; arrayOfCharCategory[1] = CharCategory.CONTROL; arrayOfCharCategory[2] = 
/* 10 */       CharCategory.FORMAT; arrayOfCharCategory[3] = CharCategory.PRIVATE_USE; arrayOfCharCategory[4] = CharCategory.SURROGATE;
/*    */     
/*    */     controlChars = SetsKt.setOf((Object[])arrayOfCharCategory);
/*    */     
/* 14 */     arrayOfCharCategory = new CharCategory[5]; arrayOfCharCategory[0] = CharCategory.DASH_PUNCTUATION; arrayOfCharCategory[1] = CharCategory.CONNECTOR_PUNCTUATION; arrayOfCharCategory[2] = 
/* 15 */       CharCategory.END_PUNCTUATION; arrayOfCharCategory[3] = CharCategory.START_PUNCTUATION; arrayOfCharCategory[4] = CharCategory.OTHER_PUNCTUATION;
/*    */     punctuationChars = SetsKt.setOf((Object[])arrayOfCharCategory); }
/*    */    @NotNull
/*    */   private static final Set<CharCategory> punctuationChars; public final boolean isPunctuation(char char) {
/* 19 */     if (punctuationChars.contains(CharsKt.getCategory(char))) {
/* 20 */       return true;
/*    */     }
/*    */     
/* 23 */     char c = char; if (!(('!' <= c) ? ((c < '0') ? 1 : 0) : 0)) { c = char; if (!((':' <= c) ? ((c < 'A') ? 1 : 0) : 0)) { c = char; if (!(('[' <= c) ? ((c < 'a') ? 1 : 0) : 0)) { c = char; if (!(('{' <= c) ? ((c < '') ? 1 : 0) : 0))
/*    */           {
/*    */             
/* 26 */             return false; }  }
/*    */          }
/*    */        }
/*    */     
/* 30 */     return true; } public final boolean isControl(char char) { if (char == '\t' || char == '\n' || char == '\r') {
/* 31 */       return false;
/*    */     }
/* 33 */     if (controlChars.contains(CharsKt.getCategory(char))) {
/* 34 */       return true;
/*    */     }
/* 36 */     return false; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/utils/CharUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */