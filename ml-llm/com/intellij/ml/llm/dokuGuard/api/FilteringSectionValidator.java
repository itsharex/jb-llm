/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\001¢\006\002\020\007J\b\020\n\032\0020\013H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\001X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/FilteringSectionValidator;", "Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;", "filter", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSectionFilter;", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "innerSectionValidator", "(Lcom/intellij/ml/llm/dokuGuard/api/ProjectSectionFilter;Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;)V", "getProjectSection", "()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "validate", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
/*    */ public final class FilteringSectionValidator implements SectionValidator {
/*    */   @NotNull
/*    */   private final ProjectSectionFilter filter;
/*    */   
/*  8 */   public FilteringSectionValidator(@NotNull ProjectSectionFilter filter, @NotNull ProjectSection projectSection, @NotNull SectionValidator innerSectionValidator) { this.filter = filter;
/*  9 */     this.projectSection = projectSection;
/* 10 */     this.innerSectionValidator = innerSectionValidator; }
/*    */   @NotNull private final ProjectSection projectSection; @NotNull private final SectionValidator innerSectionValidator; @NotNull
/*    */   public ProjectSection getProjectSection() { return this.projectSection; } @NotNull
/* 13 */   public ValidationDecision validate() { if (this.filter.accept(getProjectSection())) {
/* 14 */       return this.innerSectionValidator.validate();
/*    */     }
/* 16 */     return ValidationDecision.Companion.getNO_CHANGE(); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/FilteringSectionValidator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */