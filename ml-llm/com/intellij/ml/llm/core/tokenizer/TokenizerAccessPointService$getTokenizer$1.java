package com.intellij.ml.llm.core.tokenizer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "TokenizerAccessPointService.kt", l = {38, 19}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "getTokenizer", c = "com.intellij.ml.llm.core.tokenizer.TokenizerAccessPointService")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class TokenizerAccessPointService$getTokenizer$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  TokenizerAccessPointService$getTokenizer$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TokenizerAccessPointService.this.getTokenizer((Continuation<? super Tokenizer>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/tokenizer/TokenizerAccessPointService$getTokenizer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */