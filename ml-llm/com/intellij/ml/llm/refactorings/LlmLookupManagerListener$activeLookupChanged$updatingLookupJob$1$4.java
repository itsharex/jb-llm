/*     */ package com.intellij.ml.llm.refactorings;
/*     */ 
/*     */ import com.intellij.codeInsight.completion.PrefixMatcher;
/*     */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @DebugMetadata(f = "LlmLookupManagerListener.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.refactorings.LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4")
/*     */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nLlmLookupManagerListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1549#2:151\n1620#2,3:152\n1855#2,2:155\n*S KotlinDebug\n*F\n+ 1 LlmLookupManagerListener.kt\ncom/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4\n*L\n73#1:151\n73#1:152,3\n74#1:155,2\n*E\n"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(List<String> $uniqNames, LookupImpl $lookup, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Object $result) {
/*     */     Iterable<String> $this$map$iv;
/*     */     Iterable $this$forEach$iv;
/*     */     int $i$f$map;
/*     */     LookupImpl lookupImpl;
/*     */     Iterable<String> iterable1;
/*     */     int $i$f$forEach;
/*     */     Collection<LlmLookupManagerListener.LlmLookupElement> destination$iv$iv;
/*     */     int $i$f$mapTo;
/*  71 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  72 */         $this$map$iv = this.$uniqNames;
/*  73 */         $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 151 */         iterable1 = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 152 */         for (String item$iv$iv : iterable1) {
/* 153 */           String str1 = item$iv$iv; Collection<LlmLookupManagerListener.LlmLookupElement> collection = destination$iv$iv; int $i$a$-map-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4$1 = 0; collection.add(new LlmLookupManagerListener.LlmLookupElement(str1));
/* 154 */         }  $this$forEach$iv = destination$iv$iv; lookupImpl = this.$lookup; $i$f$forEach = 0;
/* 155 */         for (Object element$iv : $this$forEach$iv) { LlmLookupManagerListener.LlmLookupElement it = (LlmLookupManagerListener.LlmLookupElement)element$iv; int $i$a$-forEach-LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4$2 = 0;
/*     */           lookupImpl.addItem(it, PrefixMatcher.ALWAYS_TRUE); }
/*     */         
/*     */         this.$lookup.setCalculating(false);
/*     */         this.$lookup.refreshUi(true, false);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*     */     return (Continuation<Unit>)new Object(this.$uniqNames, this.$lookup, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/refactorings/LlmLookupManagerListener$activeLookupChanged$updatingLookupJob$1$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */