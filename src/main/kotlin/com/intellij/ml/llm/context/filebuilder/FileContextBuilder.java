package com.intellij.ml.llm.context.filebuilder;

import com.intellij.ml.llm.context.FileContext;
import com.intellij.psi.PsiFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\022\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lcom/intellij/ml/llm/context/filebuilder/FileContextBuilder;", "", "getFileContext", "Lcom/intellij/ml/llm/context/FileContext;", "psiFile", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
public interface FileContextBuilder {
  @Nullable
  FileContext getFileContext(@NotNull PsiFile paramPsiFile);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/filebuilder/FileContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */