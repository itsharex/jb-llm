package com.intellij.ml.llm.dokuGuard.openai;

import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\022\020\006\032\0020\0032\b\020\007\032\004\030\0010\bH&ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/ValidationListener;", "", "onRequest", "", "request", "", "onResponse", "response", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
public interface ValidationListener {
  void onRequest(@NotNull String paramString);
  
  void onResponse(@Nullable LLMResponseChoice paramLLMResponseChoice);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/ValidationListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */