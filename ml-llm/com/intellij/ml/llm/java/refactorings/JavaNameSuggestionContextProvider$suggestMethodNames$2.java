/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ 
/*    */ import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
/*    */ import com.intellij.ml.llm.core.refactoring.ObjectType;
/*    */ import com.intellij.psi.PsiMethod;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */ final class JavaNameSuggestionContextProvider$suggestMethodNames$2
/*    */   extends Lambda
/*    */   implements Function0<NameSuggestionContext>
/*    */ {
/*    */   @NotNull
/*    */   public final NameSuggestionContext invoke() {
/* 57 */     Intrinsics.checkNotNullExpressionValue(this.$method.getName(), "method.name"); return new NameSuggestionContext(this.$newMethodName, this.$method.getName(), 
/* 58 */         ObjectType.METHOD, 
/* 59 */         MethodContextCollector.INSTANCE.createContextPrompt(this.$method, this.$newMethodName));
/*    */   }
/*    */   
/*    */   JavaNameSuggestionContextProvider$suggestMethodNames$2(String $newMethodName, PsiMethod $method) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$suggestMethodNames$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */