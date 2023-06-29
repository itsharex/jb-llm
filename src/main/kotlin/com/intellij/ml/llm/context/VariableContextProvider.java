/*    */ package com.intellij.ml.llm.context;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.lang.LanguageExtension;
/*    */ import com.intellij.ml.llm.context.variablebuilder.VariableContextBuilder;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003¢\006\002\020\006J\016\020\f\032\0020\r2\006\020\016\032\0020\017R\016\020\005\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\t0\013X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/context/VariableContextProvider;", "", "includeMethodContext", "", "includeClassContext", "gatherUsages", "(ZZZ)V", "languageExtension", "Lcom/intellij/lang/LanguageExtension;", "Lcom/intellij/ml/llm/context/variablebuilder/VariableContextBuilder;", "providers", "", "from", "Lcom/intellij/ml/llm/context/VariableContext;", "psiElement", "Lcom/intellij/psi/PsiElement;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nVariableContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContext.kt\ncom/intellij/ml/llm/context/VariableContextProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1603#2,9:77\n1855#2:86\n1856#2:88\n1612#2:89\n1#3:87\n*S KotlinDebug\n*F\n+ 1 VariableContext.kt\ncom/intellij/ml/llm/context/VariableContextProvider\n*L\n65#1:77,9\n65#1:86\n65#1:88\n65#1:89\n65#1:87\n*E\n"})
/*    */ public final class VariableContextProvider
/*    */ {
/*    */   private final boolean includeMethodContext;
/*    */   private final boolean includeClassContext;
/*    */   private final boolean gatherUsages;
/*    */   @NotNull
/*    */   private final LanguageExtension<VariableContextBuilder> languageExtension;
/*    */   @NotNull
/*    */   private final List<VariableContextBuilder> providers;
/*    */   
/*    */   public VariableContextProvider(boolean includeMethodContext, boolean includeClassContext, boolean gatherUsages) {
/* 58 */     this.includeMethodContext = includeMethodContext;
/* 59 */     this.includeClassContext = includeClassContext;
/* 60 */     this.gatherUsages = gatherUsages;
/*    */ 
/*    */     
/* 63 */     this.languageExtension = new LanguageExtension("com.intellij.ml.llm.variableContextBuilder");
/*    */     
/* 65 */     Intrinsics.checkNotNullExpressionValue(Language.getRegisteredLanguages(), "getRegisteredLanguages()"); Collection collection1 = Language.getRegisteredLanguages(); VariableContextProvider variableContextProvider = 
/*    */       
/* 67 */       this;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     int $i$f$mapNotNull = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 77 */     Collection collection2 = collection1, destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 85 */     Iterable $this$forEach$iv$iv$iv = collection2; int $i$f$forEach = 0;
/* 86 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Language language = (Language)element$iv$iv;
/*    */       int $i$a$-mapNotNull-VariableContextProvider$providers$1 = 0; }
/*    */     
/* 89 */     variableContextProvider.providers = CollectionsKt.toList(destination$iv$iv);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VariableContext from(@NotNull PsiElement psiElement) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'psiElement'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield providers : Ljava/util/List;
/*    */     //   10: checkcast java/lang/Iterable
/*    */     //   13: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   18: astore_2
/*    */     //   19: aload_2
/*    */     //   20: invokeinterface hasNext : ()Z
/*    */     //   25: ifeq -> 69
/*    */     //   28: aload_2
/*    */     //   29: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   34: checkcast com/intellij/ml/llm/context/variablebuilder/VariableContextBuilder
/*    */     //   37: astore_3
/*    */     //   38: iconst_0
/*    */     //   39: istore #4
/*    */     //   41: aload_3
/*    */     //   42: aload_1
/*    */     //   43: aload_0
/*    */     //   44: getfield includeMethodContext : Z
/*    */     //   47: aload_0
/*    */     //   48: getfield includeClassContext : Z
/*    */     //   51: aload_0
/*    */     //   52: getfield gatherUsages : Z
/*    */     //   55: invokeinterface getVariableContext : (Lcom/intellij/psi/PsiElement;ZZZ)Lcom/intellij/ml/llm/context/VariableContext;
/*    */     //   60: astore_3
/*    */     //   61: aload_3
/*    */     //   62: ifnull -> 19
/*    */     //   65: aload_3
/*    */     //   66: goto -> 70
/*    */     //   69: aconst_null
/*    */     //   70: dup
/*    */     //   71: ifnonnull -> 105
/*    */     //   74: pop
/*    */     //   75: new com/intellij/ml/llm/context/VariableContext
/*    */     //   78: dup
/*    */     //   79: aload_1
/*    */     //   80: aload_1
/*    */     //   81: invokeinterface getText : ()Ljava/lang/String;
/*    */     //   86: dup
/*    */     //   87: ldc 'psiElement.text'
/*    */     //   89: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   92: aconst_null
/*    */     //   93: aconst_null
/*    */     //   94: aconst_null
/*    */     //   95: aconst_null
/*    */     //   96: iconst_0
/*    */     //   97: iconst_0
/*    */     //   98: sipush #252
/*    */     //   101: aconst_null
/*    */     //   102: invokespecial <init> : (Lcom/intellij/psi/PsiElement;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/PsiElement;Ljava/util/List;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   105: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #69	-> 6
/*    */     //   #70	-> 41
/*    */     //   #69	-> 60
/*    */     //   #69	-> 70
/*    */     //   #71	-> 75
/*    */     //   #72	-> 79
/*    */     //   #73	-> 80
/*    */     //   #71	-> 92
/*    */     //   #74	-> 105
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	19	4	$i$a$-firstNotNullOfOrNull-VariableContextProvider$from$1	I
/*    */     //   38	22	3	provider	Lcom/intellij/ml/llm/context/variablebuilder/VariableContextBuilder;
/*    */     //   0	106	0	this	Lcom/intellij/ml/llm/context/VariableContextProvider;
/*    */     //   0	106	1	psiElement	Lcom/intellij/psi/PsiElement;
/*    */   }
/*    */   
/*    */   public VariableContextProvider() {
/*    */     this(false, false, false, 7, null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/VariableContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */