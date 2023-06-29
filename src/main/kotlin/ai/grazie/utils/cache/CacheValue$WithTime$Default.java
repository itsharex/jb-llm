/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\027\022\006\020\003\032\0028\002\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\016\020\f\032\0028\002HÆ\003¢\006\002\020\nJ\t\020\r\032\0020\005HÆ\003J(\020\016\032\b\022\004\022\0028\0020\0002\b\b\002\020\003\032\0028\0022\b\b\002\020\004\032\0020\005HÆ\001¢\006\002\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\027HÖ\001R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\026\020\003\032\0028\002X\004¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\030"}, d2 = {"Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "Value", "Lai/grazie/utils/cache/CacheValue$WithTime;", "value", "epoch", "", "(Ljava/lang/Object;J)V", "getEpoch", "()J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "equals", "", "other", "", "hashCode", "", "toString", "", "utils-common"})
/*    */ public final class Default<Value> implements CacheValue.WithTime<Value> {
/*    */   private final Value value;
/*    */   
/* 11 */   public Default(Object value, long epoch) { this.value = (Value)value; this.epoch = epoch; } private final long epoch; public Value getValue() { return this.value; } public long getEpoch() { return this.epoch; }
/*    */ 
/*    */   
/*    */   public final Value component1() {
/*    */     return getValue();
/*    */   }
/*    */   
/*    */   public final long component2() {
/*    */     return getEpoch();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Default<Value> copy(Object value, long epoch) {
/*    */     return new Default((Value)value, epoch);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Default(value=" + getValue() + ", epoch=" + getEpoch() + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (getValue() == null) ? 0 : getValue().hashCode();
/*    */     return result * 31 + Long.hashCode(getEpoch());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Default))
/*    */       return false; 
/*    */     Default default_ = (Default)other;
/*    */     return !Intrinsics.areEqual(getValue(), default_.getValue()) ? false : (!(getEpoch() != default_.getEpoch()));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/utils/cache/CacheValue$WithTime$Default.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */