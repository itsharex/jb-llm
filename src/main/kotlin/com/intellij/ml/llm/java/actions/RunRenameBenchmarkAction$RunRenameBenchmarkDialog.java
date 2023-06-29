/*     */ package com.intellij.ml.llm.java.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptor;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.ui.DialogPanel;
/*     */ import com.intellij.openapi.ui.DialogWrapper;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.BuilderKt;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import com.intellij.ui.dsl.builder.TextFieldKt;
/*     */ import com.intellij.ui.dsl.builder.TextFieldWithBrowseButtonKt;
/*     */ import java.awt.Dimension;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.MutablePropertyReference0Impl;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.reflect.KMutableProperty0;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\b\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\016\032\0020\017H\024R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\032\020\013\032\0020\006X\016¢\006\016\n\000\032\004\b\f\020\b\"\004\b\r\020\n¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$RunRenameBenchmarkDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "datasetPath", "", "getDatasetPath", "()Ljava/lang/String;", "setDatasetPath", "(Ljava/lang/String;)V", "delay", "getDelay", "setDelay", "createCenterPanel", "Ljavax/swing/JComponent;", "intellij.ml.llm.java"})
/*     */ public final class RunRenameBenchmarkDialog
/*     */   extends DialogWrapper
/*     */ {
/*     */   @NotNull
/*     */   private String datasetPath;
/*     */   @NotNull
/*     */   private String delay;
/*     */   
/*     */   public RunRenameBenchmarkDialog(@NotNull Project project) {
/* 178 */     super(project);
/* 179 */     this.datasetPath = "";
/* 180 */     this.delay = "4000";
/*     */ 
/*     */     
/* 183 */     setTitle(LLMBundle.message("action.RunRenameVariableBenchmarkAction.text", new Object[0]));
/* 184 */     init();
/*     */   }
/*     */   @NotNull
/*     */   protected JComponent createCenterPanel() {
/* 188 */     DialogPanel dialogPanel1 = BuilderKt.panel(new RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     DialogPanel it = dialogPanel1; int $i$a$-also-RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$2 = 0;
/* 200 */     it.setPreferredSize(new Dimension(350, 100));
/*     */     return (JComponent)dialogPanel1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getDatasetPath() {
/*     */     return this.datasetPath;
/*     */   }
/*     */   
/*     */   public final void setDatasetPath(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.datasetPath = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getDelay() {
/*     */     return this.delay;
/*     */   }
/*     */   
/*     */   public final void setDelay(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.delay = <set-?>;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */   static final class RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1 extends Lambda implements Function1<Panel, Unit> {
/*     */     public final void invoke(@NotNull Panel $this$panel) {
/*     */       Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */       Intrinsics.checkNotNullExpressionValue(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.dataset", new Object[0]), "LLMBundle.getMessage(\"ac…BenchmarkAction.dataset\")");
/*     */       $this$panel.row(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.dataset", new Object[0]), new Function1<Row, Unit>() {
/*     */             public final void invoke(@NotNull Row $this$row) {
/*     */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */               FileChooserDescriptor fileDescriptor = FileChooserDescriptorFactory.createSingleFileNoJarsDescriptor().withFileFilter(RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1.INSTANCE::invoke$lambda$0);
/*     */               Intrinsics.checkNotNullExpressionValue(fileDescriptor, "fileDescriptor");
/*     */               TextFieldWithBrowseButtonKt.bindText(Row.textFieldWithBrowseButton$default($this$row, null, null, fileDescriptor, null, 11, null), (KMutableProperty0)new MutablePropertyReference0Impl(RunRenameBenchmarkAction.RunRenameBenchmarkDialog.this) {
/*     */                     @Nullable
/*     */                     public Object get() {
/*     */                       return ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).getDatasetPath();
/*     */                     }
/*     */                     
/*     */                     public void set(@Nullable Object value) {
/*     */                       ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).setDatasetPath((String)value);
/*     */                     }
/*     */                   }).align(Align.FILL);
/*     */             }
/*     */             
/*     */             private static final boolean invoke$lambda$0(Function1 $tmp0, Object p0) {
/*     */               Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*     */               return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */             }
/*     */             
/*     */             @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/Boolean;"})
/*     */             static final class RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1 extends Lambda implements Function1<VirtualFile, Boolean> {
/*     */               public static final RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1 INSTANCE = new RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1();
/*     */               
/*     */               RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1() {
/*     */                 super(1);
/*     */               }
/*     */               
/*     */               @NotNull
/*     */               public final Boolean invoke(VirtualFile it) {
/*     */                 return Boolean.valueOf(Intrinsics.areEqual(it.getExtension(), "csv"));
/*     */               }
/*     */             }
/*     */           });
/*     */       Intrinsics.checkNotNullExpressionValue(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.delay.ms", new Object[0]), "LLMBundle.getMessage(\"ac…enchmarkAction.delay.ms\")");
/*     */       $this$panel.row(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.delay.ms", new Object[0]), new Function1<Row, Unit>() {
/*     */             public final void invoke(@NotNull Row $this$row) {
/*     */               Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */               TextFieldKt.bindText(Row.intTextField$default($this$row, new IntRange(0, 2147483647), null, 2, null), (KMutableProperty0)new MutablePropertyReference0Impl(RunRenameBenchmarkAction.RunRenameBenchmarkDialog.this) {
/*     */                     @Nullable
/*     */                     public Object get() {
/*     */                       return ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).getDelay();
/*     */                     }
/*     */                     
/*     */                     public void set(@Nullable Object value) {
/*     */                       ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).setDelay((String)value);
/*     */                     }
/*     */                   });
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*     */     RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$RunRenameBenchmarkDialog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */