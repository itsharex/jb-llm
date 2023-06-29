/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import com.intellij.openapi.observable.properties.ObservableMutableProperty;
/*    */ import com.intellij.ui.dsl.builder.Align;
/*    */ import com.intellij.ui.dsl.builder.AlignX;
/*    */ import com.intellij.ui.dsl.builder.Cell;
/*    */ import com.intellij.ui.dsl.builder.ComboBoxKt;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import com.intellij.ui.dsl.builder.RowLayout;
/*    */ import com.intellij.ui.dsl.builder.TextAreaKt;
/*    */ import com.intellij.ui.dsl.builder.TextFieldKt;
/*    */ import com.intellij.util.ui.JBFont;
/*    */ import java.awt.Font;
/*    */ import java.awt.event.ActionEvent;
/*    */ import javax.swing.JLabel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*    */ final class LLMLabellingToolWindowPanel$mainPanel$1
/*    */   extends Lambda implements Function1<Panel, Unit> {
/*    */   public final void invoke(@NotNull Panel $this$panel) {
/* 28 */     Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, null.INSTANCE, 1, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     $this$panel.row("Model:", new Function1<Row, Unit>() {
/* 35 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/* 36 */             ComboBoxKt.bindItem(Row.comboBox$default($this$row, LLMLabellingToolWindowPanelKt.getLlmTypes(), null, 2, null), (ObservableMutableProperty)LLMLabellingToolWindowPanel.access$getModelTypeProperty$p(LLMLabellingToolWindowPanel.this)); }
/*    */         });
/* 38 */     $this$panel.row("Prompt:", new Function1<Row, Unit>() {
/* 39 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */             
/* 42 */             Cell.comment$default(TextFieldKt.bindText(TextAreaKt.rows($this$row.textArea(), 10), (ObservableMutableProperty)LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this)), "The prompt will be automatically wrapped with /* */ characters.", 0, null, 6, null)
/* 43 */               .align((Align)AlignX.FILL.INSTANCE); }
/* 44 */         }).layout(RowLayout.PARENT_GRID);
/*    */     
/* 46 */     $this$panel.row("", new Function1<Row, Unit>(LLMLabellingToolWindowPanel.this) {
/* 47 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.button("Submit", new Function1<ActionEvent, Unit>(LLMLabellingToolWindowPanel.this) { public final void invoke(@NotNull ActionEvent it) {
/* 48 */                     Intrinsics.checkNotNullParameter(it, "it"); String str1 = this.$service.getResponse(LLMLabellingToolWindowPanel.access$getProject$p(LLMLabellingToolWindowPanel.this), (String)LLMLabellingToolWindowPanel.access$getModelTypeProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this).get()); LLMLabellingToolWindowPanel lLMLabellingToolWindowPanel = LLMLabellingToolWindowPanel.this; String str2 = str1; int $i$a$-also-LLMLabellingToolWindowPanel$mainPanel$1$4$1$1 = 0;
/* 49 */                     LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(lLMLabellingToolWindowPanel).set(str2);
/*    */                   } }
/* 51 */               ).align(Align.FILL); }
/*    */         });
/* 53 */     $this$panel.row("Output:", new Function1<Row, Unit>() {
/* 54 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */             
/* 57 */             TextFieldKt.bindText(TextAreaKt.rows($this$row.textArea(), 10).align((Align)AlignX.FILL.INSTANCE), (ObservableMutableProperty)LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(LLMLabellingToolWindowPanel.this)); }
/*    */         });
/* 59 */     $this$panel.row("Comment:", new Function1<Row, Unit>() {
/* 60 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */             
/* 63 */             TextFieldKt.bindText(TextAreaKt.rows($this$row.textArea(), 5).align((Align)AlignX.FILL.INSTANCE), (ObservableMutableProperty)LLMLabellingToolWindowPanel.access$getCommentProperty$p(LLMLabellingToolWindowPanel.this)); }
/*    */         });
/* 65 */     $this$panel.row("", new Function1<Row, Unit>(LLMLabellingToolWindowPanel.this) { public final void invoke(@NotNull Row $this$row) {
/* 66 */             Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 76 */             Cell.comment$default($this$row.button("Save", new Function1<ActionEvent, Unit>(LLMLabellingToolWindowPanel.this) { public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); this.$service.saveResult(LLMLabellingToolWindowPanel.access$getProject$p(LLMLabellingToolWindowPanel.this), (String)LLMLabellingToolWindowPanel.access$getModelTypeProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getCommentProperty$p(LLMLabellingToolWindowPanel.this).get()); } }).align(Align.FILL), "Check 'results.csv' file in the root directory of your project.", 0, null, 6, null);
/*    */           } }
/*    */       );
/* 79 */     $this$panel.row("", new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/* 80 */             Intrinsics.checkNotNullParameter($this$row, "$this$row"); $this$row.button("Clear", new Function1<ActionEvent, Unit>() { public final void invoke(@NotNull ActionEvent it) {
/* 81 */                     Intrinsics.checkNotNullParameter(it, "it"); LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this).set("");
/* 82 */                     LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(LLMLabellingToolWindowPanel.this).set("");
/* 83 */                     LLMLabellingToolWindowPanel.access$getCommentProperty$p(LLMLabellingToolWindowPanel.this).set("");
/*    */                   } }
/*    */               );
/*    */           } }
/*    */       );
/*    */   }
/*    */   
/*    */   LLMLabellingToolWindowPanel$mainPanel$1(LLMLabellingService $service) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel$mainPanel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */