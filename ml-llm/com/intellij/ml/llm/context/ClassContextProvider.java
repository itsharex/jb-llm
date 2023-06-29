/*     */ package com.intellij.ml.llm.context;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.lang.LanguageExtension;
/*     */ import com.intellij.ml.llm.context.classbuilder.ClassContextBuilder;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\016\020\n\032\0020\0132\006\020\f\032\0020\rR\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\0070\tX\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/context/ClassContextProvider;", "", "gatherUsages", "", "(Z)V", "languageExtension", "Lcom/intellij/lang/LanguageExtension;", "Lcom/intellij/ml/llm/context/classbuilder/ClassContextBuilder;", "providers", "", "from", "Lcom/intellij/ml/llm/context/ClassContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nClassContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContext.kt\ncom/intellij/ml/llm/context/ClassContextProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1603#2,9:95\n1855#2:104\n1856#2:106\n1612#2:107\n1#3:105\n*S KotlinDebug\n*F\n+ 1 ClassContext.kt\ncom/intellij/ml/llm/context/ClassContextProvider\n*L\n86#1:95,9\n86#1:104\n86#1:106\n86#1:107\n86#1:105\n*E\n"})
/*     */ public final class ClassContextProvider
/*     */ {
/*     */   private final boolean gatherUsages;
/*     */   @NotNull
/*     */   private final LanguageExtension<ClassContextBuilder> languageExtension;
/*     */   @NotNull
/*     */   private final List<ClassContextBuilder> providers;
/*     */   
/*     */   public ClassContextProvider(boolean gatherUsages) {
/*  81 */     this.gatherUsages = gatherUsages;
/*     */ 
/*     */     
/*  84 */     this.languageExtension = new LanguageExtension("com.intellij.ml.llm.classContextBuilder");
/*     */     
/*  86 */     Intrinsics.checkNotNullExpressionValue(Language.getRegisteredLanguages(), "getRegisteredLanguages()"); Collection collection1 = Language.getRegisteredLanguages(); ClassContextProvider classContextProvider = 
/*     */       
/*  88 */       this;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$mapNotNull = 0;
/*     */ 
/*     */     
/*  95 */     Collection collection2 = collection1, destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     Iterable $this$forEach$iv$iv$iv = collection2; int $i$f$forEach = 0;
/* 104 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Language language = (Language)element$iv$iv;
/*     */       int $i$a$-mapNotNull-ClassContextProvider$providers$1 = 0; }
/*     */     
/* 107 */     classContextProvider.providers = CollectionsKt.toList(destination$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ClassContext from(@NotNull PsiElement psiElement) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'psiElement'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield providers : Ljava/util/List;
/*     */     //   10: checkcast java/lang/Iterable
/*     */     //   13: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   18: astore_2
/*     */     //   19: aload_2
/*     */     //   20: invokeinterface hasNext : ()Z
/*     */     //   25: ifeq -> 61
/*     */     //   28: aload_2
/*     */     //   29: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   34: checkcast com/intellij/ml/llm/context/classbuilder/ClassContextBuilder
/*     */     //   37: astore_3
/*     */     //   38: iconst_0
/*     */     //   39: istore #4
/*     */     //   41: aload_3
/*     */     //   42: aload_1
/*     */     //   43: aload_0
/*     */     //   44: getfield gatherUsages : Z
/*     */     //   47: invokeinterface getClassContext : (Lcom/intellij/psi/PsiElement;Z)Lcom/intellij/ml/llm/context/ClassContext;
/*     */     //   52: astore_3
/*     */     //   53: aload_3
/*     */     //   54: ifnull -> 19
/*     */     //   57: aload_3
/*     */     //   58: goto -> 62
/*     */     //   61: aconst_null
/*     */     //   62: dup
/*     */     //   63: ifnonnull -> 84
/*     */     //   66: pop
/*     */     //   67: new com/intellij/ml/llm/context/ClassContext
/*     */     //   70: dup
/*     */     //   71: aload_1
/*     */     //   72: aconst_null
/*     */     //   73: aconst_null
/*     */     //   74: aconst_null
/*     */     //   75: aconst_null
/*     */     //   76: aconst_null
/*     */     //   77: aconst_null
/*     */     //   78: bipush #126
/*     */     //   80: aconst_null
/*     */     //   81: invokespecial <init> : (Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   84: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 6
/*     */     //   #91	-> 41
/*     */     //   #90	-> 52
/*     */     //   #90	-> 62
/*     */     //   #92	-> 67
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   41	11	4	$i$a$-firstNotNullOfOrNull-ClassContextProvider$from$1	I
/*     */     //   38	14	3	provider	Lcom/intellij/ml/llm/context/classbuilder/ClassContextBuilder;
/*     */     //   0	85	0	this	Lcom/intellij/ml/llm/context/ClassContextProvider;
/*     */     //   0	85	1	psiElement	Lcom/intellij/psi/PsiElement;
/*     */   }
/*     */   
/*     */   public ClassContextProvider() {
/*     */     this(false, 1, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/ClassContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */