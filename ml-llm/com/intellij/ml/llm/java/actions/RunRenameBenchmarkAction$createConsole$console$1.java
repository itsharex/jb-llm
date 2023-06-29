/*    */ package com.intellij.ml.llm.java.actions;
/*    */ 
/*    */ import com.intellij.execution.impl.ConsoleViewImpl;
/*    */ import com.intellij.execution.impl.ConsoleViewUtil;
/*    */ import com.intellij.openapi.editor.ex.EditorEx;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024¨\006\004"}, d2 = {"com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$createConsole$console$1", "Lcom/intellij/execution/impl/ConsoleViewImpl;", "doCreateConsoleEditor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "intellij.ml.llm.java"})
/*    */ public final class RunRenameBenchmarkAction$createConsole$console$1
/*    */   extends ConsoleViewImpl
/*    */ {
/*    */   RunRenameBenchmarkAction$createConsole$console$1(Project $project) {
/* 89 */     super($project, true); } @NotNull
/*    */   protected EditorEx doCreateConsoleEditor() {
/* 91 */     Intrinsics.checkNotNullExpressionValue(ConsoleViewUtil.setupConsoleEditor(this.$project, false, false), "setupConsoleEditor(project, false, false)"); return ConsoleViewUtil.setupConsoleEditor(this.$project, false, false);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameBenchmarkAction$createConsole$console$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */