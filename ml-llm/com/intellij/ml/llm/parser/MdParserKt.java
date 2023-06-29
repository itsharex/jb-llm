/*    */ package com.intellij.ml.llm.parser;
/*    */ 
/*    */ import com.intellij.ml.llm.core.models.requestResponse.LLMResponseChoice;
/*    */ import java.util.List;
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"asCode", "", "Lcom/intellij/ml/llm/core/models/requestResponse/LLMResponseChoice;", "intellij.ml.llm"})
/*    */ @SourceDebugExtension({"SMAP\nMdParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MdParser.kt\ncom/intellij/ml/llm/parser/MdParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n223#2,2:31\n*S KotlinDebug\n*F\n+ 1 MdParser.kt\ncom/intellij/ml/llm/parser/MdParserKt\n*L\n28#1:31,2\n*E\n"})
/*    */ public final class MdParserKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String asCode(@NotNull LLMResponseChoice $this$asCode) {
/* 23 */     Intrinsics.checkNotNullParameter($this$asCode, "<this>"); List<TextChunk> textChunks = (new MdParser()).parse($this$asCode.getText());
/* 24 */     if (textChunks.size() == 1) {
/* 25 */       return ((TextChunk)CollectionsKt.first(textChunks)).getRawText();
/*    */     }
/*    */     
/* 28 */     Iterable<TextChunk> $this$first$iv = textChunks; int $i$f$first = 0;
/*    */ 
/*    */     
/* 31 */     for (TextChunk element$iv : $this$first$iv) { TextChunk it = element$iv; int $i$a$-first-MdParserKt$asCode$1 = 0; if (it instanceof CodeChunk); }
/* 32 */      throw new NoSuchElementException("Collection contains no element matching the predicate.");
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/parser/MdParserKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */