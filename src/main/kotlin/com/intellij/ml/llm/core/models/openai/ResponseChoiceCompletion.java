/*    */ package com.intellij.ml.llm.core.models.openai;
/*    */ 
/*    */ import com.google.gson.annotations.SerializedName;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b¢\006\002\020\tJ\t\020\021\032\0020\003HÆ\003J\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\005HÆ\003J\t\020\024\032\0020\bHÆ\003J1\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\bHÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\005HÖ\001R\026\020\004\032\0020\0058\026X\004¢\006\b\n\000\032\004\b\n\020\013R\026\020\002\032\0020\0038\026X\004¢\006\b\n\000\032\004\b\f\020\rR\026\020\007\032\0020\b8\006X\004¢\006\b\n\000\032\004\b\016\020\017R\026\020\006\032\0020\0058\006X\004¢\006\b\n\000\032\004\b\020\020\013¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChoiceCompletion;", "Lcom/intellij/ml/llm/core/models/openai/ResponseChoice;", "index", "", "finishReason", "", "text", "logprobs", "Lcom/intellij/ml/llm/core/models/openai/ResponseLogprobs;", "(JLjava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/models/openai/ResponseLogprobs;)V", "getFinishReason", "()Ljava/lang/String;", "getIndex", "()J", "getLogprobs", "()Lcom/intellij/ml/llm/core/models/openai/ResponseLogprobs;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class ResponseChoiceCompletion
/*    */   implements ResponseChoice
/*    */ {
/*    */   @SerializedName("index")
/*    */   private final long index;
/*    */   @SerializedName("finish_reason")
/*    */   @NotNull
/*    */   private final String finishReason;
/*    */   @SerializedName("text")
/*    */   @NotNull
/*    */   private final String text;
/*    */   @SerializedName("logprobs")
/*    */   @NotNull
/*    */   private final ResponseLogprobs logprobs;
/*    */   
/*    */   public ResponseChoiceCompletion(long index, @NotNull String finishReason, @NotNull String text, @NotNull ResponseLogprobs logprobs) {
/* 67 */     this.index = index;
/*    */ 
/*    */     
/* 70 */     this.finishReason = finishReason;
/*    */ 
/*    */     
/* 73 */     this.text = text;
/*    */ 
/*    */     
/* 76 */     this.logprobs = logprobs; } @NotNull
/* 77 */   public final ResponseLogprobs getLogprobs() { return this.logprobs; }
/*    */ 
/*    */   
/*    */   public long getIndex() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getFinishReason() {
/*    */     return this.finishReason;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   public final long component1() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.finishReason;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ResponseLogprobs component4() {
/*    */     return this.logprobs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ResponseChoiceCompletion copy(long index, @NotNull String finishReason, @NotNull String text, @NotNull ResponseLogprobs logprobs) {
/*    */     Intrinsics.checkNotNullParameter(finishReason, "finishReason");
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(logprobs, "logprobs");
/*    */     return new ResponseChoiceCompletion(index, finishReason, text, logprobs);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ResponseChoiceCompletion(index=" + this.index + ", finishReason=" + this.finishReason + ", text=" + this.text + ", logprobs=" + this.logprobs + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Long.hashCode(this.index);
/*    */     result = result * 31 + this.finishReason.hashCode();
/*    */     result = result * 31 + this.text.hashCode();
/*    */     return result * 31 + this.logprobs.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ResponseChoiceCompletion))
/*    */       return false; 
/*    */     ResponseChoiceCompletion responseChoiceCompletion = (ResponseChoiceCompletion)other;
/*    */     return (this.index != responseChoiceCompletion.index) ? false : (!Intrinsics.areEqual(this.finishReason, responseChoiceCompletion.finishReason) ? false : (!Intrinsics.areEqual(this.text, responseChoiceCompletion.text) ? false : (!!Intrinsics.areEqual(this.logprobs, responseChoiceCompletion.logprobs))));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChoiceCompletion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */