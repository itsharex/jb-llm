/*     */ package com.intellij.ml.llm.python.context;
/*     */ import com.intellij.psi.NavigatablePsiElement;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.search.GlobalSearchScope;
/*     */ import com.jetbrains.python.psi.PyClass;
/*     */ import com.jetbrains.python.psi.PyFunction;
/*     */ import com.jetbrains.python.psi.PyStatement;
/*     */ import com.jetbrains.python.psi.PyStatementList;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J&\020\007\032\004\030\0010\0042\006\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\013H\002J\016\020\r\032\0020\0042\006\020\016\032\0020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/python/context/PythonContextUtils;", "", "()V", "getClassUsagesText", "", "clazz", "Lcom/jetbrains/python/psi/PyClass;", "getContextStringForElement", "element", "Lcom/intellij/psi/PsiElement;", "linesThreshold", "", "symbolsThreshold", "getFunctionUsagesText", "function", "Lcom/jetbrains/python/psi/PyFunction;", "intellij.ml.llm.python"})
/*     */ @SourceDebugExtension({"SMAP\nPythonContextUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonContextUtils.kt\ncom/intellij/ml/llm/python/context/PythonContextUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n3792#2:69\n4307#2,2:70\n1360#3:72\n1446#3,5:73\n1603#3,9:78\n1855#3:87\n1856#3:89\n1612#3:90\n1549#3:91\n1620#3,3:92\n1603#3,9:95\n1855#3:104\n1856#3:106\n1612#3:107\n1549#3:108\n1620#3,3:109\n1#4:88\n1#4:105\n*S KotlinDebug\n*F\n+ 1 PythonContextUtils.kt\ncom/intellij/ml/llm/python/context/PythonContextUtils\n*L\n38#1:69\n38#1:70,2\n39#1:72\n39#1:73,5\n44#1:78,9\n44#1:87\n44#1:89\n44#1:90\n45#1:91\n45#1:92,3\n23#1:95,9\n23#1:104\n23#1:106\n23#1:107\n24#1:108\n24#1:109,3\n44#1:88\n23#1:105\n*E\n"})
/*     */ public final class PythonContextUtils {
/*     */   private static final void getFunctionUsagesText$lambda$2(Ref.ObjectRef $usagesText, Collection $usages) {
/*  22 */     Intrinsics.checkNotNullParameter($usagesText, "$usagesText"); Intrinsics.checkNotNullParameter($usages, "$usages"); List list1 = CollectionsKt.take($usages, 8);
/*  23 */     Ref.ObjectRef objectRef = $usagesText; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     Iterable $this$forEach$iv$iv$iv = list2; int $i$f$forEach = 0;
/* 104 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PsiReference it = (PsiReference)element$iv$iv;
/*     */       int $i$a$-mapNotNull-PythonContextUtils$getFunctionUsagesText$1$1 = 0; }
/*     */     
/* 107 */     Iterable $this$mapNotNull$iv = destination$iv$iv; objectRef = objectRef; int $i$f$map = 0;
/* 108 */     Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapNotNull$iv, 10)); int $i$f$mapTo = 0;
/* 109 */     for (Object item$iv$iv : $this$mapNotNullTo$iv$iv) {
/* 110 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-PythonContextUtils$getFunctionUsagesText$1$2 = 0; collection.add(PyIndentUtil.changeIndent(str, true, ""));
/* 111 */     }  objectRef.element = CollectionsKt.joinToString$default(destination$iv$iv, "\n\n", null, null, 0, null, null, 62, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final PythonContextUtils INSTANCE = new PythonContextUtils();
/*     */   
/*     */   @NotNull
/*     */   public final String getFunctionUsagesText(@NotNull PyFunction function) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'function'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   12: dup
/*     */     //   13: ldc 'function.project'
/*     */     //   15: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: astore_2
/*     */     //   19: aload_2
/*     */     //   20: invokestatic projectScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
/*     */     //   23: dup
/*     */     //   24: ldc 'projectScope(project)'
/*     */     //   26: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   29: astore_3
/*     */     //   30: new com/intellij/psi/search/searches/ReferencesSearch$SearchParameters
/*     */     //   33: dup
/*     */     //   34: aload_1
/*     */     //   35: checkcast com/intellij/psi/PsiElement
/*     */     //   38: aload_3
/*     */     //   39: checkcast com/intellij/psi/search/SearchScope
/*     */     //   42: iconst_0
/*     */     //   43: invokespecial <init> : (Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/search/SearchScope;Z)V
/*     */     //   46: invokestatic search : (Lcom/intellij/psi/search/searches/ReferencesSearch$SearchParameters;)Lcom/intellij/util/Query;
/*     */     //   49: invokeinterface findAll : ()Ljava/util/Collection;
/*     */     //   54: dup
/*     */     //   55: ldc 'search(ReferencesSearch.… false))\\n      .findAll()'
/*     */     //   57: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   60: astore #4
/*     */     //   62: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   65: dup
/*     */     //   66: invokespecial <init> : ()V
/*     */     //   69: astore #5
/*     */     //   71: aload #5
/*     */     //   73: aload #4
/*     */     //   75: <illegal opcode> run : (Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Collection;)Lcom/intellij/util/ThrowableRunnable;
/*     */     //   80: invokestatic run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */     //   83: aload #5
/*     */     //   85: getfield element : Ljava/lang/Object;
/*     */     //   88: ifnonnull -> 100
/*     */     //   91: ldc 'usagesText'
/*     */     //   93: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */     //   96: aconst_null
/*     */     //   97: goto -> 108
/*     */     //   100: aload #5
/*     */     //   102: getfield element : Ljava/lang/Object;
/*     */     //   105: checkcast java/lang/String
/*     */     //   108: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   113: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   116: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #13	-> 6
/*     */     //   #14	-> 19
/*     */     //   #17	-> 30
/*     */     //   #18	-> 49
/*     */     //   #17	-> 60
/*     */     //   #19	-> 62
/*     */     //   #21	-> 71
/*     */     //   #30	-> 83
/*     */     //   #31	-> 113
/*     */     //   #28	-> 116
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	98	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   30	87	3	scope	Lcom/intellij/psi/search/GlobalSearchScope;
/*     */     //   62	55	4	usages	Ljava/util/Collection;
/*     */     //   71	46	5	usagesText	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   0	117	0	this	Lcom/intellij/ml/llm/python/context/PythonContextUtils;
/*     */     //   0	117	1	function	Lcom/jetbrains/python/psi/PyFunction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getClassUsagesText(@NotNull PyClass clazz) {
/*     */     Intrinsics.checkNotNullParameter(clazz, "clazz");
/*     */     Intrinsics.checkNotNullExpressionValue(clazz.getProject(), "clazz.project");
/*     */     Project project = clazz.getProject();
/*     */     Intrinsics.checkNotNullExpressionValue(GlobalSearchScope.projectScope(project), "projectScope(project)");
/*     */     GlobalSearchScope scope = GlobalSearchScope.projectScope(project);
/*     */     Intrinsics.checkNotNullExpressionValue(clazz.getMethods(), "clazz.methods");
/*     */     Object[] $this$filter$iv = (Object[])clazz.getMethods();
/*     */     int $i$f$filter = 0;
/*     */     Object[] arrayOfObject1 = $this$filter$iv;
/*     */     Collection destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject1.length; b < i; str = it.getName()) {
/*     */       String str;
/*     */       Object element$iv$iv = arrayOfObject1[b];
/*     */       PyFunction it = (PyFunction)element$iv$iv;
/*     */       int $i$a$-filter-PythonContextUtils$getClassUsagesText$methods$1 = 0;
/*     */     } 
/*     */     List methods = (List)destination$iv$iv;
/*     */     Iterable $this$flatMap$iv = methods;
/*     */     int $i$f$flatMap = 0;
/*     */     Iterable iterable1 = $this$flatMap$iv;
/*     */     Collection<String> collection = new ArrayList();
/*     */     int $i$f$flatMapTo = 0;
/*     */     for (Object element$iv$iv : iterable1) {
/*     */       PyFunction it = (PyFunction)element$iv$iv;
/*     */       int $i$a$-flatMap-PythonContextUtils$getClassUsagesText$usagesText$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(ReferencesSearch.search(new ReferencesSearch.SearchParameters((PsiElement)it, (SearchScope)scope, false)).findAll(), "search(ReferencesSearch.… scope, false)).findAll()");
/*     */       Iterable list$iv$iv = ReferencesSearch.search(new ReferencesSearch.SearchParameters((PsiElement)it, (SearchScope)scope, false)).findAll();
/*     */       CollectionsKt.addAll(collection, list$iv$iv);
/*     */     } 
/*     */     $this$flatMap$iv = CollectionsKt.take(CollectionsKt.shuffled(collection), 15);
/*     */     int $i$f$mapNotNull = 0;
/*     */     Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv;
/*     */     collection = new ArrayList();
/*     */     int $i$f$mapNotNullTo = 0;
/*     */     Iterable $this$forEach$iv$iv$iv = $this$flatMapTo$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */       int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       PsiReference it = (PsiReference)element$iv$iv;
/*     */       int $i$a$-mapNotNull-PythonContextUtils$getClassUsagesText$usagesText$2 = 0;
/*     */     } 
/*     */     Iterable $this$mapNotNull$iv = collection;
/*     */     int $i$f$map = 0;
/*     */     Iterable $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv;
/*     */     collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapNotNull$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : $this$mapNotNullTo$iv$iv) {
/*     */       PsiElement psiElement = (PsiElement)item$iv$iv;
/*     */       Collection<String> collection1 = collection;
/*     */       int $i$a$-map-PythonContextUtils$getClassUsagesText$usagesText$3 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(psiElement, "it");
/*     */       collection1.add(getContextStringForElement$default(INSTANCE, psiElement, 5, 0, 4, null));
/*     */     } 
/*     */     String usagesText = CollectionsKt.joinToString$default(collection, "\n\n", null, null, 0, null, null, 62, null);
/*     */     return StringsKt.trimIndent("\n```python\n" + usagesText + "\n```");
/*     */   }
/*     */   
/*     */   private final String getContextStringForElement(PsiElement element, int linesThreshold, int symbolsThreshold) {
/*     */     PyStatement statement;
/*     */     ScopeUtil.getScopeOwner(element);
/*     */     NavigatablePsiElement scopeOwner = (ScopeUtil.getScopeOwner(element) != null) ? (NavigatablePsiElement)ScopeUtil.getScopeOwner(element) : (NavigatablePsiElement)element.getContainingFile();
/*     */     Intrinsics.checkNotNullExpressionValue(scopeOwner.getText(), "scopeOwner.text");
/*     */     if (scopeOwner != null && StringsKt.lines(scopeOwner.getText()).size() <= linesThreshold && scopeOwner.getText().length() <= symbolsThreshold)
/*     */       return scopeOwner.getText(); 
/*     */     PyStatementList statementList = (PyStatementList)PsiTreeUtil.getParentOfType(element, PyStatementList.class);
/*     */     Intrinsics.checkNotNullExpressionValue(statementList.getText(), "statementList.text");
/*     */     if (statementList != null && StringsKt.lines(statementList.getText()).size() <= linesThreshold && statementList.getText().length() <= symbolsThreshold)
/*     */       return statementList.getText(); 
/*     */     if ((PyStatement)PsiTreeUtil.getParentOfType(element, PyStatement.class) == null) {
/*     */       (PyStatement)PsiTreeUtil.getParentOfType(element, PyStatement.class);
/*     */       return element.getText();
/*     */     } 
/*     */     return statement.getText();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PythonContextUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */