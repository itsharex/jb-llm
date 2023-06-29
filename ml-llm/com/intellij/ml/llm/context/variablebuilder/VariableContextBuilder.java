package com.intellij.ml.llm.context.variablebuilder;

import com.intellij.ml.llm.context.VariableContext;
import com.intellij.psi.PsiElement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\bf\030\0002\0020\001J*\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/context/variablebuilder/VariableContextBuilder;", "", "getVariableContext", "Lcom/intellij/ml/llm/context/VariableContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeMethodContext", "", "includeClassContext", "gatherUsages", "intellij.ml.llm"})
public interface VariableContextBuilder {
  @Nullable
  VariableContext getVariableContext(@NotNull PsiElement paramPsiElement, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/variablebuilder/VariableContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */