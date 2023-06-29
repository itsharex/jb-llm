/*    */ package com.intellij.ml.llm.core.chat.messages;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/messages/ThinkingState;", "Lcom/intellij/ml/llm/core/chat/messages/MessageState;", "()V", "getPresentation", "", "intellij.ml.llm"})
/*    */ public final class ThinkingState
/*    */   implements MessageState
/*    */ {
/*    */   @NotNull
/*    */   public String getPresentation() {
/* 12 */     return "Thinking...";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ThinkingState INSTANCE = new ThinkingState();
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/messages/ThinkingState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */