/*    */ package com.intellij.ml.llm.evaluation;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.fileEditor.OpenFileDescriptor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\b\020\017\032\0020\020H\026J\b\020\021\032\0020\022H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/evaluation/TextRangeCallLocation;", "Lcom/intellij/ml/llm/evaluation/CallLocation;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "textRange", "Lcom/intellij/openapi/util/TextRange;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/util/TextRange;)V", "getFile", "()Lcom/intellij/psi/PsiFile;", "getProject", "()Lcom/intellij/openapi/project/Project;", "getTextRange", "()Lcom/intellij/openapi/util/TextRange;", "getIntentionCallContext", "Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "toJson", "", "intellij.ml.llm"})
/*    */ public final class TextRangeCallLocation implements CallLocation {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final PsiFile file;
/*    */   @NotNull
/*    */   private final TextRange textRange;
/*    */   
/* 19 */   public TextRangeCallLocation(@NotNull Project project, @NotNull PsiFile file, @NotNull TextRange textRange) { this.project = project;
/* 20 */     this.file = file;
/* 21 */     this.textRange = textRange; } @NotNull public final Project getProject() { return this.project; } @NotNull public final TextRange getTextRange() { return this.textRange; }
/*    */   @NotNull
/*    */   public final PsiFile getFile() { return this.file; } @NotNull
/* 24 */   public IntentionCallContext getIntentionCallContext() { FileEditorManager editorManager = FileEditorManager.getInstance(this.project);
/* 25 */     OpenFileDescriptor openFileDescriptor = new OpenFileDescriptor(this.project, this.file.getVirtualFile());
/* 26 */     Editor editor = editorManager.openTextEditor(openFileDescriptor, false);
/*    */     
/* 28 */     if (editor != null && editor.getSelectionModel() != null) { editor.getSelectionModel().setSelection(this.textRange.getStartOffset(), this.textRange.getEndOffset()); } else { editor.getSelectionModel(); }
/*    */     
/* 30 */     return new IntentionCallContext(this.project, editor, this.file); }
/*    */   
/*    */   @NotNull
/*    */   public String toJson() {
/* 34 */     Intrinsics.checkNotNullExpressionValue(this.file.getVirtualFile(), "file.virtualFile"); String filePathInProject = TextRangeCallLocationKt.relativeName(this.file.getVirtualFile(), this.project);
/* 35 */     return "{\"file\": \"" + filePathInProject + "\", \"startOffset\": " + this.textRange.getStartOffset() + ", \"endOffset\": " + this.textRange.getEndOffset() + "}";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/evaluation/TextRangeCallLocation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */