/*    */ package com.intellij.ml.llm.dokuGuard.openai.response;
/*    */ 
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\005¢\006\002\020\002J\022\020\003\032\004\030\0010\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/StartsWithOkOrFailParser;", "Lcom/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser;", "()V", "parseOrNull", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "response", "", "intellij.ml.llm"})
/*    */ public final class StartsWithOkOrFailParser
/*    */   implements NullableResponseParser
/*    */ {
/*    */   @Nullable
/*    */   public ValidationDecision parseOrNull(@NotNull String response) {
/* 17 */     Intrinsics.checkNotNullParameter(response, "response"); return StringsKt.startsWith(response, ResponseVerdict.VALID.getAsResponse(), true) ? 
/* 18 */       ValidationDecision.Companion.getNO_CHANGE() : (
/*    */       
/* 20 */       StringsKt.startsWith(response, ResponseVerdict.INVALID.getAsResponse(), true) ? 
/* 21 */       ValidationDecision.Companion.getCHANGE_MANDATORY() : 
/*    */ 
/*    */       
/* 24 */       null);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/StartsWithOkOrFailParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */