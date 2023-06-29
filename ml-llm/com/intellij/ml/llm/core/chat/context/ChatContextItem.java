/*    */ package com.intellij.ml.llm.core.chat.context;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.reflect.KClass;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005¢\006\002\020\006J\r\020\013\032\006\022\002\b\0030\003HÆ\003J\t\020\f\032\0020\005HÆ\003J!\020\r\032\0020\0002\f\b\002\020\002\032\006\022\002\b\0030\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\005HÖ\001R\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/core/chat/context/ChatContextItem;", "", "identity", "Lkotlin/reflect/KClass;", "text", "", "(Lkotlin/reflect/KClass;Ljava/lang/String;)V", "getIdentity", "()Lkotlin/reflect/KClass;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class ChatContextItem
/*    */ {
/*    */   @NotNull
/*    */   private final KClass<?> identity;
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   public ChatContextItem(@NotNull KClass<?> identity, @NotNull String text) {
/* 29 */     this.identity = identity; this.text = text; } @NotNull public final KClass<?> getIdentity() { return this.identity; } @NotNull public final String getText() { return this.text; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final KClass<?> component1() {
/*    */     return this.identity;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatContextItem copy(@NotNull KClass<?> identity, @NotNull String text) {
/*    */     Intrinsics.checkNotNullParameter(identity, "identity");
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new ChatContextItem(identity, text);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ChatContextItem(identity=" + this.identity + ", text=" + this.text + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.identity.hashCode();
/*    */     return result * 31 + this.text.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ChatContextItem))
/*    */       return false; 
/*    */     ChatContextItem chatContextItem = (ChatContextItem)other;
/*    */     return !Intrinsics.areEqual(this.identity, chatContextItem.identity) ? false : (!!Intrinsics.areEqual(this.text, chatContextItem.text));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/ChatContextItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */