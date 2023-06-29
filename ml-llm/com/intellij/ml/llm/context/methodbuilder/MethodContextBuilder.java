package com.intellij.ml.llm.context.methodbuilder;

import com.intellij.ml.llm.context.MethodContext;
import com.intellij.psi.PsiElement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\bf\030\0002\0020\001J\"\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/context/methodbuilder/MethodContextBuilder;", "", "getMethodContext", "Lcom/intellij/ml/llm/context/MethodContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeClassContext", "", "gatherUsages", "intellij.ml.llm"})
public interface MethodContextBuilder {
  @Nullable
  MethodContext getMethodContext(@NotNull PsiElement paramPsiElement, boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/methodbuilder/MethodContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */