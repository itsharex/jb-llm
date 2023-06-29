/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtValVarKeywordOwner;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/kotlin/psi/KtValVarKeywordOwner;", "invoke"})
/*    */ final class VariableContextCollector$createContextPrompt$variablesInsideInitializer$1
/*    */   extends Lambda
/*    */   implements Function0<List<? extends KtValVarKeywordOwner>> {
/*    */   @NotNull
/*    */   public final List<KtValVarKeywordOwner> invoke() {
/* 17 */     return VariableContextCollector.access$findUsedVariables(VariableContextCollector.INSTANCE, (PsiElement)this.$variable);
/*    */   }
/*    */   
/*    */   VariableContextCollector$createContextPrompt$variablesInsideInitializer$1(KtValVarKeywordOwner $variable) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$variablesInsideInitializer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */