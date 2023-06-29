/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.JavaPsiFacade;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiMethod;
/*    */ import com.intellij.psi.codeStyle.JavaCodeStyleManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*    */ final class JavaNameSuggestionContextProvider$isNameAlreadyUsed$2
/*    */   extends Lambda
/*    */   implements Function0<Boolean>
/*    */ {
/*    */   @NotNull
/*    */   public final Boolean invoke() {
/* 31 */     PsiElement psiElement = this.$element;
/*    */ 
/*    */     
/* 34 */     ((PsiMethod)this.$element).getContainingClass().findMethodsByName(this.$name, true);
/* 35 */     return Boolean.valueOf((psiElement instanceof com.intellij.psi.PsiClass) ? ((JavaPsiFacade.getInstance(this.$project).getResolveHelper().resolveReferencedClass(this.$name, this.$element) != null)) : ((psiElement instanceof com.intellij.psi.PsiVariable) ? (!Intrinsics.areEqual(JavaCodeStyleManager.getInstance(this.$project).suggestUniqueVariableName(this.$name, this.$element, true), this.$name)) : ((psiElement instanceof PsiMethod) ? ((((PsiMethod)this.$element).getContainingClass() != null && ((PsiMethod)this.$element).getContainingClass().findMethodsByName(this.$name, true) != null) ? (!(((((PsiMethod)this.$element).getContainingClass().findMethodsByName(this.$name, true)).length == 0) ? 1 : 0)) : false) : false)));
/*    */   }
/*    */   
/*    */   JavaNameSuggestionContextProvider$isNameAlreadyUsed$2(PsiElement $element, Project $project, String $name) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$isNameAlreadyUsed$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */