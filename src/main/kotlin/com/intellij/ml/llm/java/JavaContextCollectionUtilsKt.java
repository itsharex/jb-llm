/*    */ package com.intellij.ml.llm.java;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiNameIdentifierOwner;
/*    */ import com.intellij.psi.search.GlobalSearchScope;
/*    */ import com.intellij.psi.search.SearchScope;
/*    */ import com.intellij.util.Query;
/*    */ import java.util.Collection;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\032\024\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\004¨\006\005"}, d2 = {"findUsages", "", "Lcom/intellij/psi/PsiReference;", "nameIdentifierOwner", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "intellij.ml.llm.java"})
/*    */ public final class JavaContextCollectionUtilsKt {
/*    */   @NotNull
/*    */   public static final List<PsiReference> findUsages(@NotNull PsiNameIdentifierOwner nameIdentifierOwner) {
/* 15 */     Intrinsics.checkNotNullParameter(nameIdentifierOwner, "nameIdentifierOwner"); Intrinsics.checkNotNullExpressionValue(nameIdentifierOwner.getProject(), "nameIdentifierOwner.project"); Project project = nameIdentifierOwner.getProject();
/* 16 */     Query query1 = 
/* 17 */       (nameIdentifierOwner instanceof PsiMethod) ? MethodReferencesSearch.search(
/* 18 */         (PsiMethod)nameIdentifierOwner, 
/* 19 */         (SearchScope)GlobalSearchScope.allScope(project), 
/* 20 */         true) : 
/*    */ 
/*    */       
/* 23 */       ReferencesSearch.search((PsiElement)nameIdentifierOwner, (SearchScope)GlobalSearchScope.allScope(project), true);
/*    */     Intrinsics.checkNotNullExpressionValue(query1, "when (nameIdentifierOwne…Scope(project), true)\n  }");
/*    */     Query search = query1;
/* 26 */     Intrinsics.checkNotNullExpressionValue(search.findAll(), "search.findAll()"); Collection results = search.findAll();
/* 27 */     return CollectionsKt.toList(results);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/JavaContextCollectionUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */