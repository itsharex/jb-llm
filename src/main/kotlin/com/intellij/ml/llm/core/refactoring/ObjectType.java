/*    */ package com.intellij.ml.llm.core.refactoring;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\n\b\001\030\0002\b\022\004\022\0020\0000\001B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/core/refactoring/ObjectType;", "", "prompt", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPrompt", "()Ljava/lang/String;", "CLASS", "METHOD", "FUNCTION", "FIELD", "CONSTANT", "VARIABLE", "intellij.ml.llm"})
/*    */ public enum ObjectType
/*    */ {
/* 83 */   CLASS(" class"),
/* 84 */   METHOD(" method"),
/* 85 */   FUNCTION(" function"),
/* 86 */   FIELD(" field"),
/* 87 */   CONSTANT(" constant"),
/* 88 */   VARIABLE("");
/*    */   @NotNull
/*    */   private final String prompt;
/*    */   
/*    */   ObjectType(String prompt) {
/*    */     this.prompt = prompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getPrompt() {
/*    */     return this.prompt;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/refactoring/ObjectType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */