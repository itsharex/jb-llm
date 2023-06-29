/*   */ package com.intellij.ml.llm.dokuGuard.openai.response;
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\006\b\001\030\0002\b\022\004\022\0020\0000\001B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseVerdict;", "", "asResponse", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAsResponse", "()Ljava/lang/String;", "VALID", "INVALID", "intellij.ml.llm"})
/*   */ public enum ResponseVerdict {
/* 4 */   VALID("ok"),
/* 5 */   INVALID("fail");
/*   */   @NotNull
/*   */   private final String asResponse;
/*   */   
/*   */   ResponseVerdict(String asResponse) {
/*   */     this.asResponse = asResponse;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String getAsResponse() {
/*   */     return this.asResponse;
/*   */   }
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/ResponseVerdict.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */