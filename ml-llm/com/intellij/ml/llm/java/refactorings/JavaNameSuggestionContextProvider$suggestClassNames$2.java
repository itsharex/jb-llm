/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ 
/*    */ import com.intellij.ml.llm.core.refactoring.NameSuggestionContext;
/*    */ import com.intellij.ml.llm.core.refactoring.ObjectType;
/*    */ import com.intellij.psi.PsiClass;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/core/refactoring/NameSuggestionContext;", "invoke"})
/*    */ final class JavaNameSuggestionContextProvider$suggestClassNames$2
/*    */   extends Lambda
/*    */   implements Function0<NameSuggestionContext>
/*    */ {
/*    */   @NotNull
/*    */   public final NameSuggestionContext invoke() {
/* 69 */     if (this.$element.getName() == null) this.$element.getName();  Intrinsics.checkNotNullExpressionValue(this.$element.getText(), "element.name ?: element.text"); super(this.$element.getName(), this.$element.getText(), 
/* 70 */         ObjectType.CLASS, 
/* 71 */         ClassContextCollector.INSTANCE.createContextPrompt(this.$element, this.$newClassName));
/*    */     return new NameSuggestionContext();
/*    */   }
/*    */   
/*    */   JavaNameSuggestionContextProvider$suggestClassNames$2(String $newClassName, PsiClass $element) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/JavaNameSuggestionContextProvider$suggestClassNames$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */