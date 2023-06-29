package com.intellij.ml.llm.core.chat.context;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Utils.kt", l = {14, 17}, i = {0, 0, 0, 0, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$4"}, n = {"project", "creationContext", "allItems", "chatContextProvider", "project", "creationContext", "allItems", "chatContextProvider"}, m = "collectChatContext", c = "com.intellij.ml.llm.core.chat.context.UtilsKt")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class UtilsKt$collectChatContext$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  UtilsKt$collectChatContext$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return UtilsKt.collectChatContext(null, null, (Continuation<? super String>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/UtilsKt$collectChatContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */