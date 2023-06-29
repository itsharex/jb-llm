/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ 
/*    */ import com.intellij.psi.PsiFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.name.FqName;
/*    */ import org.jetbrains.kotlin.psi.KtClass;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nClassContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$packageText$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/*    */ final class ClassContextCollector$createContextPrompt$packageText$1
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   ClassContextCollector$createContextPrompt$packageText$1(KtClass $clazz) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String invoke() {
/* 27 */     PsiFile psiFile = this.$clazz.getContainingFile(); FqName pkg = ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     int $i$a$-let-ClassContextCollector$createContextPrompt$packageText$1$1 = 0;
/*    */     ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName();
/*    */     if (((((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null) != null && ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName() != null) ? ("package " + pkg + "\n\n") : null) == null)
/*    */       (((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null) != null && ((psiFile instanceof org.jetbrains.kotlin.psi.KtFile) ? psiFile : null).getPackageFqName() != null) ? ("package " + pkg + "\n\n") : null; 
/*    */     return "";
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$packageText$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */