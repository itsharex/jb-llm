/*     */ package com.intellij.ml.llm.kotlin.refactorings;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.kotlin.psi.KtReferenceExpression;
/*     */ import org.jetbrains.kotlin.psi.KtValVarKeywordOwner;
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1#2:158\n1#2:178\n1360#3:159\n1446#3,5:160\n766#3:165\n857#3,2:166\n1603#3,9:168\n1855#3:177\n1856#3:179\n1612#3:180\n1045#3:181\n1549#3:182\n1620#3,3:183\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1\n*L\n24#1:178\n22#1:159\n22#1:160,5\n23#1:165\n23#1:166,2\n24#1:168,9\n24#1:177\n24#1:179\n24#1:180\n25#1:181\n28#1:182\n28#1:183,3\n*E\n"})
/*     */ final class VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1 extends Lambda implements Function0<List<? extends String>> {
/*     */   @NotNull
/*     */   public final List<String> invoke() {
/*  20 */     List<KtValVarKeywordOwner> list1 = this.$variablesInsideInitializer;
/*  21 */     List<KtValVarKeywordOwner> variables = list1;
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
/* 158 */     int $i$a$-takeIf-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$1 = 0; if ((((variables.size() < 3)) ? list1 : null) == null)
/* 159 */       ((variables.size() < 3)) ? list1 : null;  list1 = CollectionsKt.emptyList(); VariableContextCollector variableContextCollector = VariableContextCollector.INSTANCE; int $i$f$flatMap = 0; List<KtValVarKeywordOwner> list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$flatMapTo = 0;
/* 160 */     for (KtValVarKeywordOwner element$iv$iv : list2) {
/* 161 */       KtValVarKeywordOwner p0 = element$iv$iv; int $i$a$-flatMap-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$2 = 0; Iterable list$iv$iv = VariableContextCollector.access$findVariableReferences(variableContextCollector, p0);
/* 162 */       CollectionsKt.addAll(collection, list$iv$iv);
/*     */     } 
/* 164 */     Iterable $this$flatMap$iv = collection; KtValVarKeywordOwner ktValVarKeywordOwner = this.$variable; int $i$f$filter = 0;
/* 165 */     Iterable $this$flatMapTo$iv$iv = $this$flatMap$iv; collection = new ArrayList(); int $i$f$filterTo = 0;
/* 166 */     for (Object element$iv$iv : $this$flatMapTo$iv$iv) { KtReferenceExpression reference = (KtReferenceExpression)element$iv$iv; int $i$a$-filter-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$3 = 0; if ((reference.getTextRange().getEndOffset() < ktValVarKeywordOwner.getTextRange().getStartOffset())) collection.add(element$iv$iv);  }
/* 167 */      Iterable $this$filter$iv = collection; int $i$f$mapNotNull = 0;
/* 168 */     Iterable iterable1 = $this$filter$iv; Collection<String> destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 177 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; KtReferenceExpression reference = (KtReferenceExpression)element$iv$iv;
/*     */       int $i$a$-mapNotNull-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$4 = 0; }
/*     */     
/* 180 */     Iterable $this$mapNotNull$iv = destination$iv$iv; int $i$f$sortedBy = 0;
/* 181 */     Iterable $this$sortedBy$iv = CollectionsKt.distinct(CollectionsKt.takeLast(CollectionsKt.sortedWith($this$mapNotNull$iv, new VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$invoke$$inlined$sortedBy$1()), 3)); int $i$f$map = 0;
/* 182 */     Iterable $this$mapNotNullTo$iv$iv = $this$sortedBy$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$sortedBy$iv, 10)); int $i$f$mapTo = 0;
/* 183 */     for (Object item$iv$iv : $this$mapNotNullTo$iv$iv) {
/* 184 */       PsiElement psiElement = (PsiElement)item$iv$iv; Collection<String> collection1 = destination$iv$iv; int $i$a$-map-VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1$6 = 0; collection1.add(VariableContextCollector.createContextString$default(VariableContextCollector.INSTANCE, psiElement, null, null, 6, null));
/* 185 */     }  return (List<String>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1(List<KtValVarKeywordOwner> $variablesInsideInitializer, KtValVarKeywordOwner $variable) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usagesOfPassedVariables$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */