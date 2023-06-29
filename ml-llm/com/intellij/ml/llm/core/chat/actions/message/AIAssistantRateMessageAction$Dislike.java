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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\r\020\005\032\0070\006¢\006\002\b\007H\026J\r\020\b\032\0070\006¢\006\002\b\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Dislike;", "Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction;", "()V", "getReaction", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "getReactionIcon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "getReactionIconSelected", "intellij.ml.llm"})
/*    */ public final class Dislike
/*    */   extends AIAssistantRateMessageAction
/*    */ {
/*    */   public Dislike() {
/* 50 */     super(null); } @NotNull
/* 51 */   public ChatMessageRating getReaction() { return ChatMessageRating.Dislike; } @NotNull
/* 52 */   public Icon getReactionIcon() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.Dislike, "Dislike"); return MLLlmIcons.Dislike; } @NotNull
/* 53 */   public Icon getReactionIconSelected() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.DislikeSelected, "DislikeSelected"); return MLLlmIcons.DislikeSelected; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Dislike.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */