package com.intellij.ml.llm.core.grazieAPI;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieAPI.kt", l = {146}, i = {}, s = {}, n = {}, m = "text", c = "com.intellij.ml.llm.core.grazieAPI.CL100KLoader")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class CL100KLoader$text$1 extends ContinuationImpl {
  int label;
  
  CL100KLoader$text$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CL100KLoader.this.text(null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/CL100KLoader$text$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */