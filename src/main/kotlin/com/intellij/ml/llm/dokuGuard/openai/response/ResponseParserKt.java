/*     */ package com.intellij.ml.llm.dokuGuard.openai.response;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\006\020\000\032\0020\001\032\n\020\002\032\0020\003*\0020\003\032\n\020\002\032\0020\001*\0020\001¨\006\004"}, d2 = {"defaultResponseParser", "Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;", "trimming", "Lcom/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser;", "intellij.ml.llm"})
/*     */ public final class ResponseParserKt
/*     */ {
/*     */   @NotNull
/*     */   public static final NullableResponseParser trimming(@NotNull NullableResponseParser $this$trimming) {
/*  91 */     Intrinsics.checkNotNullParameter($this$trimming, "<this>"); return new TrimmingNullableParser($this$trimming);
/*     */   }
/*     */   @NotNull
/*     */   public static final ResponseParser trimming(@NotNull ResponseParser $this$trimming) {
/*  95 */     Intrinsics.checkNotNullParameter($this$trimming, "<this>"); return new TrimmingParser($this$trimming);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final ResponseParser defaultResponseParser() {
/* 100 */     NullableResponseParser[] arrayOfNullableResponseParser = new NullableResponseParser[3]; arrayOfNullableResponseParser[0] = trimming(new SeveralLinesParser(trimming(new StartsWithOkOrFailParser()))); arrayOfNullableResponseParser[1] = 
/* 101 */       trimming(new OneLineWithCommentParser(trimming(new ContainsOkParser())));
/* 102 */     arrayOfNullableResponseParser[2] = trimming(new StartsWithOkOrFailParser());
/*     */ 
/*     */     
/* 105 */     return trimming(new AlternativeParser(CollectionsKt.listOf((Object[])arrayOfNullableResponseParser), new ContainsOkParser()));
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/ResponseParserKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */