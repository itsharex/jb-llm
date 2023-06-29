/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\030\002\n\002\b\037\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BI\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\003\022\b\b\002\020\n\032\0020\013\022\b\b\002\020\f\032\0020\r¢\006\002\020\016J\t\020%\032\0020\003HÆ\003J\t\020&\032\0020\005HÆ\003J\017\020'\032\b\022\004\022\0020\b0\007HÆ\003J\013\020(\032\004\030\0010\003HÆ\003J\t\020)\032\0020\013HÆ\003J\t\020*\032\0020\rHÆ\003JM\020+\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\0032\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rHÆ\001J\023\020,\032\0020-2\b\020.\032\004\030\0010\001HÖ\003J\t\020/\032\00200HÖ\001J\t\0201\032\0020\003HÖ\001R\034\020\t\032\004\030\0010\003X\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R \020\006\032\b\022\004\022\0020\b0\007X\016¢\006\016\n\000\032\004\b\023\020\024\"\004\b\025\020\026R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\032\020\f\032\0020\rX\016¢\006\016\n\000\032\004\b\033\020\034\"\004\b\035\020\036R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\"R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b#\020\020\"\004\b$\020\022¨\0062"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChat;", "", "uid", "", "title", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;", "messages", "", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatMessage;", "context", "modifiedAt", "", "statisticInformation", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;", "(Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;Ljava/util/List;Ljava/lang/String;JLcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;)V", "getContext", "()Ljava/lang/String;", "setContext", "(Ljava/lang/String;)V", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "getModifiedAt", "()J", "setModifiedAt", "(J)V", "getStatisticInformation", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;", "setStatisticInformation", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$ChatStatisticInformation;)V", "getTitle", "()Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;", "setTitle", "(Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;)V", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class SerializedChat { @NotNull
/*    */   private String uid;
/*    */   @NotNull
/*    */   private ChatSessionStorage.SerializedChatTitle title;
/*    */   @NotNull
/*    */   private List<ChatSessionStorage.SerializedChatMessage> messages;
/*    */   @Nullable
/*    */   private String context;
/*    */   private long modifiedAt;
/*    */   @NotNull
/*    */   private ChatSessionStorage.ChatStatisticInformation statisticInformation;
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
/*    */   public final ChatSessionStorage.SerializedChatTitle getTitle() {
/*    */     return this.title;
/*    */   }
/*    */   
/*    */   public final void setTitle(@NotNull ChatSessionStorage.SerializedChatTitle <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.title = <set-?>;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ChatSessionStorage.SerializedChatMessage> getMessages() {
/*    */     return this.messages;
/*    */   }
/*    */   
/* 40 */   public SerializedChat(@NotNull String uid, @NotNull ChatSessionStorage.SerializedChatTitle title, @NotNull List<ChatSessionStorage.SerializedChatMessage> messages, @Nullable String context, long modifiedAt, @NotNull ChatSessionStorage.ChatStatisticInformation statisticInformation) { this.uid = uid;
/* 41 */     this.title = title;
/* 42 */     this.messages = messages;
/* 43 */     this.context = context;
/* 44 */     this.modifiedAt = modifiedAt;
/* 45 */     this.statisticInformation = statisticInformation; } public final void setMessages(@NotNull List<ChatSessionStorage.SerializedChatMessage> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.messages = <set-?>; } @Nullable public final String getContext() { return this.context; } @NotNull public final ChatSessionStorage.ChatStatisticInformation getStatisticInformation() { return this.statisticInformation; } public final void setContext(@Nullable String <set-?>) { this.context = <set-?>; } public final long getModifiedAt() { return this.modifiedAt; } public final void setModifiedAt(long <set-?>) { this.modifiedAt = <set-?>; } public final void setStatisticInformation(@NotNull ChatSessionStorage.ChatStatisticInformation <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.statisticInformation = <set-?>; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatSessionStorage.SerializedChatTitle component2() {
/*    */     return this.title;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ChatSessionStorage.SerializedChatMessage> component3() {
/*    */     return this.messages;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   public final long component5() {
/*    */     return this.modifiedAt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatSessionStorage.ChatStatisticInformation component6() {
/*    */     return this.statisticInformation;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializedChat copy(@NotNull String uid, @NotNull ChatSessionStorage.SerializedChatTitle title, @NotNull List<ChatSessionStorage.SerializedChatMessage> messages, @Nullable String context, long modifiedAt, @NotNull ChatSessionStorage.ChatStatisticInformation statisticInformation) {
/*    */     Intrinsics.checkNotNullParameter(uid, "uid");
/*    */     Intrinsics.checkNotNullParameter(title, "title");
/*    */     Intrinsics.checkNotNullParameter(messages, "messages");
/*    */     Intrinsics.checkNotNullParameter(statisticInformation, "statisticInformation");
/*    */     return new SerializedChat(uid, title, messages, context, modifiedAt, statisticInformation);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SerializedChat(uid=" + this.uid + ", title=" + this.title + ", messages=" + this.messages + ", context=" + this.context + ", modifiedAt=" + this.modifiedAt + ", statisticInformation=" + this.statisticInformation + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.uid.hashCode();
/*    */     result = result * 31 + this.title.hashCode();
/*    */     result = result * 31 + this.messages.hashCode();
/*    */     result = result * 31 + ((this.context == null) ? 0 : this.context.hashCode());
/*    */     result = result * 31 + Long.hashCode(this.modifiedAt);
/*    */     return result * 31 + this.statisticInformation.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SerializedChat))
/*    */       return false; 
/*    */     SerializedChat serializedChat = (SerializedChat)other;
/*    */     return !Intrinsics.areEqual(this.uid, serializedChat.uid) ? false : (!Intrinsics.areEqual(this.title, serializedChat.title) ? false : (!Intrinsics.areEqual(this.messages, serializedChat.messages) ? false : (!Intrinsics.areEqual(this.context, serializedChat.context) ? false : ((this.modifiedAt != serializedChat.modifiedAt) ? false : (!!Intrinsics.areEqual(this.statisticInformation, serializedChat.statisticInformation))))));
/*    */   }
/*    */   
/*    */   public SerializedChat() {
/*    */     this(null, null, null, null, 0L, null, 63, null);
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */