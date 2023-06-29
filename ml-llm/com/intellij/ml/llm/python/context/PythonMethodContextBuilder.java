/*    */ package com.intellij.ml.llm.python.context;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import com.jetbrains.python.psi.PyParameter;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\"\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/python/context/PythonMethodContextBuilder;", "Lcom/intellij/ml/llm/context/methodbuilder/MethodContextBuilder;", "()V", "getMethodContext", "Lcom/intellij/ml/llm/context/MethodContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeClassContext", "", "gatherUsages", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nPythonMethodContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonMethodContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonMethodContextBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n11335#2:36\n11670#2,3:37\n*S KotlinDebug\n*F\n+ 1 PythonMethodContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonMethodContextBuilder\n*L\n23#1:36\n23#1:37,3\n*E\n"})
/*    */ public final class PythonMethodContextBuilder implements MethodContextBuilder {
/*    */   @Nullable
/*    */   public MethodContext getMethodContext(@NotNull PsiElement psiElement, boolean includeClassContext, boolean gatherUsages) {
/* 14 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof PyFunction) {
/*    */ 
/*    */       
/* 17 */       Intrinsics.checkNotNullExpressionValue(((PyFunction)psiElement).getText(), "psiElement.text");
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       ((PyFunction)psiElement).getReturnStatementType(TypeEvalContext.codeInsightFallback(((PyFunction)psiElement).getProject()));
/* 23 */       Intrinsics.checkNotNullExpressionValue(((PyFunction)psiElement).getParameterList().getParameters(), "psiElement.parameterList.parameters"); Object[] arrayOfObject1 = (Object[])((PyFunction)psiElement).getParameterList().getParameters(); String str5 = (((PyFunction)psiElement).getReturnStatementType(TypeEvalContext.codeInsightFallback(((PyFunction)psiElement).getProject())) != null) ? ((PyFunction)psiElement).getReturnStatementType(TypeEvalContext.codeInsightFallback(((PyFunction)psiElement).getProject())).getName() : null, str4 = ((PyFunction)psiElement).getLanguage().getDisplayName(); PsiElement psiElement2 = (PsiElement)((PyFunction)psiElement).getContainingClass(); String str3 = ((PyFunction)psiElement).getQualifiedName(), str2 = ((PyFunction)psiElement).getName(), str1 = ((PyFunction)psiElement).getText(); PsiElement psiElement1 = psiElement; int $i$f$map = 0;
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
/* 36 */       Object[] arrayOfObject2 = arrayOfObject1; Collection destination$iv$iv = new ArrayList(arrayOfObject1.length); int $i$f$mapTo = 0; byte b; int i;
/* 37 */       for (b = 0, i = arrayOfObject2.length; b < i; ) { Object item$iv$iv = arrayOfObject2[b];
/* 38 */         PyParameter pyParameter = (PyParameter)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-PythonMethodContextBuilder$getMethodContext$1 = 0; if (pyParameter.getName() == null)
/* 39 */           pyParameter.getName();  }  List list1 = (List)destination$iv$iv;
/*    */       List list2 = gatherUsages ? PythonVariableContextBuilderKt.findUsages((PsiNameIdentifierOwner)psiElement) : CollectionsKt.emptyList();
/*    */       boolean bool = includeClassContext;
/*    */       List list3 = list1;
/*    */       String str6 = str5, str7 = str4;
/*    */       PsiElement psiElement3 = psiElement2;
/*    */       String str8 = str3, str9 = str2, str10 = str1;
/*    */       PsiElement psiElement4 = psiElement1;
/*    */     } else {
/*    */     
/*    */     } 
/*    */     return null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PythonMethodContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */