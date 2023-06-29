/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ import com.jetbrains.python.psi.PyFunction;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lcom/jetbrains/python/psi/PyFunction;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nFunctionContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionContextCollector.kt\ncom/intellij/ml/llm/python/refactorings/FunctionContextCollector$createContextPrompt$methodCopy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/*    */ final class FunctionContextCollector$createContextPrompt$methodCopy$1 extends Lambda implements Function0<PyFunction> {
/*    */   @NotNull
/*    */   public final PyFunction invoke() {
/* 11 */     Intrinsics.checkNotNull(this.$function.copy(), "null cannot be cast to non-null type com.jetbrains.python.psi.PyFunction"); PyFunction pyFunction1 = (PyFunction)this.$function.copy(); String str = this.$namePlaceholder; PyFunction it = pyFunction1;
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
/* 26 */     int $i$a$-also-FunctionContextCollector$createContextPrompt$methodCopy$1$1 = 0;
/*    */     it.setName(str);
/*    */     return pyFunction1;
/*    */   }
/*    */   
/*    */   FunctionContextCollector$createContextPrompt$methodCopy$1(PyFunction $function, String $namePlaceholder) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/FunctionContextCollector$createContextPrompt$methodCopy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */