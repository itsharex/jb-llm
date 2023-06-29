/*     */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*     */ 
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.ex.FocusChangeListener;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$4", "Lcom/intellij/openapi/editor/ex/FocusChangeListener;", "focusGained", "", "focusEditor", "Lcom/intellij/openapi/editor/Editor;", "focusLost", "intellij.ml.llm"})
/*     */ public final class CodeViewerKt$createCodeViewer$4
/*     */   implements FocusChangeListener
/*     */ {
/*     */   CodeViewerKt$createCodeViewer$4(EditorEx $editor) {}
/*     */   
/*     */   public void focusGained(@NotNull Editor focusEditor) {
/* 114 */     Intrinsics.checkNotNullParameter(focusEditor, "focusEditor"); this.$editor.getSettings().setCaretRowShown(true);
/*     */   }
/*     */   
/*     */   public void focusLost(@NotNull Editor focusEditor) {
/* 118 */     Intrinsics.checkNotNullParameter(focusEditor, "focusEditor"); this.$editor.getSettings().setCaretRowShown(false);
/* 119 */     this.$editor.getMarkupModel().removeAllHighlighters();
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */