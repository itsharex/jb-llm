/*     */ package com.intellij.ml.llm.java.actions;
/*     */ 
/*     */ import com.intellij.execution.impl.ConsoleViewImpl;
/*     */ import com.intellij.execution.ui.ConsoleView;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.progress.Task;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.LocalFileSystem;
/*     */ import com.intellij.openapi.vfs.VfsUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.java"})
/*     */ @SourceDebugExtension({"SMAP\nRunRenameBenchmarkAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunRenameBenchmarkAction.kt\ncom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,204:1\n970#2:205\n999#2,3:206\n1002#2,3:216\n361#3,7:209\n125#4:219\n152#4,3:220\n*S KotlinDebug\n*F\n+ 1 RunRenameBenchmarkAction.kt\ncom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1\n*L\n68#1:205\n68#1:206,3\n68#1:216,3\n68#1:209,7\n69#1:219\n69#1:220,3\n*E\n"})
/*     */ public final class RunRenameBenchmarkAction$actionPerformed$task$1
/*     */   extends Task.Backgroundable
/*     */ {
/*     */   RunRenameBenchmarkAction$actionPerformed$task$1(RunRenameBenchmarkAction.RunRenameBenchmarkDialog $dialog, RunRenameBenchmarkAction $receiver, long $delay, String $super_call_param$1) {
/*  55 */     super($project, $super_call_param$1); } public void run(@NotNull ProgressIndicator indicator) {
/*     */     VirtualFile dataset;
/*  57 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); if (LocalFileSystem.getInstance().findFileByPath(this.$dialog.getDatasetPath()) == null) { LocalFileSystem.getInstance().findFileByPath(this.$dialog.getDatasetPath());
/*  58 */       throw new FileNotFoundException("dataset not found"); }
/*  59 */      Intrinsics.checkNotNullExpressionValue(VfsUtil.loadText(dataset), "loadText(dataset)"); String datasetText = VfsUtil.loadText(dataset);
/*  60 */     ConsoleViewImpl console = (ConsoleViewImpl)ActionsKt.invokeAndWaitIfNeeded$default(null, new RunRenameBenchmarkAction$actionPerformed$task$1$run$console$1(this.$project), 1, null);
/*  61 */     RunRenameBenchmarkAction.access$logMessage(RunRenameBenchmarkAction.this, (ConsoleView)console, "Start benchmark " + this.$dialog.getDatasetPath());
/*     */     
/*  63 */     String[] arrayOfString = new String[1]; Intrinsics.checkNotNullExpressionValue(System.lineSeparator(), "lineSeparator()"); arrayOfString[0] = System.lineSeparator();
/*     */ 
/*     */ 
/*     */     
/*  67 */     Sequence sequence1 = SequencesKt.map(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(StringsKt.split$default(datasetText, arrayOfString, false, 0, 6, null)), RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1.INSTANCE), RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2.INSTANCE), RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3.INSTANCE);
/*  68 */     int $i$f$groupBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 205 */     Sequence sequence2 = sequence1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 206 */     for (Object element$iv$iv : sequence2) {
/* 207 */       RunRenameBenchmarkAction.Row row = (RunRenameBenchmarkAction.Row)element$iv$iv; int $i$a$-groupBy-RunRenameBenchmarkAction$actionPerformed$task$1$run$score$4 = 0; Object key$iv$iv = row.getUrl();
/* 208 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = destination$iv$iv; int $i$f$getOrPut = 0;
/* 209 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     Map<Object, Object> map1 = destination$iv$iv; RunRenameBenchmarkAction runRenameBenchmarkAction = RunRenameBenchmarkAction.this; long l = this.$delay; int $i$f$map = 0;
/* 219 */     Map<Object, Object> map2 = map1; Collection<List<Double>> collection = new ArrayList(map1.size()); int $i$f$mapTo = 0;
/* 220 */     for (Map.Entry<Object, Object> item$iv$iv : map2.entrySet()) {
/* 221 */       Map.Entry<Object, Object> entry1 = item$iv$iv; Collection<List<Double>> collection1 = collection; int $i$a$-map-RunRenameBenchmarkAction$actionPerformed$task$1$run$score$5 = 0; String url = (String)entry1.getKey(); List<RunRenameBenchmarkAction.Row> rows = (List)entry1.getValue(); collection1.add(runRenameBenchmarkAction.run(console, url, rows, dataset, l));
/* 222 */     }  double score = CollectionsKt.averageOfDouble(CollectionsKt.flatten(collection));
/*     */     String str1 = "Final Score: %.4f";
/*     */     Object[] arrayOfObject = new Object[1];
/*     */     arrayOfObject[0] = Double.valueOf(score);
/*     */     arrayOfObject = arrayOfObject;
/*     */     Intrinsics.checkNotNullExpressionValue(String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(this, *args)");
/*     */     RunRenameBenchmarkAction.access$logMessage(RunRenameBenchmarkAction.this, (ConsoleView)console, String.format(str1, Arrays.copyOf(arrayOfObject, arrayOfObject.length)));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/execution/impl/ConsoleViewImpl;", "invoke"})
/*     */   static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$console$1 extends Lambda implements Function0<ConsoleViewImpl> {
/*     */     RunRenameBenchmarkAction$actionPerformed$task$1$run$console$1(Project $project) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ConsoleViewImpl invoke() {
/*     */       return RunRenameBenchmarkAction.access$createConsole(RunRenameBenchmarkAction.this, this.$project);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*     */   static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1 extends Lambda implements Function1<String, Boolean> {
/*     */     public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1();
/*     */     
/*     */     RunRenameBenchmarkAction$actionPerformed$task$1$run$score$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Boolean.valueOf((((CharSequence)it).length() > 0));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\020\016\n\002\b\002\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "it", "invoke"})
/*     */   static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2 extends Lambda implements Function1<String, List<? extends String>> {
/*     */     public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2();
/*     */     
/*     */     RunRenameBenchmarkAction$actionPerformed$task$1$run$score$2() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> invoke(@NotNull String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       String[] arrayOfString = new String[1];
/*     */       arrayOfString[0] = ";";
/*     */       return CollectionsKt.take(StringsKt.split$default(it, arrayOfString, false, 0, 6, null), 3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$Row;", "<name for destructuring parameter 0>", "", "", "invoke"})
/*     */   static final class RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3 extends Lambda implements Function1<List<? extends String>, RunRenameBenchmarkAction.Row> {
/*     */     public static final RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3 INSTANCE = new RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3();
/*     */     
/*     */     RunRenameBenchmarkAction$actionPerformed$task$1$run$score$3() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final RunRenameBenchmarkAction.Row invoke(@NotNull List<String> param1List) {
/*     */       Intrinsics.checkNotNullParameter(param1List, "<name for destructuring parameter 0>");
/*     */       String context = param1List.get(0), names = param1List.get(1), url = param1List.get(2), arrayOfString[] = new String[1];
/*     */       arrayOfString[0] = ",";
/*     */       return new RunRenameBenchmarkAction.Row(context, StringsKt.split$default(names, arrayOfString, false, 0, 6, null), url);
/*     */     }
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$actionPerformed$task$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */