package com.intellij.ml.llm.core.grazieAPI;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieAuthService.kt", l = {318}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"busConnection", "grazieAuthUrl"}, m = "obtainNewToken", c = "com.intellij.ml.llm.core.grazieAPI.GrazieAuthService")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class GrazieAuthService$obtainNewToken$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  GrazieAuthService$obtainNewToken$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieAuthService.access$obtainNewToken(GrazieAuthService.this, (Continuation)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/grazieAPI/GrazieAuthService$obtainNewToken$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */