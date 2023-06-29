/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J&\020\005\032\004\030\0010\0042\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\b\020\n\032\004\030\0010\013H\026J\b\020\f\032\0020\004H\026J$\020\r\032\0020\0162\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\b\020\017\032\004\030\0010\020H\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/editor/ApplyCustomEditIntention;", "Lcom/intellij/ml/llm/intentions/editor/ApplyTransformationIntention;", "()V", "getFamilyName", "", "getInstruction", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "element", "Lcom/intellij/psi/PsiElement;", "getText", "isAvailable", "", "file", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ public final class ApplyCustomEditIntention extends ApplyTransformationIntention {
/* 12 */   public ApplyCustomEditIntention() { super(null, null, 3, null); } @Nullable
/*    */   public String getInstruction(@NotNull Project project, @Nullable Editor editor, @Nullable PsiElement element) {
/* 14 */     Intrinsics.checkNotNullParameter(project, "project"); return Messages.showInputDialog(project, LLMBundle.message("dialog.message.enter.prompt", new Object[0]), 
/* 15 */         LLMBundle.message("intentions.apply.custom.edit.dialog.title.ai.assistant", new Object[0]), null);
/*    */   }
/*    */   @NotNull
/* 18 */   public String getText() { return LLMBundle.message("intentions.apply.custom.edit.name", new Object[0]); } @NotNull
/* 19 */   public String getFamilyName() { return getText(); }
/*    */   
/*    */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 22 */     Intrinsics.checkNotNullParameter(project, "project"); return Registry.is("llm.is.internal");
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/ApplyCustomEditIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */