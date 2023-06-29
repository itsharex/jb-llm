/*    */ package com.intellij.ml.llm.kotlin.context;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.List;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\"\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/kotlin/context/KotlinMethodContextBuilder;", "Lcom/intellij/ml/llm/context/methodbuilder/MethodContextBuilder;", "()V", "getMethodContext", "Lcom/intellij/ml/llm/context/MethodContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeClassContext", "", "gatherUsages", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nKotlinMethodContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinMethodContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinMethodContextBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1603#2,9:47\n1855#2:56\n1856#2:58\n1612#2:59\n1#3:57\n*S KotlinDebug\n*F\n+ 1 KotlinMethodContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinMethodContextBuilder\n*L\n25#1:47,9\n25#1:56\n25#1:58\n25#1:59\n25#1:57\n*E\n"})
/*    */ public final class KotlinMethodContextBuilder implements MethodContextBuilder {
/*    */   @Nullable
/*    */   public MethodContext getMethodContext(@NotNull PsiElement psiElement, boolean includeClassContext, boolean gatherUsages) {
/*    */     Collection destination$iv$iv;
/*    */     Iterator iterator;
/*    */     PsiElement psiElement1;
/*    */     String str1, str2, str3;
/*    */     PsiElement psiElement2;
/*    */     String str4, str5;
/* 16 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof KtNamedFunction)
/*    */     
/*    */     { 
/* 19 */       Intrinsics.checkNotNullExpressionValue(((KtNamedFunction)psiElement).getText(), "psiElement.text");
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       CallableBuilderKt.getReturnTypeReference((KtNamedDeclaration)psiElement);
/* 25 */       Intrinsics.checkNotNullExpressionValue(((KtNamedFunction)psiElement).getValueParameters(), "psiElement.valueParameters"); List list4 = ((KtNamedFunction)psiElement).getValueParameters(); str5 = (CallableBuilderKt.getReturnTypeReference((KtNamedDeclaration)psiElement) != null) ? CallableBuilderKt.getReturnTypeReference((KtNamedDeclaration)psiElement).getText() : null; str4 = ((KtNamedFunction)psiElement).getLanguage().getDisplayName(); psiElement2 = (PsiElement)KtPsiUtilKt.containingClass((KtElement)psiElement); str3 = KotlinMethodContextBuilderKt.getSignatureString((KtNamedFunction)psiElement); str2 = ((KtNamedFunction)psiElement).getName(); str1 = ((KtNamedFunction)psiElement).getText(); psiElement1 = psiElement; int $i$f$mapNotNull = 0;
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
/* 47 */       List list5 = list4; destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 55 */       Iterable $this$forEach$iv$iv$iv = list5; int $i$f$forEach = 0;
/* 56 */       iterator = $this$forEach$iv$iv$iv.iterator(); } else { return null; }  if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; KtParameter it = (KtParameter)element$iv$iv;
/*    */       int $i$a$-mapNotNull-KotlinMethodContextBuilder$getMethodContext$1 = 0; }
/*    */     
/* 59 */     List list1 = (List)destination$iv$iv;
/*    */     List list2 = gatherUsages ? JavaContextCollectionUtilsKt.findUsages((PsiNameIdentifierOwner)psiElement) : CollectionsKt.emptyList();
/*    */     boolean bool = includeClassContext;
/*    */     List list3 = list1;
/*    */     String str6 = str5, str7 = str4;
/*    */     PsiElement psiElement3 = psiElement2;
/*    */     String str8 = str3, str9 = str2, str10 = str1;
/*    */     PsiElement psiElement4 = psiElement1;
/*    */     return new MethodContext(psiElement4, str10, str9, str8, psiElement3, str7, str6, list3, bool, list2);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/context/KotlinMethodContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */