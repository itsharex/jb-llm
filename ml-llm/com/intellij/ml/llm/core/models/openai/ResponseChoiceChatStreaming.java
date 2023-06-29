/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J'\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\005HÖ\001R\026\020\006\032\0020\0078\006X\004¢\006\b\n\000\032\004\b\t\020\nR\026\020\004\032\0020\0058\026X\004¢\006\b\n\000\032\004\b\013\020\fR\026\020\002\032\0020\0038\026X\004¢\006\b\n\000\032\004\b\r\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChoiceChatStreaming;", "Lcom/intellij/ml/llm/core/models/openai/ResponseChoice;", "index", "", "finishReason", "", "delta", "Lcom/intellij/ml/llm/core/models/openai/ResponseChatDelta;", "(JLjava/lang/String;Lcom/intellij/ml/llm/core/models/openai/ResponseChatDelta;)V", "getDelta", "()Lcom/intellij/ml/llm/core/models/openai/ResponseChatDelta;", "getFinishReason", "()Ljava/lang/String;", "getIndex", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"})
/*     */ public final class ResponseChoiceChatStreaming
/*     */   implements ResponseChoice
/*     */ {
/*     */   @SerializedName("index")
/*     */   private final long index;
/*     */   @SerializedName("finish_reason")
/*     */   @NotNull
/*     */   private final String finishReason;
/*     */   @SerializedName("delta")
/*     */   @NotNull
/*     */   private final ResponseChatDelta delta;
/*     */   
/*     */   public ResponseChoiceChatStreaming(long index, @NotNull String finishReason, @NotNull ResponseChatDelta delta) {
/* 100 */     this.index = index;
/*     */ 
/*     */     
/* 103 */     this.finishReason = finishReason;
/*     */ 
/*     */     
/* 106 */     this.delta = delta; } @NotNull
/* 107 */   public final ResponseChatDelta getDelta() { return this.delta; }
/*     */ 
/*     */   
/*     */   public long getIndex() {
/*     */     return this.index;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getFinishReason() {
/*     */     return this.finishReason;
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.index;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.finishReason;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResponseChatDelta component3() {
/*     */     return this.delta;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResponseChoiceChatStreaming copy(long index, @NotNull String finishReason, @NotNull ResponseChatDelta delta) {
/*     */     Intrinsics.checkNotNullParameter(finishReason, "finishReason");
/*     */     Intrinsics.checkNotNullParameter(delta, "delta");
/*     */     return new ResponseChoiceChatStreaming(index, finishReason, delta);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ResponseChoiceChatStreaming(index=" + this.index + ", finishReason=" + this.finishReason + ", delta=" + this.delta + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Long.hashCode(this.index);
/*     */     result = result * 31 + this.finishReason.hashCode();
/*     */     return result * 31 + this.delta.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ResponseChoiceChatStreaming))
/*     */       return false; 
/*     */     ResponseChoiceChatStreaming responseChoiceChatStreaming = (ResponseChoiceChatStreaming)other;
/*     */     return (this.index != responseChoiceChatStreaming.index) ? false : (!Intrinsics.areEqual(this.finishReason, responseChoiceChatStreaming.finishReason) ? false : (!!Intrinsics.areEqual(this.delta, responseChoiceChatStreaming.delta)));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChoiceChatStreaming.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */