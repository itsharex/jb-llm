/*    */ package com.intellij.ml.llm.core.chat.actions.message;
/*    */ 
/*    */ import com.intellij.ml.llm.MLLlmIcons;
/*    */ import com.intellij.ml.llm.core.chat.messages.ChatMessageRating;
/*    */ import javax.swing.Icon;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\r\020\005\032\0070\006¢\006\002\b\007H\026J\r\020\b\032\0070\006¢\006\002\b\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Like;", "Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction;", "()V", "getReaction", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "getReactionIcon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "getReactionIconSelected", "intellij.ml.llm"})
/*    */ public final class Like
/*    */   extends AIAssistantRateMessageAction
/*    */ {
/*    */   public Like() {
/* 44 */     super(null); } @NotNull
/* 45 */   public ChatMessageRating getReaction() { return ChatMessageRating.Like; } @NotNull
/* 46 */   public Icon getReactionIcon() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.Like, "Like"); return MLLlmIcons.Like; } @NotNull
/* 47 */   public Icon getReactionIconSelected() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.LikeSelected, "LikeSelected"); return MLLlmIcons.LikeSelected; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Like.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */