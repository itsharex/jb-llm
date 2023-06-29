/*    */ package com.intellij.ml.llm.core.chat.ui.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.ml.llm.core.chat.ui.AIAssistantColors;
/*    */ import com.intellij.ui.dsl.builder.Align;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import javax.swing.JEditorPane;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Row;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<Row, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull Row $this$row) {
/* 67 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); Row.text$default($this$row, LLMBundle.message("label.chat.empty.text", new Object[0]), 0, null, 6, null)
/* 68 */       .align(Align.CENTER)
/* 69 */       .applyToComponent(new Function1<JEditorPane, Unit>() { public final void invoke(@NotNull JEditorPane $this$applyToComponent) {
/* 70 */             Intrinsics.checkNotNullParameter($this$applyToComponent, "$this$applyToComponent"); $this$applyToComponent.addMouseListener(AIAssistantChatPanel.access$getFocusMouseListener$p(AIAssistantChatPanel.this));
/* 71 */             $this$applyToComponent.setForeground(AIAssistantColors.INSTANCE.getEmptyStateForeground());
/*    */           } }
/*    */       );
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/chat/AIAssistantChatPanel$emptyStatePanel$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */