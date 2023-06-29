/*    */ package com.intellij.ml.llm.kotlin.refactorings;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.kotlin.psi.KtClass;
/*    */ import org.jetbrains.kotlin.psi.KtDeclaration;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/kotlin/psi/KtClass;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nClassContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classCopy$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1855#2,2:32\n*S KotlinDebug\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classCopy$1\n*L\n17#1:32,2\n*E\n"})
/*    */ final class ClassContextCollector$createContextPrompt$classCopy$1 extends Lambda implements Function0<KtClass> {
/*    */   @NotNull
/*    */   public final KtClass invoke() {
/* 15 */     Intrinsics.checkNotNull(this.$clazz.copy(), "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtClass"); KtClass ktClass1 = (KtClass)this.$clazz.copy(); String str = this.$namePlaceholder; KtClass it = ktClass1; int $i$a$-also-ClassContextCollector$createContextPrompt$classCopy$1$1 = 0;
/* 16 */     it.setName(str);
/* 17 */     Iterable $this$forEach$iv = it.getDeclarations(); int $i$f$forEach = 0;
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
/* 32 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); KtDeclaration declaration = (KtDeclaration)element$iv; int $i$a$-forEach-ClassContextCollector$createContextPrompt$classCopy$1$1$1 = 0;
/*    */       KtDeclaration ktDeclaration1 = declaration; }
/*    */     
/*    */     return ktClass1;
/*    */   }
/*    */   
/*    */   ClassContextCollector$createContextPrompt$classCopy$1(KtClass $clazz, String $namePlaceholder) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/ClassContextCollector$createContextPrompt$classCopy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */