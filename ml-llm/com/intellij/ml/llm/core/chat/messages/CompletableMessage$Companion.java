/*   */ package com.intellij.ml.llm.core.chat.messages;
/*   */ import com.intellij.openapi.actionSystem.DataKey;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\025\022\f\022\n \006*\004\030\0010\0050\0050\004¢\006\002\b\007¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage$Companion;", "", "()V", "Key", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "kotlin.jvm.PlatformType", "Lorg/jetbrains/annotations/NotNull;", "getKey", "()Lcom/intellij/openapi/actionSystem/DataKey;", "intellij.ml.llm"})
/*   */ public final class Companion {
/*   */   @NotNull
/* 8 */   private static final DataKey<CompletableMessage> Key = DataKey.create("CompletableMessage"); @NotNull public final DataKey<CompletableMessage> getKey() { return Key; } static { Intrinsics.checkNotNullExpressionValue(DataKey.create("CompletableMessage"), "create<CompletableMessage>(\"CompletableMessage\")"); }
/*   */ 
/*   */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/CompletableMessage$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */