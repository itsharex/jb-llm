/*    */ package com.intellij.ml.llm.evaluation;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bJ\t\020\017\032\0020\003HÆ\003J\013\020\020\032\004\030\0010\005HÆ\003J\013\020\021\032\004\030\0010\007HÆ\003J+\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\031HÖ\001R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\t\020\nR\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Editor;Lcom/intellij/psi/PsiFile;)V", "getEditor", "()Lcom/intellij/openapi/editor/Editor;", "getFile", "()Lcom/intellij/psi/PsiFile;", "getProject", "()Lcom/intellij/openapi/project/Project;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intellij.ml.llm"})
/*    */ public final class IntentionCallContext
/*    */ {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @Nullable
/*    */   private final Editor editor;
/*    */   @Nullable
/*    */   private final PsiFile file;
/*    */   
/*    */   public IntentionCallContext(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 43 */     this.project = project; this.editor = editor; this.file = file; } @NotNull public final Project getProject() { return this.project; } @Nullable public final Editor getEditor() { return this.editor; } @Nullable public final PsiFile getFile() { return this.file; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Project component1() {
/*    */     return this.project;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Editor component2() {
/*    */     return this.editor;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PsiFile component3() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IntentionCallContext copy(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/*    */     Intrinsics.checkNotNullParameter(project, "project");
/*    */     return new IntentionCallContext(project, editor, file);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "IntentionCallContext(project=" + this.project + ", editor=" + this.editor + ", file=" + this.file + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.project.hashCode();
/*    */     result = result * 31 + ((this.editor == null) ? 0 : this.editor.hashCode());
/*    */     return result * 31 + ((this.file == null) ? 0 : this.file.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof IntentionCallContext))
/*    */       return false; 
/*    */     IntentionCallContext intentionCallContext = (IntentionCallContext)other;
/*    */     return !Intrinsics.areEqual(this.project, intentionCallContext.project) ? false : (!Intrinsics.areEqual(this.editor, intentionCallContext.editor) ? false : (!!Intrinsics.areEqual(this.file, intentionCallContext.file)));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/evaluation/IntentionCallContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */