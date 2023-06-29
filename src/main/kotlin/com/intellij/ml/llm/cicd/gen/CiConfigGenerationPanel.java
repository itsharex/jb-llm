/*     */ package com.intellij.ml.llm.cicd.gen;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.highlighter.EditorHighlighterFactory;
/*     */ import com.intellij.openapi.observable.properties.GraphProperty;
/*     */ import com.intellij.openapi.ui.DialogPanel;
/*     */ import com.intellij.ui.dsl.builder.Cell;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\b\020#\032\0020$H\026J\020\020%\032\0020&2\006\020'\032\0020\fH\002R\024\020\006\032\0020\0078BX\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000R\024\020\r\032\0020\0078BX\004¢\006\006\032\004\b\016\020\tR\026\020\017\032\0070\020¢\006\002\b\021¢\006\b\n\000\032\004\b\022\020\023R\016\020\024\032\0020\025X\004¢\006\002\n\000R\024\020\026\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\027\020\030R\016\020\031\032\0020\032X\004¢\006\002\n\000R\016\020\033\032\0020\034X\004¢\006\002\n\000R\021\020\035\032\0020\f8F¢\006\006\032\004\b\036\020\037R\024\020 \032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000R\024\020!\032\0020\0078BX\004¢\006\006\032\004\b\"\020\t¨\006("}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel;", "Lcom/intellij/util/ui/components/BorderLayoutPanel;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "configPreviewPanel", "Ljavax/swing/JPanel;", "getConfigPreviewPanel", "()Ljavax/swing/JPanel;", "descriptionProperty", "Lcom/intellij/openapi/observable/properties/GraphProperty;", "", "emptyModelOutputPanel", "getEmptyModelOutputPanel", "modelOutputDocument", "Lcom/intellij/openapi/editor/Document;", "Lorg/jetbrains/annotations/NotNull;", "getModelOutputDocument", "()Lcom/intellij/openapi/editor/Document;", "modelOutputEditor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "modelOutputProperty", "getProject", "()Lcom/intellij/openapi/project/Project;", "propertyGraph", "Lcom/intellij/openapi/observable/properties/PropertyGraph;", "service", "Lcom/intellij/ml/llm/cicd/gen/CICDGenService;", "toolchain", "getToolchain", "()Ljava/lang/String;", "toolchainProperty", "userSettingsPanel", "getUserSettingsPanel", "dispose", "", "getEditorHighlighter", "Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;", "cicdTool", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nCiConfigGenerationPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CiConfigGenerationPanel.kt\ncom/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,130:1\n29#2,3:131\n*S KotlinDebug\n*F\n+ 1 CiConfigGenerationPanel.kt\ncom/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel\n*L\n25#1:131,3\n*E\n"})
/*     */ public final class CiConfigGenerationPanel extends BorderLayoutPanel implements Disposable {
/*     */   public CiConfigGenerationPanel(@NotNull Project project) {
/*  24 */     this.project = project;
/*  25 */     ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0;
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
/* 131 */     Class<CICDGenService> serviceClass$iv = CICDGenService.class;
/* 132 */     Object object = $this$service$iv.getService(serviceClass$iv); if (object == null) throw new IllegalStateException((
/* 133 */           "Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString()); 
/*     */     this.service = (CICDGenService)object;
/*     */     this.propertyGraph = new PropertyGraph(null, false, 3, null);
/*     */     this.toolchainProperty = this.propertyGraph.property("GitHub Actions");
/*     */     this.descriptionProperty = this.propertyGraph.property("");
/*     */     GraphProperty<String> graphProperty1 = this.propertyGraph.property(""), graphProperty2 = graphProperty1;
/*     */     CiConfigGenerationPanel ciConfigGenerationPanel = this;
/*     */     int $i$a$-also-CiConfigGenerationPanel$modelOutputProperty$1 = 0;
/*     */     graphProperty2.afterChange(new CiConfigGenerationPanel$modelOutputProperty$1$1());
/*     */     ciConfigGenerationPanel.modelOutputProperty = graphProperty1;
/*     */     Intrinsics.checkNotNullExpressionValue(EditorFactory.getInstance().createDocument(""), "getInstance().createDocument(\"\")");
/*     */     this.modelOutputDocument = EditorFactory.getInstance().createDocument("");
/*     */     Editor editor1 = EditorFactory.getInstance().createEditor(this.modelOutputDocument), editor2 = editor1;
/*     */     ciConfigGenerationPanel = this;
/*     */     int $i$a$-apply-CiConfigGenerationPanel$modelOutputEditor$1 = 0;
/*     */     editor2.getSettings().setLineMarkerAreaShown(true);
/*     */     editor2.getSettings().setFoldingOutlineShown(false);
/*     */     editor2.getSettings().setAdditionalColumnsCount(0);
/*     */     editor2.getSettings().setAdditionalLinesCount(0);
/*     */     Intrinsics.checkNotNull(editor1, "null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorEx");
/*     */     ciConfigGenerationPanel.modelOutputEditor = (EditorEx)editor1;
/*     */     addToLeft(getUserSettingsPanel());
/*     */     addToRight(getConfigPreviewPanel());
/*     */     setPreferredSize((Dimension)new JBDimension(1000, 500));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final CICDGenService service;
/*     */   @NotNull
/*     */   private final PropertyGraph propertyGraph;
/*     */   @NotNull
/*     */   private final GraphProperty<String> toolchainProperty;
/*     */   @NotNull
/*     */   private final GraphProperty<String> descriptionProperty;
/*     */   @NotNull
/*     */   private final GraphProperty<String> modelOutputProperty;
/*     */   @NotNull
/*     */   private final Document modelOutputDocument;
/*     */   @NotNull
/*     */   private final EditorEx modelOutputEditor;
/*     */   
/*     */   @NotNull
/*     */   public final Project getProject() {
/*     */     return this.project;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "text", "", "invoke"})
/*     */   static final class CiConfigGenerationPanel$modelOutputProperty$1$1 extends Lambda implements Function1<String, Unit> {
/*     */     public final void invoke(@NotNull String text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       ActionsKt.runWriteAction(new Function0<Unit>(text) {
/*     */             public final void invoke() {
/*     */               CiConfigGenerationPanel.this.getModelOutputDocument().setText(this.$text);
/*     */               CiConfigGenerationPanel.this.modelOutputEditor.setHighlighter(CiConfigGenerationPanel.this.getEditorHighlighter((String)CiConfigGenerationPanel.this.toolchainProperty.get()));
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*     */     CiConfigGenerationPanel$modelOutputProperty$1$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Document getModelOutputDocument() {
/*     */     return this.modelOutputDocument;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getToolchain() {
/*     */     return (String)this.toolchainProperty.get();
/*     */   }
/*     */   
/*     */   private final JPanel getUserSettingsPanel() {
/*     */     DialogPanel dialogPanel1 = BuilderKt.panel(new CiConfigGenerationPanel$userSettingsPanel$1());
/*     */     DialogPanel $this$_get_userSettingsPanel__u24lambda_u242 = dialogPanel1;
/*     */     int $i$a$-apply-CiConfigGenerationPanel$userSettingsPanel$2 = 0;
/*     */     $this$_get_userSettingsPanel__u24lambda_u242.setPreferredSize((Dimension)new JBDimension(400, 500));
/*     */     $this$_get_userSettingsPanel__u24lambda_u242.setBorder((Border)new JBEmptyBorder(0, 0, 0, 10));
/*     */     return (JPanel)dialogPanel1;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */   static final class CiConfigGenerationPanel$userSettingsPanel$1 extends Lambda implements Function1<Panel, Unit> {
/*     */     public final void invoke(@NotNull Panel $this$panel) {
/*     */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */       $this$panel.row("CI/CD tool:", new Function1<Row, Unit>() {
/*     */             public final void invoke(@NotNull Row $this$row) {
/*     */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */               ComboBoxKt.bindItem(Row.comboBox$default($this$row, CiPlatform.INSTANCE.getAll(), null, 2, null), (ObservableMutableProperty)CiConfigGenerationPanel.this.toolchainProperty);
/*     */             }
/*     */           });
/*     */       $this$panel.row("Description:", new Function1<Row, Unit>() {
/*     */             public final void invoke(@NotNull Row $this$row) {
/*     */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */               Cell cell1 = TextFieldKt.bindText(Cell.comment$default(TextAreaKt.rows($this$row.textArea(), 15).align((Align)AlignX.FILL.INSTANCE), "Describe (in a natural language) what actions do you want to perform during CI/CD. For example, try something like 'build project and run tests' or 'publish docker image to docker hub'.", 0, null, 6, null), (ObservableMutableProperty)CiConfigGenerationPanel.this.descriptionProperty);
/*     */               Cell $this$invoke_u24lambda_u240 = cell1;
/*     */               int $i$a$-apply-CiConfigGenerationPanel$userSettingsPanel$1$2$1 = 0;
/*     */               ((JBTextArea)$this$invoke_u24lambda_u240.getComponent()).setLineWrap(true);
/*     */               ((JBTextArea)$this$invoke_u24lambda_u240.getComponent()).setWrapStyleWord(true);
/*     */             }
/*     */           });
/*     */       $this$panel.row("", new Function1<Row, Unit>() {
/*     */             public final void invoke(@NotNull Row $this$row) {
/*     */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */               Cell.comment$default($this$row.button("Preview", new Function1<ActionEvent, Unit>() {
/*     */                       public final void invoke(@NotNull ActionEvent it) {
/*     */                         Intrinsics.checkNotNullParameter(it, "it");
/*     */                         String result = CiConfigGenerationPanel.this.service.generateConfigUnderProgress(CiConfigGenerationPanel.this.getProject(), (String)CiConfigGenerationPanel.this.toolchainProperty.get(), (String)CiConfigGenerationPanel.this.descriptionProperty.get());
/*     */                         CiConfigGenerationPanel.this.modelOutputProperty.set(result);
/*     */                       }
/*     */                     }).align(Align.FILL), "This will send a request to LLM model and show the editable preview of the generated CI/CD config.", 0, null, 6, null);
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*     */     CiConfigGenerationPanel$userSettingsPanel$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private final JPanel getConfigPreviewPanel() {
/*     */     JPanel jPanel1 = new JPanel(new BorderLayout()), $this$_get_configPreviewPanel__u24lambda_u243 = jPanel1;
/*     */     int $i$a$-apply-CiConfigGenerationPanel$configPreviewPanel$1 = 0;
/*     */     $this$_get_configPreviewPanel__u24lambda_u243.add(this.modelOutputEditor.getComponent(), "Center");
/*     */     $this$_get_configPreviewPanel__u24lambda_u243.setPreferredSize((Dimension)new JBDimension(600, 500));
/*     */     $this$_get_configPreviewPanel__u24lambda_u243.setBorder((Border)new JBEmptyBorder(0, 10, 0, 0));
/*     */     return jPanel1;
/*     */   }
/*     */   
/*     */   private final JPanel getEmptyModelOutputPanel() {
/*     */     JPanel jPanel1 = new JPanel(new BorderLayout()), $this$_get_emptyModelOutputPanel__u24lambda_u245 = jPanel1;
/*     */     int $i$a$-apply-CiConfigGenerationPanel$emptyModelOutputPanel$1 = 0;
/*     */     JLabel jLabel1 = new JLabel("Nothing to show"), $this$_get_emptyModelOutputPanel__u24lambda_u245_u24lambda_u244 = jLabel1;
/*     */     int $i$a$-apply-CiConfigGenerationPanel$emptyModelOutputPanel$1$label$1 = 0;
/*     */     $this$_get_emptyModelOutputPanel__u24lambda_u245_u24lambda_u244.setHorizontalAlignment(0);
/*     */     JLabel label = jLabel1;
/*     */     $this$_get_emptyModelOutputPanel__u24lambda_u245.add(label, "Center");
/*     */     $this$_get_emptyModelOutputPanel__u24lambda_u245.setPreferredSize((Dimension)new JBDimension(500, 500));
/*     */     $this$_get_emptyModelOutputPanel__u24lambda_u245.setBorder((Border)new JBEmptyBorder(0, 10, 0, 0));
/*     */     return jPanel1;
/*     */   }
/*     */   
/*     */   private final EditorHighlighter getEditorHighlighter(String cicdTool) {
/*     */     EditorHighlighterFactory factory = EditorHighlighterFactory.getInstance();
/*     */     String str = cicdTool;
/*     */     switch (str.hashCode()) {
/*     */       case 1962990769:
/*     */         if (!str.equals("Space Automation"))
/*     */           break; 
/*     */         Intrinsics.checkNotNullExpressionValue(factory.createEditorHighlighter(this.project, FileTypeManager.getInstance().getFileTypeByExtension("kt")), "factory.createEditorHigh…ileTypeByExtension(\"kt\"))");
/*     */       case 1458796960:
/*     */         if (!str.equals("GitHub Actions"))
/*     */           break; 
/*     */         Intrinsics.checkNotNullExpressionValue(factory.createEditorHighlighter(this.project, (FileType)YAMLFileType.YML), "factory.createEditorHigh…roject, YAMLFileType.YML)");
/*     */       case -1018224727:
/*     */         if (str.equals("Travis CI"))
/*     */           Intrinsics.checkNotNullExpressionValue(factory.createEditorHighlighter(this.project, (FileType)YAMLFileType.YML), "factory.createEditorHigh…roject, YAMLFileType.YML)"); 
/*     */         break;
/*     */     } 
/*     */     throw new IllegalStateException(("Unknown CI/CD tool type: " + cicdTool).toString());
/*     */   }
/*     */   
/*     */   public void dispose() {
/*     */     EditorFactory.getInstance().releaseEditor((Editor)this.modelOutputEditor);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */