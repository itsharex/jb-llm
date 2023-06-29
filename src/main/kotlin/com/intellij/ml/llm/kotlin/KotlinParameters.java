/*    */ package com.intellij.ml.llm.kotlin;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtFunction;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\020\020\t\032\0020\0042\006\020\n\032\0020\013H\026J\022\020\f\032\004\030\0010\0042\006\020\n\032\0020\013H\026J\022\020\r\032\004\030\0010\0042\006\020\n\032\0020\013H\026J\020\020\016\032\0020\0172\006\020\n\032\0020\013H\026J\030\020\020\032\0020\0212\006\020\n\032\0020\0132\006\020\022\032\0020\004H\026R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0020\0048VX\004¢\006\006\032\004\b\b\020\006¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/kotlin/KotlinParameters;", "Lcom/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters;", "()V", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "languageName", "getLanguageName", "extractAll", "element", "Lcom/intellij/psi/PsiElement;", "extractDocumentation", "extractMethodBody", "isMethod", "", "setDocumentation", "", "documentation", "intellij.ml.llm.kotlin"})
/*    */ public final class KotlinParameters implements LanguageParameters {
/*    */   @NotNull
/*    */   public String getFileExtension() {
/* 10 */     return "kt";
/*    */   } @NotNull
/*    */   public String getLanguageName() {
/* 13 */     return "kotlin";
/*    */   }
/*    */   public boolean isMethod(@NotNull PsiElement element) {
/* 16 */     Intrinsics.checkNotNullParameter(element, "element"); return element instanceof KtFunction;
/*    */   }
/*    */   @Nullable
/*    */   public String extractDocumentation(@NotNull PsiElement element) {
/* 20 */     Intrinsics.checkNotNullParameter(element, "element"); KtFunction function = (KtFunction)element;
/* 21 */     function.getDocComment(); return (function.getDocComment() != null) ? function.getDocComment().getText() : null;
/*    */   }
/*    */   @Nullable
/*    */   public String extractMethodBody(@NotNull PsiElement element) {
/* 25 */     Intrinsics.checkNotNullParameter(element, "element"); KtFunction function = (KtFunction)element;
/* 26 */     function.getBodyBlockExpression(); return (function.getBodyBlockExpression() != null) ? function.getBodyBlockExpression().getText() : null;
/*    */   }
/*    */   
/*    */   public void setDocumentation(@NotNull PsiElement element, @NotNull String documentation) {
/* 30 */     Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(documentation, "documentation"); KtFunction function = (KtFunction)element;
/* 31 */     Intrinsics.checkNotNullExpressionValue(function.getProject(), "function.project"); KDoc docComment = (new KDocElementFactory(function.getProject())).createKDocFromText(documentation);
/* 32 */     if (function.getDocComment() == null || function.getDocComment().replace((PsiElement)docComment) == null) { function.getDocComment().replace((PsiElement)docComment); KotlinParameters $this$setDocumentation_u24lambda_u240 = this; int $i$a$-run-KotlinParameters$setDocumentation$1 = 0; }
/* 33 */      function.addBefore((PsiElement)docComment, function.getFirstChild());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String extractAll(@NotNull PsiElement element) {
/* 38 */     Intrinsics.checkNotNullParameter(element, "element"); KtFunction function = (KtFunction)element;
/* 39 */     Intrinsics.checkNotNullExpressionValue(function.getText(), "function.text"); return function.getText();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/KotlinParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */