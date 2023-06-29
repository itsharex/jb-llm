/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\000\n\002\020\006\n\002\b\b\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B!\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0060\003¢\006\002\020\007J\017\020\013\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\f\032\b\022\004\022\0020\0060\003HÆ\003J)\020\r\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0060\003HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\004HÖ\001R\034\020\005\032\b\022\004\022\0020\0060\0038\006X\004¢\006\b\n\000\032\004\b\b\020\tR\034\020\002\032\b\022\004\022\0020\0040\0038\006X\004¢\006\b\n\000\032\004\b\n\020\t¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseLogprobs;", "", "tokens", "", "", "tokenLogprobs", "", "(Ljava/util/List;Ljava/util/List;)V", "getTokenLogprobs", "()Ljava/util/List;", "getTokens", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*     */ public final class ResponseLogprobs
/*     */ {
/*     */   @SerializedName("tokens")
/*     */   @NotNull
/*     */   private final List<String> tokens;
/*     */   @SerializedName("token_logprobs")
/*     */   @NotNull
/*     */   private final List<Double> tokenLogprobs;
/*     */   
/*     */   public ResponseLogprobs(@NotNull List<String> tokens, @NotNull List<Double> tokenLogprobs) {
/* 119 */     this.tokens = tokens;
/*     */ 
/*     */     
/* 122 */     this.tokenLogprobs = tokenLogprobs; } @NotNull
/* 123 */   public final List<Double> getTokenLogprobs() { return this.tokenLogprobs; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<String> getTokens() {
/*     */     return this.tokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> component1() {
/*     */     return this.tokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Double> component2() {
/*     */     return this.tokenLogprobs;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResponseLogprobs copy(@NotNull List<String> tokens, @NotNull List<Double> tokenLogprobs) {
/*     */     Intrinsics.checkNotNullParameter(tokens, "tokens");
/*     */     Intrinsics.checkNotNullParameter(tokenLogprobs, "tokenLogprobs");
/*     */     return new ResponseLogprobs(tokens, tokenLogprobs);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ResponseLogprobs(tokens=" + this.tokens + ", tokenLogprobs=" + this.tokenLogprobs + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.tokens.hashCode();
/*     */     return result * 31 + this.tokenLogprobs.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ResponseLogprobs))
/*     */       return false; 
/*     */     ResponseLogprobs responseLogprobs = (ResponseLogprobs)other;
/*     */     return !Intrinsics.areEqual(this.tokens, responseLogprobs.tokens) ? false : (!!Intrinsics.areEqual(this.tokenLogprobs, responseLogprobs.tokenLogprobs));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseLogprobs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */