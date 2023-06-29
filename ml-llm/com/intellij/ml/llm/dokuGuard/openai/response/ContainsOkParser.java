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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\005¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/ContainsOkParser;", "Lcom/intellij/ml/llm/dokuGuard/openai/response/ResponseParser;", "()V", "parse", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "response", "", "intellij.ml.llm"})
/*    */ public final class ContainsOkParser
/*    */   implements ResponseParser
/*    */ {
/*    */   @NotNull
/*    */   public ValidationDecision parse(@NotNull String response) {
/* 31 */     Intrinsics.checkNotNullParameter(response, "response"); return StringsKt.contains(response, ResponseVerdict.VALID.getAsResponse(), true) ? 
/* 32 */       ValidationDecision.Companion.getNO_CHANGE() : 
/*    */ 
/*    */       
/* 35 */       ValidationDecision.Companion.getCHANGE_MANDATORY();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/ContainsOkParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */