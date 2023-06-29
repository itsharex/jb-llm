/*    */ package com.intellij.ml.llm.core.chat.context;
/*    */ 
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider$Companion;", "", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/core/chat/context/ChatContextProvider;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "intellij.ml.llm"})
/*    */ public final class Companion
/*    */ {
/*    */   @NotNull
/* 23 */   private static final ExtensionPointName<ChatContextProvider> EP_NAME = new ExtensionPointName("com.intellij.chatContextProvider"); @NotNull public final ExtensionPointName<ChatContextProvider> getEP_NAME() { return EP_NAME; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/context/ChatContextProvider$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */