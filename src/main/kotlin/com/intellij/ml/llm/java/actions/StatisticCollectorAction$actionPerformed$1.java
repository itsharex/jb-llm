/*    */ package com.intellij.ml.llm.java.actions;
/*    */ 
/*    */ import com.intellij.analysis.AnalysisScope;
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.openapi.progress.Task;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.io.FileUtil;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiElementVisitor;
/*    */ import com.intellij.psi.javadoc.PsiDocComment;
/*    */ import com.intellij.uast.UastVisitorAdapter;
/*    */ import java.io.FileWriter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.uast.UClass;
/*    */ import org.jetbrains.uast.UElement;
/*    */ import org.jetbrains.uast.UMethod;
/*    */ import org.jetbrains.uast.UastVisibility;
/*    */ import org.jetbrains.uast.visitor.AbstractUastNonRecursiveVisitor;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/java/actions/StatisticCollectorAction$actionPerformed$1", "Lcom/intellij/openapi/progress/Task$Backgroundable;", "run", "", "indicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "intellij.ml.llm.java"})
/*    */ public final class StatisticCollectorAction$actionPerformed$1
/*    */   extends Task.Backgroundable
/*    */ {
/*    */   StatisticCollectorAction$actionPerformed$1(VirtualFile $virtualFile, AnalysisScope $analysisScope, Ref.IntRef $methodsWithDoc, Ref.IntRef $totalMethodsCount, Ref.IntRef $classesWithDoc, Ref.IntRef $totalClassesCount, StatisticCollectorAction $receiver) {
/* 37 */     super($project, "Collect data");
/*    */   }
/*    */   public void run(@NotNull ProgressIndicator indicator) {
/* 40 */     Intrinsics.checkNotNullParameter(indicator, "indicator"); FileWriter fileOutputStream = new FileWriter(FileUtil.toSystemDependentName(this.$virtualFile.getPath()) + FileUtil.toSystemDependentName(this.$virtualFile.getPath()) + "output.json", false);
/*    */     try {
/* 42 */       fileOutputStream.write("[\n");
/* 43 */       this.$analysisScope.accept((PsiElementVisitor)new UastVisitorAdapter(new StatisticCollectorAction$actionPerformed$1$run$1(fileOutputStream, this.$methodsWithDoc, this.$totalMethodsCount, this.$classesWithDoc, this.$totalClassesCount, indicator), 
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
/* 81 */             true));
/* 82 */       fileOutputStream.write("{\"methodsWithDoc\": \"" + 
/* 83 */           this.$methodsWithDoc.element + "\", \"totalMethods\": \"" + this.$totalMethodsCount.element + "\", \"classesWithDoc\": \"" + this.$classesWithDoc.element + "\", \"totalClasses\": \"" + this.$totalClassesCount.element + "\"}\n");
/* 84 */       fileOutputStream.write("]");
/*    */     } finally {
/*    */       
/* 87 */       fileOutputStream.close();
/*    */     } 
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\007H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\tH\026¨\006\n"}, d2 = {"com/intellij/ml/llm/java/actions/StatisticCollectorAction$actionPerformed$1$run$1", "Lorg/jetbrains/uast/visitor/AbstractUastNonRecursiveVisitor;", "visitClass", "", "node", "Lorg/jetbrains/uast/UClass;", "visitElement", "Lorg/jetbrains/uast/UElement;", "visitMethod", "Lorg/jetbrains/uast/UMethod;", "intellij.ml.llm.java"})
/*    */   public static final class StatisticCollectorAction$actionPerformed$1$run$1 extends AbstractUastNonRecursiveVisitor {
/*    */     StatisticCollectorAction$actionPerformed$1$run$1(FileWriter $fileOutputStream, Ref.IntRef $methodsWithDoc, Ref.IntRef $totalMethodsCount, Ref.IntRef $classesWithDoc, Ref.IntRef $totalClassesCount, ProgressIndicator $indicator) {}
/*    */     
/*    */     public boolean visitElement(@NotNull UElement node) {
/*    */       Intrinsics.checkNotNullParameter(node, "node");
/*    */       return false;
/*    */     }
/*    */     
/*    */     public boolean visitMethod(@NotNull UMethod node) {
/*    */       Intrinsics.checkNotNullParameter(node, "node");
/*    */       if (node.getVisibility() == UastVisibility.PUBLIC) {
/*    */         PsiDocComment docComment = node.getDocComment();
/*    */         if (docComment != null) {
/*    */           String escapedBody = StatisticCollectorAction.this.escapeJson(node.asRenderString());
/*    */           String escapedName = StatisticCollectorAction.this.escapeJson(node.getName());
/*    */           Intrinsics.checkNotNullExpressionValue(docComment.getText(), "docComment.text");
/*    */           String escapedDocComment = StatisticCollectorAction.this.escapeJson(docComment.getText());
/*    */           this.$fileOutputStream.write("{\"name\": \"" + escapedName + "\", \"body\": \"" + escapedBody + "\", \"type\": \"method\", \"comment\": \"" + escapedDocComment + "\"},\n");
/*    */           int j = this.$methodsWithDoc.element;
/*    */           this.$methodsWithDoc.element = j + 1;
/*    */         } 
/*    */         int i = this.$totalMethodsCount.element;
/*    */         this.$totalMethodsCount.element = i + 1;
/*    */       } 
/*    */       return true;
/*    */     }
/*    */     
/*    */     public boolean visitClass(@NotNull UClass node) {
/*    */       Intrinsics.checkNotNullParameter(node, "node");
/*    */       String qualifiedName = node.getQualifiedName();
/*    */       if (qualifiedName != null && node.getVisibility() == UastVisibility.PUBLIC) {
/*    */         PsiDocComment docComment = node.getDocComment();
/*    */         if (docComment != null) {
/*    */           String escapedBody = StatisticCollectorAction.this.escapeJson(node.asRenderString());
/*    */           String escapedName = StatisticCollectorAction.this.escapeJson(qualifiedName);
/*    */           Intrinsics.checkNotNullExpressionValue(docComment.getText(), "docComment.text");
/*    */           String escapedDocComment = StatisticCollectorAction.this.escapeJson(docComment.getText());
/*    */           this.$fileOutputStream.write("{\"name\": \"" + escapedName + "\", \"body\": \"" + escapedBody + "\", \"type\": \"class\", \"comment\": \"" + escapedDocComment + "\"},\n");
/*    */           int j = this.$classesWithDoc.element;
/*    */           this.$classesWithDoc.element = j + 1;
/*    */         } 
/*    */         int i = this.$totalClassesCount.element;
/*    */         this.$totalClassesCount.element = i + 1;
/*    */       } 
/*    */       this.$indicator.setText("Counting... total classes processed: " + this.$totalClassesCount.element);
/*    */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/StatisticCollectorAction$actionPerformed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */