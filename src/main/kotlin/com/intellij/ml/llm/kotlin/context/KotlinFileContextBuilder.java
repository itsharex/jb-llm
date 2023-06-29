/*    */ package com.intellij.ml.llm.kotlin.context;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.util.PsiTreeUtil;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.kotlin.psi.KtImportList;
/*    */ import org.jetbrains.kotlin.psi.KtPackageDirective;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/kotlin/context/KotlinFileContextBuilder;", "Lcom/intellij/ml/llm/context/filebuilder/FileContextBuilder;", "()V", "getFileContext", "Lcom/intellij/ml/llm/context/FileContext;", "psiFile", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nKotlinFileContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinFileContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinFileContextBuilder\n+ 2 psiTreeUtil.kt\ncom/intellij/psi/util/PsiTreeUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n412#2:26\n412#2:27\n412#2:34\n412#2:35\n1360#3:28\n1446#3,5:29\n*S KotlinDebug\n*F\n+ 1 KotlinFileContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinFileContextBuilder\n*L\n19#1:26\n20#1:27\n21#1:34\n22#1:35\n20#1:28\n20#1:29,5\n*E\n"})
/*    */ public final class KotlinFileContextBuilder implements FileContextBuilder {
/*    */   @NotNull
/*    */   public FileContext getFileContext(@NotNull PsiFile psiFile) {
/* 15 */     Intrinsics.checkNotNullParameter(psiFile, "psiFile");
/*    */     
/* 17 */     Intrinsics.checkNotNullExpressionValue(psiFile.getName(), "psiFile.name");
/* 18 */     Intrinsics.checkNotNullExpressionValue(psiFile.getVirtualFile().getPath(), "psiFile.virtualFile.path");
/* 19 */     PsiElement psiElement2 = (PsiElement)psiFile; int j = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 26 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, KtPackageDirective.class), "getChildrenOfTypeAsList(this, T::class.java)"); (KtPackageDirective)CollectionsKt.firstOrNull(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, KtPackageDirective.class)); PsiElement psiElement1 = (PsiElement)psiFile; int i = 0;
/* 27 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList(psiElement1, KtImportList.class), "getChildrenOfTypeAsList(this, T::class.java)"); List list1 = PsiTreeUtil.getChildrenOfTypeAsList(psiElement1, KtImportList.class); String str3 = ((KtPackageDirective)CollectionsKt.firstOrNull(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, KtPackageDirective.class)) != null) ? ((KtPackageDirective)CollectionsKt.firstOrNull(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, KtPackageDirective.class))).getText() : null, str2 = psiFile.getVirtualFile().getPath(), str1 = psiFile.getName(); PsiFile psiFile1 = psiFile; int $i$f$flatMap = 0;
/* 28 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 29 */     for (Object element$iv$iv : list2) {
/* 30 */       KtImportList it = (KtImportList)element$iv$iv; int $i$a$-flatMap-KotlinFileContextBuilder$getFileContext$1 = 0; Intrinsics.checkNotNullExpressionValue(it.getImports(), "it.imports"); Iterable list$iv$iv = it.getImports();
/* 31 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 33 */     List list3 = (List)destination$iv$iv; PsiElement $this$childrenOfType$iv = (PsiElement)psiFile; int $i$f$childrenOfType = 0;
/* 34 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, KtClassOrObject.class), "getChildrenOfTypeAsList(this, T::class.java)"); $this$childrenOfType$iv = (PsiElement)psiFile; $i$f$childrenOfType = 0;
/* 35 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, KtNamedFunction.class), "getChildrenOfTypeAsList(this, T::class.java)"); List list4 = PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, KtNamedFunction.class), list5 = PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, KtClassOrObject.class), list6 = list3;
/*    */     String str4 = str3, str5 = str2, str6 = str1;
/*    */     PsiFile psiFile2 = psiFile1;
/*    */     return new FileContext(psiFile2, str6, str5, str4, list6, list5, list4);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/context/KotlinFileContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */