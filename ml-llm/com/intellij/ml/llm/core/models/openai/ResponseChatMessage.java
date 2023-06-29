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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\t\032\0020\003HÆ\003J\t\020\n\032\0020\003HÆ\003J\035\020\013\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\003HÖ\001R\026\020\004\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\006\020\007R\026\020\002\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\b\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChatMessage;", "", "role", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getRole", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class ResponseChatMessage
/*    */ {
/*    */   @SerializedName("role")
/*    */   @NotNull
/*    */   private final String role;
/*    */   @SerializedName("content")
/*    */   @NotNull
/*    */   private final String content;
/*    */   
/*    */   public ResponseChatMessage(@NotNull String role, @NotNull String content) {
/* 92 */     this.role = role;
/*    */ 
/*    */     
/* 95 */     this.content = content; } @NotNull
/* 96 */   public final String getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getRole() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ResponseChatMessage copy(@NotNull String role, @NotNull String content) {
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new ResponseChatMessage(role, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ResponseChatMessage(role=" + this.role + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.role.hashCode();
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ResponseChatMessage))
/*    */       return false; 
/*    */     ResponseChatMessage responseChatMessage = (ResponseChatMessage)other;
/*    */     return !Intrinsics.areEqual(this.role, responseChatMessage.role) ? false : (!!Intrinsics.areEqual(this.content, responseChatMessage.content));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */