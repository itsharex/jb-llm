/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J'\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\026\020\004\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\007\020\bR\026\020\002\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\t\020\bR\026\020\005\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\n\020\b¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseUsage;", "", "promptTokens", "", "completionTokens", "totalTokens", "(JJJ)V", "getCompletionTokens", "()J", "getPromptTokens", "getTotalTokens", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*     */ public final class ResponseUsage
/*     */ {
/*     */   @SerializedName("prompt_tokens")
/*     */   private final long promptTokens;
/*     */   @SerializedName("completion_tokens")
/*     */   private final long completionTokens;
/*     */   @SerializedName("total_tokens")
/*     */   private final long totalTokens;
/*     */   
/*     */   public ResponseUsage(long promptTokens, long completionTokens, long totalTokens) {
/* 127 */     this.promptTokens = promptTokens;
/*     */ 
/*     */     
/* 130 */     this.completionTokens = completionTokens;
/*     */ 
/*     */     
/* 133 */     this.totalTokens = totalTokens; } public final long getTotalTokens() {
/* 134 */     return this.totalTokens;
/*     */   }
/*     */   
/*     */   public final long getPromptTokens() {
/*     */     return this.promptTokens;
/*     */   }
/*     */   
/*     */   public final long getCompletionTokens() {
/*     */     return this.completionTokens;
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.promptTokens;
/*     */   }
/*     */   
/*     */   public final long component2() {
/*     */     return this.completionTokens;
/*     */   }
/*     */   
/*     */   public final long component3() {
/*     */     return this.totalTokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResponseUsage copy(long promptTokens, long completionTokens, long totalTokens) {
/*     */     return new ResponseUsage(promptTokens, completionTokens, totalTokens);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ResponseUsage(promptTokens=" + this.promptTokens + ", completionTokens=" + this.completionTokens + ", totalTokens=" + this.totalTokens + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Long.hashCode(this.promptTokens);
/*     */     result = result * 31 + Long.hashCode(this.completionTokens);
/*     */     return result * 31 + Long.hashCode(this.totalTokens);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ResponseUsage))
/*     */       return false; 
/*     */     ResponseUsage responseUsage = (ResponseUsage)other;
/*     */     return (this.promptTokens != responseUsage.promptTokens) ? false : ((this.completionTokens != responseUsage.completionTokens) ? false : (!(this.totalTokens != responseUsage.totalTokens)));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseUsage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */