/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\016\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\021\032\0020\0052\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\004\020\007\"\004\b\b\020\tR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\r¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle;", "", "text", "", "isCustom", "", "(Ljava/lang/String;Z)V", "()Z", "setCustom", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class SerializedChatTitle
/*    */ {
/*    */   @NotNull
/*    */   private String text;
/*    */   private boolean isCustom;
/*    */   
/*    */   public SerializedChatTitle(@NotNull String text, boolean isCustom) {
/* 38 */     this.text = text; this.isCustom = isCustom; } @NotNull public final String getText() { return this.text; } public final void setText(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.text = <set-?>; } public final boolean isCustom() { return this.isCustom; } public final void setCustom(boolean <set-?>) { this.isCustom = <set-?>; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.isCustom;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializedChatTitle copy(@NotNull String text, boolean isCustom) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new SerializedChatTitle(text, isCustom);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SerializedChatTitle(text=" + this.text + ", isCustom=" + this.isCustom + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     if (this.isCustom);
/*    */     return result * 31 + 1;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SerializedChatTitle))
/*    */       return false; 
/*    */     SerializedChatTitle serializedChatTitle = (SerializedChatTitle)other;
/*    */     return !Intrinsics.areEqual(this.text, serializedChatTitle.text) ? false : (!(this.isCustom != serializedChatTitle.isCustom));
/*    */   }
/*    */   
/*    */   public SerializedChatTitle() {
/*    */     this(null, false, 3, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatSessionStorage$SerializedChatTitle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */