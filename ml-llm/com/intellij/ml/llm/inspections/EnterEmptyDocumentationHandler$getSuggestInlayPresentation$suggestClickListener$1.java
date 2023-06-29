/*     */ package com.intellij.ml.llm.inspections;
/*     */ 
/*     */ import com.intellij.ml.llm.intentions.editor.WriteDocumentationIntention;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.awt.Point;
/*     */ import java.awt.event.MouseEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/awt/event/MouseEvent;", "<anonymous parameter 1>", "Ljava/awt/Point;", "invoke", "(Ljava/awt/event/MouseEvent;Ljava/awt/Point;)Ljava/lang/Boolean;"})
/*     */ final class EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1
/*     */   extends Lambda
/*     */   implements Function2<MouseEvent, Point, Boolean>
/*     */ {
/*     */   @NotNull
/*     */   public final Boolean invoke(@NotNull MouseEvent paramMouseEvent, @NotNull Point paramPoint) {
/* 155 */     Intrinsics.checkNotNullParameter(paramMouseEvent, "<anonymous parameter 0>"); Intrinsics.checkNotNullParameter(paramPoint, "<anonymous parameter 1>"); Project project1 = this.$editor.getProject(); WriteDocumentationIntention writeDocumentationIntention = this.$intention; Editor editor = this.$editor; PsiFile psiFile = this.$file; Project it = project1; int $i$a$-let-EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1$1 = 0;
/* 156 */     writeDocumentationIntention.invoke(it, editor, psiFile);
/*     */     this.$editor.getProject();
/* 158 */     return Boolean.valueOf(true);
/*     */   }
/*     */   
/*     */   EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1(Editor $editor, WriteDocumentationIntention $intention, PsiFile $file) {
/*     */     super(2);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler$getSuggestInlayPresentation$suggestClickListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */