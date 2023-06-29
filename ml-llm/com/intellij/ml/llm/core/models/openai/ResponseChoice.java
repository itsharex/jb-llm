package com.intellij.ml.llm.core.models.openai;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\t\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lcom/intellij/ml/llm/core/models/openai/ResponseChoice;", "", "finishReason", "", "getFinishReason", "()Ljava/lang/String;", "index", "", "getIndex", "()J", "intellij.ml.llm"})
public interface ResponseChoice {
  long getIndex();
  
  @NotNull
  String getFinishReason();
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/ResponseChoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */