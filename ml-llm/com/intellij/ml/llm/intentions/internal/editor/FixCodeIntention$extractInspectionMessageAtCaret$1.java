/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.codeInsight.daemon.impl.HighlightInfo;
/*    */ import com.intellij.openapi.editor.ex.RangeHighlighterEx;
/*    */ import com.intellij.openapi.editor.markup.RangeHighlighter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Ref;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\0012\016\020\002\032\n \004*\004\030\0010\0030\003H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "highlighter", "Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/intellij/openapi/editor/ex/RangeHighlighterEx;)Ljava/lang/Boolean;"})
/*    */ final class FixCodeIntention$extractInspectionMessageAtCaret$1
/*    */   extends Lambda
/*    */   implements Function1<RangeHighlighterEx, Boolean>
/*    */ {
/*    */   @NotNull
/*    */   public final Boolean invoke(RangeHighlighterEx highlighter) {
/* 35 */     HighlightInfo highlightInfo = HighlightInfo.fromRangeHighlighter((RangeHighlighter)highlighter);
/* 36 */     String description = (highlightInfo != null) ? highlightInfo.getDescription() : null;
/*    */     
/* 38 */     this.$inspectionMessage.element = description;
/*    */ 
/*    */ 
/*    */     
/* 42 */     return Boolean.valueOf(!(description != null));
/*    */   }
/*    */   
/*    */   FixCodeIntention$extractInspectionMessageAtCaret$1(Ref.ObjectRef<String> $inspectionMessage) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/FixCodeIntention$extractInspectionMessageAtCaret$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */