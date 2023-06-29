/*    */ package com.intellij.ml.llm.core.chat.messages;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\013\020\f\032\004\030\0010\005HÆ\003J\037\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\b\020\022\032\0020\003H\026J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ErrorState;", "Lcom/intellij/ml/llm/core/chat/messages/CompletedState;", "text", "", "error", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "getPresentation", "hashCode", "", "toString", "intellij.ml.llm"})
/*    */ public final class ErrorState
/*    */   implements CompletedState
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @Nullable
/*    */   private final Throwable error;
/*    */   
/*    */   public ErrorState(@NotNull String text, @Nullable Throwable error) {
/* 23 */     this.text = text; this.error = error; } @NotNull public final String getText() { return this.text; } @Nullable public final Throwable getError() { return this.error; } @NotNull
/* 24 */   public String getPresentation() { return this.text; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Throwable component2() {
/*    */     return this.error;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ErrorState copy(@NotNull String text, @Nullable Throwable error) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new ErrorState(text, error);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ErrorState(text=" + this.text + ", error=" + this.error + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     return result * 31 + ((this.error == null) ? 0 : this.error.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ErrorState))
/*    */       return false; 
/*    */     ErrorState errorState = (ErrorState)other;
/*    */     return !Intrinsics.areEqual(this.text, errorState.text) ? false : (!!Intrinsics.areEqual(this.error, errorState.error));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/ErrorState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */