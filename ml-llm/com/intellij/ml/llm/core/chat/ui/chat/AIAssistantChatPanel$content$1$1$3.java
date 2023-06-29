/*     */ package com.intellij.ml.llm.core.chat.ui.chat;
/*     */ 
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.AlignX;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Row;", "invoke"})
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function1<Row, Unit>
/*     */ {
/*     */   public final void invoke(@NotNull Row $this$row) {
/* 133 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.cell((JComponent)AIAssistantChatPanel.access$getShareFeedbackLabel$p(AIAssistantChatPanel.this))
/* 134 */       .align((Align)AlignX.RIGHT.INSTANCE)
/* 135 */       .customize(
/* 136 */         UnscaledGapsKt.UnscaledGaps(AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap(), AIAssistantInputGaps.INSTANCE.getVGap(), AIAssistantInputGaps.INSTANCE.getHGap()));
/*     */   }
/*     */   
/*     */   null() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$content$1$1$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */