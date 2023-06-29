/*    */ package com.intellij.ml.llm.dokuGuard.api;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\034\020\003\032\0020\0042\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bJ*\020\n\032\0020\0132\006\020\005\032\0020\0062\f\020\f\032\b\022\004\022\0020\r0\b2\f\020\007\032\b\022\004\022\0020\t0\bJ\026\020\016\032\0020\0172\006\020\005\032\0020\0062\006\020\020\032\0020\t¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion;", "", "()V", "countSuitableSections", "", "preferences", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationPreferences;", "sections", "", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "traverseSections", "", "listeners", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "validateSection", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "section", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nSectionsTraverser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionsTraverser.kt\ncom/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1855#2,2:62\n*S KotlinDebug\n*F\n+ 1 SectionsTraverser.kt\ncom/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion\n*L\n30#1:62,2\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final void traverseSections(@NotNull ValidationPreferences preferences, @NotNull List listeners, @NotNull List<? extends ProjectSection> sections) {
/* 28 */     Intrinsics.checkNotNullParameter(preferences, "preferences"); Intrinsics.checkNotNullParameter(listeners, "listeners"); Intrinsics.checkNotNullParameter(sections, "sections"); SectionValidatorBuilder validatorBuilder = SectionValidatorBuilder.Companion.fromPreferences(preferences);
/* 29 */     SectionsTraverser traverser = new SectionsTraverser(preferences, validatorBuilder);
/* 30 */     Iterable $this$forEach$iv = listeners; int $i$f$forEach = 0;
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
/*    */ 
/*    */ 
/*    */     
/* 62 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ValidationListener it = (ValidationListener)element$iv; int $i$a$-forEach-SectionsTraverser$Companion$traverseSections$1 = 0;
/*    */       traverser.addListener(it); }
/*    */     
/*    */     traverser.validateSections(sections);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ValidationDecision validateSection(@NotNull ValidationPreferences preferences, @NotNull ProjectSection section) {
/*    */     Intrinsics.checkNotNullParameter(preferences, "preferences");
/*    */     Intrinsics.checkNotNullParameter(section, "section");
/*    */     Ref.ObjectRef<ValidationDecision> sectionValidation = new Ref.ObjectRef();
/*    */     sectionValidation.element = ValidationDecision.Companion.getNO_CHANGE();
/*    */     SectionsTraverser$Companion$validateSection$sectionValidationListener$1 sectionValidationListener = new SectionsTraverser$Companion$validateSection$sectionValidationListener$1(sectionValidation);
/*    */     SectionValidatorBuilder validatorBuilder = SectionValidatorBuilder.Companion.fromPreferences(preferences);
/*    */     SectionsTraverser traverser = new SectionsTraverser(preferences, validatorBuilder);
/*    */     traverser.addListener(sectionValidationListener);
/*    */     traverser.validateSections(CollectionsKt.listOf(section));
/*    */     return (ValidationDecision)sectionValidation.element;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion$validateSection$sectionValidationListener$1", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationListener;", "sectionValidated", "", "projectSection", "Lcom/intellij/ml/llm/dokuGuard/api/ProjectSection;", "decision", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "intellij.ml.llm"})
/*    */   public static final class SectionsTraverser$Companion$validateSection$sectionValidationListener$1 implements ValidationListener {
/*    */     SectionsTraverser$Companion$validateSection$sectionValidationListener$1(Ref.ObjectRef<ValidationDecision> $sectionValidation) {}
/*    */     
/*    */     public void sectionValidated(@NotNull ProjectSection projectSection, @NotNull ValidationDecision decision) {
/*    */       Intrinsics.checkNotNullParameter(projectSection, "projectSection");
/*    */       Intrinsics.checkNotNullParameter(decision, "decision");
/*    */       this.$sectionValidation.element = decision;
/*    */     }
/*    */   }
/*    */   
/*    */   public final int countSuitableSections(@NotNull ValidationPreferences preferences, @NotNull List<? extends ProjectSection> sections) {
/*    */     Intrinsics.checkNotNullParameter(preferences, "preferences");
/*    */     Intrinsics.checkNotNullParameter(sections, "sections");
/*    */     CountingListener countingListener = new CountingListener();
/*    */     traverseSections(preferences, CollectionsKt.listOf(countingListener), sections);
/*    */     return countingListener.getCount();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/api/SectionsTraverser$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */