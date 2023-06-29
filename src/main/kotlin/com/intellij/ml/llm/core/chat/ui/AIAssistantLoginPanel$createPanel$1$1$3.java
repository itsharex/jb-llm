/*    */ package com.intellij.ml.llm.core.chat.ui;
/*    */ 
/*    */ import com.intellij.ui.dsl.builder.Align;
/*    */ import com.intellij.ui.dsl.builder.AlignY;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import com.intellij.ui.dsl.gridLayout.UnscaledGapsKt;
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
/* 67 */     Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.icon(this.$sugg.getIcon()).align((Align)AlignY.TOP.INSTANCE).customize(UnscaledGapsKt.UnscaledGaps$default(0, 0, 0, 6, 7, null));
/* 68 */     Row.text$default($this$row, this.$sugg.getText(), 0, null, 6, null).customize(UnscaledGapsKt.UnscaledGaps$default(0, 0, 8, 0, 11, null)).applyToComponent(null.INSTANCE);
/*    */   }
/*    */   
/*    */   null(LoginSuggestion $sugg) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/AIAssistantLoginPanel$createPanel$1$1$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */