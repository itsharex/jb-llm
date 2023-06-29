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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\n\013R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\t\001\002\f\rø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart;", "", "kind", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "getKind", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "text", "", "getText", "()Ljava/lang/String;", "CodeChatMessagePart", "TextChatMessagePart", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart$CodeChatMessagePart;", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart$TextChatMessagePart;", "intellij.ml.llm"})
/*    */ public interface ChatMessagePart
/*    */ {
/*    */   @NotNull
/*    */   String getText();
/*    */   
/*    */   @NotNull
/*    */   ChatMessagePartKind getKind();
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart$TextChatMessagePart;", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart;", "text", "", "kind", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "(Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;)V", "getKind", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */   public static final class TextChatMessagePart
/*    */     implements ChatMessagePart
/*    */   {
/*    */     @NotNull
/*    */     private final String text;
/*    */     @NotNull
/*    */     private final ChatMessagePartKind kind;
/*    */     
/*    */     public TextChatMessagePart(@NotNull String text, @NotNull ChatMessagePartKind kind) {
/* 91 */       this.text = text; this.kind = kind; } @NotNull public String getText() { return this.text; } @NotNull public ChatMessagePartKind getKind() { return this.kind; } @NotNull public final String component1() { return this.text; } @NotNull public final ChatMessagePartKind component2() { return this.kind; } @NotNull public final TextChatMessagePart copy(@NotNull String text, @NotNull ChatMessagePartKind kind) { Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(kind, "kind"); return new TextChatMessagePart(text, kind); } @NotNull public String toString() { return "TextChatMessagePart(text=" + this.text + ", kind=" + this.kind + ")"; } public int hashCode() { result = this.text.hashCode(); return result * 31 + this.kind.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TextChatMessagePart)) return false;  TextChatMessagePart textChatMessagePart = (TextChatMessagePart)other; return !Intrinsics.areEqual(this.text, textChatMessagePart.text) ? false : (!(this.kind != textChatMessagePart.kind)); }
/* 92 */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\013\020\016\032\004\030\0010\003HÆ\003J\t\020\017\032\0020\006HÆ\003J)\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\003HÖ\001R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\013R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\f\020\013¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart$CodeChatMessagePart;", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePart;", "text", "", "language", "kind", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;)V", "getKind", "()Lcom/intellij/ml/llm/core/chat/messages/ChatMessagePartKind;", "getLanguage", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intellij.ml.llm"}) public static final class CodeChatMessagePart implements ChatMessagePart { @NotNull private final String text; public CodeChatMessagePart(@NotNull String text, @Nullable String language, @NotNull ChatMessagePartKind kind) { this.text = text; this.language = language; this.kind = kind; } @Nullable private final String language; @NotNull private final ChatMessagePartKind kind; @NotNull public String getText() { return this.text; } @Nullable public final String getLanguage() { return this.language; } @NotNull public ChatMessagePartKind getKind() { return this.kind; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.text;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component2() {
/*    */       return this.language;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final ChatMessagePartKind component3() {
/*    */       return this.kind;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final CodeChatMessagePart copy(@NotNull String text, @Nullable String language, @NotNull ChatMessagePartKind kind) {
/*    */       Intrinsics.checkNotNullParameter(text, "text");
/*    */       Intrinsics.checkNotNullParameter(kind, "kind");
/*    */       return new CodeChatMessagePart(text, language, kind);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "CodeChatMessagePart(text=" + this.text + ", language=" + this.language + ", kind=" + this.kind + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.text.hashCode();
/*    */       result = result * 31 + ((this.language == null) ? 0 : this.language.hashCode());
/*    */       return result * 31 + this.kind.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof CodeChatMessagePart))
/*    */         return false; 
/*    */       CodeChatMessagePart codeChatMessagePart = (CodeChatMessagePart)other;
/*    */       return !Intrinsics.areEqual(this.text, codeChatMessagePart.text) ? false : (!Intrinsics.areEqual(this.language, codeChatMessagePart.language) ? false : (!(this.kind != codeChatMessagePart.kind)));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/ChatMessagePart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */