package com.intellij.ml.llm.context.classbuilder;

import com.intellij.ml.llm.context.ClassContext;
import com.intellij.psi.PsiElement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\bf\030\0002\0020\001J\032\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/context/classbuilder/ClassContextBuilder;", "", "getClassContext", "Lcom/intellij/ml/llm/context/ClassContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "gatherUsages", "", "intellij.ml.llm"})
public interface ClassContextBuilder {
  @Nullable
  ClassContext getClassContext(@NotNull PsiElement paramPsiElement, boolean paramBoolean);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/classbuilder/ClassContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */