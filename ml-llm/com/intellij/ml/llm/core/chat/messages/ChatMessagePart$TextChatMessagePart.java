/*    */ package com.intellij.ml.llm.core.chat.messages;
/*    */ 
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
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart$TextChatMessagePart;", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart;", "text", "", "kind", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "(Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;)V", "getKind", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class TextChatMessagePart
/*    */   implements ChatMessagePart
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final ChatMessagePartKind kind;
/*    */   
/*    */   public TextChatMessagePart(@NotNull String text, @NotNull ChatMessagePartKind kind) {
/* 91 */     this.text = text; this.kind = kind; } @NotNull public String getText() { return this.text; } @NotNull public ChatMessagePartKind getKind() { return this.kind; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatMessagePartKind component2() {
/*    */     return this.kind;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextChatMessagePart copy(@NotNull String text, @NotNull ChatMessagePartKind kind) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(kind, "kind");
/*    */     return new TextChatMessagePart(text, kind);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TextChatMessagePart(text=" + this.text + ", kind=" + this.kind + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     return result * 31 + this.kind.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TextChatMessagePart))
/*    */       return false; 
/*    */     TextChatMessagePart textChatMessagePart = (TextChatMessagePart)other;
/*    */     return !Intrinsics.areEqual(this.text, textChatMessagePart.text) ? false : (!(this.kind != textChatMessagePart.kind));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/ChatMessagePart$TextChatMessagePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */