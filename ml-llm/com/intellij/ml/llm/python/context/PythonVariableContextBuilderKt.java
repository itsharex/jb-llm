/*    */ package com.intellij.ml.llm.python.context;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNameIdentifierOwner;
/*    */ import com.intellij.psi.PsiReference;
/*    */ import com.intellij.psi.search.GlobalSearchScope;
/*    */ import com.intellij.psi.search.SearchScope;
/*    */ import com.intellij.psi.search.searches.ReferencesSearch;
/*    */ import com.intellij.util.Query;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\032\024\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\004¨\006\005"}, d2 = {"findUsages", "", "Lcom/intellij/psi/PsiReference;", "nameIdentifierOwner", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "intellij.ml.llm.python"})
/*    */ public final class PythonVariableContextBuilderKt
/*    */ {
/*    */   @NotNull
/*    */   public static final List<PsiReference> findUsages(@NotNull PsiNameIdentifierOwner nameIdentifierOwner) {
/* 63 */     Intrinsics.checkNotNullParameter(nameIdentifierOwner, "nameIdentifierOwner"); Intrinsics.checkNotNullExpressionValue(nameIdentifierOwner.getProject(), "nameIdentifierOwner.project"); Project project = nameIdentifierOwner.getProject();
/* 64 */     Intrinsics.checkNotNullExpressionValue(ReferencesSearch.search((PsiElement)nameIdentifierOwner, (SearchScope)GlobalSearchScope.allScope(project), true), "search(nameIdentifierOwn….allScope(project), true)"); Query search = ReferencesSearch.search((PsiElement)nameIdentifierOwner, (SearchScope)GlobalSearchScope.allScope(project), true);
/*    */     
/* 66 */     Intrinsics.checkNotNullExpressionValue(search.findAll(), "search.findAll()"); Collection results = search.findAll();
/* 67 */     return CollectionsKt.toList(results);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PythonVariableContextBuilderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */