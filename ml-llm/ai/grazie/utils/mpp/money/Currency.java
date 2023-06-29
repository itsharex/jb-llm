/*    */ package ai.grazie.utils.mpp.money;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\007\b\001\030\0002\b\022\004\022\0020\0000\001B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\007j\002\b\t¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/money/Currency;", "", "display", "", "symbol", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getSymbol", "USD", "utils-common"})
/*    */ public enum Currency
/*    */ {
/* 10 */   USD("United States dollar", "$");
/*    */   @NotNull
/*    */   private final String display;
/*    */   @NotNull
/*    */   private final String symbol;
/*    */   
/*    */   Currency(String display, String symbol) {
/*    */     this.display = display;
/*    */     this.symbol = symbol;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getSymbol() {
/*    */     return this.symbol;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/money/Currency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */