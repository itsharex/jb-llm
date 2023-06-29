package com.intellij.ml.llm.core.models.openai;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\b\002\n\002\020\t\n\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"COMPLETION_API", "", "DEFAULT_CHAT_API", "OPENAI_READ_REQUEST_DELAY_MS", "", "intellij.ml.llm"})
public final class OpenAIRequestsKt {
  private static final long OPENAI_READ_REQUEST_DELAY_MS = 50L;
  
  @NotNull
  private static final String DEFAULT_CHAT_API = "chat/completions";
  
  @NotNull
  private static final String COMPLETION_API = "completions";
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/models/openai/OpenAIRequestsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */