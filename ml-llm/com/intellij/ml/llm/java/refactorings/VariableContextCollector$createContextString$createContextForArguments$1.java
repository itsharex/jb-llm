/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "parameterName", "", "invoke"})
/*    */ final class VariableContextCollector$createContextString$createContextForArguments$1
/*    */   extends Lambda
/*    */   implements Function1<String, CharSequence>
/*    */ {
/*    */   VariableContextCollector$createContextString$createContextForArguments$1(String $variableToExplain) {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CharSequence invoke(@NotNull String parameterName) {
/* 80 */     Intrinsics.checkNotNullParameter(parameterName, "parameterName"); return this.$variableToExplain + " = " + this.$variableToExplain;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/VariableContextCollector$createContextString$createContextForArguments$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */