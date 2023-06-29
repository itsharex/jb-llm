/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ide.HelpTooltip;
/*     */ import com.intellij.ml.llm.MLLlmIcons;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/openapi/actionSystem/Presentation;", "invoke"})
/*     */ final class AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1
/*     */   extends Lambda
/*     */   implements Function1<Presentation, Unit>
/*     */ {
/*     */   public static final AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1 INSTANCE = new AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1();
/*     */   
/*     */   public final void invoke(@NotNull Presentation $this$updateButtonPresentation) {
/* 192 */     Intrinsics.checkNotNullParameter($this$updateButtonPresentation, "$this$updateButtonPresentation"); $this$updateButtonPresentation.setIcon(MLLlmIcons.Chat.Send);
/* 193 */     HelpTooltip helpTooltip1 = new HelpTooltip(), helpTooltip2 = helpTooltip1; Key key = ActionButton.CUSTOM_HELP_TOOLTIP; Presentation presentation = $this$updateButtonPresentation; int $i$a$-apply-AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1$1 = 0;
/* 194 */     helpTooltip2.setTitle("Send");
/* 195 */     helpTooltip2.setShortcut("Enter");
/* 196 */     Unit unit = Unit.INSTANCE; presentation.putClientProperty(key, helpTooltip1);
/*     */   }
/*     */   
/*     */   AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$initialize$1$onFinishSendingMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */