/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ 
/*    */ import com.jetbrains.python.psi.PyClass;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\020\000\032\f0\001¢\006\002\b\002¢\006\002\b\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/annotations/Nullable;", "Lcom/intellij/openapi/util/NlsSafe;", "invoke"})
/*    */ final class PythonNameSuggestionContextProvider$suggestClassNames$originalName$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   PythonNameSuggestionContextProvider$suggestClassNames$originalName$1(PyClass $clazz) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String invoke() {
/* 38 */     if (this.$clazz.getName() == null) this.$clazz.getName();  return "";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/PythonNameSuggestionContextProvider$suggestClassNames$originalName$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */