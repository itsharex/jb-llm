/*     */ package com.intellij.ml.llm.context;
/*     */ 
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.lang.LanguageExtension;
/*     */ import com.intellij.ml.llm.context.methodbuilder.MethodContextBuilder;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\002\020\005J\016\020\013\032\0020\f2\006\020\r\032\0020\016R\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\b0\nX\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/context/MethodContextProvider;", "", "includeClassContext", "", "gatherUsages", "(ZZ)V", "languageExtension", "Lcom/intellij/lang/LanguageExtension;", "Lcom/intellij/ml/llm/context/methodbuilder/MethodContextBuilder;", "providers", "", "from", "Lcom/intellij/ml/llm/context/MethodContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nMethodContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodContext.kt\ncom/intellij/ml/llm/context/MethodContextProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1603#2,9:105\n1855#2:114\n1856#2:116\n1612#2:117\n1#3:115\n*S KotlinDebug\n*F\n+ 1 MethodContext.kt\ncom/intellij/ml/llm/context/MethodContextProvider\n*L\n87#1:105,9\n87#1:114\n87#1:116\n87#1:117\n87#1:115\n*E\n"})
/*     */ public final class MethodContextProvider
/*     */ {
/*     */   private final boolean includeClassContext;
/*     */   private final boolean gatherUsages;
/*     */   @NotNull
/*     */   private final LanguageExtension<MethodContextBuilder> languageExtension;
/*     */   @NotNull
/*     */   private final List<MethodContextBuilder> providers;
/*     */   
/*     */   public MethodContextProvider(boolean includeClassContext, boolean gatherUsages) {
/*  81 */     this.includeClassContext = includeClassContext;
/*  82 */     this.gatherUsages = gatherUsages;
/*     */ 
/*     */     
/*  85 */     this.languageExtension = new LanguageExtension("com.intellij.ml.llm.methodContextBuilder");
/*     */     
/*  87 */     Intrinsics.checkNotNullExpressionValue(Language.getRegisteredLanguages(), "getRegisteredLanguages()"); Collection collection1 = Language.getRegisteredLanguages(); MethodContextProvider methodContextProvider = 
/*     */       
/*  89 */       this;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     Collection collection2 = collection1, destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     Iterable $this$forEach$iv$iv$iv = collection2; int $i$f$forEach = 0;
/* 114 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Language language = (Language)element$iv$iv;
/*     */       int $i$a$-mapNotNull-MethodContextProvider$providers$1 = 0; }
/*     */     
/* 117 */     methodContextProvider.providers = CollectionsKt.toList(destination$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MethodContext from(@NotNull PsiElement psiElement) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'psiElement'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield providers : Ljava/util/List;
/*     */     //   10: checkcast java/lang/Iterable
/*     */     //   13: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   18: astore_3
/*     */     //   19: aload_3
/*     */     //   20: invokeinterface hasNext : ()Z
/*     */     //   25: ifeq -> 70
/*     */     //   28: aload_3
/*     */     //   29: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   34: checkcast com/intellij/ml/llm/context/methodbuilder/MethodContextBuilder
/*     */     //   37: astore #4
/*     */     //   39: iconst_0
/*     */     //   40: istore #5
/*     */     //   42: aload #4
/*     */     //   44: aload_1
/*     */     //   45: aload_0
/*     */     //   46: getfield includeClassContext : Z
/*     */     //   49: aload_0
/*     */     //   50: getfield gatherUsages : Z
/*     */     //   53: invokeinterface getMethodContext : (Lcom/intellij/psi/PsiElement;ZZ)Lcom/intellij/ml/llm/context/MethodContext;
/*     */     //   58: astore #4
/*     */     //   60: aload #4
/*     */     //   62: ifnull -> 19
/*     */     //   65: aload #4
/*     */     //   67: goto -> 71
/*     */     //   70: aconst_null
/*     */     //   71: dup
/*     */     //   72: ifnonnull -> 126
/*     */     //   75: pop
/*     */     //   76: aload_1
/*     */     //   77: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   82: astore_2
/*     */     //   83: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   86: astore_3
/*     */     //   87: aload_1
/*     */     //   88: invokeinterface getLanguage : ()Lcom/intellij/lang/Language;
/*     */     //   93: invokevirtual getDisplayName : ()Ljava/lang/String;
/*     */     //   96: astore #4
/*     */     //   98: new com/intellij/ml/llm/context/MethodContext
/*     */     //   101: dup
/*     */     //   102: aload_1
/*     */     //   103: aload_2
/*     */     //   104: ldc 'text'
/*     */     //   106: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   109: aload_2
/*     */     //   110: aconst_null
/*     */     //   111: aconst_null
/*     */     //   112: aconst_null
/*     */     //   113: aload #4
/*     */     //   115: aconst_null
/*     */     //   116: aload_3
/*     */     //   117: iconst_0
/*     */     //   118: aconst_null
/*     */     //   119: sipush #768
/*     */     //   122: aconst_null
/*     */     //   123: invokespecial <init> : (Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   126: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #91	-> 6
/*     */     //   #92	-> 42
/*     */     //   #91	-> 58
/*     */     //   #91	-> 71
/*     */     //   #95	-> 76
/*     */     //   #100	-> 83
/*     */     //   #101	-> 87
/*     */     //   #93	-> 98
/*     */     //   #94	-> 102
/*     */     //   #95	-> 103
/*     */     //   #96	-> 110
/*     */     //   #97	-> 111
/*     */     //   #98	-> 112
/*     */     //   #101	-> 113
/*     */     //   #99	-> 115
/*     */     //   #100	-> 116
/*     */     //   #93	-> 117
/*     */     //   #102	-> 126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   42	16	5	$i$a$-firstNotNullOfOrNull-MethodContextProvider$from$1	I
/*     */     //   39	19	4	provider	Lcom/intellij/ml/llm/context/methodbuilder/MethodContextBuilder;
/*     */     //   0	127	0	this	Lcom/intellij/ml/llm/context/MethodContextProvider;
/*     */     //   0	127	1	psiElement	Lcom/intellij/psi/PsiElement;
/*     */   }
/*     */   
/*     */   public MethodContextProvider() {
/*     */     this(false, false, 3, null);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/MethodContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */