/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.codeInsight.daemon.impl.HighlightInfo;
/*    */ import com.intellij.openapi.editor.ex.RangeHighlighterEx;
/*    */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;)Ljava/lang/Boolean;"})
/*    */ final class FixProblemInSelectedFragment$collectMessages$1
/*    */   extends Lambda
/*    */   implements Function1<RangeHighlighterEx, Boolean>
/*    */ {
/*    */   @NotNull
/*    */   public final Boolean invoke(RangeHighlighterEx it) {
/* 60 */     HighlightInfo.fromRangeHighlighter((RangeHighlighter)it); if (((HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null) == null) { (HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null; return Boolean.valueOf(true); }  ((HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null).add((HighlightInfo.fromRangeHighlighter((RangeHighlighter)it) != null) ? HighlightInfo.fromRangeHighlighter((RangeHighlighter)it).getDescription() : null);
/* 61 */     return Boolean.valueOf(true);
/*    */   }
/*    */   
/*    */   FixProblemInSelectedFragment$collectMessages$1(List<String> $messages) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixProblemInSelectedFragment$collectMessages$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */