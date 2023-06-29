/*    */ package com.intellij.ml.llm.java.actions;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.PsiMethod;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\022\020\t\032\f0\b¢\006\002\b\n¢\006\002\b\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/java/actions/RunRenameMethodBenchmarkAction;", "Lcom/intellij/ml/llm/java/actions/RunRenameBenchmarkAction;", "()V", "findTargetElement", "Lcom/intellij/psi/PsiNamedElement;", "psiFile", "Lcom/intellij/psi/PsiFile;", "context", "", "getName", "Lorg/jetbrains/annotations/NotNull;", "Lorg/jetbrains/annotations/Nls;", "intellij.ml.llm.java"})
/*    */ public final class RunRenameMethodBenchmarkAction extends RunRenameBenchmarkAction {
/*    */   @NotNull
/*    */   public String getName() {
/* 12 */     return LLMBundle.message("action.RunRenameMethodBenchmarkAction.task.name", new Object[0]);
/*    */   }
/*    */   @Nullable
/* 15 */   public PsiNamedElement findTargetElement(@NotNull PsiFile psiFile, @NotNull String context) { Intrinsics.checkNotNullParameter(psiFile, "psiFile"); Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullExpressionValue(psiFile.getText(), "psiFile.text"); int offset = StringsKt.indexOf$default(psiFile.getText(), context, 0, false, 6, null);
/* 16 */     PsiElement startElement = psiFile.getViewProvider().findElementAt(offset, (Language)JavaLanguage.INSTANCE);
/* 17 */     return (PsiNamedElement)ReadAction.compute(startElement::findTargetElement$lambda$0); } private static final PsiMethod findTargetElement$lambda$0(PsiElement $startElement) {
/* 18 */     return (PsiMethod)PsiTreeUtil.getParentOfType($startElement, PsiMethod.class, false);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/actions/RunRenameMethodBenchmarkAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */