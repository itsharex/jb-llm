/*    */ package com.intellij.ml.llm.java.actions;
/*    */ 
/*    */ import com.intellij.openapi.progress.ProgressIndicator;
/*    */ import com.intellij.psi.javadoc.PsiDocComment;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\007H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\tH\026¨\006\n"}, d2 = {"com/intellij/ml/llm/java/actions/StatisticCollectorAction$actionPerformed$1$run$1", "Lorg/jetbrains/uast/visitor/AbstractUastNonRecursiveVisitor;", "visitClass", "", "node", "Lorg/jetbrains/uast/UClass;", "visitElement", "Lorg/jetbrains/uast/UElement;", "visitMethod", "Lorg/jetbrains/uast/UMethod;", "intellij.ml.llm.java"})
/*    */ public final class StatisticCollectorAction$actionPerformed$1$run$1
/*    */   extends AbstractUastNonRecursiveVisitor
/*    */ {
/*    */   StatisticCollectorAction$actionPerformed$1$run$1(FileWriter $fileOutputStream, Ref.IntRef $methodsWithDoc, Ref.IntRef $totalMethodsCount, Ref.IntRef $classesWithDoc, Ref.IntRef $totalClassesCount, ProgressIndicator $indicator) {}
/*    */   
/*    */   public boolean visitElement(@NotNull UElement node) {
/* 45 */     Intrinsics.checkNotNullParameter(node, "node"); return false;
/*    */   }
/*    */   
/*    */   public boolean visitMethod(@NotNull UMethod node) {
/* 49 */     Intrinsics.checkNotNullParameter(node, "node"); if (node.getVisibility() == UastVisibility.PUBLIC) {
/* 50 */       PsiDocComment docComment = node.getDocComment();
/* 51 */       if (docComment != null) {
/* 52 */         String escapedBody = StatisticCollectorAction.this.escapeJson(node.asRenderString());
/* 53 */         String escapedName = StatisticCollectorAction.this.escapeJson(node.getName());
/* 54 */         Intrinsics.checkNotNullExpressionValue(docComment.getText(), "docComment.text"); String escapedDocComment = StatisticCollectorAction.this.escapeJson(docComment.getText());
/* 55 */         this.$fileOutputStream.write("{\"name\": \"" + 
/* 56 */             escapedName + "\", \"body\": \"" + escapedBody + "\", \"type\": \"method\", \"comment\": \"" + escapedDocComment + "\"},\n");
/* 57 */         int j = this.$methodsWithDoc.element; this.$methodsWithDoc.element = j + 1;
/*    */       } 
/* 59 */       int i = this.$totalMethodsCount.element; this.$totalMethodsCount.element = i + 1;
/*    */     } 
/* 61 */     return true;
/*    */   }
/*    */   
/*    */   public boolean visitClass(@NotNull UClass node) {
/* 65 */     Intrinsics.checkNotNullParameter(node, "node"); String qualifiedName = node.getQualifiedName();
/* 66 */     if (qualifiedName != null && node.getVisibility() == UastVisibility.PUBLIC) {
/* 67 */       PsiDocComment docComment = node.getDocComment();
/* 68 */       if (docComment != null) {
/* 69 */         String escapedBody = StatisticCollectorAction.this.escapeJson(node.asRenderString());
/* 70 */         String escapedName = StatisticCollectorAction.this.escapeJson(qualifiedName);
/* 71 */         Intrinsics.checkNotNullExpressionValue(docComment.getText(), "docComment.text"); String escapedDocComment = StatisticCollectorAction.this.escapeJson(docComment.getText());
/* 72 */         this.$fileOutputStream.write("{\"name\": \"" + 
/* 73 */             escapedName + "\", \"body\": \"" + escapedBody + "\", \"type\": \"class\", \"comment\": \"" + escapedDocComment + "\"},\n");
/* 74 */         int j = this.$classesWithDoc.element; this.$classesWithDoc.element = j + 1;
/*    */       } 
/* 76 */       int i = this.$totalClassesCount.element; this.$totalClassesCount.element = i + 1;
/*    */     } 
/* 78 */     this.$indicator.setText("Counting... total classes processed: " + this.$totalClassesCount.element);
/* 79 */     return false;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/StatisticCollectorAction$actionPerformed$1$run$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */