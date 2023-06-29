/*     */ package com.intellij.ml.llm.core;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\007\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\006\032\0020\003HÆ\003J\023\020\007\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\b\032\0020\0032\b\020\t\032\004\030\0010\001HÖ\003J\t\020\n\032\0020\013HÖ\001J\t\020\f\032\0020\rHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\005¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State;", "", "isInside", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*     */ public final class State
/*     */ {
/*     */   private final boolean isInside;
/*     */   
/*     */   public State(boolean isInside) {
/* 219 */     this.isInside = isInside; } public final boolean isInside() { return this.isInside; }
/*     */ 
/*     */   
/*     */   public final boolean component1() {
/*     */     return this.isInside;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final State copy(boolean isInside) {
/*     */     return new State(isInside);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "State(isInside=" + this.isInside + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     if (this.isInside);
/*     */     return 1;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof State))
/*     */       return false; 
/*     */     State state = (State)other;
/*     */     return !(this.isInside != state.isInside);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/FeedbackButtonInlayPresentation$State.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */