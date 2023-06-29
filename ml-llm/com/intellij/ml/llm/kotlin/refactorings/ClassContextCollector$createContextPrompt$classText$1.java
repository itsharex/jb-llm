/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.psi.KtClass;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class ClassContextCollector$createContextPrompt$classText$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   ClassContextCollector$createContextPrompt$classText$1(KtClass $classCopy, KtClass $clazz, String $namePlaceholder) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String invoke() {
/* 28 */     Intrinsics.checkNotNullExpressionValue(this.$classCopy.getText(), "classCopy.text"); this.$clazz.getIdentifyingElement(); if (((this.$clazz.getIdentifyingElement() != null) ? this.$clazz.getIdentifyingElement().getText() : null) == null) (this.$clazz.getIdentifyingElement() != null) ? this.$clazz.getIdentifyingElement().getText() : null;  return StringsKt.replace$default((this.$clazz.getIdentifyingElement() != null) ? this.$clazz.getIdentifyingElement().getText() : null, "", this.$namePlaceholder, false, 4, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classText$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */