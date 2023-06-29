/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.kotlin.psi.KtFunction;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/kotlin/psi/KtFunction;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nFunctionContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$methodCopy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/*    */ final class FunctionContextCollector$createContextPrompt$methodCopy$1 extends Lambda implements Function0<KtFunction> {
/*    */   @NotNull
/*    */   public final KtFunction invoke() {
/* 12 */     Intrinsics.checkNotNull(this.$function.copy(), "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtFunction"); KtFunction ktFunction1 = (KtFunction)this.$function.copy(); String str = this.$namePlaceholder; KtFunction it = ktFunction1;
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
/* 27 */     int $i$a$-also-FunctionContextCollector$createContextPrompt$methodCopy$1$1 = 0;
/*    */     it.setName(str);
/*    */     return ktFunction1;
/*    */   }
/*    */   
/*    */   FunctionContextCollector$createContextPrompt$methodCopy$1(KtFunction $function, String $namePlaceholder) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/FunctionContextCollector$createContextPrompt$methodCopy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */