/*     */ package com.intellij.ml.llm.core.chat.ui.codeSnippet;
/*     */ 
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.impl.ActionToolbarImpl;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\024J\b\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$snippetToolbar$1", "Lcom/intellij/openapi/actionSystem/impl/ActionToolbarImpl;", "forceRightAlignment", "", "updateUI", "", "intellij.ml.llm"})
/*     */ public final class CodeViewerKt$createCodeViewer$snippetToolbar$1
/*     */   extends ActionToolbarImpl
/*     */ {
/*     */   CodeViewerKt$createCodeViewer$snippetToolbar$1(ActionGroup $toolbarActionGroup, EditorEx $editor) {
/* 127 */     super("EditorToolbar", $toolbarActionGroup, true); } protected boolean forceRightAlignment() {
/* 128 */     return true;
/*     */   } public void updateUI() {
/* 130 */     super.updateUI();
/*     */     
/* 132 */     this.$editor.getComponent().setBorder((Border)JBUI.Borders.empty());
/*     */   }
/*     */ }


/* Location:              /Volumes/Macintosh HD/Users/phodal/Desktop/ml-llm.jar!/com/intellij/ml/llm/core/chat/ui/codeSnippet/CodeViewerKt$createCodeViewer$snippetToolbar$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */