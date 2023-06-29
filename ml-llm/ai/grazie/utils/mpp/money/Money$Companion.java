/*    */ package ai.grazie.utils.mpp.money;
/*    */ 
/*    */ import ai.grazie.utils.mpp.number.FixedPrecisionFloat;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\b\032\0020\tR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/money/Money$Companion;", "", "()V", "ZERO_DOLLARS", "Lai/grazie/utils/mpp/money/Money;", "getZERO_DOLLARS", "()Lai/grazie/utils/mpp/money/Money;", "dollar", "amount", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Money dollar(@NotNull FixedPrecisionFloat amount) {
/* 17 */     Intrinsics.checkNotNullParameter(amount, "amount"); return new Money(amount, Currency.USD); } @NotNull
/*    */   public final Money getZERO_DOLLARS() {
/* 19 */     return Money.access$getZERO_DOLLARS$cp();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/money/Money$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */