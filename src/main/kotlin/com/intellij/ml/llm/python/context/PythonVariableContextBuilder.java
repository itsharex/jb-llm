/*    */ package com.intellij.ml.llm.python.context;
/*    */ 
/*    */ import com.intellij.ml.llm.context.VariableContext;
/*    */ import com.intellij.ml.llm.context.variablebuilder.VariableContextBuilder;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.util.PsiTreeUtil;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import com.jetbrains.python.psi.PyNamedParameter;
/*    */ import com.jetbrains.python.psi.PyTargetExpression;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\b\000\030\0002\0020\001B\005¢\006\002\020\002J*\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\b2\006\020\n\032\0020\bH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/python/context/PythonVariableContextBuilder;", "Lcom/intellij/ml/llm/context/variablebuilder/VariableContextBuilder;", "()V", "getVariableContext", "Lcom/intellij/ml/llm/context/VariableContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "includeMethodContext", "", "includeClassContext", "gatherUsages", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nPythonVariableContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonVariableContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonVariableContextBuilder\n+ 2 psiTreeUtil.kt\ncom/intellij/psi/util/PsiTreeUtilKt\n*L\n1#1,70:1\n57#2,2:71\n57#2,2:73\n57#2,2:75\n*S KotlinDebug\n*F\n+ 1 PythonVariableContextBuilder.kt\ncom/intellij/ml/llm/python/context/PythonVariableContextBuilder\n*L\n26#1:71,2\n42#1:73,2\n43#1:75,2\n*E\n"})
/*    */ public final class PythonVariableContextBuilder implements VariableContextBuilder {
/*    */   @Nullable
/*    */   public VariableContext getVariableContext(@NotNull PsiElement psiElement, boolean includeMethodContext, boolean includeClassContext, boolean gatherUsages) {
/* 21 */     Intrinsics.checkNotNullParameter(psiElement, "psiElement"); PsiElement psiElement1 = psiElement;
/* 22 */     if (psiElement1 instanceof PyTargetExpression) {
/*    */       
/* 24 */       Intrinsics.checkNotNullExpressionValue(((PyTargetExpression)psiElement).getText(), "psiElement.text");
/*    */       
/* 26 */       PsiElement $this$parentOfType_u24default$iv = psiElement;
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
/* 71 */       boolean withSelf$iv = false; int $i$f$parentOfType = 0;
/*    */     } else if (psiElement1 instanceof PyNamedParameter) {
/* 73 */       Intrinsics.checkNotNullExpressionValue(((PyNamedParameter)psiElement).getText(), "psiElement.text"); PsiElement $this$parentOfType_u24default$iv = psiElement; boolean withSelf$iv = false; int $i$f$parentOfType = 0;
/*    */       PsiElement psiElement2 = psiElement;
/* 75 */       boolean bool1 = false; int i = 0;
/* 76 */       if ((PyFunction)PsiTreeUtil.getParentOfType(psiElement2, PyFunction.class, true) != null) {  } else { ((PyFunction)PsiTreeUtil.getParentOfType(psiElement2, PyFunction.class, true)).getContainingClass(); }
/*    */     
/*    */     } else {
/*    */     
/*    */     } 
/*    */     return null;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/context/PythonVariableContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */