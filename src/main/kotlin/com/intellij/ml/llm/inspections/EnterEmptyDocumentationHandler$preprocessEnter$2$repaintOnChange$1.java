/*    */ package com.intellij.ml.llm.inspections;
/*    */ 
/*    */ import com.intellij.codeInsight.hints.presentation.PresentationRenderer;
/*    */ import com.intellij.openapi.editor.Inlay;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class EnterEmptyDocumentationHandler$preprocessEnter$2$repaintOnChange$1
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   EnterEmptyDocumentationHandler$preprocessEnter$2$repaintOnChange$1(Inlay<PresentationRenderer> $it) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final void invoke() {
/* 81 */     this.$it.update();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/inspections/EnterEmptyDocumentationHandler$preprocessEnter$2$repaintOnChange$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */