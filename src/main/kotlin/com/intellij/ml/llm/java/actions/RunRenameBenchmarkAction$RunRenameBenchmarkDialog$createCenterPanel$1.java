/*     */ package com.intellij.ml.llm.java.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptor;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.ui.dsl.builder.Align;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import com.intellij.ui.dsl.builder.TextFieldKt;
/*     */ import com.intellij.ui.dsl.builder.TextFieldWithBrowseButtonKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */ final class RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1
/*     */   extends Lambda
/*     */   implements Function1<Panel, Unit>
/*     */ {
/*     */   public final void invoke(@NotNull Panel $this$panel) {
/* 189 */     Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Intrinsics.checkNotNullExpressionValue(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.dataset", new Object[0]), "LLMBundle.getMessage(\"ac…BenchmarkAction.dataset\")"); $this$panel.row(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.dataset", new Object[0]), new Function1<Row, Unit>() {
/* 190 */           private static final boolean invoke$lambda$0(Function1 $tmp0, Object p0) { Intrinsics.checkNotNullParameter($tmp0, "$tmp0"); return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } public final void invoke(@NotNull Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row"); FileChooserDescriptor fileDescriptor = FileChooserDescriptorFactory.createSingleFileNoJarsDescriptor()
/* 191 */               .withFileFilter(RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1.INSTANCE::invoke$lambda$0);
/* 192 */             Intrinsics.checkNotNullExpressionValue(fileDescriptor, "fileDescriptor");
/* 193 */             TextFieldWithBrowseButtonKt.bindText(Row.textFieldWithBrowseButton$default($this$row, null, null, fileDescriptor, null, 11, null), (KMutableProperty0)new MutablePropertyReference0Impl(RunRenameBenchmarkAction.RunRenameBenchmarkDialog.this) { @Nullable public Object get() { return ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).getDatasetPath(); } public void set(@Nullable Object value) { ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).setDatasetPath((String)value); } }
/* 194 */               ).align(Align.FILL); } @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/Boolean;"}) static final class RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1 extends Lambda implements Function1<VirtualFile, Boolean> {
/*     */             public static final RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1 INSTANCE = new RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1(); RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1() { super(1); } @NotNull public final Boolean invoke(VirtualFile it) { return Boolean.valueOf(Intrinsics.areEqual(it.getExtension(), "csv")); } }
/* 196 */         }); Intrinsics.checkNotNullExpressionValue(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.delay.ms", new Object[0]), "LLMBundle.getMessage(\"ac…enchmarkAction.delay.ms\")"); $this$panel.row(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.delay.ms", new Object[0]), new Function1<Row, Unit>() { public final void invoke(@NotNull Row $this$row) {
/* 197 */             Intrinsics.checkNotNullParameter($this$row, "$this$row"); TextFieldKt.bindText(Row.intTextField$default($this$row, new IntRange(0, 2147483647), null, 2, null), (KMutableProperty0)new MutablePropertyReference0Impl(RunRenameBenchmarkAction.RunRenameBenchmarkDialog.this) { @Nullable public Object get() { return ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).getDelay(); } public void set(@Nullable Object value) { ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).setDelay((String)value); }
/*     */                    }
/*     */               );
/*     */           } }
/*     */       );
/*     */   }
/*     */   
/*     */   RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1() {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */