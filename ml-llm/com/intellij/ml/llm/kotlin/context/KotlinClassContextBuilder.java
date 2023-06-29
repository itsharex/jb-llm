/*    */ package com.intellij.ml.llm.kotlin.context;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.kotlin.psi.KtClassOrObject;
/*    */ import org.jetbrains.kotlin.psi.KtParameter;
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\032\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026J\033\020\t\032\r\022\t\022\0070\013¢\006\002\b\f0\n2\006\020\r\032\0020\016H\002J\026\020\017\032\b\022\004\022\0020\0200\n2\006\020\r\032\0020\016H\002¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/kotlin/context/KotlinClassContextBuilder;", "Lcom/intellij/ml/llm/context/classbuilder/ClassContextBuilder;", "()V", "getClassContext", "Lcom/intellij/ml/llm/context/ClassContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "gatherUsages", "", "getDeclaredFields", "", "Lorg/jetbrains/kotlin/psi/KtVariableDeclaration;", "Lkotlin/internal/NoInfer;", "kotlinClass", "Lorg/jetbrains/kotlin/psi/KtClassOrObject;", "getPrimaryConstructorFields", "Lorg/jetbrains/kotlin/psi/KtParameter;", "intellij.ml.llm.kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nKotlinClassContextBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinClassContextBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n800#2,11:43\n766#2:54\n857#2,2:55\n800#2,11:57\n*S KotlinDebug\n*F\n+ 1 KotlinClassContextBuilder.kt\ncom/intellij/ml/llm/kotlin/context/KotlinClassContextBuilder\n*L\n14#1:43,11\n17#1:54\n17#1:55,2\n29#1:57,11\n*E\n"})
/*    */ public final class KotlinClassContextBuilder implements ClassContextBuilder {
/* 14 */   private final List<KtVariableDeclaration> getDeclaredFields(KtClassOrObject kotlinClass) { Iterable $this$filterIsInstance$iv = kotlinClass.getDeclarations(); int $i$f$filterIsInstance = 0;
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
/* 43 */     Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof KtVariableDeclaration) destination$iv$iv.add(element$iv$iv);  }
/* 53 */      return (List)destination$iv$iv; } private final List<KtParameter> getPrimaryConstructorFields(KtClassOrObject kotlinClass) { Iterable $this$filter$iv = kotlinClass.getPrimaryConstructorParameters(); int $i$f$filter = 0;
/* 54 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 55 */     for (Object element$iv$iv : iterable1) { KtParameter parameter = (KtParameter)element$iv$iv; int $i$a$-filter-KotlinClassContextBuilder$getPrimaryConstructorFields$1 = 0; if (parameter.hasValOrVar()) destination$iv$iv.add(element$iv$iv);  }
/* 56 */      return (List)destination$iv$iv; } @Nullable public ClassContext getClassContext(@NotNull PsiElement psiElement, boolean gatherUsages) { Intrinsics.checkNotNullParameter(psiElement, "psiElement"); if (psiElement instanceof KtClassOrObject) {
/* 57 */       List list1 = ((KtClassOrObject)psiElement).getDeclarations(); String str2 = ((KtClassOrObject)psiElement).getName(), str1 = ((KtClassOrObject)psiElement).getText(); PsiElement psiElement1 = psiElement; int $i$f$filterIsInstance = 0; List list2 = list1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 66 */       for (Object element$iv$iv : list2) { if (element$iv$iv instanceof org.jetbrains.kotlin.psi.KtNamedFunction) destination$iv$iv.add(element$iv$iv);  }
/* 67 */        List list3 = (List)destination$iv$iv;
/*    */       Object object1 = null;
/*    */       byte b = 32;
/*    */       List list4 = gatherUsages ? JavaContextCollectionUtilsKt.findUsages((PsiNameIdentifierOwner)psiElement) : CollectionsKt.emptyList();
/*    */       Object object2 = null;
/*    */       List list5 = CollectionsKt.plus(getPrimaryConstructorFields((KtClassOrObject)psiElement), getDeclaredFields((KtClassOrObject)psiElement)), list6 = list3;
/*    */       String str3 = str2, str4 = str1;
/*    */       PsiElement psiElement2 = psiElement1;
/*    */     } else {
/*    */     
/*    */     } 
/*    */     return null; }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/context/KotlinClassContextBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */