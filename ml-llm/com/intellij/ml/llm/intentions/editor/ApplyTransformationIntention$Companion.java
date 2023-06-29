/*     */ package com.intellij.ml.llm.intentions.editor;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J-\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\000¢\006\002\b\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$Companion;", "", "()V", "updateDocument", "", "project", "Lcom/intellij/openapi/project/Project;", "suggestion", "", "document", "Lcom/intellij/openapi/editor/Document;", "textRange", "Lcom/intellij/openapi/util/TextRange;", "updateDocument$intellij_ml_llm", "intellij.ml.llm"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   public final void updateDocument$intellij_ml_llm(@NotNull Project project, @NotNull String suggestion, @NotNull Document document, @NotNull TextRange textRange) {
/* 214 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(suggestion, "suggestion"); Intrinsics.checkNotNullParameter(document, "document"); Intrinsics.checkNotNullParameter(textRange, "textRange"); document.replaceString(textRange.getStartOffset(), textRange.getEndOffset(), suggestion);
/* 215 */     PsiDocumentManager.getInstance(project).commitDocument(document);
/* 216 */     PsiFile psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document);
/* 217 */     PsiFile it = psiFile; int $i$a$-let-ApplyTransformationIntention$Companion$updateDocument$1 = 0;
/* 218 */     TextRange reformatRange = new TextRange(textRange.getStartOffset(), textRange.getStartOffset() + suggestion.length());
/* 219 */     CodeStyleManager.getInstance(project).reformatText(it, CollectionsKt.listOf(reformatRange));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/editor/ApplyTransformationIntention$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */