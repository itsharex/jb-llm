package com.intellij.ml.llm.core.models.requestResponse;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\bf\030\0002\0020\001J\016\020\002\032\b\022\004\022\0020\0040\003H&ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse;", "", "getSuggestions", "", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
public interface LLMBaseResponse {
  @NotNull
  List<LLMResponseChoice> getSuggestions();
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/requestResponse/LLMBaseResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */