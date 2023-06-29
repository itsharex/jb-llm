/*     */ package com.intellij.ml.llm.kotlin.commitChecks;
/*     */ 
/*     */ import com.intellij.codeInspection.ProblemDescriptor;
/*     */ import com.intellij.codeInspection.ex.LocalInspectionToolWrapper;
/*     */ import com.intellij.openapi.progress.ProgressManager;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\b\002\020\000\032\020\022\f\022\n \003*\004\030\0010\0020\0020\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lcom/intellij/codeInspection/ProblemDescriptor;", "kotlin.jvm.PlatformType", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nVerifyChangedFunctionsDocumentationCheckinHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,157:1\n1477#2:158\n1502#2,3:159\n1505#2,3:169\n361#3,7:162\n76#4:172\n96#4,5:173\n*S KotlinDebug\n*F\n+ 1 VerifyChangedFunctionsDocumentationCheckinHandler.kt\ncom/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1\n*L\n65#1:158\n65#1:159,3\n65#1:169,3\n65#1:162,7\n65#1:172\n65#1:173,5\n*E\n"})
/*     */ final class VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1
/*     */   extends Lambda
/*     */   implements Function0<List<? extends ProblemDescriptor>>
/*     */ {
/*     */   @NotNull
/*     */   public final List<ProblemDescriptor> invoke() {
/*  65 */     Iterable<PsiElement> $this$groupBy$iv = this.$changedFunctionsWithDoc; int $i$f$groupBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     Iterable<PsiElement> iterable1 = $this$groupBy$iv; Map<Object, Object> map3 = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 159 */     for (PsiElement element$iv$iv : iterable1) {
/* 160 */       PsiElement it = element$iv$iv; int $i$a$-groupBy-VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1$1 = 0; Object key$iv$iv = it.getContainingFile();
/* 161 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map3; int $i$f$getOrPut = 0;
/* 162 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     Map<Object, Object> map1 = map3; int $i$f$flatMap = 0;
/* 172 */     Map<Object, Object> map2 = map1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 173 */     for (Map.Entry<Object, Object> element$iv$iv : map2.entrySet()) {
/* 174 */       Map.Entry<Object, Object> entry1 = element$iv$iv; int $i$a$-flatMap-VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1$2 = 0; PsiFile file = (PsiFile)entry1.getKey(); List elements = (List)entry1.getValue(); LocalInspectionToolWrapper[] arrayOfLocalInspectionToolWrapper = new LocalInspectionToolWrapper[2]; arrayOfLocalInspectionToolWrapper[0] = VerifyChangedFunctionsDocumentationCheckinHandler.access$getJavaInspectionWrapper$cp(); arrayOfLocalInspectionToolWrapper[1] = VerifyChangedFunctionsDocumentationCheckinHandler.access$getKotlinInspectionWrapper$cp();
/*     */       Intrinsics.checkNotNull(ProgressManager.getGlobalProgressIndicator());
/*     */     } 
/* 177 */     return (List<ProblemDescriptor>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1(List<PsiElement> $changedFunctionsWithDoc) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/kotlin/commitChecks/VerifyChangedFunctionsDocumentationCheckinHandler$runCheck$problems$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */