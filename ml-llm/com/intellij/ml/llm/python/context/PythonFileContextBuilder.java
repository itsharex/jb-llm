/*    */ package com.intellij.ml.llm.python.context;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.util.PsiTreeUtil;
/*    */ import com.jetbrains.python.psi.PyImportStatementBase;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/python/context/PythonFileContextBuilder;", "Lcom/intellij/ml/llm/context/filebuilder/FileContextBuilder;", "()V", "getFileContext", "Lcom/intellij/ml/llm/context/FileContext;", "psiFile", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nPythonFileContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonFileContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonFileContextBuilder\n+ 2 psiTreeUtil.kt\ncom/intellij/psi/util/PsiTreeUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n412#2:23\n412#2:30\n412#2:31\n1360#3:24\n1446#3,5:25\n*S KotlinDebug\n*F\n+ 1 PythonFileContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonFileContextBuilder\n*L\n18#1:23\n19#1:30\n20#1:31\n18#1:24\n18#1:25,5\n*E\n"})
/*    */ public final class PythonFileContextBuilder implements FileContextBuilder {
/*    */   @NotNull
/*    */   public FileContext getFileContext(@NotNull PsiFile psiFile) {
/* 14 */     Intrinsics.checkNotNullParameter(psiFile, "psiFile");
/*    */     
/* 16 */     Intrinsics.checkNotNullExpressionValue(psiFile.getName(), "psiFile.name");
/* 17 */     Intrinsics.checkNotNullExpressionValue(psiFile.getVirtualFile().getPath(), "psiFile.virtualFile.path");
/* 18 */     PsiElement psiElement1 = (PsiElement)psiFile; int i = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList(psiElement1, PyImportStatementBase.class), "getChildrenOfTypeAsList(this, T::class.java)"); List list1 = PsiTreeUtil.getChildrenOfTypeAsList(psiElement1, PyImportStatementBase.class); String str3 = null, str2 = psiFile.getVirtualFile().getPath(), str1 = psiFile.getName(); PsiFile psiFile1 = psiFile; int $i$f$flatMap = 0;
/* 24 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 25 */     for (Object element$iv$iv : list2) {
/* 26 */       PyImportStatementBase it = (PyImportStatementBase)element$iv$iv; int $i$a$-flatMap-PythonFileContextBuilder$getFileContext$1 = 0; Intrinsics.checkNotNullExpressionValue(it.getImportElements(), "it.importElements"); Iterable list$iv$iv = ArraysKt.toList((Object[])it.getImportElements());
/* 27 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 29 */     List list3 = (List)destination$iv$iv; PsiElement $this$childrenOfType$iv = (PsiElement)psiFile; int $i$f$childrenOfType = 0;
/* 30 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, PyClass.class), "getChildrenOfTypeAsList(this, T::class.java)"); $this$childrenOfType$iv = (PsiElement)psiFile; $i$f$childrenOfType = 0;
/* 31 */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, PyFunction.class), "getChildrenOfTypeAsList(this, T::class.java)"); DefaultConstructorMarker defaultConstructorMarker = null; byte b = 8; List list4 = PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, PyFunction.class), list5 = PsiTreeUtil.getChildrenOfTypeAsList($this$childrenOfType$iv, PyClass.class), list6 = list3;
/*    */     String str4 = str3, str5 = str2, str6 = str1;
/*    */     PsiFile psiFile2 = psiFile1;
/*    */     return new FileContext(psiFile2, str6, str5, str4, list6, list5, list4, b, defaultConstructorMarker);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PythonFileContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */