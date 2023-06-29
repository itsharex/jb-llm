package com.intellij.ml.llm.completion.inline;

import com.intellij.codeInsight.inline.completion.InlineCompletionElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMInlineEditorListener.kt", l = {25}, i = {}, s = {}, n = {}, m = "getProposals", c = "com.intellij.ml.llm.completion.inline.LLMInlineCompletionProvider")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class LLMInlineCompletionProvider$getProposals$1 extends ContinuationImpl {
  int label;
  
  LLMInlineCompletionProvider$getProposals$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMInlineCompletionProvider.this.getProposals(null, (Continuation<? super List<InlineCompletionElement>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/completion/inline/LLMInlineCompletionProvider$getProposals$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */