/*    */ package com.intellij.ml.llm.cicd.labelling;
/*    */ import com.intellij.ui.dsl.builder.Row;
/*    */ import java.awt.event.ActionEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel;", "Lcom/intellij/openapi/ui/SimpleToolWindowPanel;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "commentProperty", "Lcom/intellij/openapi/observable/properties/GraphProperty;", "", "modelOutputProperty", "modelPromptProperty", "modelTypeProperty", "propertyGraph", "Lcom/intellij/openapi/observable/properties/PropertyGraph;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMLabellingToolWindowPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMLabellingToolWindowPanel.kt\ncom/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,91:1\n29#2,3:92\n*S KotlinDebug\n*F\n+ 1 LLMLabellingToolWindowPanel.kt\ncom/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel\n*L\n25#1:92,3\n*E\n"})
/*    */ public final class LLMLabellingToolWindowPanel extends SimpleToolWindowPanel {
/*    */   public LLMLabellingToolWindowPanel(@NotNull Project project) {
/* 15 */     super(true, true);
/*    */     this.project = project;
/* 17 */     this.propertyGraph = new PropertyGraph(null, false, 3, null);
/*    */     
/* 19 */     this.modelTypeProperty = this.propertyGraph.property(CollectionsKt.first(LLMLabellingToolWindowPanelKt.getLlmTypes()));
/* 20 */     this.modelPromptProperty = this.propertyGraph.property("");
/* 21 */     this.modelOutputProperty = this.propertyGraph.property("");
/* 22 */     this.commentProperty = this.propertyGraph.property("");
/*    */ 
/*    */     
/* 25 */     ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0;
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
/* 92 */     Class<LLMLabellingService> serviceClass$iv = LLMLabellingService.class;
/* 93 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 94 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*    */     LLMLabellingService service = (LLMLabellingService)object;
/*    */     DialogPanel mainPanel = BuilderKt.panel(new LLMLabellingToolWindowPanel$mainPanel$1(service));
/*    */     add((Component)mainPanel);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final PropertyGraph propertyGraph;
/*    */   @NotNull
/*    */   private final GraphProperty<String> modelTypeProperty;
/*    */   @NotNull
/*    */   private final GraphProperty<String> modelPromptProperty;
/*    */   @NotNull
/*    */   private final GraphProperty<String> modelOutputProperty;
/*    */   @NotNull
/*    */   private final GraphProperty<String> commentProperty;
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*    */   static final class LLMLabellingToolWindowPanel$mainPanel$1 extends Lambda implements Function1<Panel, Unit> {
/*    */     public final void invoke(@NotNull Panel $this$panel) {
/*    */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*    */       Panel.row$default($this$panel, null, null.INSTANCE, 1, null);
/*    */       $this$panel.row("Model:", new Function1<Row, Unit>() {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               ComboBoxKt.bindItem(Row.comboBox$default($this$row, LLMLabellingToolWindowPanelKt.getLlmTypes(), null, 2, null), (ObservableMutableProperty)LLMLabellingToolWindowPanel.this.modelTypeProperty);
/*    */             }
/*    */           });
/*    */       $this$panel.row("Prompt:", new Function1<Row, Unit>() {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               Cell.comment$default(TextFieldKt.bindText(TextAreaKt.rows($this$row.textArea(), 10), (ObservableMutableProperty)LLMLabellingToolWindowPanel.this.modelPromptProperty), "The prompt will be automatically wrapped with /* */ characters.", 0, null, 6, null).align((Align)AlignX.FILL.INSTANCE);
/*    */             }
/*    */           }).layout(RowLayout.PARENT_GRID);
/*    */       $this$panel.row("", new Function1<Row, Unit>(LLMLabellingToolWindowPanel.this) {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               $this$row.button("Submit", new Function1<ActionEvent, Unit>(LLMLabellingToolWindowPanel.this) {
/*    */                     public final void invoke(@NotNull ActionEvent it) {
/*    */                       Intrinsics.checkNotNullParameter(it, "it");
/*    */                       String str1 = this.$service.getResponse(LLMLabellingToolWindowPanel.this.project, (String)LLMLabellingToolWindowPanel.this.modelTypeProperty.get(), (String)LLMLabellingToolWindowPanel.this.modelPromptProperty.get());
/*    */                       LLMLabellingToolWindowPanel lLMLabellingToolWindowPanel = LLMLabellingToolWindowPanel.this;
/*    */                       String str2 = str1;
/*    */                       int $i$a$-also-LLMLabellingToolWindowPanel$mainPanel$1$4$1$1 = 0;
/*    */                       lLMLabellingToolWindowPanel.modelOutputProperty.set(str2);
/*    */                     }
/*    */                   }).align(Align.FILL);
/*    */             }
/*    */           });
/*    */       $this$panel.row("Output:", new Function1<Row, Unit>() {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               TextFieldKt.bindText(TextAreaKt.rows($this$row.textArea(), 10).align((Align)AlignX.FILL.INSTANCE), (ObservableMutableProperty)LLMLabellingToolWindowPanel.this.modelOutputProperty);
/*    */             }
/*    */           });
/*    */       $this$panel.row("Comment:", new Function1<Row, Unit>() {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               TextFieldKt.bindText(TextAreaKt.rows($this$row.textArea(), 5).align((Align)AlignX.FILL.INSTANCE), (ObservableMutableProperty)LLMLabellingToolWindowPanel.this.commentProperty);
/*    */             }
/*    */           });
/*    */       $this$panel.row("", new Function1<Row, Unit>(LLMLabellingToolWindowPanel.this) {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               Cell.comment$default($this$row.button("Save", new Function1<ActionEvent, Unit>(LLMLabellingToolWindowPanel.this) {
/*    */                       public final void invoke(@NotNull ActionEvent it) {
/*    */                         Intrinsics.checkNotNullParameter(it, "it");
/*    */                         this.$service.saveResult(LLMLabellingToolWindowPanel.this.project, (String)LLMLabellingToolWindowPanel.this.modelTypeProperty.get(), (String)LLMLabellingToolWindowPanel.this.modelPromptProperty.get(), (String)LLMLabellingToolWindowPanel.this.modelOutputProperty.get(), (String)LLMLabellingToolWindowPanel.this.commentProperty.get());
/*    */                       }
/*    */                     }).align(Align.FILL), "Check 'results.csv' file in the root directory of your project.", 0, null, 6, null);
/*    */             }
/*    */           });
/*    */       $this$panel.row("", new Function1<Row, Unit>() {
/*    */             public final void invoke(@NotNull Row $this$row) {
/*    */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */               $this$row.button("Clear", new Function1<ActionEvent, Unit>() {
/*    */                     public final void invoke(@NotNull ActionEvent it) {
/*    */                       Intrinsics.checkNotNullParameter(it, "it");
/*    */                       LLMLabellingToolWindowPanel.this.modelPromptProperty.set("");
/*    */                       LLMLabellingToolWindowPanel.this.modelOutputProperty.set("");
/*    */                       LLMLabellingToolWindowPanel.this.commentProperty.set("");
/*    */                     }
/*    */                   });
/*    */             }
/*    */           });
/*    */     }
/*    */     
/*    */     LLMLabellingToolWindowPanel$mainPanel$1(LLMLabellingService $service) {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/labelling/LLMLabellingToolWindowPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */