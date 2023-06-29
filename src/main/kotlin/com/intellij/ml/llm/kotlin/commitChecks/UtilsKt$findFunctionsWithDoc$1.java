/*    */ package com.intellij.ml.llm.kotlin.commitChecks;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/psi/PsiElement;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/psi/PsiElement;)Ljava/lang/Boolean;"})
/*    */ final class UtilsKt$findFunctionsWithDoc$1
/*    */   extends Lambda
/*    */   implements Function1<PsiElement, Boolean>
/*    */ {
/*    */   public static final UtilsKt$findFunctionsWithDoc$1 INSTANCE = new UtilsKt$findFunctionsWithDoc$1();
/*    */   
/*    */   UtilsKt$findFunctionsWithDoc$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Boolean invoke(PsiElement it) {
/* 37 */     return Boolean.valueOf(((it instanceof org.jetbrains.kotlin.psi.KtFunction || it instanceof com.intellij.psi.PsiMethod) && UtilsKt.getFunctionDoc(it) != null));
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/UtilsKt$findFunctionsWithDoc$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */