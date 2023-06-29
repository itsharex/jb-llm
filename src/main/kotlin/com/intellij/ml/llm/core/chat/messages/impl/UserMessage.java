/*    */ package com.intellij.ml.llm.core.chat.messages.impl;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\030\0002\0020\001B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJ\020\020\"\032\0020#2\006\020$\032\0020\020H\026J\020\020%\032\0020#2\006\020&\032\0020'H\026J\020\020(\032\0020#2\006\020&\032\0020)H\026J\020\020*\032\0020#2\006\020&\032\0020+H\026J\b\020,\032\0020#H\026J\020\020-\032\0020#2\006\020$\032\0020\020H\026J\020\020.\032\0020#2\006\020&\032\0020)H\026J\020\020/\032\0020#2\006\020&\032\0020+H\026R\024\020\n\032\0020\0138VX\004¢\006\006\032\004\b\f\020\rR\032\020\016\032\b\022\004\022\0020\0200\017X\004¢\006\b\n\000\032\004\b\021\020\022R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\023\020\024\"\004\b\025\020\026R\032\020\007\032\0020\bX\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\024\020\033\032\0020\0348VX\004¢\006\006\032\004\b\035\020\036R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\037\020 R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b!\020 ¨\0060"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/impl/UserMessage;", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "chat", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "text", "", "uid", "rating", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "(Lcom/intellij/ml/llm/core/chat/session/ChatSession;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "getAuthor", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "buttons", "", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageButton;", "getButtons", "()Ljava/util/List;", "getChat", "()Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "setChat", "(Lcom/intellij/ml/llm/core/chat/session/ChatSession;)V", "getRating", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "setRating", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "state", "Lcom/intellij/ml/llm/core/chat/messages/MessageState;", "getState", "()Lcom/intellij/ml/llm/core/chat/messages/MessageState;", "getText", "()Ljava/lang/String;", "getUid", "addButton", "", "button", "addButtonListener", "listener", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageButtonListener;", "addStateListener", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageStateListener;", "addTextListener", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessageTextListener;", "cancel", "removeButton", "removeStateListener", "removeTextListener", "intellij.ml.llm"})
/*    */ public final class UserMessage implements CompletableMessage { @NotNull
/*    */   private ChatSession chat; @NotNull
/*    */   private final String text; @NotNull
/*    */   private final String uid; @NotNull
/*    */   private ChatMessageRating rating; @NotNull
/*    */   private final List<ChatMessageButton> buttons;
/*  8 */   public UserMessage(@NotNull ChatSession chat, @NotNull String text, @NotNull String uid, @NotNull ChatMessageRating rating) { this.chat = chat;
/*  9 */     this.text = text;
/* 10 */     this.uid = uid;
/* 11 */     this.rating = rating;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 17 */     this.buttons = CollectionsKt.emptyList(); } @NotNull public ChatSession getChat() { return this.chat; } public void setChat(@NotNull ChatSession <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.chat = <set-?>; } @NotNull public String getText() { return this.text; } @NotNull public String getUid() { return this.uid; } @NotNull public List<ChatMessageButton> getButtons() { return this.buttons; }
/*    */   @NotNull public ChatMessageRating getRating() { return this.rating; }
/*    */   public void setRating(@NotNull ChatMessageRating <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.rating = <set-?>; }
/* 20 */   @NotNull public MessageState getState() { return (MessageState)ReadyState.INSTANCE; } @NotNull public ChatMessageAuthor getAuthor() { return ChatMessageAuthor.User; } public void addStateListener(@NotNull CompletableMessageStateListener listener) { Intrinsics.checkNotNullParameter(listener, "listener"); listener.onStateChanged(); }
/*    */ 
/*    */ 
/*    */   
/*    */   public void removeStateListener(@NotNull CompletableMessageStateListener listener) {
/* 25 */     Intrinsics.checkNotNullParameter(listener, "listener");
/*    */   }
/*    */   public void addTextListener(@NotNull CompletableMessageTextListener listener) {
/* 28 */     Intrinsics.checkNotNullParameter(listener, "listener"); listener.onTextChanged(getText());
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeTextListener(@NotNull CompletableMessageTextListener listener) {
/* 33 */     Intrinsics.checkNotNullParameter(listener, "listener");
/*    */   }
/*    */   public void addButton(@NotNull ChatMessageButton button) {
/* 36 */     Intrinsics.checkNotNullParameter(button, "button");
/*    */   }
/*    */   public void removeButton(@NotNull ChatMessageButton button) {
/* 39 */     Intrinsics.checkNotNullParameter(button, "button");
/*    */   }
/*    */   public void addButtonListener(@NotNull CompletableMessageButtonListener listener) {
/* 42 */     Intrinsics.checkNotNullParameter(listener, "listener");
/*    */   }
/*    */   
/*    */   public void cancel() {} }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/impl/UserMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */