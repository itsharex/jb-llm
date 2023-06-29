package com.intellij.ml.llm.kotlin.chat.context;

import com.intellij.ml.llm.core.chat.context.ChatContextItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "KotlinVersionChatContextProvider.kt", l = {25}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "sourceFile"}, m = "collect", c = "com.intellij.ml.llm.kotlin.chat.context.KotlinVersionChatContextProvider")
@Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
final class KotlinVersionChatContextProvider$collect$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  KotlinVersionChatContextProvider$collect$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return KotlinVersionChatContextProvider.this.collect(null, null, (Continuation<? super List<ChatContextItem>>)this);
  }
}


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/chat/context/KotlinVersionChatContextProvider$collect$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */