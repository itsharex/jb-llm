/*    */ package ai.grazie.utils.mpp.money;
/*    */ 
/*    */ import ai.grazie.utils.mpp.number.FixedPrecisionFloat;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\005\n\002\020\016\n\002\b\004\b\b\030\000 \0332\0020\001:\001\033B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\021\020\013\032\0020\f2\006\020\r\032\0020\000H\002J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\r\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\fHÖ\001J\021\020\024\032\0020\0002\006\020\r\032\0020\000H\002J\021\020\025\032\0020\0002\006\020\r\032\0020\000H\002J\021\020\026\032\0020\0002\006\020\r\032\0020\fH\002J\b\020\027\032\0020\030H\026J\006\020\031\032\0020\030J\006\020\032\032\0020\030R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\034"}, d2 = {"Lai/grazie/utils/mpp/money/Money;", "", "amount", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "currency", "Lai/grazie/utils/mpp/money/Currency;", "(Lai/grazie/utils/mpp/number/FixedPrecisionFloat;Lai/grazie/utils/mpp/money/Currency;)V", "getAmount", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "getCurrency", "()Lai/grazie/utils/mpp/money/Currency;", "compareTo", "", "other", "component1", "component2", "copy", "equals", "", "hashCode", "minus", "plus", "times", "toString", "", "toStringFraction", "toStringInteger", "Companion", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nMoney.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Money.kt\nai/grazie/utils/mpp/money/Money\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/*    */ public final class Money {
/*    */   public Money(@NotNull FixedPrecisionFloat amount, @NotNull Currency currency) {
/* 15 */     this.amount = amount; this.currency = currency; } @NotNull public final FixedPrecisionFloat getAmount() { return this.amount; } @NotNull public final Currency getCurrency() { return this.currency; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\b\032\0020\tR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/money/Money$Companion;", "", "()V", "ZERO_DOLLARS", "Lai/grazie/utils/mpp/money/Money;", "getZERO_DOLLARS", "()Lai/grazie/utils/mpp/money/Money;", "dollar", "amount", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "utils-common"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 17 */     public final Money dollar(@NotNull FixedPrecisionFloat amount) { Intrinsics.checkNotNullParameter(amount, "amount"); return new Money(amount, Currency.USD); }
/*    */     @NotNull
/* 19 */     public final Money getZERO_DOLLARS() { return Money.ZERO_DOLLARS; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final FixedPrecisionFloat amount; @NotNull private final Currency currency; @NotNull private static final Money ZERO_DOLLARS = Companion.dollar(FixedPrecisionFloat.Companion.getZERO());
/*    */   
/*    */   @NotNull
/*    */   public final Money plus(@NotNull Money other) {
/* 23 */     Intrinsics.checkNotNullParameter(other, "other"); if (!((this.currency == other.currency) ? 1 : 0))
/*    */     
/*    */     { 
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
/* 54 */       int $i$a$-require-Money$plus$1 = 0; String str = "Currencies must be the same"; throw new IllegalArgumentException(str.toString()); }  return new Money(this.amount.plus(other.amount), this.currency); } @NotNull public final Money minus(@NotNull Money other) { Intrinsics.checkNotNullParameter(other, "other"); if (!((this.currency == other.currency) ? 1 : 0)) { int $i$a$-require-Money$minus$1 = 0; String str = "Currencies must be the same"; throw new IllegalArgumentException(str.toString()); }  return new Money(this.amount.minus(other.amount), this.currency); } public final int compareTo(@NotNull Money other) { Intrinsics.checkNotNullParameter(other, "other"); if (!((this.currency == other.currency) ? 1 : 0)) { int $i$a$-require-Money$compareTo$1 = 0;
/*    */       String str = "Currencies must be the same";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */     
/*    */     return this.amount.compareTo(other.amount); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Money times(int other) {
/*    */     return new Money(this.amount.times(other), this.currency);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return this.currency.getSymbol() + " " + this.currency.getSymbol();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String toStringInteger() {
/*    */     return this.amount.toStringInteger();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String toStringFraction() {
/*    */     return this.amount.toStringFraction();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FixedPrecisionFloat component1() {
/*    */     return this.amount;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Currency component2() {
/*    */     return this.currency;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Money copy(@NotNull FixedPrecisionFloat amount, @NotNull Currency currency) {
/*    */     Intrinsics.checkNotNullParameter(amount, "amount");
/*    */     Intrinsics.checkNotNullParameter(currency, "currency");
/*    */     return new Money(amount, currency);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.amount.hashCode();
/*    */     return result * 31 + this.currency.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Money))
/*    */       return false; 
/*    */     Money money = (Money)other;
/*    */     return !Intrinsics.areEqual(this.amount, money.amount) ? false : (!(this.currency != money.currency));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/mpp/money/Money.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */