/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ import com.intellij.ml.llm.core.chat.messages.ChatMessageAuthor;
/*    */ import com.intellij.ui.JBColor;
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\004J\020\020\006\032\004\030\0010\0042\006\020\007\032\0020\bJ\016\020\t\032\0020\0042\006\020\007\032\0020\bJ\006\020\n\032\0020\004J\026\020\013\032\0020\0042\006\020\007\032\0020\b2\006\020\f\032\0020\rJ\026\020\016\032\0020\0042\006\020\007\032\0020\b2\006\020\f\032\0020\r¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/AIAssistantColors;", "", "()V", "getEditorLanguageLabelForeground", "Ljava/awt/Color;", "getEmptyStateForeground", "getMessageBackground", "side", "Lcom/intellij/ml/llm/core/chat/messages/ChatMessageAuthor;", "getMessageBorder", "getMessageForeground", "getSnippetMoreLinesBackground", "hover", "", "getSnippetMoreLinesForeground", "intellij.ml.llm"})
/*    */ public final class AIAssistantColors {
/*    */   @NotNull
/*    */   public final Color getEmptyStateForeground() {
/* 12 */     Intrinsics.checkNotNullExpressionValue(NamedColorUtil.getInactiveTextColor(), "getInactiveTextColor()"); return NamedColorUtil.getInactiveTextColor();
/*    */   } @NotNull
/*    */   public static final AIAssistantColors INSTANCE = new AIAssistantColors(); @Nullable
/*    */   public final Color getMessageBackground(@NotNull ChatMessageAuthor side) {
/* 16 */     Intrinsics.checkNotNullParameter(side, "side"); if (side == ChatMessageAuthor.Assistant) return null;
/*    */     
/* 18 */     return (Color)JBColor.namedColor("HelpBrowser.UserMessage.background", (Color)new JBColor(14870252, 3884884));
/*    */   }
/*    */   @NotNull
/*    */   public final Color getMessageBorder(@NotNull ChatMessageAuthor side) {
/* 22 */     Intrinsics.checkNotNullParameter(side, "side"); switch (WhenMappings.$EnumSwitchMapping$0[side.ordinal()]) { case 1:
/* 23 */         Intrinsics.checkNotNullExpressionValue(JBColor.namedColor("HelpBrowser.HelpBrowserMessage.Snippet.border", (Color)new JBColor(14738667, 3884884)), "namedColor(\"HelpBrowser.…olor(0xE0E4EB, 0x3B4754))");
/* 24 */       case 2: Intrinsics.checkNotNullExpressionValue(JBColor.namedColor("HelpBrowser.UserMessage.Snippet.border", (Color)new JBColor(13949150, 4740710)), "namedColor(\"HelpBrowser.…olor(0xD4D8DE, 0x485666))"); }  throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Color getMessageForeground() {
/* 29 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.Label.foreground(), "foreground()"); return JBUI.CurrentTheme.Label.foreground();
/*    */   }
/*    */   @NotNull
/*    */   public final Color getEditorLanguageLabelForeground() {
/* 33 */     Intrinsics.checkNotNullExpressionValue(UIUtil.getLabelInfoForeground(), "getLabelInfoForeground()"); return UIUtil.getLabelInfoForeground();
/*    */   }
/*    */   @NotNull
/*    */   public final Color getSnippetMoreLinesForeground(@NotNull ChatMessageAuthor side, boolean hover) {
/* 37 */     Intrinsics.checkNotNullParameter(side, "side"); switch (WhenMappings.$EnumSwitchMapping$0[side.ordinal()]) { case 1:
/* 38 */         Intrinsics.checkNotNullExpressionValue(
/* 39 */             hover ? 
/* 40 */             JBColor.namedColor("HelpBrowser.HelpBrowserMessage.Snippet.MoreLines.hoverForeground", (Color)new JBColor(8421504, 9211020)) : 
/*    */ 
/*    */             
/* 43 */             JBColor.namedColor("HelpBrowser.HelpBrowserMessage.Snippet.MoreLines.foreground", (Color)new JBColor(8421504, 9211020)), "{\n        if (hover) {\n …C8C8C))\n        }\n      }");
/*    */       
/*    */       case 2:
/* 46 */         Intrinsics.checkNotNullExpressionValue(
/* 47 */             hover ? 
/* 48 */             JBColor.namedColor("HelpBrowser.UserMessage.Snippet.MoreLines.hoverForeground", (Color)new JBColor(8421504, 9211020)) : 
/*    */ 
/*    */             
/* 51 */             JBColor.namedColor("HelpBrowser.UserMessage.Snippet.MoreLines.foreground", (Color)new JBColor(8421504, 9211020)), "{\n        if (hover) {\n …C8C8C))\n        }\n      }"); }
/*    */     
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Color getSnippetMoreLinesBackground(@NotNull ChatMessageAuthor side, boolean hover) {
/* 58 */     Intrinsics.checkNotNullParameter(side, "side"); switch (WhenMappings.$EnumSwitchMapping$0[side.ordinal()]) { case 1:
/* 59 */         Intrinsics.checkNotNullExpressionValue(
/* 60 */             hover ? 
/* 61 */             JBColor.namedColor("HelpBrowser.HelpBrowserMessage.Snippet.MoreLines.hoverBackground", (Color)new JBColor(14342874, 2566442)) : 
/*    */ 
/*    */             
/* 64 */             JBColor.namedColor("HelpBrowser.HelpBrowserMessage.Snippet.MoreLines.background", (Color)new JBColor(15921906, 3948353)), "{\n        if (hover) {\n …C3F41))\n        }\n      }");
/*    */       
/*    */       case 2:
/* 67 */         Intrinsics.checkNotNullExpressionValue(
/* 68 */             hover ? 
/* 69 */             JBColor.namedColor("HelpBrowser.UserMessage.Snippet.MoreLines.hoverBackground", (Color)new JBColor(14342874, 2566442)) : 
/*    */ 
/*    */             
/* 72 */             JBColor.namedColor("AIAssistant.UserMessage.Snippet.MoreLines.background", (Color)new JBColor(15921906, 3948353)), "{\n        if (hover) {\n …C3F41))\n        }\n      }"); }
/*    */     
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */