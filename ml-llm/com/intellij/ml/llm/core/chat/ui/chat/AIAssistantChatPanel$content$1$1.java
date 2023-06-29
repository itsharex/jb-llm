/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.openapi.observable.properties.ObservableProperty;
/*     */ import com.intellij.openapi.observable.util.PropertyOperationUtil;
/*     */ import com.intellij.ui.JBColor;
/*     */ import com.intellij.ui.components.panels.Wrapper;
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.AlignX;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import com.intellij.ui.dsl.gridLayout.UnscaledGapsKt;
/*     */ import javax.swing.JComponent;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function1<Panel, Unit>
/*     */ {
/*     */   public final void invoke(@NotNull Panel $this$customizeSpacingConfiguration) {
/* 124 */     Intrinsics.checkNotNullParameter($this$customizeSpacingConfiguration, "$this$customizeSpacingConfiguration"); Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>() {
/* 125 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)AIAssistantChatPanel.access$getContentContainer$p(AIAssistantChatPanel.this)).align(Align.FILL); }
/* 126 */         }1, null).resizableRow();
/*     */     
/* 128 */     Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>() {
/* 129 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)new Wrapper(AIAssistantChatPanel.access$getEditModeLabel$p(AIAssistantChatPanel.this))).align((Align)AlignX.FILL.INSTANCE); }
/* 130 */         }1, null).visibleIf((ObservableProperty)AIAssistantChatPanel.access$isInEditMode$p(AIAssistantChatPanel.this));
/*     */     
/* 132 */     Panel.row$default($this$customizeSpacingConfiguration, null, new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/* 133 */             Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)AIAssistantChatPanel.access$getShareFeedbackLabel$p(AIAssistantChatPanel.this))
/* 134 */               .align((Align)AlignX.RIGHT.INSTANCE)
/* 135 */               .customize(
/* 136 */                 UnscaledGapsKt.UnscaledGaps(AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap(), AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap()));
/*     */           } }
/*     */         1, null);
/*     */     
/* 140 */     $this$customizeSpacingConfiguration.separator(JBColor.border()).visibleIf(PropertyOperationUtil.not((ObservableProperty)AIAssistantChatPanel.access$isInEditMode$p(AIAssistantChatPanel.this)));
/*     */     
/* 142 */     $this$customizeSpacingConfiguration.panel(new Function1<Panel, Unit>() {
/* 143 */           public final void invoke(@NotNull Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, new Function1<Row, Unit>() {
/* 144 */                   public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)AIAssistantChatPanel.access$getInput$p(AIAssistantChatPanel.this)).align((Align)AlignX.FILL.INSTANCE); }
/*     */                 }1, null); }
/* 146 */         }).customize(UnscaledGapsKt.UnscaledGaps(10));
/*     */   }
/*     */   
/*     */   null() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$content$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */