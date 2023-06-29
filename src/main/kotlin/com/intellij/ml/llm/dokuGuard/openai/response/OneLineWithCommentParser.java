/*    */ package com.intellij.ml.llm.dokuGuard.openai.response;
/*    */ 
/*    */ import com.intellij.ml.llm.dokuGuard.api.ValidationDecision;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/dokuGuard/openai/response/OneLineWithCommentParser;", "Lcom/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser;", "firstSentenceParser", "(Lcom/intellij/ml/llm/dokuGuard/openai/response/NullableResponseParser;)V", "parseOrNull", "Lcom/intellij/ml/llm/dokuGuard/api/ValidationDecision;", "response", "", "intellij.ml.llm"})
/*    */ public final class OneLineWithCommentParser
/*    */   implements NullableResponseParser
/*    */ {
/*    */   @NotNull
/*    */   private final NullableResponseParser firstSentenceParser;
/*    */   
/*    */   public OneLineWithCommentParser(@NotNull NullableResponseParser firstSentenceParser) {
/* 56 */     this.firstSentenceParser = firstSentenceParser; } @Nullable
/*    */   public ValidationDecision parseOrNull(@NotNull String response) { ValidationDecision okOrFail;
/* 58 */     Intrinsics.checkNotNullParameter(response, "response"); String[] arrayOfString = new String[1]; arrayOfString[0] = "."; List<String> sentences = StringsKt.split$default(response, arrayOfString, false, 0, 6, null);
/* 59 */     if (sentences.size() < 2) return null; 
/* 60 */     if (this.firstSentenceParser.parseOrNull(sentences.get(0)) == null) { this.firstSentenceParser.parseOrNull(sentences.get(0)); return null; }
/* 61 */      if (okOrFail.getImportance() == null) return ValidationDecision.Companion.getNO_CHANGE(); 
/* 62 */     return ValidationDecision.Companion.shouldChange(StringsKt.trim(CollectionsKt.joinToString$default(CollectionsKt.drop(sentences, 1), ". ", null, null, 0, null, null, 62, null)).toString()); }
/*    */ 
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/dokuGuard/openai/response/OneLineWithCommentParser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */