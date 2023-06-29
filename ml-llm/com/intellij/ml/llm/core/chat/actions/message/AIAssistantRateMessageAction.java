/*    */ package com.intellij.ml.llm.core.chat.actions.message;
/*    */ import com.intellij.ml.llm.MLLlmIcons;
/*    */ import com.intellij.ml.llm.core.chat.messages.ChatMessageRating;
/*    */ import com.intellij.ml.llm.core.chat.messages.CompletableMessage;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import javax.swing.Icon;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\027\030B\007\b\004¢\006\002\020\002J\b\020\t\032\0020\nH\026J\b\020\013\032\0020\fH&J\b\020\r\032\0020\016H&J\b\020\017\032\0020\016H&J\020\020\020\032\0020\0212\006\020\022\032\0020\006H\026J\030\020\023\032\0020\0242\006\020\022\032\0020\0062\006\020\025\032\0020\021H\026J\020\020\026\032\0020\0242\006\020\022\032\0020\006H\026R\037\020\003\032\t\030\0010\004¢\006\002\b\005*\0020\0068BX\004¢\006\006\032\004\b\007\020\b\001\002\031\032¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction;", "Lcom/intellij/openapi/project/DumbAwareToggleAction;", "()V", "message", "Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getMessage", "(Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lcom/intellij/ml/llm/core/chat/messages/CompletableMessage;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "getReaction", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "getReactionIcon", "Ljavax/swing/Icon;", "getReactionIconSelected", "isSelected", "", "e", "setSelected", "", "state", "update", "Dislike", "Like", "Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Dislike;", "Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Like;", "intellij.ml.llm"})
/*    */ public abstract class AIAssistantRateMessageAction extends DumbAwareToggleAction {
/*    */   private AIAssistantRateMessageAction() {}
/*    */   
/*    */   private final CompletableMessage getMessage(AnActionEvent $this$message) {
/* 15 */     return (CompletableMessage)$this$message.getDataContext().getData(CompletableMessage.Companion.getKey());
/*    */   }
/*    */   public void update(@NotNull AnActionEvent e) {
/* 18 */     Intrinsics.checkNotNullParameter(e, "e"); super.update(e);
/* 19 */     Icon icon = !isSelected(e) ? getReactionIcon() : getReactionIconSelected();
/* 20 */     e.getPresentation().setIcon(icon);
/* 21 */     CompletableMessage message = getMessage(e);
/* 22 */     e.getPresentation().setEnabledAndVisible(!((message != null) ? message.getState() : null instanceof com.intellij.ml.llm.core.chat.messages.ErrorState));
/*    */   }
/*    */   
/*    */   public boolean isSelected(@NotNull AnActionEvent e) {
/* 26 */     Intrinsics.checkNotNullParameter(e, "e"); getMessage(e); return (((getMessage(e) != null) ? getMessage(e).getRating() : null) == getReaction());
/*    */   }
/*    */   
/*    */   public void setSelected(@NotNull AnActionEvent e, boolean state) { CompletableMessage message;
/* 30 */     Intrinsics.checkNotNullParameter(e, "e"); if (getMessage(e) == null) { getMessage(e); return; }
/* 31 */      CompletableMessage completableMessage = (CompletableMessage)e.getDataContext().getData(CompletableMessage.Companion.getKey());
/* 32 */     ChatSession session = (ChatSession)e.getDataContext().getData(ChatSession.Companion.getCurrentSession());
/* 33 */     message.setRating(isSelected(e) ? ChatMessageRating.None : getReaction());
/* 34 */     message.getChat().setTimestamp(System.currentTimeMillis());
/* 35 */     AIAssistantChatEventLogger.Companion.logMessageReacted(e.getProject(), session, completableMessage); } @NotNull
/*    */   public abstract ChatMessageRating getReaction(); @NotNull
/*    */   public abstract Icon getReactionIcon(); @NotNull
/* 38 */   public ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.EDT; }
/*    */   
/*    */   @NotNull
/*    */   public abstract Icon getReactionIconSelected();
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\r\020\005\032\0070\006¢\006\002\b\007H\026J\r\020\b\032\0070\006¢\006\002\b\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Like;", "Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction;", "()V", "getReaction", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "getReactionIcon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "getReactionIconSelected", "intellij.ml.llm"})
/*    */   public static final class Like extends AIAssistantRateMessageAction { public Like() {
/* 44 */       super(null); } @NotNull
/* 45 */     public ChatMessageRating getReaction() { return ChatMessageRating.Like; } @NotNull
/* 46 */     public Icon getReactionIcon() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.Like, "Like"); return MLLlmIcons.Like; } @NotNull
/* 47 */     public Icon getReactionIconSelected() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.LikeSelected, "LikeSelected"); return MLLlmIcons.LikeSelected; }
/*    */      }
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\r\020\005\032\0070\006¢\006\002\b\007H\026J\r\020\b\032\0070\006¢\006\002\b\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction$Dislike;", "Lcom/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction;", "()V", "getReaction", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageRating;", "getReactionIcon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "getReactionIconSelected", "intellij.ml.llm"})
/* 50 */   public static final class Dislike extends AIAssistantRateMessageAction { public Dislike() { super(null); } @NotNull
/* 51 */     public ChatMessageRating getReaction() { return ChatMessageRating.Dislike; } @NotNull
/* 52 */     public Icon getReactionIcon() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.Dislike, "Dislike"); return MLLlmIcons.Dislike; } @NotNull
/* 53 */     public Icon getReactionIconSelected() { Intrinsics.checkNotNullExpressionValue(MLLlmIcons.DislikeSelected, "DislikeSelected"); return MLLlmIcons.DislikeSelected; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/actions/message/AIAssistantRateMessageAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */