/*    */ package com.intellij.ml.llm.python.refactorings;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\002J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\0062\006\020\f\032\0020\b¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/python/refactorings/ClassContextCollector;", "", "()V", "clearClass", "", "classCopy", "Lcom/jetbrains/python/psi/PyClass;", "createContextPrompt", "", "project", "Lcom/intellij/openapi/project/Project;", "clazz", "namePlaceholder", "intellij.ml.llm.python"})
/*    */ @SourceDebugExtension({"SMAP\nClassContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/python/refactorings/ClassContextCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n1#2:22\n1855#3,2:23\n1855#3,2:25\n13579#4,2:27\n13579#4,2:29\n*S KotlinDebug\n*F\n+ 1 ClassContextCollector.kt\ncom/intellij/ml/llm/python/refactorings/ClassContextCollector\n*L\n16#1:23,2\n17#1:25,2\n18#1:27,2\n19#1:29,2\n*E\n"})
/*    */ public final class ClassContextCollector {
/*    */   @NotNull
/*  8 */   public final String createContextPrompt(@NotNull Project project, @NotNull PyClass clazz, @NotNull String namePlaceholder) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(namePlaceholder, "namePlaceholder"); Intrinsics.checkNotNull(clazz.copy(), "null cannot be cast to non-null type com.jetbrains.python.psi.PyClass"); PyClass classCopy = (PyClass)clazz.copy();
/*  9 */     clearClass(classCopy);
/* 10 */     String module = clazz.getContainingFile().getName();
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
/* 22 */     int $i$a$-let-ClassContextCollector$createContextPrompt$moduleText$1 = 0; String moduleText = "# module: " + module + "\n\n"; Intrinsics.checkNotNullExpressionValue(classCopy.getText(), "classCopy.text"); if (clazz.getName() == null)
/* 23 */       clazz.getName();  String classText = StringsKt.replace$default(clazz.getName(), "", namePlaceholder, false, 4, null); return moduleText + moduleText; } @NotNull public static final ClassContextCollector INSTANCE = new ClassContextCollector(); private final void clearClass(PyClass classCopy) { Intrinsics.checkNotNullExpressionValue(classCopy.getInstanceAttributes(), "classCopy.instanceAttributes"); Iterable iterable = classCopy.getInstanceAttributes(); int $i$f$forEach = 0; Iterator iterator = iterable.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PyTargetExpression it = (PyTargetExpression)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$1 = 0; if (it.findAssignedValue() != null) { it.findAssignedValue().delete(); } else { it.findAssignedValue(); }
/*    */        }
/* 25 */      Intrinsics.checkNotNullExpressionValue(classCopy.getClassAttributes(), "classCopy.classAttributes"); iterable = classCopy.getClassAttributes(); $i$f$forEach = 0; iterator = iterable.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PyTargetExpression it = (PyTargetExpression)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$2 = 0; if (it.findAssignedValue() != null) { it.findAssignedValue().delete(); } else { it.findAssignedValue(); }
/*    */        }
/* 27 */      Intrinsics.checkNotNullExpressionValue(classCopy.getMethods(), "classCopy.methods"); Object[] $this$forEach$iv = (Object[])classCopy.getMethods(); $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b]; PyFunction it = (PyFunction)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$3 = 0; it.getStatementList().delete(); }
/*    */      Intrinsics.checkNotNullExpressionValue(classCopy.getNestedClasses(), "classCopy.nestedClasses"); $this$forEach$iv = (Object[])classCopy.getNestedClasses(); $i$f$forEach = 0;
/* 29 */     b = 0; i = $this$forEach$iv.length; if (b < i) { Object element$iv = $this$forEach$iv[b]; PyClass it = (PyClass)element$iv; int $i$a$-forEach-ClassContextCollector$clearClass$4 = 0;
/*    */       Intrinsics.checkNotNullExpressionValue(it, "it");
/*    */       INSTANCE.clearClass(it); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/refactorings/ClassContextCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */