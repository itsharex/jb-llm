package com.intellij.ml.llm.dokuGuard.openai.response;

import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\bf\030\0002\0020\001J\022\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser;", "", "parseOrNull", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "response", "", "intellij.ml.llm"})
public interface NullableResponseParser {
  @Nullable
  ValidationDecision parseOrNull(@NotNull String paramString);
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */