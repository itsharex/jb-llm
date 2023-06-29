/*     */ package com.intellij.ml.llm.python.intentions.inline;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import com.intellij.psi.codeStyle.CodeStyleManager;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\000¢\006\002\b\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$Companion;", "", "()V", "updateDocument", "", "project", "Lcom/intellij/openapi/project/Project;", "suggestion", "", "document", "Lcom/intellij/openapi/editor/Document;", "textRange", "Lcom/intellij/openapi/util/TextRange;", "updateDocument$intellij_ml_llm_python", "intellij.ml.llm.python"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   public final void updateDocument$intellij_ml_llm_python(@NotNull Project project, @NotNull String suggestion, @NotNull Document document, @NotNull TextRange textRange) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'suggestion'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'document'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'textRange'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: invokestatic getInstance : ()Lcom/intellij/openapi/command/CommandProcessor;
/*     */     //   28: aload_1
/*     */     //   29: aload_3
/*     */     //   30: aload #4
/*     */     //   32: aload_2
/*     */     //   33: aload_1
/*     */     //   34: <illegal opcode> run : (Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/util/TextRange;Ljava/lang/String;Lcom/intellij/openapi/project/Project;)Ljava/lang/Runnable;
/*     */     //   39: ldc '...'
/*     */     //   41: aconst_null
/*     */     //   42: invokevirtual executeCommand : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   45: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 25
/*     */     //   #119	-> 39
/*     */     //   #111	-> 42
/*     */     //   #120	-> 45
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	46	0	this	Lcom/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$Companion;
/*     */     //   0	46	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	46	2	suggestion	Ljava/lang/String;
/*     */     //   0	46	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   0	46	4	textRange	Lcom/intellij/openapi/util/TextRange;
/*     */   }
/*     */   
/*     */   private static final void updateDocument$lambda$1(Document $document, TextRange $textRange, String $suggestion, Project $project) {
/* 112 */     Intrinsics.checkNotNullParameter($document, "$document"); Intrinsics.checkNotNullParameter($textRange, "$textRange"); Intrinsics.checkNotNullParameter($suggestion, "$suggestion"); Intrinsics.checkNotNullParameter($project, "$project"); $document.replaceString($textRange.getStartOffset(), $textRange.getEndOffset(), $suggestion);
/* 113 */     PsiDocumentManager.getInstance($project).commitDocument($document);
/* 114 */     PsiFile psiFile = PsiDocumentManager.getInstance($project).getPsiFile($document);
/* 115 */     PsiFile it = psiFile; int $i$a$-let-PythonAddTypeAnnotationsIntention$Companion$updateDocument$1$1 = 0;
/* 116 */     TextRange reformatRange = new TextRange($textRange.getStartOffset(), $textRange.getStartOffset() + $suggestion.length());
/* 117 */     CodeStyleManager.getInstance($project).reformatText(it, CollectionsKt.listOf(reformatRange));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/inline/PythonAddTypeAnnotationsIntention$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */