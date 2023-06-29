/*    */ package com.intellij.ml.llm.java.context;
/*    */ 
/*    */ import com.intellij.psi.PsiMethod;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\002¨\006\003"}, d2 = {"getSignatureString", "", "Lcom/intellij/psi/PsiMethod;", "intellij.ml.llm.java"})
/*    */ public final class JavaMethodContextBuilderKt
/*    */ {
/*    */   private static final String getSignatureString(PsiMethod $this$getSignatureString) {
/* 48 */     $this$getSignatureString.getBody(); int bodyStart = ($this$getSignatureString.getBody() != null) ? $this$getSignatureString.getBody().getStartOffsetInParent() : $this$getSignatureString.getTextLength();
/* 49 */     Intrinsics.checkNotNullExpressionValue($this$getSignatureString.getText(), "text"); String str = $this$getSignatureString.getText(); boolean bool = false; Intrinsics.checkNotNullExpressionValue(str.substring(bool, bodyStart), "this as java.lang.String…ing(startIndex, endIndex)"); return StringsKt.trim(StringsKt.replace$default(str.substring(bool, bodyStart), '\n', ' ', false, 4, null)).toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/context/JavaMethodContextBuilderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */