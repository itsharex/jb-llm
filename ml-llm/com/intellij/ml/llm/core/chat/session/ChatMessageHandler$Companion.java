/*    */ package com.intellij.ml.llm.core.chat.session;
/*    */ 
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler$Companion;", "", "()V", "EP", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/session/ChatMessageHandler;", "getEP", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 12 */   private static final ExtensionPointName<ChatMessageHandler> EP = new ExtensionPointName("com.intellij.chatMessageHandler"); @NotNull public final ExtensionPointName<ChatMessageHandler> getEP() { return EP; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/session/ChatMessageHandler$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */