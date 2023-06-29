/*     */ package com.intellij.ml.llm.cicd.gen;
/*     */ 
/*     */ import com.intellij.ml.llm.cicd.gen.files.GithubActionsConfigFileGenerator;
/*     */ import com.intellij.ml.llm.cicd.gen.files.SpaceAutomationConfigFileGenerator;
/*     */ import com.intellij.ml.llm.cicd.gen.files.TravisConfigFileGenerator;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import javax.swing.Action;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000W\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000*\001\n\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\f\032\b\022\004\022\0020\0160\rH\024¢\006\002\020\017J\030\020\020\032\0020\0212\016\020\022\032\n\022\006\b\001\022\0020\0240\023H\024J\b\020\025\032\0020\026H\024J\b\020\027\032\0020\030H\024J\n\020\031\032\004\030\0010\032H\024J\036\020\033\032\0020\0302\006\020\034\032\0020\0322\006\020\035\032\0020\0362\006\020\002\032\0020\003R\016\020\005\032\0020\006X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\020\020\t\032\0020\nX\004¢\006\004\n\002\020\013¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/cicd/gen/CICDGenDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "centerPanel", "Lcom/intellij/ml/llm/cicd/gen/CiConfigGenerationPanel;", "getProject", "()Lcom/intellij/openapi/project/Project;", "saveAction", "com/intellij/ml/llm/cicd/gen/CICDGenDialog$saveAction$1", "Lcom/intellij/ml/llm/cicd/gen/CICDGenDialog$saveAction$1;", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "createButtonsPanel", "Ljavax/swing/JPanel;", "buttons", "", "Ljavax/swing/JButton;", "createCenterPanel", "Ljavax/swing/JComponent;", "dispose", "", "getHelpId", "", "saveFile", "toolchain", "document", "Lcom/intellij/openapi/editor/Document;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nCiConfigGenerationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CiConfigGenerationDialog.kt\ncom/intellij/ml/llm/cicd/gen/CICDGenDialog\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,91:1\n29#2,3:92\n29#2,3:95\n29#2,3:98\n37#3,2:101\n*S KotlinDebug\n*F\n+ 1 CiConfigGenerationDialog.kt\ncom/intellij/ml/llm/cicd/gen/CICDGenDialog\n*L\n44#1:92,3\n49#1:95,3\n54#1:98,3\n72#1:101,2\n*E\n"})
/*     */ public final class CICDGenDialog extends DialogWrapper {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final CiConfigGenerationPanel centerPanel;
/*     */   @NotNull
/*     */   private final CICDGenDialog$saveAction$1 saveAction;
/*     */   
/*  21 */   public CICDGenDialog(@NotNull Project project) { super(project); this.project = project;
/*  22 */     this.centerPanel = new CiConfigGenerationPanel(this.project);
/*     */     
/*  24 */     this.saveAction = new CICDGenDialog$saveAction$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     setTitle("Generate CI/CD Config");
/*  38 */     init(); } @NotNull public final Project getProject() { return this.project; }
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0060\001R\0020\002J\022\020\003\032\0020\0042\b\020\005\032\004\030\0010\006H\024¨\006\007"}, d2 = {"com/intellij/ml/llm/cicd/gen/CICDGenDialog$saveAction$1", "Lcom/intellij/openapi/ui/DialogWrapper$DialogWrapperAction;", "Lcom/intellij/openapi/ui/DialogWrapper;", "doAction", "", "e", "Ljava/awt/event/ActionEvent;", "intellij.ml.llm"}) public static final class CICDGenDialog$saveAction$1 extends DialogWrapper.DialogWrapperAction {
/*     */     CICDGenDialog$saveAction$1() { super($receiver, "Save"); }
/*     */     protected void doAction(@Nullable ActionEvent e) { try { CICDGenDialog.this.saveFile(CICDGenDialog.this.centerPanel.getToolchain(), CICDGenDialog.this.centerPanel.getModelOutputDocument(), CICDGenDialog.this.centerPanel.getProject()); } catch (com.intellij.ml.llm.cicd.gen.files.CiConfigFileGenerator.SaveError saveError) { CiConfigGenerationDialogKt.showSaveFileFailedNotification(CICDGenDialog.this.getProject(), saveError.getMessage()); }  CICDGenDialog.this.close(0); } }
/*  42 */   public final void saveFile(@NotNull String toolchain, @NotNull Document document, @NotNull Project project) { ComponentManager $this$service$iv; int $i$f$service; Class<SpaceAutomationConfigFileGenerator> clazz1; Class<GithubActionsConfigFileGenerator> clazz; Class<TravisConfigFileGenerator> serviceClass$iv; Object object; Intrinsics.checkNotNullParameter(toolchain, "toolchain"); Intrinsics.checkNotNullParameter(document, "document"); Intrinsics.checkNotNullParameter(project, "project"); String str = toolchain; switch (str.hashCode()) { case 1962990769: if (!str.equals("Space Automation")) {
/*     */           break;
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  54 */         $this$service$iv = (ComponentManager)project; $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  98 */         clazz1 = SpaceAutomationConfigFileGenerator.class;
/*  99 */         object = $this$service$iv.getService(clazz1); if (object == null) throw new IllegalStateException((
/* 100 */               "Cannot find service " + clazz1.getName() + " in " + $this$service$iv + " (classloader=" + clazz1.getClassLoader()).toString());  ((SpaceAutomationConfigFileGenerator)object).createAndOpenInEditor(toolchain, document); return;case 1458796960: if (!str.equals("GitHub Actions")) break;  $this$service$iv = (ComponentManager)project; $i$f$service = 0; clazz = GithubActionsConfigFileGenerator.class; object = $this$service$iv.getService(clazz); if (object == null) throw new IllegalStateException(("Cannot find service " + clazz.getName() + " in " + $this$service$iv + " (classloader=" + clazz.getClassLoader()).toString());  ((GithubActionsConfigFileGenerator)object).createAndOpenInEditor(toolchain, document); return;case -1018224727: if (!str.equals("Travis CI")) break;  $this$service$iv = (ComponentManager)project; $i$f$service = 0; serviceClass$iv = TravisConfigFileGenerator.class; object = $this$service$iv.getService(serviceClass$iv); if (object == null)
/* 101 */           throw new IllegalStateException(("Cannot find service " + serviceClass$iv.getName() + " in " + $this$service$iv + " (classloader=" + serviceClass$iv.getClassLoader()).toString());  ((TravisConfigFileGenerator)object).createAndOpenInEditor(toolchain, document); return; }  throw new IllegalStateException(); } @NotNull protected Action[] createActions() { Action[] arrayOfAction = new Action[2]; arrayOfAction[0] = getCancelAction(); arrayOfAction[1] = (Action)this.saveAction; Collection $this$toTypedArray$iv = CollectionsKt.listOf((Object[])arrayOfAction); int $i$f$toTypedArray = 0; Collection thisCollection$iv = $this$toTypedArray$iv;
/* 102 */     return (Action[])thisCollection$iv.toArray((Object[])new Action[0]); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected JComponent createCenterPanel() {
/*     */     return (JComponent)this.centerPanel;
/*     */   }
/*     */   
/*     */   protected void dispose() {
/*     */     this.centerPanel.dispose();
/*     */     super.dispose();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected String getHelpId() {
/*     */     return null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected JPanel createButtonsPanel(@NotNull List buttons) {
/*     */     Intrinsics.checkNotNullParameter(buttons, "buttons");
/*     */     Intrinsics.checkNotNullExpressionValue(super.createButtonsPanel(buttons), "super.createButtonsPanel(buttons)");
/*     */     return super.createButtonsPanel(buttons);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/cicd/gen/CICDGenDialog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */