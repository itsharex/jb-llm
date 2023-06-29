/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ 
/*    */ import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
/*    */ import com.intellij.ml.llm.core.refactoring.ObjectType;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.jetbrains.python.psi.PyNamedParameter;
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
/*    */ final class PythonNameSuggestionContextProvider$suggestParameterNames$2
/*    */   extends Lambda
/*    */   implements Function0<NameSuggestionContext>
/*    */ {
/*    */   @NotNull
/*    */   public final NameSuggestionContext invoke() {
/* 75 */     if (this.$parameter.getName() == null) this.$parameter.getName();  Intrinsics.checkNotNullExpressionValue(this.$parameter.getText(), "parameter.name ?: parameter.text"); super(this.$parameter.getName(), this.$parameter.getText(), 
/* 76 */         ObjectType.VARIABLE, 
/* 77 */         VariableContextCollector.INSTANCE.createContextPrompt(this.$parameter, this.$newVariableName, this.$originalElement));
/*    */     return new NameSuggestionContext();
/*    */   }
/*    */   
/*    */   PythonNameSuggestionContextProvider$suggestParameterNames$2(String $newVariableName, PyNamedParameter $parameter, PsiElement $originalElement) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestParameterNames$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */