/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.icons.ExpUiIcons;
/*     */ import com.intellij.ide.HelpTooltip;
/*     */ import com.intellij.ml.llm.MLLlmIcons;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionState;
/*     */ import com.intellij.ml.llm.core.chat.session.ChatSessionStateListener;
/*     */ import com.intellij.openapi.actionSystem.Presentation;
/*     */ import com.intellij.openapi.actionSystem.impl.ActionButton;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\003H\026J\b\020\007\032\0020\003H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$initialize$1", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionStateListener;", "onChatStateChanged", "", "chatState", "Lcom/intellij/ml/llm/core/chat/session/ChatSessionState;", "onFinishSendingMessage", "onStartSendingMessage", "intellij.ml.llm"})
/*     */ public final class AIAssistantChatPanel$initialize$1
/*     */   implements ChatSessionStateListener
/*     */ {
/*     */   public void onChatStateChanged(@NotNull ChatSessionState chatState) {
/* 175 */     Intrinsics.checkNotNullParameter(chatState, "chatState");
/*     */   }
/*     */   
/* 178 */   public void onStartSendingMessage() { AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this).isEditorViewOnly(true);
/* 179 */     AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this).setWaitingText();
/* 180 */     AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this).updateButtonPresentation(AIAssistantChatPanel$initialize$1$onStartSendingMessage$1.INSTANCE); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/actionSystem/Presentation;", "invoke"})
/* 181 */   static final class AIAssistantChatPanel$initialize$1$onStartSendingMessage$1 extends Lambda implements Function1<Presentation, Unit> { public final void invoke(@NotNull Presentation $this$updateButtonPresentation) { Intrinsics.checkNotNullParameter($this$updateButtonPresentation, "$this$updateButtonPresentation"); $this$updateButtonPresentation.setIcon(ExpUiIcons.Run.Stop);
/* 182 */       HelpTooltip helpTooltip1 = new HelpTooltip(), helpTooltip2 = helpTooltip1; Key key = ActionButton.CUSTOM_HELP_TOOLTIP; Presentation presentation = $this$updateButtonPresentation; int $i$a$-apply-AIAssistantChatPanel$initialize$1$onStartSendingMessage$1$1 = 0;
/* 183 */       helpTooltip2.setTitle("Stop");
/* 184 */       Unit unit = Unit.INSTANCE; presentation.putClientProperty(key, helpTooltip1); }
/*     */      public static final AIAssistantChatPanel$initialize$1$onStartSendingMessage$1 INSTANCE = new AIAssistantChatPanel$initialize$1$onStartSendingMessage$1(); AIAssistantChatPanel$initialize$1$onStartSendingMessage$1() {
/*     */       super(1);
/*     */     } }
/*     */   public void onFinishSendingMessage() {
/* 189 */     AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this).isEditorViewOnly(false);
/* 190 */     AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this).setDefaultPlaceholderText();
/* 191 */     AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this).updateButtonPresentation(AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1.INSTANCE); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/actionSystem/Presentation;", "invoke"})
/* 192 */   static final class AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1 extends Lambda implements Function1<Presentation, Unit> { public static final AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1 INSTANCE = new AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1(); public final void invoke(@NotNull Presentation $this$updateButtonPresentation) { Intrinsics.checkNotNullParameter($this$updateButtonPresentation, "$this$updateButtonPresentation"); $this$updateButtonPresentation.setIcon(MLLlmIcons.Chat.Send);
/* 193 */       HelpTooltip helpTooltip1 = new HelpTooltip(), helpTooltip2 = helpTooltip1; Key key = ActionButton.CUSTOM_HELP_TOOLTIP; Presentation presentation = $this$updateButtonPresentation; int $i$a$-apply-AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1$1 = 0;
/* 194 */       helpTooltip2.setTitle("Send");
/* 195 */       helpTooltip2.setShortcut("Enter");
/* 196 */       Unit unit = Unit.INSTANCE; presentation.putClientProperty(key, helpTooltip1); }
/*     */ 
/*     */     
/*     */     AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$initialize$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */