/*    */ package com.intellij.ml.llm.python.context;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/python/context/PythonClassContextBuilder;", "Lcom/intellij/ml/llm/context/classbuilder/ClassContextBuilder;", "()V", "getClassContext", "Lcom/intellij/ml/llm/context/ClassContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "gatherUsages", "", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nPythonClassContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonClassContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonClassContextBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1603#2,9:29\n1855#2:38\n1856#2:40\n1612#2:41\n1#3:39\n*S KotlinDebug\n*F\n+ 1 PythonClassContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonClassContextBuilder\n*L\n17#1:29,9\n17#1:38\n17#1:40\n17#1:41\n17#1:39\n*E\n"})
/*    */ public final class PythonClassContextBuilder implements ClassContextBuilder { @Nullable
/*    */   public ClassContext getClassContext(@NotNull PsiElement psiElement, boolean gatherUsages) {
/*    */     Collection destination$iv$iv;
/*    */     Iterator iterator;
/*    */     PsiElement psiElement1;
/*    */     String str1, str2;
/*    */     List list1, list2;
/* 10 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof PyClass)
/*    */     
/*    */     { 
/*    */ 
/*    */       
/* 15 */       Intrinsics.checkNotNullExpressionValue(((PyClass)psiElement).getMethods(), "psiElement.methods");
/* 16 */       Intrinsics.checkNotNullExpressionValue(((PyClass)psiElement).getClassAttributes(), "psiElement.classAttributes");
/* 17 */       Intrinsics.checkNotNullExpressionValue(((PyClass)psiElement).getAncestorClasses(TypeEvalContext.codeInsightFallback(((PyClass)psiElement).getProject())), "psiElement.getAncestorCl…back(psiElement.project))"); List list8 = ((PyClass)psiElement).getAncestorClasses(TypeEvalContext.codeInsightFallback(((PyClass)psiElement).getProject())); list2 = ((PyClass)psiElement).getClassAttributes(); list1 = ArraysKt.toList((Object[])((PyClass)psiElement).getMethods()); str2 = ((PyClass)psiElement).getName(); str1 = ((PyClass)psiElement).getText(); psiElement1 = psiElement; int $i$f$mapNotNull = 0;
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
/* 29 */       List list9 = list8; destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 37 */       Iterable $this$forEach$iv$iv$iv = list9; int $i$f$forEach = 0;
/* 38 */       iterator = $this$forEach$iv$iv$iv.iterator(); } else { return null; }  if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PyClass it = (PyClass)element$iv$iv;
/*    */       int $i$a$-mapNotNull-PythonClassContextBuilder$getClassContext$1 = 0; }
/*    */     
/* 41 */     List list3 = (List)destination$iv$iv;
/*    */     List list4 = gatherUsages ? PythonVariableContextBuilderKt.findUsages((PsiNameIdentifierOwner)psiElement) : CollectionsKt.emptyList(), list5 = CollectionsKt.toList(list3), list6 = list2, list7 = list1;
/*    */     String str3 = str2, str4 = str1;
/*    */     PsiElement psiElement2 = psiElement1;
/*    */     return new ClassContext(psiElement2, str4, str3, list7, list6, list5, list4);
/*    */   } }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PythonClassContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */