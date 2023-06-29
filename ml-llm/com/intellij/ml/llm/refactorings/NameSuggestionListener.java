package com.intellij.ml.llm.refactorings;

import com.intellij.openapi.vfs.VirtualFile;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\036\n\002\b\002\bf\030\0002\0020\001J.\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\t0\013H&J \020\f\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&ø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/refactorings/NameSuggestionListener;", "", "onFinish", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "offset", "", "originalName", "", "suggestedNames", "", "onStart", "intellij.ml.llm"})
public interface NameSuggestionListener {
  void onStart(@NotNull VirtualFile paramVirtualFile, int paramInt, @NotNull String paramString);
  
  void onFinish(@NotNull VirtualFile paramVirtualFile, int paramInt, @NotNull String paramString, @NotNull Collection<String> paramCollection);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/NameSuggestionListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */