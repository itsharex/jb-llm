package com.intellij.ml.llm.dokuGuard.api;

import com.intellij.lang.Language;
import com.intellij.openapi.project.Project;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "", "code", "", "getCode", "()Ljava/lang/String;", "language", "Lcom/intellij/lang/Language;", "getLanguage", "()Lcom/intellij/lang/Language;", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "intellij.ml.llm"})
public interface ProjectSection {
  @NotNull
  String getCode();
  
  @NotNull
  Language getLanguage();
  
  @NotNull
  Project getProject();
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/ProjectSection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */