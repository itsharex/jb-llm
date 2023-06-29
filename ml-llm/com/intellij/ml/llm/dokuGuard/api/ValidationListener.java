package com.intellij.ml.llm.dokuGuard.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "", "sectionValidated", "", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "decision", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
public interface ValidationListener {
  void sectionValidated(@NotNull ProjectSection paramProjectSection, @NotNull ValidationDecision paramValidationDecision);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/ValidationListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */