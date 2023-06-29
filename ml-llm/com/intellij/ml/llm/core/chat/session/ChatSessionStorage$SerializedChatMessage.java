/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B-\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJ\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\006HÆ\003J\t\020\033\032\0020\bHÆ\003J1\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\bHÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020!HÖ\001J\t\020\"\032\0020\003HÖ\001R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\032\020\004\032\0020\003X\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021R\032\020\007\032\0020\bX\016¢\006\016\n\000\032\004\b\022\020\023\"\004\b\024\020\025R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\026\020\017\"\004\b\027\020\021¨\006#"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatMessage;", "", "uid", "", "content", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "rating", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "getAuthor", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "setAuthor", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getRating", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "setRating", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "getUid", "setUid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class SerializedChatMessage {
/*    */   @NotNull
/*    */   private String uid;
/*    */   @NotNull
/*    */   private String content;
/*    */   @NotNull
/*    */   private ChatMessageAuthor author;
/*    */   @NotNull
/*    */   private ChatMessageRating rating;
/*    */   
/*    */   @NotNull
/*    */   public final String getUid() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   public final void setUid(@NotNull String <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.uid = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getContent() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   public final void setContent(@NotNull String <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.content = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatMessageAuthor getAuthor() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   public final void setAuthor(@NotNull ChatMessageAuthor <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.author = <set-?>;
/*    */   }
/*    */   
/* 47 */   public SerializedChatMessage(@NotNull String uid, @NotNull String content, @NotNull ChatMessageAuthor author, @NotNull ChatMessageRating rating) { this.uid = uid;
/* 48 */     this.content = content;
/* 49 */     this.author = author;
/* 50 */     this.rating = rating; } @NotNull public final ChatMessageRating getRating() { return this.rating; } public final void setRating(@NotNull ChatMessageRating <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.rating = <set-?>; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatMessageAuthor component3() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatMessageRating component4() {
/*    */     return this.rating;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializedChatMessage copy(@NotNull String uid, @NotNull String content, @NotNull ChatMessageAuthor author, @NotNull ChatMessageRating rating) {
/*    */     Intrinsics.checkNotNullParameter(uid, "uid");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     Intrinsics.checkNotNullParameter(author, "author");
/*    */     Intrinsics.checkNotNullParameter(rating, "rating");
/*    */     return new SerializedChatMessage(uid, content, author, rating);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SerializedChatMessage(uid=" + this.uid + ", content=" + this.content + ", author=" + this.author + ", rating=" + this.rating + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.uid.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     result = result * 31 + this.author.hashCode();
/*    */     return result * 31 + this.rating.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SerializedChatMessage))
/*    */       return false; 
/*    */     SerializedChatMessage serializedChatMessage = (SerializedChatMessage)other;
/*    */     return !Intrinsics.areEqual(this.uid, serializedChatMessage.uid) ? false : (!Intrinsics.areEqual(this.content, serializedChatMessage.content) ? false : ((this.author != serializedChatMessage.author) ? false : (!(this.rating != serializedChatMessage.rating))));
/*    */   }
/*    */   
/*    */   public SerializedChatMessage() {
/*    */     this(null, null, null, null, 15, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */