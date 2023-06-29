/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ import com.intellij.openapi.util.text.HtmlBuilder;
/*    */ import com.intellij.openapi.util.text.HtmlChunk;
/*    */ import com.intellij.ui.HyperlinkLabel;
/*    */ import com.intellij.util.ui.components.BorderLayoutPanel;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JEditorPane;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.event.HyperlinkEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\b\003\032:\020\000\032\0020\0012\006\020\002\032\0020\0032\013\020\004\032\0070\005¢\006\002\b\0062\r\020\007\032\t\030\0010\005¢\006\002\b\0062\016\020\b\032\n\022\004\022\0020\n\030\0010\t\032<\020\013\032\0020\0012\006\020\002\032\0020\0032\013\020\004\032\0070\005¢\006\002\b\0062\r\020\007\032\t\030\0010\005¢\006\002\b\0062\016\020\b\032\n\022\004\022\0020\n\030\0010\tH\002\032<\020\f\032\0020\0012\006\020\002\032\0020\0032\013\020\004\032\0070\005¢\006\002\b\0062\r\020\007\032\t\030\0010\005¢\006\002\b\0062\016\020\b\032\n\022\004\022\0020\n\030\0010\tH\002¨\006\r"}, d2 = {"createAiAssistantNotification", "Ljavax/swing/JComponent;", "variant", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant;", "labelText", "", "Lorg/jetbrains/annotations/Nls;", "linkLabel", "linkAction", "Lkotlin/Function0;", "", "createLeftAlignedLinkAiAssistantNotification", "createRightAlignedLinkAiAssistantNotification", "intellij.ml.llm"})
/*    */ public final class AIAssistantInputNotificationKt {
/*    */   @NotNull
/*    */   public static final JComponent createAiAssistantNotification(@NotNull AIAssistantInputNotification.Variant variant, @NotNull String labelText, @Nullable String linkLabel, @Nullable Function0 linkAction) {
/* 21 */     Intrinsics.checkNotNullParameter(variant, "variant"); Intrinsics.checkNotNullParameter(labelText, "labelText"); switch (WhenMappings.$EnumSwitchMapping$0[variant.getLinkPosition().ordinal()]) { case 1: 
/*    */       case 2:
/* 23 */        }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ 
/*    */   
/*    */   private static final JComponent createLeftAlignedLinkAiAssistantNotification(AIAssistantInputNotification.Variant variant, String labelText, String linkLabel, Function0 linkAction) {
/* 28 */     HtmlBuilder htmlBuilder1 = new HtmlBuilder(), $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u240 = htmlBuilder1; int $i$a$-apply-AIAssistantInputNotificationKt$createLeftAlignedLinkAiAssistantNotification$html$1 = 0;
/* 29 */     $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u240.append(labelText + " ");
/* 30 */     if (linkLabel != null && linkAction != null && variant.getLinkPosition() == AIAssistantInputNotification.Variant.LinkPosition.Left) {
/* 31 */       $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u240.append((HtmlChunk)HtmlChunk.link("action", linkLabel));
/*    */     }
/* 33 */     Intrinsics.checkNotNullExpressionValue(htmlBuilder1.wrapWithHtmlBody(), "HtmlBuilder().apply {\n  … }\n  }.wrapWithHtmlBody()"); HtmlChunk.Element html = htmlBuilder1.wrapWithHtmlBody();
/*    */     
/* 35 */     BorderLayoutPanel borderLayoutPanel1 = new BorderLayoutPanel(), $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u244 = borderLayoutPanel1; int $i$a$-apply-AIAssistantInputNotificationKt$createLeftAlignedLinkAiAssistantNotification$1 = 0;
/* 36 */     $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u244.setOpaque(false);
/* 37 */     JLabel jLabel1 = new JLabel(variant.getIcon()), jLabel2 = jLabel1; BorderLayoutPanel borderLayoutPanel2 = $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u244; int $i$a$-apply-AIAssistantInputNotificationKt$createLeftAlignedLinkAiAssistantNotification$1$1 = 0;
/* 38 */     jLabel2.setBorder((Border)JBUI.Borders.emptyRight(5));
/* 39 */     jLabel2.setVerticalAlignment(1);
/* 40 */     borderLayoutPanel2.addToLeft(jLabel1);
/* 41 */     JEditorPane jEditorPane1 = TextPart.Companion.createBaseComponent(), jEditorPane2 = jEditorPane1; borderLayoutPanel2 = $this$createLeftAlignedLinkAiAssistantNotification_u24lambda_u244; int $i$a$-apply-AIAssistantInputNotificationKt$createLeftAlignedLinkAiAssistantNotification$1$2 = 0;
/* 42 */     jEditorPane2.setOpaque(false);
/* 43 */     jEditorPane2.setText(html.toString());
/* 44 */     jEditorPane2.setForeground(variant.getTextColor());
/* 45 */     if (linkAction != null) {
/* 46 */       jEditorPane2.addHyperlinkListener(linkAction::createLeftAlignedLinkAiAssistantNotification$lambda$4$lambda$3$lambda$2);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     borderLayoutPanel2.addToCenter(jEditorPane1);
/*    */     return (JComponent)borderLayoutPanel1; } private static final void createLeftAlignedLinkAiAssistantNotification$lambda$4$lambda$3$lambda$2(Function0 $linkAction, HyperlinkEvent it) {
/*    */     if (Intrinsics.areEqual(it.getEventType(), HyperlinkEvent.EventType.ACTIVATED))
/*    */       $linkAction.invoke(); 
/*    */   } private static final JComponent createRightAlignedLinkAiAssistantNotification(AIAssistantInputNotification.Variant variant, String labelText, String linkLabel, Function0<Unit> linkAction) {
/* 57 */     BorderLayoutPanel borderLayoutPanel1 = new BorderLayoutPanel(), $this$createRightAlignedLinkAiAssistantNotification_u24lambda_u247 = borderLayoutPanel1; int $i$a$-apply-AIAssistantInputNotificationKt$createRightAlignedLinkAiAssistantNotification$1 = 0;
/* 58 */     $this$createRightAlignedLinkAiAssistantNotification_u24lambda_u247.addToCenter(createLeftAlignedLinkAiAssistantNotification(variant, labelText, linkLabel, linkAction));
/* 59 */     if (linkLabel != null && linkAction != null) {
/* 60 */       HyperlinkLabel hyperlinkLabel1 = new HyperlinkLabel(linkLabel), hyperlinkLabel2 = hyperlinkLabel1; BorderLayoutPanel borderLayoutPanel = $this$createRightAlignedLinkAiAssistantNotification_u24lambda_u247; int $i$a$-apply-AIAssistantInputNotificationKt$createRightAlignedLinkAiAssistantNotification$1$1 = 0;
/* 61 */       hyperlinkLabel2.addHyperlinkListener(linkAction::createRightAlignedLinkAiAssistantNotification$lambda$7$lambda$6$lambda$5);
/* 62 */       borderLayoutPanel.addToRight((Component)hyperlinkLabel1);
/*    */     } 
/*    */     return (JComponent)borderLayoutPanel1;
/*    */   }
/*    */   
/*    */   private static final void createRightAlignedLinkAiAssistantNotification$lambda$7$lambda$6$lambda$5(Function0 $linkAction, HyperlinkEvent it) {
/*    */     $linkAction.invoke();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotificationKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */