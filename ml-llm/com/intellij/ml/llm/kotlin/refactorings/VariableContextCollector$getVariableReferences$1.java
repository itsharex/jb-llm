/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.search.PsiElementProcessor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.idea.references.ReferenceUtilsKt;
/*    */ import org.jetbrains.kotlin.psi.KtReferenceExpression;
/*    */ import org.jetbrains.kotlin.psi.KtValVarKeywordOwner;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\0012\013\020\002\032\0070\003¢\006\002\b\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "e", "Lcom/intellij/psi/PsiElement;", "Lorg/jetbrains/annotations/NotNull;", "execute"})
/*    */ final class VariableContextCollector$getVariableReferences$1<T extends PsiElement>
/*    */   implements PsiElementProcessor
/*    */ {
/*    */   VariableContextCollector$getVariableReferences$1(KtValVarKeywordOwner $variable, List<KtReferenceExpression> $result) {}
/*    */   
/*    */   public final boolean execute(@NotNull PsiElement e) {
/* 95 */     Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof KtReferenceExpression && ReferenceUtilsKt.getMainReference((KtReferenceExpression)e).isReferenceTo((PsiElement)this.$variable)) {
/* 96 */       this.$result.add(e);
/*    */     }
/* 98 */     return (this.$result.size() < 10);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$getVariableReferences$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */