/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.icons.AllIcons;
/*    */ import com.intellij.util.ui.UIUtil;
/*    */ import java.awt.Color;
/*    */ import javax.swing.Icon;
/*    */ import javax.swing.JComponent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\b\003\bÆ\002\030\0002\0020\001:\001\rB\007\b\002¢\006\002\020\002J2\020\003\032\0020\0042\013\020\005\032\0070\006¢\006\002\b\0072\r\020\b\032\t\030\0010\006¢\006\002\b\0072\016\020\t\032\n\022\004\022\0020\013\030\0010\nJ2\020\f\032\0020\0042\013\020\005\032\0070\006¢\006\002\b\0072\r\020\b\032\t\030\0010\006¢\006\002\b\0072\016\020\t\032\n\022\004\022\0020\013\030\0010\n¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification;", "", "()V", "error", "Ljavax/swing/JComponent;", "labelText", "", "Lorg/jetbrains/annotations/Nls;", "linkLabel", "linkAction", "Lkotlin/Function0;", "", "warning", "Variant", "intellij.ml.llm"})
/*    */ public final class AIAssistantInputNotification
/*    */ {
/*    */   @NotNull
/*    */   public static final AIAssistantInputNotification INSTANCE = new AIAssistantInputNotification();
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\021\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\b\030\000 \0362\0020\001:\002\036\037B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\t\020\026\032\0020\tHÆ\003J1\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\030\032\0020\0072\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\035HÖ\001R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\022¨\006 "}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant;", "", "icon", "Ljavax/swing/Icon;", "textColor", "Ljava/awt/Color;", "defaultVisibility", "", "linkPosition", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant$LinkPosition;", "(Ljavax/swing/Icon;Ljava/awt/Color;ZLcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant$LinkPosition;)V", "getDefaultVisibility", "()Z", "getIcon", "()Ljavax/swing/Icon;", "getLinkPosition", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant$LinkPosition;", "getTextColor", "()Ljava/awt/Color;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "LinkPosition", "intellij.ml.llm"})
/*    */   public static final class Variant
/*    */   {
/*    */     public Variant(@NotNull Icon icon, @NotNull Color textColor, boolean defaultVisibility, @NotNull LinkPosition linkPosition) {
/* 68 */       this.icon = icon; this.textColor = textColor; this.defaultVisibility = defaultVisibility; this.linkPosition = linkPosition; } @NotNull public final Icon getIcon() { return this.icon; } @NotNull public final Color getTextColor() { return this.textColor; } public final boolean getDefaultVisibility() { return this.defaultVisibility; } @NotNull public final LinkPosition getLinkPosition() { return this.linkPosition; } @NotNull public final Icon component1() { return this.icon; } @NotNull public final Color component2() { return this.textColor; } public final boolean component3() { return this.defaultVisibility; } @NotNull public final LinkPosition component4() { return this.linkPosition; } @NotNull public final Variant copy(@NotNull Icon icon, @NotNull Color textColor, boolean defaultVisibility, @NotNull LinkPosition linkPosition) { Intrinsics.checkNotNullParameter(icon, "icon"); Intrinsics.checkNotNullParameter(textColor, "textColor"); Intrinsics.checkNotNullParameter(linkPosition, "linkPosition"); return new Variant(icon, textColor, defaultVisibility, linkPosition); } @NotNull public String toString() { return "Variant(icon=" + this.icon + ", textColor=" + this.textColor + ", defaultVisibility=" + this.defaultVisibility + ", linkPosition=" + this.linkPosition + ")"; } public int hashCode() { result = this.icon.hashCode(); result = result * 31 + this.textColor.hashCode(); if (this.defaultVisibility); result = result * 31 + 1; return result * 31 + this.linkPosition.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Variant)) return false;  Variant variant = (Variant)other; return !Intrinsics.areEqual(this.icon, variant.icon) ? false : (!Intrinsics.areEqual(this.textColor, variant.textColor) ? false : ((this.defaultVisibility != variant.defaultVisibility) ? false : (!(this.linkPosition != variant.linkPosition)))); } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant$Companion;", "", "()V", "Error", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant;", "getError", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant;", "Warning", "getWarning", "intellij.ml.llm"}) public static final class Companion
/*    */     {
/* 70 */       @NotNull public final AIAssistantInputNotification.Variant getWarning() { return AIAssistantInputNotification.Variant.Warning; } private Companion() {} @NotNull
/* 71 */       public final AIAssistantInputNotification.Variant getError() { return AIAssistantInputNotification.Variant.Error; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Icon icon; @NotNull private final Color textColor; private final boolean defaultVisibility; @NotNull private final LinkPosition linkPosition; @NotNull private static final Variant Warning = new Variant(AllIcons.General.Warning, UIUtil.getLabelForeground(), true, LinkPosition.Right); static { Intrinsics.checkNotNullExpressionValue(AllIcons.General.Warning, "Warning"); Intrinsics.checkNotNullExpressionValue(UIUtil.getLabelForeground(), "getLabelForeground()"); } @NotNull private static final Variant Error = new Variant(AllIcons.General.Error, UIUtil.getErrorForeground(), true, LinkPosition.Left); static { Intrinsics.checkNotNullExpressionValue(AllIcons.General.Error, "Error"); Intrinsics.checkNotNullExpressionValue(UIUtil.getErrorForeground(), "getErrorForeground()"); }
/*    */     
/*    */     @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant$LinkPosition;", "", "(Ljava/lang/String;I)V", "Left", "Right", "intellij.ml.llm"})
/* 74 */     public enum LinkPosition { Left, Right; }
/*    */   } @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant$Companion;", "", "()V", "Error", "Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant;", "getError", "()Lcom/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification$Variant;", "Warning", "getWarning", "intellij.ml.llm"}) public static final class Companion { private Companion() {} @NotNull public final AIAssistantInputNotification.Variant getWarning() { return AIAssistantInputNotification.Variant.Warning; }
/*    */     @NotNull
/*    */     public final AIAssistantInputNotification.Variant getError() { return AIAssistantInputNotification.Variant.Error; } }
/*    */   @NotNull
/* 79 */   public final JComponent warning(@NotNull String labelText, @Nullable String linkLabel, @Nullable Function0<Unit> linkAction) { Intrinsics.checkNotNullParameter(labelText, "labelText"); return AIAssistantInputNotificationKt.createAiAssistantNotification(Variant.Companion.getWarning(), labelText, linkLabel, linkAction); }
/*    */    @NotNull
/*    */   public final JComponent error(@NotNull String labelText, @Nullable String linkLabel, @Nullable Function0<Unit> linkAction) {
/* 82 */     Intrinsics.checkNotNullParameter(labelText, "labelText"); return AIAssistantInputNotificationKt.createAiAssistantNotification(Variant.Companion.getError(), labelText, linkLabel, linkAction);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantInputNotification.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */