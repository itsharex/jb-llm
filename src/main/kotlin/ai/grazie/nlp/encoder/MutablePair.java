/*    */ package ai.grazie.nlp.encoder;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\017\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B\025\022\006\020\004\032\0028\000\022\006\020\005\032\0028\001¢\006\002\020\006J\016\020\016\032\0028\000HÆ\003¢\006\002\020\bJ\016\020\017\032\0028\001HÆ\003¢\006\002\020\bJ.\020\020\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\b\b\002\020\004\032\0028\0002\b\b\002\020\005\032\0028\001HÆ\001¢\006\002\020\021J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\003HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\030HÖ\001R\034\020\004\032\0028\000X\016¢\006\020\n\002\020\013\032\004\b\007\020\b\"\004\b\t\020\nR\034\020\005\032\0028\001X\016¢\006\020\n\002\020\013\032\004\b\f\020\b\"\004\b\r\020\n¨\006\031"}, d2 = {"Lai/grazie/nlp/encoder/MutablePair;", "First", "Second", "", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "setFirst", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getSecond", "setSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lai/grazie/nlp/encoder/MutablePair;", "equals", "", "other", "hashCode", "", "toString", "", "nlp-encoder-engine"})
/*    */ public final class MutablePair<First, Second>
/*    */ {
/*    */   private First first;
/*    */   private Second second;
/*    */   
/*    */   public MutablePair(Object first, Object second) {
/* 51 */     this.first = (First)first; this.second = (Second)second; } public final First getFirst() { return this.first; } public final void setFirst(Object <set-?>) { this.first = (First)<set-?>; } public final Second getSecond() { return this.second; } public final void setSecond(Object <set-?>) { this.second = (Second)<set-?>; }
/*    */ 
/*    */   
/*    */   public final First component1() {
/*    */     return this.first;
/*    */   }
/*    */   
/*    */   public final Second component2() {
/*    */     return this.second;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MutablePair<First, Second> copy(Object first, Object second) {
/*    */     return new MutablePair((First)first, (Second)second);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MutablePair(first=" + this.first + ", second=" + this.second + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.first == null) ? 0 : this.first.hashCode();
/*    */     return result * 31 + ((this.second == null) ? 0 : this.second.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MutablePair))
/*    */       return false; 
/*    */     MutablePair mutablePair = (MutablePair)other;
/*    */     return !Intrinsics.areEqual(this.first, mutablePair.first) ? false : (!!Intrinsics.areEqual(this.second, mutablePair.second));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/ai/grazie/nlp/encoder/MutablePair.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */