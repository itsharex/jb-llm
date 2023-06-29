/*     */ package com.intellij.ml.llm.refactorings;
/*     */ 
/*     */ import com.intellij.codeInsight.TargetElementUtil;
/*     */ import com.intellij.openapi.editor.Caret;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\t\030\0010\001¢\006\002\b\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Lcom/intellij/psi/PsiElement;", "Lorg/jetbrains/annotations/Nullable;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nLlmLookupManagerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1603#2,9:151\n1855#2:160\n1856#2:162\n1612#2:163\n1#3:161\n*S KotlinDebug\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1\n*L\n56#1:151,9\n56#1:160\n56#1:162\n56#1:163\n56#1:161\n*E\n"})
/*     */ final class LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1
/*     */   extends Lambda
/*     */   implements Function0<PsiElement>
/*     */ {
/*     */   @Nullable
/*     */   public final PsiElement invoke() {
/*  55 */     Intrinsics.checkNotNullExpressionValue(this.$editor.getCaretModel().getAllCarets(), "editor.caretModel.allCarets"); List list1 = this.$editor.getCaretModel().getAllCarets();
/*  56 */     TargetElementUtil targetElementUtil = this.$targetElementUtil; Editor editor = this.$editor; int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     Iterable $this$forEach$iv$iv$iv = list2; int $i$f$forEach = 0;
/* 160 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; Caret it = (Caret)element$iv$iv;
/*     */       int $i$a$-mapNotNull-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1$1 = 0; }
/*     */     
/* 163 */     return (PsiElement)CollectionsKt.singleOrNull(CollectionsKt.distinct(destination$iv$iv));
/*     */   }
/*     */   
/*     */   LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1(Editor $editor, TargetElementUtil $targetElementUtil) {
/*     */     super(0);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$targetElement$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */