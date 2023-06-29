/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ 
/*    */ import com.intellij.ui.dsl.builder.Align;
/*    */ import com.intellij.ui.dsl.builder.Cell;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import java.awt.event.ActionEvent;
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
/* 66 */     Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 76 */     Cell.comment$default($this$row.button("Save", new Function1<ActionEvent, Unit>(LLMLabellingToolWindowPanel.this) { public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); this.$service.saveResult(LLMLabellingToolWindowPanel.access$getProject$p(LLMLabellingToolWindowPanel.this), (String)LLMLabellingToolWindowPanel.access$getModelTypeProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getModelPromptProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getModelOutputProperty$p(LLMLabellingToolWindowPanel.this).get(), (String)LLMLabellingToolWindowPanel.access$getCommentProperty$p(LLMLabellingToolWindowPanel.this).get()); } }).align(Align.FILL), "Check 'results.csv' file in the root directory of your project.", 0, null, 6, null);
/*    */   }
/*    */   
/*    */   null(LLMLabellingToolWindowPanel $receiver) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel$mainPanel$1$7.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */