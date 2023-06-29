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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J'\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\005HÖ\001R\026\020\004\032\0020\0058\026X\004¢\006\b\n\000\032\004\b\t\020\nR\026\020\002\032\0020\0038\026X\004¢\006\b\n\000\032\004\b\013\020\fR\026\020\006\032\0020\0078\006X\004¢\006\b\n\000\032\004\b\r\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChoiceChat;", "Lcom/intellij/ml/llm/core/models/openai/ResponseChoice;", "index", "", "finishReason", "", "message", "Lcom/intellij/ml/llm/core/models/openai/ResponseChatMessage;", "(JLjava/lang/String;Lcom/intellij/ml/llm/core/models/openai/ResponseChatMessage;)V", "getFinishReason", "()Ljava/lang/String;", "getIndex", "()J", "getMessage", "()Lcom/intellij/ml/llm/core/models/openai/ResponseChatMessage;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class ResponseChoiceChat
/*    */   implements ResponseChoice
/*    */ {
/*    */   @SerializedName("index")
/*    */   private final long index;
/*    */   @SerializedName("finish_reason")
/*    */   @NotNull
/*    */   private final String finishReason;
/*    */   @SerializedName("message")
/*    */   @NotNull
/*    */   private final ResponseChatMessage message;
/*    */   
/*    */   public ResponseChoiceChat(long index, @NotNull String finishReason, @NotNull ResponseChatMessage message) {
/* 81 */     this.index = index;
/*    */ 
/*    */     
/* 84 */     this.finishReason = finishReason;
/*    */ 
/*    */     
/* 87 */     this.message = message; } @NotNull
/* 88 */   public final ResponseChatMessage getMessage() { return this.message; }
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
/*    */   public final ResponseChatMessage component3() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ResponseChoiceChat copy(long index, @NotNull String finishReason, @NotNull ResponseChatMessage message) {
/*    */     Intrinsics.checkNotNullParameter(finishReason, "finishReason");
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     return new ResponseChoiceChat(index, finishReason, message);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ResponseChoiceChat(index=" + this.index + ", finishReason=" + this.finishReason + ", message=" + this.message + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Long.hashCode(this.index);
/*    */     result = result * 31 + this.finishReason.hashCode();
/*    */     return result * 31 + this.message.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ResponseChoiceChat))
/*    */       return false; 
/*    */     ResponseChoiceChat responseChoiceChat = (ResponseChoiceChat)other;
/*    */     return (this.index != responseChoiceChat.index) ? false : (!Intrinsics.areEqual(this.finishReason, responseChoiceChat.finishReason) ? false : (!!Intrinsics.areEqual(this.message, responseChoiceChat.message)));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChoiceChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */