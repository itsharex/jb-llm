/*    */ package com.intellij.ml.llm.intentions.internal.editor;
/*    */ 
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.editor.event.DocumentEvent;
/*    */ import com.intellij.openapi.editor.event.DocumentListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider$transform$1", "Lcom/intellij/openapi/editor/event/DocumentListener;", "documentChanged", "", "event", "Lcom/intellij/openapi/editor/event/DocumentEvent;", "intellij.ml.llm"})
/*    */ public final class EmptyIntentionAIProvider$transform$1
/*    */   implements DocumentListener
/*    */ {
/*    */   EmptyIntentionAIProvider$transform$1(EmptyIntentionProviderManager $manager, Document $originalDocument) {}
/*    */   
/*    */   public void documentChanged(@NotNull DocumentEvent event) {
/* 80 */     Intrinsics.checkNotNullParameter(event, "event"); this.$manager.getMap().remove(this.$originalDocument);
/*    */   }
/*    */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/intentions/internal/editor/EmptyIntentionAIProvider$transform$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */