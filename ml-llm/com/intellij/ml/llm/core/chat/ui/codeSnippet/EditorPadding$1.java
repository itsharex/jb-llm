/*    */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*    */ 
/*    */ import com.intellij.openapi.editor.event.CaretEvent;
/*    */ import com.intellij.openapi.editor.event.CaretListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorPadding$1", "Lcom/intellij/openapi/editor/event/CaretListener;", "caretPositionChanged", "", "event", "Lcom/intellij/openapi/editor/event/CaretEvent;", "intellij.ml.llm"})
/*    */ public final class null
/*    */   implements CaretListener
/*    */ {
/*    */   public void caretPositionChanged(@NotNull CaretEvent event) {
/* 19 */     Intrinsics.checkNotNullParameter(event, "event"); EditorPadding.this.repaint();
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/EditorPadding$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */