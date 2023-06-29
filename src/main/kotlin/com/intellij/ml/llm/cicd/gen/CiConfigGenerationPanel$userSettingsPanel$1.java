/*    */ package com.intellij.ml.llm.cicd.gen;
/*    */ 
/*    */ import com.intellij.ml.llm.cicd.gen.models.CiPlatform;
/*    */ import com.intellij.openapi.observable.properties.ObservableMutableProperty;
/*    */ import com.intellij.ui.components.JBTextArea;
/*    */ import com.intellij.ui.dsl.builder.Align;
/*    */ import com.intellij.ui.dsl.builder.AlignX;
/*    */ import com.intellij.ui.dsl.builder.Cell;
/*    */ import com.intellij.ui.dsl.builder.ComboBoxKt;
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import com.intellij.ui.dsl.builder.TextAreaKt;
/*    */ import com.intellij.ui.dsl.builder.TextFieldKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*    */ final class CiConfigGenerationPanel$userSettingsPanel$1
/*    */   extends Lambda
/*    */   implements Function1<Panel, Unit>
/*    */ {
/*    */   public final void invoke(@NotNull Panel $this$panel) {
/* 59 */     Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); $this$panel.row("CI/CD tool:", new Function1<Row, Unit>() {
/* 60 */           public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/* 61 */             ComboBoxKt.bindItem(Row.comboBox$default($this$row, CiPlatform.INSTANCE.getAll(), null, 2, null), (ObservableMutableProperty)CiConfigGenerationPanel.access$getToolchainProperty$p(CiConfigGenerationPanel.this)); }
/*    */         });
/* 63 */     $this$panel.row("Description:", new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/* 64 */             Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 72 */             Cell cell1 = TextFieldKt.bindText(Cell.comment$default(TextAreaKt.rows($this$row.textArea(), 15).align((Align)AlignX.FILL.INSTANCE), "Describe (in a natural language) what actions do you want to perform during CI/CD. For example, try something like 'build project and run tests' or 'publish docker image to docker hub'.", 0, null, 6, null), (ObservableMutableProperty)CiConfigGenerationPanel.access$getDescriptionProperty$p(CiConfigGenerationPanel.this));
/* 73 */             Cell $this$invoke_u24lambda_u240 = cell1; int $i$a$-apply-CiConfigGenerationPanel$userSettingsPanel$1$2$1 = 0;
/* 74 */             ((JBTextArea)$this$invoke_u24lambda_u240.getComponent()).setLineWrap(true);
/* 75 */             ((JBTextArea)$this$invoke_u24lambda_u240.getComponent()).setWrapStyleWord(true);
/*    */           } }
/*    */       );
/* 78 */     $this$panel.row("", new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/* 79 */             Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 88 */             Cell.comment$default($this$row.button("Preview", new Function1<ActionEvent, Unit>() { public final void invoke(@NotNull ActionEvent it) { Intrinsics.checkNotNullParameter(it, "it"); String result = CiConfigGenerationPanel.access$getService$p(CiConfigGenerationPanel.this).generateConfigUnderProgress(CiConfigGenerationPanel.this.getProject(), (String)CiConfigGenerationPanel.access$getToolchainProperty$p(CiConfigGenerationPanel.this).get(), (String)CiConfigGenerationPanel.access$getDescriptionProperty$p(CiConfigGenerationPanel.this).get()); CiConfigGenerationPanel.access$getModelOutputProperty$p(CiConfigGenerationPanel.this).set(result); } }
/* 89 */                 ).align(Align.FILL), "This will send a request to LLM model and show the editable preview of the generated CI/CD config.", 0, null, 6, null);
/*    */           } }
/*    */       );
/*    */   }
/*    */   
/*    */   CiConfigGenerationPanel$userSettingsPanel$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel$userSettingsPanel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */