/*    */ package com.intellij.ml.llm.context;
/*    */ 
/*    */ import com.intellij.lang.Language;
/*    */ import com.intellij.lang.LanguageExtension;
/*    */ import com.intellij.ml.llm.context.filebuilder.FileContextBuilder;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\016\020\b\032\0020\t2\006\020\n\032\0020\013R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\0050\007X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/context/FileContextProvider;", "", "()V", "languageExtension", "Lcom/intellij/lang/LanguageExtension;", "Lcom/intellij/ml/llm/context/filebuilder/FileContextBuilder;", "providers", "", "from", "Lcom/intellij/ml/llm/context/FileContext;", "psiFile", "Lcom/intellij/psi/PsiFile;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nFileContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileContext.kt\ncom/intellij/ml/llm/context/FileContextProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1603#2,9:63\n1855#2:72\n1856#2:74\n1612#2:75\n1#3:73\n*S KotlinDebug\n*F\n+ 1 FileContext.kt\ncom/intellij/ml/llm/context/FileContextProvider\n*L\n54#1:63,9\n54#1:72\n54#1:74\n54#1:75\n54#1:73\n*E\n"})
/*    */ public final class FileContextProvider
/*    */ {
/*    */   @NotNull
/*    */   private final LanguageExtension<FileContextBuilder> languageExtension;
/*    */   @NotNull
/*    */   private final List<FileContextBuilder> providers;
/*    */   
/*    */   public FileContextProvider() {
/* 52 */     this.languageExtension = new LanguageExtension("com.intellij.ml.llm.fileContextBuilder");
/*    */     
/* 54 */     Intrinsics.checkNotNullExpressionValue(Language.getRegisteredLanguages(), "getRegisteredLanguages()"); Collection collection1 = Language.getRegisteredLanguages(); FileContextProvider fileContextProvider = 
/*    */       
/* 56 */       this;
/*    */ 
/*    */ 
/*    */     
/*    */     int $i$f$mapNotNull = 0;
/*    */ 
/*    */     
/* 63 */     Collection collection2 = collection1, destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 71 */     Iterable $this$forEach$iv$iv$iv = collection2; int $i$f$forEach = 0;
/* 72 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Language language = (Language)element$iv$iv;
/*    */       int $i$a$-mapNotNull-FileContextProvider$providers$1 = 0; }
/*    */     
/* 75 */     fileContextProvider.providers = CollectionsKt.toList(destination$iv$iv);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FileContext from(@NotNull PsiFile psiFile) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'psiFile'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield providers : Ljava/util/List;
/*    */     //   10: checkcast java/lang/Iterable
/*    */     //   13: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   18: astore_2
/*    */     //   19: aload_2
/*    */     //   20: invokeinterface hasNext : ()Z
/*    */     //   25: ifeq -> 57
/*    */     //   28: aload_2
/*    */     //   29: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   34: checkcast com/intellij/ml/llm/context/filebuilder/FileContextBuilder
/*    */     //   37: astore_3
/*    */     //   38: iconst_0
/*    */     //   39: istore #4
/*    */     //   41: aload_3
/*    */     //   42: aload_1
/*    */     //   43: invokeinterface getFileContext : (Lcom/intellij/psi/PsiFile;)Lcom/intellij/ml/llm/context/FileContext;
/*    */     //   48: astore_3
/*    */     //   49: aload_3
/*    */     //   50: ifnull -> 19
/*    */     //   53: aload_3
/*    */     //   54: goto -> 58
/*    */     //   57: aconst_null
/*    */     //   58: dup
/*    */     //   59: ifnonnull -> 105
/*    */     //   62: pop
/*    */     //   63: new com/intellij/ml/llm/context/FileContext
/*    */     //   66: dup
/*    */     //   67: aload_1
/*    */     //   68: aload_1
/*    */     //   69: invokeinterface getName : ()Ljava/lang/String;
/*    */     //   74: dup
/*    */     //   75: ldc 'psiFile.name'
/*    */     //   77: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   80: aload_1
/*    */     //   81: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   86: invokevirtual getPath : ()Ljava/lang/String;
/*    */     //   89: dup
/*    */     //   90: ldc 'psiFile.virtualFile.path'
/*    */     //   92: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   95: aconst_null
/*    */     //   96: aconst_null
/*    */     //   97: aconst_null
/*    */     //   98: aconst_null
/*    */     //   99: bipush #120
/*    */     //   101: aconst_null
/*    */     //   102: invokespecial <init> : (Lcom/intellij/psi/PsiFile;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   105: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #58	-> 6
/*    */     //   #59	-> 41
/*    */     //   #58	-> 48
/*    */     //   #58	-> 58
/*    */     //   #60	-> 63
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   41	7	4	$i$a$-firstNotNullOfOrNull-FileContextProvider$from$1	I
/*    */     //   38	10	3	provider	Lcom/intellij/ml/llm/context/filebuilder/FileContextBuilder;
/*    */     //   0	106	0	this	Lcom/intellij/ml/llm/context/FileContextProvider;
/*    */     //   0	106	1	psiFile	Lcom/intellij/psi/PsiFile;
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/context/FileContextProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */