/*   */ package com.intellij.ml.llm.core.chat.session;
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\n\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\005HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\r\032\0020\0052\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\003HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\t¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatTitle;", "", "text", "", "isCustom", "", "(Ljava/lang/String;Z)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*   */ public final class ChatTitle {
/*   */   @NotNull
/*   */   private final String text;
/*   */   
/* 7 */   public ChatTitle(@NotNull String text, boolean isCustom) { this.text = text; this.isCustom = isCustom; } private final boolean isCustom; @NotNull public final String getText() { return this.text; } public final boolean isCustom() { return this.isCustom; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.text;
/*   */   }
/*   */   
/*   */   public final boolean component2() {
/*   */     return this.isCustom;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final ChatTitle copy(@NotNull String text, boolean isCustom) {
/*   */     Intrinsics.checkNotNullParameter(text, "text");
/*   */     return new ChatTitle(text, isCustom);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "ChatTitle(text=" + this.text + ", isCustom=" + this.isCustom + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.text.hashCode();
/*   */     if (this.isCustom);
/*   */     return result * 31 + 1;
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof ChatTitle))
/*   */       return false; 
/*   */     ChatTitle chatTitle = (ChatTitle)other;
/*   */     return !Intrinsics.areEqual(this.text, chatTitle.text) ? false : (!(this.isCustom != chatTitle.isCustom));
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatTitle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */