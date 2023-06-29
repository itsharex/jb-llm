/*    */ package com.intellij.ml.llm.java;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiMethod;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\020\020\t\032\0020\0042\006\020\n\032\0020\013H\026J\022\020\f\032\004\030\0010\0042\006\020\n\032\0020\013H\026J\022\020\r\032\004\030\0010\0042\006\020\n\032\0020\013H\026J\020\020\016\032\0020\0172\006\020\n\032\0020\013H\026J\030\020\020\032\0020\0212\006\020\n\032\0020\0132\006\020\022\032\0020\004H\026R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0020\0048VX\004¢\006\006\032\004\b\b\020\006¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/java/JavaParameters;", "Lcom/intellij/ml/llm/dokuGuard/api/languages/LanguageParameters;", "()V", "fileExtension", "", "getFileExtension", "()Ljava/lang/String;", "languageName", "getLanguageName", "extractAll", "element", "Lcom/intellij/psi/PsiElement;", "extractDocumentation", "extractMethodBody", "isMethod", "", "setDocumentation", "", "documentation", "intellij.ml.llm.java"})
/*    */ public final class JavaParameters implements LanguageParameters {
/*    */   @NotNull
/* 10 */   public String getFileExtension() { return "java"; } @NotNull
/*    */   public String getLanguageName() {
/* 12 */     return "java";
/*    */   }
/*    */   public boolean isMethod(@NotNull PsiElement element) {
/* 15 */     Intrinsics.checkNotNullParameter(element, "element"); return element instanceof PsiMethod;
/*    */   }
/*    */   @Nullable
/*    */   public String extractDocumentation(@NotNull PsiElement element) {
/* 19 */     Intrinsics.checkNotNullParameter(element, "element"); PsiMethod method = (PsiMethod)element;
/* 20 */     method.getDocComment(); return (method.getDocComment() != null) ? method.getDocComment().getText() : null;
/*    */   }
/*    */   @Nullable
/*    */   public String extractMethodBody(@NotNull PsiElement element) {
/* 24 */     Intrinsics.checkNotNullParameter(element, "element"); PsiMethod method = (PsiMethod)element;
/* 25 */     method.getParameterList();
/* 26 */     method.getBody(); return (method.getBody() != null) ? method.getBody().getText() : null;
/*    */   }
/*    */   @NotNull
/*    */   public String extractAll(@NotNull PsiElement element) {
/* 30 */     Intrinsics.checkNotNullParameter(element, "element"); PsiMethod method = (PsiMethod)element;
/* 31 */     Intrinsics.checkNotNullExpressionValue(method.getText(), "method.text"); return method.getText();
/*    */   }
/*    */   public void setDocumentation(@NotNull PsiElement element, @NotNull String documentation) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'element'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'documentation'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_1
/*    */     //   13: checkcast com/intellij/psi/PsiMethod
/*    */     //   16: astore_3
/*    */     //   17: aload_3
/*    */     //   18: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   23: invokestatic getElementFactory : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiElementFactory;
/*    */     //   26: aload_2
/*    */     //   27: invokeinterface createDocCommentFromText : (Ljava/lang/String;)Lcom/intellij/psi/javadoc/PsiDocComment;
/*    */     //   32: dup
/*    */     //   33: ldc 'getElementFactory(method…ntFromText(documentation)'
/*    */     //   35: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   38: astore #4
/*    */     //   40: aload_1
/*    */     //   41: checkcast com/intellij/psi/PsiMethod
/*    */     //   44: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   49: aload_3
/*    */     //   50: aload #4
/*    */     //   52: aload_0
/*    */     //   53: <illegal opcode> run : (Lcom/intellij/psi/PsiMethod;Lcom/intellij/psi/javadoc/PsiDocComment;Lcom/intellij/ml/llm/java/JavaParameters;)Ljava/lang/Runnable;
/*    */     //   58: invokestatic runWriteCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/Runnable;)V
/*    */     //   61: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 12
/*    */     //   #36	-> 17
/*    */     //   #37	-> 40
/*    */     //   #42	-> 61
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	45	3	method	Lcom/intellij/psi/PsiMethod;
/*    */     //   40	22	4	docComment	Lcom/intellij/psi/javadoc/PsiDocComment;
/*    */     //   0	62	0	this	Lcom/intellij/ml/llm/java/JavaParameters;
/*    */     //   0	62	1	element	Lcom/intellij/psi/PsiElement;
/*    */     //   0	62	2	documentation	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final void setDocumentation$lambda$1(PsiMethod $method, PsiDocComment $docComment, JavaParameters this$0) {
/* 38 */     Intrinsics.checkNotNullParameter($method, "$method"); Intrinsics.checkNotNullParameter($docComment, "$docComment"); Intrinsics.checkNotNullParameter(this$0, "this$0"); if ($method.getDocComment() == null || $method.getDocComment().replace((PsiElement)$docComment) == null) { $method.getDocComment().replace((PsiElement)$docComment); JavaParameters $this$setDocumentation_u24lambda_u241_u24lambda_u240 = this$0; int $i$a$-run-JavaParameters$setDocumentation$1$1 = 0; }
/* 39 */      $method.addBefore((PsiElement)$docComment, $method.getFirstChild());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/JavaParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */