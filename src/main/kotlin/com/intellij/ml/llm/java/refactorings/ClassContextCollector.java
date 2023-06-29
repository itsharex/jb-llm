/*    */ package com.intellij.ml.llm.java.refactorings;
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\002J\026\020\007\032\0020\b2\006\020\t\032\0020\0062\006\020\n\032\0020\b¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/java/refactorings/ClassContextCollector;", "", "()V", "clearClass", "", "classCopy", "Lcom/intellij/psi/PsiClass;", "createContextPrompt", "", "clazz", "newClassName", "intellij.ml.llm.java"})
/*    */ @SourceDebugExtension({"SMAP\nClassContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/java/refactorings/ClassContextCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1#2:21\n13579#3,2:22\n13579#3,2:24\n13579#3,2:26\n*S KotlinDebug\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/java/refactorings/ClassContextCollector\n*L\n16#1:22,2\n17#1:24,2\n18#1:26,2\n*E\n"})
/*    */ public final class ClassContextCollector { @NotNull
/*    */   public static final ClassContextCollector INSTANCE = new ClassContextCollector();
/*    */   
/*    */   @NotNull
/*  8 */   public final String createContextPrompt(@NotNull PsiClass clazz, @NotNull String newClassName) { Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(newClassName, "newClassName"); Intrinsics.checkNotNull(clazz.copy(), "null cannot be cast to non-null type com.intellij.psi.PsiClass"); PsiClass classCopy = (PsiClass)clazz.copy();
/*  9 */     clearClass(classCopy);
/* 10 */     PsiFile psiFile = clazz.getContainingFile(); String pkg = ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement().getText();
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
/* 21 */     int $i$a$-let-ClassContextCollector$createContextPrompt$packageStatement$1 = 0; ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement().getText(); if (((((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null) != null && ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement() != null && ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement().getText() != null) ? (pkg + "\n\n") : null) == null) (((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null) != null && ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement() != null && ((psiFile instanceof com.intellij.psi.PsiJavaFile) ? psiFile : null).getPackageStatement().getText() != null) ? (pkg + "\n\n") : null;  String packageStatement = ""; classCopy.getIdentifyingElement(); if (((classCopy.getIdentifyingElement() != null) ? classCopy.getIdentifyingElement().getText() : null) == null)
/* 22 */       (classCopy.getIdentifyingElement() != null) ? classCopy.getIdentifyingElement().getText() : null;  String oldName = ""; Intrinsics.checkNotNullExpressionValue(classCopy.getText(), "classCopy.text"); return packageStatement + packageStatement; } private final void clearClass(PsiClass classCopy) { Intrinsics.checkNotNullExpressionValue(classCopy.getFields(), "classCopy.fields"); Object[] $this$forEach$iv = (Object[])classCopy.getFields(); int $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b]; PsiField it = (PsiField)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$1 = 0; if (it.getInitializer() != null) { it.getInitializer().delete(); } else { it.getInitializer(); }
/*    */        }
/* 24 */      Intrinsics.checkNotNullExpressionValue(classCopy.getMethods(), "classCopy.methods"); $this$forEach$iv = (Object[])classCopy.getMethods(); $i$f$forEach = 0; b = 0; i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b]; PsiMethod it = (PsiMethod)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$2 = 0; if (it.getBody() != null) { it.getBody().delete(); } else { it.getBody(); }
/*    */        }
/* 26 */      Intrinsics.checkNotNullExpressionValue(classCopy.getInnerClasses(), "classCopy.innerClasses"); $this$forEach$iv = (Object[])classCopy.getInnerClasses(); $i$f$forEach = 0; b = 0; i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b]; PsiClass it = (PsiClass)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$3 = 0;
/*    */       Intrinsics.checkNotNullExpressionValue(it, "it");
/*    */       INSTANCE.clearClass(it); }
/*    */      }
/*    */    }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/java/refactorings/ClassContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */