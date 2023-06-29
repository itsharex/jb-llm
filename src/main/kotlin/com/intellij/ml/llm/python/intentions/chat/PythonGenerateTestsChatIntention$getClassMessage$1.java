/*     */ package com.intellij.ml.llm.python.intentions.chat;
/*     */ 
/*     */ import com.intellij.ml.llm.python.context.PythonContextUtils;
/*     */ import com.jetbrains.python.psi.PyClass;
/*     */ import com.jetbrains.python.psi.PyFunction;
/*     */ import com.jetbrains.python.psi.PyIndentUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nPythonGenerateTestsChatIntention.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonGenerateTestsChatIntention.kt\ncom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$getClassMessage$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n11335#2:188\n11670#2,3:189\n1549#3:192\n1620#3,3:193\n1#4:196\n*S KotlinDebug\n*F\n+ 1 PythonGenerateTestsChatIntention.kt\ncom/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$getClassMessage$1\n*L\n135#1:188\n135#1:189,3\n136#1:192\n136#1:193,3\n*E\n"})
/*     */ final class PythonGenerateTestsChatIntention$getClassMessage$1
/*     */   extends Lambda
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/* 129 */     this.$className.element = this.$clazz.getName();
/*     */     
/* 131 */     this.$usagesText.element = PythonContextUtils.INSTANCE.getClassUsagesText(this.$clazz);
/* 132 */     Intrinsics.checkNotNullExpressionValue(PyIndentUtil.changeIndent(this.$clazz.getText(), true, StringsKt.repeat(" ", 4)), "changeIndent(clazz.text, true, \" \".repeat(4))"); this.$classText.element = PyIndentUtil.changeIndent(this.$clazz.getText(), true, StringsKt.repeat(" ", 4));
/* 133 */     if (StringsKt.lines((CharSequence)this.$classText.element).size() > 100) {
/* 134 */       Intrinsics.checkNotNullExpressionValue(this.$clazz.getMethods(), "clazz.methods"); Object[] arrayOfObject1 = (Object[])this.$clazz.getMethods();
/* 135 */       PythonGenerateTestsChatIntention pythonGenerateTestsChatIntention = PythonGenerateTestsChatIntention.this; int i = 0;
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
/* 188 */       Object[] arrayOfObject2 = arrayOfObject1; Collection<String> collection1 = new ArrayList(arrayOfObject1.length); int j = 0; byte b; int k;
/* 189 */       for (b = 0, k = arrayOfObject2.length; b < k; ) { Object item$iv$iv = arrayOfObject2[b];
/* 190 */         PyFunction pyFunction = (PyFunction)item$iv$iv; Collection<String> collection = collection1; int $i$a$-map-PythonGenerateTestsChatIntention$getClassMessage$1$methodsSignatures$1 = 0; Intrinsics.checkNotNullExpressionValue(pyFunction, "it"); collection.add(PythonGenerateTestsChatIntention.access$getFunctionSignatureText(pythonGenerateTestsChatIntention, pyFunction)); }
/* 191 */        List list1 = (List)collection1; int $i$f$map = 0;
/* 192 */       List list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 193 */       for (Object item$iv$iv : list2) {
/* 194 */         String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-PythonGenerateTestsChatIntention$getClassMessage$1$methodsSignatures$2 = 0; collection.add(PyIndentUtil.changeIndent(str, false, ""));
/* 195 */       }  String it = CollectionsKt.joinToString$default(destination$iv$iv, "\n\n", null, null, 0, null, null, 62, null);
/* 196 */       int $i$a$-let-PythonGenerateTestsChatIntention$getClassMessage$1$methodsSignatures$3 = 0;
/*     */       String str1 = PyIndentUtil.changeIndent(it, false, StringsKt.repeat(" ", 4));
/*     */       Intrinsics.checkNotNullExpressionValue(str1, "clazz.methods\n          …, false, \" \".repeat(4)) }");
/*     */       String methodsSignatures = str1;
/*     */       this.$classText.element = StringsKt.trimIndent("\n" + PythonGenerateTestsChatIntention.access$getClassSignatureText(PythonGenerateTestsChatIntention.this, this.$clazz) + "\n" + methodsSignatures + "\n        ");
/*     */     } 
/*     */   }
/*     */   
/*     */   PythonGenerateTestsChatIntention$getClassMessage$1(PyClass $clazz, Ref.ObjectRef<String> $usagesText, Ref.ObjectRef<String> $classText, PythonGenerateTestsChatIntention $receiver) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/python/intentions/chat/PythonGenerateTestsChatIntention$getClassMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */