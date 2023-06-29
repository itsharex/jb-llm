/*    */ package com.intellij.ml.llm.java.context;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/java/context/JavaClassContextBuilder;", "Lcom/intellij/ml/llm/context/classbuilder/ClassContextBuilder;", "()V", "getClassContext", "Lcom/intellij/ml/llm/context/ClassContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "gatherUsages", "", "intellij.ml.llm.java"})
/*    */ @SourceDebugExtension({"SMAP\nJavaClassContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaClassContextBuilder.kt\ncom/intellij/ml/llm/java/context/JavaClassContextBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n11653#2,9:33\n13579#2:42\n13580#2:44\n11662#2:45\n1#3:43\n*S KotlinDebug\n*F\n+ 1 JavaClassContextBuilder.kt\ncom/intellij/ml/llm/java/context/JavaClassContextBuilder\n*L\n20#1:33,9\n20#1:42\n20#1:44\n20#1:45\n20#1:43\n*E\n"})
/*    */ public final class JavaClassContextBuilder implements ClassContextBuilder {
/*    */   @Nullable
/*    */   public ClassContext getClassContext(@NotNull PsiElement psiElement, boolean gatherUsages) {
/*    */     Collection destination$iv$iv;
/*    */     Object[] $this$forEach$iv$iv$iv;
/*    */     byte b;
/*    */     int i;
/*    */     PsiElement psiElement1;
/*    */     String str1, str2;
/*    */     List list1, list2;
/* 13 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof PsiClass)
/*    */     
/*    */     { 
/*    */ 
/*    */       
/* 18 */       Intrinsics.checkNotNullExpressionValue(((PsiClass)psiElement).getMethods(), "psiElement.methods");
/* 19 */       Intrinsics.checkNotNullExpressionValue(((PsiClass)psiElement).getFields(), "psiElement.fields");
/* 20 */       Intrinsics.checkNotNullExpressionValue(((PsiClass)psiElement).getSupers(), "psiElement.supers"); Object[] arrayOfObject1 = (Object[])((PsiClass)psiElement).getSupers(); list2 = ArraysKt.toList((Object[])((PsiClass)psiElement).getFields()); list1 = ArraysKt.toList((Object[])((PsiClass)psiElement).getMethods()); str2 = ((PsiClass)psiElement).getName(); str1 = ((PsiClass)psiElement).getText(); psiElement1 = psiElement; int $i$f$mapNotNull = 0;
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
/* 33 */       Object[] arrayOfObject2 = arrayOfObject1; destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 41 */       $this$forEach$iv$iv$iv = arrayOfObject2; int $i$f$forEach = 0;
/* 42 */       b = 0; i = $this$forEach$iv$iv$iv.length; } else { return null; }  if (b < i) { Object element$iv$iv$iv = $this$forEach$iv$iv$iv[b], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; PsiClass it = (PsiClass)element$iv$iv;
/*    */       int $i$a$-mapNotNull-JavaClassContextBuilder$getClassContext$1 = 0; }
/*    */     
/* 45 */     List list3 = (List)destination$iv$iv;
/*    */     List list4 = gatherUsages ? JavaContextCollectionUtilsKt.findUsages((PsiNameIdentifierOwner)psiElement) : CollectionsKt.emptyList(), list5 = CollectionsKt.toList(list3), list6 = list2, list7 = list1;
/*    */     String str3 = str2, str4 = str1;
/*    */     PsiElement psiElement2 = psiElement1;
/*    */     return new ClassContext(psiElement2, str4, str3, list7, list6, list5, list4);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/context/JavaClassContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */