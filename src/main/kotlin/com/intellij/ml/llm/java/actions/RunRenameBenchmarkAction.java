/*     */ package com.intellij.ml.llm.java.actions;
/*     */ import com.intellij.execution.impl.ConsoleViewImpl;
/*     */ import com.intellij.execution.impl.ConsoleViewUtil;
/*     */ import com.intellij.execution.ui.ConsoleView;
/*     */ import com.intellij.execution.ui.RunContentDescriptor;
/*     */ import com.intellij.ml.llm.LLMBundle;
/*     */ import com.intellij.ml.llm.refactorings.LlmNameProviderKt;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptor;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.ui.DialogPanel;
/*     */ import com.intellij.openapi.vfs.LocalFileSystem;
/*     */ import com.intellij.openapi.vfs.VfsUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiNamedElement;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import java.net.http.HttpRequest;
/*     */ import java.net.http.HttpResponse;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.JPanel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.MutablePropertyReference0Impl;
/*     */ import kotlin.reflect.KMutableProperty0;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020 \n\002\020\006\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\002\n\002\030\002\n\002\b\005\b&\030\0002\0020\001:\002%&B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\002J\032\020\013\032\004\030\0010\f2\006\020\r\032\0020\0162\006\020\017\032\0020\020H&J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\020H&J \020\024\032\0020\0202\006\020\025\032\0020\b2\006\020\026\032\0020\0202\006\020\027\032\0020\030H\002J:\020\031\032\b\022\004\022\0020\0330\0322\006\020\025\032\0020\b2\006\020\026\032\0020\0202\f\020\034\032\b\022\004\022\0020\0350\0322\006\020\027\032\0020\0302\006\020\036\032\0020\037J\016\020 \032\0020\0042\006\020\005\032\0020\006J\024\020!\032\0020\004*\0020\"2\006\020#\032\0020\020H\002J\024\020$\032\0020\004*\0020\"2\006\020#\032\0020\020H\002¨\006'"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "createConsole", "Lcom/intellij/execution/impl/ConsoleViewImpl;", "project", "Lcom/intellij/openapi/project/Project;", "findTargetElement", "Lcom/intellij/psi/PsiNamedElement;", "psiFile", "Lcom/intellij/psi/PsiFile;", "context", "", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "getName", "loadFile", "console", "fileUrl", "dataset", "Lcom/intellij/openapi/vfs/VirtualFile;", "run", "", "", "rows", "Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;", "delay", "", "update", "logError", "Lcom/intellij/execution/ui/ConsoleView;", "message", "logMessage", "Row", "RunRenameBenchmarkDialog", "intellij.ml.llm.java"})
/*     */ @SourceDebugExtension({"SMAP\nRunRenameBenchmarkAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunRenameBenchmarkAction.kt\ncom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,204:1\n37#2,2:205\n*S KotlinDebug\n*F\n+ 1 RunRenameBenchmarkAction.kt\ncom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction\n*L\n172#1:205,2\n*E\n"})
/*     */ public abstract class RunRenameBenchmarkAction extends AnAction {
/*     */   public void actionPerformed(@NotNull AnActionEvent e) {
/*     */     Project project;
/*  51 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }
/*  52 */      RunRenameBenchmarkDialog dialog = new RunRenameBenchmarkDialog(project);
/*  53 */     dialog.show();
/*  54 */     StringsKt.toLongOrNull(dialog.getDelay()); long delay = (StringsKt.toLongOrNull(dialog.getDelay()) != null) ? StringsKt.toLongOrNull(dialog.getDelay()).longValue() : 4000L;
/*  55 */     String str = getName(); RunRenameBenchmarkAction$actionPerformed$task$1 task = new RunRenameBenchmarkAction$actionPerformed$task$1(dialog, this, delay, str);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     ProgressManager.getInstance().runProcessWithProgressAsynchronously(task, (ProgressIndicator)new BackgroundableProcessIndicator(task));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.java"})
/*     */   @SourceDebugExtension({"SMAP\nRunRenameBenchmarkAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunRenameBenchmarkAction.kt\ncom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,204:1\n970#2:205\n999#2,3:206\n1002#2,3:216\n361#3,7:209\n125#4:219\n152#4,3:220\n*S KotlinDebug\n*F\n+ 1 RunRenameBenchmarkAction.kt\ncom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1\n*L\n68#1:205\n68#1:206,3\n68#1:216,3\n68#1:209,7\n69#1:219\n69#1:220,3\n*E\n"})
/*     */   public static final class RunRenameBenchmarkAction$actionPerformed$task$1
/*     */     extends Task.Backgroundable
/*     */   {
/*     */     RunRenameBenchmarkAction$actionPerformed$task$1(RunRenameBenchmarkAction.RunRenameBenchmarkDialog $dialog, RunRenameBenchmarkAction $receiver, long $delay, String $super_call_param$1) {
/*     */       super($project, $super_call_param$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void run(@NotNull ProgressIndicator indicator) {
/*     */       VirtualFile dataset;
/*     */       Intrinsics.checkNotNullParameter(indicator, "indicator");
/*     */       if (LocalFileSystem.getInstance().findFileByPath(this.$dialog.getDatasetPath()) == null) {
/*     */         LocalFileSystem.getInstance().findFileByPath(this.$dialog.getDatasetPath());
/*     */         throw new FileNotFoundException("dataset not found");
/*     */       } 
/*     */       Intrinsics.checkNotNullExpressionValue(VfsUtil.loadText(dataset), "loadText(dataset)");
/*     */       String datasetText = VfsUtil.loadText(dataset);
/*     */       ConsoleViewImpl console = (ConsoleViewImpl)ActionsKt.invokeAndWaitIfNeeded$default(null, new RunRenameBenchmarkAction$actionPerformed$task$1$run$console$1(this.$project), 1, null);
/*     */       RunRenameBenchmarkAction.this.logMessage((ConsoleView)console, "Start benchmark " + this.$dialog.getDatasetPath());
/*     */       String[] arrayOfString = new String[1];
/*     */       Intrinsics.checkNotNullExpressionValue(System.lineSeparator(), "lineSeparator()");
/*     */       arrayOfString[0] = System.lineSeparator();
/*     */       Sequence sequence1 = SequencesKt.map(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(StringsKt.split$default(datasetText, arrayOfString, false, 0, 6, null)), RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1.INSTANCE), RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2.INSTANCE), RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3.INSTANCE);
/*     */       int $i$f$groupBy = 0;
/* 205 */       Sequence sequence2 = sequence1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 206 */       for (Object element$iv$iv : sequence2) {
/* 207 */         RunRenameBenchmarkAction.Row row = (RunRenameBenchmarkAction.Row)element$iv$iv; int $i$a$-groupBy-RunRenameBenchmarkAction$actionPerformed$task$1$run$score$4 = 0; Object key$iv$iv = row.getUrl();
/* 208 */         Map<Object, Object> $this$getOrPut$iv$iv$iv = destination$iv$iv; int $i$f$getOrPut = 0;
/* 209 */         Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 218 */       Map<Object, Object> map1 = destination$iv$iv; RunRenameBenchmarkAction runRenameBenchmarkAction = RunRenameBenchmarkAction.this; long l = this.$delay; int $i$f$map = 0;
/* 219 */       Map<Object, Object> map2 = map1; Collection<List<Double>> collection = new ArrayList(map1.size()); int $i$f$mapTo = 0;
/* 220 */       for (Map.Entry<Object, Object> item$iv$iv : map2.entrySet()) {
/* 221 */         Map.Entry<Object, Object> entry1 = item$iv$iv; Collection<List<Double>> collection1 = collection; int $i$a$-map-RunRenameBenchmarkAction$actionPerformed$task$1$run$score$5 = 0; String url = (String)entry1.getKey(); List<RunRenameBenchmarkAction.Row> rows = (List)entry1.getValue(); collection1.add(runRenameBenchmarkAction.run(console, url, rows, dataset, l));
/* 222 */       }  double score = CollectionsKt.averageOfDouble(CollectionsKt.flatten(collection));
/*     */       String str1 = "Final Score: %.4f";
/*     */       Object[] arrayOfObject = new Object[1];
/*     */       arrayOfObject[0] = Double.valueOf(score);
/*     */       arrayOfObject = arrayOfObject;
/*     */       Intrinsics.checkNotNullExpressionValue(String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(this, *args)");
/*     */       RunRenameBenchmarkAction.this.logMessage((ConsoleView)console, String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)));
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/execution/impl/ConsoleViewImpl;", "invoke"})
/*     */     static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$console$1 extends Lambda implements Function0<ConsoleViewImpl> {
/*     */       RunRenameBenchmarkAction$actionPerformed$task$1$run$console$1(Project $project) {
/*     */         super(0);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final ConsoleViewImpl invoke() {
/*     */         return RunRenameBenchmarkAction.this.createConsole(this.$project);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*     */     static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1 extends Lambda implements Function1<String, Boolean> {
/*     */       public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1();
/*     */       
/*     */       RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1() {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Boolean invoke(@NotNull String it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         return Boolean.valueOf((it.length() > 0));
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "it", "invoke"})
/*     */     static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2 extends Lambda implements Function1<String, List<? extends String>> {
/*     */       public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2();
/*     */       
/*     */       RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2() {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final List<String> invoke(@NotNull String it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         String[] arrayOfString = new String[1];
/*     */         arrayOfString[0] = ";";
/*     */         return CollectionsKt.take(StringsKt.split$default(it, arrayOfString, false, 0, 6, null), 3);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;", "<name for destructuring parameter 0>", "", "", "invoke"})
/*     */     static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3 extends Lambda implements Function1<List<? extends String>, RunRenameBenchmarkAction.Row> {
/*     */       public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3();
/*     */       
/*     */       RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3() {
/*     */         super(1);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final RunRenameBenchmarkAction.Row invoke(@NotNull List<String> param1List) {
/*     */         Intrinsics.checkNotNullParameter(param1List, "<name for destructuring parameter 0>");
/*     */         String context = param1List.get(0), names = param1List.get(1), url = param1List.get(2), arrayOfString[] = new String[1];
/*     */         arrayOfString[0] = ",";
/*     */         return new RunRenameBenchmarkAction.Row(context, StringsKt.split$default(names, arrayOfString, false, 0, 6, null), url);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/*     */     return ActionUpdateThread.BGT;
/*     */   }
/*     */   
/*     */   public final void update(@NotNull AnActionEvent e) {
/*     */     Intrinsics.checkNotNullParameter(e, "e");
/*     */     e.getPresentation().setEnabledAndVisible(Registry.is("llm.is.internal"));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005\022\006\020\006\032\0020\003¢\006\002\020\007J\t\020\r\032\0020\003HÆ\003J\017\020\016\032\b\022\004\022\0020\0030\005HÆ\003J\t\020\017\032\0020\003HÆ\003J-\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\b\b\002\020\006\032\0020\003HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;", "", "context", "", "names", "", "url", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getNames", "()Ljava/util/List;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intellij.ml.llm.java"})
/*     */   public static final class Row {
/*     */     @NotNull
/*     */     private final String context;
/*     */     @NotNull
/*     */     private final List<String> names;
/*     */     @NotNull
/*     */     private final String url;
/*     */     
/*     */     public Row(@NotNull String context, @NotNull List<String> names, @NotNull String url) {
/*     */       this.context = context;
/*     */       this.names = names;
/*     */       this.url = url;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getContext() {
/*     */       return this.context;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> getNames() {
/*     */       return this.names;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getUrl() {
/*     */       return this.url;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.context;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> component2() {
/*     */       return this.names;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component3() {
/*     */       return this.url;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Row copy(@NotNull String context, @NotNull List<String> names, @NotNull String url) {
/*     */       Intrinsics.checkNotNullParameter(context, "context");
/*     */       Intrinsics.checkNotNullParameter(names, "names");
/*     */       Intrinsics.checkNotNullParameter(url, "url");
/*     */       return new Row(context, names, url);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Row(context=" + this.context + ", names=" + this.names + ", url=" + this.url + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.context.hashCode();
/*     */       result = result * 31 + this.names.hashCode();
/*     */       return result * 31 + this.url.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Row))
/*     */         return false; 
/*     */       Row row = (Row)other;
/*     */       return !Intrinsics.areEqual(this.context, row.context) ? false : (!Intrinsics.areEqual(this.names, row.names) ? false : (!!Intrinsics.areEqual(this.url, row.url)));
/*     */     }
/*     */   }
/*     */   
/*     */   private final ConsoleViewImpl createConsole(Project project) {
/*     */     RunRenameBenchmarkAction$createConsole$console$1 console = new RunRenameBenchmarkAction$createConsole$console$1(project);
/*     */     JPanel jPanel1 = new JPanel(new BorderLayout()), it = jPanel1;
/*     */     int $i$a$-also-RunRenameBenchmarkAction$createConsole$panel$1 = 0;
/*     */     it.add(console.getComponent());
/*     */     JPanel panel = jPanel1;
/*     */     String str = LLMBundle.message("action.RunRenameVariableBenchmarkAction.text", new Object[0]);
/*     */     RunContentDescriptor descriptor = new RunRenameBenchmarkAction$createConsole$descriptor$1(console, panel, str);
/*     */     RunContentManager.getInstance(project).showRunContent(DefaultRunExecutor.getRunExecutorInstance(), descriptor);
/*     */     return console;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$createConsole$console$1", "Lcom/intellij/execution/impl/ConsoleViewImpl;", "doCreateConsoleEditor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "intellij.ml.llm.java"})
/*     */   public static final class RunRenameBenchmarkAction$createConsole$console$1 extends ConsoleViewImpl {
/*     */     RunRenameBenchmarkAction$createConsole$console$1(Project $project) {
/*     */       super($project, true);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     protected EditorEx doCreateConsoleEditor() {
/*     */       Intrinsics.checkNotNullExpressionValue(ConsoleViewUtil.setupConsoleEditor(this.$project, false, false), "setupConsoleEditor(project, false, false)");
/*     */       return ConsoleViewUtil.setupConsoleEditor(this.$project, false, false);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$createConsole$descriptor$1", "Lcom/intellij/execution/ui/RunContentDescriptor;", "isContentReuseProhibited", "", "intellij.ml.llm.java"})
/*     */   public static final class RunRenameBenchmarkAction$createConsole$descriptor$1 extends RunContentDescriptor {
/*     */     RunRenameBenchmarkAction$createConsole$descriptor$1(RunRenameBenchmarkAction$createConsole$console$1 $console, JPanel $panel, String $super_call_param$1) {
/*     */       super((ExecutionConsole)$console, null, $panel, $super_call_param$1, null);
/*     */     }
/*     */     
/*     */     public boolean isContentReuseProhibited() {
/*     */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void logMessage(ConsoleView $this$logMessage, String message) {
/*     */     ActionsKt.invokeLater$default(null, new RunRenameBenchmarkAction$logMessage$1($this$logMessage, message), 1, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class RunRenameBenchmarkAction$logMessage$1 extends Lambda implements Function0<Unit> {
/*     */     RunRenameBenchmarkAction$logMessage$1(ConsoleView $receiver, String $message) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final void invoke() {
/*     */       this.$this_logMessage.print(this.$message + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void logError(ConsoleView $this$logError, String message) {
/*     */     ActionsKt.invokeLater$default(null, new RunRenameBenchmarkAction$logError$1($this$logError, message), 1, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class RunRenameBenchmarkAction$logError$1 extends Lambda implements Function0<Unit> {
/*     */     RunRenameBenchmarkAction$logError$1(ConsoleView $receiver, String $message) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final void invoke() {
/*     */       this.$this_logError.print(this.$message + "\n", ConsoleViewContentType.ERROR_OUTPUT);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Double> run(@NotNull ConsoleViewImpl console, @NotNull String fileUrl, @NotNull List rows, @NotNull VirtualFile dataset, long delay) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'console'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'fileUrl'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'rows'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'dataset'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload_1
/*     */     //   26: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   29: dup
/*     */     //   30: ldc 'console.project'
/*     */     //   32: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   35: astore #7
/*     */     //   37: aload_0
/*     */     //   38: aload_1
/*     */     //   39: aload_2
/*     */     //   40: aload #4
/*     */     //   42: invokespecial loadFile : (Lcom/intellij/execution/impl/ConsoleViewImpl;Ljava/lang/String;Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/String;
/*     */     //   45: astore #8
/*     */     //   47: aload #7
/*     */     //   49: aload #8
/*     */     //   51: <illegal opcode> compute : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;)Lcom/intellij/openapi/util/ThrowableComputable;
/*     */     //   56: invokestatic compute : (Lcom/intellij/openapi/util/ThrowableComputable;)Ljava/lang/Object;
/*     */     //   59: checkcast com/intellij/psi/PsiFile
/*     */     //   62: astore #9
/*     */     //   64: new java/util/ArrayList
/*     */     //   67: dup
/*     */     //   68: invokespecial <init> : ()V
/*     */     //   71: checkcast java/util/List
/*     */     //   74: astore #10
/*     */     //   76: aload_3
/*     */     //   77: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   82: astore #11
/*     */     //   84: aload #11
/*     */     //   86: invokeinterface hasNext : ()Z
/*     */     //   91: ifeq -> 393
/*     */     //   94: aload #11
/*     */     //   96: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   101: checkcast com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row
/*     */     //   104: astore #12
/*     */     //   106: aload_0
/*     */     //   107: aload #9
/*     */     //   109: ldc_w 'psiFile'
/*     */     //   112: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   115: aload #9
/*     */     //   117: aload #12
/*     */     //   119: invokevirtual getContext : ()Ljava/lang/String;
/*     */     //   122: invokevirtual findTargetElement : (Lcom/intellij/psi/PsiFile;Ljava/lang/String;)Lcom/intellij/psi/PsiNamedElement;
/*     */     //   125: dup
/*     */     //   126: ifnonnull -> 133
/*     */     //   129: pop
/*     */     //   130: goto -> 84
/*     */     //   133: astore #13
/*     */     //   135: aload #13
/*     */     //   137: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   142: astore #14
/*     */     //   144: aload_2
/*     */     //   145: ldc_w '/'
/*     */     //   148: aconst_null
/*     */     //   149: iconst_2
/*     */     //   150: aconst_null
/*     */     //   151: invokestatic substringAfterLast$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   154: astore #15
/*     */     //   156: new com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$run$suggestVariableNames$1
/*     */     //   159: dup
/*     */     //   160: aload #7
/*     */     //   162: aload #13
/*     */     //   164: aconst_null
/*     */     //   165: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiNamedElement;Lkotlin/coroutines/Continuation;)V
/*     */     //   168: checkcast kotlin/jvm/functions/Function2
/*     */     //   171: invokestatic runBlockingCancellable : (Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
/*     */     //   174: checkcast java/util/List
/*     */     //   177: astore #16
/*     */     //   179: aload #16
/*     */     //   181: invokeinterface isEmpty : ()Z
/*     */     //   186: ifeq -> 265
/*     */     //   189: aload_0
/*     */     //   190: aload_1
/*     */     //   191: checkcast com/intellij/execution/ui/ConsoleView
/*     */     //   194: aload #14
/*     */     //   196: aload #15
/*     */     //   198: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   203: invokespecial logError : (Lcom/intellij/execution/ui/ConsoleView;Ljava/lang/String;)V
/*     */     //   206: ldc2_w 60000
/*     */     //   209: invokestatic sleep : (J)V
/*     */     //   212: new com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$run$1
/*     */     //   215: dup
/*     */     //   216: aload #7
/*     */     //   218: aload #13
/*     */     //   220: aconst_null
/*     */     //   221: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiNamedElement;Lkotlin/coroutines/Continuation;)V
/*     */     //   224: checkcast kotlin/jvm/functions/Function2
/*     */     //   227: invokestatic runBlockingCancellable : (Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
/*     */     //   230: checkcast java/util/List
/*     */     //   233: astore #16
/*     */     //   235: aload #16
/*     */     //   237: invokeinterface isEmpty : ()Z
/*     */     //   242: ifeq -> 265
/*     */     //   245: aload_0
/*     */     //   246: aload_1
/*     */     //   247: checkcast com/intellij/execution/ui/ConsoleView
/*     */     //   250: aload #14
/*     */     //   252: aload #15
/*     */     //   254: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   259: invokespecial logError : (Lcom/intellij/execution/ui/ConsoleView;Ljava/lang/String;)V
/*     */     //   262: goto -> 84
/*     */     //   265: aload #12
/*     */     //   267: invokevirtual getNames : ()Ljava/util/List;
/*     */     //   270: checkcast java/util/Collection
/*     */     //   273: aload #14
/*     */     //   275: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;
/*     */     //   278: checkcast java/lang/Iterable
/*     */     //   281: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   284: astore #17
/*     */     //   286: aload #16
/*     */     //   288: checkcast java/lang/Iterable
/*     */     //   291: aload #17
/*     */     //   293: checkcast java/lang/Iterable
/*     */     //   296: invokestatic intersect : (Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   299: astore #18
/*     */     //   301: aload #18
/*     */     //   303: checkcast java/util/Collection
/*     */     //   306: invokeinterface isEmpty : ()Z
/*     */     //   311: ifne -> 318
/*     */     //   314: iconst_1
/*     */     //   315: goto -> 319
/*     */     //   318: iconst_0
/*     */     //   319: ifeq -> 326
/*     */     //   322: dconst_1
/*     */     //   323: goto -> 327
/*     */     //   326: dconst_0
/*     */     //   327: dstore #19
/*     */     //   329: aload_0
/*     */     //   330: aload_1
/*     */     //   331: checkcast com/intellij/execution/ui/ConsoleView
/*     */     //   334: aload #14
/*     */     //   336: aload #15
/*     */     //   338: aload #16
/*     */     //   340: checkcast java/lang/Iterable
/*     */     //   343: aconst_null
/*     */     //   344: aconst_null
/*     */     //   345: aconst_null
/*     */     //   346: iconst_0
/*     */     //   347: aconst_null
/*     */     //   348: aconst_null
/*     */     //   349: bipush #63
/*     */     //   351: aconst_null
/*     */     //   352: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   355: dload #19
/*     */     //   357: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Ljava/lang/String;
/*     */     //   362: invokespecial logMessage : (Lcom/intellij/execution/ui/ConsoleView;Ljava/lang/String;)V
/*     */     //   365: dload #19
/*     */     //   367: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   370: astore #21
/*     */     //   372: aload #10
/*     */     //   374: checkcast java/util/Collection
/*     */     //   377: aload #21
/*     */     //   379: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   384: pop
/*     */     //   385: lload #5
/*     */     //   387: invokestatic sleep : (J)V
/*     */     //   390: goto -> 84
/*     */     //   393: aload #10
/*     */     //   395: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #117	-> 25
/*     */     //   #118	-> 37
/*     */     //   #119	-> 47
/*     */     //   #122	-> 64
/*     */     //   #122	-> 74
/*     */     //   #123	-> 76
/*     */     //   #124	-> 106
/*     */     //   #125	-> 135
/*     */     //   #126	-> 144
/*     */     //   #127	-> 156
/*     */     //   #128	-> 179
/*     */     //   #129	-> 189
/*     */     //   #130	-> 206
/*     */     //   #131	-> 212
/*     */     //   #132	-> 235
/*     */     //   #133	-> 245
/*     */     //   #134	-> 262
/*     */     //   #137	-> 265
/*     */     //   #138	-> 286
/*     */     //   #139	-> 301
/*     */     //   #139	-> 319
/*     */     //   #141	-> 329
/*     */     //   #142	-> 372
/*     */     //   #143	-> 385
/*     */     //   #145	-> 393
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   135	255	13	element	Lcom/intellij/psi/PsiNamedElement;
/*     */     //   144	246	14	originalName	Ljava/lang/String;
/*     */     //   156	234	15	fileName	Ljava/lang/String;
/*     */     //   179	211	16	suggestVariableNames	Ljava/util/List;
/*     */     //   286	104	17	expectedNames	Ljava/util/Set;
/*     */     //   301	89	18	intersectedNames	Ljava/util/Set;
/*     */     //   329	61	19	score	D
/*     */     //   106	284	12	row	Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;
/*     */     //   37	359	7	project	Lcom/intellij/openapi/project/Project;
/*     */     //   47	349	8	fileText	Ljava/lang/String;
/*     */     //   64	332	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   76	320	10	scores	Ljava/util/List;
/*     */     //   0	396	0	this	Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction;
/*     */     //   0	396	1	console	Lcom/intellij/execution/impl/ConsoleViewImpl;
/*     */     //   0	396	2	fileUrl	Ljava/lang/String;
/*     */     //   0	396	3	rows	Ljava/util/List;
/*     */     //   0	396	4	dataset	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	396	5	delay	J
/*     */   }
/*     */   
/*     */   private static final PsiFile run$lambda$1(Project $project, String $fileText) {
/*     */     Intrinsics.checkNotNullParameter($project, "$project");
/*     */     Intrinsics.checkNotNullParameter($fileText, "$fileText");
/*     */     return PsiFileFactory.getInstance($project).createFileFromText((Language)JavaLanguage.INSTANCE, $fileText);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunRenameBenchmarkAction.kt", l = {127}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.java.actions.RunRenameBenchmarkAction$run$suggestVariableNames$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RunRenameBenchmarkAction$run$suggestVariableNames$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
/*     */     int label;
/*     */     
/*     */     RunRenameBenchmarkAction$run$suggestVariableNames$1(Project $project, PsiNamedElement $element, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           return (LlmNameProviderKt.suggestNames$default(this.$project, (PsiElement)this.$element, null, null, (Continuation)this, 12, null) == object) ? object : LlmNameProviderKt.suggestNames$default(this.$project, (PsiElement)this.$element, null, null, (Continuation)this, 12, null);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RunRenameBenchmarkAction$run$suggestVariableNames$1> $completion) {
/*     */       return (Continuation<Unit>)new RunRenameBenchmarkAction$run$suggestVariableNames$1(this.$project, this.$element, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((RunRenameBenchmarkAction$run$suggestVariableNames$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunRenameBenchmarkAction.kt", l = {131}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.java.actions.RunRenameBenchmarkAction$run$1")
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RunRenameBenchmarkAction$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
/*     */     int label;
/*     */     
/*     */     RunRenameBenchmarkAction$run$1(Project $project, PsiNamedElement $element, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           return (LlmNameProviderKt.suggestNames$default(this.$project, (PsiElement)this.$element, null, null, (Continuation)this, 12, null) == object) ? object : LlmNameProviderKt.suggestNames$default(this.$project, (PsiElement)this.$element, null, null, (Continuation)this, 12, null);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super RunRenameBenchmarkAction$run$1> $completion) {
/*     */       return (Continuation<Unit>)new RunRenameBenchmarkAction$run$1(this.$project, this.$element, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((RunRenameBenchmarkAction$run$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final String loadFile(ConsoleViewImpl console, String fileUrl, VirtualFile dataset) {
/*     */     if (StringsKt.startsWith$default(fileUrl, "http://", false, 2, null) || StringsKt.startsWith$default(fileUrl, "https://", false, 2, null)) {
/*     */       String url = StringsKt.startsWith$default(fileUrl, "https://github.com", false, 2, null) ? StringsKt.replace$default(StringsKt.replace$default(fileUrl, "https://github.com", "https://raw.githubusercontent.com", false, 4, null), "/blob/", "/", false, 4, null) : fileUrl;
/*     */       HttpRequest request = HttpRequest.newBuilder(new URI(url)).GET().build();
/*     */       HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
/*     */       logError((ConsoleView)console, "Failed response for " + fileUrl + ": " + response.body());
/*     */       Intrinsics.checkNotNullExpressionValue((response.statusCode() != 200) ? "" : response.body(), "{\n      val url = if (fi…onse.body()\n      }\n    }");
/*     */     } else {
/*     */       String[] arrayOfString2 = new String[1];
/*     */       Intrinsics.checkNotNullExpressionValue(File.separator, "separator");
/*     */       arrayOfString2[0] = File.separator;
/*     */       Collection $this$toTypedArray$iv = StringsKt.split$default(fileUrl, arrayOfString2, false, 0, 6, null);
/*     */       int $i$f$toTypedArray = 0;
/*     */       Collection thisCollection$iv = $this$toTypedArray$iv;
/*     */       String[] arrayOfString1 = (String[])thisCollection$iv.toArray((Object[])new String[0]);
/*     */       VirtualFile file = StringsKt.startsWith$default(fileUrl, "/", false, 2, null) ? LocalFileSystem.getInstance().findFileByPath(fileUrl) : VfsUtil.findRelativeFile(dataset.getParent(), Arrays.<String>copyOf(arrayOfString1, arrayOfString1.length));
/*     */       if (file == null)
/*     */         throw new FileNotFoundException(fileUrl); 
/*     */       String str = VfsUtil.loadText(file);
/*     */       Intrinsics.checkNotNullExpressionValue(str, "{\n      val file = if (f…Util.loadText(file)\n    }");
/*     */     } 
/*     */     return str;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract String getName();
/*     */   
/*     */   @Nullable
/*     */   public abstract PsiNamedElement findTargetElement(@NotNull PsiFile paramPsiFile, @NotNull String paramString);
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\b\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\016\032\0020\017H\024R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\032\020\013\032\0020\006X\016¢\006\016\n\000\032\004\b\f\020\b\"\004\b\r\020\n¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$RunRenameBenchmarkDialog;", "Lcom/intellij/openapi/ui/DialogWrapper;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;)V", "datasetPath", "", "getDatasetPath", "()Ljava/lang/String;", "setDatasetPath", "(Ljava/lang/String;)V", "delay", "getDelay", "setDelay", "createCenterPanel", "Ljavax/swing/JComponent;", "intellij.ml.llm.java"})
/*     */   public static final class RunRenameBenchmarkDialog extends DialogWrapper {
/*     */     @NotNull
/*     */     private String datasetPath;
/*     */     @NotNull
/*     */     private String delay;
/*     */     
/*     */     public RunRenameBenchmarkDialog(@NotNull Project project) {
/*     */       super(project);
/*     */       this.datasetPath = "";
/*     */       this.delay = "4000";
/*     */       setTitle(LLMBundle.message("action.RunRenameVariableBenchmarkAction.text", new Object[0]));
/*     */       init();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getDatasetPath() {
/*     */       return this.datasetPath;
/*     */     }
/*     */     
/*     */     public final void setDatasetPath(@NotNull String <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.datasetPath = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getDelay() {
/*     */       return this.delay;
/*     */     }
/*     */     
/*     */     public final void setDelay(@NotNull String <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.delay = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     protected JComponent createCenterPanel() {
/*     */       DialogPanel dialogPanel1 = BuilderKt.panel(new RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1());
/*     */       DialogPanel it = dialogPanel1;
/*     */       int $i$a$-also-RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$2 = 0;
/*     */       it.setPreferredSize(new Dimension(350, 100));
/*     */       return (JComponent)dialogPanel1;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lcom/intellij/ui/dsl/builder/Panel;", "invoke"})
/*     */     static final class RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1 extends Lambda implements Function1<Panel, Unit> {
/*     */       public final void invoke(@NotNull Panel $this$panel) {
/*     */         Intrinsics.checkNotNullParameter($this$panel, "$this$panel");
/*     */         Intrinsics.checkNotNullExpressionValue(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.dataset", new Object[0]), "LLMBundle.getMessage(\"ac…BenchmarkAction.dataset\")");
/*     */         $this$panel.row(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.dataset", new Object[0]), new Function1<com.intellij.ui.dsl.builder.Row, Unit>() {
/*     */               public final void invoke(@NotNull com.intellij.ui.dsl.builder.Row $this$row) {
/*     */                 Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                 FileChooserDescriptor fileDescriptor = FileChooserDescriptorFactory.createSingleFileNoJarsDescriptor().withFileFilter(RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1.INSTANCE::invoke$lambda$0);
/*     */                 Intrinsics.checkNotNullExpressionValue(fileDescriptor, "fileDescriptor");
/*     */                 TextFieldWithBrowseButtonKt.bindText(com.intellij.ui.dsl.builder.Row.textFieldWithBrowseButton$default($this$row, null, null, fileDescriptor, null, 11, null), (KMutableProperty0)new MutablePropertyReference0Impl(RunRenameBenchmarkAction.RunRenameBenchmarkDialog.this) {
/*     */                       @Nullable
/*     */                       public Object get() {
/*     */                         return ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).getDatasetPath();
/*     */                       }
/*     */                       
/*     */                       public void set(@Nullable Object value) {
/*     */                         ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).setDatasetPath((String)value);
/*     */                       }
/*     */                     }).align(Align.FILL);
/*     */               }
/*     */               
/*     */               private static final boolean invoke$lambda$0(Function1 $tmp0, Object p0) {
/*     */                 Intrinsics.checkNotNullParameter($tmp0, "$tmp0");
/*     */                 return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */               }
/*     */               
/*     */               @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/Boolean;"})
/*     */               static final class RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1 extends Lambda implements Function1<VirtualFile, Boolean> {
/*     */                 public static final RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1 INSTANCE = new RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1();
/*     */                 
/*     */                 RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1$1$fileDescriptor$1() {
/*     */                   super(1);
/*     */                 }
/*     */                 
/*     */                 @NotNull
/*     */                 public final Boolean invoke(VirtualFile it) {
/*     */                   return Boolean.valueOf(Intrinsics.areEqual(it.getExtension(), "csv"));
/*     */                 }
/*     */               }
/*     */             });
/*     */         Intrinsics.checkNotNullExpressionValue(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.delay.ms", new Object[0]), "LLMBundle.getMessage(\"ac…enchmarkAction.delay.ms\")");
/*     */         $this$panel.row(LLMBundle.INSTANCE.getMessage("action.RunRenameVariableBenchmarkAction.delay.ms", new Object[0]), new Function1<com.intellij.ui.dsl.builder.Row, Unit>() {
/*     */               public final void invoke(@NotNull com.intellij.ui.dsl.builder.Row $this$row) {
/*     */                 Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */                 TextFieldKt.bindText(com.intellij.ui.dsl.builder.Row.intTextField$default($this$row, new IntRange(0, 2147483647), null, 2, null), (KMutableProperty0)new MutablePropertyReference0Impl(RunRenameBenchmarkAction.RunRenameBenchmarkDialog.this) {
/*     */                       @Nullable
/*     */                       public Object get() {
/*     */                         return ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).getDelay();
/*     */                       }
/*     */                       
/*     */                       public void set(@Nullable Object value) {
/*     */                         ((RunRenameBenchmarkAction.RunRenameBenchmarkDialog)this.receiver).setDelay((String)value);
/*     */                       }
/*     */                     });
/*     */               }
/*     */             });
/*     */       }
/*     */       
/*     */       RunRenameBenchmarkAction$RunRenameBenchmarkDialog$createCenterPanel$1() {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */