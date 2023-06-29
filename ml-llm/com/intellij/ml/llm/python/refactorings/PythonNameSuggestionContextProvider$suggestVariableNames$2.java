/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ 
/*    */ import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
/*    */ import com.intellij.ml.llm.core.refactoring.ObjectType;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.jetbrains.python.psi.PyTargetExpression;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */ final class PythonNameSuggestionContextProvider$suggestVariableNames$2
/*    */   extends Lambda
/*    */   implements Function0<NameSuggestionContext>
/*    */ {
/*    */   @NotNull
/*    */   public final NameSuggestionContext invoke() {
/* 63 */     if (this.$variable.getName() == null) this.$variable.getName();  Intrinsics.checkNotNullExpressionValue(this.$variable.getText(), "variable.name ?: variable.text"); super(this.$variable.getName(), this.$variable.getText(), 
/* 64 */         ObjectType.VARIABLE, 
/* 65 */         VariableContextCollector.INSTANCE.createContextPrompt(this.$variable, this.$newVariableName, this.$originalElement));
/*    */     return new NameSuggestionContext();
/*    */   }
/*    */   
/*    */   PythonNameSuggestionContextProvider$suggestVariableNames$2(String $newVariableName, PyTargetExpression $variable, PsiElement $originalElement) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestVariableNames$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */