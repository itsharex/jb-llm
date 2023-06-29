package com.intellij.ml.llm.core.tokenizer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TokenizerAccessPointService.kt", l = {26}, i = {}, s = {}, n = {}, m = "initTokenizer", c = "com.intellij.ml.llm.core.tokenizer.TokenizerAccessPointService")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class TokenizerAccessPointService$initTokenizer$1 extends ContinuationImpl {
  int label;
  
  TokenizerAccessPointService$initTokenizer$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TokenizerAccessPointService.access$initTokenizer(TokenizerAccessPointService.this, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$initTokenizer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */