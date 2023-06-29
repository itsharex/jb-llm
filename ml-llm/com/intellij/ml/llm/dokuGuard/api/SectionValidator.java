package com.intellij.ml.llm.dokuGuard.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bf\030\0002\0020\001J\b\020\006\032\0020\007H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/SectionValidator;", "", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "getProjectSection", "()Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "validate", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
public interface SectionValidator {
  @NotNull
  ProjectSection getProjectSection();
  
  @NotNull
  ValidationDecision validate();
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/SectionValidator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */