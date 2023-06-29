/*   */ package com.intellij.ml.llm.dokuGuard.api;
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\b\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\0032\b\020\n\032\004\030\0010\001HÖ\003J\t\020\013\032\0020\fHÖ\001J\t\020\r\032\0020\016HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "", "preference", "", "(Z)V", "getPreference", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*   */ public final class ValidationPreferences {
/* 4 */   public ValidationPreferences(boolean preference) { this.preference = preference; } private final boolean preference; public final boolean getPreference() { return this.preference; }
/*   */ 
/*   */   
/*   */   public final boolean component1() {
/*   */     return this.preference;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final ValidationPreferences copy(boolean preference) {
/*   */     return new ValidationPreferences(preference);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "ValidationPreferences(preference=" + this.preference + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     if (this.preference);
/*   */     return 1;
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof ValidationPreferences))
/*   */       return false; 
/*   */     ValidationPreferences validationPreferences = (ValidationPreferences)other;
/*   */     return !(this.preference != validationPreferences.preference);
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/ValidationPreferences.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */