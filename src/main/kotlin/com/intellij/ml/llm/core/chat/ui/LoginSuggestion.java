/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import javax.swing.Icon;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\032\022\006\020\002\032\0020\003\022\013\020\004\032\0070\005¢\006\002\b\006¢\006\002\020\007J\t\020\f\032\0020\003HÆ\003J\016\020\r\032\0070\005¢\006\002\b\006HÆ\003J\"\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\r\b\002\020\004\032\0070\005¢\006\002\b\006HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\026\020\004\032\0070\005¢\006\002\b\006¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/LoginSuggestion;", "", "icon", "Ljavax/swing/Icon;", "text", "", "Lorg/jetbrains/annotations/Nls;", "(Ljavax/swing/Icon;Ljava/lang/String;)V", "getIcon", "()Ljavax/swing/Icon;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ final class LoginSuggestion
/*    */ {
/*    */   @NotNull
/*    */   private final Icon icon;
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   public LoginSuggestion(@NotNull Icon icon, @NotNull String text) {
/* 28 */     this.icon = icon;
/* 29 */     this.text = text; } @NotNull public final String getText() { return this.text; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Icon getIcon() {
/*    */     return this.icon;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Icon component1() {
/*    */     return this.icon;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LoginSuggestion copy(@NotNull Icon icon, @NotNull String text) {
/*    */     Intrinsics.checkNotNullParameter(icon, "icon");
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new LoginSuggestion(icon, text);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LoginSuggestion(icon=" + this.icon + ", text=" + this.text + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.icon.hashCode();
/*    */     return result * 31 + this.text.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LoginSuggestion))
/*    */       return false; 
/*    */     LoginSuggestion loginSuggestion = (LoginSuggestion)other;
/*    */     return !Intrinsics.areEqual(this.icon, loginSuggestion.icon) ? false : (!!Intrinsics.areEqual(this.text, loginSuggestion.text));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/LoginSuggestion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */