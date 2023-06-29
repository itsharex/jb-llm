/*   */ package com.intellij.ml.llm.core.models.requestResponse;
/*   */ 
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm"})
/*   */ public final class LLMResponseChoice {
/* 7 */   public LLMResponseChoice(@NotNull String text) { this.text = text; } @NotNull private final String text; @NotNull public final String getText() { return this.text; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.text;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final LLMResponseChoice copy(@NotNull String text) {
/*   */     Intrinsics.checkNotNullParameter(text, "text");
/*   */     return new LLMResponseChoice(text);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "LLMResponseChoice(text=" + this.text + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.text.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof LLMResponseChoice))
/*   */       return false; 
/*   */     LLMResponseChoice lLMResponseChoice = (LLMResponseChoice)other;
/*   */     return !!Intrinsics.areEqual(this.text, lLMResponseChoice.text);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */