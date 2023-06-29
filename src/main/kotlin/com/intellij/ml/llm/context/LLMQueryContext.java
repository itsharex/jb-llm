package com.intellij.ml.llm.context;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\bf\030\0002\0020\001J\b\020\002\032\0020\003H&J\b\020\004\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Lcom/intellij/ml/llm/context/LLMQueryContext;", "", "toJson", "", "toQuery", "intellij.ml.llm"})
public interface LLMQueryContext {
  @NotNull
  String toQuery();
  
  @NotNull
  String toJson();
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/LLMQueryContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */