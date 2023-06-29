/*    */ package com.intellij.ml.llm.java.context;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.PsiPackageStatement;
/*    */ import com.intellij.psi.util.PsiTreeUtil;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/java/context/JavaFileContextBuilder;", "Lcom/intellij/ml/llm/context/filebuilder/FileContextBuilder;", "()V", "getFileContext", "Lcom/intellij/ml/llm/context/FileContext;", "psiFile", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm.java"})
/*    */ @SourceDebugExtension({"SMAP\nJavaFileContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaFileContextBuilder.kt\ncom/intellij/ml/llm/java/context/JavaFileContextBuilder\n+ 2 psiTreeUtil.kt\ncom/intellij/psi/util/PsiTreeUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n412#2:25\n412#2:26\n412#2:33\n1360#3:27\n1446#3,5:28\n*S KotlinDebug\n*F\n+ 1 JavaFileContextBuilder.kt\ncom/intellij/ml/llm/java/context/JavaFileContextBuilder\n*L\n18#1:25\n19#1:26\n20#1:33\n19#1:27\n19#1:28,5\n*E\n"})
/*    */ public final class JavaFileContextBuilder implements FileContextBuilder {
/*    */   @NotNull
/*    */   public FileContext getFileContext(@NotNull PsiFile psiFile) {
/* 14 */     Intrinsics.checkNotNullParameter(psiFile, "psiFile");
/*    */     
/* 16 */     Intrinsics.checkNotNullExpressionValue(psiFile.getName(), "psiFile.name");
/* 17 */     Intrinsics.checkNotNullExpressionValue(psiFile.getVirtualFile().getPath(), "psiFile.virtualFile.path");
/* 18 */     PsiElement psiElement2 = (PsiElement)psiFile; int j = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, PsiPackageStatement.class), "getChildrenOfTypeAsList(this, T::class.java)"); (PsiPackageStatement)CollectionsKt.firstOrNull(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, PsiPackageStatement.class)); PsiElement psiElement1 = (PsiElement)psiFile; int i = 0;
/* 26 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList(psiElement1, PsiImportList.class), "getChildrenOfTypeAsList(this, T::class.java)"); List list1 = PsiTreeUtil.getChildrenOfTypeAsList(psiElement1, PsiImportList.class); String str3 = ((PsiPackageStatement)CollectionsKt.firstOrNull(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, PsiPackageStatement.class)) != null) ? ((PsiPackageStatement)CollectionsKt.firstOrNull(PsiTreeUtil.getChildrenOfTypeAsList(psiElement2, PsiPackageStatement.class))).getText() : null, str2 = psiFile.getVirtualFile().getPath(), str1 = psiFile.getName(); PsiFile psiFile1 = psiFile; int $i$f$flatMap = 0;
/* 27 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 28 */     for (Object element$iv$iv : list2) {
/* 29 */       PsiImportList it = (PsiImportList)element$iv$iv; int $i$a$-flatMap-JavaFileContextBuilder$getFileContext$1 = 0; Intrinsics.checkNotNullExpressionValue(it.getAllImportStatements(), "it.allImportStatements"); Iterable list$iv$iv = ArraysKt.toList((Object[])it.getAllImportStatements());
/* 30 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 32 */     List list3 = (List)destination$iv$iv; PsiElement $this$childrenOfType$iv = (PsiElement)psiFile; int $i$f$childrenOfType = 0;
/* 33 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, PsiClass.class), "getChildrenOfTypeAsList(this, T::class.java)"); List list4 = CollectionsKt.emptyList(), list5 = PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, PsiClass.class), list6 = list3;
/*    */     String str4 = str3, str5 = str2, str6 = str1;
/*    */     PsiFile psiFile2 = psiFile1;
/*    */     return new FileContext(psiFile2, str6, str5, str4, list6, list5, list4);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/context/JavaFileContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */