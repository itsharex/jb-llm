/*     */ package com.intellij.ml.llm.dokuGuard.openai.response;
/*     */ 
/*     */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\033\022\f\020\002\032\b\022\004\022\0020\0040\003\022\006\020\005\032\0020\001¢\006\002\020\006J\020\020\007\032\0020\b2\006\020\t\032\0020\nH\026R\016\020\005\032\0020\001X\004¢\006\002\n\000R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/AlternativeParser;", "Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;", "priority", "", "Lcom/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser;", "fallback", "(Ljava/util/List;Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;)V", "parse", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "response", "", "intellij.ml.llm"})
/*     */ @SourceDebugExtension({"SMAP\nResponseParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseParser.kt\ncom/intellij/ml/llm/dokuGuard/openai/response/AlternativeParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1855#2:107\n1856#2:109\n1#3:108\n*S KotlinDebug\n*F\n+ 1 ResponseParser.kt\ncom/intellij/ml/llm/dokuGuard/openai/response/AlternativeParser\n*L\n71#1:107\n71#1:109\n*E\n"})
/*     */ public final class AlternativeParser
/*     */   implements ResponseParser
/*     */ {
/*     */   @NotNull
/*     */   private final List<NullableResponseParser> priority;
/*     */   @NotNull
/*     */   private final ResponseParser fallback;
/*     */   
/*     */   public AlternativeParser(@NotNull List<NullableResponseParser> priority, @NotNull ResponseParser fallback) {
/*  67 */     this.priority = priority;
/*  68 */     this.fallback = fallback;
/*     */   } @NotNull
/*     */   public ValidationDecision parse(@NotNull String response) {
/*  71 */     Intrinsics.checkNotNullParameter(response, "response"); Iterable<NullableResponseParser> $this$forEach$iv = this.priority; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 107 */     Iterator<NullableResponseParser> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); NullableResponseParser primaryParser = (NullableResponseParser)element$iv; int $i$a$-forEach-AlternativeParser$parse$1 = 0; if (primaryParser.parseOrNull(response) != null) {
/* 108 */         ValidationDecision it = primaryParser.parseOrNull(response); int $i$a$-let-AlternativeParser$parse$1$1 = 0;
/*     */         return it;
/*     */       }  }
/*     */     
/*     */     return this.fallback.parseOrNull(response);
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/AlternativeParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */