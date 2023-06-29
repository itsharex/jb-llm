/*    */ package com.intellij.ml.llm.evaluation;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\b\020\017\032\0020\020H\026J\b\020\021\032\0020\022H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/evaluation/PsiElementCallLocation;", "Lcom/intellij/ml/llm/evaluation/CallLocation;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "psiElement", "Lcom/intellij/psi/PsiElement;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/psi/PsiElement;)V", "getFile", "()Lcom/intellij/psi/PsiFile;", "getProject", "()Lcom/intellij/openapi/project/Project;", "getPsiElement", "()Lcom/intellij/psi/PsiElement;", "getIntentionCallContext", "Lcom/intellij/ml/llm/evaluation/IntentionCallContext;", "toJson", "", "intellij.ml.llm"})
/*    */ public final class PsiElementCallLocation implements CallLocation {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final PsiFile file;
/*    */   @NotNull
/*    */   private final PsiElement psiElement;
/*    */   
/* 13 */   public PsiElementCallLocation(@NotNull Project project, @NotNull PsiFile file, @NotNull PsiElement psiElement) { this.project = project;
/* 14 */     this.file = file;
/* 15 */     this.psiElement = psiElement; } @NotNull public final Project getProject() { return this.project; } @NotNull public final PsiElement getPsiElement() { return this.psiElement; }
/*    */   @NotNull
/*    */   public final PsiFile getFile() { return this.file; } @NotNull
/* 18 */   public IntentionCallContext getIntentionCallContext() { FileEditorManager editorManager = FileEditorManager.getInstance(this.project);
/* 19 */     OpenFileDescriptor openFileDescriptor = new OpenFileDescriptor(this.project, this.file.getVirtualFile());
/* 20 */     Editor editor = editorManager.openTextEditor(openFileDescriptor, false);
/*    */     
/* 22 */     if (editor != null && editor.getCaretModel() != null) { editor.getCaretModel().moveToOffset(this.psiElement.getTextOffset()); } else { editor.getCaretModel(); }
/* 23 */      if (editor != null && editor.getSelectionModel() != null) { editor.getSelectionModel().removeSelection(); } else { editor.getSelectionModel(); }
/*    */     
/* 25 */     return new IntentionCallContext(this.project, editor, this.file); }
/*    */   
/*    */   @NotNull
/*    */   public String toJson() {
/* 29 */     return "{\"file\": \"" + this.file.getVirtualFile().getPath() + "\", \"textOffset\": " + this.psiElement.getTextOffset() + "}";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/evaluation/PsiElementCallLocation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */