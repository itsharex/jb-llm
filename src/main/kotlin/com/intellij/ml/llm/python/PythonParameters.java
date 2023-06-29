/*    */ package com.intellij.ml.llm.python;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\t\032\0020\0042\006\020\n\032\0020\013H\026J\022\020\f\032\004\030\0010\0042\006\020\n\032\0020\013H\026J\022\020\r\032\004\030\0010\0042\006\020\n\032\0020\013H\026J\020\020\016\032\0020\0172\006\020\n\032\0020\013H\026J\030\020\020\032\0020\0212\006\020\n\032\0020\0132\006\020\022\032\0020\004H\026R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0020\0048VX\004¢\006\006\032\004\b\b\020\006¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/python/PythonParameters;", "Lcom/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters;", "()V", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "languageName", "getLanguageName", "extractAll", "element", "Lcom/intellij/psi/PsiElement;", "extractDocumentation", "extractMethodBody", "isMethod", "", "setDocumentation", "", "documentation", "intellij.ml.llm.python"})
/*    */ public final class PythonParameters implements LanguageParameters {
/*    */   @NotNull
/*    */   public String getFileExtension() {
/* 10 */     return "kt";
/*    */   } @NotNull
/*    */   public String getLanguageName() {
/* 13 */     return "Python";
/*    */   }
/*    */   public boolean isMethod(@NotNull PsiElement element) {
/* 16 */     Intrinsics.checkNotNullParameter(element, "element"); return element instanceof com.jetbrains.python.psi.PyFunction;
/*    */   } @Nullable
/*    */   public String extractDocumentation(@NotNull PsiElement element) {
/*    */     Object object;
/* 20 */     Intrinsics.checkNotNullParameter(element, "element"); if (((element instanceof com.jetbrains.python.psi.PyFunction) ? element : null) == null) { (element instanceof com.jetbrains.python.psi.PyFunction) ? element : null; return null; }
/* 21 */      return object.getDocStringValue();
/*    */   } @Nullable
/*    */   public String extractMethodBody(@NotNull PsiElement element) {
/*    */     Object object;
/* 25 */     Intrinsics.checkNotNullParameter(element, "element"); if (((element instanceof com.jetbrains.python.psi.PyFunction) ? element : null) == null) { (element instanceof com.jetbrains.python.psi.PyFunction) ? element : null; return null; }
/* 26 */      return object.getStatementList().getText();
/*    */   }
/*    */   
/*    */   public void setDocumentation(@NotNull PsiElement element, @NotNull String documentation) { Object object;
/* 30 */     Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(documentation, "documentation"); if (((element instanceof com.jetbrains.python.psi.PyFunction) ? element : null) == null) { (element instanceof com.jetbrains.python.psi.PyFunction) ? element : null; return; }
/* 31 */      Intrinsics.checkNotNullExpressionValue(PyElementGenerator.getInstance(object.getProject()).createDocstring(documentation).getExpression(), "getInstance(function.pro…documentation).expression"); PyExpression docComment = PyElementGenerator.getInstance(object.getProject()).createDocstring(documentation).getExpression();
/* 32 */     if (object.getDocStringExpression() != null) { object.getDocStringExpression().replace((PsiElement)docComment); } else { object.getDocStringExpression(); }
/*    */      } @NotNull
/*    */   public String extractAll(@NotNull PsiElement element) {
/*    */     Object object;
/* 36 */     Intrinsics.checkNotNullParameter(element, "element"); if (((element instanceof com.jetbrains.python.psi.PyFunction) ? element : null) == null) { (element instanceof com.jetbrains.python.psi.PyFunction) ? element : null; return ""; }
/* 37 */      Intrinsics.checkNotNullExpressionValue(object.getText(), "function.text"); return object.getText();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/PythonParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */