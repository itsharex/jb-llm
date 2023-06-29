/*    */ package com.intellij.ml.llm.intentions.internal.chat;
/*    */ 
/*    */ import com.intellij.ml.llm.LLMBundle;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020\003\032\0020\004H\026J\b\020\005\032\0020\004H\026J$\020\006\032\0020\0072\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\rH\026¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/intentions/internal/chat/OptimizeCodeChatIntention;", "Lcom/intellij/ml/llm/intentions/chat/AbstractChatIntention;", "()V", "getFamilyName", "", "getText", "isAvailable", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ public final class OptimizeCodeChatIntention extends AbstractChatIntention {
/* 11 */   public OptimizeCodeChatIntention() { super("Optimize the following code:"); } @NotNull
/* 12 */   public String getText() { return LLMBundle.message("intentions.chat.optimize.code.name", new Object[0]); } @NotNull
/*    */   public String getFamilyName() {
/* 14 */     return LLMBundle.message("intentions.chat.optimize.code.family.name", new Object[0]);
/*    */   }
/*    */   public boolean isAvailable(@NotNull Project project, @Nullable Editor editor, @Nullable PsiFile file) {
/* 17 */     Intrinsics.checkNotNullParameter(project, "project"); return (super.isAvailable(project, editor, file) && Registry.is("llm.is.internal"));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/chat/OptimizeCodeChatIntention.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */