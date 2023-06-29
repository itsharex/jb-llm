/*     */ package com.intellij.ml.llm.core.models.openai;
/*     */ 
/*     */ import com.google.gson.annotations.SerializedName;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003¢\006\002\020\005J\013\020\t\032\004\030\0010\003HÆ\003J\013\020\n\032\004\030\0010\003HÆ\003J!\020\013\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\003HÖ\001R\030\020\004\032\004\030\0010\0038\006X\004¢\006\b\n\000\032\004\b\006\020\007R\030\020\002\032\004\030\0010\0038\006X\004¢\006\b\n\000\032\004\b\b\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChatDelta;", "", "role", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getRole", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*     */ public final class ResponseChatDelta
/*     */ {
/*     */   @SerializedName("role")
/*     */   @Nullable
/*     */   private final String role;
/*     */   @SerializedName("content")
/*     */   @Nullable
/*     */   private final String content;
/*     */   
/*     */   public ResponseChatDelta(@Nullable String role, @Nullable String content) {
/* 111 */     this.role = role;
/*     */ 
/*     */     
/* 114 */     this.content = content; } @Nullable
/* 115 */   public final String getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getRole() {
/*     */     return this.role;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component1() {
/*     */     return this.role;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResponseChatDelta copy(@Nullable String role, @Nullable String content) {
/*     */     return new ResponseChatDelta(role, content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ResponseChatDelta(role=" + this.role + ", content=" + this.content + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.role == null) ? 0 : this.role.hashCode();
/*     */     return result * 31 + ((this.content == null) ? 0 : this.content.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ResponseChatDelta))
/*     */       return false; 
/*     */     ResponseChatDelta responseChatDelta = (ResponseChatDelta)other;
/*     */     return !Intrinsics.areEqual(this.role, responseChatDelta.role) ? false : (!!Intrinsics.areEqual(this.content, responseChatDelta.content));
/*     */   }
/*     */   
/*     */   public ResponseChatDelta() {
/*     */     this(null, null, 3, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChatDelta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */