/*    */ package com.intellij.ml.llm.kotlin.context;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtNamedFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"getSignatureString", "", "Lorg/jetbrains/kotlin/psi/KtNamedFunction;", "intellij.ml.llm.kotlin"})
/*    */ public final class KotlinMethodContextBuilderKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String getSignatureString(@NotNull KtNamedFunction $this$getSignatureString) {
/* 41 */     Intrinsics.checkNotNullParameter($this$getSignatureString, "<this>"); $this$getSignatureString.getBodyBlockExpression();
/* 42 */     $this$getSignatureString.getBodyExpression(); int bodyStart = ($this$getSignatureString.getBodyBlockExpression() != null) ? $this$getSignatureString.getBodyBlockExpression().getStartOffsetInParent() : (($this$getSignatureString.getBodyExpression() != null) ? $this$getSignatureString.getBodyExpression().getStartOffsetInParent() : 
/* 43 */       $this$getSignatureString.getTextLength());
/*    */     
/* 45 */     Intrinsics.checkNotNullExpressionValue($this$getSignatureString.getText(), "text"); String str = $this$getSignatureString.getText(); boolean bool = false; Intrinsics.checkNotNullExpressionValue(str.substring(bool, bodyStart), "this as java.lang.String…ing(startIndex, endIndex)"); return StringsKt.trim(StringsKt.replace$default(str.substring(bool, bodyStart), '\n', ' ', false, 4, null)).toString();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/context/KotlinMethodContextBuilderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */