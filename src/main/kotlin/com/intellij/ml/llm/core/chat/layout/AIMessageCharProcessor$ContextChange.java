/*    */ package com.intellij.ml.llm.core.chat.layout;
/*    */ 
/*    */ import com.intellij.ml.llm.core.chat.parts.MessagePart;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange;", "", "contextType", "Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "borderType", "Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;", "(Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;)V", "getBorderType", "()Lcom/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$BorderType;", "getContextType", "()Lcom/intellij/ml/llm/core/chat/parts/MessagePart$Type;", "intellij.ml.llm"})
/*    */ public final class ContextChange
/*    */ {
/*    */   @NotNull
/*    */   private final MessagePart.Type contextType;
/*    */   @NotNull
/*    */   private final AIMessageCharProcessor.BorderType borderType;
/*    */   
/*    */   public ContextChange(@NotNull MessagePart.Type contextType, @NotNull AIMessageCharProcessor.BorderType borderType) {
/* 26 */     this.contextType = contextType; this.borderType = borderType; } @NotNull public final MessagePart.Type getContextType() { return this.contextType; } @NotNull public final AIMessageCharProcessor.BorderType getBorderType() { return this.borderType; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/layout/AIMessageCharProcessor$ContextChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */