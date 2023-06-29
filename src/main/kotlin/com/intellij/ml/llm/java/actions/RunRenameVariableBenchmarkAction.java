/*    */ package com.intellij.ml.llm.java.actions;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.PsiLocalVariable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\022\020\t\032\f0\b¢\006\002\b\n¢\006\002\b\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameVariableBenchmarkAction;", "Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction;", "()V", "findTargetElement", "Lcom/intellij/psi/PsiLocalVariable;", "psiFile", "Lcom/intellij/psi/PsiFile;", "context", "", "getName", "Lorg/jetbrains/annotations/NotNull;", "Lorg/jetbrains/annotations/Nls;", "intellij.ml.llm.java"})
/*    */ public final class RunRenameVariableBenchmarkAction extends RunRenameBenchmarkAction {
/*    */   @NotNull
/*    */   public String getName() {
/* 11 */     return LLMBundle.message("action.RunRenameVariableBenchmarkAction.task.name", new Object[0]);
/*    */   } @Nullable
/*    */   public PsiLocalVariable findTargetElement(@NotNull PsiFile psiFile, @NotNull String context) {
/* 14 */     Intrinsics.checkNotNullParameter(psiFile, "psiFile"); Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullExpressionValue(psiFile.getText(), "psiFile.text"); int offset = StringsKt.indexOf$default(psiFile.getText(), context, 0, false, 6, null);
/* 15 */     PsiElement startElement = psiFile.getViewProvider().findElementAt(offset, (Language)JavaLanguage.INSTANCE);
/* 16 */     PsiLocalVariable variable = (PsiLocalVariable)ReadAction.compute(startElement::findTargetElement$lambda$0);
/*    */ 
/*    */     
/* 19 */     return variable;
/*    */   }
/*    */   
/*    */   private static final PsiLocalVariable findTargetElement$lambda$0(PsiElement $startElement) {
/*    */     return (PsiLocalVariable)PsiTreeUtil.getParentOfType($startElement, PsiLocalVariable.class, false);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameVariableBenchmarkAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */