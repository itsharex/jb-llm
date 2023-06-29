/*    */ package com.intellij.ml.llm.evaluation;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\n\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\005HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\r\032\0020\0052\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\003HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\t¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/evaluation/CompletedLLMRequest;", "", "suggestion", "", "isValid", "", "(Ljava/lang/String;Z)V", "()Z", "getSuggestion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class CompletedLLMRequest
/*    */ {
/*    */   @NotNull
/*    */   private final String suggestion;
/*    */   private final boolean isValid;
/*    */   
/*    */   public CompletedLLMRequest(@NotNull String suggestion, boolean isValid) {
/* 48 */     this.suggestion = suggestion; this.isValid = isValid; } @NotNull public final String getSuggestion() { return this.suggestion; } public final boolean isValid() { return this.isValid; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.suggestion;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.isValid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CompletedLLMRequest copy(@NotNull String suggestion, boolean isValid) {
/*    */     Intrinsics.checkNotNullParameter(suggestion, "suggestion");
/*    */     return new CompletedLLMRequest(suggestion, isValid);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CompletedLLMRequest(suggestion=" + this.suggestion + ", isValid=" + this.isValid + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.suggestion.hashCode();
/*    */     if (this.isValid);
/*    */     return result * 31 + 1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CompletedLLMRequest))
/*    */       return false; 
/*    */     CompletedLLMRequest completedLLMRequest = (CompletedLLMRequest)other;
/*    */     return !Intrinsics.areEqual(this.suggestion, completedLLMRequest.suggestion) ? false : (!(this.isValid != completedLLMRequest.isValid));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/evaluation/CompletedLLMRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */