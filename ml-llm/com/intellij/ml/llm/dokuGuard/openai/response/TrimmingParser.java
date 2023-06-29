/*    */ package com.intellij.ml.llm.dokuGuard.openai.response;
/*    */ 
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/TrimmingParser;", "Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;", "innerParser", "(Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;)V", "parse", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "response", "", "intellij.ml.llm"})
/*    */ public final class TrimmingParser
/*    */   implements ResponseParser
/*    */ {
/*    */   @NotNull
/*    */   private final ResponseParser innerParser;
/*    */   
/*    */   public TrimmingParser(@NotNull ResponseParser innerParser) {
/* 84 */     this.innerParser = innerParser; } @NotNull
/*    */   public ValidationDecision parse(@NotNull String response) {
/* 86 */     Intrinsics.checkNotNullParameter(response, "response"); return this.innerParser.parse(StringsKt.trim(response).toString());
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/TrimmingParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */