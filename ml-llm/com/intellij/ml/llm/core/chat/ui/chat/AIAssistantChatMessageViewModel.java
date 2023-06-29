/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\006\n\002\020!\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\016\020!\032\0020\"2\006\020#\032\0020\013J\024\020$\032\0020\"2\f\020%\032\b\022\004\022\0020\0130\nJ\006\020&\032\0020\"J\016\020'\032\0020\"2\006\020#\032\0020\013J\006\020(\032\0020\"R\027\020\t\032\b\022\004\022\0020\0130\n8F¢\006\006\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R$\020\026\032\0020\0252\006\020\024\032\0020\0258F@FX\016¢\006\f\032\004\b\027\020\030\"\004\b\031\020\032R\024\020\033\032\b\022\004\022\0020\0130\034X\004¢\006\002\n\000R\021\020\035\032\0020\0368F¢\006\006\032\004\b\037\020 ¨\006)"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel;", "", "chat", "Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "completableMessage", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "author", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "(Lcom/intellij/ml/llm/core/chat/session/ChatSession;Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;)V", "allParts", "", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "getAllParts", "()Ljava/util/List;", "getAuthor", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "getChat", "()Lcom/intellij/ml/llm/core/chat/session/ChatSession;", "getCompletableMessage", "()Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "value", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "messageRating", "getMessageRating", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "setMessageRating", "(Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;)V", "parts", "", "text", "", "getText", "()Ljava/lang/String;", "addPart", "", "part", "addParts", "newParts", "removeAllParts", "removePart", "updateTimestamp", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nAIAssistantChatMessageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIAssistantChatMessageViewModel.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1855#2,2:48\n*S KotlinDebug\n*F\n+ 1 AIAssistantChatMessageViewModel.kt\ncom/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel\n*L\n28#1:48,2\n*E\n"})
/*    */ public final class AIAssistantChatMessageViewModel { @NotNull
/*    */   private final ChatSession chat;
/*    */   @NotNull
/*    */   private final CompletableMessage completableMessage;
/*    */   
/*  9 */   public AIAssistantChatMessageViewModel(@NotNull ChatSession chat, @NotNull CompletableMessage completableMessage, @NotNull ChatMessageAuthor author) { this.chat = chat; this.completableMessage = completableMessage; this.author = author;
/* 10 */     this.parts = new ArrayList<>(); }
/*    */   @NotNull private final ChatMessageAuthor author;
/*    */   @NotNull private final List<MessagePart> parts;
/*    */   @NotNull public final ChatSession getChat() { return this.chat; } @NotNull public final CompletableMessage getCompletableMessage() { return this.completableMessage; } @NotNull public final ChatMessageAuthor getAuthor() { return this.author; } @NotNull
/* 14 */   public final ChatMessageRating getMessageRating() { return this.completableMessage.getRating(); }
/*    */   
/*    */   public final void setMessageRating(@NotNull ChatMessageRating value) {
/* 17 */     Intrinsics.checkNotNullParameter(value, "value"); this.completableMessage.setRating(value);
/*    */   }
/*    */   @NotNull
/*    */   public final List<MessagePart> getAllParts() {
/* 21 */     return this.parts;
/*    */   }
/*    */   public final void addPart(@NotNull MessagePart part) {
/* 24 */     Intrinsics.checkNotNullParameter(part, "part"); this.parts.add(part);
/*    */   }
/*    */   
/*    */   public final void addParts(@NotNull List newParts) {
/* 28 */     Intrinsics.checkNotNullParameter(newParts, "newParts"); Iterable $this$forEach$iv = newParts; int $i$f$forEach = 0;
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
/* 48 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); MessagePart it = (MessagePart)element$iv; int $i$a$-forEach-AIAssistantChatMessageViewModel$addParts$1 = 0;
/*    */       this.parts.add(it); }
/*    */   
/*    */   }
/*    */   
/*    */   public final void removePart(@NotNull MessagePart part) {
/*    */     Intrinsics.checkNotNullParameter(part, "part");
/*    */     this.parts.remove(part);
/*    */   }
/*    */   
/*    */   public final void removeAllParts() {
/*    */     this.parts.clear();
/*    */   }
/*    */   
/*    */   public final void updateTimestamp() {
/*    */     this.chat.setTimestamp(System.currentTimeMillis());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return CollectionsKt.joinToString$default(this.parts, "\n", null, null, 0, null, AIAssistantChatMessageViewModel$text$1.INSTANCE, 30, null);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart;", "invoke"})
/*    */   static final class AIAssistantChatMessageViewModel$text$1 extends Lambda implements Function1<MessagePart, CharSequence> {
/*    */     public static final AIAssistantChatMessageViewModel$text$1 INSTANCE = new AIAssistantChatMessageViewModel$text$1();
/*    */     
/*    */     AIAssistantChatMessageViewModel$text$1() {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CharSequence invoke(@NotNull MessagePart it) {
/*    */       Intrinsics.checkNotNullParameter(it, "it");
/*    */       return it.getTextContent();
/*    */     }
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatMessageViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */