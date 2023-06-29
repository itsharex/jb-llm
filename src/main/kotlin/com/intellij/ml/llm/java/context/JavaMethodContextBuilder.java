/*    */ package com.intellij.ml.llm.java.context;@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\"\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH\026J\024\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\013H\002¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/java/context/JavaMethodContextBuilder;", "Lcom/intellij/ml/llm/context/methodbuilder/MethodContextBuilder;", "()V", "getMethodContext", "Lcom/intellij/ml/llm/context/MethodContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeClassContext", "", "gatherUsages", "processReturnTypeText", "", "returnType", "intellij.ml.llm.java"})
/*    */ @SourceDebugExtension({"SMAP\nJavaMethodContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaMethodContextBuilder.kt\ncom/intellij/ml/llm/java/context/JavaMethodContextBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n11653#2,9:51\n13579#2:60\n13580#2:62\n11662#2:63\n1#3:61\n*S KotlinDebug\n*F\n+ 1 JavaMethodContextBuilder.kt\ncom/intellij/ml/llm/java/context/JavaMethodContextBuilder\n*L\n23#1:51,9\n23#1:60\n23#1:62\n23#1:63\n23#1:61\n*E\n"})
/*    */ public final class JavaMethodContextBuilder implements MethodContextBuilder {
/*    */   @Nullable
/*    */   public MethodContext getMethodContext(@NotNull PsiElement psiElement, boolean includeClassContext, boolean gatherUsages) {
/*    */     Collection destination$iv$iv;
/*    */     Object[] $this$forEach$iv$iv$iv;
/*    */     byte b;
/*    */     int i;
/*    */     PsiElement psiElement1;
/*    */     String str1, str2, str3;
/*    */     PsiElement psiElement2;
/*    */     String str4, str5;
/* 14 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof PsiMethod)
/*    */     
/*    */     { 
/* 17 */       Intrinsics.checkNotNullExpressionValue(((PsiMethod)psiElement).getText(), "psiElement.text");
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       ((PsiMethod)psiElement).getReturnType();
/* 23 */       Intrinsics.checkNotNullExpressionValue(((PsiMethod)psiElement).getParameters(), "psiElement.parameters"); Object[] arrayOfObject1 = (Object[])((PsiMethod)psiElement).getParameters(); str5 = processReturnTypeText((((PsiMethod)psiElement).getReturnType() != null) ? ((PsiMethod)psiElement).getReturnType().getPresentableText() : null); str4 = ((PsiMethod)psiElement).getLanguage().getDisplayName(); psiElement2 = (PsiElement)((PsiMethod)psiElement).getContainingClass(); str3 = JavaMethodContextBuilderKt.access$getSignatureString((PsiMethod)psiElement); str2 = ((PsiMethod)psiElement).getName(); str1 = ((PsiMethod)psiElement).getText(); psiElement1 = psiElement; int $i$f$mapNotNull = 0;
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
/*    */ 
/*    */ 
/*    */       
/* 51 */       Object[] arrayOfObject2 = arrayOfObject1; destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 59 */       $this$forEach$iv$iv$iv = arrayOfObject2; int $i$f$forEach = 0;
/* 60 */       b = 0; i = $this$forEach$iv$iv$iv.length; } else { return null; }  if (b < i) { Object element$iv$iv$iv = $this$forEach$iv$iv$iv[b], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; JvmParameter it = (JvmParameter)element$iv$iv;
/*    */       int $i$a$-mapNotNull-JavaMethodContextBuilder$getMethodContext$1 = 0; }
/*    */     
/* 63 */     List list1 = (List)destination$iv$iv;
/*    */     List list2 = gatherUsages ? JavaContextCollectionUtilsKt.findUsages((PsiNameIdentifierOwner)psiElement) : CollectionsKt.emptyList();
/*    */     boolean bool = includeClassContext;
/*    */     List list3 = list1;
/*    */     String str6 = str5, str7 = str4;
/*    */     PsiElement psiElement3 = psiElement2;
/*    */     String str8 = str3, str9 = str2, str10 = str1;
/*    */     PsiElement psiElement4 = psiElement1;
/*    */     return new MethodContext(psiElement4, str10, str9, str8, psiElement3, str7, str6, list3, bool, list2);
/*    */   }
/*    */   
/*    */   private final String processReturnTypeText(String returnType) {
/*    */     if (Intrinsics.areEqual(returnType, "void"))
/*    */       return null; 
/*    */     return returnType;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/context/JavaMethodContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */