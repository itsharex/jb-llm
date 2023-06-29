/*     */ package com.intellij.ml.llm.kotlin.refactorings;
/*     */ 
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020 \n\002\020\016\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nVariableContextCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usageContext$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1549#2:158\n1620#2,3:159\n*S KotlinDebug\n*F\n+ 1 VariableContextCollector.kt\ncom/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usageContext$1\n*L\n35#1:158\n35#1:159,3\n*E\n"})
/*     */ final class VariableContextCollector$createContextPrompt$usageContext$1
/*     */   extends Lambda
/*     */   implements Function0<List<? extends String>>
/*     */ {
/*     */   VariableContextCollector$createContextPrompt$usageContext$1(List<PsiElement> $usages, String $originalName, String $newVariableName) {
/*     */     super(0);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> invoke() {
/*  35 */     List<PsiElement> list1 = this.$usages; String str1 = this.$originalName, str2 = this.$newVariableName; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     List<PsiElement> list2 = list1; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 159 */     for (PsiElement item$iv$iv : list2) {
/* 160 */       PsiElement psiElement1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-VariableContextCollector$createContextPrompt$usageContext$1$1 = 0; collection.add(VariableContextCollector.access$createContextString(VariableContextCollector.INSTANCE, psiElement1, str1, str2));
/* 161 */     }  return (List<String>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/refactorings/VariableContextCollector$createContextPrompt$usageContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */