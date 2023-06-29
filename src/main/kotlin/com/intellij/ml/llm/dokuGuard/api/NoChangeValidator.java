/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\007\032\0020\bH\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/NoChangeValidator;", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "(Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;)V", "getProjectSection", "()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "validate", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
/*    */ public final class NoChangeValidator implements SectionValidator {
/*    */   @NotNull
/*    */   private final ProjectSection projectSection;
/*    */   
/*  9 */   public NoChangeValidator(@NotNull ProjectSection projectSection) { this.projectSection = projectSection; } @NotNull public ProjectSection getProjectSection() { return this.projectSection; } @NotNull
/*    */   public ValidationDecision validate() {
/* 11 */     return ValidationDecision.Companion.getNO_CHANGE();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/NoChangeValidator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */